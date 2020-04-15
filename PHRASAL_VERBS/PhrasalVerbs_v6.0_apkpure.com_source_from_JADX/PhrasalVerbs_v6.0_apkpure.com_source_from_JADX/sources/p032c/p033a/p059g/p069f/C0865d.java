package p032c.p033a.p059g.p069f;

import java.util.Arrays;
import p032c.p033a.p038c.p042d.C0718j;

/* renamed from: c.a.g.f.d */
public class C0865d {

    /* renamed from: a */
    private C0866a f3068a = C0866a.BITMAP_ONLY;

    /* renamed from: b */
    private boolean f3069b = false;

    /* renamed from: c */
    private float[] f3070c = null;

    /* renamed from: d */
    private int f3071d = 0;

    /* renamed from: e */
    private float f3072e = 0.0f;

    /* renamed from: f */
    private int f3073f = 0;

    /* renamed from: g */
    private float f3074g = 0.0f;

    /* renamed from: h */
    private boolean f3075h = false;

    /* renamed from: c.a.g.f.d$a */
    public enum C0866a {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    /* renamed from: a */
    public static C0865d m3862a(float f) {
        C0865d dVar = new C0865d();
        dVar.mo3889b(f);
        return dVar;
    }

    /* renamed from: i */
    private float[] m3863i() {
        if (this.f3070c == null) {
            this.f3070c = new float[8];
        }
        return this.f3070c;
    }

    /* renamed from: a */
    public int mo3883a() {
        return this.f3073f;
    }

    /* renamed from: a */
    public C0865d mo3884a(float f, float f2, float f3, float f4) {
        float[] i = m3863i();
        i[1] = f;
        i[0] = f;
        i[3] = f2;
        i[2] = f2;
        i[5] = f3;
        i[4] = f3;
        i[7] = f4;
        i[6] = f4;
        return this;
    }

    /* renamed from: a */
    public C0865d mo3885a(int i) {
        this.f3071d = i;
        this.f3068a = C0866a.OVERLAY_COLOR;
        return this;
    }

    /* renamed from: a */
    public C0865d mo3886a(int i, float f) {
        C0718j.m3244a(f >= 0.0f, (Object) "the border width cannot be < 0");
        this.f3072e = f;
        this.f3073f = i;
        return this;
    }

    /* renamed from: a */
    public C0865d mo3887a(C0866a aVar) {
        this.f3068a = aVar;
        return this;
    }

    /* renamed from: b */
    public float mo3888b() {
        return this.f3072e;
    }

    /* renamed from: b */
    public C0865d mo3889b(float f) {
        Arrays.fill(m3863i(), f);
        return this;
    }

    /* renamed from: c */
    public float[] mo3890c() {
        return this.f3070c;
    }

    /* renamed from: d */
    public int mo3891d() {
        return this.f3071d;
    }

    /* renamed from: e */
    public float mo3892e() {
        return this.f3074g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0865d.class != obj.getClass()) {
            return false;
        }
        C0865d dVar = (C0865d) obj;
        if (this.f3069b == dVar.f3069b && this.f3071d == dVar.f3071d && Float.compare(dVar.f3072e, this.f3072e) == 0 && this.f3073f == dVar.f3073f && Float.compare(dVar.f3074g, this.f3074g) == 0 && this.f3068a == dVar.f3068a && this.f3075h == dVar.f3075h) {
            return Arrays.equals(this.f3070c, dVar.f3070c);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo3894f() {
        return this.f3069b;
    }

    /* renamed from: g */
    public C0866a mo3895g() {
        return this.f3068a;
    }

    /* renamed from: h */
    public boolean mo3896h() {
        return this.f3075h;
    }

    public int hashCode() {
        C0866a aVar = this.f3068a;
        int i = 0;
        int hashCode = (((aVar != null ? aVar.hashCode() : 0) * 31) + (this.f3069b ? 1 : 0)) * 31;
        float[] fArr = this.f3070c;
        int hashCode2 = (((hashCode + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.f3071d) * 31;
        float f = this.f3072e;
        int floatToIntBits = (((hashCode2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31) + this.f3073f) * 31;
        float f2 = this.f3074g;
        if (f2 != 0.0f) {
            i = Float.floatToIntBits(f2);
        }
        return ((floatToIntBits + i) * 31) + (this.f3075h ? 1 : 0);
    }
}
