package android.support.p029v4.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import p000a.p005b.p009c.p010a.C0039a;

/* renamed from: android.support.v4.app.a */
public class C0263a extends C0039a {

    /* renamed from: c */
    private static C0265b f700c;

    /* renamed from: android.support.v4.app.a$a */
    public interface C0264a {
    }

    /* renamed from: android.support.v4.app.a$b */
    public interface C0265b {
        boolean onActivityResult(Activity activity, int i, int i2, Intent intent);
    }

    /* renamed from: android.support.v4.app.a$c */
    public interface C0266c {
    }

    /* renamed from: a */
    public static C0265b m968a() {
        return f700c;
    }

    /* renamed from: a */
    public static void m969a(Activity activity) {
        if (VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }
}
