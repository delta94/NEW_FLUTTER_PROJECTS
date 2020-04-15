package p032c.p033a.p073h;

import java.io.UnsupportedEncodingException;
import p032c.p033a.p038c.p042d.C0718j;

/* renamed from: c.a.h.e */
public class C0886e {
    /* renamed from: a */
    public static int m3960a(byte[] bArr, int i, byte[] bArr2, int i2) {
        C0718j.m3240a(bArr);
        C0718j.m3240a(bArr2);
        if (i2 > i) {
            return -1;
        }
        int i3 = 0;
        byte b = bArr2[0];
        int i4 = i - i2;
        while (i3 <= i4) {
            int i5 = 1;
            if (bArr[i3] != b) {
                do {
                    i3++;
                    if (i3 > i4) {
                        break;
                    }
                } while (bArr[i3] != b);
            }
            if (i3 <= i4) {
                int i6 = i3 + 1;
                int i7 = (i6 + i2) - 1;
                while (i6 < i7 && bArr[i6] == bArr2[i5]) {
                    i6++;
                    i5++;
                }
                if (i6 == i7) {
                    return i3;
                }
            }
            i3++;
        }
        return -1;
    }

    /* renamed from: a */
    public static boolean m3961a(byte[] bArr, byte[] bArr2) {
        C0718j.m3240a(bArr);
        C0718j.m3240a(bArr2);
        if (bArr2.length > bArr.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static byte[] m3962a(String str) {
        C0718j.m3240a(str);
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }
}
