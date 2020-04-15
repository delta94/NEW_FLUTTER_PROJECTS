package p133e;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: e.o */
public final class C2020o implements C2000D {

    /* renamed from: a */
    private final C2014i f5947a;

    /* renamed from: b */
    private final Inflater f5948b;

    /* renamed from: c */
    private int f5949c;

    /* renamed from: d */
    private boolean f5950d;

    C2020o(C2014i iVar, Inflater inflater) {
        if (iVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater != null) {
            this.f5947a = iVar;
            this.f5948b = inflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    /* renamed from: e */
    private void m7746e() {
        int i = this.f5949c;
        if (i != 0) {
            int remaining = i - this.f5948b.getRemaining();
            this.f5949c -= remaining;
            this.f5947a.skip((long) remaining);
        }
    }

    /* renamed from: b */
    public final boolean mo7171b() {
        if (!this.f5948b.needsInput()) {
            return false;
        }
        m7746e();
        if (this.f5948b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        } else if (this.f5947a.mo7119d()) {
            return true;
        } else {
            C2033z zVar = this.f5947a.mo7097a().f5927b;
            int i = zVar.f5977c;
            int i2 = zVar.f5976b;
            this.f5949c = i - i2;
            this.f5948b.setInput(zVar.f5975a, i2, this.f5949c);
            return false;
        }
    }

    public void close() {
        if (!this.f5950d) {
            this.f5948b.end();
            this.f5950d = true;
            this.f5947a.close();
        }
    }

    public long read(C2011g gVar, long j) {
        C2033z b;
        if (j < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (this.f5950d) {
            throw new IllegalStateException("closed");
        } else if (j == 0) {
            return 0;
        } else {
            while (true) {
                boolean b2 = mo7171b();
                try {
                    b = gVar.mo7113b(1);
                    int inflate = this.f5948b.inflate(b.f5975a, b.f5977c, (int) Math.min(j, (long) (8192 - b.f5977c)));
                    if (inflate > 0) {
                        b.f5977c += inflate;
                        long j2 = (long) inflate;
                        gVar.f5928c += j2;
                        return j2;
                    } else if (this.f5948b.finished()) {
                        break;
                    } else if (this.f5948b.needsDictionary()) {
                        break;
                    } else if (b2) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            m7746e();
            if (b.f5976b == b.f5977c) {
                gVar.f5927b = b.mo7198b();
                C1997A.m7605a(b);
            }
            return -1;
        }
    }

    public C2002F timeout() {
        return this.f5947a.timeout();
    }
}
