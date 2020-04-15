package android.support.p029v4.widget;

import android.os.Build.VERSION;
import android.widget.EdgeEffect;

/* renamed from: android.support.v4.widget.n */
public final class C0382n {
    /* renamed from: a */
    public static void m1769a(EdgeEffect edgeEffect, float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(f, f2);
        } else {
            edgeEffect.onPull(f);
        }
    }
}
