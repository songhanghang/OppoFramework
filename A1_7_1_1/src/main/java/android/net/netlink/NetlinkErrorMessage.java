package android.net.netlink;

import com.android.server.oppo.IElsaManager;
import java.nio.ByteBuffer;

public class NetlinkErrorMessage extends NetlinkMessage {
    private StructNlMsgErr mNlMsgErr = null;

    public static NetlinkErrorMessage parse(StructNlMsgHdr header, ByteBuffer byteBuffer) {
        NetlinkErrorMessage errorMsg = new NetlinkErrorMessage(header);
        errorMsg.mNlMsgErr = StructNlMsgErr.parse(byteBuffer);
        if (errorMsg.mNlMsgErr == null) {
            return null;
        }
        return errorMsg;
    }

    NetlinkErrorMessage(StructNlMsgHdr header) {
        super(header);
    }

    public StructNlMsgErr getNlMsgError() {
        return this.mNlMsgErr;
    }

    public String toString() {
        return "NetlinkErrorMessage{ nlmsghdr{" + (this.mHeader == null ? IElsaManager.EMPTY_PACKAGE : this.mHeader.toString()) + "}, " + "nlmsgerr{" + (this.mNlMsgErr == null ? IElsaManager.EMPTY_PACKAGE : this.mNlMsgErr.toString()) + "} " + "}";
    }
}
