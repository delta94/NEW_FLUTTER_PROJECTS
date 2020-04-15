package com.facebook.react.views.text;

import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.style.ReplacementSpan;
import android.widget.TextView;

/* renamed from: com.facebook.react.views.text.z */
public abstract class C1838z extends ReplacementSpan implements C1825m {
    /* renamed from: a */
    public static void m7020a(Spannable spannable, TextView textView) {
        C1838z[] zVarArr;
        for (C1838z zVar : (C1838z[]) spannable.getSpans(0, spannable.length(), C1838z.class)) {
            zVar.mo6378c();
            zVar.mo6376a(textView);
        }
    }

    /* renamed from: a */
    public abstract Drawable mo6375a();

    /* renamed from: a */
    public abstract void mo6376a(TextView textView);

    /* renamed from: b */
    public abstract int mo6377b();

    /* renamed from: c */
    public abstract void mo6378c();

    /* renamed from: d */
    public abstract void mo6379d();

    /* renamed from: e */
    public abstract void mo6381e();

    /* renamed from: f */
    public abstract void mo6382f();
}
