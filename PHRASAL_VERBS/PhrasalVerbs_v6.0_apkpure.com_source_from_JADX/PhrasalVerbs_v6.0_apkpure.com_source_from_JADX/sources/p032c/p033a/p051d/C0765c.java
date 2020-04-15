package p032c.p033a.p051d;

import android.util.Pair;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* renamed from: c.a.d.c */
public abstract class C0765c<T> implements C0768e<T> {

    /* renamed from: a */
    private C0766a f2665a = C0766a.IN_PROGRESS;

    /* renamed from: b */
    private boolean f2666b = false;

    /* renamed from: c */
    private T f2667c = null;

    /* renamed from: d */
    private Throwable f2668d = null;

    /* renamed from: e */
    private float f2669e = 0.0f;

    /* renamed from: f */
    private final ConcurrentLinkedQueue<Pair<C0771h<T>, Executor>> f2670f = new ConcurrentLinkedQueue<>();

    /* renamed from: c.a.d.c$a */
    private enum C0766a {
        IN_PROGRESS,
        SUCCESS,
        FAILURE
    }

    protected C0765c() {
    }

    /* renamed from: a */
    private void m3397a(C0771h<T> hVar, Executor executor, boolean z, boolean z2) {
        executor.execute(new C0763a(this, z, hVar, z2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x001b, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m3398b(float r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f2666b     // Catch:{ all -> 0x001c }
            r1 = 0
            if (r0 != 0) goto L_0x001a
            c.a.d.c$a r0 = r3.f2665a     // Catch:{ all -> 0x001c }
            c.a.d.c$a r2 = p032c.p033a.p051d.C0765c.C0766a.IN_PROGRESS     // Catch:{ all -> 0x001c }
            if (r0 == r2) goto L_0x000d
            goto L_0x001a
        L_0x000d:
            float r0 = r3.f2669e     // Catch:{ all -> 0x001c }
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0015
            monitor-exit(r3)
            return r1
        L_0x0015:
            r3.f2669e = r4     // Catch:{ all -> 0x001c }
            r4 = 1
            monitor-exit(r3)
            return r4
        L_0x001a:
            monitor-exit(r3)
            return r1
        L_0x001c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p032c.p033a.p051d.C0765c.m3398b(float):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0027, code lost:
        if (r4 == null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0029, code lost:
        mo3550a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0034, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m3399b(T r4, boolean r5) {
        /*
            r3 = this;
            r0 = 0
            monitor-enter(r3)     // Catch:{ all -> 0x003c }
            boolean r1 = r3.f2666b     // Catch:{ all -> 0x0039 }
            if (r1 != 0) goto L_0x002d
            c.a.d.c$a r1 = r3.f2665a     // Catch:{ all -> 0x0039 }
            c.a.d.c$a r2 = p032c.p033a.p051d.C0765c.C0766a.IN_PROGRESS     // Catch:{ all -> 0x0039 }
            if (r1 == r2) goto L_0x000d
            goto L_0x002d
        L_0x000d:
            if (r5 == 0) goto L_0x0017
            c.a.d.c$a r5 = p032c.p033a.p051d.C0765c.C0766a.SUCCESS     // Catch:{ all -> 0x0039 }
            r3.f2665a = r5     // Catch:{ all -> 0x0039 }
            r5 = 1065353216(0x3f800000, float:1.0)
            r3.f2669e = r5     // Catch:{ all -> 0x0039 }
        L_0x0017:
            T r5 = r3.f2667c     // Catch:{ all -> 0x0039 }
            if (r5 == r4) goto L_0x0024
            T r5 = r3.f2667c     // Catch:{ all -> 0x0039 }
            r3.f2667c = r4     // Catch:{ all -> 0x0021 }
            r4 = r5
            goto L_0x0025
        L_0x0021:
            r4 = move-exception
            r0 = r5
            goto L_0x003a
        L_0x0024:
            r4 = r0
        L_0x0025:
            r5 = 1
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x002c
            r3.mo3550a((T) r4)
        L_0x002c:
            return r5
        L_0x002d:
            r5 = 0
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x0034
            r3.mo3550a((T) r4)
        L_0x0034:
            return r5
        L_0x0035:
            r5 = move-exception
            r0 = r4
            r4 = r5
            goto L_0x003a
        L_0x0039:
            r4 = move-exception
        L_0x003a:
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            throw r4     // Catch:{ all -> 0x003c }
        L_0x003c:
            r4 = move-exception
            if (r0 == 0) goto L_0x0042
            r3.mo3550a((T) r0)
        L_0x0042:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p032c.p033a.p051d.C0765c.m3399b(java.lang.Object, boolean):boolean");
    }

    /* renamed from: b */
    private synchronized boolean m3400b(Throwable th) {
        boolean z;
        if (!this.f2666b) {
            if (this.f2665a == C0766a.IN_PROGRESS) {
                this.f2665a = C0766a.FAILURE;
                this.f2668d = th;
                z = true;
            }
        }
        z = false;
        return z;
    }

    /* renamed from: h */
    private void m3401h() {
        boolean e = mo3559e();
        boolean i = m3402i();
        Iterator it = this.f2670f.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            m3397a((C0771h) pair.first, (Executor) pair.second, e, i);
        }
    }

    /* renamed from: i */
    private synchronized boolean m3402i() {
        return mo3560f() && !mo3555b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        if (r0 == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        m3397a(r3, r4, mo3559e(), m3402i());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3549a(p032c.p033a.p051d.C0771h<T> r3, java.util.concurrent.Executor r4) {
        /*
            r2 = this;
            p032c.p033a.p038c.p042d.C0718j.m3240a(r3)
            p032c.p033a.p038c.p042d.C0718j.m3240a(r4)
            monitor-enter(r2)
            boolean r0 = r2.f2666b     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x000d
            monitor-exit(r2)     // Catch:{ all -> 0x0041 }
            return
        L_0x000d:
            c.a.d.c$a r0 = r2.f2665a     // Catch:{ all -> 0x0041 }
            c.a.d.c$a r1 = p032c.p033a.p051d.C0765c.C0766a.IN_PROGRESS     // Catch:{ all -> 0x0041 }
            if (r0 != r1) goto L_0x001c
            java.util.concurrent.ConcurrentLinkedQueue<android.util.Pair<c.a.d.h<T>, java.util.concurrent.Executor>> r0 = r2.f2670f     // Catch:{ all -> 0x0041 }
            android.util.Pair r1 = android.util.Pair.create(r3, r4)     // Catch:{ all -> 0x0041 }
            r0.add(r1)     // Catch:{ all -> 0x0041 }
        L_0x001c:
            boolean r0 = r2.mo3551a()     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x0031
            boolean r0 = r2.mo3555b()     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x0031
            boolean r0 = r2.m3402i()     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r0 = 0
            goto L_0x0032
        L_0x0031:
            r0 = 1
        L_0x0032:
            monitor-exit(r2)     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x0040
            boolean r0 = r2.mo3559e()
            boolean r1 = r2.m3402i()
            r2.m3397a(r3, r4, r0, r1)
        L_0x0040:
            return
        L_0x0041:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0041 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p032c.p033a.p051d.C0765c.mo3549a(c.a.d.h, java.util.concurrent.Executor):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3550a(T t) {
    }

    /* renamed from: a */
    public synchronized boolean mo3551a() {
        return this.f2667c != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo3552a(float f) {
        boolean b = m3398b(f);
        if (b) {
            mo3561g();
        }
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo3553a(T t, boolean z) {
        boolean b = m3399b(t, z);
        if (b) {
            m3401h();
        }
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo3554a(Throwable th) {
        boolean b = m3400b(th);
        if (b) {
            m3401h();
        }
        return b;
    }

    /* renamed from: b */
    public synchronized boolean mo3555b() {
        return this.f2665a != C0766a.IN_PROGRESS;
    }

    /* renamed from: c */
    public synchronized Throwable mo3556c() {
        return this.f2668d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        mo3550a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        if (mo3555b() != false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        m3401h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.f2670f.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0026, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        if (r1 == null) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean close() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f2666b     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0008
            r0 = 0
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            return r0
        L_0x0008:
            r0 = 1
            r3.f2666b = r0     // Catch:{ all -> 0x002a }
            T r1 = r3.f2667c     // Catch:{ all -> 0x002a }
            r2 = 0
            r3.f2667c = r2     // Catch:{ all -> 0x002a }
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0016
            r3.mo3550a((T) r1)
        L_0x0016:
            boolean r1 = r3.mo3555b()
            if (r1 != 0) goto L_0x001f
            r3.m3401h()
        L_0x001f:
            monitor-enter(r3)
            java.util.concurrent.ConcurrentLinkedQueue<android.util.Pair<c.a.d.h<T>, java.util.concurrent.Executor>> r1 = r3.f2670f     // Catch:{ all -> 0x0027 }
            r1.clear()     // Catch:{ all -> 0x0027 }
            monitor-exit(r3)     // Catch:{ all -> 0x0027 }
            return r0
        L_0x0027:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0027 }
            throw r0
        L_0x002a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p032c.p033a.p051d.C0765c.close():boolean");
    }

    /* renamed from: d */
    public synchronized float mo3558d() {
        return this.f2669e;
    }

    /* renamed from: e */
    public synchronized boolean mo3559e() {
        return this.f2665a == C0766a.FAILURE;
    }

    /* renamed from: f */
    public synchronized boolean mo3560f() {
        return this.f2666b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo3561g() {
        Iterator it = this.f2670f.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            ((Executor) pair.second).execute(new C0764b(this, (C0771h) pair.first));
        }
    }

    public synchronized T getResult() {
        return this.f2667c;
    }
}
