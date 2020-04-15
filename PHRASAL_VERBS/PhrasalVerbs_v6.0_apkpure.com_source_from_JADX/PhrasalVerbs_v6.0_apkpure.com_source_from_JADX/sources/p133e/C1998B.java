package p133e;

import java.util.Arrays;

/* renamed from: e.B */
final class C1998B extends C2015j {

    /* renamed from: f */
    final transient byte[][] f5915f;

    /* renamed from: g */
    final transient int[] f5916g;

    C1998B(C2011g gVar, int i) {
        super(null);
        C2003G.m7625a(gVar.f5928c, 0, (long) i);
        int i2 = 0;
        C2033z zVar = gVar.f5927b;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = zVar.f5977c;
            int i6 = zVar.f5976b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                zVar = zVar.f5980f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f5915f = new byte[i4][];
        this.f5916g = new int[(i4 * 2)];
        C2033z zVar2 = gVar.f5927b;
        int i7 = 0;
        while (i2 < i) {
            this.f5915f[i7] = zVar2.f5975a;
            i2 += zVar2.f5977c - zVar2.f5976b;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.f5916g;
            iArr[i7] = i2;
            iArr[this.f5915f.length + i7] = zVar2.f5976b;
            zVar2.f5978d = true;
            i7++;
            zVar2 = zVar2.f5980f;
        }
    }

    /* renamed from: b */
    private int m7606b(int i) {
        int binarySearch = Arrays.binarySearch(this.f5916g, 0, this.f5915f.length, i + 1);
        return binarySearch >= 0 ? binarySearch : binarySearch ^ -1;
    }

    /* renamed from: k */
    private C2015j m7607k() {
        return new C2015j(mo7051i());
    }

    /* renamed from: a */
    public byte mo7036a(int i) {
        C2003G.m7625a((long) this.f5916g[this.f5915f.length - 1], (long) i, 1);
        int b = m7606b(i);
        int i2 = b == 0 ? 0 : this.f5916g[b - 1];
        int[] iArr = this.f5916g;
        byte[][] bArr = this.f5915f;
        return bArr[b][(i - i2) + iArr[bArr.length + b]];
    }

    /* renamed from: a */
    public C2015j mo7037a(int i, int i2) {
        return m7607k().mo7037a(i, i2);
    }

    /* renamed from: a */
    public String mo7038a() {
        return m7607k().mo7038a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7039a(C2011g gVar) {
        int length = this.f5915f.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f5916g;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            C2033z zVar = new C2033z(this.f5915f[i], i3, (i3 + i4) - i2, true, false);
            C2033z zVar2 = gVar.f5927b;
            if (zVar2 == null) {
                zVar.f5981g = zVar;
                zVar.f5980f = zVar;
                gVar.f5927b = zVar;
            } else {
                zVar2.f5981g.mo7195a(zVar);
            }
            i++;
            i2 = i4;
        }
        gVar.f5928c += (long) i2;
    }

    /* renamed from: a */
    public boolean mo7040a(int i, C2015j jVar, int i2, int i3) {
        if (i < 0 || i > mo7048g() - i3) {
            return false;
        }
        int b = m7606b(i);
        while (i3 > 0) {
            int i4 = b == 0 ? 0 : this.f5916g[b - 1];
            int min = Math.min(i3, ((this.f5916g[b] - i4) + i4) - i);
            int[] iArr = this.f5916g;
            byte[][] bArr = this.f5915f;
            if (!jVar.mo7041a(i2, bArr[b], (i - i4) + iArr[bArr.length + b], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo7041a(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > mo7048g() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int b = m7606b(i);
        while (i3 > 0) {
            int i4 = b == 0 ? 0 : this.f5916g[b - 1];
            int min = Math.min(i3, ((this.f5916g[b] - i4) + i4) - i);
            int[] iArr = this.f5916g;
            byte[][] bArr2 = this.f5915f;
            if (!C2003G.m7627a(bArr2[b], (i - i4) + iArr[bArr2.length + b], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }

    /* renamed from: b */
    public String mo7042b() {
        return m7607k().mo7042b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public byte[] mo7043c() {
        return mo7051i();
    }

    /* renamed from: d */
    public C2015j mo7044d() {
        return m7607k().mo7044d();
    }

    /* renamed from: e */
    public C2015j mo7045e() {
        return m7607k().mo7045e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (mo7040a(0, r5, 0, mo7048g()) != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof p133e.C2015j
            r2 = 0
            if (r1 == 0) goto L_0x0020
            e.j r5 = (p133e.C2015j) r5
            int r1 = r5.mo7048g()
            int r3 = r4.mo7048g()
            if (r1 != r3) goto L_0x0020
            int r1 = r4.mo7048g()
            boolean r5 = r4.mo7040a(r2, r5, r2, r1)
            if (r5 == 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p133e.C1998B.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public C2015j mo7047f() {
        return m7607k().mo7047f();
    }

    /* renamed from: g */
    public int mo7048g() {
        return this.f5916g[this.f5915f.length - 1];
    }

    /* renamed from: h */
    public C2015j mo7049h() {
        return m7607k().mo7049h();
    }

    public int hashCode() {
        int i = this.f5939d;
        if (i != 0) {
            return i;
        }
        int length = this.f5915f.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            byte[] bArr = this.f5915f[i2];
            int[] iArr = this.f5916g;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f5939d = i3;
        return i3;
    }

    /* renamed from: i */
    public byte[] mo7051i() {
        int[] iArr = this.f5916g;
        byte[][] bArr = this.f5915f;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.f5916g;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f5915f[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    /* renamed from: j */
    public String mo7052j() {
        return m7607k().mo7052j();
    }

    public String toString() {
        return m7607k().toString();
    }
}
