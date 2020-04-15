package p032c.p033a.p051d;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p032c.p033a.p038c.p040b.C0694a;
import p032c.p033a.p038c.p042d.C0715i;
import p032c.p033a.p038c.p042d.C0715i.C0716a;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p042d.C0721m;

/* renamed from: c.a.d.k */
public class C0776k<T> implements C0721m<C0768e<T>> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final List<C0721m<C0768e<T>>> f2682a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final boolean f2683b;

    /* renamed from: c.a.d.k$a */
    private class C0777a extends C0765c<T> {

        /* renamed from: g */
        private ArrayList<C0768e<T>> f2684g;

        /* renamed from: h */
        private int f2685h;

        /* renamed from: i */
        private int f2686i;

        /* renamed from: j */
        private AtomicInteger f2687j;

        /* renamed from: k */
        private Throwable f2688k;

        /* renamed from: c.a.d.k$a$a */
        private class C0778a implements C0771h<T> {

            /* renamed from: a */
            private int f2690a;

            public C0778a(int i) {
                this.f2690a = i;
            }

            /* renamed from: a */
            public void mo3563a(C0768e<T> eVar) {
            }

            /* renamed from: b */
            public void mo3564b(C0768e<T> eVar) {
                C0777a.this.m3454a(this.f2690a, eVar);
            }

            /* renamed from: c */
            public void mo3565c(C0768e<T> eVar) {
                if (eVar.mo3551a()) {
                    C0777a.this.m3459b(this.f2690a, eVar);
                } else if (eVar.mo3555b()) {
                    C0777a.this.m3454a(this.f2690a, eVar);
                }
            }

            /* renamed from: d */
            public void mo3566d(C0768e<T> eVar) {
                if (this.f2690a == 0) {
                    C0777a.this.mo3552a(eVar.mo3558d());
                }
            }
        }

        public C0777a() {
            if (!C0776k.this.f2683b) {
                m3462h();
            }
        }

        /* renamed from: a */
        private synchronized C0768e<T> m3453a(int i) {
            C0768e<T> eVar;
            eVar = null;
            if (this.f2684g != null && i < this.f2684g.size()) {
                eVar = (C0768e) this.f2684g.set(i, null);
            }
            return eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m3454a(int i, C0768e<T> eVar) {
            m3456a(m3461c(i, eVar));
            if (i == 0) {
                this.f2688k = eVar.mo3556c();
            }
            m3464j();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0022, code lost:
            if (r0 <= r4) goto L_0x002e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0024, code lost:
            m3456a(m3453a(r0));
            r0 = r0 - 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m3455a(int r4, p032c.p033a.p051d.C0768e<T> r5, boolean r6) {
            /*
                r3 = this;
                monitor-enter(r3)
                int r0 = r3.f2685h     // Catch:{ all -> 0x0031 }
                int r1 = r3.f2685h     // Catch:{ all -> 0x0031 }
                c.a.d.e r2 = r3.m3458b(r4)     // Catch:{ all -> 0x0031 }
                if (r5 != r2) goto L_0x002f
                int r5 = r3.f2685h     // Catch:{ all -> 0x0031 }
                if (r4 != r5) goto L_0x0010
                goto L_0x002f
            L_0x0010:
                c.a.d.e r5 = r3.m3463i()     // Catch:{ all -> 0x0031 }
                if (r5 == 0) goto L_0x001f
                if (r6 == 0) goto L_0x001d
                int r5 = r3.f2685h     // Catch:{ all -> 0x0031 }
                if (r4 >= r5) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r4 = r1
                goto L_0x0021
            L_0x001f:
                r3.f2685h = r4     // Catch:{ all -> 0x0031 }
            L_0x0021:
                monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            L_0x0022:
                if (r0 <= r4) goto L_0x002e
                c.a.d.e r5 = r3.m3453a(r0)
                r3.m3456a(r5)
                int r0 = r0 + -1
                goto L_0x0022
            L_0x002e:
                return
            L_0x002f:
                monitor-exit(r3)     // Catch:{ all -> 0x0031 }
                return
            L_0x0031:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0031 }
                throw r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p032c.p033a.p051d.C0776k.C0777a.m3455a(int, c.a.d.e, boolean):void");
        }

        /* renamed from: a */
        private void m3456a(C0768e<T> eVar) {
            if (eVar != null) {
                eVar.close();
            }
        }

        /* renamed from: b */
        private synchronized C0768e<T> m3458b(int i) {
            return (this.f2684g == null || i >= this.f2684g.size()) ? null : (C0768e) this.f2684g.get(i);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m3459b(int i, C0768e<T> eVar) {
            m3455a(i, eVar, eVar.mo3555b());
            if (eVar == m3463i()) {
                mo3553a(null, i == 0 && eVar.mo3555b());
            }
            m3464j();
        }

        /* renamed from: c */
        private synchronized C0768e<T> m3461c(int i, C0768e<T> eVar) {
            if (eVar == m3463i()) {
                return null;
            }
            if (eVar != m3458b(i)) {
                return eVar;
            }
            return m3453a(i);
        }

        /* renamed from: h */
        private void m3462h() {
            if (this.f2687j == null) {
                synchronized (this) {
                    if (this.f2687j == null) {
                        int i = 0;
                        this.f2687j = new AtomicInteger(0);
                        int size = C0776k.this.f2682a.size();
                        this.f2686i = size;
                        this.f2685h = size;
                        this.f2684g = new ArrayList<>(size);
                        while (true) {
                            if (i >= size) {
                                break;
                            }
                            C0768e eVar = (C0768e) ((C0721m) C0776k.this.f2682a.get(i)).get();
                            this.f2684g.add(eVar);
                            eVar.mo3549a(new C0778a(i), C0694a.m3202a());
                            if (eVar.mo3551a()) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }

        /* renamed from: i */
        private synchronized C0768e<T> m3463i() {
            return m3458b(this.f2685h);
        }

        /* renamed from: j */
        private void m3464j() {
            if (this.f2687j.incrementAndGet() == this.f2686i) {
                Throwable th = this.f2688k;
                if (th != null) {
                    mo3554a(th);
                }
            }
        }

        /* renamed from: a */
        public synchronized boolean mo3551a() {
            C0768e i;
            if (C0776k.this.f2683b) {
                m3462h();
            }
            i = m3463i();
            return i != null && i.mo3551a();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
            if (r0 == null) goto L_0x002f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
            if (r1 >= r0.size()) goto L_0x002f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
            m3456a((p032c.p033a.p051d.C0768e) r0.get(r1));
            r1 = r1 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
            return true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean close() {
            /*
                r3 = this;
                c.a.d.k r0 = p032c.p033a.p051d.C0776k.this
                boolean r0 = r0.f2683b
                if (r0 == 0) goto L_0x000b
                r3.m3462h()
            L_0x000b:
                monitor-enter(r3)
                boolean r0 = super.close()     // Catch:{ all -> 0x0031 }
                r1 = 0
                if (r0 != 0) goto L_0x0015
                monitor-exit(r3)     // Catch:{ all -> 0x0031 }
                return r1
            L_0x0015:
                java.util.ArrayList<c.a.d.e<T>> r0 = r3.f2684g     // Catch:{ all -> 0x0031 }
                r2 = 0
                r3.f2684g = r2     // Catch:{ all -> 0x0031 }
                monitor-exit(r3)     // Catch:{ all -> 0x0031 }
                if (r0 == 0) goto L_0x002f
            L_0x001d:
                int r2 = r0.size()
                if (r1 >= r2) goto L_0x002f
                java.lang.Object r2 = r0.get(r1)
                c.a.d.e r2 = (p032c.p033a.p051d.C0768e) r2
                r3.m3456a(r2)
                int r1 = r1 + 1
                goto L_0x001d
            L_0x002f:
                r0 = 1
                return r0
            L_0x0031:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0031 }
                throw r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p032c.p033a.p051d.C0776k.C0777a.close():boolean");
        }

        public synchronized T getResult() {
            C0768e i;
            if (C0776k.this.f2683b) {
                m3462h();
            }
            i = m3463i();
            return i != null ? i.getResult() : null;
        }
    }

    private C0776k(List<C0721m<C0768e<T>>> list, boolean z) {
        C0718j.m3244a(!list.isEmpty(), (Object) "List of suppliers is empty!");
        this.f2682a = list;
        this.f2683b = z;
    }

    /* renamed from: a */
    public static <T> C0776k<T> m3450a(List<C0721m<C0768e<T>>> list, boolean z) {
        return new C0776k<>(list, z);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0776k)) {
            return false;
        }
        return C0715i.m3232a(this.f2682a, ((C0776k) obj).f2682a);
    }

    public C0768e<T> get() {
        return new C0777a();
    }

    public int hashCode() {
        return this.f2682a.hashCode();
    }

    public String toString() {
        C0716a a = C0715i.m3230a((Object) this);
        a.mo3471a("list", (Object) this.f2682a);
        return a.toString();
    }
}
