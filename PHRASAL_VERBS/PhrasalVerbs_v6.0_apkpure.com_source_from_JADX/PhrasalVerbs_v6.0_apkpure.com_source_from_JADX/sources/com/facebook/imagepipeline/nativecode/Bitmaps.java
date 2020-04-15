package com.facebook.imagepipeline.nativecode;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.nio.ByteBuffer;
import p032c.p033a.p038c.p042d.C0710d;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p093j.C1129b;

@C0710d
public class Bitmaps {
    static {
        C1296a.m5607a();
    }

    /* renamed from: a */
    public static void m5599a(Bitmap bitmap) {
        C0718j.m3240a(bitmap);
        nativePinBitmap(bitmap);
    }

    @TargetApi(19)
    /* renamed from: a */
    public static void m5600a(Bitmap bitmap, int i, int i2, Config config) {
        C0718j.m3243a(bitmap.getAllocationByteCount() >= (i * i2) * C1129b.m5028a(config));
        bitmap.reconfigure(i, i2, config);
    }

    /* renamed from: a */
    public static void m5601a(Bitmap bitmap, Bitmap bitmap2) {
        boolean z = true;
        C0718j.m3243a(bitmap2.getConfig() == bitmap.getConfig());
        C0718j.m3243a(bitmap.isMutable());
        C0718j.m3243a(bitmap.getWidth() == bitmap2.getWidth());
        if (bitmap.getHeight() != bitmap2.getHeight()) {
            z = false;
        }
        C0718j.m3243a(z);
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }

    @C0710d
    private static native void nativeCopyBitmap(Bitmap bitmap, int i, Bitmap bitmap2, int i2, int i3);

    @C0710d
    private static native ByteBuffer nativeGetByteBuffer(Bitmap bitmap, long j, long j2);

    @C0710d
    private static native void nativePinBitmap(Bitmap bitmap);

    @C0710d
    private static native void nativeReleaseByteBuffer(Bitmap bitmap);
}
