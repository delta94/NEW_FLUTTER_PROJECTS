package p032c.p033a.p074i.p090n;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import java.util.Map;
import p032c.p033a.p038c.p042d.C0712f;
import p032c.p033a.p038c.p046h.C0744b;
import p032c.p033a.p038c.p046h.C0746d;
import p032c.p033a.p074i.p079c.C0901g;
import p032c.p033a.p074i.p086j.C0986b;
import p032c.p033a.p074i.p086j.C0987c;
import p032c.p033a.p074i.p086j.C0990f;
import p032c.p033a.p074i.p091o.C1114c;

/* renamed from: c.a.i.n.V */
class C1039V extends C1104wa<C0744b<C0986b>> {

    /* renamed from: f */
    final /* synthetic */ C1091qa f3563f;

    /* renamed from: g */
    final /* synthetic */ String f3564g;

    /* renamed from: h */
    final /* synthetic */ C1114c f3565h;

    /* renamed from: i */
    final /* synthetic */ C1041X f3566i;

    C1039V(C1041X x, C1081n nVar, C1091qa qaVar, String str, String str2, C1091qa qaVar2, String str3, C1114c cVar) {
        this.f3566i = x;
        this.f3563f = qaVar2;
        this.f3564g = str3;
        this.f3565h = cVar;
        super(nVar, qaVar, str, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3461a(C0744b<C0986b> bVar) {
        C0744b.m3336b(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3460a(Exception exc) {
        super.mo3460a(exc);
        this.f3563f.mo3595a(this.f3564g, "VideoThumbnailProducer", false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0744b<C0986b> m4631b() {
        String a = this.f3566i.m4640c(this.f3565h);
        if (a == null) {
            return null;
        }
        Bitmap createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(a, C1041X.m4639b(this.f3565h));
        if (createVideoThumbnail == null) {
            return null;
        }
        return C0744b.m3334a(new C0987c(createVideoThumbnail, (C0746d<Bitmap>) C0901g.m3990a(), C0990f.f3456a, 0));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Map<String, String> mo4283c(C0744b<C0986b> bVar) {
        return C0712f.m3226a("createdThumbnail", String.valueOf(bVar != null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo3463b(C0744b<C0986b> bVar) {
        super.mo3463b(bVar);
        this.f3563f.mo3595a(this.f3564g, "VideoThumbnailProducer", bVar != null);
    }
}
