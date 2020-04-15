package android.support.p029v4.widget;

import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p000a.p005b.p009c.p018g.C0139f;
import p000a.p005b.p009c.p018g.C0156v;

/* renamed from: android.support.v4.widget.s */
public final class C0387s {

    /* renamed from: a */
    private static Method f1252a;

    /* renamed from: b */
    private static boolean f1253b;

    /* renamed from: c */
    private static Field f1254c;

    /* renamed from: d */
    private static boolean f1255d;

    /* renamed from: a */
    public static void m1779a(PopupWindow popupWindow, int i) {
        if (VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(i);
            return;
        }
        if (!f1253b) {
            try {
                f1252a = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", new Class[]{Integer.TYPE});
                f1252a.setAccessible(true);
            } catch (Exception unused) {
            }
            f1253b = true;
        }
        Method method = f1252a;
        if (method != null) {
            try {
                method.invoke(popupWindow, new Object[]{Integer.valueOf(i)});
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: a */
    public static void m1780a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        if (VERSION.SDK_INT >= 19) {
            popupWindow.showAsDropDown(view, i, i2, i3);
            return;
        }
        if ((C0139f.m475a(i3, C0156v.m565g(view)) & 7) == 5) {
            i -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i, i2);
    }

    /* renamed from: a */
    public static void m1781a(PopupWindow popupWindow, boolean z) {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            popupWindow.setOverlapAnchor(z);
        } else if (i >= 21) {
            String str = "PopupWindowCompatApi21";
            if (!f1255d) {
                try {
                    f1254c = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f1254c.setAccessible(true);
                } catch (NoSuchFieldException e) {
                    Log.i(str, "Could not fetch mOverlapAnchor field from PopupWindow", e);
                }
                f1255d = true;
            }
            Field field = f1254c;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException e2) {
                    Log.i(str, "Could not set overlap anchor field in PopupWindow", e2);
                }
            }
        }
    }
}
