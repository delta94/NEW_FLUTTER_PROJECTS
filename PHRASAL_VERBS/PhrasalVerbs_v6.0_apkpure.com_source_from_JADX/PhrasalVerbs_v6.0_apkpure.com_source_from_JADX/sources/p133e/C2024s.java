package p133e;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: e.s */
class C2024s extends C2006c {

    /* renamed from: a */
    final /* synthetic */ Socket f5955a;

    C2024s(Socket socket) {
        this.f5955a = socket;
    }

    /* access modifiers changed from: protected */
    public IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* access modifiers changed from: protected */
    public void timedOut() {
        StringBuilder sb;
        Level level;
        Logger logger;
        String str = "Failed to close timed out socket ";
        try {
            this.f5955a.close();
            return;
        } catch (Exception e) {
            logger = C2025t.f5956a;
            level = Level.WARNING;
            sb = new StringBuilder();
            r1 = e;
        } catch (AssertionError e2) {
            if (C2025t.m7757a(e2)) {
                logger = C2025t.f5956a;
                level = Level.WARNING;
                sb = new StringBuilder();
                r1 = e2;
            } else {
                throw e2;
            }
        }
        sb.append(str);
        sb.append(this.f5955a);
        logger.log(level, sb.toString(), r1);
    }
}
