package p133e;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: e.q */
class C2022q implements C2000D {

    /* renamed from: a */
    final /* synthetic */ C2002F f5953a;

    /* renamed from: b */
    final /* synthetic */ InputStream f5954b;

    C2022q(C2002F f, InputStream inputStream) {
        this.f5953a = f;
        this.f5954b = inputStream;
    }

    public void close() {
        this.f5954b.close();
    }

    public long read(C2011g gVar, long j) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (j == 0) {
            return 0;
        } else {
            try {
                this.f5953a.throwIfReached();
                C2033z b = gVar.mo7113b(1);
                int read = this.f5954b.read(b.f5975a, b.f5977c, (int) Math.min(j, (long) (8192 - b.f5977c)));
                if (read == -1) {
                    return -1;
                }
                b.f5977c += read;
                long j2 = (long) read;
                gVar.f5928c += j2;
                return j2;
            } catch (AssertionError e) {
                if (C2025t.m7757a(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        }
    }

    public C2002F timeout() {
        return this.f5953a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("source(");
        sb.append(this.f5954b);
        sb.append(")");
        return sb.toString();
    }
}
