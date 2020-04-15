package p032c.p033a.p098m.p112j.p114b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.Uri.Builder;
import java.util.HashMap;
import java.util.Map;

/* renamed from: c.a.m.j.b.d */
public class C1223d {

    /* renamed from: a */
    private static volatile C1223d f3976a;

    /* renamed from: b */
    private Map<String, Integer> f3977b = new HashMap();

    private C1223d() {
    }

    /* renamed from: a */
    public static C1223d m5230a() {
        if (f3976a == null) {
            synchronized (C1223d.class) {
                if (f3976a == null) {
                    f3976a = new C1223d();
                }
            }
        }
        return f3976a;
    }

    /* renamed from: a */
    public Drawable mo4563a(Context context, String str) {
        int b = mo4564b(context, str);
        if (b > 0) {
            return context.getResources().getDrawable(b);
        }
        return null;
    }

    /* renamed from: b */
    public int mo4564b(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String replace = str.toLowerCase().replace("-", "_");
        try {
            return Integer.parseInt(replace);
        } catch (NumberFormatException unused) {
            synchronized (this) {
                if (this.f3977b.containsKey(replace)) {
                    return ((Integer) this.f3977b.get(replace)).intValue();
                }
                int identifier = context.getResources().getIdentifier(replace, "drawable", context.getPackageName());
                this.f3977b.put(replace, Integer.valueOf(identifier));
                return identifier;
            }
        }
    }

    /* renamed from: c */
    public Uri mo4565c(Context context, String str) {
        int b = mo4564b(context, str);
        return b > 0 ? new Builder().scheme("res").path(String.valueOf(b)).build() : Uri.EMPTY;
    }
}
