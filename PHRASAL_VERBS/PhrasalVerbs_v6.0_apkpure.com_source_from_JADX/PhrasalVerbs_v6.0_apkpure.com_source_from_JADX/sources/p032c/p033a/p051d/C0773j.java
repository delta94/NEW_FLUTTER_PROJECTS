package p032c.p033a.p051d;

import java.util.List;
import p032c.p033a.p038c.p040b.C0694a;
import p032c.p033a.p038c.p042d.C0715i;
import p032c.p033a.p038c.p042d.C0715i.C0716a;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p042d.C0721m;

/* renamed from: c.a.d.j */
public class C0773j<T> implements C0721m<C0768e<T>> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final List<C0721m<C0768e<T>>> f2676a;

    /* renamed from: c.a.d.j$a */
    private class C0774a extends C0765c<T> {

        /* renamed from: g */
        private int f2677g = 0;

        /* renamed from: h */
        private C0768e<T> f2678h = null;

        /* renamed from: i */
        private C0768e<T> f2679i = null;

        /* renamed from: c.a.d.j$a$a */
        private class C0775a implements C0771h<T> {
            private C0775a() {
            }

            /* renamed from: a */
            public void mo3563a(C0768e<T> eVar) {
            }

            /* renamed from: b */
            public void mo3564b(C0768e<T> eVar) {
                C0774a.this.m3439c(eVar);
            }

            /* renamed from: c */
            public void mo3565c(C0768e<T> eVar) {
                if (eVar.mo3551a()) {
                    C0774a.this.m3440d(eVar);
                } else if (eVar.mo3555b()) {
                    C0774a.this.m3439c(eVar);
                }
            }

            /* renamed from: d */
            public void mo3566d(C0768e<T> eVar) {
                C0774a.this.mo3552a(Math.max(C0774a.this.mo3558d(), eVar.mo3558d()));
            }
        }

        public C0774a() {
            if (!m3444j()) {
                mo3554a((Throwable) new RuntimeException("No data source supplier or supplier returned null."));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0019, code lost:
            m3437b(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m3434a(p032c.p033a.p051d.C0768e<T> r2, boolean r3) {
            /*
                r1 = this;
                monitor-enter(r1)
                c.a.d.e<T> r0 = r1.f2678h     // Catch:{ all -> 0x001f }
                if (r2 != r0) goto L_0x001d
                c.a.d.e<T> r0 = r1.f2679i     // Catch:{ all -> 0x001f }
                if (r2 != r0) goto L_0x000a
                goto L_0x001d
            L_0x000a:
                c.a.d.e<T> r0 = r1.f2679i     // Catch:{ all -> 0x001f }
                if (r0 == 0) goto L_0x0013
                if (r3 == 0) goto L_0x0011
                goto L_0x0013
            L_0x0011:
                r2 = 0
                goto L_0x0018
            L_0x0013:
                c.a.d.e<T> r3 = r1.f2679i     // Catch:{ all -> 0x001f }
                r1.f2679i = r2     // Catch:{ all -> 0x001f }
                r2 = r3
            L_0x0018:
                monitor-exit(r1)     // Catch:{ all -> 0x001f }
                r1.m3437b(r2)
                return
            L_0x001d:
                monitor-exit(r1)     // Catch:{ all -> 0x001f }
                return
            L_0x001f:
                r2 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x001f }
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p032c.p033a.p051d.C0773j.C0774a.m3434a(c.a.d.e, boolean):void");
        }

        /* renamed from: a */
        private synchronized boolean m3436a(C0768e<T> eVar) {
            boolean z;
            if (!mo3560f()) {
                if (eVar == this.f2678h) {
                    this.f2678h = null;
                    z = true;
                }
            }
            z = false;
            return z;
        }

        /* renamed from: b */
        private void m3437b(C0768e<T> eVar) {
            if (eVar != null) {
                eVar.close();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void m3439c(C0768e<T> eVar) {
            if (m3436a(eVar)) {
                if (eVar != m3442h()) {
                    m3437b(eVar);
                }
                if (!m3444j()) {
                    mo3554a(eVar.mo3556c());
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void m3440d(C0768e<T> eVar) {
            m3434a(eVar, eVar.mo3555b());
            if (eVar == m3442h()) {
                mo3553a(null, eVar.mo3555b());
            }
        }

        /* renamed from: e */
        private synchronized boolean m3441e(C0768e<T> eVar) {
            boolean z;
            if (mo3560f()) {
                z = false;
            } else {
                this.f2678h = eVar;
                z = true;
            }
            return z;
        }

        /* renamed from: h */
        private synchronized C0768e<T> m3442h() {
            return this.f2679i;
        }

        /* renamed from: i */
        private synchronized C0721m<C0768e<T>> m3443i() {
            if (mo3560f() || this.f2677g >= C0773j.this.f2676a.size()) {
                return null;
            }
            List a = C0773j.this.f2676a;
            int i = this.f2677g;
            this.f2677g = i + 1;
            return (C0721m) a.get(i);
        }

        /* renamed from: j */
        private boolean m3444j() {
            C0721m i = m3443i();
            C0768e eVar = i != null ? (C0768e) i.get() : null;
            if (!m3441e(eVar) || eVar == null) {
                m3437b(eVar);
                return false;
            }
            eVar.mo3549a(new C0775a(), C0694a.m3202a());
            return true;
        }

        /* renamed from: a */
        public synchronized boolean mo3551a() {
            C0768e h;
            h = m3442h();
            return h != null && h.mo3551a();
        }

        public boolean close() {
            synchronized (this) {
                if (!super.close()) {
                    return false;
                }
                C0768e<T> eVar = this.f2678h;
                this.f2678h = null;
                C0768e<T> eVar2 = this.f2679i;
                this.f2679i = null;
                m3437b(eVar2);
                m3437b(eVar);
                return true;
            }
        }

        public synchronized T getResult() {
            C0768e h;
            h = m3442h();
            return h != null ? h.getResult() : null;
        }
    }

    private C0773j(List<C0721m<C0768e<T>>> list) {
        C0718j.m3244a(!list.isEmpty(), (Object) "List of suppliers is empty!");
        this.f2676a = list;
    }

    /* renamed from: a */
    public static <T> C0773j<T> m3432a(List<C0721m<C0768e<T>>> list) {
        return new C0773j<>(list);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0773j)) {
            return false;
        }
        return C0715i.m3232a(this.f2676a, ((C0773j) obj).f2676a);
    }

    public C0768e<T> get() {
        return new C0774a();
    }

    public int hashCode() {
        return this.f2676a.hashCode();
    }

    public String toString() {
        C0716a a = C0715i.m3230a((Object) this);
        a.mo3471a("list", (Object) this.f2676a);
        return a.toString();
    }
}
