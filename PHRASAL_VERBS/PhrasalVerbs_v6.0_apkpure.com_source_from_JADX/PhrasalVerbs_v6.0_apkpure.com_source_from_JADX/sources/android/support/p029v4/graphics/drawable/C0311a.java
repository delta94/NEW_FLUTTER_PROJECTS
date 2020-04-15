package android.support.p029v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v4.graphics.drawable.a */
public final class C0311a {

    /* renamed from: a */
    private static Method f930a;

    /* renamed from: b */
    private static boolean f931b;

    /* renamed from: c */
    private static Method f932c;

    /* renamed from: d */
    private static boolean f933d;

    /* renamed from: a */
    public static void m1334a(Drawable drawable, float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f, f2);
        }
    }

    /* renamed from: a */
    public static void m1335a(Drawable drawable, int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public static void m1336a(Drawable drawable, ColorStateList colorStateList) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof C0312b) {
            ((C0312b) drawable).setTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m1337a(Drawable drawable, Theme theme) {
        if (VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    /* renamed from: a */
    public static void m1338a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        if (VERSION.SDK_INT >= 21) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    /* renamed from: a */
    public static void m1339a(Drawable drawable, Mode mode) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof C0312b) {
            ((C0312b) drawable).setTintMode(mode);
        }
    }

    /* renamed from: a */
    public static void m1340a(Drawable drawable, boolean z) {
        if (VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(z);
        }
    }

    /* renamed from: a */
    public static boolean m1341a(Drawable drawable) {
        if (VERSION.SDK_INT >= 21) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m1342a(Drawable drawable, int i) {
        int i2 = VERSION.SDK_INT;
        if (i2 >= 23) {
            return drawable.setLayoutDirection(i);
        }
        if (i2 >= 17) {
            String str = "DrawableCompat";
            if (!f931b) {
                try {
                    f930a = Drawable.class.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                    f930a.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i(str, "Failed to retrieve setLayoutDirection(int) method", e);
                }
                f931b = true;
            }
            Method method = f930a;
            if (method != null) {
                try {
                    method.invoke(drawable, new Object[]{Integer.valueOf(i)});
                    return true;
                } catch (Exception e2) {
                    Log.i(str, "Failed to invoke setLayoutDirection(int) via reflection", e2);
                    f930a = null;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static int m1343b(Drawable drawable) {
        if (VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    /* renamed from: b */
    public static void m1344b(Drawable drawable, int i) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTint(i);
        } else if (drawable instanceof C0312b) {
            ((C0312b) drawable).setTint(i);
        }
    }

    /* renamed from: c */
    public static ColorFilter m1345c(Drawable drawable) {
        if (VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    /* renamed from: d */
    public static int m1346d(Drawable drawable) {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            return drawable.getLayoutDirection();
        }
        if (i >= 17) {
            String str = "DrawableCompat";
            if (!f933d) {
                try {
                    f932c = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    f932c.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i(str, "Failed to retrieve getLayoutDirection() method", e);
                }
                f933d = true;
            }
            Method method = f932c;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(drawable, new Object[0])).intValue();
                } catch (Exception e2) {
                    Log.i(str, "Failed to invoke getLayoutDirection() via reflection", e2);
                    f932c = null;
                }
            }
        }
        return 0;
    }

    /* renamed from: e */
    public static boolean m1347e(Drawable drawable) {
        if (VERSION.SDK_INT >= 19) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    @Deprecated
    /* renamed from: f */
    public static void m1348f(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: g */
    public static <T extends Drawable> T m1349g(Drawable drawable) {
        return drawable instanceof C0313c ? ((C0313c) drawable).mo1270a() : drawable;
    }

    /* renamed from: h */
    public static Drawable m1350h(Drawable drawable) {
        int i = VERSION.SDK_INT;
        return i >= 23 ? drawable : i >= 21 ? !(drawable instanceof C0312b) ? new C0317e(drawable) : drawable : !(drawable instanceof C0312b) ? new C0314d(drawable) : drawable;
    }
}
