package p000a.p005b.p009c.p017f;

import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: a.b.c.f.c */
public final class C0098c {

    /* renamed from: a */
    private static final Locale f232a;

    static {
        String str = "";
        f232a = new Locale(str, str);
    }

    /* renamed from: a */
    public static int m315a(Locale locale) {
        if (VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale != null && !locale.equals(f232a)) {
            String a = C0094a.m303a(locale);
            if (a == null) {
                return m316b(locale);
            }
            if (a.equalsIgnoreCase("Arab") || a.equalsIgnoreCase("Hebr")) {
                return 1;
            }
        }
        return 0;
    }

    /* renamed from: b */
    private static int m316b(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }
}
