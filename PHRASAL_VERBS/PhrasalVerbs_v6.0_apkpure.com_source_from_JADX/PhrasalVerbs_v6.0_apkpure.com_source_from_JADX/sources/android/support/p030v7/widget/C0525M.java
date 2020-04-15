package android.support.p030v7.widget;

import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build.VERSION;
import android.support.p029v4.graphics.drawable.C0311a;
import android.support.p029v4.graphics.drawable.C0313c;
import android.util.Log;
import java.lang.reflect.Field;
import p000a.p005b.p021d.p025c.p026a.C0187e;

/* renamed from: android.support.v7.widget.M */
public class C0525M {

    /* renamed from: a */
    public static final Rect f1967a = new Rect();

    /* renamed from: b */
    private static Class<?> f1968b;

    static {
        if (VERSION.SDK_INT >= 18) {
            try {
                f1968b = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    /* renamed from: a */
    public static Mode m2559a(int i, Mode mode) {
        if (i == 3) {
            return Mode.SRC_OVER;
        }
        if (i == 5) {
            return Mode.SRC_IN;
        }
        if (i == 9) {
            return Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                return Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: a */
    public static boolean m2560a(Drawable drawable) {
        Drawable drawable2;
        if (VERSION.SDK_INT < 15 && (drawable instanceof InsetDrawable)) {
            return false;
        }
        if (VERSION.SDK_INT < 15 && (drawable instanceof GradientDrawable)) {
            return false;
        }
        if (VERSION.SDK_INT < 17 && (drawable instanceof LayerDrawable)) {
            return false;
        }
        if (drawable instanceof DrawableContainer) {
            ConstantState constantState = drawable.getConstantState();
            if (constantState instanceof DrawableContainerState) {
                for (Drawable a : ((DrawableContainerState) constantState).getChildren()) {
                    if (!m2560a(a)) {
                        return false;
                    }
                }
            }
        } else {
            if (drawable instanceof C0313c) {
                drawable2 = ((C0313c) drawable).mo1270a();
            } else if (drawable instanceof C0187e) {
                drawable2 = ((C0187e) drawable).mo651a();
            } else if (drawable instanceof ScaleDrawable) {
                drawable2 = ((ScaleDrawable) drawable).getDrawable();
            }
            return m2560a(drawable2);
        }
        return true;
    }

    /* renamed from: b */
    static void m2561b(Drawable drawable) {
        if (VERSION.SDK_INT == 21) {
            if ("android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
                m2563d(drawable);
            }
        }
    }

    /* renamed from: c */
    public static Rect m2562c(Drawable drawable) {
        Field[] fields;
        if (f1968b != null) {
            try {
                Drawable g = C0311a.m1349g(drawable);
                Object invoke = g.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(g, new Object[0]);
                if (invoke != null) {
                    Rect rect = new Rect();
                    for (Field field : f1968b.getFields()) {
                        String name = field.getName();
                        char c = 65535;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        if (c == 0) {
                            rect.left = field.getInt(invoke);
                        } else if (c == 1) {
                            rect.top = field.getInt(invoke);
                        } else if (c == 2) {
                            rect.right = field.getInt(invoke);
                        } else if (c == 3) {
                            rect.bottom = field.getInt(invoke);
                        }
                    }
                    return rect;
                }
            } catch (Exception unused) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return f1967a;
    }

    /* renamed from: d */
    private static void m2563d(Drawable drawable) {
        int[] state = drawable.getState();
        drawable.setState((state == null || state.length == 0) ? C0610qa.f2369f : C0610qa.f2372i);
        drawable.setState(state);
    }
}
