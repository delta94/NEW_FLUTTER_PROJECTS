package p032c.p033a.p038c.p040b;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: c.a.c.b.d */
public class C0697d<V> implements RunnableFuture<V>, ScheduledFuture<V> {

    /* renamed from: a */
    private final Handler f2582a;

    /* renamed from: b */
    private final FutureTask<V> f2583b;

    public C0697d(Handler handler, Runnable runnable, V v) {
        this.f2582a = handler;
        this.f2583b = new FutureTask<>(runnable, v);
    }

    public C0697d(Handler handler, Callable<V> callable) {
        this.f2582a = handler;
        this.f2583b = new FutureTask<>(callable);
    }

    /* renamed from: a */
    public int mo3450a(Delayed delayed) {
        throw new UnsupportedOperationException();
    }

    public boolean cancel(boolean z) {
        return this.f2583b.cancel(z);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        mo3450a((Delayed) obj);
        throw null;
    }

    public V get() {
        return this.f2583b.get();
    }

    public V get(long j, TimeUnit timeUnit) {
        return this.f2583b.get(j, timeUnit);
    }

    public long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public boolean isCancelled() {
        return this.f2583b.isCancelled();
    }

    public boolean isDone() {
        return this.f2583b.isDone();
    }

    public void run() {
        this.f2583b.run();
    }
}
