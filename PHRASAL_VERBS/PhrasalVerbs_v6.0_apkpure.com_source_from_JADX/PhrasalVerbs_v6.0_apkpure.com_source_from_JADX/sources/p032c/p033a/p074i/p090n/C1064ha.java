package p032c.p033a.p074i.p090n;

import java.util.Map;
import p032c.p033a.p035b.p036a.C0657d;
import p032c.p033a.p038c.p042d.C0712f;
import p032c.p033a.p038c.p046h.C0744b;
import p032c.p033a.p074i.p080d.C0902A;
import p032c.p033a.p074i.p080d.C0921m;
import p032c.p033a.p074i.p086j.C0986b;
import p032c.p033a.p074i.p091o.C1114c;
import p032c.p033a.p074i.p091o.C1119e;
import p032c.p033a.p074i.p091o.C1120f;

/* renamed from: c.a.i.n.ha */
public class C1064ha implements C1082na<C0744b<C0986b>> {

    /* renamed from: a */
    private final C0902A<C0657d, C0986b> f3620a;

    /* renamed from: b */
    private final C0921m f3621b;

    /* renamed from: c */
    private final C1082na<C0744b<C0986b>> f3622c;

    /* renamed from: c.a.i.n.ha$a */
    public static class C1065a extends C1094s<C0744b<C0986b>, C0744b<C0986b>> {

        /* renamed from: c */
        private final C0657d f3623c;

        /* renamed from: d */
        private final boolean f3624d;

        /* renamed from: e */
        private final C0902A<C0657d, C0986b> f3625e;

        /* renamed from: f */
        private final boolean f3626f;

        public C1065a(C1081n<C0744b<C0986b>> nVar, C0657d dVar, boolean z, C0902A<C0657d, C0986b> a, boolean z2) {
            super(nVar);
            this.f3623c = dVar;
            this.f3624d = z;
            this.f3625e = a;
            this.f3626f = z2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo4172b(C0744b<C0986b> bVar, int i) {
            C0744b<C0986b> bVar2 = null;
            if (bVar == null) {
                if (C1051c.m4687a(i)) {
                    mo4347c().mo4310a(bVar2, i);
                }
            } else if (!C1051c.m4689b(i) || this.f3624d) {
                if (this.f3626f) {
                    bVar2 = this.f3625e.mo3976a(this.f3623c, bVar);
                }
                try {
                    mo4347c().mo4308a(1.0f);
                    C1081n c = mo4347c();
                    if (bVar2 != null) {
                        bVar = bVar2;
                    }
                    c.mo4310a(bVar, i);
                } finally {
                    C0744b.m3336b(bVar2);
                }
            }
        }
    }

    public C1064ha(C0902A<C0657d, C0986b> a, C0921m mVar, C1082na<C0744b<C0986b>> naVar) {
        this.f3620a = a;
        this.f3621b = mVar;
        this.f3622c = naVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo4334a() {
        return "PostprocessedBitmapMemoryCacheProducer";
    }

    /* renamed from: a */
    public void mo4248a(C1081n<C0744b<C0986b>> nVar, C1084oa oaVar) {
        C1091qa e = oaVar.mo4324e();
        String id = oaVar.getId();
        C1114c c = oaVar.mo4322c();
        Object a = oaVar.mo4316a();
        C1119e f = c.mo4362f();
        if (f == null || f.mo4246a() == null) {
            this.f3622c.mo4248a(nVar, oaVar);
            return;
        }
        e.mo4232a(id, mo4334a());
        C0657d b = this.f3621b.mo4019b(c, a);
        C0744b bVar = this.f3620a.get(b);
        String str = "cached_value_found";
        Map map = null;
        if (bVar != null) {
            String a2 = mo4334a();
            if (e.mo4236a(id)) {
                map = C0712f.m3226a(str, "true");
            }
            e.mo4237b(id, a2, map);
            e.mo3595a(id, "PostprocessedBitmapMemoryCacheProducer", true);
            nVar.mo4308a(1.0f);
            nVar.mo4310a(bVar, 1);
            bVar.close();
        } else {
            C1081n<C0744b<C0986b>> nVar2 = nVar;
            C1065a aVar = new C1065a(nVar2, b, f instanceof C1120f, this.f3620a, oaVar.mo4322c().mo4375r());
            String a3 = mo4334a();
            if (e.mo4236a(id)) {
                map = C0712f.m3226a(str, "false");
            }
            e.mo4237b(id, a3, map);
            this.f3622c.mo4248a(aVar, oaVar);
        }
    }
}
