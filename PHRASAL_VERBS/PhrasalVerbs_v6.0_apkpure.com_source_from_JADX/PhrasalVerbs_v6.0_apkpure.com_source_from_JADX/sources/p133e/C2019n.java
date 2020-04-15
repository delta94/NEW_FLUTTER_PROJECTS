package p133e;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: e.n */
public final class C2019n implements C2000D {

    /* renamed from: a */
    private int f5942a = 0;

    /* renamed from: b */
    private final C2014i f5943b;

    /* renamed from: c */
    private final Inflater f5944c;

    /* renamed from: d */
    private final C2020o f5945d;

    /* renamed from: e */
    private final CRC32 f5946e = new CRC32();

    public C2019n(C2000D d) {
        if (d != null) {
            this.f5944c = new Inflater(true);
            this.f5943b = C2025t.m7756a(d);
            this.f5945d = new C2020o(this.f5943b, this.f5944c);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: a */
    private void m7742a(C2011g gVar, long j, long j2) {
        C2033z zVar = gVar.f5927b;
        while (true) {
            int i = zVar.f5977c;
            int i2 = zVar.f5976b;
            if (j < ((long) (i - i2))) {
                break;
            }
            j -= (long) (i - i2);
            zVar = zVar.f5980f;
        }
        while (j2 > 0) {
            int i3 = (int) (((long) zVar.f5976b) + j);
            int min = (int) Math.min((long) (zVar.f5977c - i3), j2);
            this.f5946e.update(zVar.f5975a, i3, min);
            j2 -= (long) min;
            zVar = zVar.f5980f;
            j = 0;
        }
    }

    /* renamed from: a */
    private void m7743a(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}));
        }
    }

    /* renamed from: b */
    private void m7744b() {
        this.f5943b.mo7125f(10);
        byte h = this.f5943b.mo7097a().mo7128h(3);
        boolean z = ((h >> 1) & 1) == 1;
        if (z) {
            m7742a(this.f5943b.mo7097a(), 0, 10);
        }
        m7743a("ID1ID2", 8075, (int) this.f5943b.readShort());
        this.f5943b.skip(8);
        if (((h >> 2) & 1) == 1) {
            this.f5943b.mo7125f(2);
            if (z) {
                m7742a(this.f5943b.mo7097a(), 0, 2);
            }
            long i = (long) this.f5943b.mo7097a().mo7132i();
            this.f5943b.mo7125f(i);
            if (z) {
                m7742a(this.f5943b.mo7097a(), 0, i);
            }
            this.f5943b.skip(i);
        }
        if (((h >> 3) & 1) == 1) {
            long a = this.f5943b.mo7092a(0);
            if (a != -1) {
                if (z) {
                    m7742a(this.f5943b.mo7097a(), 0, a + 1);
                }
                this.f5943b.skip(a + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((h >> 4) & 1) == 1) {
            long a2 = this.f5943b.mo7092a(0);
            if (a2 != -1) {
                if (z) {
                    m7742a(this.f5943b.mo7097a(), 0, a2 + 1);
                }
                this.f5943b.skip(a2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z) {
            m7743a("FHCRC", (int) this.f5943b.mo7132i(), (int) (short) ((int) this.f5946e.getValue()));
            this.f5946e.reset();
        }
    }

    /* renamed from: e */
    private void m7745e() {
        m7743a("CRC", this.f5943b.mo7129h(), (int) this.f5946e.getValue());
        m7743a("ISIZE", this.f5943b.mo7129h(), (int) this.f5944c.getBytesWritten());
    }

    public void close() {
        this.f5945d.close();
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
            if (this.f5942a == 0) {
                m7744b();
                this.f5942a = 1;
            }
            if (this.f5942a == 1) {
                long j2 = gVar.f5928c;
                long read = this.f5945d.read(gVar, j);
                if (read != -1) {
                    m7742a(gVar, j2, read);
                    return read;
                }
                this.f5942a = 2;
            }
            if (this.f5942a == 2) {
                m7745e();
                this.f5942a = 3;
                if (!this.f5943b.mo7119d()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public C2002F timeout() {
        return this.f5943b.timeout();
    }
}
