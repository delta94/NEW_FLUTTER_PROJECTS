package android.support.p030v7.widget;

import android.os.Build.VERSION;
import android.view.View;

/* renamed from: android.support.v7.widget.Da */
public class C0509Da {
    /* renamed from: a */
    public static void m2457a(View view, CharSequence charSequence) {
        if (VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            C0515Ga.m2461a(view, charSequence);
        }
    }
}
