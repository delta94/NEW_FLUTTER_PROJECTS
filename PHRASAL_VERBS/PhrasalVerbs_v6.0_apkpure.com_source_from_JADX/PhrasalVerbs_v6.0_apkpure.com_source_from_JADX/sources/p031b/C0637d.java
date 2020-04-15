package p031b;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: b.d */
final class C0637d {

    /* renamed from: a */
    private static final C0637d f2422a = new C0637d();

    /* renamed from: b */
    private final ExecutorService f2423b;

    /* renamed from: c */
    private final ScheduledExecutorService f2424c;

    /* renamed from: d */
    private final Executor f2425d;

    /* renamed from: b.d$a */
    private static class C0638a implements Executor {

        /* renamed from: a */
        private ThreadLocal<Integer> f2426a;

        private C0638a() {
            this.f2426a = new ThreadLocal<>();
        }

        /* renamed from: a */
        private int m2992a() {
            Integer num = (Integer) this.f2426a.get();
            if (num == null) {
                num = Integer.valueOf(0);
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f2426a.remove();
            } else {
                this.f2426a.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        /* renamed from: b */
        private int m2993b() {
            Integer num = (Integer) this.f2426a.get();
            if (num == null) {
                num = Integer.valueOf(0);
            }
            int intValue = num.intValue() + 1;
            this.f2426a.set(Integer.valueOf(intValue));
            return intValue;
        }

        public void execute(Runnable runnable) {
            if (m2993b() <= 15) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    m2992a();
                    throw th;
                }
            } else {
                C0637d.m2989a().execute(runnable);
            }
            m2992a();
        }
    }

    private C0637d() {
        this.f2423b = !m2991c() ? Executors.newCachedThreadPool() : C0634b.m2986a();
        this.f2424c = Executors.newSingleThreadScheduledExecutor();
        this.f2425d = new C0638a();
    }

    /* renamed from: a */
    public static ExecutorService m2989a() {
        return f2422a.f2423b;
    }

    /* renamed from: b */
    static Executor m2990b() {
        return f2422a.f2425d;
    }

    /* renamed from: c */
    private static boolean m2991c() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains("android");
    }
}
