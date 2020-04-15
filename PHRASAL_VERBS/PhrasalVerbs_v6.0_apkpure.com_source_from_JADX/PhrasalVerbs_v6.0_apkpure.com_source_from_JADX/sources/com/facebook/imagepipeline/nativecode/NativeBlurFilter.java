package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import p032c.p033a.p038c.p042d.C0710d;
import p032c.p033a.p038c.p042d.C0718j;

@C0710d
public class NativeBlurFilter {
    static {
        C1296a.m5607a();
    }

    /* renamed from: a */
    public static void m5606a(Bitmap bitmap, int i, int i2) {
        C0718j.m3240a(bitmap);
        boolean z = true;
        C0718j.m3243a(i > 0);
        if (i2 <= 0) {
            z = false;
        }
        C0718j.m3243a(z);
        nativeIterativeBoxBlur(bitmap, i, i2);
    }

    @C0710d
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);
}
