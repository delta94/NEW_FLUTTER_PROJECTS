package com.facebook.imagepipeline.memory;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.Set;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p042d.C0720l;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p038c.p045g.C0733c;
import p032c.p033a.p038c.p045g.C0735e;

/* renamed from: com.facebook.imagepipeline.memory.a */
public abstract class C1266a<V> implements C0735e<V> {

    /* renamed from: a */
    private final Class<?> f4145a = getClass();

    /* renamed from: b */
    final C0733c f4146b;

    /* renamed from: c */
    final C1294w f4147c;

    /* renamed from: d */
    final SparseArray<C1274f<V>> f4148d;

    /* renamed from: e */
    final Set<V> f4149e;

    /* renamed from: f */
    private boolean f4150f;

    /* renamed from: g */
    final C1267a f4151g;

    /* renamed from: h */
    final C1267a f4152h;

    /* renamed from: i */
    private final C1295x f4153i;

    /* renamed from: com.facebook.imagepipeline.memory.a$a */
    static class C1267a {

        /* renamed from: a */
        int f4154a;

        /* renamed from: b */
        int f4155b;

        C1267a() {
        }

        /* renamed from: a */
        public void mo4730a(int i) {
            int i2 = this.f4155b;
            if (i2 >= i) {
                int i3 = this.f4154a;
                if (i3 > 0) {
                    this.f4154a = i3 - 1;
                    this.f4155b = i2 - i;
                    return;
                }
            }
            C0727a.m3285d("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i), Integer.valueOf(this.f4155b), Integer.valueOf(this.f4154a));
        }

        /* renamed from: b */
        public void mo4731b(int i) {
            this.f4154a++;
            this.f4155b += i;
        }
    }

    /* renamed from: com.facebook.imagepipeline.memory.a$b */
    public static class C1268b extends RuntimeException {
        public C1268b(Object obj) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid size: ");
            sb.append(obj.toString());
            super(sb.toString());
        }
    }

    /* renamed from: com.facebook.imagepipeline.memory.a$c */
    public static class C1269c extends RuntimeException {
        public C1269c(int i, int i2, int i3, int i4) {
            StringBuilder sb = new StringBuilder();
            sb.append("Pool hard cap violation? Hard cap = ");
            sb.append(i);
            sb.append(" Used size = ");
            sb.append(i2);
            sb.append(" Free size = ");
            sb.append(i3);
            sb.append(" Request size = ");
            sb.append(i4);
            super(sb.toString());
        }
    }

    public C1266a(C0733c cVar, C1294w wVar, C1295x xVar) {
        C0718j.m3240a(cVar);
        this.f4146b = cVar;
        C0718j.m3240a(wVar);
        this.f4147c = wVar;
        C0718j.m3240a(xVar);
        this.f4153i = xVar;
        this.f4148d = new SparseArray<>();
        if (this.f4147c.f4215f) {
            m5459e();
        } else {
            m5457b(new SparseIntArray(0));
        }
        this.f4149e = C0720l.m3251b();
        this.f4152h = new C1267a();
        this.f4151g = new C1267a();
    }

    /* renamed from: a */
    private void m5456a(SparseIntArray sparseIntArray) {
        this.f4148d.clear();
        for (int i = 0; i < sparseIntArray.size(); i++) {
            int keyAt = sparseIntArray.keyAt(i);
            this.f4148d.put(keyAt, new C1274f(mo4727e(keyAt), sparseIntArray.valueAt(i), 0, this.f4147c.f4215f));
        }
    }

    /* renamed from: b */
    private synchronized void m5457b(SparseIntArray sparseIntArray) {
        C0718j.m3240a(sparseIntArray);
        this.f4148d.clear();
        SparseIntArray sparseIntArray2 = this.f4147c.f4212c;
        if (sparseIntArray2 != null) {
            for (int i = 0; i < sparseIntArray2.size(); i++) {
                int keyAt = sparseIntArray2.keyAt(i);
                this.f4148d.put(keyAt, new C1274f(mo4727e(keyAt), sparseIntArray2.valueAt(i), sparseIntArray.get(keyAt, 0), this.f4147c.f4215f));
            }
            this.f4150f = false;
        } else {
            this.f4150f = true;
        }
    }

    /* renamed from: d */
    private synchronized void mo4759d() {
        boolean z;
        if (mo4720b()) {
            if (this.f4152h.f4155b != 0) {
                z = false;
                C0718j.m3247b(z);
            }
        }
        z = true;
        C0718j.m3247b(z);
    }

