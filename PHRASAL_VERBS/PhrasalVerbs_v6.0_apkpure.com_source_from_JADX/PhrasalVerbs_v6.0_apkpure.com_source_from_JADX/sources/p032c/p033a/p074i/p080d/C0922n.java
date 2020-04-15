package p032c.p033a.p074i.p080d;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import p032c.p033a.p038c.p042d.C0719k;

/* renamed from: c.a.i.d.n */
public class C0922n<K, V> {

    /* renamed from: a */
    private final C0908G<V> f3194a;

    /* renamed from: b */
    private final LinkedHashMap<K, V> f3195b = new LinkedHashMap<>();

    /* renamed from: c */
    private int f3196c = 0;

    public C0922n(C0908G<V> g) {
        this.f3194a = g;
    }

    /* renamed from: c */
    private int m4055c(V v) {
        if (v == null) {
            return 0;
        }
        return this.f3194a.mo4001a(v);
    }

    /* renamed from: a */
    public synchronized int mo4021a() {
        return this.f3195b.size();
    }

    /* renamed from: a */
    public synchronized V mo4022a(K k) {
        return this.f3195b.get(k);
    }

    /* renamed from: a */
    public synchronized V mo4023a(K k, V v) {
        V remove;
        remove = this.f3195b.remove(k);
        this.f3196c -= m4055c(remove);
        this.f3195b.put(k, v);
        this.f3196c += m4055c(v);
        return remove;
    }

    /* renamed from: a */
    public synchronized ArrayList<Entry<K, V>> mo4024a(C0719k<K> kVar) {
        ArrayList<Entry<K, V>> arrayList;
        arrayList = new ArrayList<>(this.f3195b.entrySet().size());
        for (Entry entry : this.f3195b.entrySet()) {
            if (kVar == null || kVar.apply(entry.getKey())) {
                arrayList.add(entry);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public synchronized K mo4025b() {
        return this.f3195b.isEmpty() ? null : this.f3195b.keySet().iterator().next();
    }

    /* renamed from: b */
    public synchronized V mo4026b(K k) {
        V remove;
        remove = this.f3195b.remove(k);
        this.f3196c -= m4055c(remove);
        return remove;
    }

    /* renamed from: b */
    public synchronized ArrayList<V> mo4027b(C0719k<K> kVar) {
        ArrayList<V> arrayList;
        arrayList = new ArrayList<>();
        Iterator it = this.f3195b.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (kVar == null || kVar.apply(entry.getKey())) {
                arrayList.add(entry.getValue());
                this.f3196c -= m4055c(entry.getValue());
                it.remove();
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public synchronized int mo4028c() {
        return this.f3196c;
    }
}
