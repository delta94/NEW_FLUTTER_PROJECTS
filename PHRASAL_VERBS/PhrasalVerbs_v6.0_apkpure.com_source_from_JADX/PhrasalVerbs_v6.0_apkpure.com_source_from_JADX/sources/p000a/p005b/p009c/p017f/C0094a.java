package p000a.p005b.p009c.p017f;

import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: a.b.c.f.a */
public final class C0094a {

    /* renamed from: a */
    private static Method f216a;

    /* renamed from: b */
    private static Method f217b;

    static {
        String str = "addLikelySubtags";
        if (VERSION.SDK_INT >= 21) {
            try {
                f217b = Class.forName("libcore.icu.ICU").getMethod(str, new Class[]{Locale.class});
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        } else {
            try {
                Class cls = Class.forName("libcore.icu.ICU");
                if (cls != null) {
                    f216a = cls.getMethod("getScript", new Class[]{String.class});
                    f217b = cls.getMethod(str, new Class[]{String.class});
                }
            } catch (Exception e2) {
                f216a = null;
                f217b = null;
                Log.w("ICUCompat", e2);
            }
        }
    }

    /* renamed from: a */
    private static String m302a(String str) {
        String str2 = "ICUCompat";
        try {
            if (f216a != null) {
                return (String) f216a.invoke(null, new Object[]{str});
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            Log.w(str2, e);
        }
        return null;
    }

    /* renamed from: a */
    public static String m303a(Locale locale) {
        String str = "ICUCompat";
        if (VERSION.SDK_INT >= 21) {
            try {
                return ((Locale) f217b.invoke(null, new Object[]{locale})).getScript();
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.w(str, e);
                return locale.getScript();
            }
        } else {
            String b = m304b(locale);
            if (b != null) {
                return m302a(b);
            }
            return null;
        }
    }

    /* renamed from: b */
    private static String m304b(Locale locale) {
        String str = "ICUCompat";
        String locale2 = locale.toString();
        try {
            if (f217b != null) {
                return (String) f217b.invoke(null, new Object[]{locale2});
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            Log.w(str, e);
        }
        return locale2;
    }
}
