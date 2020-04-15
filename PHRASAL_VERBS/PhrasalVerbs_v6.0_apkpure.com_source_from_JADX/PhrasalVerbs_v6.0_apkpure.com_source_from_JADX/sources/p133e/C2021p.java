package p133e;

import java.io.OutputStream;

/* renamed from: e.p */
class C2021p implements C1999C {

    /* renamed from: a */
    final /* synthetic */ C2002F f5951a;

    /* renamed from: b */
    final /* synthetic */ OutputStream f5952b;

    C2021p(C2002F f, OutputStream outputStream) {
        this.f5951a = f;
        this.f5952b = outputStream;
    }

    public void close() {
        this.f5952b.close();
    }

    public void flush() {
        this.f5952b.flush();
    }

    public C2002F timeout() {
        return this.f5951a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("sink(");
        sb.append(this.f5952b);
        sb.append(")");
        return sb.toString();
    }

    public void write(C2011g gVar, long j) {
        C2003G.m7625a(gVar.f5928c, 0, j);
        while (j > 0) {
            this.f5951a.throwIfReached();
            C2033z zVar = gVar.f5927b;
            int min = (int) Math.min(j, (long) (zVar.f5977c - zVar.f5976b));
            this.f5952b.write(zVar.f5975a, zVar.f5976b, min);
            zVar.f5976b += min;
            long j2 = (long) min;
            j -= j2;
            gVar.f5928c -= j2;
            if (zVar.f5976b == zVar.f5977c) {
                gVar.f5927b = zVar.mo7198b();
                C1997A.m7605a(zVar);
            }
        }
    }
}
