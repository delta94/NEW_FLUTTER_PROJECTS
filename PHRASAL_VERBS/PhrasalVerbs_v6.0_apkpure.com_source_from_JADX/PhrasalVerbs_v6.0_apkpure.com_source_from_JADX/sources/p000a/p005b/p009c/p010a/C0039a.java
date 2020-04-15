package p000a.p005b.p009c.p010a;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Process;
import android.util.TypedValue;
import java.io.File;

/* renamed from: a.b.c.a.a */
public class C0039a {

    /* renamed from: a */
    private static final Object f121a = new Object();

    /* renamed from: b */
    private static TypedValue f122b;

    /* renamed from: a */
    public static int m105a(Context context, int i) {
        return VERSION.SDK_INT >= 23 ? context.getColor(i) : context.getResources().getColor(i);
    }

    /* renamed from: a */
    public static int m106a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    /* renamed from: a */
    public static boolean m107a(Context context, Intent[] intentArr, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            context.startActivities(intentArr, bundle);
        } else {
            context.startActivities(intentArr);
        }
        return true;
    }

    /* renamed from: a */
    public static File[] m108a(Context context) {
        if (VERSION.SDK_INT >= 19) {
            return context.getExternalCacheDirs();
        }
        return new File[]{context.getExternalCacheDir()};
    }

    /* renamed from: b */
    public static ColorStateList m109b(Context context, int i) {
        return VERSION.SDK_INT >= 23 ? context.getColorStateList(i) : context.getResources().getColorStateList(i);
    }

    /* renamed from: b */
    public static File[] m110b(Context context, String str) {
        if (VERSION.SDK_INT >= 19) {
            return context.getExternalFilesDirs(str);
        }
        return new File[]{context.getExternalFilesDir(str)};
    }

    /* renamed from: c */
    public static Drawable m111c(Context context, int i) {
        int i2 = VERSION.SDK_INT;
        if (i2 >= 21) {
            return context.getDrawable(i);
        }
        if (i2 < 16) {
            synchronized (f121a) {
                if (f122b == null) {
                    f122b = new TypedValue();
                }
                context.getResources().getValue(i, f122b, true);
                i = f122b.resourceId;
            }
        }
        return context.getResources().getDrawable(i);
    }
}
