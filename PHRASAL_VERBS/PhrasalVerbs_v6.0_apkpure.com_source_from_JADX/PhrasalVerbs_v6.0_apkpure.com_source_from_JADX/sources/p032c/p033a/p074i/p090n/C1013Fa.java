package p032c.p033a.p074i.p090n;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import p032c.p033a.p038c.p042d.C0718j;

/* renamed from: c.a.i.n.Fa */
public class C1013Fa<T> implements C1082na<T> {

    /* renamed from: a */
    private final C1082na<T> f3501a;

    /* renamed from: b */
    private final int f3502b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f3503c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final ConcurrentLinkedQueue<Pair<C1081n<T>, C1084oa>> f3504d = new ConcurrentLinkedQueue<>();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Executor f3505e;

    /* renamed from: c.a.i.n.Fa$a */
    private class C1014a extends C1094s<T, T> {
        private C1014a(C1081n<T> nVar) {
            super(nVar);
        }

        /* renamed from: d */
        private void m4534d() {
            Pair pair;
            synchronized (C1013Fa.this) {
                pair = (Pair) C1013Fa.this.f3504d.poll();
                if (pair == null) {
                    C1013Fa.this.f3503c = C1013Fa.this.f3503c - 1;
                }
            }
            if (pair != null) {
                C1013Fa.this.f3505e.execute(new C1011Ea(this, pair));
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo4170b() {
            mo4347c().mo4307a();
            m4534d();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo4172b(T t, int i) {
            mo4347c().mo4310a(t, i);
            if (C1051c.m4687a(i)) {
                m4534d();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo4173b(Throwable th) {
            mo4347c().mo4311a(th);
            m4534d();
        }
    }

    public C1013Fa(int i, Executor executor, C1082na<T> naVar) {
        this.f3502b = i;
        C0718j.m3240a(executor);
        this.f3505e = executor;
        C0718j.m3240a(naVar);
        this.f3501a = naVar;
    }

    /* renamed from: a */
    public void mo4248a(C1081n<T> nVar, C1084oa oaVar) {
        boolean z;
        oaVar.mo4324e().mo4232a(oaVar.getId(), "ThrottlingProducer");
        synchronized (this) {
            z = true;
            if (this.f3503c >= this.f3502b) {
                this.f3504d.add(Pair.create(nVar, oaVar));
            } else {
                this.f3503c++;
                z = false;
            }
        }
        if (!z) {
            mo4267b(nVar, oaVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4267b(C1081n<T> nVar, C1084oa oaVar) {
        oaVar.mo4324e().mo4237b(oaVar.getId(), "ThrottlingProducer", null);
        this.f3501a.mo4248a(new C1014a(nVar), oaVar);
    }
}
