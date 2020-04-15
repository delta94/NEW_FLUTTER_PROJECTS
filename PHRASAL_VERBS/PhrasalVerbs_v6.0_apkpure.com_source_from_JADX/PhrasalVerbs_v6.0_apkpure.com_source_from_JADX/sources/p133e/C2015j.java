package p133e;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: e.j */
public class C2015j implements Serializable, Comparable<C2015j> {

    /* renamed from: a */
    static final char[] f5936a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    public static final C2015j f5937b = m7719a(new byte[0]);

    /* renamed from: c */
    final byte[] f5938c;

    /* renamed from: d */
    transient int f5939d;

    /* renamed from: e */
    transient String f5940e;

    C2015j(byte[] bArr) {
        this.f5938c = bArr;
    }

    /* renamed from: a */
    private static int m7715a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected hex digit: ");
                sb.append(c);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: a */
    static int m7716a(String str, int i) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            if (i3 == i) {
                return i2;
            }
            int codePointAt = str.codePointAt(i2);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i3++;
            i2 += Character.charCount(codePointAt);
        }
        return str.length();
    }

    /* renamed from: a */
    public static C2015j m7717a(String str) {
        if (str != null) {
            byte[] a = C2008d.m7631a(str);
            if (a != null) {
                return new C2015j(a);
            }
            return null;
        }
        throw new IllegalArgumentException("base64 == null");
    }

    /* renamed from: a */
    public static C2015j m7718a(String str, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        } else if (charset != null) {
            return new C2015j(str.getBytes(charset));
        } else {
            throw new IllegalArgumentException("charset == null");
        }
    }

    /* renamed from: a */
    public static C2015j m7719a(byte... bArr) {
        if (bArr != null) {
            return new C2015j((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    /* renamed from: b */
    public static C2015j m7720b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        } else if (str.length() % 2 == 0) {
            byte[] bArr = new byte[(str.length() / 2)];
            for (int i = 0; i < bArr.length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((m7715a(str.charAt(i2)) << 4) + m7715a(str.charAt(i2 + 1)));
            }
            return m7719a(bArr);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected hex string: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: c */
    public static C2015j m7721c(String str) {
        if (str != null) {
            C2015j jVar = new C2015j(str.getBytes(C2003G.f5917a));
            jVar.f5940e = str;
            return jVar;
        }
        throw new IllegalArgumentException("s == null");
    }

    /* renamed from: d */
    private C2015j m7722d(String str) {
        try {
            return m7719a(MessageDigest.getInstance(str).digest(this.f5938c));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public byte mo7036a(int i) {
        return this.f5938c[i];
    }

    /* renamed from: a */
    public int compareTo(C2015j jVar) {
        int g = mo7048g();
        int g2 = jVar.mo7048g();
        int min = Math.min(g, g2);
        int i = 0;
        while (true) {
            int i2 = -1;
            if (i < min) {
                byte a = mo7036a(i) & 255;
                byte a2 = jVar.mo7036a(i) & 255;
                if (a == a2) {
                    i++;
                } else {
                    if (a >= a2) {
                        i2 = 1;
                    }
                    return i2;
                }
            } else if (g == g2) {
                return 0;
            } else {
                if (g >= g2) {
                    i2 = 1;
                }
                return i2;
            }
        }
    }

    /* renamed from: a */
    public C2015j mo7037a(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.f5938c;
            if (i2 <= bArr.length) {
                int i3 = i2 - i;
                if (i3 < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (i == 0 && i2 == bArr.length) {
                    return this;
                } else {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(this.f5938c, i, bArr2, 0, i3);
                    return new C2015j(bArr2);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("endIndex > length(");
                sb.append(this.f5938c.length);
                sb.append(")");
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }

    /* renamed from: a */
    public String mo7038a() {
        return C2008d.m7629a(this.f5938c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7039a(C2011g gVar) {
        byte[] bArr = this.f5938c;
        gVar.write(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public boolean mo7040a(int i, C2015j jVar, int i2, int i3) {
        return jVar.mo7041a(i2, this.f5938c, i, i3);
    }

    /* renamed from: a */
    public boolean mo7041a(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.f5938c;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C2003G.m7627a(bArr2, i, bArr, i2, i3)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public String mo7042b() {
        byte[] bArr = this.f5938c;
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f5936a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: b */
    public final boolean mo7163b(C2015j jVar) {
        return mo7040a(0, jVar, 0, jVar.mo7048g());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public byte[] mo7043c() {
        return this.f5938c;
    }

    /* renamed from: d */
    public C2015j mo7044d() {
        return m7722d("MD5");
    }

    /* renamed from: e */
    public C2015j mo7045e() {
        return m7722d("SHA-1");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r6.mo7041a(0, r3, 0, r3.length) != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof p133e.C2015j
            r2 = 0
            if (r1 == 0) goto L_0x001c
            e.j r6 = (p133e.C2015j) r6
            int r1 = r6.mo7048g()
            byte[] r3 = r5.f5938c
            int r4 = r3.length
            if (r1 != r4) goto L_0x001c
            int r1 = r3.length
            boolean r6 = r6.mo7041a(r2, r3, r2, r1)
            if (r6 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p133e.C2015j.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public C2015j mo7047f() {
        return m7722d("SHA-256");
    }

    /* renamed from: g */
    public int mo7048g() {
        return this.f5938c.length;
    }

    /* renamed from: h */
    public C2015j mo7049h() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f5938c;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b < 65 || b > 90) {
                i++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArr2[i2] = (byte) (b2 + 32);
                    }
                }
                return new C2015j(bArr2);
            }
        }
    }

    public int hashCode() {
        int i = this.f5939d;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f5938c);
        this.f5939d = hashCode;
        return hashCode;
    }

    /* renamed from: i */
    public byte[] mo7051i() {
        return (byte[]) this.f5938c.clone();
    }

    /* renamed from: j */
    public String mo7052j() {
        String str = this.f5940e;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f5938c, C2003G.f5917a);
        this.f5940e = str2;
        return str2;
    }

    public String toString() {
        StringBuilder sb;
        StringBuilder sb2;
        if (this.f5938c.length == 0) {
            return "[size=0]";
        }
        String j = mo7052j();
        int a = m7716a(j, 64);
        String str = "…]";
        String str2 = "[size=";
        String str3 = "]";
        if (a == -1) {
            if (this.f5938c.length <= 64) {
                sb2 = new StringBuilder();
                sb2.append("[hex=");
                sb2.append(mo7042b());
                sb2.append(str3);
            } else {
                sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(this.f5938c.length);
                sb2.append(" hex=");
                sb2.append(mo7037a(0, 64).mo7042b());
                sb2.append(str);
            }
            return sb2.toString();
        }
        String replace = j.substring(0, a).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (a < j.length()) {
            sb = new StringBuilder();
            sb.append(str2);
            sb.append(this.f5938c.length);
            sb.append(" text=");
            sb.append(replace);
            sb.append(str);
        } else {
            sb = new StringBuilder();
            sb.append("[text=");
            sb.append(replace);
            sb.append(str3);
        }
        return sb.toString();
    }
}
