package android.support.p029v4.util;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: android.support.v4.util.b */
public class C0320b<K, V> extends C0338o<K, V> implements Map<K, V> {

    /* renamed from: h */
    C0328j<K, V> f949h;

    public C0320b() {
    }

    public C0320b(int i) {
        super(i);
    }

    /* renamed from: b */
    private C0328j<K, V> m1375b() {
        if (this.f949h == null) {
            this.f949h = new C0319a(this);
        }
        return this.f949h;
    }

    /* renamed from: a */
    public boolean mo1322a(Collection<?> collection) {
        return C0328j.m1422c(this, collection);
    }

    public Set<Entry<K, V>> entrySet() {
        return m1375b().mo1370d();
    }

    public Set<K> keySet() {
        return m1375b().mo1371e();
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo1433a(this.f1001g + map.size());
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Collection<V> values() {
        return m1375b().mo1372f();
    }
}
