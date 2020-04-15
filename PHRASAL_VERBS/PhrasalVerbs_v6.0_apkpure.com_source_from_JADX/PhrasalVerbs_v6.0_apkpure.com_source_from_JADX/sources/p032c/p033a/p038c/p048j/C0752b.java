package p032c.p033a.p038c.p048j;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: c.a.c.j.b */
public class C0752b extends FilterInputStream {

    /* renamed from: a */
    private final byte[] f2640a;

    /* renamed from: b */
    private int f2641b;

    /* renamed from: c */
    private int f2642c;

    public C0752b(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        if (inputStream == null) {
            throw new NullPointerException();
        } else if (bArr != null) {
            this.f2640a = bArr;
        } else {
            throw new NullPointerException();
        }
    }

    /* renamed from: m */
    private int m3363m() {
        int i = this.f2641b;
        byte[] bArr = this.f2640a;
        if (i >= bArr.length) {
            return -1;
        }
        this.f2641b = i + 1;
        return bArr[i] & 255;
    }

    public void mark(int i) {
        if (this.in.markSupported()) {
            super.mark(i);
            this.f2642c = this.f2641b;
        }
    }

    public int read() {
        int read = this.in.read();
        return read != -1 ? read : m3363m();
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            return read;
        }
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        while (i3 < i2) {
            int m = m3363m();
            if (m == -1) {
                break;
            }
            bArr[i + i3] = (byte) m;
            i3++;
        }
        if (i3 <= 0) {
            i3 = -1;
        }
        return i3;
    }

    public void reset() {
        if (this.in.markSupported()) {
            this.in.reset();
            this.f2641b = this.f2642c;
            return;
        }
        throw new IOException("mark is not supported");
    }
}
