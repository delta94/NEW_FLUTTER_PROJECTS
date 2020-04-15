package p032c.p033a.p038c.p040b;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: c.a.c.b.a */
public class C0694a extends AbstractExecutorService {

    /* renamed from: a */
    private static final C0694a f2580a = new C0694a();

    private C0694a() {
    }

    /* renamed from: a */
    public static C0694a m3202a() {
        return f2580a;
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return true;
    }

    public void execute(Runnable runnable) {
        runnable.run();
    }

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public void shutdown() {
    }

    public List<Runnable> shutdownNow() {
        shutdown();
        return Collections.emptyList();
    }
}
