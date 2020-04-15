package p032c.p033a.p074i.p081e;

import android.graphics.Bitmap.Config;
import p032c.p033a.p074i.p084h.C0976d;

/* renamed from: c.a.i.e.b */
public class C0939b {

    /* renamed from: a */
    private static final C0939b f3223a = m4132b().mo4045a();

    /* renamed from: b */
    public final int f3224b;

    /* renamed from: c */
    public final boolean f3225c;

    /* renamed from: d */
    public final boolean f3226d;

    /* renamed from: e */
    public final boolean f3227e;

    /* renamed from: f */
    public final boolean f3228f;

    /* renamed from: g */
    public final Config f3229g;

    /* renamed from: h */
    public final C0976d f3230h;

    public C0939b(C0940c cVar) {
        this.f3224b = cVar.mo4051g();
        this.f3225c = cVar.mo4049e();
        this.f3226d = cVar.mo4052h();
        this.f3227e = cVar.mo4048d();
        this.f3228f = cVar.mo4050f();
        this.f3229g = cVar.mo4046b();
        this.f3230h = cVar.mo4047c();
    }

    /* renamed from: a */
    public static C0939b m4131a() {
        return f3223a;
    }

    /* renamed from: b */
    public static C0940c m4132b() {
        return new C0940c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0939b.class != obj.getClass()) {
            return false;
        }
        C0939b bVar = (C0939b) obj;
        return this.f3225c == bVar.f3225c && this.f3226d == bVar.f3226d && this.f3227e == bVar.f3227e && this.f3228f == bVar.f3228f && this.f3229g == bVar.f3229g && this.f3230h == bVar.f3230h;
    }

    public int hashCode() {
        int ordinal = ((((((((((this.f3224b * 31) + (this.f3225c ? 1 : 0)) * 31) + (this.f3226d ? 1 : 0)) * 31) + (this.f3227e ? 1 : 0)) * 31) + (this.f3228f ? 1 : 0)) * 31) + this.f3229g.ordinal()) * 31;
        C0976d dVar = this.f3230h;
        return ordinal + (dVar != null ? dVar.hashCode() : 0);
    }

    public String toString() {
        return String.format(null, "%d-%b-%b-%b-%b-%s-%s", new Object[]{Integer.valueOf(this.f3224b), Boolean.valueOf(this.f3225c), Boolean.valueOf(this.f3226d), Boolean.valueOf(this.f3227e), Boolean.valueOf(this.f3228f), this.f3229g.name(), this.f3230h});
    }
}
