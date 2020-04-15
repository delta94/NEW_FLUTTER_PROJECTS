package p032c.p033a.p038c.p042d;

import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: c.a.c.d.a */
public final class C0707a {
    /* renamed from: a */
    public static int m3220a(InputStream inputStream, byte[] bArr, int i, int i2) {
        C0718j.m3240a(inputStream);
        C0718j.m3240a(bArr);
        if (i2 >= 0) {
            int i3 = 0;
            while (i3 < i2) {
                int read = inputStream.read(bArr, i + i3, i2 - i3);
                if (read == -1) {
                    break;
                }
                i3 += read;
            }
            return i3;
        }
        throw new IndexOutOfBoundsException("len is negative");
    }

    /* renamed from: a */
    public static long m3221a(InputStream inputStream, OutputStream outputStream) {
        C0718j.m3240a(inputStream);
        C0718j.m3240a(outputStream);
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }
}
