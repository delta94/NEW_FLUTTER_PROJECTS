package p032c.p033a.p074i.p091o;

import android.net.Uri;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p049k.C0758f;
import p032c.p033a.p074i.p081e.C0938a;
import p032c.p033a.p074i.p081e.C0939b;
import p032c.p033a.p074i.p081e.C0941d;
import p032c.p033a.p074i.p081e.C0942e;
import p032c.p033a.p074i.p081e.C0943f;
import p032c.p033a.p074i.p082f.C0956l;
import p032c.p033a.p074i.p087k.C0994c;
import p032c.p033a.p074i.p091o.C1114c.C1115a;
import p032c.p033a.p074i.p091o.C1114c.C1116b;

/* renamed from: c.a.i.o.d */
public class C1117d {

    /* renamed from: a */
    private Uri f3764a = null;

    /* renamed from: b */
    private C1116b f3765b = C1116b.FULL_FETCH;

    /* renamed from: c */
    private C0942e f3766c = null;

    /* renamed from: d */
    private C0943f f3767d = null;

    /* renamed from: e */
    private C0939b f3768e = C0939b.m4131a();

    /* renamed from: f */
    private C1115a f3769f = C1115a.DEFAULT;

    /* renamed from: g */
    private boolean f3770g = C0956l.m4189f().mo4113a();

    /* renamed from: h */
    private boolean f3771h = false;

    /* renamed from: i */
    private C0941d f3772i = C0941d.HIGH;

    /* renamed from: j */
    private C1119e f3773j = null;

    /* renamed from: k */
    private boolean f3774k = true;

    /* renamed from: l */
    private boolean f3775l = true;

    /* renamed from: m */
    private C0994c f3776m;

    /* renamed from: n */
    private C0938a f3777n = null;

    /* renamed from: c.a.i.o.d$a */
    public static class C1118a extends RuntimeException {
        public C1118a(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid request builder: ");
            sb.append(str);
            super(sb.toString());
        }
    }

    private C1117d() {
    }

    /* renamed from: a */
    public static C1117d m4986a(Uri uri) {
        C1117d dVar = new C1117d();
        dVar.mo4390b(uri);
        return dVar;
    }

    /* renamed from: a */
    public static C1117d m4987a(C1114c cVar) {
        C1117d a = m4986a(cVar.mo4372o());
        a.mo4380a(cVar.mo4358c());
        a.mo4379a(cVar.mo4356a());
        a.mo4385a(cVar.mo4357b());
        a.mo4391b(cVar.mo4359d());
        a.mo4386a(cVar.mo4360e());
        a.mo4387a(cVar.mo4362f());
        a.mo4393c(cVar.mo4367j());
        a.mo4381a(cVar.mo4366i());
        a.mo4382a(cVar.mo4369l());
        a.mo4384a(cVar.mo4368k());
        a.mo4383a(cVar.mo4370m());
        return a;
    }

    /* renamed from: a */
    public C1114c mo4378a() {
        mo4406p();
        return new C1114c(this);
    }

    /* renamed from: a */
    public C1117d mo4379a(C0938a aVar) {
        this.f3777n = aVar;
        return this;
    }

    /* renamed from: a */
    public C1117d mo4380a(C0939b bVar) {
        this.f3768e = bVar;
        return this;
    }

    /* renamed from: a */
    public C1117d mo4381a(C0941d dVar) {
        this.f3772i = dVar;
        return this;
    }

    /* renamed from: a */
    public C1117d mo4382a(C0942e eVar) {
        this.f3766c = eVar;
        return this;
    }

    /* renamed from: a */
    public C1117d mo4383a(C0943f fVar) {
        this.f3767d = fVar;
        return this;
    }

    /* renamed from: a */
    public C1117d mo4384a(C0994c cVar) {
        this.f3776m = cVar;
        return this;
    }

    /* renamed from: a */
    public C1117d mo4385a(C1115a aVar) {
        this.f3769f = aVar;
        return this;
    }

    /* renamed from: a */
    public C1117d mo4386a(C1116b bVar) {
        this.f3765b = bVar;
        return this;
    }

    /* renamed from: a */
    public C1117d mo4387a(C1119e eVar) {
        this.f3773j = eVar;
        return this;
    }

    @Deprecated
    /* renamed from: a */
    public C1117d mo4388a(boolean z) {
        mo4383a(z ? C0943f.m4142a() : C0943f.m4144d());
        return this;
    }

    /* renamed from: b */
    public C0938a mo4389b() {
        return this.f3777n;
    }

    /* renamed from: b */
    public C1117d mo4390b(Uri uri) {
        C0718j.m3240a(uri);
        this.f3764a = uri;
        return this;
    }

    /* renamed from: b */
    public C1117d mo4391b(boolean z) {
        this.f3771h = z;
        return this;
    }

    /* renamed from: c */
    public C1115a mo4392c() {
        return this.f3769f;
    }

    /* renamed from: c */
    public C1117d mo4393c(boolean z) {
        this.f3770g = z;
        return this;
    }

    /* renamed from: d */
    public C0939b mo4394d() {
        return this.f3768e;
    }

    /* renamed from: e */
    public C1116b mo4395e() {
        return this.f3765b;
    }

    /* renamed from: f */
    public C1119e mo4396f() {
        return this.f3773j;
    }

    /* renamed from: g */
    public C0994c mo4397g() {
        return this.f3776m;
    }

    /* renamed from: h */
    public C0941d mo4398h() {
        return this.f3772i;
    }

    /* renamed from: i */
    public C0942e mo4399i() {
        return this.f3766c;
    }

    /* renamed from: j */
    public C0943f mo4400j() {
        return this.f3767d;
    }

    /* renamed from: k */
    public Uri mo4401k() {
        return this.f3764a;
    }

    /* renamed from: l */
    public boolean mo4402l() {
        return this.f3774k && C0758f.m3381i(this.f3764a);
    }

    /* renamed from: m */
    public boolean mo4403m() {
        return this.f3771h;
    }

    /* renamed from: n */
    public boolean mo4404n() {
        return this.f3775l;
    }

    /* renamed from: o */
    public boolean mo4405o() {
        return this.f3770g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo4406p() {
        Uri uri = this.f3764a;
        if (uri != null) {
            if (C0758f.m3380h(uri)) {
                if (!this.f3764a.isAbsolute()) {
                    throw new C1118a("Resource URI path must be absolute.");
                } else if (!this.f3764a.getPath().isEmpty()) {
                    try {
                        Integer.parseInt(this.f3764a.getPath().substring(1));
                    } catch (NumberFormatException unused) {
                        throw new C1118a("Resource URI path must be a resource id.");
                    }
                } else {
                    throw new C1118a("Resource URI must not be empty");
                }
            }
            if (C0758f.m3375c(this.f3764a) && !this.f3764a.isAbsolute()) {
                throw new C1118a("Asset URI path must be absolute.");
            }
            return;
        }
        throw new C1118a("Source must be set!");
    }
}
