package com.facebook.react.uimanager;

/* renamed from: com.facebook.react.uimanager.i */
public class C1681i {
    /* renamed from: a */
    public static boolean m6531a(float f, float f2) {
        boolean z = true;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            if (!Float.isNaN(f) || !Float.isNaN(f2)) {
                z = false;
            }
            return z;
        }
        if (Math.abs(f2 - f) >= 1.0E-5f) {
            z = false;
        }
        return z;
    }
}
