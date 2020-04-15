package p032c.p033a.p074i.p090n;

import com.facebook.imagepipeline.nativecode.C1297b;
import com.facebook.imagepipeline.nativecode.C1298c;
import java.io.InputStream;
import java.util.concurrent.Executor;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p045g.C0739h;
import p032c.p033a.p038c.p045g.C0741j;
import p032c.p033a.p038c.p049k.C0757e;
import p032c.p033a.p073h.C0882b;
import p032c.p033a.p073h.C0883c;
import p032c.p033a.p073h.C0885d;
import p032c.p033a.p074i.p086j.C0988d;

/* renamed from: c.a.i.n.Ka */
public class C1028Ka implements C1082na<C0988d> {

    /* renamed from: a */
    private final Executor f3535a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C0739h f3536b;

    /* renamed from: c */
    private final C1082na<C0988d> f3537c;

    /* renamed from: c.a.i.n.Ka$a */
    private class C1029a extends C1094s<C0988d, C0988d> {

        /* renamed from: c */
        private final C1084oa f3538c;

        /* renamed from: d */
        private C0757e f3539d = C0757e.UNSET;

        public C1029a(C1081n<C0988d> nVar, C1084oa oaVar) {
            super(nVar);
            this.f3538c = oaVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo4172b(C0988d dVar, int i) {
            if (this.f3539d == C0757e.UNSET && dVar != null) {
                this.f3539d = C1028Ka.m4583b(dVar);
            }
            if (this.f3539d == C0757e.NO) {
                mo4347c().mo4310a(dVar, i);
                return;
            }
            if (C1051c.m4687a(i)) {
                if (this.f3539d != C0757e.YES || dVar == null) {
                    mo4347c().mo4310a(dVar, i);
                } else {
                    C1028Ka.this.m4581a(dVar, mo4347c(), this.f3538c);
                }
            }
        }
    }

    public C1028Ka(Executor executor, C0739h hVar, C1082na<C0988d> naVar) {
        C0718j.m3240a(executor);
        this.f3535a = executor;
        C0718j.m3240a(hVar);
        this.f3536b = hVar;
        C0718j.m3240a(naVar);
        this.f3537c = naVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4581a(C0988d dVar, C1081n<C0988d> nVar, C1084oa oaVar) {
        C0718j.m3240a(dVar);
        String str = "WebpTranscodeProducer";
        C1081n<C0988d> nVar2 = nVar;
        C1026Ja ja = new C1026Ja(this, nVar2, oaVar.mo4324e(), str, oaVar.getId(), C0988d.m4405a(dVar));
        this.f3535a.execute(ja);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C0757e m4583b(C0988d dVar) {
        C0718j.m3240a(dVar);
        C0883c c = C0885d.m3958c(dVar.mo4220s());
        if (!C0882b.m3949a(c)) {
            return c == C0883c.f3126a ? C0757e.UNSET : C0757e.NO;
        }
        C1297b a = C1298c.m5611a();
        return a == null ? C0757e.NO : C0757e.m3370a(!a.mo4791a(c));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m4584b(C0988d dVar, C0741j jVar) {
        C0883c cVar;
        InputStream s = dVar.mo4220s();
        C0883c c = C0885d.m3958c(s);
        if (c == C0882b.f3120e || c == C0882b.f3122g) {
            C1298c.m5611a().mo4790a(s, jVar, 80);
            cVar = C0882b.f3116a;
        } else if (c == C0882b.f3121f || c == C0882b.f3123h) {
            C1298c.m5611a().mo4789a(s, jVar);
            cVar = C0882b.f3117b;
        } else {
            throw new IllegalArgumentException("Wrong image format");
        }
        dVar.mo4203a(cVar);
    }

    /* renamed from: a */
    public void mo4248a(C1081n<C0988d> nVar, C1084oa oaVar) {
        this.f3537c.mo4248a(new C1029a(nVar, oaVar), oaVar);
    }
}
