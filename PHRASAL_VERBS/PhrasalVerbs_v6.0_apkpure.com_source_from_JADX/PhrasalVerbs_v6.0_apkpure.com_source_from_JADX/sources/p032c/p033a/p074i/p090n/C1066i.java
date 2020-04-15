package p032c.p033a.p074i.p090n;

import p032c.p033a.p035b.p036a.C0657d;
import p032c.p033a.p038c.p046h.C0744b;
import p032c.p033a.p074i.p086j.C0986b;
import p032c.p033a.p074i.p086j.C0991g;

/* renamed from: c.a.i.n.i */
class C1066i extends C1094s<C0744b<C0986b>, C0744b<C0986b>> {

    /* renamed from: c */
    final /* synthetic */ C0657d f3627c;

    /* renamed from: d */
    final /* synthetic */ boolean f3628d;

    /* renamed from: e */
    final /* synthetic */ C1068j f3629e;

    C1066i(C1068j jVar, C1081n nVar, C0657d dVar, boolean z) {
        this.f3629e = jVar;
        this.f3627c = dVar;
        this.f3628d = z;
        super(nVar);
    }

    /* renamed from: a */
    public void mo4172b(C0744b<C0986b> bVar, int i) {
        boolean a = C1051c.m4687a(i);
        C0744b<C0986b> bVar2 = null;
        if (bVar == null) {
            if (a) {
                mo4347c().mo4310a(null, i);
            }
        } else if (((C0986b) bVar.mo3520n()).mo4197q() || C1051c.m4690b(i, 8)) {
            mo4347c().mo4310a(bVar, i);
        } else {
            if (!a) {
                C0744b bVar3 = this.f3629e.f3630a.get(this.f3627c);
                if (bVar3 != null) {
                    try {
                        C0991g o = ((C0986b) bVar.mo3520n()).mo4195o();
                        C0991g o2 = ((C0986b) bVar3.mo3520n()).mo4195o();
                        if (o2.mo4227a() || o2.mo4229c() >= o.mo4229c()) {
                            mo4347c().mo4310a(bVar3, i);
                            C0744b.m3336b(bVar3);
                            return;
                        }
                    } finally {
                        C0744b.m3336b(bVar3);
                    }
                }
            }
            if (this.f3628d) {
                bVar2 = this.f3629e.f3630a.mo3976a(this.f3627c, bVar);
            }
            if (a) {
                try {
                    mo4347c().mo4308a(1.0f);
                } catch (Throwable th) {
                    C0744b.m3336b(bVar2);
                    throw th;
                }
            }
            C1081n c = mo4347c();
            if (bVar2 != null) {
                bVar = bVar2;
            }
            c.mo4310a(bVar, i);
            C0744b.m3336b(bVar2);
        }
    }
}
