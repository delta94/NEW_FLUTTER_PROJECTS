package p000a.p005b.p009c.p018g;

import android.os.Build.VERSION;
import android.view.Gravity;

/* renamed from: a.b.c.g.f */
public final class C0139f {
    /* renamed from: a */
    public static int m475a(int i, int i2) {
        return VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(i, i2) : i & -8388609;
    }
}
