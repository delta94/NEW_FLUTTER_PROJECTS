package p133e;

import java.io.OutputStream;

/* renamed from: e.e */
class C2009e extends OutputStream {

    /* renamed from: a */
    final /* synthetic */ C2011g f5924a;

    C2009e(C2011g gVar) {
        this.f5924a = gVar;
    }

    public void close() {
    }

    public void flush() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5924a);
        sb.append(".outputStream()");
        return sb.toString();
    }

    public void write(int i) {
        this.f5924a.writeByte((int) (byte) i);
    }

    public void write(byte[] bArr, int i, int i2) {
        this.f5924a.write(bArr, i, i2);
    }
}
