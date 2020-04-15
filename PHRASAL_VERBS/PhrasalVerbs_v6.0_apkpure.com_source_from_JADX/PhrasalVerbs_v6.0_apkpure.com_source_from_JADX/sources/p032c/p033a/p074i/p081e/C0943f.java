package p032c.p033a.p074i.p081e;

import p032c.p033a.p038c.p049k.C0754b;

/* renamed from: c.a.i.e.f */
public class C0943f {

    /* renamed from: a */
    private static final C0943f f3246a = new C0943f(-1, false);

    /* renamed from: b */
    private static final C0943f f3247b = new C0943f(-2, false);

    /* renamed from: c */
    private static final C0943f f3248c = new C0943f(-1, true);

    /* renamed from: d */
    private final int f3249d;

    /* renamed from: e */
    private final boolean f3250e;

    private C0943f(int i, boolean z) {
        this.f3249d = i;
        this.f3250e = z;
    }

    /* renamed from: a */
    public static C0943f m4142a() {
        return f3246a;
    }

    /* renamed from: b */
    public static C0943f m4143b() {
        return f3248c;
    }

    /* renamed from: d */
    public static C0943f m4144d() {
        return f3247b;
    }

    /* renamed from: c */
    public boolean mo4056c() {
        return this.f3250e;
    }

    /* renamed from: e */
    public int mo4057e() {
        if (!mo4060g()) {
            return this.f3249d;
        }
        throw new IllegalStateException("Rotation is set to use EXIF");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0943f)) {
            return false;
        }
        C0943f fVar = (C0943f) obj;
        if (!(this.f3249d == fVar.f3249d && this.f3250e == fVar.f3250e)) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public boolean mo4059f() {
        return this.f3249d != -2;
    }

    /* renamed from: g */
    public boolean mo4060g() {
        return this.f3249d == -1;
    }

    public int hashCode() {
        return C0754b.m3366a((Object) Integer.valueOf(this.f3249d), (Object) Boolean.valueOf(this.f3250e));
    }

    public String toString() {
        return String.format(null, "%d defer:%b", new Object[]{Integer.valueOf(this.f3249d), Boolean.valueOf(this.f3250e)});
    }
}
