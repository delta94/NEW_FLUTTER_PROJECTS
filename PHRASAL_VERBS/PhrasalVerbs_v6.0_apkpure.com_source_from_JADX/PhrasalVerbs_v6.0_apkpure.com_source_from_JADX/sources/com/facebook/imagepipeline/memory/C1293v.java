package com.facebook.imagepipeline.memory;

import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p045g.C0731a;
import p032c.p033a.p038c.p045g.C0739h;
import p032c.p033a.p038c.p045g.C0742k;

/* renamed from: com.facebook.imagepipeline.memory.v */
public class C1293v {

    /* renamed from: a */
    private final C1291u f4203a;

    /* renamed from: b */
    private C1273e f4204b;

    /* renamed from: c */
    private C1280l f4205c;

    /* renamed from: d */
    private C1283n f4206d;

    /* renamed from: e */
    private C0739h f4207e;

    /* renamed from: f */
    private C0742k f4208f;

    /* renamed from: g */
    private C0731a f4209g;

    public C1293v(C1291u uVar) {
        C0718j.m3240a(uVar);
        this.f4203a = uVar;
    }

    /* renamed from: a */
    public C1273e mo4782a() {
        if (this.f4204b == null) {
            this.f4204b = new C1273e(this.f4203a.mo4776d(), this.f4203a.mo4773a(), this.f4203a.mo4774b());
        }
        return this.f4204b;
    }

    /* renamed from: b */
    public C1280l mo4783b() {
        if (this.f4205c == null) {
            this.f4205c = new C1280l(this.f4203a.mo4776d(), this.f4203a.mo4775c());
        }
        return this.f4205c;
    }

    /* renamed from: c */
    public int mo4784c() {
        return this.f4203a.mo4775c().f4216g;
    }

    /* renamed from: d */
    public C1283n mo4785d() {
        if (this.f4206d == null) {
            this.f4206d = new C1283n(this.f4203a.mo4776d(), this.f4203a.mo4777e(), this.f4203a.mo4778f());
        }
        return this.f4206d;
    }

    /* renamed from: e */
    public C0739h mo4786e() {
        if (this.f4207e == null) {
            this.f4207e = new C1285p(mo4785d(), mo4787f());
        }
        return this.f4207e;
    }

    /* renamed from: f */
    public C0742k mo4787f() {
        if (this.f4208f == null) {
            this.f4208f = new C0742k(mo4788g());
        }
        return this.f4208f;
    }

    /* renamed from: g */
    public C0731a mo4788g() {
        if (this.f4209g == null) {
            this.f4209g = new C1282m(this.f4203a.mo4776d(), this.f4203a.mo4779g(), this.f4203a.mo4780h());
        }
        return this.f4209g;
    }
}
