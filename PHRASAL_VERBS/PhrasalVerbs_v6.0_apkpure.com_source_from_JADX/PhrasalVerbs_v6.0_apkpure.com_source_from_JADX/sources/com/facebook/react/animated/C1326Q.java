package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.Q */
class C1326Q extends C1328b {

    /* renamed from: e */
    double f4296e = Double.NaN;

    /* renamed from: f */
    double f4297f = 0.0d;

    /* renamed from: g */
    private C1329c f4298g;

    public C1326Q() {
    }

    public C1326Q(ReadableMap readableMap) {
        this.f4296e = readableMap.getDouble("value");
        this.f4297f = readableMap.getDouble("offset");
    }

    /* renamed from: a */
    public void mo4861a(C1329c cVar) {
        this.f4298g = cVar;
    }

    /* renamed from: b */
    public void mo4862b() {
        this.f4297f += this.f4296e;
        this.f4296e = 0.0d;
    }

    /* renamed from: c */
    public void mo4863c() {
        this.f4296e += this.f4297f;
        this.f4297f = 0.0d;
    }

    /* renamed from: d */
    public double mo4864d() {
        return this.f4297f + this.f4296e;
    }

    /* renamed from: e */
    public void mo4865e() {
        C1329c cVar = this.f4298g;
        if (cVar != null) {
            cVar.mo4804a(mo4864d());
        }
    }
}
