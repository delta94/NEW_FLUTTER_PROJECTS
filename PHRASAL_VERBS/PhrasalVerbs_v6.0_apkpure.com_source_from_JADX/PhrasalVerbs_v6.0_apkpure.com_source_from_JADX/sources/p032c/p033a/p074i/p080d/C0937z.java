package p032c.p033a.p074i.p080d;

import p032c.p033a.p038c.p042d.C0719k;
import p032c.p033a.p038c.p046h.C0744b;

/* renamed from: c.a.i.d.z */
public class C0937z<K, V> implements C0902A<K, V> {

    /* renamed from: a */
    private final C0902A<K, V> f3218a;

    /* renamed from: b */
    private final C0904C f3219b;

    public C0937z(C0902A<K, V> a, C0904C c) {
        this.f3218a = a;
        this.f3219b = c;
    }

    /* renamed from: a */
    public int mo3975a(C0719k<K> kVar) {
        return this.f3218a.mo3975a(kVar);
    }

    /* renamed from: a */
    public C0744b<V> mo3976a(K k, C0744b<V> bVar) {
        this.f3219b.mo3979a();
        return this.f3218a.mo3976a(k, bVar);
    }

    /* renamed from: b */
    public boolean mo3977b(C0719k<K> kVar) {
        return this.f3218a.mo3977b(kVar);
    }

    public C0744b<V> get(K k) {
        C0744b<V> bVar = this.f3218a.get(k);
        if (bVar == null) {
            this.f3219b.mo3981b();
        } else {
            this.f3219b.mo3980a(k);
        }
        return bVar;
    }
}
