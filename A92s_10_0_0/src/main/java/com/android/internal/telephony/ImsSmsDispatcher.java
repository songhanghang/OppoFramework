package com.android.internal.telephony;

import android.os.Binder;
import android.os.PersistableBundle;
import android.os.RemoteException;
import android.telephony.CarrierConfigManager;
import android.telephony.PhoneNumberUtils;
import android.telephony.SmsMessage;
import android.telephony.ims.ImsMmTelManager;
import android.telephony.ims.ImsReasonInfo;
import android.telephony.ims.aidl.IImsSmsListener;
import android.telephony.ims.feature.MmTelFeature;
import android.util.Pair;
import com.android.ims.ImsException;
import com.android.ims.ImsManager;
import com.android.internal.annotations.VisibleForTesting;
import com.android.internal.telephony.GsmAlphabet;
import com.android.internal.telephony.ImsSmsDispatcher;
import com.android.internal.telephony.OppoRlog;
import com.android.internal.telephony.SMSDispatcher;
import com.android.internal.telephony.SmsDispatchersController;
import com.android.internal.telephony.SmsMessageBase;
import com.android.internal.telephony.metrics.TelephonyMetrics;
import com.android.internal.telephony.util.SMSDispatcherUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class ImsSmsDispatcher extends SMSDispatcher {
    private static final String TAG = "ImsSmsDispacher";
    private ImsMmTelManager.CapabilityCallback mCapabilityCallback = new ImsMmTelManager.CapabilityCallback() {
        /* class com.android.internal.telephony.ImsSmsDispatcher.AnonymousClass2 */

        public void onCapabilitiesStatusChanged(MmTelFeature.MmTelCapabilities capabilities) {
            synchronized (ImsSmsDispatcher.this.mLock) {
                boolean unused = ImsSmsDispatcher.this.mIsSmsCapable = capabilities.isCapable(8);
            }
        }
    };
    private final ImsManager.Connector mImsManagerConnector = new ImsManager.Connector(this.mContext, this.mPhone.getPhoneId(), new ImsManager.Connector.Listener() {
        /* class com.android.internal.telephony.ImsSmsDispatcher.AnonymousClass4 */

        public void connectionReady(ImsManager manager) throws ImsException {
            OppoRlog.Rlog.d(ImsSmsDispatcher.TAG, "ImsManager: connection ready.");
            synchronized (ImsSmsDispatcher.this.mLock) {
                ImsSmsDispatcher.this.setListeners();
                boolean unused = ImsSmsDispatcher.this.mIsImsServiceUp = true;
            }
        }

        public void connectionUnavailable() {
            OppoRlog.Rlog.d(ImsSmsDispatcher.TAG, "ImsManager: connection unavailable.");
            synchronized (ImsSmsDispatcher.this.mLock) {
                boolean unused = ImsSmsDispatcher.this.mIsImsServiceUp = false;
            }
        }
    });
    private final IImsSmsListener mImsSmsListener = new IImsSmsListener.Stub() {
        /* class com.android.internal.telephony.ImsSmsDispatcher.AnonymousClass3 */

        public void onSendSmsResult(int token, int messageRef, int status, int reason) throws RemoteException {
            OppoRlog.Rlog.d(ImsSmsDispatcher.TAG, "onSendSmsResult token=" + token + " messageRef=" + messageRef + " status=" + status + " reason=" + reason);
            ImsSmsDispatcher.this.mMetrics.writeOnImsServiceSmsSolicitedResponse(ImsSmsDispatcher.this.mPhone.getPhoneId(), status, reason);
            SMSDispatcher.SmsTracker tracker = ImsSmsDispatcher.this.mTrackers.get(Integer.valueOf(token));
            if (tracker != null) {
                tracker.mMessageRef = messageRef;
                if (status == 1) {
                    tracker.onSent(ImsSmsDispatcher.this.mContext);
                    ImsSmsDispatcher.this.mPhone.notifySmsSent(tracker.mDestAddress);
                    ImsSmsDispatcher.this.oemMoSmsCount(tracker);
                } else if (status == 2) {
                    tracker.onFailed(ImsSmsDispatcher.this.mContext, reason, 0);
                    ImsSmsDispatcher.this.mTrackers.remove(Integer.valueOf(token));
                } else if (status == 3) {
                    tracker.mRetryCount++;
                    ImsSmsDispatcher.this.sendSms(tracker);
                } else if (status == 4) {
                    tracker.mRetryCount++;
                    ImsSmsDispatcher.this.fallbackToPstn(token, tracker);
                }
            } else {
                throw new IllegalArgumentException("Invalid token.");
            }
        }

        public void onSmsStatusReportReceived(int token, int messageRef, String format, byte[] pdu) throws RemoteException {
            int i;
            OppoRlog.Rlog.d(ImsSmsDispatcher.TAG, "Status report received.");
            SMSDispatcher.SmsTracker tracker = ImsSmsDispatcher.this.mTrackers.get(Integer.valueOf(token));
            if (tracker == null) {
                OppoRlog.Rlog.e(ImsSmsDispatcher.TAG, "onSmsStatusReportReceived, token=" + token);
                return;
            }
            Pair<Boolean, Boolean> result = ImsSmsDispatcher.this.mSmsDispatchersController.handleSmsStatusReport(tracker, format, pdu);
            OppoRlog.Rlog.d(ImsSmsDispatcher.TAG, "Status report handle result, success: " + result.first + "complete: " + result.second);
            try {
                ImsManager access$400 = ImsSmsDispatcher.this.getImsManager();
                if (((Boolean) result.first).booleanValue()) {
                    i = 1;
                } else {
                    i = 2;
                }
                access$400.acknowledgeSmsReport(token, messageRef, i);
            } catch (ImsException e) {
                OppoRlog.Rlog.e(ImsSmsDispatcher.TAG, "Failed to acknowledgeSmsReport(). Error: " + e.getMessage());
            }
            if (((Boolean) result.second).booleanValue()) {
                ImsSmsDispatcher.this.mTrackers.remove(Integer.valueOf(token));
            }
        }

        public void onSmsReceived(int token, String format, byte[] pdu) {
            OppoRlog.Rlog.d(ImsSmsDispatcher.TAG, "SMS received.");
            SmsMessage message = SmsMessage.createFromPdu(pdu, format);
            ImsSmsDispatcher.this.mSmsDispatchersController.injectSmsPdu(message, format, new SmsDispatchersController.SmsInjectionCallback(message, token) {
                /* class com.android.internal.telephony.$$Lambda$ImsSmsDispatcher$3$q7JFSZBuWsjjBm5R51WxdJYNxc */
                private final /* synthetic */ SmsMessage f$1;
                private final /* synthetic */ int f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // com.android.internal.telephony.SmsDispatchersController.SmsInjectionCallback
                public final void onSmsInjectedResult(int i) {
                    ImsSmsDispatcher.AnonymousClass3.this.lambda$onSmsReceived$0$ImsSmsDispatcher$3(this.f$1, this.f$2, i);
                }
            }, true);
        }

        public /* synthetic */ void lambda$onSmsReceived$0$ImsSmsDispatcher$3(SmsMessage message, int token, int result) {
            int mappedResult;
            OppoRlog.Rlog.d(ImsSmsDispatcher.TAG, "SMS handled result: " + result);
            if (result == 1) {
                mappedResult = 1;
            } else if (result == 3) {
                mappedResult = 3;
            } else if (result != 4) {
                mappedResult = 2;
            } else {
                mappedResult = 4;
            }
            if (message != null) {
                try {
                    if (message.mWrappedSmsMessage != null) {
                        ImsSmsDispatcher.this.getImsManager().acknowledgeSms(token, message.mWrappedSmsMessage.mMessageRef, mappedResult);
                        return;
                    }
                } catch (ImsException e) {
                    OppoRlog.Rlog.e(ImsSmsDispatcher.TAG, "Failed to acknowledgeSms(). Error: " + e.getMessage());
                    return;
                }
            }
            OppoRlog.Rlog.w(ImsSmsDispatcher.TAG, "SMS Received with a PDU that could not be parsed.");
            ImsSmsDispatcher.this.getImsManager().acknowledgeSms(token, 0, mappedResult);
        }
    };
    /* access modifiers changed from: private */
    public volatile boolean mIsImsServiceUp;
    /* access modifiers changed from: private */
    public volatile boolean mIsRegistered;
    /* access modifiers changed from: private */
    public volatile boolean mIsSmsCapable;
    /* access modifiers changed from: private */
    public final Object mLock = new Object();
    /* access modifiers changed from: private */
    public TelephonyMetrics mMetrics = TelephonyMetrics.getInstance();
    @VisibleForTesting
    public AtomicInteger mNextToken = new AtomicInteger();
    private ImsMmTelManager.RegistrationCallback mRegistrationCallback = new ImsMmTelManager.RegistrationCallback() {
        /* class com.android.internal.telephony.ImsSmsDispatcher.AnonymousClass1 */

        public void onRegistered(int imsRadioTech) {
            OppoRlog.Rlog.d(ImsSmsDispatcher.TAG, "onImsConnected imsRadioTech=" + imsRadioTech);
            synchronized (ImsSmsDispatcher.this.mLock) {
                boolean unused = ImsSmsDispatcher.this.mIsRegistered = true;
            }
        }

        public void onRegistering(int imsRadioTech) {
            OppoRlog.Rlog.d(ImsSmsDispatcher.TAG, "onImsProgressing imsRadioTech=" + imsRadioTech);
            synchronized (ImsSmsDispatcher.this.mLock) {
                boolean unused = ImsSmsDispatcher.this.mIsRegistered = false;
            }
        }

        public void onUnregistered(ImsReasonInfo info) {
            OppoRlog.Rlog.d(ImsSmsDispatcher.TAG, "onImsDisconnected imsReasonInfo=" + info);
            synchronized (ImsSmsDispatcher.this.mLock) {
                boolean unused = ImsSmsDispatcher.this.mIsRegistered = false;
            }
        }
    };
    @VisibleForTesting
    public Map<Integer, SMSDispatcher.SmsTracker> mTrackers = new ConcurrentHashMap();

    public ImsSmsDispatcher(Phone phone, SmsDispatchersController smsDispatchersController) {
        super(phone, smsDispatchersController);
        this.mImsManagerConnector.connect();
    }

    /* access modifiers changed from: private */
    public void setListeners() throws ImsException {
        getImsManager().addRegistrationCallback(this.mRegistrationCallback);
        getImsManager().addCapabilitiesCallback(this.mCapabilityCallback);
        getImsManager().setSmsListener(getSmsListener());
        getImsManager().onSmsReady();
    }

    private boolean isLteService() {
        return this.mPhone.getServiceState().getRilVoiceRadioTechnology() == 14 && this.mPhone.getServiceState().getState() == 0;
    }

    private boolean isLimitedLteService() {
        return this.mPhone.getServiceState().getRilVoiceRadioTechnology() == 14 && this.mPhone.getServiceState().isEmergencyOnly();
    }

    private boolean isEmergencySmsPossible() {
        return isLteService() || isLimitedLteService();
    }

    public boolean isEmergencySmsSupport(String destAddr) {
        boolean z = false;
        if (!PhoneNumberUtils.isLocalEmergencyNumber(this.mContext, this.mPhone.getSubId(), destAddr)) {
            OppoRlog.Rlog.e(TAG, "Emergency Sms is not supported for: " + OppoRlog.Rlog.pii(TAG, destAddr));
            return false;
        }
        long identity = Binder.clearCallingIdentity();
        try {
            CarrierConfigManager configManager = (CarrierConfigManager) this.mPhone.getContext().getSystemService("carrier_config");
            if (configManager == null) {
                OppoRlog.Rlog.e(TAG, "configManager is null");
                return false;
            }
            PersistableBundle b = configManager.getConfigForSubId(getSubId());
            if (b == null) {
                OppoRlog.Rlog.e(TAG, "PersistableBundle is null");
                Binder.restoreCallingIdentity(identity);
                return false;
            }
            boolean eSmsCarrierSupport = b.getBoolean("support_emergency_sms_over_ims_bool");
            boolean lteOrLimitedLte = isEmergencySmsPossible();
            OppoRlog.Rlog.i(TAG, "isEmergencySmsSupport emergencySmsCarrierSupport: " + eSmsCarrierSupport + " destAddr: " + OppoRlog.Rlog.pii(TAG, destAddr) + " mIsImsServiceUp: " + this.mIsImsServiceUp + " lteOrLimitedLte: " + lteOrLimitedLte);
            if (eSmsCarrierSupport && this.mIsImsServiceUp && lteOrLimitedLte) {
                z = true;
            }
            Binder.restoreCallingIdentity(identity);
            return z;
        } finally {
            Binder.restoreCallingIdentity(identity);
        }
    }

    public boolean isAvailable() {
        boolean z;
        synchronized (this.mLock) {
            OppoRlog.Rlog.d(TAG, "isAvailable: up=" + this.mIsImsServiceUp + ", reg= " + this.mIsRegistered + ", cap= " + this.mIsSmsCapable);
            z = this.mIsImsServiceUp && this.mIsRegistered && this.mIsSmsCapable;
        }
        return z;
    }

    @Override // com.android.internal.telephony.SMSDispatcher
    public String getFormat() {
        try {
            return getImsManager().getSmsFormat();
        } catch (ImsException e) {
            OppoRlog.Rlog.e(TAG, "Failed to get sms format. Error: " + e.getMessage());
            return "unknown";
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.android.internal.telephony.SMSDispatcher
    public boolean shouldBlockSmsForEcbm() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.android.internal.telephony.SMSDispatcher
    public SmsMessageBase.SubmitPduBase getSubmitPdu(String scAddr, String destAddr, String message, boolean statusReportRequested, SmsHeader smsHeader, int priority, int validityPeriod) {
        return SMSDispatcherUtil.getSubmitPdu(isCdmaMo(), scAddr, destAddr, message, statusReportRequested, smsHeader, priority, validityPeriod);
    }

    /* access modifiers changed from: protected */
    @Override // com.android.internal.telephony.SMSDispatcher
    public SmsMessageBase.SubmitPduBase getSubmitPdu(String scAddr, String destAddr, int destPort, byte[] message, boolean statusReportRequested) {
        return SMSDispatcherUtil.getSubmitPdu(isCdmaMo(), scAddr, destAddr, destPort, message, statusReportRequested);
    }

    /* access modifiers changed from: protected */
    @Override // com.android.internal.telephony.SMSDispatcher
    public GsmAlphabet.TextEncodingDetails calculateLength(CharSequence messageBody, boolean use7bitOnly) {
        return SMSDispatcherUtil.calculateLength(isCdmaMo(), messageBody, use7bitOnly);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x012c  */
    @Override // com.android.internal.telephony.SMSDispatcher
    public void sendSms(SMSDispatcher.SmsTracker tracker) {
        int token;
        String format;
        String str;
        OppoRlog.Rlog.d(TAG, "sendSms:  mRetryCount=" + tracker.mRetryCount + " mMessageRef=" + tracker.mMessageRef + " SS=" + this.mPhone.getServiceState().getState());
        tracker.mUsesImsServiceForIms = true;
        HashMap<String, Object> map = tracker.getData();
        byte[] pdu = (byte[]) map.get("pdu");
        byte[] smsc = (byte[]) map.get("smsc");
        boolean isRetry = tracker.mRetryCount > 0;
        String format2 = getFormat();
        if ("3gpp".equals(format2) && tracker.mRetryCount > 0 && (pdu[0] & 1) == 1) {
            pdu[0] = (byte) (pdu[0] | 4);
            pdu[1] = (byte) tracker.mMessageRef;
        }
        if (handleSmsSendControl(tracker, this.mPhone, this.mContext, 1)) {
            OppoRlog.Rlog.d(TAG, "ims--sendSms, stop tracker.");
            return;
        }
        int token2 = this.mNextToken.incrementAndGet();
        this.mTrackers.put(Integer.valueOf(token2), tracker);
        try {
            ImsManager imsManager = getImsManager();
            int i = tracker.mMessageRef;
            if (smsc != null) {
                try {
                    str = new String(smsc);
                } catch (ImsException e) {
                    e = e;
                    token = token2;
                    format = format2;
                } catch (Exception e2) {
                    ex = e2;
                    token = token2;
                    tracker.onFailed(this.mContext, 1, 0);
                    this.mTrackers.remove(Integer.valueOf(token));
                    OppoRlog.Rlog.e(TAG, "oem sendSms failed." + ex.getMessage());
                }
            } else {
                str = null;
            }
            token = token2;
            format = format2;
            try {
                imsManager.sendSms(token2, i, format2, str, isRetry, pdu);
                this.mMetrics.writeImsServiceSendSms(this.mPhone.getPhoneId(), format, 1);
            } catch (ImsException e3) {
                e = e3;
                OppoRlog.Rlog.e(TAG, "mOemStayImsRetryCount=" + tracker.mOemStayImsRetryCount);
                if (tracker.mOemStayImsRetryCount < 3) {
                }
            } catch (Exception e4) {
                ex = e4;
                tracker.onFailed(this.mContext, 1, 0);
                this.mTrackers.remove(Integer.valueOf(token));
                OppoRlog.Rlog.e(TAG, "oem sendSms failed." + ex.getMessage());
            }
        } catch (ImsException e5) {
            e = e5;
            token = token2;
            format = format2;
            OppoRlog.Rlog.e(TAG, "mOemStayImsRetryCount=" + tracker.mOemStayImsRetryCount);
            if (tracker.mOemStayImsRetryCount < 3) {
                tracker.onFailed(this.mContext, 1, 0);
                this.mTrackers.remove(Integer.valueOf(token));
                return;
            }
            tracker.mOemStayImsRetryCount++;
            OppoRlog.Rlog.e(TAG, "sendSms failed. Falling back to PSTN. Error: " + e.getMessage());
            fallbackToPstn(token, tracker);
            this.mMetrics.writeImsServiceSendSms(this.mPhone.getPhoneId(), format, 4);
        } catch (Exception e6) {
            ex = e6;
            token = token2;
            tracker.onFailed(this.mContext, 1, 0);
            this.mTrackers.remove(Integer.valueOf(token));
            OppoRlog.Rlog.e(TAG, "oem sendSms failed." + ex.getMessage());
        }
    }

    /* access modifiers changed from: private */
    public ImsManager getImsManager() {
        return ImsManager.getInstance(this.mContext, this.mPhone.getPhoneId());
    }

    @VisibleForTesting
    public void fallbackToPstn(int token, SMSDispatcher.SmsTracker tracker) {
        this.mSmsDispatchersController.sendRetrySms(tracker);
        this.mTrackers.remove(Integer.valueOf(token));
    }

    /* access modifiers changed from: protected */
    @Override // com.android.internal.telephony.SMSDispatcher
    public boolean isCdmaMo() {
        return this.mSmsDispatchersController.isCdmaFormat(getFormat());
    }

    @VisibleForTesting
    public IImsSmsListener getSmsListener() {
        return this.mImsSmsListener;
    }
}
