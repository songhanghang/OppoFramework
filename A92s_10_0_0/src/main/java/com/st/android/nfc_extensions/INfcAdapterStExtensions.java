package com.st.android.nfc_extensions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.st.android.nfc_dta_extensions.INfcAdapterStDtaExtensions;
import com.st.android.nfc_extensions.INfcSettingsAdapter;
import com.st.android.nfc_extensions.INfcWalletAdapter;

public interface INfcAdapterStExtensions extends IInterface {
    boolean connectEE(int i) throws RemoteException;

    int connectGate(int i, int i2) throws RemoteException;

    boolean disconnectEE(int i) throws RemoteException;

    void disconnectGate(int i) throws RemoteException;

    void forceRouting(int i, int i2) throws RemoteException;

    byte[] getATR() throws RemoteException;

    int getAvailableHciHostList(byte[] bArr, byte[] bArr2) throws RemoteException;

    boolean getBitPropConfig(int i, int i2, int i3) throws RemoteException;

    byte[] getCustomerData() throws RemoteException;

    byte[] getFirmwareVersion() throws RemoteException;

    byte[] getHWVersion() throws RemoteException;

    boolean getHceCapability() throws RemoteException;

    byte[] getNciConfig(int i) throws RemoteException;

    INfcAdapterStDtaExtensions getNfcAdapterStDtaExtensionsInterface() throws RemoteException;

    INfcSettingsAdapter getNfcSettingsAdapterInterface() throws RemoteException;

    INfcWalletAdapter getNfcWalletAdapterInterface() throws RemoteException;

    void getPipeInfo(int i, int i2, byte[] bArr) throws RemoteException;

    int getPipesList(int i, byte[] bArr) throws RemoteException;

    boolean getProprietaryConfigSettings(int i, int i2, int i3) throws RemoteException;

    int getRfConfiguration(byte[] bArr) throws RemoteException;

    byte[] getSWVersion() throws RemoteException;

    int loopback() throws RemoteException;

    byte[] sendPropGetConfig(int i, int i2) throws RemoteException;

    void sendPropSetConfig(int i, int i2, byte[] bArr) throws RemoteException;

    byte[] sendPropTestCmd(int i, byte[] bArr) throws RemoteException;

    void setBitPropConfig(int i, int i2, int i3, boolean z) throws RemoteException;

    void setNciConfig(int i, byte[] bArr) throws RemoteException;

    void setProprietaryConfigSettings(int i, int i2, int i3, boolean z) throws RemoteException;

    void setRfBitmap(int i) throws RemoteException;

    void setRfConfiguration(int i, byte[] bArr) throws RemoteException;

    void stopforceRouting() throws RemoteException;

    byte[] transceive(int i, int i2, byte[] bArr) throws RemoteException;

    byte[] transceiveEE(int i, byte[] bArr) throws RemoteException;

    public static class Default implements INfcAdapterStExtensions {
        @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
        public byte[] getFirmwareVersion() throws RemoteException {
            return null;
        }

        @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
        public byte[] getHWVersion() throws RemoteException {
            return null;
        }

        @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
        public byte[] getSWVersion() throws RemoteException {
            return null;
        }

        @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
        public int loopback() throws RemoteException {
            return 0;
        }

        @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
        public boolean getHceCapability() throws RemoteException {
            return false;
        }

        @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
        public void setRfConfiguration(int modeBitmap, byte[] techArray) throws RemoteException {
        }

        @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
        public int getRfConfiguration(byte[] techArray) throws RemoteException {
            return 0;
        }

        @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
        public void setRfBitmap(int modeBitmap) throws RemoteException {
        }

        @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
        public boolean getProprietaryConfigSettings(int SubSetID, int byteNb, int bitNb) throws RemoteException {
            return false;
        }

        @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
        public void setProprietaryConfigSettings(int SubSetID, int byteNb, int bitNb, boolean status) throws RemoteException {
        }

        @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
        public int getPipesList(int hostId, byte[] list) throws RemoteException {
            return 0;
        }

        @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
        public void getPipeInfo(int hostId, int pipeId, byte[] info) throws RemoteException {
        }

        @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
        public byte[] getATR() throws RemoteException {
            return null;
        }

        @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
        public boolean connectEE(int ceeId) throws RemoteException {
            return false;
        }

