package p032c.p033a.p074i.p090n;

import java.util.Map;
import p032c.p033a.p035b.p036a.C0657d;
import p032c.p033a.p038c.p042d.C0712f;
import p032c.p033a.p038c.p046h.C0744b;
import p032c.p033a.p074i.p080d.C0902A;
import p032c.p033a.p074i.p080d.C0921m;
import p032c.p033a.p074i.p086j.C0986b;
import p032c.p033a.p074i.p091o.C1114c.C1116b;

/* renamed from: c.a.i.n.j */
public class C1068j implements C1082na<C0744b<C0986b>> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C0902A<C0657d, C0986b> f3630a;

    /* renamed from: b */
    private final C0921m f3631b;

    /* renamed from: c */
    private final C1082na<C0744b<C0986b>> f3632c;

    public C1068j(C0902A<C0657d, C0986b> a, C0921m mVar, C1082na<C0744b<C0986b>> naVar) {
        this.f3630a = a;
        this.f3631b = mVar;
        this.f3632c = naVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1081n<C0744b<C0986b>> mo4330a(C1081n<C0744b<C0986b>> nVar, C0657d dVar, boolean z) {
        return new C1066i(this, nVar, dVar, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo4331a() {
        return "BitmapMemoryCacheProducer";
    }

    /* renamed from: a */
    public void mo4248a(C1081n<C0744b<C0986b>> nVar, C1084oa oaVar) {
        C1091qa e = oaVar.mo4324e();
        String id = oaVar.getId();
        e.mo4232a(id, mo4331a());
        C0657d a = this.f3631b.mo4018a(oaVar.mo4322c(), oaVar.mo4316a());
        C0744b bVar = this.f3630a.get(a);
        String str = "cached_value_found";
        Map map = null;
        if (bVar != null) {
            boolean a2 = ((C0986b) bVar.mo3520n()).mo4195o().mo4227a();
            if (a2) {
                e.mo4237b(id, mo4331a(), e.mo4236a(id) ? C0712f.m3226a(str, "true") : null);
                e.mo3595a(id, mo4331a(), true);
                nVar.mo4308a(1.0f);
            }
            C1051c.m4686a(a2);
            nVar.mo4310a(bVar, a2 ? 1 : 0);
            bVar.close();
            if (a2) {
                return;
            }
        }
        String str2 = "false";
        if (oaVar.mo4326g().mo4377a() >= C1116b.BITMAP_MEMORY_CACHE.mo4377a()) {
            e.mo4237b(id, mo4331a(), e.mo4236a(id) ? C0712f.m3226a(str, str2) : null);
            e.mo3595a(id, mo4331a(), false);
            nVar.mo4310a(null, 1);
            return;
        }
        C1081n a3 = mo4330a(nVar, a, oaVar.mo4322c().mo4375r());
        String a4 = mo4331a();
        if (e.mo4236a(id)) {
            map = C0712f.m3226a(str, str2);
        }
        e.mo4237b(id, a4, map);
        this.f3632c.mo4248a(a3, oaVar);
    }
}
