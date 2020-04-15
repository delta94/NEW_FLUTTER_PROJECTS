package p000a.p005b.p009c.p016e;

import android.os.Handler;
import p000a.p005b.p009c.p010a.p011a.C0052h.C0053a;
import p000a.p005b.p009c.p016e.C0092k.C0093a;

/* renamed from: a.b.c.e.c */
class C0081c implements C0093a<C0087c> {

    /* renamed from: a */
    final /* synthetic */ C0053a f178a;

    /* renamed from: b */
    final /* synthetic */ Handler f179b;

    C0081c(C0053a aVar, Handler handler) {
        this.f178a = aVar;
        this.f179b = handler;
    }

    /* renamed from: a */
    public void mo273a(C0087c cVar) {
        int i;
        C0053a aVar;
        if (cVar == null) {
            aVar = this.f178a;
            i = 1;
        } else {
            i = cVar.f194b;
            if (i == 0) {
                this.f178a.mo204a(cVar.f193a, this.f179b);
                return;
            }
            aVar = this.f178a;
        }
        aVar.mo202a(i, this.f179b);
    }
}
