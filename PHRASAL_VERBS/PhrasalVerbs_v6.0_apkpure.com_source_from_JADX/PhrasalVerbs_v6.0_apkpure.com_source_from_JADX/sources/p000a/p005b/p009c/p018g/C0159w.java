package p000a.p005b.p009c.p018g;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* renamed from: a.b.c.g.w */
public final class C0159w {

    /* renamed from: a */
    private static Method f404a;

    static {
        if (VERSION.SDK_INT == 25) {
            try {
                f404a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    /* renamed from: a */
    public static int m590a(ViewConfiguration viewConfiguration) {
        return VERSION.SDK_INT >= 28 ? viewConfiguration.getScaledHoverSlop() : viewConfiguration.getScaledTouchSlop() / 2;
    }

    /* renamed from: a */
    public static boolean m591a(ViewConfiguration viewConfiguration, Context context) {
        if (VERSION.SDK_INT >= 28) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        return identifier != 0 && resources.getBoolean(identifier);
    }
}
