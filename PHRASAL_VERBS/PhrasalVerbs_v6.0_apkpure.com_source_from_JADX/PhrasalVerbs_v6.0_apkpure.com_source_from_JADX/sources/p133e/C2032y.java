package p133e;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: e.y */
final class C2032y implements C2014i {

    /* renamed from: a */
    public final C2011g f5972a = new C2011g();

    /* renamed from: b */
    public final C2000D f5973b;

    /* renamed from: c */
    boolean f5974c;

    C2032y(C2000D d) {
        if (d != null) {
            this.f5973b = d;
            return;
        }
        throw new NullPointerException("source == null");
    }

    /* renamed from: a */
    public long mo7092a(byte b) {
        return mo7189a(b, 0, Long.MAX_VALUE);
    }

    /* renamed from: a */
    public long mo7189a(byte b, long j, long j2) {
        if (this.f5974c) {
            throw new IllegalStateException("closed");
        } else if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
        } else {
            while (j < j2) {
                long a = this.f5972a.mo7093a(b, j, j2);
                if (a == -1) {
                    C2011g gVar = this.f5972a;
                    long j3 = gVar.f5928c;
                    if (j3 >= j2 || this.f5973b.read(gVar, 8192) == -1) {
                        break;
                    }
                    j = Math.max(j, j3);
                } else {
                    return a;
                }
            }
            return -1;
        }
    }

    /* renamed from: a */
    public C2011g mo7097a() {
        return this.f5972a;
    }

    /* renamed from: a */
    public C2015j mo7105a(long j) {
        mo7125f(j);
        return this.f5972a.mo7105a(j);
    }

    /* renamed from: a */
    public String mo7107a(Charset charset) {
        if (charset != null) {
            this.f5972a.mo7094a(this.f5973b);
            return this.f5972a.mo7107a(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    /* renamed from: a */
    public void mo7108a(C2011g gVar, long j) {
        try {
            mo7125f(j);
            this.f5972a.mo7108a(gVar, j);
        } catch (EOFException e) {
            gVar.mo7094a((C2000D) this.f5972a);
            throw e;
        }
    }

    /* renamed from: a */
    public boolean mo7109a(long j, C2015j jVar) {
        return mo7190a(j, jVar, 0, jVar.mo7048g());
    }

    /* renamed from: a */
    public boolean mo7190a(long j, C2015j jVar, int i, int i2) {
        if (this.f5974c) {
            throw new IllegalStateException("closed");
        } else if (j < 0 || i < 0 || i2 < 0 || jVar.mo7048g() - i < i2) {
            return false;
        } else {
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = ((long) i3) + j;
                if (!mo7120d(1 + j2) || this.f5972a.mo7128h(j2) != jVar.mo7036a(i + i3)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: b */
    public String mo7114b(long j) {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            long a = mo7189a(10, 0, j2);
            if (a != -1) {
                return this.f5972a.mo7135j(a);
            }
            if (j2 < Long.MAX_VALUE && mo7120d(j2) && this.f5972a.mo7128h(j2 - 1) == 13 && mo7120d(1 + j2) && this.f5972a.mo7128h(j2) == 10) {
                return this.f5972a.mo7135j(j2);
            }
            C2011g gVar = new C2011g();
            C2011g gVar2 = this.f5972a;
            gVar2.mo7098a(gVar, 0, Math.min(32, gVar2.size()));
            StringBuilder sb = new StringBuilder();
            sb.append("\\n not found: limit=");
            sb.append(Math.min(this.f5972a.size(), j));
            sb.append(" content=");
            sb.append(gVar.mo7141o().mo7042b());
            sb.append(8230);
            throw new EOFException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("limit < 0: ");
        sb2.append(j);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: c */
    public byte[] mo7117c() {
        this.f5972a.mo7094a(this.f5973b);
        return this.f5972a.mo7117c();
    }

    public void close() {
        if (!this.f5974c) {
            this.f5974c = true;
            this.f5973b.close();
            this.f5972a.mo7139m();
        }
    }

    /* renamed from: d */
    public boolean mo7119d() {
        if (!this.f5974c) {
            return this.f5972a.mo7119d() && this.f5973b.read(this.f5972a, 8192) == -1;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: d */
    public boolean mo7120d(long j) {
        C2011g gVar;
        if (j < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (!this.f5974c) {
            do {
                gVar = this.f5972a;
                if (gVar.f5928c >= j) {
                    return true;
                }
            } while (this.f5973b.read(gVar, 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    /* renamed from: e */
    public byte[] mo7122e(long j) {
        mo7125f(j);
        return this.f5972a.mo7122e(j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo7124f() {
        /*
            r6 = this;
            r0 = 1
            r6.mo7125f(r0)
            r0 = 0
            r1 = 0
        L_0x0007:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.mo7120d(r3)
            if (r3 == 0) goto L_0x0040
            e.g r3 = r6.f5972a
            long r4 = (long) r1
            byte r3 = r3.mo7128h(r4)
            r4 = 48
            if (r3 < r4) goto L_0x001f
            r4 = 57
            if (r3 <= r4) goto L_0x0026
        L_0x001f:
            if (r1 != 0) goto L_0x0028
            r4 = 45
            if (r3 == r4) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r1 = r2
            goto L_0x0007
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            goto L_0x0040
        L_0x002b:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9] or '-' character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L_0x0040:
            e.g r0 = r6.f5972a
            long r0 = r0.mo7124f()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p133e.C2032y.mo7124f():long");
    }

    /* renamed from: f */
    public void mo7125f(long j) {
        if (!mo7120d(j)) {
            throw new EOFException();
        }
    }

    /* renamed from: g */
    public String mo7127g() {
        return mo7114b(Long.MAX_VALUE);
    }

    /* renamed from: h */
    public int mo7129h() {
        mo7125f(4);
        return this.f5972a.mo7129h();
    }

    /* renamed from: i */
    public short mo7132i() {
        mo7125f(2);
        return this.f5972a.mo7132i();
    }

    public boolean isOpen() {
        return !this.f5974c;
    }

    /* renamed from: k */
    public long mo7136k() {
        mo7125f(1);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!mo7120d((long) i2)) {
                break;
            }
            byte h = this.f5972a.mo7128h((long) i);
            if ((h >= 48 && h <= 57) || ((h >= 97 && h <= 102) || (h >= 65 && h <= 70))) {
                i = i2;
            } else if (i == 0) {
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[]{Byte.valueOf(h)}));
            }
        }
        return this.f5972a.mo7136k();
    }

    /* renamed from: l */
    public InputStream mo7138l() {
        return new C2031x(this);
    }

    public int read(ByteBuffer byteBuffer) {
        C2011g gVar = this.f5972a;
        if (gVar.f5928c == 0 && this.f5973b.read(gVar, 8192) == -1) {
            return -1;
        }
        return this.f5972a.read(byteBuffer);
    }

    public long read(C2011g gVar, long j) {
        if (gVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (!this.f5974c) {
            C2011g gVar2 = this.f5972a;
            if (gVar2.f5928c == 0 && this.f5973b.read(gVar2, 8192) == -1) {
                return -1;
            }
            return this.f5972a.read(gVar, Math.min(j, this.f5972a.f5928c));
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public byte readByte() {
        mo7125f(1);
        return this.f5972a.readByte();
    }

    public void readFully(byte[] bArr) {
        try {
            mo7125f((long) bArr.length);
            this.f5972a.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                C2011g gVar = this.f5972a;
                long j = gVar.f5928c;
                if (j > 0) {
                    int a = gVar.mo7091a(bArr, i, (int) j);
                    if (a != -1) {
                        i += a;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    public int readInt() {
        mo7125f(4);
        return this.f5972a.readInt();
    }

    public long readLong() {
        mo7125f(8);
        return this.f5972a.readLong();
    }

    public short readShort() {
        mo7125f(2);
        return this.f5972a.readShort();
    }

    public void skip(long j) {
        if (!this.f5974c) {
            while (j > 0) {
                C2011g gVar = this.f5972a;
                if (gVar.f5928c == 0 && this.f5973b.read(gVar, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f5972a.size());
                this.f5972a.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public C2002F timeout() {
        return this.f5973b.timeout();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("buffer(");
        sb.append(this.f5973b);
        sb.append(")");
        return sb.toString();
    }
}
