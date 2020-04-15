package p032c.p033a.p074i.p091o;

import android.net.Uri;
import java.io.File;
import p032c.p033a.p035b.p036a.C0657d;
import p032c.p033a.p038c.p042d.C0715i;
import p032c.p033a.p038c.p042d.C0715i.C0716a;
import p032c.p033a.p038c.p044f.C0730a;
import p032c.p033a.p038c.p049k.C0758f;
import p032c.p033a.p074i.p081e.C0938a;
import p032c.p033a.p074i.p081e.C0939b;
import p032c.p033a.p074i.p081e.C0941d;
import p032c.p033a.p074i.p081e.C0942e;
import p032c.p033a.p074i.p081e.C0943f;
import p032c.p033a.p074i.p087k.C0994c;

/* renamed from: c.a.i.o.c */
public class C1114c {

    /* renamed from: a */
    private final C1115a f3739a;

    /* renamed from: b */
    private final Uri f3740b;

    /* renamed from: c */
    private final int f3741c = m4965a(this.f3740b);

    /* renamed from: d */
    private File f3742d;

    /* renamed from: e */
    private final boolean f3743e;

    /* renamed from: f */
    private final boolean f3744f;

    /* renamed from: g */
    private final C0939b f3745g;

    /* renamed from: h */
    private final C0942e f3746h;

    /* renamed from: i */
    private final C0943f f3747i;

    /* renamed from: j */
    private final C0938a f3748j;

    /* renamed from: k */
    private final C0941d f3749k;

    /* renamed from: l */
    private final C1116b f3750l;

    /* renamed from: m */
    private final boolean f3751m;

    /* renamed from: n */
    private final boolean f3752n;

    /* renamed from: o */
    private final C1119e f3753o;

    /* renamed from: p */
    private final C0994c f3754p;

    /* renamed from: c.a.i.o.c$a */
    public enum C1115a {
        SMALL,
        DEFAULT
    }

    /* renamed from: c.a.i.o.c$b */
    public enum C1116b {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);
        

        /* renamed from: f */
        private int f3763f;

        private C1116b(int i) {
            this.f3763f = i;
        }

        /* renamed from: a */
        public static C1116b m4984a(C1116b bVar, C1116b bVar2) {
            return bVar.mo4377a() > bVar2.mo4377a() ? bVar : bVar2;
        }

