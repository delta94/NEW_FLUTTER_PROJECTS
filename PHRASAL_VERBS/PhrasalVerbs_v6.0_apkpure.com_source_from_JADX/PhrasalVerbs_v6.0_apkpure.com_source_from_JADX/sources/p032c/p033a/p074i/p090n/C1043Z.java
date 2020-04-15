package p032c.p033a.p074i.p090n;

import android.util.Pair;
import java.util.List;

/* renamed from: c.a.i.n.Z */
class C1043Z extends C1058f {

    /* renamed from: a */
    final /* synthetic */ Pair f3571a;

    /* renamed from: b */
    final /* synthetic */ C1046a f3572b;

    C1043Z(C1046a aVar, Pair pair) {
        this.f3572b = aVar;
        this.f3571a = pair;
    }

    /* renamed from: a */
    public void mo3958a() {
        boolean remove;
        List list;
        List list2;
        List list3;
        C1056e eVar;
        synchronized (this.f3572b) {
            remove = this.f3572b.f3576b.remove(this.f3571a);
            list = null;
            if (!remove) {
                eVar = null;
                list3 = null;
            } else if (this.f3572b.f3576b.isEmpty()) {
                eVar = this.f3572b.f3580f;
                list3 = null;
            } else {
                List d = this.f3572b.m4667f();
                list3 = this.f3572b.m4669g();
                list2 = this.f3572b.m4665e();
                List list4 = d;
                eVar = null;
                list = list4;
            }
            list2 = list3;
        }
        C1056e.m4726c(list);
        C1056e.m4727d(list3);
        C1056e.m4725b(list2);
        if (eVar != null) {
            eVar.mo4328h();
        }
        if (remove) {
            ((C1081n) this.f3571a.first).mo4307a();
        }
    }

    /* renamed from: b */
    public void mo4292b() {
        C1056e.m4725b(this.f3572b.m4665e());
    }

    /* renamed from: c */
    public void mo4293c() {
        C1056e.m4727d(this.f3572b.m4669g());
    }

    /* renamed from: d */
    public void mo4294d() {
        C1056e.m4726c(this.f3572b.m4667f());
    }
}
