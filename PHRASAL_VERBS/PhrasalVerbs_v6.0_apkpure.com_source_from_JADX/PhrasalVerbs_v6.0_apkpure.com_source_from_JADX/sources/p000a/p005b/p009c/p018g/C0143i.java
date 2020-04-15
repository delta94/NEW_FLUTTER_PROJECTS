package p000a.p005b.p009c.p018g;

import android.os.Build.VERSION;
import android.view.ViewGroup.MarginLayoutParams;

/* renamed from: a.b.c.g.i */
public final class C0143i {
    /* renamed from: a */
    public static int m485a(MarginLayoutParams marginLayoutParams) {
        return VERSION.SDK_INT >= 17 ? marginLayoutParams.getMarginEnd() : marginLayoutParams.rightMargin;
    }

    /* renamed from: b */
    public static int m486b(MarginLayoutParams marginLayoutParams) {
        return VERSION.SDK_INT >= 17 ? marginLayoutParams.getMarginStart() : marginLayoutParams.leftMargin;
    }
}
