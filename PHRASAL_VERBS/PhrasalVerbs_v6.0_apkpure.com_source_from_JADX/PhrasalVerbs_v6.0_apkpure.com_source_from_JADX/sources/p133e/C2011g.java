package p133e;

import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* renamed from: e.g */
public final class C2011g implements C2014i, C2013h, Cloneable, ByteChannel {

    /* renamed from: a */
    private static final byte[] f5926a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: b */
    C2033z f5927b;

    /* renamed from: c */
    long f5928c;

    /* renamed from: e.g$a */
    public static final class C2012a implements Closeable {

        /* renamed from: a */
        public C2011g f5929a;

        /* renamed from: b */
        public boolean f5930b;

        /* renamed from: c */
        private C2033z f5931c;

        /* renamed from: d */
        public long f5932d = -1;

        /* renamed from: e */
        public byte[] f5933e;

        /* renamed from: f */
        public int f5934f = -1;

        /* renamed from: g */
        public int f5935g = -1;

        public void close() {
            if (this.f5929a != null) {
                this.f5929a = null;
                this.f5931c = null;
                this.f5932d = -1;
                this.f5933e = null;
                this.f5934f = -1;
                this.f5935g = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer");
        }

        /* renamed from: h */
        public final int mo7160h(long j) {
            C2033z zVar;
            long j2;
            C2033z zVar2;
            if (j >= -1) {
                C2011g gVar = this.f5929a;
                long j3 = gVar.f5928c;
                if (j <= j3) {
                    if (j == -1 || j == j3) {
                        this.f5931c = null;
                        this.f5932d = j;
                        this.f5933e = null;
                        this.f5934f = -1;
                        this.f5935g = -1;
                        return -1;
                    }
                    long j4 = 0;
                    C2033z zVar3 = gVar.f5927b;
                    C2033z zVar4 = this.f5931c;
                    if (zVar4 != null) {
                        long j5 = this.f5932d - ((long) (this.f5934f - zVar4.f5976b));
                        if (j5 > j) {
                            j3 = j5;
                            C2033z zVar5 = zVar4;
                            zVar4 = zVar3;
                            zVar3 = zVar5;
                        } else {
                            j4 = j5;
                        }
                    } else {
                        zVar4 = zVar3;
                    }
                    if (j3 - j > j - j4) {
                        while (true) {
                            int i = zVar.f5977c;
                            int i2 = zVar.f5976b;
                            if (j < ((long) (i - i2)) + j2) {
                                break;
                            }
                            j4 = j2 + ((long) (i - i2));
                            zVar4 = zVar.f5980f;
                        }
                    } else {
                        zVar = zVar3;
                        j2 = j3;
                        while (j2 > j) {
                            zVar = zVar.f5981g;
                            j2 -= (long) (zVar.f5977c - zVar.f5976b);
                        }
                    }
                    if (!this.f5930b || !zVar.f5978d) {
                        zVar2 = zVar;
                    } else {
                        zVar2 = zVar.mo7200d();
                        C2011g gVar2 = this.f5929a;
                        if (gVar2.f5927b == zVar) {
                            gVar2.f5927b = zVar2;
                        }
                        zVar.mo7195a(zVar2);
                        zVar2.f5981g.mo7198b();
                    }
                    this.f5931c = zVar2;
                    this.f5932d = j;
                    this.f5933e = zVar2.f5975a;
                    this.f5934f = zVar2.f5976b + ((int) (j - j2));
                    this.f5935g = zVar2.f5977c;
                    return this.f5935g - this.f5934f;
                }
            }
            throw new ArrayIndexOutOfBoundsException(String.format("offset=%s > size=%s", new Object[]{Long.valueOf(j), Long.valueOf(this.f5929a.f5928c)}));
        }

        /* renamed from: m */
        public final int mo7161m() {
            long j = this.f5932d;
            if (j != this.f5929a.f5928c) {
                return mo7160h(j == -1 ? 0 : j + ((long) (this.f5935g - this.f5934f)));
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public int mo7091a(byte[] bArr, int i, int i2) {
        C2003G.m7625a((long) bArr.length, (long) i, (long) i2);
        C2033z zVar = this.f5927b;
        if (zVar == null) {
            return -1;
        }
        int min = Math.min(i2, zVar.f5977c - zVar.f5976b);
        System.arraycopy(zVar.f5975a, zVar.f5976b, bArr, i, min);
        zVar.f5976b += min;
        this.f5928c -= (long) min;
        if (zVar.f5976b == zVar.f5977c) {
            this.f5927b = zVar.mo7198b();
            C1997A.m7605a(zVar);
        }
        return min;
    }

    /* renamed from: a */
    public long mo7092a(byte b) {
        return mo7093a(b, 0, Long.MAX_VALUE);
    }

    /* renamed from: a */
    public long mo7093a(byte b, long j, long j2) {
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(this.f5928c), Long.valueOf(j), Long.valueOf(j2)}));
        }
        long j4 = this.f5928c;
        if (j2 <= j4) {
            j4 = j2;
        }
        if (j == j4) {
            return -1;
        }
        C2033z zVar = this.f5927b;
        if (zVar == null) {
            return -1;
        }
        long j5 = this.f5928c;
        if (j5 - j >= j) {
            while (true) {
                j5 = j3;
                j3 = ((long) (zVar.f5977c - zVar.f5976b)) + j5;
                if (j3 >= j) {
                    break;
                }
                zVar = zVar.f5980f;
            }
        } else {
            while (j5 > j) {
                zVar = zVar.f5981g;
                j5 -= (long) (zVar.f5977c - zVar.f5976b);
            }
        }
        long j6 = j;
        while (j5 < j4) {
            byte[] bArr = zVar.f5975a;
            int min = (int) Math.min((long) zVar.f5977c, (((long) zVar.f5976b) + j4) - j5);
            for (int i = (int) ((((long) zVar.f5976b) + j6) - j5); i < min; i++) {
                if (bArr[i] == b) {
                    return ((long) (i - zVar.f5976b)) + j5;
                }
            }
            byte b2 = b;
            j6 = ((long) (zVar.f5977c - zVar.f5976b)) + j5;
            zVar = zVar.f5980f;
            j5 = j6;
        }
        return -1;
    }

