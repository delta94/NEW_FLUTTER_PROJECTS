package p000a.p005b.p009c.p012b;

import android.graphics.Color;

/* renamed from: a.b.c.b.a */
public final class C0061a {

    /* renamed from: a */
    private static final ThreadLocal<double[]> f148a = new ThreadLocal<>();

    /* renamed from: a */
    public static int m191a(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int c = m194c(alpha2, alpha);
        return Color.argb(c, m192a(Color.red(i), alpha2, Color.red(i2), alpha, c), m192a(Color.green(i), alpha2, Color.green(i2), alpha, c), m192a(Color.blue(i), alpha2, Color.blue(i2), alpha, c));
    }

    /* renamed from: a */
    private static int m192a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    /* renamed from: b */
    public static int m193b(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    /* renamed from: c */
    private static int m194c(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }
}
