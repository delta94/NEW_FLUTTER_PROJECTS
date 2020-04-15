package p032c.p033a.p038c.p045g;

import java.io.IOException;
import java.io.InputStream;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p038c.p046h.C0746d;

/* renamed from: c.a.c.g.f */
public class C0736f extends InputStream {

    /* renamed from: a */
    private final InputStream f2604a;

    /* renamed from: b */
    private final byte[] f2605b;

    /* renamed from: c */
    private final C0746d<byte[]> f2606c;

    /* renamed from: d */
    private int f2607d = 0;

    /* renamed from: e */
    private int f2608e = 0;

    /* renamed from: f */
    private boolean f2609f = false;

    public C0736f(InputStream inputStream, byte[] bArr, C0746d<byte[]> dVar) {
        C0718j.m3240a(inputStream);
        this.f2604a = inputStream;
        C0718j.m3240a(bArr);
        this.f2605b = bArr;
        C0718j.m3240a(dVar);
        this.f2606c = dVar;
    }

    /* renamed from: m */
    private boolean m3320m() {
        if (this.f2608e < this.f2607d) {
            return true;
        }
        int read = this.f2604a.read(this.f2605b);
        if (read <= 0) {
            return false;
        }
        this.f2607d = read;
        this.f2608e = 0;
        return true;
    }

    /* renamed from: n */
    private void m3321n() {
        if (this.f2609f) {
            throw new IOException("stream already closed");
        }
    }

    public int available() {
        C0718j.m3247b(this.f2608e <= this.f2607d);
        m3321n();
        return (this.f2607d - this.f2608e) + this.f2604a.available();
    }

    public void close() {
        if (!this.f2609f) {
            this.f2609f = true;
            this.f2606c.mo3486a(this.f2605b);
            super.close();
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        if (!this.f2609f) {
            C0727a.m3275b("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }

    public int read() {
        C0718j.m3247b(this.f2608e <= this.f2607d);
        m3321n();
        if (!m3320m()) {
            return -1;
        }
        byte[] bArr = this.f2605b;
        int i = this.f2608e;
        this.f2608e = i + 1;
        return bArr[i] & 255;
    }

    public int read(byte[] bArr, int i, int i2) {
        C0718j.m3247b(this.f2608e <= this.f2607d);
        m3321n();
        if (!m3320m()) {
            return -1;
        }
        int min = Math.min(this.f2607d - this.f2608e, i2);
        System.arraycopy(this.f2605b, this.f2608e, bArr, i, min);
        this.f2608e += min;
        return min;
    }

    public long skip(long j) {
        C0718j.m3247b(this.f2608e <= this.f2607d);
        m3321n();
        int i = this.f2607d;
        int i2 = this.f2608e;
        long j2 = (long) (i - i2);
        if (j2 >= j) {
            this.f2608e = (int) (((long) i2) + j);
            return j;
        }
        this.f2608e = i;
        return j2 + this.f2604a.skip(j - j2);
    }
}