        /* renamed from: a */
        public int mo4377a() {
            return this.f3763f;
        }
    }

    protected C1114c(C1117d dVar) {
        this.f3739a = dVar.mo4392c();
        this.f3740b = dVar.mo4401k();
        this.f3743e = dVar.mo4405o();
        this.f3744f = dVar.mo4403m();
        this.f3745g = dVar.mo4394d();
        this.f3746h = dVar.mo4399i();
        this.f3747i = dVar.mo4400j() == null ? C0943f.m4142a() : dVar.mo4400j();
        this.f3748j = dVar.mo4389b();
        this.f3749k = dVar.mo4398h();
        this.f3750l = dVar.mo4395e();
        this.f3751m = dVar.mo4402l();
        this.f3752n = dVar.mo4404n();
        this.f3753o = dVar.mo4396f();
        this.f3754p = dVar.mo4397g();
    }

    /* renamed from: a */
    private static int m4965a(Uri uri) {
        if (uri == null) {
            return -1;
        }
        if (C0758f.m3381i(uri)) {
            return 0;
        }
        if (C0758f.m3379g(uri)) {
            return C0730a.m3314b(C0730a.m3313a(uri.getPath())) ? 2 : 3;
        }
        if (C0758f.m3378f(uri)) {
            return 4;
        }
        if (C0758f.m3375c(uri)) {
            return 5;
        }
        if (C0758f.m3380h(uri)) {
            return 6;
        }
        if (C0758f.m3374b(uri)) {
            return 7;
        }
        return C0758f.m3382j(uri) ? 8 : -1;
    }

    /* renamed from: a */
    public C0938a mo4356a() {
        return this.f3748j;
    }

    /* renamed from: b */
    public C1115a mo4357b() {
        return this.f3739a;
    }

    /* renamed from: c */
    public C0939b mo4358c() {
        return this.f3745g;
    }

    /* renamed from: d */
    public boolean mo4359d() {
        return this.f3744f;
    }

    /* renamed from: e */
    public C1116b mo4360e() {
        return this.f3750l;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1114c)) {
            return false;
        }
        C1114c cVar = (C1114c) obj;
        if (!C0715i.m3232a(this.f3740b, cVar.f3740b) || !C0715i.m3232a(this.f3739a, cVar.f3739a) || !C0715i.m3232a(this.f3742d, cVar.f3742d) || !C0715i.m3232a(this.f3748j, cVar.f3748j) || !C0715i.m3232a(this.f3745g, cVar.f3745g) || !C0715i.m3232a(this.f3746h, cVar.f3746h) || !C0715i.m3232a(this.f3747i, cVar.f3747i)) {
            return false;
        }
        C1119e eVar = this.f3753o;
        C0657d dVar = null;
        Object a = eVar != null ? eVar.mo4246a() : null;
        C1119e eVar2 = cVar.f3753o;
        if (eVar2 != null) {
            dVar = eVar2.mo4246a();
        }
        return C0715i.m3232a(a, dVar);
    }

    /* renamed from: f */
    public C1119e mo4362f() {
        return this.f3753o;
    }

    /* renamed from: g */
    public int mo4363g() {
        C0942e eVar = this.f3746h;
        if (eVar != null) {
            return eVar.f3243b;
        }
        return 2048;
    }

    /* renamed from: h */
    public int mo4364h() {
        C0942e eVar = this.f3746h;
        if (eVar != null) {
            return eVar.f3242a;
        }
        return 2048;
    }

    public int hashCode() {
        C1119e eVar = this.f3753o;
        return C0715i.m3229a(this.f3739a, this.f3740b, this.f3742d, this.f3748j, this.f3745g, this.f3746h, this.f3747i, eVar != null ? eVar.mo4246a() : null);
    }

    /* renamed from: i */
    public C0941d mo4366i() {
        return this.f3749k;
    }

    /* renamed from: j */
    public boolean mo4367j() {
        return this.f3743e;
    }

    /* renamed from: k */
    public C0994c mo4368k() {
        return this.f3754p;
    }

    /* renamed from: l */
    public C0942e mo4369l() {
        return this.f3746h;
    }

    /* renamed from: m */
    public C0943f mo4370m() {
        return this.f3747i;
    }

    /* renamed from: n */
    public synchronized File mo4371n() {
        if (this.f3742d == null) {
            this.f3742d = new File(this.f3740b.getPath());
        }
        return this.f3742d;
    }

    /* renamed from: o */
    public Uri mo4372o() {
        return this.f3740b;
    }

    /* renamed from: p */
    public int mo4373p() {
        return this.f3741c;
    }

    /* renamed from: q */
    public boolean mo4374q() {
        return this.f3751m;
    }

    /* renamed from: r */
    public boolean mo4375r() {
        return this.f3752n;
    }

    public String toString() {
        C0716a a = C0715i.m3230a((Object) this);
        a.mo3471a("uri", (Object) this.f3740b);
        a.mo3471a("cacheChoice", (Object) this.f3739a);
        a.mo3471a("decodeOptions", (Object) this.f3745g);
        a.mo3471a("postprocessor", (Object) this.f3753o);
        a.mo3471a("priority", (Object) this.f3749k);
        a.mo3471a("resizeOptions", (Object) this.f3746h);
        a.mo3471a("rotationOptions", (Object) this.f3747i);
        a.mo3471a("bytesRange", (Object) this.f3748j);
        return a.toString();
    }
}
