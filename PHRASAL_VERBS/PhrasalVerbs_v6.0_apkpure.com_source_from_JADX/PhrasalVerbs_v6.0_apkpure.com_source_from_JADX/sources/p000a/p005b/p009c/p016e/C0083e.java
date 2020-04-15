package p000a.p005b.p009c.p016e;

import java.util.Comparator;

/* renamed from: a.b.c.e.e */
class C0083e implements Comparator<byte[]> {
    C0083e() {
    }

    /* renamed from: a */
    public int compare(byte[] bArr, byte[] bArr2) {
        int i;
        int i2;
        if (bArr.length != bArr2.length) {
            i2 = bArr.length;
            i = bArr2.length;
        } else {
            int i3 = 0;
            while (i3 < bArr.length) {
                if (bArr[i3] != bArr2[i3]) {
                    i2 = bArr[i3];
                    i = bArr2[i3];
                } else {
                    i3++;
                }
            }
            return 0;
        }
        return i2 - i;
    }
}
