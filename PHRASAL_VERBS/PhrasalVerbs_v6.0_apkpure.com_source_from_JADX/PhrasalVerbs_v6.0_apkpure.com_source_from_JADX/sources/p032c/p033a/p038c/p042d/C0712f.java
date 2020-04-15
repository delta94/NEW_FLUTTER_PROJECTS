package p032c.p033a.p038c.p042d;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: c.a.c.d.f */
public class C0712f<K, V> extends HashMap<K, V> {
    private C0712f(Map<? extends K, ? extends V> map) {
        super(map);
    }

    /* renamed from: a */
    public static <K, V> C0712f<K, V> m3225a(Map<? extends K, ? extends V> map) {
        return new C0712f<>(map);
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m3226a(K k, V v) {
        HashMap hashMap = new HashMap(1);
        hashMap.put(k, v);
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m3227a(K k, V v, K k2, V v2) {
        HashMap hashMap = new HashMap(2);
        hashMap.put(k, v);
        hashMap.put(k2, v2);
        return Collections.unmodifiableMap(hashMap);
    }
}