        @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
        public byte[] transceiveEE(int ceeId, byte[] dataCmd) throws RemoteException {
            return null;
        }

        @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
        public boolean disconnectEE(int ceeId) throws RemoteException {
            return false;
        }

        @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
        public int connectGate(int host_id, int gate_id) throws RemoteException {
            return 0;
        }

        @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
        public byte[] transceive(int pipe_id, int hci_cmd, byte[] dataIn) throws RemoteException {
            return null;
        }

        @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
        public void disconnectGate(int pipe_id) throws RemoteException {
        }

        @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
        public int getAvailableHciHostList(byte[] nfceeId, byte[] conInfo) throws RemoteException {
            return 0;
        }

        @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
        public boolean getBitPropConfig(int configId, int byteNb, int bitNb) throws RemoteException {
            return false;
        }

        @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
        public void setBitPropConfig(int configId, int byteNb, int bitNb, boolean status) throws RemoteException {
        }

        @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
        public void forceRouting(int nfceeId, int PowerState) throws RemoteException {
        }

        @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
        public void stopforceRouting() throws RemoteException {
        }

        @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
        public void setNciConfig(int paramId, byte[] param) throws RemoteException {
        }

        @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
        public byte[] getNciConfig(int paramId) throws RemoteException {
            return null;
        }

        @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
        public void sendPropSetConfig(int subSetId, int configId, byte[] param) throws RemoteException {
        }

        @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
        public byte[] sendPropGetConfig(int subSetId, int configId) throws RemoteException {
            return null;
        }

        @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
        public byte[] sendPropTestCmd(int subCode, byte[] paramTx) throws RemoteException {
            return null;
        }

        @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
        public byte[] getCustomerData() throws RemoteException {
            return null;
        }

        @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
        public INfcWalletAdapter getNfcWalletAdapterInterface() throws RemoteException {
            return null;
        }

        @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
        public INfcAdapterStDtaExtensions getNfcAdapterStDtaExtensionsInterface() throws RemoteException {
            return null;
        }

