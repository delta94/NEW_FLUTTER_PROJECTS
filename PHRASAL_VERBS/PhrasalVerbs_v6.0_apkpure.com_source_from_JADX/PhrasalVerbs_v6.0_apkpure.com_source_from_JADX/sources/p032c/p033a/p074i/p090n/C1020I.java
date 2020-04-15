package p032c.p033a.p074i.p090n;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p032c.p033a.p074i.p086j.C0988d;

/* renamed from: c.a.i.n.I */
public class C1020I {

    /* renamed from: a */
    private final Executor f3514a;

    /* renamed from: b */
    private final C1021a f3515b;

    /* renamed from: c */
    private final Runnable f3516c = new C1012F(this);

    /* renamed from: d */
    private final Runnable f3517d = new C1015G(this);

    /* renamed from: e */
    private final int f3518e;

    /* renamed from: f */
    C0988d f3519f = null;

    /* renamed from: g */
    int f3520g = 0;

    /* renamed from: h */
    C1023c f3521h = C1023c.IDLE;

    /* renamed from: i */
    long f3522i = 0;

    /* renamed from: j */
    long f3523j = 0;

    /* renamed from: c.a.i.n.I$a */
    public interface C1021a {
        /* renamed from: a */
        void mo4275a(C0988d dVar, int i);
    }

    /* renamed from: c.a.i.n.I$b */
    static class C1022b {

        /* renamed from: a */
        private static ScheduledExecutorService f3524a;

        /* renamed from: a */
        static ScheduledExecutorService m4558a() {
            if (f3524a == null) {
                f3524a = Executors.newSingleThreadScheduledExecutor();
            }
            return f3524a;
        }
    }

    /* renamed from: c.a.i.n.I$c */
    enum C1023c {
        IDLE,
        QUEUED,
        RUNNING,
        RUNNING_AND_PENDING
    }

    public C1020I(Executor executor, C1021a aVar, int i) {
        this.f3514a = executor;
        this.f3515b = aVar;
        this.f3518e = i;
    }

    /* renamed from: a */
    private void m4546a(long j) {
        if (j > 0) {
            C1022b.m4558a().schedule(this.f3517d, j, TimeUnit.MILLISECONDS);
        } else {
            this.f3517d.run();
        }
    }

    /* renamed from: b */
    private static boolean m4549b(C0988d dVar, int i) {
        return C1051c.m4687a(i) || C1051c.m4690b(i, 4) || C0988d.m4408e(dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m4550d() {
        C0988d dVar;
        int i;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            dVar = this.f3519f;
            i = this.f3520g;
            this.f3519f = null;
            this.f3520g = 0;
            this.f3521h = C1023c.RUNNING;
            this.f3523j = uptimeMillis;
        }
        try {
            if (m4549b(dVar, i)) {
                this.f3515b.mo4275a(dVar, i);
            }
        } finally {
            C0988d.m4406b(dVar);
            m4551e();
        }
    }

    /* renamed from: e */
    private void m4551e() {
        boolean z;
        long j;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            if (this.f3521h == C1023c.RUNNING_AND_PENDING) {
                j = Math.max(this.f3523j + ((long) this.f3518e), uptimeMillis);
                z = true;
                this.f3522i = uptimeMillis;
                this.f3521h = C1023c.QUEUED;
            } else {
                this.f3521h = C1023c.IDLE;
                j = 0;
                z = false;
            }
        }
        if (z) {
            m4546a(j - uptimeMillis);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m4552f() {
        this.f3514a.execute(this.f3516c);
    }

    /* renamed from: a */
    public void mo4271a() {
        C0988d dVar;
        synchronized (this) {
            dVar = this.f3519f;
            this.f3519f = null;
            this.f3520g = 0;
        }
        C0988d.m4406b(dVar);
    }

    /* renamed from: a */
    public boolean mo4272a(C0988d dVar, int i) {
        C0988d dVar2;
        if (!m4549b(dVar, i)) {
            return false;
        }
        synchronized (this) {
            dVar2 = this.f3519f;
            this.f3519f = C0988d.m4405a(dVar);
            this.f3520g = i;
        }
        C0988d.m4406b(dVar2);
        return true;
    }

    /* renamed from: b */
    public synchronized long mo4273b() {
        return this.f3523j - this.f3522i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (r3 == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        m4546a(r5 - r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        return true;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo4274c() {
        /*
            r7 = this;
            long r0 = android.os.SystemClock.uptimeMillis()
            monitor-enter(r7)
            c.a.i.j.d r2 = r7.f3519f     // Catch:{ all -> 0x0046 }
            int r3 = r7.f3520g     // Catch:{ all -> 0x0046 }
            boolean r2 = m4549b(r2, r3)     // Catch:{ all -> 0x0046 }
            r3 = 0
            if (r2 != 0) goto L_0x0012
            monitor-exit(r7)     // Catch:{ all -> 0x0046 }
            return r3
        L_0x0012:
            int[] r2 = p032c.p033a.p074i.p090n.C1018H.f3513a     // Catch:{ all -> 0x0046 }
            c.a.i.n.I$c r4 = r7.f3521h     // Catch:{ all -> 0x0046 }
            int r4 = r4.ordinal()     // Catch:{ all -> 0x0046 }
            r2 = r2[r4]     // Catch:{ all -> 0x0046 }
            r4 = 1
            if (r2 == r4) goto L_0x002d
            r5 = 2
            if (r2 == r5) goto L_0x002a
            r5 = 3
            if (r2 == r5) goto L_0x0026
            goto L_0x002a
        L_0x0026:
            c.a.i.n.I$c r2 = p032c.p033a.p074i.p090n.C1020I.C1023c.RUNNING_AND_PENDING     // Catch:{ all -> 0x0046 }
            r7.f3521h = r2     // Catch:{ all -> 0x0046 }
        L_0x002a:
            r5 = 0
            goto L_0x003e
        L_0x002d:
            long r2 = r7.f3523j     // Catch:{ all -> 0x0046 }
            int r5 = r7.f3518e     // Catch:{ all -> 0x0046 }
            long r5 = (long) r5     // Catch:{ all -> 0x0046 }
            long r2 = r2 + r5
            long r5 = java.lang.Math.max(r2, r0)     // Catch:{ all -> 0x0046 }
            r7.f3522i = r0     // Catch:{ all -> 0x0046 }
            c.a.i.n.I$c r2 = p032c.p033a.p074i.p090n.C1020I.C1023c.QUEUED     // Catch:{ all -> 0x0046 }
            r7.f3521h = r2     // Catch:{ all -> 0x0046 }
            r3 = 1
        L_0x003e:
            monitor-exit(r7)     // Catch:{ all -> 0x0046 }
            if (r3 == 0) goto L_0x0045
            long r5 = r5 - r0
            r7.m4546a(r5)
        L_0x0045:
            return r4
        L_0x0046:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0046 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p032c.p033a.p074i.p090n.C1020I.mo4274c():boolean");
    }
}
