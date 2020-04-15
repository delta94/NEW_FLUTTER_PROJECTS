package p000a.p001a.p002a.p004b;

import java.util.HashMap;
import java.util.Map.Entry;

/* renamed from: a.a.a.b.a */
public class C0005a<K, V> extends C0007c<K, V> {

    /* renamed from: e */
    private HashMap<K, C0010c<K, V>> f8e = new HashMap<>();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0010c<K, V> mo6a(K k) {
        return (C0010c) this.f8e.get(k);
    }

    /* renamed from: b */
    public V mo7b(K k, V v) {
        C0010c a = mo6a(k);
        if (a != null) {
            return a.f14b;
        }
        this.f8e.put(k, mo11a(k, v));
        return null;
    }

    /* renamed from: b */
    public Entry<K, V> mo8b(K k) {
        if (contains(k)) {
            return ((C0010c) this.f8e.get(k)).f16d;
        }
        return null;
    }

    public boolean contains(K k) {
        return this.f8e.containsKey(k);
    }

    public V remove(K k) {
        V remove = super.remove(k);
        this.f8e.remove(k);
        return remove;
    }
}
