package p032c.p033a.p074i.p081e;

import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p049k.C0754b;

/* renamed from: c.a.i.e.e */
public class C0942e {

    /* renamed from: a */
    public final int f3242a;

    /* renamed from: b */
    public final int f3243b;

    /* renamed from: c */
    public final float f3244c;

    /* renamed from: d */
    public final float f3245d;

    public C0942e(int i, int i2) {
        this(i, i2, 2048.0f);
    }

    public C0942e(int i, int i2, float f) {
        this(i, i2, f, 0.6666667f);
    }

    public C0942e(int i, int i2, float f, float f2) {
        boolean z = true;
        C0718j.m3243a(i > 0);
        if (i2 <= 0) {
            z = false;
        }
        C0718j.m3243a(z);
        this.f3242a = i;
        this.f3243b = i2;
        this.f3244c = f;
        this.f3245d = f2;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0942e)) {
            return false;
        }
        C0942e eVar = (C0942e) obj;
        if (!(this.f3242a == eVar.f3242a && this.f3243b == eVar.f3243b)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C0754b.m3364a(this.f3242a, this.f3243b);
    }

    public String toString() {
        return String.format(null, "%dx%d", new Object[]{Integer.valueOf(this.f3242a), Integer.valueOf(this.f3243b)});
    }
}
