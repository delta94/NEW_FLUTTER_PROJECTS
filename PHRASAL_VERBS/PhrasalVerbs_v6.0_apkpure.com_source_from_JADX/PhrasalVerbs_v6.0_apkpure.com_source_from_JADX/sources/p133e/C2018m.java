package p133e;

import java.util.concurrent.TimeUnit;

/* renamed from: e.m */
public class C2018m extends C2002F {

    /* renamed from: a */
    private C2002F f5941a;

    public C2018m(C2002F f) {
        if (f != null) {
            this.f5941a = f;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    /* renamed from: a */
    public final C2002F mo7169a() {
        return this.f5941a;
    }

    /* renamed from: a */
    public final C2018m mo7170a(C2002F f) {
        if (f != null) {
            this.f5941a = f;
            return this;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public C2002F clearDeadline() {
        return this.f5941a.clearDeadline();
    }

    public C2002F clearTimeout() {
        return this.f5941a.clearTimeout();
    }

    public long deadlineNanoTime() {
        return this.f5941a.deadlineNanoTime();
    }

    public C2002F deadlineNanoTime(long j) {
        return this.f5941a.deadlineNanoTime(j);
    }

    public boolean hasDeadline() {
        return this.f5941a.hasDeadline();
    }

    public void throwIfReached() {
        this.f5941a.throwIfReached();
    }

    public C2002F timeout(long j, TimeUnit timeUnit) {
        return this.f5941a.timeout(j, timeUnit);
    }

    public long timeoutNanos() {
        return this.f5941a.timeoutNanos();
    }
}
