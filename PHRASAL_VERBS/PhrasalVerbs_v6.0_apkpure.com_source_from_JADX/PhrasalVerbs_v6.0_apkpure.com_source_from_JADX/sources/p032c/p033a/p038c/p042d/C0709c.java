package p032c.p033a.p038c.p042d;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: c.a.c.d.c */
public class C0709c extends FilterOutputStream {

    /* renamed from: a */
    private long f2587a = 0;

    public C0709c(OutputStream outputStream) {
        super(outputStream);
    }

    public void close() {
        this.out.close();
    }

    public long getCount() {
        return this.f2587a;
    }

    public void write(int i) {
        this.out.write(i);
        this.f2587a++;
    }

    public void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        this.f2587a += (long) i2;
    }
}
