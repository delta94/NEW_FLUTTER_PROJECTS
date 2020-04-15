package android.support.p030v7.app;

import android.content.res.Resources.NotFoundException;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: android.support.v7.app.p */
class C0430p implements UncaughtExceptionHandler {

    /* renamed from: a */
    final /* synthetic */ UncaughtExceptionHandler f1465a;

    C0430p(UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f1465a = uncaughtExceptionHandler;
    }

    /* renamed from: a */
    private boolean m1978a(Throwable th) {
        if (!(th instanceof NotFoundException)) {
            return false;
        }
        String message = th.getMessage();
        if (message != null) {
            return message.contains("drawable") || message.contains("Drawable");
        }
        return false;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        if (m1978a(th)) {
            StringBuilder sb = new StringBuilder();
            sb.append(th.getMessage());
            sb.append(". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            NotFoundException notFoundException = new NotFoundException(sb.toString());
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.f1465a.uncaughtException(thread, notFoundException);
            return;
        }
        this.f1465a.uncaughtException(thread, th);
    }
}
