package p032c.p033a.p038c.p045g;

import java.io.InputStream;
import java.io.OutputStream;
import p032c.p033a.p038c.p042d.C0718j;

/* renamed from: c.a.c.g.k */
public class C0742k {

    /* renamed from: a */
    private final int f2613a;

    /* renamed from: b */
    private final C0731a f2614b;

    public C0742k(C0731a aVar) {
        this(aVar, 16384);
    }

    public C0742k(C0731a aVar, int i) {
        C0718j.m3243a(i > 0);
        this.f2613a = i;
        this.f2614b = aVar;
    }

    /* renamed from: a */
    public long mo3514a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = (byte[]) this.f2614b.get(this.f2613a);
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, this.f2613a);
                if (read == -1) {
                    return j;
                }
                outputStream.write(bArr, 0, read);
                j += (long) read;
            } finally {
                this.f2614b.mo3486a(bArr);
            }
        }
    }
}
