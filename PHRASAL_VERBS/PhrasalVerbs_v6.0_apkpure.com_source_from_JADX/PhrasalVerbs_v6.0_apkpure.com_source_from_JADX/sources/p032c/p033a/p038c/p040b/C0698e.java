package p032c.p033a.p038c.p040b;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: c.a.c.b.e */
public abstract class C0698e<T> implements Runnable {

    /* renamed from: a */
    protected final AtomicInteger f2584a = new AtomicInteger(0);

    /* renamed from: a */
    public void mo3459a() {
        if (this.f2584a.compareAndSet(0, 2)) {
            mo3464c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo3460a(Exception exc);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo3461a(T t);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo3462b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo3463b(T t);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo3464c();

    public final void run() {
        if (this.f2584a.compareAndSet(0, 1)) {
            try {
                Object b = mo3462b();
                this.f2584a.set(3);
                try {
                    mo3463b(b);
                } finally {
                    mo3461a((T) b);
                }
            } catch (Exception e) {
                this.f2584a.set(4);
                mo3460a(e);
            }
        }
    }
}
