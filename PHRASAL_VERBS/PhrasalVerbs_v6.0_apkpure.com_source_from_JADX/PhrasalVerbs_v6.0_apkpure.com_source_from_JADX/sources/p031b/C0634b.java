package p031b;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: b.b */
final class C0634b {

    /* renamed from: a */
    private static final C0634b f2417a = new C0634b();

    /* renamed from: b */
    private static final int f2418b = Runtime.getRuntime().availableProcessors();

    /* renamed from: c */
    static final int f2419c;

    /* renamed from: d */
    static final int f2420d;

    /* renamed from: e */
    private final Executor f2421e = new C0635a();

    /* renamed from: b.b$a */
    private static class C0635a implements Executor {
        private C0635a() {
        }

        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int i = f2418b;
        f2419c = i + 1;
        f2420d = (i * 2) + 1;
    }

    private C0634b() {
    }

    /* renamed from: a */
    public static ExecutorService m2986a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f2419c, f2420d, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
        m2987a(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static void m2987a(ThreadPoolExecutor threadPoolExecutor, boolean z) {
        if (VERSION.SDK_INT >= 9) {
            threadPoolExecutor.allowCoreThreadTimeOut(z);
        }
    }

    /* renamed from: b */
    public static Executor m2988b() {
        return f2417a.f2421e;
    }
}
