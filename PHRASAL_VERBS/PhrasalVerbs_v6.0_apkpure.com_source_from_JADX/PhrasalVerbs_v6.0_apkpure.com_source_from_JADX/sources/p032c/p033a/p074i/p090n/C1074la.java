package p032c.p033a.p074i.p090n;

import java.util.Map;
import java.util.concurrent.Executor;
import p032c.p033a.p038c.p042d.C0712f;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p046h.C0744b;
import p032c.p033a.p074i.p079c.C0900f;
import p032c.p033a.p074i.p086j.C0986b;
import p032c.p033a.p074i.p086j.C0987c;
import p032c.p033a.p074i.p091o.C1119e;
import p032c.p033a.p074i.p091o.C1120f;
import p032c.p033a.p074i.p091o.C1121g;

/* renamed from: c.a.i.n.la */
public class C1074la implements C1082na<C0744b<C0986b>> {

    /* renamed from: a */
    private final C1082na<C0744b<C0986b>> f3642a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C0900f f3643b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Executor f3644c;

    /* renamed from: c.a.i.n.la$a */
    private class C1075a extends C1094s<C0744b<C0986b>, C0744b<C0986b>> {

        /* renamed from: c */
        private final C1091qa f3645c;

        /* renamed from: d */
        private final String f3646d;

        /* renamed from: e */
        private final C1119e f3647e;

        /* renamed from: f */
        private boolean f3648f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public C0744b<C0986b> f3649g = null;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f3650h = 0;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public boolean f3651i = false;

        /* renamed from: j */
        private boolean f3652j = false;

        public C1075a(C1081n<C0744b<C0986b>> nVar, C1091qa qaVar, String str, C1119e eVar, C1084oa oaVar) {
            super(nVar);
            this.f3645c = qaVar;
            this.f3646d = str;
            this.f3647e = eVar;
            oaVar.mo4319a(new C1069ja(this, C1074la.this));
        }

        /* renamed from: a */
        private C0744b<C0986b> m4785a(C0986b bVar) {
            C0987c cVar = (C0987c) bVar;
            C0744b a = this.f3647e.mo4353a(cVar.mo4202t(), C1074la.this.f3643b);
            try {
                return C0744b.m3334a(new C0987c(a, bVar.mo4195o(), cVar.mo4201s(), cVar.mo4200r()));
            } finally {
                C0744b.m3336b(a);
            }
        }

