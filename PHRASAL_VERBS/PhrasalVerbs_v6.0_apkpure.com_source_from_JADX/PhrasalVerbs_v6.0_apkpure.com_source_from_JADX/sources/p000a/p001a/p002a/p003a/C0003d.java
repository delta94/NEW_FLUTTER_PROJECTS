package p000a.p001a.p002a.p003a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: a.a.a.a.d */
public class C0003d extends C0004e {

    /* renamed from: a */
    private final Object f5a = new Object();

    /* renamed from: b */
    private ExecutorService f6b = Executors.newFixedThreadPool(2);

    /* renamed from: c */
    private volatile Handler f7c;

    /* renamed from: a */
    public void mo3a(Runnable runnable) {
        this.f6b.execute(runnable);
    }

    /* renamed from: a */
    public boolean mo4a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: b */
    public void mo5b(Runnable runnable) {
        if (this.f7c == null) {
            synchronized (this.f5a) {
                if (this.f7c == null) {
                    this.f7c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f7c.post(runnable);
    }
}
