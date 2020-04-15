package p032c.p033a.p074i.p090n;

import android.graphics.Bitmap;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p046h.C0744b;
import p032c.p033a.p074i.p086j.C0986b;
import p032c.p033a.p074i.p086j.C0987c;

/* renamed from: c.a.i.n.k */
public class C1070k implements C1082na<C0744b<C0986b>> {

    /* renamed from: a */
    private final C1082na<C0744b<C0986b>> f3635a;

    /* renamed from: b */
    private final int f3636b;

    /* renamed from: c */
    private final int f3637c;

    /* renamed from: d */
    private final boolean f3638d;

    /* renamed from: c.a.i.n.k$a */
    private static class C1071a extends C1094s<C0744b<C0986b>, C0744b<C0986b>> {

        /* renamed from: c */
        private final int f3639c;

        /* renamed from: d */
        private final int f3640d;

        C1071a(C1081n<C0744b<C0986b>> nVar, int i, int i2) {
            super(nVar);
            this.f3639c = i;
            this.f3640d = i2;
        }

        /* renamed from: a */
        private void m4779a(C0744b<C0986b> bVar) {
            if (bVar != null && bVar.mo3522p()) {
                C0986b bVar2 = (C0986b) bVar.mo3520n();
                if (bVar2 != null && !bVar2.isClosed() && (bVar2 instanceof C0987c)) {
                    Bitmap t = ((C0987c) bVar2).mo4202t();
                    if (t != null) {
                        int rowBytes = t.getRowBytes() * t.getHeight();
                        if (rowBytes >= this.f3639c && rowBytes <= this.f3640d) {
                            t.prepareToDraw();
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo4172b(C0744b<C0986b> bVar, int i) {
            m4779a(bVar);
            mo4347c().mo4310a(bVar, i);
        }
    }

    public C1070k(C1082na<C0744b<C0986b>> naVar, int i, int i2, boolean z) {
        C0718j.m3243a(i <= i2);
        C0718j.m3240a(naVar);
        this.f3635a = naVar;
        this.f3636b = i;
        this.f3637c = i2;
        this.f3638d = z;
    }

    /* renamed from: a */
    public void mo4248a(C1081n<C0744b<C0986b>> nVar, C1084oa oaVar) {
        if (!oaVar.mo4323d() || this.f3638d) {
            this.f3635a.mo4248a(new C1071a(nVar, this.f3636b, this.f3637c), oaVar);
        } else {
            this.f3635a.mo4248a(nVar, oaVar);
        }
    }
}