        /* renamed from: a */
        private Map<String, String> m4787a(C1091qa qaVar, String str, C1119e eVar) {
            if (!qaVar.mo4236a(str)) {
                return null;
            }
            return C0712f.m3226a("Postprocessor", eVar.getName());
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m4792b(C0744b<C0986b> bVar, int i) {
            C0718j.m3243a(C0744b.m3337c(bVar));
            if (!m4793b((C0986b) bVar.mo3520n())) {
                m4795c(bVar, i);
                return;
            }
            String str = "PostprocessorProducer";
            this.f3645c.mo4232a(this.f3646d, str);
            C0744b bVar2 = null;
            try {
                bVar2 = m4785a((C0986b) bVar.mo3520n());
                this.f3645c.mo4237b(this.f3646d, str, m4787a(this.f3645c, this.f3646d, this.f3647e));
                m4795c(bVar2, i);
            } catch (Exception e) {
                this.f3645c.mo4234a(this.f3646d, str, e, m4787a(this.f3645c, this.f3646d, this.f3647e));
                m4796c((Throwable) e);
            } finally {
                C0744b.m3336b(bVar2);
            }
        }

        /* renamed from: b */
        private boolean m4793b(C0986b bVar) {
            return bVar instanceof C0987c;
        }

        /* renamed from: c */
        private void m4795c(C0744b<C0986b> bVar, int i) {
            boolean a = C1051c.m4687a(i);
            if ((!a && !m4801f()) || (a && m4800e())) {
                mo4347c().mo4310a(bVar, i);
            }
        }

        /* renamed from: c */
        private void m4796c(Throwable th) {
            if (m4800e()) {
                mo4347c().mo4311a(th);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void m4797d() {
            boolean h;
            synchronized (this) {
                this.f3652j = false;
                h = m4803h();
            }
            if (h) {
                m4804i();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
            m4804i();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
            p032c.p033a.p038c.p046h.C0744b.m3336b(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
            if (r2 == false) goto L_0x0021;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m4798d(p032c.p033a.p038c.p046h.C0744b<p032c.p033a.p074i.p086j.C0986b> r2, int r3) {
            /*
                r1 = this;
                monitor-enter(r1)
                boolean r0 = r1.f3648f     // Catch:{ all -> 0x0022 }
                if (r0 == 0) goto L_0x0007
                monitor-exit(r1)     // Catch:{ all -> 0x0022 }
                return
            L_0x0007:
                c.a.c.h.b<c.a.i.j.b> r0 = r1.f3649g     // Catch:{ all -> 0x0022 }
                c.a.c.h.b r2 = p032c.p033a.p038c.p046h.C0744b.m3333a(r2)     // Catch:{ all -> 0x0022 }
                r1.f3649g = r2     // Catch:{ all -> 0x0022 }
                r1.f3650h = r3     // Catch:{ all -> 0x0022 }
                r2 = 1
                r1.f3651i = r2     // Catch:{ all -> 0x0022 }
                boolean r2 = r1.m4803h()     // Catch:{ all -> 0x0022 }
                monitor-exit(r1)     // Catch:{ all -> 0x0022 }
                p032c.p033a.p038c.p046h.C0744b.m3336b(r0)
                if (r2 == 0) goto L_0x0021
                r1.m4804i()
            L_0x0021:
                return
            L_0x0022:
                r2 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0022 }
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p032c.p033a.p074i.p090n.C1074la.C1075a.m4798d(c.a.c.h.b, int):void");
        }

        /* renamed from: e */
        private boolean m4800e() {
            synchronized (this) {
                if (this.f3648f) {
                    return false;
                }
                C0744b<C0986b> bVar = this.f3649g;
                this.f3649g = null;
                this.f3648f = true;
                C0744b.m3336b(bVar);
                return true;
            }
        }

        /* renamed from: f */
        private synchronized boolean m4801f() {
            return this.f3648f;
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public void m4802g() {
            if (m4800e()) {
                mo4347c().mo4307a();
            }
        }

        /* renamed from: h */
        private synchronized boolean m4803h() {
            if (this.f3648f || !this.f3651i || this.f3652j || !C0744b.m3337c(this.f3649g)) {
                return false;
            }
            this.f3652j = true;
            return true;
        }

        /* renamed from: i */
        private void m4804i() {
            C1074la.this.f3644c.execute(new C1072ka(this));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo4172b(C0744b<C0986b> bVar, int i) {
            if (!C0744b.m3337c(bVar)) {
                if (C1051c.m4687a(i)) {
                    m4795c(null, i);
                }
                return;
            }
            m4798d(bVar, i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo4170b() {
            m4802g();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo4173b(Throwable th) {
            m4796c(th);
        }
    }

    /* renamed from: c.a.i.n.la$b */
    class C1076b extends C1094s<C0744b<C0986b>, C0744b<C0986b>> implements C1121g {

        /* renamed from: c */
        private boolean f3654c;

        /* renamed from: d */
        private C0744b<C0986b> f3655d;

        private C1076b(C1075a aVar, C1120f fVar, C1084oa oaVar) {
            super(aVar);
            this.f3654c = false;
            this.f3655d = null;
            fVar.mo4407a(this);
            oaVar.mo4319a(new C1080ma(this, C1074la.this));
        }

        /* renamed from: a */
        private void m4809a(C0744b<C0986b> bVar) {
            synchronized (this) {
                if (!this.f3654c) {
                    C0744b<C0986b> bVar2 = this.f3655d;
                    this.f3655d = C0744b.m3333a(bVar);
                    C0744b.m3336b(bVar2);
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public boolean m4811d() {
            synchronized (this) {
                if (this.f3654c) {
                    return false;
                }
                C0744b<C0986b> bVar = this.f3655d;
                this.f3655d = null;
                this.f3654c = true;
                C0744b.m3336b(bVar);
                return true;
            }
        }

        /* renamed from: e */
        private void m4812e() {
            synchronized (this) {
                if (!this.f3654c) {
                    C0744b a = C0744b.m3333a(this.f3655d);
                    try {
                        mo4347c().mo4310a(a, 0);
                    } finally {
                        C0744b.m3336b(a);
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo4172b(C0744b<C0986b> bVar, int i) {
            if (!C1051c.m4689b(i)) {
                m4809a(bVar);
                m4812e();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo4170b() {
            if (m4811d()) {
                mo4347c().mo4307a();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo4173b(Throwable th) {
            if (m4811d()) {
                mo4347c().mo4311a(th);
            }
        }
    }

    /* renamed from: c.a.i.n.la$c */
    class C1077c extends C1094s<C0744b<C0986b>, C0744b<C0986b>> {
        private C1077c(C1075a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo4172b(C0744b<C0986b> bVar, int i) {
            if (!C1051c.m4689b(i)) {
                mo4347c().mo4310a(bVar, i);
            }
        }
    }

    public C1074la(C1082na<C0744b<C0986b>> naVar, C0900f fVar, Executor executor) {
        C0718j.m3240a(naVar);
        this.f3642a = naVar;
        this.f3643b = fVar;
        C0718j.m3240a(executor);
        this.f3644c = executor;
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [c.a.i.n.la$c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4248a(p032c.p033a.p074i.p090n.C1081n<p032c.p033a.p038c.p046h.C0744b<p032c.p033a.p074i.p086j.C0986b>> r10, p032c.p033a.p074i.p090n.C1084oa r11) {
        /*
            r9 = this;
            c.a.i.n.qa r3 = r11.mo4324e()
            c.a.i.o.c r0 = r11.mo4322c()
            c.a.i.o.e r7 = r0.mo4362f()
            c.a.i.n.la$a r8 = new c.a.i.n.la$a
            java.lang.String r4 = r11.getId()
            r0 = r8
            r1 = r9
            r2 = r10
            r5 = r7
            r6 = r11
            r0.<init>(r2, r3, r4, r5, r6)
            boolean r0 = r7 instanceof p032c.p033a.p074i.p091o.C1120f
            if (r0 == 0) goto L_0x002c
            c.a.i.n.la$b r6 = new c.a.i.n.la$b
            r3 = r7
            c.a.i.o.f r3 = (p032c.p033a.p074i.p091o.C1120f) r3
            r5 = 0
            r0 = r6
            r1 = r9
            r2 = r8
            r4 = r11
            r0.<init>(r2, r3, r4)
            goto L_0x0032
        L_0x002c:
            c.a.i.n.la$c r6 = new c.a.i.n.la$c
            r0 = 0
            r6.<init>(r8)
        L_0x0032:
            c.a.i.n.na<c.a.c.h.b<c.a.i.j.b>> r0 = r9.f3642a
            r0.mo4248a(r6, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p032c.p033a.p074i.p090n.C1074la.mo4248a(c.a.i.n.n, c.a.i.n.oa):void");
    }
}
