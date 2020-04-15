package p032c.p033a.p059g.p072i;

import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;

/* renamed from: c.a.g.i.a */
public class C0874a {

    /* renamed from: c.a.g.i.a$a */
    public static class C0875a {

        /* renamed from: a */
        public int f3087a;

        /* renamed from: b */
        public int f3088b;
    }

    /* renamed from: a */
    public static void m3908a(C0875a aVar, float f, LayoutParams layoutParams, int i, int i2) {
        if (f > 0.0f && layoutParams != null) {
            if (m3909a(layoutParams.height)) {
                aVar.f3088b = MeasureSpec.makeMeasureSpec(View.resolveSize((int) ((((float) (MeasureSpec.getSize(aVar.f3087a) - i)) / f) + ((float) i2)), aVar.f3088b), 1073741824);
            } else if (m3909a(layoutParams.width)) {
                aVar.f3087a = MeasureSpec.makeMeasureSpec(View.resolveSize((int) ((((float) (MeasureSpec.getSize(aVar.f3088b) - i2)) * f) + ((float) i)), aVar.f3087a), 1073741824);
            }
        }
    }

    /* renamed from: a */
    private static boolean m3909a(int i) {
        return i == 0 || i == -2;
    }
}
