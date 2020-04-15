package com.facebook.react.uimanager;

import android.view.View.MeasureSpec;

/* renamed from: com.facebook.react.uimanager.p */
public class C1702p {
    /* renamed from: a */
    public static final void m6587a(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        if (mode == 0 || mode2 == 0) {
            throw new IllegalStateException("A catalyst view must have an explicit width and height given to it. This should normally happen as part of the standard catalyst UI framework.");
        }
    }
}
