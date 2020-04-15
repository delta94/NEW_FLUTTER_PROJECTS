package p032c.p033a.p074i.p082f;

import android.os.Process;

/* renamed from: c.a.i.f.p */
class C0965p implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Runnable f3370a;

    /* renamed from: b */
    final /* synthetic */ C0966q f3371b;

    C0965p(C0966q qVar, Runnable runnable) {
        this.f3371b = qVar;
        this.f3370a = runnable;
    }

    public void run() {
        try {
            Process.setThreadPriority(this.f3371b.f3372a);
        } catch (Throwable unused) {
        }
        this.f3370a.run();
    }
}
