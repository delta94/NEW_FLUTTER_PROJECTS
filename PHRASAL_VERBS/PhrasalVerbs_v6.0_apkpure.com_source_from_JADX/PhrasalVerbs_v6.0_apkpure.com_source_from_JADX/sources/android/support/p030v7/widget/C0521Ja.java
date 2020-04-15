package android.support.p030v7.widget;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000a.p005b.p009c.p018g.C0156v;

/* renamed from: android.support.v7.widget.Ja */
public class C0521Ja {

    /* renamed from: a */
    private static Method f1966a;

    static {
        if (VERSION.SDK_INT >= 18) {
            try {
                f1966a = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});
                if (!f1966a.isAccessible()) {
                    f1966a.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
    }

    /* renamed from: a */
    public static void m2524a(View view, Rect rect, Rect rect2) {
        Method method = f1966a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{rect, rect2});
            } catch (Exception e) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
            }
        }
    }

    /* renamed from: a */
    public static boolean m2525a(View view) {
        return C0156v.m565g(view) == 1;
    }

    /* renamed from: b */
    public static void m2526b(View view) {
        String str = "Could not invoke makeOptionalFitsSystemWindows";
        String str2 = "ViewUtils";
        if (VERSION.SDK_INT >= 16) {
            try {
                Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(view, new Object[0]);
            } catch (NoSuchMethodException unused) {
                Log.d(str2, "Could not find method makeOptionalFitsSystemWindows. Oh well...");
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.d(str2, str, e);
            }
        }
    }
}
