package p133e;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: e.v */
class C2029v extends OutputStream {

    /* renamed from: a */
    final /* synthetic */ C2030w f5967a;

    C2029v(C2030w wVar) {
        this.f5967a = wVar;
    }

    public void close() {
        this.f5967a.close();
    }

    public void flush() {
        C2030w wVar = this.f5967a;
        if (!wVar.f5970c) {
            wVar.flush();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5967a);
        sb.append(".outputStream()");
        return sb.toString();
    }

    public void write(int i) {
        C2030w wVar = this.f5967a;
        if (!wVar.f5970c) {
            wVar.f5968a.writeByte((int) (byte) i);
            this.f5967a.mo7121e();
            return;
        }
        throw new IOException("closed");
    }

    public void write(byte[] bArr, int i, int i2) {
        C2030w wVar = this.f5967a;
        if (!wVar.f5970c) {
            wVar.f5968a.write(bArr, i, i2);
            this.f5967a.mo7121e();
            return;
        }
        throw new IOException("closed");
    }
}
