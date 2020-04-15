package p032c.p033a.p074i.p090n;

import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import p031b.C0640f;
import p031b.C0645k;
import p032c.p033a.p035b.p036a.C0657d;
import p032c.p033a.p038c.p042d.C0712f;
import p032c.p033a.p074i.p080d.C0920l;
import p032c.p033a.p074i.p080d.C0921m;
import p032c.p033a.p074i.p086j.C0988d;
import p032c.p033a.p074i.p091o.C1114c;
import p032c.p033a.p074i.p091o.C1114c.C1115a;
import p032c.p033a.p074i.p091o.C1114c.C1116b;

/* renamed from: c.a.i.n.v */
public class C1101v implements C1082na<C0988d> {

    /* renamed from: a */
    private final C0920l f3714a;

    /* renamed from: b */
    private final C0920l f3715b;

    /* renamed from: c */
    private final C0921m f3716c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1082na<C0988d> f3717d;

    public C1101v(C0920l lVar, C0920l lVar2, C0921m mVar, C1082na<C0988d> naVar) {
        this.f3714a = lVar;
        this.f3715b = lVar2;
        this.f3716c = mVar;
        this.f3717d = naVar;
    }

    /* renamed from: a */
    static Map<String, String> m4929a(C1091qa qaVar, String str, boolean z, int i) {
        if (!qaVar.mo4236a(str)) {
            return null;
        }
        String str2 = "cached_value_found";
        if (!z) {
            return C0712f.m3226a(str2, String.valueOf(z));
        }
        return C0712f.m3227a(str2, String.valueOf(z), "encodedImageSize", String.valueOf(i));
    }

    /* renamed from: a */
    private void m4930a(AtomicBoolean atomicBoolean, C1084oa oaVar) {
        oaVar.mo4319a(new C1098u(this, atomicBoolean));
    }

    /* renamed from: b */
    private void m4932b(C1081n<C0988d> nVar, C1084oa oaVar) {
        if (oaVar.mo4326g().mo4377a() >= C1116b.DISK_CACHE.mo4377a()) {
            nVar.mo4310a(null, 1);
        } else {
            this.f3717d.mo4248a(nVar, oaVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m4933b(C0645k<?> kVar) {
        return kVar.mo3324d() || (kVar.mo3326f() && (kVar.mo3320a() instanceof CancellationException));
    }

    /* renamed from: c */
    private C0640f<C0988d, Void> m4934c(C1081n<C0988d> nVar, C1084oa oaVar) {
        C1096t tVar = new C1096t(this, oaVar.mo4324e(), oaVar.getId(), nVar, oaVar);
        return tVar;
    }

    /* renamed from: a */
    public void mo4248a(C1081n<C0988d> nVar, C1084oa oaVar) {
        C1114c c = oaVar.mo4322c();
        if (!c.mo4374q()) {
            m4932b(nVar, oaVar);
            return;
        }
        oaVar.mo4324e().mo4232a(oaVar.getId(), "DiskCacheProducer");
        C0657d c2 = this.f3716c.mo4020c(c, oaVar.mo4316a());
        C0920l lVar = c.mo4357b() == C1115a.SMALL ? this.f3715b : this.f3714a;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        lVar.mo4011a(c2, atomicBoolean).mo3318a(m4934c(nVar, oaVar));
        m4930a(atomicBoolean, oaVar);
    }
}