    /* renamed from: e */
    private synchronized void m5459e() {
        SparseIntArray sparseIntArray = this.f4147c.f4212c;
        if (sparseIntArray != null) {
            m5456a(sparseIntArray);
            this.f4150f = false;
        } else {
            this.f4150f = true;
        }
    }

    @SuppressLint({"InvalidAccessToGuardedField"})
    /* renamed from: f */
    private void m5460f() {
        if (C0727a.m3269a(2)) {
            C0727a.m3262a(this.f4145a, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.f4151g.f4154a), Integer.valueOf(this.f4151g.f4155b), Integer.valueOf(this.f4152h.f4154a), Integer.valueOf(this.f4152h.f4155b));
        }
    }

    /* renamed from: h */
    private synchronized C1274f<V> m5461h(int i) {
        return (C1274f) this.f4148d.get(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract V mo4717a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4718a() {
        this.f4146b.mo3485a(this);
        this.f4153i.mo4768a(this);
    }

    /* renamed from: a */
    public void mo3486a(V v) {
        C1295x xVar;
        C0718j.m3240a(v);
        int c = mo4722c(v);
        int e = mo4727e(c);
        synchronized (this) {
            C1274f h = m5461h(c);
            if (!this.f4149e.remove(v)) {
                C0727a.m3264a(this.f4145a, "release (free, value unrecognized) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(c));
                mo4719b(v);
                xVar = this.f4153i;
            } else {
                if (h != null && !h.mo4749e() && !mo4720b()) {
                    if (mo4726d(v)) {
                        h.mo4746b(v);
                        this.f4152h.mo4731b(e);
                        this.f4151g.mo4730a(e);
                        this.f4153i.mo4772d(e);
                        if (C0727a.m3269a(2)) {
                            C0727a.m3260a(this.f4145a, "release (reuse) (object, size) = (%x, %s)", (Object) Integer.valueOf(System.identityHashCode(v)), (Object) Integer.valueOf(c));
                        }
                        m5460f();
                    }
                }
                if (h != null) {
                    h.mo4743a();
                }
                if (C0727a.m3269a(2)) {
                    C0727a.m3260a(this.f4145a, "release (free) (object, size) = (%x, %s)", (Object) Integer.valueOf(System.identityHashCode(v)), (Object) Integer.valueOf(c));
                }
                mo4719b(v);
                this.f4151g.mo4730a(e);
                xVar = this.f4153i;
            }
            xVar.mo4771c(e);
            m5460f();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo4719b(V v);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized boolean mo4720b() {
        boolean z;
        z = this.f4151g.f4155b + this.f4152h.f4155b > this.f4147c.f4211b;
        if (z) {
            this.f4153i.mo4766a();
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized boolean mo4721b(int i) {
        int i2 = this.f4147c.f4210a;
        if (i > i2 - this.f4151g.f4155b) {
            this.f4153i.mo4769b();
            return false;
        }
        int i3 = this.f4147c.f4211b;
        if (i > i3 - (this.f4151g.f4155b + this.f4152h.f4155b)) {
            mo4729g(i3 - i);
        }
        if (i <= i2 - (this.f4151g.f4155b + this.f4152h.f4155b)) {
            return true;
        }
        this.f4153i.mo4769b();
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo4722c(V v);

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        return r0;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.facebook.imagepipeline.memory.C1274f<V> mo4723c(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            android.util.SparseArray<com.facebook.imagepipeline.memory.f<V>> r0 = r3.f4148d     // Catch:{ all -> 0x002f }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002f }
            com.facebook.imagepipeline.memory.f r0 = (com.facebook.imagepipeline.memory.C1274f) r0     // Catch:{ all -> 0x002f }
            if (r0 != 0) goto L_0x002d
            boolean r1 = r3.f4150f     // Catch:{ all -> 0x002f }
            if (r1 != 0) goto L_0x0010
            goto L_0x002d
        L_0x0010:
            r0 = 2
            boolean r0 = p032c.p033a.p038c.p043e.C0727a.m3269a(r0)     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0022
            java.lang.Class<?> r0 = r3.f4145a     // Catch:{ all -> 0x002f }
            java.lang.String r1 = "creating new bucket %s"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x002f }
            p032c.p033a.p038c.p043e.C0727a.m3271b(r0, r1, r2)     // Catch:{ all -> 0x002f }
        L_0x0022:
            com.facebook.imagepipeline.memory.f r0 = r3.mo4728f(r4)     // Catch:{ all -> 0x002f }
            android.util.SparseArray<com.facebook.imagepipeline.memory.f<V>> r1 = r3.f4148d     // Catch:{ all -> 0x002f }
            r1.put(r4, r0)     // Catch:{ all -> 0x002f }
            monitor-exit(r3)
            return r0
        L_0x002d:
            monitor-exit(r3)
            return r0
        L_0x002f:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.C1266a.mo4723c(int):com.facebook.imagepipeline.memory.f");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public synchronized void mo4724c() {
        if (mo4720b()) {
            mo4729g(this.f4147c.f4211b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo4725d(int i);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo4726d(V v) {
        C0718j.m3240a(v);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo4727e(int i);

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C1274f<V> mo4728f(int i) {
        return new C1274f<>(mo4727e(i), Integer.MAX_VALUE, 0, this.f4147c.f4215f);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008d, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo4729g(int r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.facebook.imagepipeline.memory.a$a r0 = r7.f4151g     // Catch:{ all -> 0x008e }
            int r0 = r0.f4155b     // Catch:{ all -> 0x008e }
            com.facebook.imagepipeline.memory.a$a r1 = r7.f4152h     // Catch:{ all -> 0x008e }
            int r1 = r1.f4155b     // Catch:{ all -> 0x008e }
            int r0 = r0 + r1
            int r0 = r0 - r8
            com.facebook.imagepipeline.memory.a$a r1 = r7.f4152h     // Catch:{ all -> 0x008e }
            int r1 = r1.f4155b     // Catch:{ all -> 0x008e }
            int r0 = java.lang.Math.min(r0, r1)     // Catch:{ all -> 0x008e }
            if (r0 > 0) goto L_0x0017
            monitor-exit(r7)
            return
        L_0x0017:
            r1 = 2
            boolean r2 = p032c.p033a.p038c.p043e.C0727a.m3269a(r1)     // Catch:{ all -> 0x008e }
            if (r2 == 0) goto L_0x003a
            java.lang.Class<?> r2 = r7.f4145a     // Catch:{ all -> 0x008e }
            java.lang.String r3 = "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x008e }
            com.facebook.imagepipeline.memory.a$a r5 = r7.f4151g     // Catch:{ all -> 0x008e }
            int r5 = r5.f4155b     // Catch:{ all -> 0x008e }
            com.facebook.imagepipeline.memory.a$a r6 = r7.f4152h     // Catch:{ all -> 0x008e }
            int r6 = r6.f4155b     // Catch:{ all -> 0x008e }
            int r5 = r5 + r6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x008e }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x008e }
            p032c.p033a.p038c.p043e.C0727a.m3261a(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x008e }
        L_0x003a:
            r7.m5460f()     // Catch:{ all -> 0x008e }
            r2 = 0
        L_0x003e:
            android.util.SparseArray<com.facebook.imagepipeline.memory.f<V>> r3 = r7.f4148d     // Catch:{ all -> 0x008e }
            int r3 = r3.size()     // Catch:{ all -> 0x008e }
            if (r2 >= r3) goto L_0x006b
            if (r0 > 0) goto L_0x0049
            goto L_0x006b
        L_0x0049:
            android.util.SparseArray<com.facebook.imagepipeline.memory.f<V>> r3 = r7.f4148d     // Catch:{ all -> 0x008e }
            java.lang.Object r3 = r3.valueAt(r2)     // Catch:{ all -> 0x008e }
            com.facebook.imagepipeline.memory.f r3 = (com.facebook.imagepipeline.memory.C1274f) r3     // Catch:{ all -> 0x008e }
        L_0x0051:
            if (r0 <= 0) goto L_0x0068
            java.lang.Object r4 = r3.mo4750f()     // Catch:{ all -> 0x008e }
            if (r4 != 0) goto L_0x005a
            goto L_0x0068
        L_0x005a:
            r7.mo4719b((V) r4)     // Catch:{ all -> 0x008e }
            int r4 = r3.f4166a     // Catch:{ all -> 0x008e }
            int r0 = r0 - r4
            com.facebook.imagepipeline.memory.a$a r4 = r7.f4152h     // Catch:{ all -> 0x008e }
            int r5 = r3.f4166a     // Catch:{ all -> 0x008e }
            r4.mo4730a(r5)     // Catch:{ all -> 0x008e }
            goto L_0x0051
        L_0x0068:
            int r2 = r2 + 1
            goto L_0x003e
        L_0x006b:
            r7.m5460f()     // Catch:{ all -> 0x008e }
            boolean r0 = p032c.p033a.p038c.p043e.C0727a.m3269a(r1)     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x008c
            java.lang.Class<?> r0 = r7.f4145a     // Catch:{ all -> 0x008e }
            java.lang.String r1 = "trimToSize: TargetSize = %d; Final Size = %d"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x008e }
            com.facebook.imagepipeline.memory.a$a r2 = r7.f4151g     // Catch:{ all -> 0x008e }
            int r2 = r2.f4155b     // Catch:{ all -> 0x008e }
            com.facebook.imagepipeline.memory.a$a r3 = r7.f4152h     // Catch:{ all -> 0x008e }
            int r3 = r3.f4155b     // Catch:{ all -> 0x008e }
            int r2 = r2 + r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x008e }
            p032c.p033a.p038c.p043e.C0727a.m3260a(r0, r1, r8, r2)     // Catch:{ all -> 0x008e }
        L_0x008c:
            monitor-exit(r7)
            return
        L_0x008e:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.C1266a.mo4729g(int):void");
    }

    /* JADX INFO: used method not loaded: com.facebook.imagepipeline.memory.x.a(int):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0052, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r0 = mo4717a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006f, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r5.f4151g.mo4730a(r2);
        r4 = mo4723c(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0079, code lost:
        if (r4 != null) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007b, code lost:
        r4.mo4743a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007f, code lost:
        p032c.p033a.p038c.p042d.C0726r.m3255b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0082, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        p032c.p033a.p038c.p042d.C0718j.m3247b(r5.f4149e.add(r0));
        mo4724c();
        r5.f4153i.mo4767a(r2);
        m5460f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009b, code lost:
        if (p032c.p033a.p038c.p043e.C0727a.m3269a(2) == false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009d, code lost:
        p032c.p033a.p038c.p043e.C0727a.m3260a(r5.f4145a, "get (alloc) (object, size) = (%x, %s)", (java.lang.Object) java.lang.Integer.valueOf(java.lang.System.identityHashCode(r0)), (java.lang.Object) java.lang.Integer.valueOf(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b1, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public V get(int r6) {
        /*
            r5 = this;
            r5.mo4759d()
            int r6 = r5.mo4725d(r6)
            monitor-enter(r5)
            com.facebook.imagepipeline.memory.f r0 = r5.mo4723c(r6)     // Catch:{ all -> 0x00ca }
            r1 = 2
            if (r0 == 0) goto L_0x0053
            java.lang.Object r2 = r0.mo4745b()     // Catch:{ all -> 0x00ca }
            if (r2 == 0) goto L_0x0053
            java.util.Set<V> r6 = r5.f4149e     // Catch:{ all -> 0x00ca }
            boolean r6 = r6.add(r2)     // Catch:{ all -> 0x00ca }
            p032c.p033a.p038c.p042d.C0718j.m3247b(r6)     // Catch:{ all -> 0x00ca }
            int r6 = r5.mo4722c((V) r2)     // Catch:{ all -> 0x00ca }
            int r0 = r5.mo4727e(r6)     // Catch:{ all -> 0x00ca }
            com.facebook.imagepipeline.memory.a$a r3 = r5.f4151g     // Catch:{ all -> 0x00ca }
            r3.mo4731b(r0)     // Catch:{ all -> 0x00ca }
            com.facebook.imagepipeline.memory.a$a r3 = r5.f4152h     // Catch:{ all -> 0x00ca }
            r3.mo4730a(r0)     // Catch:{ all -> 0x00ca }
            com.facebook.imagepipeline.memory.x r3 = r5.f4153i     // Catch:{ all -> 0x00ca }
            r3.mo4770b(r0)     // Catch:{ all -> 0x00ca }
            r5.m5460f()     // Catch:{ all -> 0x00ca }
            boolean r0 = p032c.p033a.p038c.p043e.C0727a.m3269a(r1)     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x0051
            java.lang.Class<?> r0 = r5.f4145a     // Catch:{ all -> 0x00ca }
            java.lang.String r1 = "get (reuse) (object, size) = (%x, %s)"
            int r3 = java.lang.System.identityHashCode(r2)     // Catch:{ all -> 0x00ca }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00ca }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00ca }
            p032c.p033a.p038c.p043e.C0727a.m3260a(r0, r1, r3, r6)     // Catch:{ all -> 0x00ca }
        L_0x0051:
            monitor-exit(r5)     // Catch:{ all -> 0x00ca }
            return r2
        L_0x0053:
            int r2 = r5.mo4727e(r6)     // Catch:{ all -> 0x00ca }
            boolean r3 = r5.mo4721b(r2)     // Catch:{ all -> 0x00ca }
            if (r3 == 0) goto L_0x00b8
            com.facebook.imagepipeline.memory.a$a r3 = r5.f4151g     // Catch:{ all -> 0x00ca }
            r3.mo4731b(r2)     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x0067
            r0.mo4748d()     // Catch:{ all -> 0x00ca }
        L_0x0067:
            monitor-exit(r5)     // Catch:{ all -> 0x00ca }
            r0 = 0
            java.lang.Object r0 = r5.mo4717a(r6)     // Catch:{ Throwable -> 0x006e }
            goto L_0x0082
        L_0x006e:
            r3 = move-exception
            monitor-enter(r5)
            com.facebook.imagepipeline.memory.a$a r4 = r5.f4151g     // Catch:{ all -> 0x00b5 }
            r4.mo4730a(r2)     // Catch:{ all -> 0x00b5 }
            com.facebook.imagepipeline.memory.f r4 = r5.mo4723c(r6)     // Catch:{ all -> 0x00b5 }
            if (r4 == 0) goto L_0x007e
            r4.mo4743a()     // Catch:{ all -> 0x00b5 }
        L_0x007e:
            monitor-exit(r5)     // Catch:{ all -> 0x00b5 }
            p032c.p033a.p038c.p042d.C0726r.m3255b(r3)
        L_0x0082:
            monitor-enter(r5)
            java.util.Set<V> r3 = r5.f4149e     // Catch:{ all -> 0x00b2 }
            boolean r3 = r3.add(r0)     // Catch:{ all -> 0x00b2 }
            p032c.p033a.p038c.p042d.C0718j.m3247b(r3)     // Catch:{ all -> 0x00b2 }
            r5.mo4724c()     // Catch:{ all -> 0x00b2 }
            com.facebook.imagepipeline.memory.x r3 = r5.f4153i     // Catch:{ all -> 0x00b2 }
            r3.mo4767a(r2)     // Catch:{ all -> 0x00b2 }
            r5.m5460f()     // Catch:{ all -> 0x00b2 }
            boolean r1 = p032c.p033a.p038c.p043e.C0727a.m3269a(r1)     // Catch:{ all -> 0x00b2 }
            if (r1 == 0) goto L_0x00b0
            java.lang.Class<?> r1 = r5.f4145a     // Catch:{ all -> 0x00b2 }
            java.lang.String r2 = "get (alloc) (object, size) = (%x, %s)"
            int r3 = java.lang.System.identityHashCode(r0)     // Catch:{ all -> 0x00b2 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00b2 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00b2 }
            p032c.p033a.p038c.p043e.C0727a.m3260a(r1, r2, r3, r6)     // Catch:{ all -> 0x00b2 }
        L_0x00b0:
            monitor-exit(r5)     // Catch:{ all -> 0x00b2 }
            return r0
        L_0x00b2:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00b2 }
            throw r6
        L_0x00b5:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00b5 }
            throw r6
        L_0x00b8:
            com.facebook.imagepipeline.memory.a$c r6 = new com.facebook.imagepipeline.memory.a$c     // Catch:{ all -> 0x00ca }
            com.facebook.imagepipeline.memory.w r0 = r5.f4147c     // Catch:{ all -> 0x00ca }
            int r0 = r0.f4210a     // Catch:{ all -> 0x00ca }
            com.facebook.imagepipeline.memory.a$a r1 = r5.f4151g     // Catch:{ all -> 0x00ca }
            int r1 = r1.f4155b     // Catch:{ all -> 0x00ca }
            com.facebook.imagepipeline.memory.a$a r3 = r5.f4152h     // Catch:{ all -> 0x00ca }
            int r3 = r3.f4155b     // Catch:{ all -> 0x00ca }
            r6.<init>(r0, r1, r3, r2)     // Catch:{ all -> 0x00ca }
            throw r6     // Catch:{ all -> 0x00ca }
        L_0x00ca:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00ca }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.C1266a.get(int):java.lang.Object");
    }
}
