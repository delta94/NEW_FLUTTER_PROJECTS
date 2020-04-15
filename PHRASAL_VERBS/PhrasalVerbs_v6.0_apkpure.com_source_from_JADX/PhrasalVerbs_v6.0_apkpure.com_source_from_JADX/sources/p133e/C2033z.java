package p133e;

/* renamed from: e.z */
final class C2033z {

    /* renamed from: a */
    final byte[] f5975a;

    /* renamed from: b */
    int f5976b;

    /* renamed from: c */
    int f5977c;

    /* renamed from: d */
    boolean f5978d;

    /* renamed from: e */
    boolean f5979e;

    /* renamed from: f */
    C2033z f5980f;

    /* renamed from: g */
    C2033z f5981g;

    C2033z() {
        this.f5975a = new byte[8192];
        this.f5979e = true;
        this.f5978d = false;
    }

    C2033z(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f5975a = bArr;
        this.f5976b = i;
        this.f5977c = i2;
        this.f5978d = z;
        this.f5979e = z2;
    }

    /* renamed from: a */
    public final C2033z mo7194a(int i) {
        C2033z zVar;
        if (i <= 0 || i > this.f5977c - this.f5976b) {
            throw new IllegalArgumentException();
        }
        if (i >= 1024) {
            zVar = mo7199c();
        } else {
            zVar = C1997A.m7604a();
            System.arraycopy(this.f5975a, this.f5976b, zVar.f5975a, 0, i);
        }
        zVar.f5977c = zVar.f5976b + i;
        this.f5976b += i;
        this.f5981g.mo7195a(zVar);
        return zVar;
    }

    /* renamed from: a */
    public final C2033z mo7195a(C2033z zVar) {
        zVar.f5981g = this;
        zVar.f5980f = this.f5980f;
        this.f5980f.f5981g = zVar;
        this.f5980f = zVar;
        return zVar;
    }

    /* renamed from: a */
    public final void mo7196a() {
        C2033z zVar = this.f5981g;
        if (zVar == this) {
            throw new IllegalStateException();
        } else if (zVar.f5979e) {
            int i = this.f5977c - this.f5976b;
            if (i <= (8192 - zVar.f5977c) + (zVar.f5978d ? 0 : zVar.f5976b)) {
                mo7197a(this.f5981g, i);
                mo7198b();
                C1997A.m7605a(this);
            }
        }
    }

    /* renamed from: a */
    public final void mo7197a(C2033z zVar, int i) {
        if (zVar.f5979e) {
            int i2 = zVar.f5977c;
            if (i2 + i > 8192) {
                if (!zVar.f5978d) {
                    int i3 = i2 + i;
                    int i4 = zVar.f5976b;
                    if (i3 - i4 <= 8192) {
                        byte[] bArr = zVar.f5975a;
                        System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
                        zVar.f5977c -= zVar.f5976b;
                        zVar.f5976b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f5975a, this.f5976b, zVar.f5975a, zVar.f5977c, i);
            zVar.f5977c += i;
            this.f5976b += i;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public final C2033z mo7198b() {
        C2033z zVar = this.f5980f;
        if (zVar == this) {
            zVar = null;
        }
        C2033z zVar2 = this.f5981g;
        zVar2.f5980f = this.f5980f;
        this.f5980f.f5981g = zVar2;
        this.f5980f = null;
        this.f5981g = null;
        return zVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final C2033z mo7199c() {
        this.f5978d = true;
        C2033z zVar = new C2033z(this.f5975a, this.f5976b, this.f5977c, true, false);
        return zVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final C2033z mo7200d() {
        C2033z zVar = new C2033z((byte[]) this.f5975a.clone(), this.f5976b, this.f5977c, false, true);
        return zVar;
    }
}