    /* renamed from: a */
    public long mo7094a(C2000D d) {
        if (d != null) {
            long j = 0;
            while (true) {
                long read = d.read(this, 8192);
                if (read == -1) {
                    return j;
                }
                j += read;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    /* renamed from: a */
    public long mo7095a(C2015j jVar, long j) {
        int i;
        long j2 = 0;
        if (j >= 0) {
            C2033z zVar = this.f5927b;
            if (zVar == null) {
                return -1;
            }
            long j3 = this.f5928c;
            if (j3 - j >= j) {
                while (true) {
                    j3 = j2;
                    j2 = ((long) (zVar.f5977c - zVar.f5976b)) + j3;
                    if (j2 >= j) {
                        break;
                    }
                    zVar = zVar.f5980f;
                }
            } else {
                while (j3 > j) {
                    zVar = zVar.f5981g;
                    j3 -= (long) (zVar.f5977c - zVar.f5976b);
                }
            }
            if (jVar.mo7048g() == 2) {
                byte a = jVar.mo7036a(0);
                byte a2 = jVar.mo7036a(1);
                while (j3 < this.f5928c) {
                    byte[] bArr = zVar.f5975a;
                    i = (int) ((((long) zVar.f5976b) + j) - j3);
                    int i2 = zVar.f5977c;
                    while (i < i2) {
                        byte b = bArr[i];
                        if (!(b == a || b == a2)) {
                            i++;
                        }
                    }
                    j = ((long) (zVar.f5977c - zVar.f5976b)) + j3;
                    zVar = zVar.f5980f;
                    j3 = j;
                }
                return -1;
            }
            byte[] c = jVar.mo7043c();
            while (j3 < this.f5928c) {
                byte[] bArr2 = zVar.f5975a;
                int i3 = (int) ((((long) zVar.f5976b) + j) - j3);
                int i4 = zVar.f5977c;
                while (i < i4) {
                    byte b2 = bArr2[i];
                    int length = c.length;
                    int i5 = 0;
                    while (i5 < length) {
                        if (b2 != c[i5]) {
                            i5++;
                        }
                    }
                    i3 = i + 1;
                }
                j = ((long) (zVar.f5977c - zVar.f5976b)) + j3;
                zVar = zVar.f5980f;
                j3 = j;
            }
            return -1;
            return ((long) (i - zVar.f5976b)) + j3;
        }
        throw new IllegalArgumentException("fromIndex < 0");
    }

    /* renamed from: a */
    public final C2012a mo7096a(C2012a aVar) {
        if (aVar.f5929a == null) {
            aVar.f5929a = this;
            aVar.f5930b = true;
            return aVar;
        }
        throw new IllegalStateException("already attached to a buffer");
    }

    /* renamed from: a */
    public C2011g mo7097a() {
        return this;
    }

    /* renamed from: a */
    public final C2011g mo7098a(C2011g gVar, long j, long j2) {
        if (gVar != null) {
            C2003G.m7625a(this.f5928c, j, j2);
            if (j2 == 0) {
                return this;
            }
            gVar.f5928c += j2;
            C2033z zVar = this.f5927b;
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
                C2033z c = zVar.mo7199c();
                c.f5976b = (int) (((long) c.f5976b) + j);
                c.f5977c = Math.min(c.f5976b + ((int) j2), c.f5977c);
                C2033z zVar2 = gVar.f5927b;
                if (zVar2 == null) {
                    c.f5981g = c;
                    c.f5980f = c;
                    gVar.f5927b = c;
                } else {
                    zVar2.f5981g.mo7195a(c);
                }
                j2 -= (long) (c.f5977c - c.f5976b);
                zVar = zVar.f5980f;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    /* renamed from: a */
    public C2011g mo7099a(C2015j jVar) {
        if (jVar != null) {
            jVar.mo7039a(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    /* renamed from: a */
    public C2011g mo7100a(String str) {
        mo7101a(str, 0, str.length());
        return this;
    }

    /* renamed from: a */
    public C2011g mo7101a(String str, int i, int i2) {
        int i3;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("beginIndex < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("endIndex < beginIndex: ");
            sb2.append(i2);
            sb2.append(" < ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    C2033z b = mo7113b(1);
                    byte[] bArr = b.f5975a;
                    int i4 = b.f5977c - i;
                    int min = Math.min(i2, 8192 - i4);
                    int i5 = i + 1;
                    bArr[i + i4] = (byte) charAt;
                    while (i5 < min) {
                        char charAt2 = str.charAt(i5);
                        if (charAt2 >= 128) {
                            break;
                        }
                        int i6 = i5 + 1;
                        bArr[i5 + i4] = (byte) charAt2;
                        i5 = i6;
                    }
                    int i7 = i4 + i5;
                    int i8 = b.f5977c;
                    int i9 = i7 - i8;
                    b.f5977c = i8 + i9;
                    this.f5928c += (long) i9;
                    i = i5;
                } else {
                    if (charAt < 2048) {
                        i3 = (charAt >> 6) | 192;
                    } else if (charAt < 55296 || charAt > 57343) {
                        writeByte((charAt >> 12) | 224);
                        i3 = ((charAt >> 6) & 63) | 128;
                    } else {
                        int i10 = i + 1;
                        char charAt3 = i10 < i2 ? str.charAt(i10) : 0;
                        if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                            writeByte(63);
                            i = i10;
                        } else {
                            int i11 = (((charAt & 10239) << 10) | (9215 & charAt3)) + 0;
                            writeByte((i11 >> 18) | 240);
                            writeByte(((i11 >> 12) & 63) | 128);
                            writeByte(((i11 >> 6) & 63) | 128);
                            writeByte((i11 & 63) | 128);
                            i += 2;
                        }
                    }
                    writeByte(i3);
                    writeByte((int) (charAt & '?') | 128);
                    i++;
                }
            }
            return this;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("endIndex > string.length: ");
            sb3.append(i2);
            sb3.append(" > ");
            sb3.append(str.length());
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    /* renamed from: a */
    public C2011g mo7102a(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("beginIndex < 0: ");
            sb.append(i);
            throw new IllegalAccessError(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("endIndex < beginIndex: ");
            sb2.append(i2);
            sb2.append(" < ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i2 > str.length()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("endIndex > string.length: ");
            sb3.append(i2);
            sb3.append(" > ");
            sb3.append(str.length());
            throw new IllegalArgumentException(sb3.toString());
        } else if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (charset.equals(C2003G.f5917a)) {
            mo7101a(str, i, i2);
            return this;
        } else {
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            write(bytes, 0, bytes.length);
            return this;
        }
    }

    /* renamed from: a */
    public C2011g mo7103a(String str, Charset charset) {
        mo7102a(str, 0, str.length(), charset);
        return this;
    }

    /* renamed from: a */
    public final C2015j mo7104a(int i) {
        return i == 0 ? C2015j.f5937b : new C1998B(this, i);
    }

    /* renamed from: a */
    public C2015j mo7105a(long j) {
        return new C2015j(mo7122e(j));
    }

    /* renamed from: a */
    public String mo7106a(long j, Charset charset) {
        C2003G.m7625a(this.f5928c, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount > Integer.MAX_VALUE: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (j == 0) {
            return "";
        } else {
            C2033z zVar = this.f5927b;
            int i = zVar.f5976b;
            if (((long) i) + j > ((long) zVar.f5977c)) {
                return new String(mo7122e(j), charset);
            }
            String str = new String(zVar.f5975a, i, (int) j, charset);
            zVar.f5976b = (int) (((long) zVar.f5976b) + j);
            this.f5928c -= j;
            if (zVar.f5976b == zVar.f5977c) {
                this.f5927b = zVar.mo7198b();
                C1997A.m7605a(zVar);
            }
            return str;
        }
    }

    /* renamed from: a */
    public String mo7107a(Charset charset) {
        try {
            return mo7106a(this.f5928c, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public void mo7108a(C2011g gVar, long j) {
        long j2 = this.f5928c;
        if (j2 >= j) {
            gVar.write(this, j);
        } else {
            gVar.write(this, j2);
            throw new EOFException();
        }
    }

    /* renamed from: a */
    public boolean mo7109a(long j, C2015j jVar) {
        return mo7110a(j, jVar, 0, jVar.mo7048g());
    }

    /* renamed from: a */
    public boolean mo7110a(long j, C2015j jVar, int i, int i2) {
        if (j < 0 || i < 0 || i2 < 0 || this.f5928c - j < ((long) i2) || jVar.mo7048g() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (mo7128h(((long) i3) + j) != jVar.mo7036a(i + i3)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public long mo7111b(C2015j jVar) {
        return mo7095a(jVar, 0);
    }

    /* renamed from: b */
    public C2013h mo7112b() {
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C2033z mo7113b(int i) {
        C2033z zVar;
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        C2033z zVar2 = this.f5927b;
        if (zVar2 == null) {
            this.f5927b = C1997A.m7604a();
            C2033z zVar3 = this.f5927b;
            zVar3.f5981g = zVar3;
            zVar3.f5980f = zVar3;
            return zVar3;
        }
        C2033z zVar4 = zVar2.f5981g;
        if (zVar4.f5977c + i > 8192 || !zVar4.f5979e) {
            zVar = C1997A.m7604a();
            zVar4.mo7195a(zVar);
        } else {
            zVar = zVar4;
        }
        return zVar;
    }

    /* renamed from: b */
    public String mo7114b(long j) {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long a = mo7093a(10, 0, j2);
            if (a != -1) {
                return mo7135j(a);
            }
            if (j2 < size() && mo7128h(j2 - 1) == 13 && mo7128h(j2) == 10) {
                return mo7135j(j2);
            }
            C2011g gVar = new C2011g();
            mo7098a(gVar, 0, Math.min(32, size()));
            StringBuilder sb = new StringBuilder();
            sb.append("\\n not found: limit=");
            sb.append(Math.min(size(), j));
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
    public C2011g mo7115c(int i) {
        int i2;
        int i3;
        if (i >= 128) {
            if (i < 2048) {
                i3 = (i >> 6) | 192;
            } else {
                if (i < 65536) {
                    if (i < 55296 || i > 57343) {
                        i2 = (i >> 12) | 224;
                    } else {
                        writeByte(63);
                        return this;
                    }
                } else if (i <= 1114111) {
                    writeByte((i >> 18) | 240);
                    i2 = ((i >> 12) & 63) | 128;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unexpected code point: ");
                    sb.append(Integer.toHexString(i));
                    throw new IllegalArgumentException(sb.toString());
                }
                writeByte(i2);
                i3 = ((i >> 6) & 63) | 128;
            }
            writeByte(i3);
            i = (i & 63) | 128;
        }
        writeByte(i);
        return this;
    }

    /* renamed from: c */
    public C2011g mo7116c(long j) {
        if (j == 0) {
            writeByte(48);
            return this;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C2033z b = mo7113b(numberOfTrailingZeros);
        byte[] bArr = b.f5975a;
        int i = b.f5977c;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f5926a[(int) (15 & j)];
            j >>>= 4;
        }
        b.f5977c += numberOfTrailingZeros;
        this.f5928c += (long) numberOfTrailingZeros;
        return this;
    }

    /* renamed from: c */
    public byte[] mo7117c() {
        try {
            return mo7122e(this.f5928c);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public C2011g clone() {
        C2011g gVar = new C2011g();
        if (this.f5928c == 0) {
            return gVar;
        }
        gVar.f5927b = this.f5927b.mo7199c();
        C2033z zVar = gVar.f5927b;
        zVar.f5981g = zVar;
        zVar.f5980f = zVar;
        C2033z zVar2 = this.f5927b;
        while (true) {
            zVar2 = zVar2.f5980f;
            if (zVar2 != this.f5927b) {
                gVar.f5927b.f5981g.mo7195a(zVar2.mo7199c());
            } else {
                gVar.f5928c = this.f5928c;
                return gVar;
            }
        }
    }

    public void close() {
    }

    /* renamed from: d */
    public boolean mo7119d() {
        return this.f5928c == 0;
    }

    /* renamed from: d */
    public boolean mo7120d(long j) {
        return this.f5928c >= j;
    }

    /* renamed from: e */
    public C2011g mo7121e() {
        return this;
    }

    /* renamed from: e */
    public byte[] mo7122e(long j) {
        C2003G.m7625a(this.f5928c, 0, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[((int) j)];
            readFully(bArr);
            return bArr;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("byteCount > Integer.MAX_VALUE: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2011g)) {
            return false;
        }
        C2011g gVar = (C2011g) obj;
        long j = this.f5928c;
        if (j != gVar.f5928c) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        C2033z zVar = this.f5927b;
        C2033z zVar2 = gVar.f5927b;
        int i = zVar.f5976b;
        int i2 = zVar2.f5976b;
        while (j2 < this.f5928c) {
            long min = (long) Math.min(zVar.f5977c - i, zVar2.f5977c - i2);
            int i3 = i2;
            int i4 = i;
            int i5 = 0;
            while (((long) i5) < min) {
                int i6 = i4 + 1;
                int i7 = i3 + 1;
                if (zVar.f5975a[i4] != zVar2.f5975a[i3]) {
                    return false;
                }
                i5++;
                i4 = i6;
                i3 = i7;
            }
            if (i4 == zVar.f5977c) {
                zVar = zVar.f5980f;
                i = zVar.f5976b;
            } else {
                i = i4;
            }
            if (i3 == zVar2.f5977c) {
                zVar2 = zVar2.f5980f;
                i2 = zVar2.f5976b;
            } else {
                i2 = i3;
            }
            j2 += min;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        if (r5 != false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        r1.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004f, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append("Number too large: ");
        r3.append(r1.mo7142p());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        throw new java.lang.NumberFormatException(r3.toString());
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo7124f() {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.f5928c
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00b7
            r5 = -7
            r7 = 0
            r8 = r5
            r5 = 0
            r6 = 0
        L_0x0010:
            e.z r10 = r0.f5927b
            byte[] r11 = r10.f5975a
            int r12 = r10.f5976b
            int r13 = r10.f5977c
        L_0x0018:
            if (r12 >= r13) goto L_0x0098
            byte r15 = r11[r12]
            r14 = 48
            if (r15 < r14) goto L_0x006a
            r1 = 57
            if (r15 > r1) goto L_0x006a
            int r14 = r14 - r15
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r16 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r16 < 0) goto L_0x003f
            int r16 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r16 != 0) goto L_0x0038
            long r1 = (long) r14
            int r16 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r16 >= 0) goto L_0x0038
            goto L_0x003f
        L_0x0038:
            r1 = 10
            long r3 = r3 * r1
            long r1 = (long) r14
            long r3 = r3 + r1
            goto L_0x0074
        L_0x003f:
            e.g r1 = new e.g
            r1.<init>()
            r1.mo7126g(r3)
            r1.writeByte(r15)
            if (r5 != 0) goto L_0x004f
            r1.readByte()
        L_0x004f:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Number too large: "
            r3.append(r4)
            java.lang.String r1 = r1.mo7142p()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x006a:
            r1 = 45
            if (r15 != r1) goto L_0x0079
            if (r7 != 0) goto L_0x0079
            r1 = 1
            long r8 = r8 - r1
            r5 = 1
        L_0x0074:
            int r12 = r12 + 1
            int r7 = r7 + 1
            goto L_0x0018
        L_0x0079:
            if (r7 == 0) goto L_0x007d
            r6 = 1
            goto L_0x0098
        L_0x007d:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected leading [0-9] or '-' character but was 0x"
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r15)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0098:
            if (r12 != r13) goto L_0x00a4
            e.z r1 = r10.mo7198b()
            r0.f5927b = r1
            p133e.C1997A.m7605a(r10)
            goto L_0x00a6
        L_0x00a4:
            r10.f5976b = r12
        L_0x00a6:
            if (r6 != 0) goto L_0x00ac
            e.z r1 = r0.f5927b
            if (r1 != 0) goto L_0x0010
        L_0x00ac:
            long r1 = r0.f5928c
            long r6 = (long) r7
            long r1 = r1 - r6
            r0.f5928c = r1
            if (r5 == 0) goto L_0x00b5
            goto L_0x00b6
        L_0x00b5:
            long r3 = -r3
        L_0x00b6:
            return r3
        L_0x00b7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "size == 0"
            r1.<init>(r2)
            throw r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p133e.C2011g.mo7124f():long");
    }

    /* renamed from: f */
    public void mo7125f(long j) {
        if (this.f5928c < j) {
            throw new EOFException();
        }
    }

    public void flush() {
    }

    /* renamed from: g */
    public C2011g mo7126g(long j) {
        if (j == 0) {
            writeByte(48);
            return this;
        }
        boolean z = false;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                mo7100a("-9223372036854775808");
                return this;
            }
            z = true;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        C2033z b = mo7113b(i);
        byte[] bArr = b.f5975a;
        int i2 = b.f5977c + i;
        while (j != 0) {
            i2--;
            bArr[i2] = f5926a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        b.f5977c += i;
        this.f5928c += (long) i;
        return this;
    }

    /* renamed from: g */
    public String mo7127g() {
        return mo7114b(Long.MAX_VALUE);
    }

    /* renamed from: h */
    public final byte mo7128h(long j) {
        int i;
        C2003G.m7625a(this.f5928c, j, 1);
        long j2 = this.f5928c;
        if (j2 - j > j) {
            C2033z zVar = this.f5927b;
            while (true) {
                int i2 = zVar.f5977c;
                int i3 = zVar.f5976b;
                long j3 = (long) (i2 - i3);
                if (j < j3) {
                    return zVar.f5975a[i3 + ((int) j)];
                }
                j -= j3;
                zVar = zVar.f5980f;
            }
        } else {
            long j4 = j - j2;
            C2033z zVar2 = this.f5927b;
            do {
                zVar2 = zVar2.f5981g;
                int i4 = zVar2.f5977c;
                i = zVar2.f5976b;
                j4 += (long) (i4 - i);
            } while (j4 < 0);
            return zVar2.f5975a[i + ((int) j4)];
        }
    }

    /* renamed from: h */
    public int mo7129h() {
        return C2003G.m7623a(readInt());
    }

    public int hashCode() {
        C2033z zVar = this.f5927b;
        if (zVar == null) {
            return 0;
        }
        int i = 1;
        do {
            for (int i2 = zVar.f5976b; i2 < zVar.f5977c; i2++) {
                i = (i * 31) + zVar.f5975a[i2];
            }
            zVar = zVar.f5980f;
        } while (zVar != this.f5927b);
        return i;
    }

    /* renamed from: i */
    public String mo7131i(long j) {
        return mo7106a(j, C2003G.f5917a);
    }

    /* renamed from: i */
    public short mo7132i() {
        return C2003G.m7624a(readShort());
    }

    public boolean isOpen() {
        return true;
    }

    /* renamed from: j */
    public OutputStream mo7134j() {
        return new C2009e(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public String mo7135j(long j) {
        String i;
        long j2 = 1;
        if (j > 0) {
            long j3 = j - 1;
            if (mo7128h(j3) == 13) {
                i = mo7131i(j3);
                j2 = 2;
                skip(j2);
                return i;
            }
        }
        i = mo7131i(j);
        skip(j2);
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008f, code lost:
        if (r8 != r9) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0091, code lost:
        r15.f5927b = r6.mo7198b();
        p133e.C1997A.m7605a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009b, code lost:
        r6.f5976b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009d, code lost:
        if (r0 != false) goto L_0x00a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0074 A[SYNTHETIC] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo7136k() {
        /*
            r15 = this;
            long r0 = r15.f5928c
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00aa
            r0 = 0
            r4 = r2
            r1 = 0
        L_0x000b:
            e.z r6 = r15.f5927b
            byte[] r7 = r6.f5975a
            int r8 = r6.f5976b
            int r9 = r6.f5977c
        L_0x0013:
            if (r8 >= r9) goto L_0x008f
            byte r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L_0x0022
            r11 = 57
            if (r10 > r11) goto L_0x0022
            int r11 = r10 + -48
            goto L_0x003a
        L_0x0022:
            r11 = 97
            if (r10 < r11) goto L_0x002f
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L_0x002f
            int r11 = r10 + -97
        L_0x002c:
            int r11 = r11 + 10
            goto L_0x003a
        L_0x002f:
            r11 = 65
            if (r10 < r11) goto L_0x0070
            r11 = 70
            if (r10 > r11) goto L_0x0070
            int r11 = r10 + -65
            goto L_0x002c
        L_0x003a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x004a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r1 = r1 + 1
            goto L_0x0013
        L_0x004a:
            e.g r0 = new e.g
            r0.<init>()
            r0.mo7116c(r4)
            r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.mo7142p()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0070:
            if (r1 == 0) goto L_0x0074
            r0 = 1
            goto L_0x008f
        L_0x0074:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x008f:
            if (r8 != r9) goto L_0x009b
            e.z r7 = r6.mo7198b()
            r15.f5927b = r7
            p133e.C1997A.m7605a(r6)
            goto L_0x009d
        L_0x009b:
            r6.f5976b = r8
        L_0x009d:
            if (r0 != 0) goto L_0x00a3
            e.z r6 = r15.f5927b
            if (r6 != 0) goto L_0x000b
        L_0x00a3:
            long r2 = r15.f5928c
            long r0 = (long) r1
            long r2 = r2 - r0
            r15.f5928c = r2
            return r4
        L_0x00aa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p133e.C2011g.mo7136k():long");
    }

    /* renamed from: k */
    public C2011g mo7137k(long j) {
        C2033z b = mo7113b(8);
        byte[] bArr = b.f5975a;
        int i = b.f5977c;
        int i2 = i + 1;
        bArr[i] = (byte) ((int) ((j >>> 56) & 255));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) ((j >>> 48) & 255));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) ((j >>> 40) & 255));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) ((j >>> 32) & 255));
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((int) ((j >>> 24) & 255));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((int) ((j >>> 16) & 255));
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((int) ((j >>> 8) & 255));
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((int) (j & 255));
        b.f5977c = i9;
        this.f5928c += 8;
        return this;
    }

    /* renamed from: l */
    public InputStream mo7138l() {
        return new C2010f(this);
    }

    /* renamed from: m */
    public final void mo7139m() {
        try {
            skip(this.f5928c);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: n */
    public final long mo7140n() {
        long j = this.f5928c;
        if (j == 0) {
            return 0;
        }
        C2033z zVar = this.f5927b.f5981g;
        int i = zVar.f5977c;
        if (i < 8192 && zVar.f5979e) {
            j -= (long) (i - zVar.f5976b);
        }
        return j;
    }

    /* renamed from: o */
    public C2015j mo7141o() {
        return new C2015j(mo7117c());
    }

    /* renamed from: p */
    public String mo7142p() {
        try {
            return mo7106a(this.f5928c, C2003G.f5917a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: q */
    public final C2015j mo7143q() {
        long j = this.f5928c;
        if (j <= 2147483647L) {
            return mo7104a((int) j);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("size > Integer.MAX_VALUE: ");
        sb.append(this.f5928c);
        throw new IllegalArgumentException(sb.toString());
    }

    public int read(ByteBuffer byteBuffer) {
        C2033z zVar = this.f5927b;
        if (zVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), zVar.f5977c - zVar.f5976b);
        byteBuffer.put(zVar.f5975a, zVar.f5976b, min);
        zVar.f5976b += min;
        this.f5928c -= (long) min;
        if (zVar.f5976b == zVar.f5977c) {
            this.f5927b = zVar.mo7198b();
            C1997A.m7605a(zVar);
        }
        return min;
    }

    public long read(C2011g gVar, long j) {
        if (gVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j >= 0) {
            long j2 = this.f5928c;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            gVar.write(this, j);
            return j;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public byte readByte() {
        long j = this.f5928c;
        if (j != 0) {
            C2033z zVar = this.f5927b;
            int i = zVar.f5976b;
            int i2 = zVar.f5977c;
            int i3 = i + 1;
            byte b = zVar.f5975a[i];
            this.f5928c = j - 1;
            if (i3 == i2) {
                this.f5927b = zVar.mo7198b();
                C1997A.m7605a(zVar);
            } else {
                zVar.f5976b = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    public void readFully(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            int a = mo7091a(bArr, i, bArr.length - i);
            if (a != -1) {
                i += a;
            } else {
                throw new EOFException();
            }
        }
    }

    public int readInt() {
        long j = this.f5928c;
        if (j >= 4) {
            C2033z zVar = this.f5927b;
            int i = zVar.f5976b;
            int i2 = zVar.f5977c;
            if (i2 - i < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = zVar.f5975a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i5 = i4 + 1;
            byte b2 = b | ((bArr[i4] & 255) << 8);
            int i6 = i5 + 1;
            byte b3 = b2 | (bArr[i5] & 255);
            this.f5928c = j - 4;
            if (i6 == i2) {
                this.f5927b = zVar.mo7198b();
                C1997A.m7605a(zVar);
            } else {
                zVar.f5976b = i6;
            }
            return b3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("size < 4: ");
        sb.append(this.f5928c);
        throw new IllegalStateException(sb.toString());
    }

    public long readLong() {
        long j = this.f5928c;
        if (j >= 8) {
            C2033z zVar = this.f5927b;
            int i = zVar.f5976b;
            int i2 = zVar.f5977c;
            if (i2 - i < 8) {
                return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
            }
            byte[] bArr = zVar.f5975a;
            int i3 = i + 1;
            long j2 = (((long) bArr[i]) & 255) << 56;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            int i9 = i8 + 1;
            int i10 = i9 + 1;
            long j3 = ((((long) bArr[i3]) & 255) << 48) | j2 | ((((long) bArr[i4]) & 255) << 40) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 24) | ((((long) bArr[i7]) & 255) << 16) | ((((long) bArr[i8]) & 255) << 8) | (((long) bArr[i9]) & 255);
            this.f5928c = j - 8;
            if (i10 == i2) {
                this.f5927b = zVar.mo7198b();
                C1997A.m7605a(zVar);
            } else {
                zVar.f5976b = i10;
            }
            return j3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("size < 8: ");
        sb.append(this.f5928c);
        throw new IllegalStateException(sb.toString());
    }

    public short readShort() {
        long j = this.f5928c;
        if (j >= 2) {
            C2033z zVar = this.f5927b;
            int i = zVar.f5976b;
            int i2 = zVar.f5977c;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = zVar.f5975a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.f5928c = j - 2;
            if (i4 == i2) {
                this.f5927b = zVar.mo7198b();
                C1997A.m7605a(zVar);
            } else {
                zVar.f5976b = i4;
            }
            return (short) b;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("size < 2: ");
        sb.append(this.f5928c);
        throw new IllegalStateException(sb.toString());
    }

    public final long size() {
        return this.f5928c;
    }

    public void skip(long j) {
        while (j > 0) {
            C2033z zVar = this.f5927b;
            if (zVar != null) {
                int min = (int) Math.min(j, (long) (zVar.f5977c - zVar.f5976b));
                long j2 = (long) min;
                this.f5928c -= j2;
                j -= j2;
                C2033z zVar2 = this.f5927b;
                zVar2.f5976b += min;
                if (zVar2.f5976b == zVar2.f5977c) {
                    this.f5927b = zVar2.mo7198b();
                    C1997A.m7605a(zVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public C2002F timeout() {
        return C2002F.NONE;
    }

    public String toString() {
        return mo7143q().toString();
    }

    public int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                C2033z b = mo7113b(1);
                int min = Math.min(i, 8192 - b.f5977c);
                byteBuffer.get(b.f5975a, b.f5977c, min);
                i -= min;
                b.f5977c += min;
            }
            this.f5928c += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    public C2011g write(byte[] bArr) {
        if (bArr != null) {
            write(bArr, 0, bArr.length);
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public C2011g write(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            C2003G.m7625a((long) bArr.length, (long) i, j);
            int i3 = i2 + i;
            while (i < i3) {
                C2033z b = mo7113b(1);
                int min = Math.min(i3 - i, 8192 - b.f5977c);
                System.arraycopy(bArr, i, b.f5975a, b.f5977c, min);
                i += min;
                b.f5977c += min;
            }
            this.f5928c += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public void write(C2011g gVar, long j) {
        if (gVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (gVar != this) {
            C2003G.m7625a(gVar.f5928c, 0, j);
            while (j > 0) {
                C2033z zVar = gVar.f5927b;
                if (j < ((long) (zVar.f5977c - zVar.f5976b))) {
                    C2033z zVar2 = this.f5927b;
                    C2033z zVar3 = zVar2 != null ? zVar2.f5981g : null;
                    if (zVar3 != null && zVar3.f5979e) {
                        if ((((long) zVar3.f5977c) + j) - ((long) (zVar3.f5978d ? 0 : zVar3.f5976b)) <= 8192) {
                            gVar.f5927b.mo7197a(zVar3, (int) j);
                            gVar.f5928c -= j;
                            this.f5928c += j;
                            return;
                        }
                    }
                    gVar.f5927b = gVar.f5927b.mo7194a((int) j);
                }
                C2033z zVar4 = gVar.f5927b;
                long j2 = (long) (zVar4.f5977c - zVar4.f5976b);
                gVar.f5927b = zVar4.mo7198b();
                C2033z zVar5 = this.f5927b;
                if (zVar5 == null) {
                    this.f5927b = zVar4;
                    C2033z zVar6 = this.f5927b;
                    zVar6.f5981g = zVar6;
                    zVar6.f5980f = zVar6;
                } else {
                    zVar5.f5981g.mo7195a(zVar4);
                    zVar4.mo7196a();
                }
                gVar.f5928c -= j2;
                this.f5928c += j2;
                j -= j2;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    public C2011g writeByte(int i) {
        C2033z b = mo7113b(1);
        byte[] bArr = b.f5975a;
        int i2 = b.f5977c;
        b.f5977c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f5928c++;
        return this;
    }

    public C2011g writeInt(int i) {
        C2033z b = mo7113b(4);
        byte[] bArr = b.f5975a;
        int i2 = b.f5977c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) (i & 255);
        b.f5977c = i6;
        this.f5928c += 4;
        return this;
    }

    public C2011g writeShort(int i) {
        C2033z b = mo7113b(2);
        byte[] bArr = b.f5975a;
        int i2 = b.f5977c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i & 255);
        b.f5977c = i4;
        this.f5928c += 2;
        return this;
    }
}
