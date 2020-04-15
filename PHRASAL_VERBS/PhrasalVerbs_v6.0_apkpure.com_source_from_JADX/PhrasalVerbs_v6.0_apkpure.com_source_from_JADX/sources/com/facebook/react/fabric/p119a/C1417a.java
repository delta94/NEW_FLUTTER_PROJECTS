package com.facebook.react.fabric.p119a;

import android.view.View.MeasureSpec;
import com.facebook.react.uimanager.C1726w;
import com.facebook.yoga.YogaMeasureMode;

/* renamed from: com.facebook.react.fabric.a.a */
public class C1417a {
    /* renamed from: a */
    public static float m5792a(int i) {
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        if (mode == 0) {
            return -2.14748365E9f;
        }
        return (float) size;
    }

    /* renamed from: a */
    public static YogaMeasureMode m5793a(float f, float f2) {
        return f == f2 ? YogaMeasureMode.EXACTLY : f2 == -2.14748365E9f ? YogaMeasureMode.UNDEFINED : YogaMeasureMode.AT_MOST;
    }

    /* renamed from: b */
    public static float m5794b(float f, float f2) {
        if (f != f2 && f2 == -2.14748365E9f) {
            return 0.0f;
        }
        return C1726w.m6668b(f2);
    }

    /* renamed from: b */
    public static float m5795b(int i) {
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return (float) size;
        }
        return 0.0f;
    }
}
