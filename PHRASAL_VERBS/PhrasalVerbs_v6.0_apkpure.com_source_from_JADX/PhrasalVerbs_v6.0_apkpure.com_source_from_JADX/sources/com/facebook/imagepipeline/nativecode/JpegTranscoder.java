package com.facebook.imagepipeline.nativecode;

import java.io.InputStream;
import java.io.OutputStream;
import p032c.p033a.p038c.p042d.C0710d;
import p032c.p033a.p038c.p042d.C0718j;

@C0710d
public class JpegTranscoder {
    static {
        C1296a.m5607a();
    }

    /* renamed from: a */
    public static void m5602a(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) {
        boolean z = false;
        C0718j.m3243a(i2 >= 1);
        C0718j.m3243a(i2 <= 16);
        C0718j.m3243a(i3 >= 0);
        C0718j.m3243a(i3 <= 100);
        C0718j.m3243a(m5605b(i));
        if (!(i2 == 8 && i == 0)) {
            z = true;
        }
        C0718j.m3244a(z, (Object) "no transformation requested");
        C0718j.m3240a(inputStream);
        InputStream inputStream2 = inputStream;
        C0718j.m3240a(outputStream);
        nativeTranscodeJpeg(inputStream2, outputStream, i, i2, i3);
    }

    /* renamed from: a */
    public static boolean m5603a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public static void m5604b(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) {
        boolean z = false;
        C0718j.m3243a(i2 >= 1);
        C0718j.m3243a(i2 <= 16);
        C0718j.m3243a(i3 >= 0);
        C0718j.m3243a(i3 <= 100);
        C0718j.m3243a(m5603a(i));
        if (!(i2 == 8 && i == 1)) {
            z = true;
        }
        C0718j.m3244a(z, (Object) "no transformation requested");
        C0718j.m3240a(inputStream);
        InputStream inputStream2 = inputStream;
        C0718j.m3240a(outputStream);
        nativeTranscodeJpegWithExifOrientation(inputStream2, outputStream, i, i2, i3);
    }

    /* renamed from: b */
    public static boolean m5605b(int i) {
        return i >= 0 && i <= 270 && i % 90 == 0;
    }

    @C0710d
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3);

    @C0710d
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3);
}
