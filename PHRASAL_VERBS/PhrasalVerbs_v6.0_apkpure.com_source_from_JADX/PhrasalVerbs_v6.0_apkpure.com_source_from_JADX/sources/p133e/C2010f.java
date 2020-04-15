package p133e;

import java.io.InputStream;

/* renamed from: e.f */
class C2010f extends InputStream {

    /* renamed from: a */
    final /* synthetic */ C2011g f5925a;

    C2010f(C2011g gVar) {
        this.f5925a = gVar;
    }

    public int available() {
        return (int) Math.min(this.f5925a.f5928c, 2147483647L);
    }

    public void close() {
    }

    public int read() {
        C2011g gVar = this.f5925a;
        if (gVar.f5928c > 0) {
            return gVar.readByte() & 255;
        }
        return -1;
    }

    public int read(byte[] bArr, int i, int i2) {
        return this.f5925a.mo7091a(bArr, i, i2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5925a);
        sb.append(".inputStream()");
        return sb.toString();
    }
}
