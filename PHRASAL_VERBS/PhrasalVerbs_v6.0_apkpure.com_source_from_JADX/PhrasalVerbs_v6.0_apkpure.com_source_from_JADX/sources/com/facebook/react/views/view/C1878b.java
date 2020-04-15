package com.facebook.react.views.view;

import android.view.View.MeasureSpec;
import com.facebook.yoga.YogaMeasureMode;

/* renamed from: com.facebook.react.views.view.b */
public class C1878b {
    /* renamed from: a */
    public static int m7126a(float f, YogaMeasureMode yogaMeasureMode) {
        return yogaMeasureMode == YogaMeasureMode.EXACTLY ? MeasureSpec.makeMeasureSpec((int) f, 1073741824) : yogaMeasureMode == YogaMeasureMode.AT_MOST ? MeasureSpec.makeMeasureSpec((int) f, Integer.MIN_VALUE) : MeasureSpec.makeMeasureSpec(0, 0);
    }
}
