package p032c.p033a.p074i.p090n;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import p032c.p033a.p038c.p042d.C0718j;

/* renamed from: c.a.i.n.Ca */
public class C1007Ca {

    /* renamed from: a */
    private boolean f3490a = false;

    /* renamed from: b */
    private final Deque<Runnable> f3491b;

    /* renamed from: c */
    private final Executor f3492c;

    public C1007Ca(Executor executor) {
        C0718j.m3240a(executor);
        this.f3492c = executor;
        this.f3491b = new ArrayDeque();
    }

    /* renamed from: a */
    public synchronized void mo4262a(Runnable runnable) {
        if (this.f3490a) {
            this.f3491b.add(runnable);
        } else {
            this.f3492c.execute(runnable);
        }
    }

    /* renamed from: b */
    public synchronized void mo4263b(Runnable runnable) {
        this.f3491b.remove(runnable);
    }
}
