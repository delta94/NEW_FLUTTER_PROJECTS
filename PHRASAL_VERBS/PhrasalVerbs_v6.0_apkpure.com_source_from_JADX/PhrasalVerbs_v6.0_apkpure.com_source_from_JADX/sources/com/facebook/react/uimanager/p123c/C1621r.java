package com.facebook.react.uimanager.p123c;

import android.view.animation.Interpolator;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* renamed from: com.facebook.react.uimanager.c.r */
class C1621r implements Interpolator {

    /* renamed from: a */
    private final float f4880a;

    public C1621r(float f) {
        this.f4880a = f;
    }

    /* renamed from: a */
    public static float m6375a(ReadableMap readableMap) {
        String str = "springDamping";
        if (readableMap.getType(str).equals(ReadableType.Number)) {
            return (float) readableMap.getDouble(str);
        }
        return 0.5f;
    }

    public float getInterpolation(float f) {
        double pow = Math.pow(2.0d, (double) (-10.0f * f));
        float f2 = this.f4880a;
        double d = (double) (f - (f2 / 4.0f));
        Double.isNaN(d);
        double d2 = d * 3.141592653589793d * 2.0d;
        double d3 = (double) f2;
        Double.isNaN(d3);
        return (float) ((pow * Math.sin(d2 / d3)) + 1.0d);
    }
}
