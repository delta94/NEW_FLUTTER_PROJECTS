package p032c.p033a.p074i.p090n;

import android.media.ExifInterface;
import java.util.Map;
import p032c.p033a.p038c.p042d.C0712f;
import p032c.p033a.p074i.p086j.C0988d;
import p032c.p033a.p074i.p091o.C1114c;

/* renamed from: c.a.i.n.M */
class C1031M extends C1104wa<C0988d> {

    /* renamed from: f */
    final /* synthetic */ C1114c f3547f;

    /* renamed from: g */
    final /* synthetic */ C1033O f3548g;

    C1031M(C1033O o, C1081n nVar, C1091qa qaVar, String str, String str2, C1114c cVar) {
        this.f3548g = o;
        this.f3547f = cVar;
        super(nVar, qaVar, str, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3461a(C0988d dVar) {
        C0988d.m4406b(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0988d m4599b() {
        ExifInterface a = this.f3548g.mo4284a(this.f3547f.mo4372o());
        if (a == null || !a.hasThumbnail()) {
            return null;
        }
        return this.f3548g.m4605a(this.f3548g.f3552b.mo3500a(a.getThumbnail()), a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Map<String, String> mo4283c(C0988d dVar) {
        return C0712f.m3226a("createdThumbnail", Boolean.toString(dVar != null));
    }
}
