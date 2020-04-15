package p031b;

import p031b.C0645k.C0646a;

/* renamed from: b.m */
class C0648m {

    /* renamed from: a */
    private C0645k<?> f2456a;

    public C0648m(C0645k<?> kVar) {
        this.f2456a = kVar;
    }

    /* renamed from: a */
    public void mo3336a() {
        this.f2456a = null;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            C0645k<?> kVar = this.f2456a;
            if (kVar != null) {
                C0646a c = C0645k.m3004c();
                if (c != null) {
                    c.mo3328a(kVar, new C0649n(kVar.mo3320a()));
                }
            }
        } finally {
            super.finalize();
        }
    }
}
