package p000a.p005b.p009c.p012b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.Handler;
import android.support.p029v4.util.C0327i;
import p000a.p005b.p009c.p010a.p011a.C0042c.C0043a;
import p000a.p005b.p009c.p010a.p011a.C0042c.C0044b;
import p000a.p005b.p009c.p010a.p011a.C0042c.C0046d;
import p000a.p005b.p009c.p010a.p011a.C0052h.C0053a;
import p000a.p005b.p009c.p016e.C0084f;
import p000a.p005b.p009c.p016e.C0084f.C0086b;

/* renamed from: a.b.c.b.c */
public class C0065c {

    /* renamed from: a */
    private static final C0072j f153a;

    /* renamed from: b */
    private static final C0327i<String, Typeface> f154b = new C0327i<>(16);

    static {
        int i = VERSION.SDK_INT;
        C0072j jVar = i >= 28 ? new C0069g() : i >= 26 ? new C0068f() : (i < 24 || !C0067e.m218a()) ? VERSION.SDK_INT >= 21 ? new C0066d() : new C0072j() : new C0067e();
        f153a = jVar;
    }

    /* renamed from: a */
    public static Typeface m210a(Context context, C0043a aVar, Resources resources, int i, int i2, C0053a aVar2, Handler handler, boolean z) {
        Typeface typeface;
        if (aVar instanceof C0046d) {
            C0046d dVar = (C0046d) aVar;
            boolean z2 = false;
            if (!z ? aVar2 == null : dVar.mo196a() == 0) {
                z2 = true;
            }
            typeface = C0084f.m283a(context, dVar.mo197b(), aVar2, handler, z2, z ? dVar.mo198c() : -1, i2);
        } else {
            typeface = f153a.mo223a(context, (C0044b) aVar, resources, i2);
            if (aVar2 != null) {
                if (typeface != null) {
                    aVar2.mo204a(typeface, handler);
                } else {
                    aVar2.mo202a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            f154b.mo1362a(m214b(resources, i, i2), typeface);
        }
        return typeface;
    }

    /* renamed from: a */
    public static Typeface m211a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a = f153a.mo224a(context, resources, i, str, i2);
        if (a != null) {
            f154b.mo1362a(m214b(resources, i, i2), a);
        }
        return a;
    }

    /* renamed from: a */
    public static Typeface m212a(Context context, CancellationSignal cancellationSignal, C0086b[] bVarArr, int i) {
        return f153a.mo222a(context, cancellationSignal, bVarArr, i);
    }

    /* renamed from: a */
    public static Typeface m213a(Resources resources, int i, int i2) {
        return (Typeface) f154b.mo1366b(m214b(resources, i, i2));
    }

    /* renamed from: b */
    private static String m214b(Resources resources, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(resources.getResourcePackageName(i));
        String str = "-";
        sb.append(str);
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        return sb.toString();
    }
}
