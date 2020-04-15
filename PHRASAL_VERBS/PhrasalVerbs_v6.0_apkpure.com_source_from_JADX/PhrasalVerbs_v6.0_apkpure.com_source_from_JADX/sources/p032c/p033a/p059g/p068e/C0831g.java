package p032c.p033a.p059g.p068e;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

/* renamed from: c.a.g.e.g */
public class C0831g {
    /* renamed from: a */
    public static int m3724a(int i) {
        int i2 = i >>> 24;
        if (i2 == 255) {
            return -1;
        }
        return i2 == 0 ? -2 : -3;
    }

    /* renamed from: a */
    public static int m3725a(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & 16777215;
        }
        return (i & 16777215) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }

    /* renamed from: a */
    public static void m3726a(Drawable drawable, Callback callback, C0859v vVar) {
        if (drawable != null) {
            drawable.setCallback(callback);
            if (drawable instanceof C0858u) {
                ((C0858u) drawable).mo3740a(vVar);
            }
        }
    }

    /* renamed from: a */
    public static void m3727a(Drawable drawable, Drawable drawable2) {
        if (drawable2 != null && drawable != null && drawable != drawable2) {
            drawable.setBounds(drawable2.getBounds());
            drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
            drawable.setLevel(drawable2.getLevel());
            drawable.setVisible(drawable2.isVisible(), false);
            drawable.setState(drawable2.getState());
        }
    }

    /* renamed from: a */
    public static void m3728a(Drawable drawable, C0830f fVar) {
        if (drawable != null && fVar != null) {
            fVar.mo3765a(drawable);
        }
    }
}
