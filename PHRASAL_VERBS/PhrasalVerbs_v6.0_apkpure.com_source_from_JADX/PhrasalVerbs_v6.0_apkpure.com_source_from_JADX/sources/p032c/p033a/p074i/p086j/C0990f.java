package p032c.p033a.p074i.p086j;

/* renamed from: c.a.i.j.f */
public class C0990f implements C0991g {

    /* renamed from: a */
    public static final C0991g f3456a = m4435a(Integer.MAX_VALUE, true, true);

    /* renamed from: b */
    int f3457b;

    /* renamed from: c */
    boolean f3458c;

    /* renamed from: d */
    boolean f3459d;

    private C0990f(int i, boolean z, boolean z2) {
        this.f3457b = i;
        this.f3458c = z;
        this.f3459d = z2;
    }

    /* renamed from: a */
    public static C0991g m4435a(int i, boolean z, boolean z2) {
        return new C0990f(i, z, z2);
    }

    /* renamed from: a */
    public boolean mo4227a() {
        return this.f3459d;
    }

    /* renamed from: b */
    public boolean mo4228b() {
        return this.f3458c;
    }

    /* renamed from: c */
    public int mo4229c() {
        return this.f3457b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0990f)) {
            return false;
        }
        C0990f fVar = (C0990f) obj;
        if (!(this.f3457b == fVar.f3457b && this.f3458c == fVar.f3458c && this.f3459d == fVar.f3459d)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int i2 = this.f3457b ^ (this.f3458c ? 4194304 : 0);
        if (this.f3459d) {
            i = 8388608;
        }
        return i2 ^ i;
    }
}
