package p032c.p033a.p059g.p060a.p061a;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import p032c.p033a.p059g.p068e.C0835k;
import p032c.p033a.p074i.p085i.C0984a;
import p032c.p033a.p074i.p086j.C0986b;
import p032c.p033a.p074i.p086j.C0987c;

/* renamed from: c.a.g.a.a.a */
public class C0786a implements C0984a {

    /* renamed from: a */
    private final Resources f2706a;

    /* renamed from: b */
    private final C0984a f2707b;

    public C0786a(Resources resources, C0984a aVar) {
        this.f2706a = resources;
        this.f2707b = aVar;
    }

    /* renamed from: a */
    private static boolean m3480a(C0987c cVar) {
        return (cVar.mo4200r() == 1 || cVar.mo4200r() == 0) ? false : true;
    }

    /* renamed from: b */
    private static boolean m3481b(C0987c cVar) {
        return (cVar.mo4201s() == 0 || cVar.mo4201s() == -1) ? false : true;
    }

    /* renamed from: a */
    public boolean mo3579a(C0986b bVar) {
        return true;
    }

    /* renamed from: b */
    public Drawable mo3580b(C0986b bVar) {
        if (bVar instanceof C0987c) {
            C0987c cVar = (C0987c) bVar;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f2706a, cVar.mo4202t());
            return (m3481b(cVar) || m3480a(cVar)) ? new C0835k(bitmapDrawable, cVar.mo4201s(), cVar.mo4200r()) : bitmapDrawable;
        }
        C0984a aVar = this.f2707b;
        if (aVar == null || !aVar.mo3579a(bVar)) {
            return null;
        }
        return this.f2707b.mo3580b(bVar);
    }
}