        @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
        public INfcSettingsAdapter getNfcSettingsAdapterInterface() throws RemoteException {
            return null;
        }

        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements INfcAdapterStExtensions {
        private static final String DESCRIPTOR = "com.st.android.nfc_extensions.INfcAdapterStExtensions";
        static final int TRANSACTION_connectEE = 14;
        static final int TRANSACTION_connectGate = 17;
        static final int TRANSACTION_disconnectEE = 16;
        static final int TRANSACTION_disconnectGate = 19;
        static final int TRANSACTION_forceRouting = 23;
        static final int TRANSACTION_getATR = 13;
        static final int TRANSACTION_getAvailableHciHostList = 20;
        static final int TRANSACTION_getBitPropConfig = 21;
        static final int TRANSACTION_getCustomerData = 30;
        static final int TRANSACTION_getFirmwareVersion = 1;
        static final int TRANSACTION_getHWVersion = 2;
        static final int TRANSACTION_getHceCapability = 5;
        static final int TRANSACTION_getNciConfig = 26;
        static final int TRANSACTION_getNfcAdapterStDtaExtensionsInterface = 32;
        static final int TRANSACTION_getNfcSettingsAdapterInterface = 33;
        static final int TRANSACTION_getNfcWalletAdapterInterface = 31;
        static final int TRANSACTION_getPipeInfo = 12;
        static final int TRANSACTION_getPipesList = 11;
        static final int TRANSACTION_getProprietaryConfigSettings = 9;
        static final int TRANSACTION_getRfConfiguration = 7;
        static final int TRANSACTION_getSWVersion = 3;
        static final int TRANSACTION_loopback = 4;
        static final int TRANSACTION_sendPropGetConfig = 28;
        static final int TRANSACTION_sendPropSetConfig = 27;
        static final int TRANSACTION_sendPropTestCmd = 29;
        static final int TRANSACTION_setBitPropConfig = 22;
        static final int TRANSACTION_setNciConfig = 25;
        static final int TRANSACTION_setProprietaryConfigSettings = 10;
        static final int TRANSACTION_setRfBitmap = 8;
        static final int TRANSACTION_setRfConfiguration = 6;
        static final int TRANSACTION_stopforceRouting = 24;
        static final int TRANSACTION_transceive = 18;
        static final int TRANSACTION_transceiveEE = 15;

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static INfcAdapterStExtensions asInterface(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (iin == null || !(iin instanceof INfcAdapterStExtensions)) {
                return new Proxy(obj);
            }
            return (INfcAdapterStExtensions) iin;
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            byte[] _arg0;
            byte[] _arg1;
            byte[] _arg2;
            byte[] _arg02;
            byte[] _arg12;
            if (code != 1598968902) {
                boolean _arg3 = false;
                boolean _arg32 = false;
                IBinder iBinder = null;
                IBinder iBinder2 = null;
                IBinder iBinder3 = null;
                switch (code) {
                    case 1:
                        data.enforceInterface(DESCRIPTOR);
                        byte[] _result = getFirmwareVersion();
                        reply.writeNoException();
                        reply.writeByteArray(_result);
                        return true;
                    case 2:
                        data.enforceInterface(DESCRIPTOR);
                        byte[] _result2 = getHWVersion();
                        reply.writeNoException();
                        reply.writeByteArray(_result2);
                        return true;
                    case 3:
                        data.enforceInterface(DESCRIPTOR);
                        byte[] _result3 = getSWVersion();
                        reply.writeNoException();
                        reply.writeByteArray(_result3);
                        return true;
                    case 4:
                        data.enforceInterface(DESCRIPTOR);
                        int _result4 = loopback();
                        reply.writeNoException();
                        reply.writeInt(_result4);
                        return true;
                    case TRANSACTION_getHceCapability /*{ENCODED_INT: 5}*/:
                        data.enforceInterface(DESCRIPTOR);
                        boolean hceCapability = getHceCapability();
                        reply.writeNoException();
                        reply.writeInt(hceCapability ? 1 : 0);
                        return true;
                    case TRANSACTION_setRfConfiguration /*{ENCODED_INT: 6}*/:
                        data.enforceInterface(DESCRIPTOR);
                        setRfConfiguration(data.readInt(), data.createByteArray());
                        reply.writeNoException();
                        return true;
                    case TRANSACTION_getRfConfiguration /*{ENCODED_INT: 7}*/:
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0_length = data.readInt();
                        if (_arg0_length < 0) {
                            _arg0 = null;
                        } else {
                            _arg0 = new byte[_arg0_length];
                        }
                        int _result5 = getRfConfiguration(_arg0);
                        reply.writeNoException();
                        reply.writeInt(_result5);
                        reply.writeByteArray(_arg0);
                        return true;
                    case TRANSACTION_setRfBitmap /*{ENCODED_INT: 8}*/:
                        data.enforceInterface(DESCRIPTOR);
                        setRfBitmap(data.readInt());
                        reply.writeNoException();
                        return true;
                    case TRANSACTION_getProprietaryConfigSettings /*{ENCODED_INT: 9}*/:
                        data.enforceInterface(DESCRIPTOR);
                        boolean proprietaryConfigSettings = getProprietaryConfigSettings(data.readInt(), data.readInt(), data.readInt());
                        reply.writeNoException();
                        reply.writeInt(proprietaryConfigSettings ? 1 : 0);
                        return true;
                    case TRANSACTION_setProprietaryConfigSettings /*{ENCODED_INT: 10}*/:
                        data.enforceInterface(DESCRIPTOR);
                        int _arg03 = data.readInt();
                        int _arg13 = data.readInt();
                        int _arg22 = data.readInt();
                        if (data.readInt() != 0) {
                            _arg3 = true;
                        }
                        setProprietaryConfigSettings(_arg03, _arg13, _arg22, _arg3);
                        reply.writeNoException();
                        return true;
                    case TRANSACTION_getPipesList /*{ENCODED_INT: 11}*/:
                        data.enforceInterface(DESCRIPTOR);
                        int _arg04 = data.readInt();
                        int _arg1_length = data.readInt();
                        if (_arg1_length < 0) {
                            _arg1 = null;
                        } else {
                            _arg1 = new byte[_arg1_length];
                        }
                        int _result6 = getPipesList(_arg04, _arg1);
                        reply.writeNoException();
                        reply.writeInt(_result6);
                        reply.writeByteArray(_arg1);
                        return true;
                    case TRANSACTION_getPipeInfo /*{ENCODED_INT: 12}*/:
                        data.enforceInterface(DESCRIPTOR);
                        int _arg05 = data.readInt();
                        int _arg14 = data.readInt();
                        int _arg2_length = data.readInt();
                        if (_arg2_length < 0) {
                            _arg2 = null;
                        } else {
                            _arg2 = new byte[_arg2_length];
                        }
                        getPipeInfo(_arg05, _arg14, _arg2);
                        reply.writeNoException();
                        reply.writeByteArray(_arg2);
                        return true;
                    case TRANSACTION_getATR /*{ENCODED_INT: 13}*/:
                        data.enforceInterface(DESCRIPTOR);
                        byte[] _result7 = getATR();
                        reply.writeNoException();
                        reply.writeByteArray(_result7);
                        return true;
                    case TRANSACTION_connectEE /*{ENCODED_INT: 14}*/:
                        data.enforceInterface(DESCRIPTOR);
                        boolean connectEE = connectEE(data.readInt());
                        reply.writeNoException();
                        reply.writeInt(connectEE ? 1 : 0);
                        return true;
                    case TRANSACTION_transceiveEE /*{ENCODED_INT: 15}*/:
                        data.enforceInterface(DESCRIPTOR);
                        byte[] _result8 = transceiveEE(data.readInt(), data.createByteArray());
                        reply.writeNoException();
                        reply.writeByteArray(_result8);
                        return true;
                    case TRANSACTION_disconnectEE /*{ENCODED_INT: 16}*/:
                        data.enforceInterface(DESCRIPTOR);
                        boolean disconnectEE = disconnectEE(data.readInt());
                        reply.writeNoException();
                        reply.writeInt(disconnectEE ? 1 : 0);
                        return true;
                    case TRANSACTION_connectGate /*{ENCODED_INT: 17}*/:
                        data.enforceInterface(DESCRIPTOR);
                        int _result9 = connectGate(data.readInt(), data.readInt());
                        reply.writeNoException();
                        reply.writeInt(_result9);
                        return true;
                    case TRANSACTION_transceive /*{ENCODED_INT: 18}*/:
                        data.enforceInterface(DESCRIPTOR);
                        byte[] _result10 = transceive(data.readInt(), data.readInt(), data.createByteArray());
                        reply.writeNoException();
                        reply.writeByteArray(_result10);
                        return true;
                    case TRANSACTION_disconnectGate /*{ENCODED_INT: 19}*/:
                        data.enforceInterface(DESCRIPTOR);
                        disconnectGate(data.readInt());
                        reply.writeNoException();
                        return true;
                    case TRANSACTION_getAvailableHciHostList /*{ENCODED_INT: 20}*/:
                        data.enforceInterface(DESCRIPTOR);
                        int _arg0_length2 = data.readInt();
                        if (_arg0_length2 < 0) {
                            _arg02 = null;
                        } else {
                            _arg02 = new byte[_arg0_length2];
                        }
                        int _arg1_length2 = data.readInt();
                        if (_arg1_length2 < 0) {
                            _arg12 = null;
                        } else {
                            _arg12 = new byte[_arg1_length2];
                        }
                        int _result11 = getAvailableHciHostList(_arg02, _arg12);
                        reply.writeNoException();
                        reply.writeInt(_result11);
                        reply.writeByteArray(_arg02);
                        reply.writeByteArray(_arg12);
                        return true;
                    case TRANSACTION_getBitPropConfig /*{ENCODED_INT: 21}*/:
                        data.enforceInterface(DESCRIPTOR);
                        boolean bitPropConfig = getBitPropConfig(data.readInt(), data.readInt(), data.readInt());
                        reply.writeNoException();
                        reply.writeInt(bitPropConfig ? 1 : 0);
                        return true;
                    case TRANSACTION_setBitPropConfig /*{ENCODED_INT: 22}*/:
                        data.enforceInterface(DESCRIPTOR);
                        int _arg06 = data.readInt();
                        int _arg15 = data.readInt();
                        int _arg23 = data.readInt();
                        if (data.readInt() != 0) {
                            _arg32 = true;
                        }
                        setBitPropConfig(_arg06, _arg15, _arg23, _arg32);
                        reply.writeNoException();
                        return true;
                    case TRANSACTION_forceRouting /*{ENCODED_INT: 23}*/:
                        data.enforceInterface(DESCRIPTOR);
                        forceRouting(data.readInt(), data.readInt());
                        reply.writeNoException();
                        return true;
                    case TRANSACTION_stopforceRouting /*{ENCODED_INT: 24}*/:
                        data.enforceInterface(DESCRIPTOR);
                        stopforceRouting();
                        reply.writeNoException();
                        return true;
                    case TRANSACTION_setNciConfig /*{ENCODED_INT: 25}*/:
                        data.enforceInterface(DESCRIPTOR);
                        setNciConfig(data.readInt(), data.createByteArray());
                        reply.writeNoException();
                        return true;
                    case TRANSACTION_getNciConfig /*{ENCODED_INT: 26}*/:
                        data.enforceInterface(DESCRIPTOR);
                        byte[] _result12 = getNciConfig(data.readInt());
                        reply.writeNoException();
                        reply.writeByteArray(_result12);
                        return true;
                    case TRANSACTION_sendPropSetConfig /*{ENCODED_INT: 27}*/:
                        data.enforceInterface(DESCRIPTOR);
                        sendPropSetConfig(data.readInt(), data.readInt(), data.createByteArray());
                        reply.writeNoException();
                        return true;
                    case TRANSACTION_sendPropGetConfig /*{ENCODED_INT: 28}*/:
                        data.enforceInterface(DESCRIPTOR);
                        byte[] _result13 = sendPropGetConfig(data.readInt(), data.readInt());
                        reply.writeNoException();
                        reply.writeByteArray(_result13);
                        return true;
                    case TRANSACTION_sendPropTestCmd /*{ENCODED_INT: 29}*/:
                        data.enforceInterface(DESCRIPTOR);
                        byte[] _result14 = sendPropTestCmd(data.readInt(), data.createByteArray());
                        reply.writeNoException();
                        reply.writeByteArray(_result14);
                        return true;
                    case TRANSACTION_getCustomerData /*{ENCODED_INT: 30}*/:
                        data.enforceInterface(DESCRIPTOR);
                        byte[] _result15 = getCustomerData();
                        reply.writeNoException();
                        reply.writeByteArray(_result15);
                        return true;
                    case TRANSACTION_getNfcWalletAdapterInterface /*{ENCODED_INT: 31}*/:
                        data.enforceInterface(DESCRIPTOR);
                        INfcWalletAdapter _result16 = getNfcWalletAdapterInterface();
                        reply.writeNoException();
                        if (_result16 != null) {
                            iBinder = _result16.asBinder();
                        }
                        reply.writeStrongBinder(iBinder);
                        return true;
                    case TRANSACTION_getNfcAdapterStDtaExtensionsInterface /*{ENCODED_INT: 32}*/:
                        data.enforceInterface(DESCRIPTOR);
                        INfcAdapterStDtaExtensions _result17 = getNfcAdapterStDtaExtensionsInterface();
                        reply.writeNoException();
                        if (_result17 != null) {
                            iBinder3 = _result17.asBinder();
                        }
                        reply.writeStrongBinder(iBinder3);
                        return true;
                    case TRANSACTION_getNfcSettingsAdapterInterface /*{ENCODED_INT: 33}*/:
                        data.enforceInterface(DESCRIPTOR);
                        INfcSettingsAdapter _result18 = getNfcSettingsAdapterInterface();
                        reply.writeNoException();
                        if (_result18 != null) {
                            iBinder2 = _result18.asBinder();
                        }
                        reply.writeStrongBinder(iBinder2);
                        return true;
                    default:
                        return super.onTransact(code, data, reply, flags);
                }
            } else {
                reply.writeString(DESCRIPTOR);
                return true;
            }
        }

        private static class Proxy implements INfcAdapterStExtensions {
            public static INfcAdapterStExtensions sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder remote) {
                this.mRemote = remote;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
            public byte[] getFirmwareVersion() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(1, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getFirmwareVersion();
                    }
                    _reply.readException();
                    byte[] _result = _reply.createByteArray();
                    _reply.recycle();
                    _data.recycle();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
            public byte[] getHWVersion() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(2, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getHWVersion();
                    }
                    _reply.readException();
                    byte[] _result = _reply.createByteArray();
                    _reply.recycle();
                    _data.recycle();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
            public byte[] getSWVersion() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(3, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSWVersion();
                    }
                    _reply.readException();
                    byte[] _result = _reply.createByteArray();
                    _reply.recycle();
                    _data.recycle();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
            public int loopback() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(4, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().loopback();
                    }
                    _reply.readException();
                    int _result = _reply.readInt();
                    _reply.recycle();
                    _data.recycle();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
            public boolean getHceCapability() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean _result = false;
                    if (!this.mRemote.transact(Stub.TRANSACTION_getHceCapability, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getHceCapability();
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        _result = true;
                    }
                    _reply.recycle();
                    _data.recycle();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
            public void setRfConfiguration(int modeBitmap, byte[] techArray) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(modeBitmap);
                    _data.writeByteArray(techArray);
                    if (this.mRemote.transact(Stub.TRANSACTION_setRfConfiguration, _data, _reply, 0) || Stub.getDefaultImpl() == null) {
                        _reply.readException();
                        _reply.recycle();
                        _data.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().setRfConfiguration(modeBitmap, techArray);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
            public int getRfConfiguration(byte[] techArray) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (techArray == null) {
                        _data.writeInt(-1);
                    } else {
                        _data.writeInt(techArray.length);
                    }
                    if (!this.mRemote.transact(Stub.TRANSACTION_getRfConfiguration, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getRfConfiguration(techArray);
                    }
                    _reply.readException();
                    int _result = _reply.readInt();
                    _reply.readByteArray(techArray);
                    _reply.recycle();
                    _data.recycle();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
            public void setRfBitmap(int modeBitmap) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(modeBitmap);
                    if (this.mRemote.transact(Stub.TRANSACTION_setRfBitmap, _data, _reply, 0) || Stub.getDefaultImpl() == null) {
                        _reply.readException();
                        _reply.recycle();
                        _data.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().setRfBitmap(modeBitmap);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
            public boolean getProprietaryConfigSettings(int SubSetID, int byteNb, int bitNb) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(SubSetID);
                    _data.writeInt(byteNb);
                    _data.writeInt(bitNb);
                    boolean _result = false;
                    if (!this.mRemote.transact(Stub.TRANSACTION_getProprietaryConfigSettings, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getProprietaryConfigSettings(SubSetID, byteNb, bitNb);
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        _result = true;
                    }
                    _reply.recycle();
                    _data.recycle();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
            public void setProprietaryConfigSettings(int SubSetID, int byteNb, int bitNb, boolean status) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(SubSetID);
                    _data.writeInt(byteNb);
                    _data.writeInt(bitNb);
                    _data.writeInt(status ? 1 : 0);
                    if (this.mRemote.transact(Stub.TRANSACTION_setProprietaryConfigSettings, _data, _reply, 0) || Stub.getDefaultImpl() == null) {
                        _reply.readException();
                        _reply.recycle();
                        _data.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().setProprietaryConfigSettings(SubSetID, byteNb, bitNb, status);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
            public int getPipesList(int hostId, byte[] list) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(hostId);
                    if (list == null) {
                        _data.writeInt(-1);
                    } else {
                        _data.writeInt(list.length);
                    }
                    if (!this.mRemote.transact(Stub.TRANSACTION_getPipesList, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getPipesList(hostId, list);
                    }
                    _reply.readException();
                    int _result = _reply.readInt();
                    _reply.readByteArray(list);
                    _reply.recycle();
                    _data.recycle();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
            public void getPipeInfo(int hostId, int pipeId, byte[] info) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(hostId);
                    _data.writeInt(pipeId);
                    if (info == null) {
                        _data.writeInt(-1);
                    } else {
                        _data.writeInt(info.length);
                    }
                    if (this.mRemote.transact(Stub.TRANSACTION_getPipeInfo, _data, _reply, 0) || Stub.getDefaultImpl() == null) {
                        _reply.readException();
                        _reply.readByteArray(info);
                        _reply.recycle();
                        _data.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().getPipeInfo(hostId, pipeId, info);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
            public byte[] getATR() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(Stub.TRANSACTION_getATR, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getATR();
                    }
                    _reply.readException();
                    byte[] _result = _reply.createByteArray();
                    _reply.recycle();
                    _data.recycle();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
            public boolean connectEE(int ceeId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(ceeId);
                    boolean _result = false;
                    if (!this.mRemote.transact(Stub.TRANSACTION_connectEE, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().connectEE(ceeId);
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        _result = true;
                    }
                    _reply.recycle();
                    _data.recycle();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
            public byte[] transceiveEE(int ceeId, byte[] dataCmd) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(ceeId);
                    _data.writeByteArray(dataCmd);
                    if (!this.mRemote.transact(Stub.TRANSACTION_transceiveEE, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().transceiveEE(ceeId, dataCmd);
                    }
                    _reply.readException();
                    byte[] _result = _reply.createByteArray();
                    _reply.recycle();
                    _data.recycle();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
            public boolean disconnectEE(int ceeId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(ceeId);
                    boolean _result = false;
                    if (!this.mRemote.transact(Stub.TRANSACTION_disconnectEE, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().disconnectEE(ceeId);
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        _result = true;
                    }
                    _reply.recycle();
                    _data.recycle();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
            public int connectGate(int host_id, int gate_id) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(host_id);
                    _data.writeInt(gate_id);
                    if (!this.mRemote.transact(Stub.TRANSACTION_connectGate, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().connectGate(host_id, gate_id);
                    }
                    _reply.readException();
                    int _result = _reply.readInt();
                    _reply.recycle();
                    _data.recycle();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
            public byte[] transceive(int pipe_id, int hci_cmd, byte[] dataIn) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(pipe_id);
                    _data.writeInt(hci_cmd);
                    _data.writeByteArray(dataIn);
                    if (!this.mRemote.transact(Stub.TRANSACTION_transceive, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().transceive(pipe_id, hci_cmd, dataIn);
                    }
                    _reply.readException();
                    byte[] _result = _reply.createByteArray();
                    _reply.recycle();
                    _data.recycle();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
            public void disconnectGate(int pipe_id) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(pipe_id);
                    if (this.mRemote.transact(Stub.TRANSACTION_disconnectGate, _data, _reply, 0) || Stub.getDefaultImpl() == null) {
                        _reply.readException();
                        _reply.recycle();
                        _data.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().disconnectGate(pipe_id);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
            public int getAvailableHciHostList(byte[] nfceeId, byte[] conInfo) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (nfceeId == null) {
                        _data.writeInt(-1);
                    } else {
                        _data.writeInt(nfceeId.length);
                    }
                    if (conInfo == null) {
                        _data.writeInt(-1);
                    } else {
                        _data.writeInt(conInfo.length);
                    }
                    if (!this.mRemote.transact(Stub.TRANSACTION_getAvailableHciHostList, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getAvailableHciHostList(nfceeId, conInfo);
                    }
                    _reply.readException();
                    int _result = _reply.readInt();
                    _reply.readByteArray(nfceeId);
                    _reply.readByteArray(conInfo);
                    _reply.recycle();
                    _data.recycle();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
            public boolean getBitPropConfig(int configId, int byteNb, int bitNb) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(configId);
                    _data.writeInt(byteNb);
                    _data.writeInt(bitNb);
                    boolean _result = false;
                    if (!this.mRemote.transact(Stub.TRANSACTION_getBitPropConfig, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getBitPropConfig(configId, byteNb, bitNb);
                    }
                    _reply.readException();
                    if (_reply.readInt() != 0) {
                        _result = true;
                    }
                    _reply.recycle();
                    _data.recycle();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
            public void setBitPropConfig(int configId, int byteNb, int bitNb, boolean status) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(configId);
                    _data.writeInt(byteNb);
                    _data.writeInt(bitNb);
                    _data.writeInt(status ? 1 : 0);
                    if (this.mRemote.transact(Stub.TRANSACTION_setBitPropConfig, _data, _reply, 0) || Stub.getDefaultImpl() == null) {
                        _reply.readException();
                        _reply.recycle();
                        _data.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().setBitPropConfig(configId, byteNb, bitNb, status);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
            public void forceRouting(int nfceeId, int PowerState) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(nfceeId);
                    _data.writeInt(PowerState);
                    if (this.mRemote.transact(Stub.TRANSACTION_forceRouting, _data, _reply, 0) || Stub.getDefaultImpl() == null) {
                        _reply.readException();
                        _reply.recycle();
                        _data.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().forceRouting(nfceeId, PowerState);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
            public void stopforceRouting() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(Stub.TRANSACTION_stopforceRouting, _data, _reply, 0) || Stub.getDefaultImpl() == null) {
                        _reply.readException();
                        _reply.recycle();
                        _data.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().stopforceRouting();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
            public void setNciConfig(int paramId, byte[] param) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(paramId);
                    _data.writeByteArray(param);
                    if (this.mRemote.transact(Stub.TRANSACTION_setNciConfig, _data, _reply, 0) || Stub.getDefaultImpl() == null) {
                        _reply.readException();
                        _reply.recycle();
                        _data.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().setNciConfig(paramId, param);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
            public byte[] getNciConfig(int paramId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(paramId);
                    if (!this.mRemote.transact(Stub.TRANSACTION_getNciConfig, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getNciConfig(paramId);
                    }
                    _reply.readException();
                    byte[] _result = _reply.createByteArray();
                    _reply.recycle();
                    _data.recycle();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
            public void sendPropSetConfig(int subSetId, int configId, byte[] param) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(subSetId);
                    _data.writeInt(configId);
                    _data.writeByteArray(param);
                    if (this.mRemote.transact(Stub.TRANSACTION_sendPropSetConfig, _data, _reply, 0) || Stub.getDefaultImpl() == null) {
                        _reply.readException();
                        _reply.recycle();
                        _data.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().sendPropSetConfig(subSetId, configId, param);
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
            public byte[] sendPropGetConfig(int subSetId, int configId) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(subSetId);
                    _data.writeInt(configId);
                    if (!this.mRemote.transact(Stub.TRANSACTION_sendPropGetConfig, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sendPropGetConfig(subSetId, configId);
                    }
                    _reply.readException();
                    byte[] _result = _reply.createByteArray();
                    _reply.recycle();
                    _data.recycle();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
            public byte[] sendPropTestCmd(int subCode, byte[] paramTx) throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    _data.writeInt(subCode);
                    _data.writeByteArray(paramTx);
                    if (!this.mRemote.transact(Stub.TRANSACTION_sendPropTestCmd, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sendPropTestCmd(subCode, paramTx);
                    }
                    _reply.readException();
                    byte[] _result = _reply.createByteArray();
                    _reply.recycle();
                    _data.recycle();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
            public byte[] getCustomerData() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(Stub.TRANSACTION_getCustomerData, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCustomerData();
                    }
                    _reply.readException();
                    byte[] _result = _reply.createByteArray();
                    _reply.recycle();
                    _data.recycle();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
            public INfcWalletAdapter getNfcWalletAdapterInterface() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(Stub.TRANSACTION_getNfcWalletAdapterInterface, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getNfcWalletAdapterInterface();
                    }
                    _reply.readException();
                    INfcWalletAdapter _result = INfcWalletAdapter.Stub.asInterface(_reply.readStrongBinder());
                    _reply.recycle();
                    _data.recycle();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
            public INfcAdapterStDtaExtensions getNfcAdapterStDtaExtensionsInterface() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(Stub.TRANSACTION_getNfcAdapterStDtaExtensionsInterface, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getNfcAdapterStDtaExtensionsInterface();
                    }
                    _reply.readException();
                    INfcAdapterStDtaExtensions _result = INfcAdapterStDtaExtensions.Stub.asInterface(_reply.readStrongBinder());
                    _reply.recycle();
                    _data.recycle();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }

            @Override // com.st.android.nfc_extensions.INfcAdapterStExtensions
            public INfcSettingsAdapter getNfcSettingsAdapterInterface() throws RemoteException {
                Parcel _data = Parcel.obtain();
                Parcel _reply = Parcel.obtain();
                try {
                    _data.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(Stub.TRANSACTION_getNfcSettingsAdapterInterface, _data, _reply, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getNfcSettingsAdapterInterface();
                    }
                    _reply.readException();
                    INfcSettingsAdapter _result = INfcSettingsAdapter.Stub.asInterface(_reply.readStrongBinder());
                    _reply.recycle();
                    _data.recycle();
                    return _result;
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(INfcAdapterStExtensions impl) {
            if (Proxy.sDefaultImpl != null || impl == null) {
                return false;
            }
            Proxy.sDefaultImpl = impl;
            return true;
        }

        public static INfcAdapterStExtensions getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
