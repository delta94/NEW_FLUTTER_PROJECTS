package p032c.p033a.p038c.p040b;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: c.a.c.b.c */
public class C0696c extends AbstractExecutorService implements C0695b {

    /* renamed from: a */
    private final Handler f2581a;

    public C0696c(Handler handler) {
        this.f2581a = handler;
    }

    /* renamed from: a */
    public boolean mo3434a() {
        return Thread.currentThread() == this.f2581a.getLooper().getThread();
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public void execute(Runnable runnable) {
        this.f2581a.post(runnable);
    }

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    /* access modifiers changed from: protected */
    public <T> C0697d<T> newTaskFor(Runnable runnable, T t) {
        return new C0697d<>(this.f2581a, runnable, t);
    }

    /* access modifiers changed from: protected */
    public <T> C0697d<T> newTaskFor(Callable<T> callable) {
        return new C0697d<>(this.f2581a, callable);
    }

    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        C0697d newTaskFor = newTaskFor(runnable, (T) null);
        this.f2581a.postDelayed(newTaskFor, timeUnit.toMillis(j));
        return newTaskFor;
    }

    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        C0697d newTaskFor = newTaskFor(callable);
        this.f2581a.postDelayed(newTaskFor, timeUnit.toMillis(j));
        return newTaskFor;
    }

    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    public ScheduledFuture<?> submit(Runnable runnable) {
        return submit(runnable, (Object) null);
    }

    public <T> ScheduledFuture<T> submit(Runnable runnable, T t) {
        if (runnable != null) {
            C0697d newTaskFor = newTaskFor(runnable, t);
            execute(newTaskFor);
            return newTaskFor;
        }
        throw new NullPointerException();
    }

    public <T> ScheduledFuture<T> submit(Callable<T> callable) {
        if (callable != null) {
            C0697d newTaskFor = newTaskFor(callable);
            execute(newTaskFor);
            return newTaskFor;
        }
        throw new NullPointerException();
    }
}
