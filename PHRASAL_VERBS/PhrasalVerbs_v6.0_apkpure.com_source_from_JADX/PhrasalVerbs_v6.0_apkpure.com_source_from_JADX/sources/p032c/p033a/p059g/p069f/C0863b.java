package p032c.p033a.p059g.p069f;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import java.util.List;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p059g.p068e.C0845t.C0847b;

/* renamed from: c.a.g.f.b */
public class C0863b {

    /* renamed from: a */
    public static final C0847b f3045a = C0847b.f3026f;

    /* renamed from: b */
    public static final C0847b f3046b = C0847b.f3027g;

    /* renamed from: c */
    private Resources f3047c;

    /* renamed from: d */
    private int f3048d;

    /* renamed from: e */
    private float f3049e;

    /* renamed from: f */
    private Drawable f3050f;

    /* renamed from: g */
    private C0847b f3051g;

    /* renamed from: h */
    private Drawable f3052h;

    /* renamed from: i */
    private C0847b f3053i;

    /* renamed from: j */
    private Drawable f3054j;

    /* renamed from: k */
    private C0847b f3055k;

    /* renamed from: l */
    private Drawable f3056l;

    /* renamed from: m */
    private C0847b f3057m;

    /* renamed from: n */
    private C0847b f3058n;

    /* renamed from: o */
    private Matrix f3059o;

    /* renamed from: p */
    private PointF f3060p;

    /* renamed from: q */
    private ColorFilter f3061q;

    /* renamed from: r */
    private Drawable f3062r;

    /* renamed from: s */
    private List<Drawable> f3063s;

    /* renamed from: t */
    private Drawable f3064t;

    /* renamed from: u */
    private C0865d f3065u;

    public C0863b(Resources resources) {
        this.f3047c = resources;
        m3837s();
    }

    /* renamed from: a */
    public static C0863b m3836a(Resources resources) {
        return new C0863b(resources);
    }

    /* renamed from: s */
    private void m3837s() {
        this.f3048d = 300;
        this.f3049e = 0.0f;
        this.f3050f = null;
        C0847b bVar = f3045a;
        this.f3051g = bVar;
        this.f3052h = null;
        this.f3053i = bVar;
        this.f3054j = null;
        this.f3055k = bVar;
        this.f3056l = null;
        this.f3057m = bVar;
        this.f3058n = f3046b;
        this.f3059o = null;
        this.f3060p = null;
        this.f3061q = null;
        this.f3062r = null;
        this.f3063s = null;
        this.f3064t = null;
        this.f3065u = null;
    }

    /* renamed from: t */
    private void m3838t() {
        List<Drawable> list = this.f3063s;
        if (list != null) {
            for (Drawable a : list) {
                C0718j.m3240a(a);
            }
        }
    }

    /* renamed from: a */
    public C0862a mo3861a() {
        m3838t();
        return new C0862a(this);
    }

    /* renamed from: a */
    public C0863b mo3862a(int i) {
        this.f3048d = i;
        return this;
    }

    /* renamed from: a */
    public C0863b mo3863a(C0847b bVar) {
        this.f3058n = bVar;
        this.f3059o = null;
        return this;
    }

    /* renamed from: a */
    public C0863b mo3864a(C0865d dVar) {
        this.f3065u = dVar;
        return this;
    }

    /* renamed from: b */
    public ColorFilter mo3865b() {
        return this.f3061q;
    }

    /* renamed from: c */
    public PointF mo3866c() {
        return this.f3060p;
    }

    /* renamed from: d */
    public C0847b mo3867d() {
        return this.f3058n;
    }

    /* renamed from: e */
    public Drawable mo3868e() {
        return this.f3062r;
    }

    /* renamed from: f */
    public int mo3869f() {
        return this.f3048d;
    }

    /* renamed from: g */
    public Drawable mo3870g() {
        return this.f3054j;
    }

    /* renamed from: h */
    public C0847b mo3871h() {
        return this.f3055k;
    }

    /* renamed from: i */
    public List<Drawable> mo3872i() {
        return this.f3063s;
    }

    /* renamed from: j */
    public Drawable mo3873j() {
        return this.f3050f;
    }

    /* renamed from: k */
    public C0847b mo3874k() {
        return this.f3051g;
    }

    /* renamed from: l */
    public Drawable mo3875l() {
        return this.f3064t;
    }

    /* renamed from: m */
    public Drawable mo3876m() {
        return this.f3056l;
    }

    /* renamed from: n */
    public C0847b mo3877n() {
        return this.f3057m;
    }

    /* renamed from: o */
    public Resources mo3878o() {
        return this.f3047c;
    }

    /* renamed from: p */
    public Drawable mo3879p() {
        return this.f3052h;
    }

    /* renamed from: q */
    public C0847b mo3880q() {
        return this.f3053i;
    }

    /* renamed from: r */
    public C0865d mo3881r() {
        return this.f3065u;
    }
}
