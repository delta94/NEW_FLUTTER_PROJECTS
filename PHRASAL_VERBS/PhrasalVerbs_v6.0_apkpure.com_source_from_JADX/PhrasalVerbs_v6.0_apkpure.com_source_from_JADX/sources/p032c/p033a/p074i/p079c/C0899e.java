package p032c.p033a.p074i.p079c;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p038c.p045g.C0737g;
import p032c.p033a.p038c.p046h.C0744b;
import p032c.p033a.p073h.C0882b;
import p032c.p033a.p074i.p086j.C0988d;
import p032c.p033a.p074i.p088l.C0999e;

@TargetApi(11)
/* renamed from: c.a.i.c.e */
public class C0899e extends C0900f {

    /* renamed from: a */
    private static final String f3152a = "e";

    /* renamed from: b */
    private final C0896b f3153b;

    /* renamed from: c */
    private final C0999e f3154c;

    /* renamed from: d */
    private boolean f3155d;

    public C0899e(C0896b bVar, C0999e eVar) {
        this.f3153b = bVar;
        this.f3154c = eVar;
    }

    /* renamed from: c */
    private static C0744b<Bitmap> m3984c(int i, int i2, Config config) {
        return C0744b.m3335a(Bitmap.createBitmap(i, i2, config), C0901g.m3990a());
    }

    @TargetApi(12)
    /* renamed from: b */
    public C0744b<Bitmap> mo3969b(int i, int i2, Config config) {
        C0988d dVar;
        if (this.f3155d) {
            return m3984c(i, i2, config);
        }
        C0744b a = this.f3153b.mo3970a((short) i, (short) i2);
        try {
            dVar = new C0988d(a);
            dVar.mo4203a(C0882b.f3116a);
            C0744b<Bitmap> a2 = this.f3154c.mo4240a(dVar, config, null, ((C0737g) a.mo3520n()).size());
            if (!((Bitmap) a2.mo3520n()).isMutable()) {
                C0744b.m3336b(a2);
                this.f3155d = true;
                C0727a.m3286e(f3152a, "Immutable bitmap returned by decoder");
                C0744b<Bitmap> c = m3984c(i, i2, config);
                C0988d.m4406b(dVar);
                a.close();
                return c;
            }
            ((Bitmap) a2.mo3520n()).setHasAlpha(true);
            ((Bitmap) a2.mo3520n()).eraseColor(0);
            C0988d.m4406b(dVar);
            a.close();
            return a2;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }
}
