package p133e;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: e.x */
class C2031x extends InputStream {

    /* renamed from: a */
    final /* synthetic */ C2032y f5971a;

    C2031x(C2032y yVar) {
        this.f5971a = yVar;
    }

    public int available() {
        C2032y yVar = this.f5971a;
        if (!yVar.f5974c) {
            return (int) Math.min(yVar.f5972a.f5928c, 2147483647L);
        }
        throw new IOException("closed");
    }

    public void close() {
        this.f5971a.close();
    }

    public int read() {
        C2032y yVar = this.f5971a;
        if (!yVar.f5974c) {
            C2011g gVar = yVar.f5972a;
            if (gVar.f5928c == 0 && yVar.f5973b.read(gVar, 8192) == -1) {
                return -1;
            }
            return this.f5971a.f5972a.readByte() & 255;
        }
        throw new IOException("closed");
    }

    public int read(byte[] bArr, int i, int i2) {
        if (!this.f5971a.f5974c) {
            C2003G.m7625a((long) bArr.length, (long) i, (long) i2);
            C2032y yVar = this.f5971a;
            C2011g gVar = yVar.f5972a;
            if (gVar.f5928c == 0 && yVar.f5973b.read(gVar, 8192) == -1) {
                return -1;
            }
            return this.f5971a.f5972a.mo7091a(bArr, i, i2);
        }
        throw new IOException("closed");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5971a);
        sb.append(".inputStream()");
        return sb.toString();
    }
}
