package p032c.p033a.p074i.p084h;

import p032c.p033a.p073h.C0882b;
import p032c.p033a.p073h.C0883c;
import p032c.p033a.p074i.p081e.C0939b;
import p032c.p033a.p074i.p086j.C0986b;
import p032c.p033a.p074i.p086j.C0988d;
import p032c.p033a.p074i.p086j.C0991g;

/* renamed from: c.a.i.h.b */
class C0974b implements C0976d {

    /* renamed from: a */
    final /* synthetic */ C0975c f3426a;

    C0974b(C0975c cVar) {
        this.f3426a = cVar;
    }

    /* renamed from: a */
    public C0986b mo4178a(C0988d dVar, int i, C0991g gVar, C0939b bVar) {
        C0883c r = dVar.mo4219r();
        if (r == C0882b.f3116a) {
            return this.f3426a.mo4182d(dVar, i, gVar, bVar);
        }
        if (r == C0882b.f3118c) {
            return this.f3426a.mo4181c(dVar, i, gVar, bVar);
        }
        if (r == C0882b.f3124i) {
            return this.f3426a.mo4180b(dVar, i, gVar, bVar);
        }
        if (r != C0883c.f3126a) {
            return this.f3426a.mo4179a(dVar, bVar);
        }
        throw new C0973a("unknown image format", dVar);
    }
}
