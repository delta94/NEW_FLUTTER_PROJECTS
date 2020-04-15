package p032c.p033a.p059g.p069f;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build.VERSION;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p059g.p068e.C0829e;
import p032c.p033a.p059g.p068e.C0833i;
import p032c.p033a.p059g.p068e.C0836l;
import p032c.p033a.p059g.p068e.C0837m;
import p032c.p033a.p059g.p068e.C0838n;
import p032c.p033a.p059g.p068e.C0840p;
import p032c.p033a.p059g.p068e.C0843r;
import p032c.p033a.p059g.p068e.C0844s;
import p032c.p033a.p059g.p068e.C0845t.C0847b;
import p032c.p033a.p059g.p069f.C0865d.C0866a;

/* renamed from: c.a.g.f.e */
public class C0867e {

    /* renamed from: a */
    private static final Drawable f3079a = new ColorDrawable(0);

    /* renamed from: a */
    static Drawable m3877a(Drawable drawable, C0847b bVar) {
        return m3878a(drawable, bVar, (PointF) null);
    }

    /* renamed from: a */
    static Drawable m3878a(Drawable drawable, C0847b bVar, PointF pointF) {
        if (drawable == null || bVar == null) {
            return drawable;
        }
        C0844s sVar = new C0844s(drawable, bVar);
        if (pointF != null) {
            sVar.mo3829a(pointF);
        }
        return sVar;
    }

    /* renamed from: a */
    static Drawable m3879a(Drawable drawable, C0865d dVar) {
        if (drawable == null || dVar == null || dVar.mo3895g() != C0866a.OVERLAY_COLOR) {
            return drawable;
        }
        C0840p pVar = new C0840p(drawable);
        m3886a((C0836l) pVar, dVar);
        pVar.mo3818a(dVar.mo3891d());
        return pVar;
    }

    /* renamed from: a */
    static Drawable m3880a(Drawable drawable, C0865d dVar, Resources resources) {
        if (!(drawable == null || dVar == null || dVar.mo3895g() != C0866a.BITMAP_ONLY)) {
            if (drawable instanceof C0833i) {
                C0829e a = m3881a((C0829e) (C0833i) drawable);
                a.mo3734a(m3887b(a.mo3734a(f3079a), dVar, resources));
                return drawable;
            }
            drawable = m3887b(drawable, dVar, resources);
        }
        return drawable;
    }

    /* renamed from: a */
    static C0829e m3881a(C0829e eVar) {
        while (true) {
            Drawable a = eVar.mo3733a();
            if (a == eVar || !(a instanceof C0829e)) {
                return eVar;
            }
            eVar = (C0829e) a;
        }
        return eVar;
    }

    /* renamed from: a */
    static C0844s m3882a(C0829e eVar, C0847b bVar) {
        Drawable a = m3877a(eVar.mo3734a(f3079a), bVar);
        eVar.mo3734a(a);
        C0718j.m3241a(a, (Object) "Parent has no child drawable!");
        return (C0844s) a;
    }

    /* renamed from: a */
    static void m3883a(C0829e eVar, C0865d dVar) {
        Drawable a = eVar.mo3733a();
        if (dVar == null || dVar.mo3895g() != C0866a.OVERLAY_COLOR) {
            if (a instanceof C0840p) {
                eVar.mo3734a(((C0840p) a).mo3778b(f3079a));
                f3079a.setCallback(null);
            }
        } else if (a instanceof C0840p) {
            C0840p pVar = (C0840p) a;
            m3886a((C0836l) pVar, dVar);
            pVar.mo3818a(dVar.mo3891d());
        } else {
            eVar.mo3734a(m3879a(eVar.mo3734a(f3079a), dVar));
        }
    }

    /* renamed from: a */
    static void m3884a(C0829e eVar, C0865d dVar, Resources resources) {
        C0829e a = m3881a(eVar);
        Drawable a2 = a.mo3733a();
        if (dVar == null || dVar.mo3895g() != C0866a.BITMAP_ONLY) {
            if (a2 instanceof C0836l) {
                m3885a((C0836l) a2);
            }
        } else if (a2 instanceof C0836l) {
            m3886a((C0836l) a2, dVar);
        } else if (a2 != null) {
            a.mo3734a(f3079a);
            a.mo3734a(m3887b(a2, dVar, resources));
        }
    }

    /* renamed from: a */
    static void m3885a(C0836l lVar) {
        lVar.mo3803a(false);
        lVar.mo3805b(0.0f);
        lVar.mo3802a(0, 0.0f);
        lVar.mo3801a(0.0f);
        lVar.mo3806b(false);
    }

    /* renamed from: a */
    static void m3886a(C0836l lVar, C0865d dVar) {
        lVar.mo3803a(dVar.mo3894f());
        lVar.mo3804a(dVar.mo3890c());
        lVar.mo3802a(dVar.mo3883a(), dVar.mo3888b());
        lVar.mo3801a(dVar.mo3892e());
        lVar.mo3806b(dVar.mo3896h());
    }

    /* renamed from: b */
    private static Drawable m3887b(Drawable drawable, C0865d dVar, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            C0837m mVar = new C0837m(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint());
            m3886a((C0836l) mVar, dVar);
            return mVar;
        } else if (drawable instanceof NinePatchDrawable) {
            C0843r rVar = new C0843r((NinePatchDrawable) drawable);
            m3886a((C0836l) rVar, dVar);
            return rVar;
        } else if (!(drawable instanceof ColorDrawable) || VERSION.SDK_INT < 11) {
            C0727a.m3283c("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        } else {
            C0838n a = C0838n.m3761a((ColorDrawable) drawable);
            m3886a((C0836l) a, dVar);
            return a;
        }
    }
}
