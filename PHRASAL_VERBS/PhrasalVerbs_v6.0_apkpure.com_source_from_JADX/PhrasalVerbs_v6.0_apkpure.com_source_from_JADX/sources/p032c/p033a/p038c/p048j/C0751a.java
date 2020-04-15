package p032c.p033a.p038c.p048j;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: c.a.c.j.a */
public class C0751a extends FilterInputStream {

    /* renamed from: a */
    private int f2638a;

    /* renamed from: b */
    private int f2639b;

    public C0751a(InputStream inputStream, int i) {
        super(inputStream);
        if (inputStream == null) {
            throw new NullPointerException();
        } else if (i >= 0) {
            this.f2638a = i;
            this.f2639b = -1;
        } else {
            throw new IllegalArgumentException("limit must be >= 0");
        }
    }

    public int available() {
        return Math.min(this.in.available(), this.f2638a);
    }

    public void mark(int i) {
        if (this.in.markSupported()) {
            this.in.mark(i);
            this.f2639b = this.f2638a;
        }
    }

    public int read() {
        if (this.f2638a == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.f2638a--;
        }
        return read;
    }

    public int read(byte[] bArr, int i, int i2) {
        int i3 = this.f2638a;
        if (i3 == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, Math.min(i2, i3));
        if (read > 0) {
            this.f2638a -= read;
        }
        return read;
    }

    public void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("mark is not supported");
        } else if (this.f2639b != -1) {
            this.in.reset();
            this.f2638a = this.f2639b;
        } else {
            throw new IOException("mark not set");
        }
    }

    public long skip(long j) {
        long skip = this.in.skip(Math.min(j, (long) this.f2638a));
        this.f2638a = (int) (((long) this.f2638a) - skip);
        return skip;
    }
}
