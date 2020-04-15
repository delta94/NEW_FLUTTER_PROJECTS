package p032c.p033a.p038c.p045g;

import java.io.InputStream;
import p032c.p033a.p038c.p042d.C0718j;

/* renamed from: c.a.c.g.i */
public class C0740i extends InputStream {

    /* renamed from: a */
    final C0737g f2610a;

    /* renamed from: b */
    int f2611b = 0;

    /* renamed from: c */
    int f2612c = 0;

    public C0740i(C0737g gVar) {
        C0718j.m3243a(!gVar.isClosed());
        C0718j.m3240a(gVar);
        this.f2610a = gVar;
    }

    public int available() {
        return this.f2610a.size() - this.f2611b;
    }

    public void mark(int i) {
        this.f2612c = this.f2611b;
    }

    public boolean markSupported() {
        return true;
    }

    public int read() {
        if (available() <= 0) {
            return -1;
        }
        C0737g gVar = this.f2610a;
        int i = this.f2611b;
        this.f2611b = i + 1;
        return gVar.mo3494a(i) & 255;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            StringBuilder sb = new StringBuilder();
            sb.append("length=");
            sb.append(bArr.length);
            sb.append("; regionStart=");
            sb.append(i);
            sb.append("; regionLength=");
            sb.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int available = available();
        if (available <= 0) {
            return -1;
        }
        if (i2 <= 0) {
            return 0;
        }
        int min = Math.min(available, i2);
        this.f2610a.mo3495a(this.f2611b, bArr, i, min);
        this.f2611b += min;
        return min;
    }

    public void reset() {
        this.f2611b = this.f2612c;
    }

    public long skip(long j) {
        C0718j.m3243a(j >= 0);
        int min = Math.min((int) j, available());
        this.f2611b += min;
        return (long) min;
    }
}
