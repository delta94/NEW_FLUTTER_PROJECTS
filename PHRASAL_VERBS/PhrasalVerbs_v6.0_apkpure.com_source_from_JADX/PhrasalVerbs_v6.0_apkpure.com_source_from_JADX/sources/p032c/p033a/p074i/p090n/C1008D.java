package p032c.p033a.p074i.p090n;

import java.util.concurrent.Future;
import p032c.p033a.p074i.p090n.C1054da.C1055a;

/* renamed from: c.a.i.n.D */
class C1008D extends C1058f {

    /* renamed from: a */
    final /* synthetic */ Future f3493a;

    /* renamed from: b */
    final /* synthetic */ C1055a f3494b;

    /* renamed from: c */
    final /* synthetic */ C1010E f3495c;

    C1008D(C1010E e, Future future, C1055a aVar) {
        this.f3495c = e;
        this.f3493a = future;
        this.f3494b = aVar;
    }

    /* renamed from: a */
    public void mo3958a() {
        if (this.f3493a.cancel(false)) {
            this.f3494b.mo4304a();
        }
    }
}
