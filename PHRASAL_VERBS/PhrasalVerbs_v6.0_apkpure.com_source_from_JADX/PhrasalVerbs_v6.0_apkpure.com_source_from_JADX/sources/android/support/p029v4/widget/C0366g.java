package android.support.p029v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: android.support.v4.widget.g */
public final class C0366g {

    /* renamed from: a */
    private static Field f1180a;

    /* renamed from: b */
    private static boolean f1181b;

    /* renamed from: a */
    public static Drawable m1682a(CompoundButton compoundButton) {
        if (VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        String str = "CompoundButtonCompat";
        if (!f1181b) {
            try {
                f1180a = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f1180a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i(str, "Failed to retrieve mButtonDrawable field", e);
            }
            f1181b = true;
        }
        Field field = f1180a;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e2) {
                Log.i(str, "Failed to get button drawable via reflection", e2);
                f1180a = null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m1683a(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintList(colorStateList);
        } else if (compoundButton instanceof C0347E) {
            ((C0347E) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m1684a(CompoundButton compoundButton, Mode mode) {
        if (VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintMode(mode);
        } else if (compoundButton instanceof C0347E) {
            ((C0347E) compoundButton).setSupportButtonTintMode(mode);
        }
    }
}
