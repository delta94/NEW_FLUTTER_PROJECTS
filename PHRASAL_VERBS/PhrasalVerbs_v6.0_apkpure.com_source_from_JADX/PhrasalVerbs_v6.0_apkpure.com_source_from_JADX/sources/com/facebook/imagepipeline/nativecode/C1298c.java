package com.facebook.imagepipeline.nativecode;

/* renamed from: com.facebook.imagepipeline.nativecode.c */
public class C1298c {

    /* renamed from: a */
    private static C1297b f4218a = null;

    /* renamed from: b */
    public static boolean f4219b = false;

    static {
        try {
            f4218a = (C1297b) Class.forName("com.facebook.imagepipeline.nativecode.WebpTranscoderImpl").newInstance();
            f4219b = true;
        } catch (Throwable unused) {
            f4219b = false;
        }
    }

    /* renamed from: a */
    public static C1297b m5611a() {
        return f4218a;
    }
}
