package com.facebook.react.common;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.react.common.f */
public class C1397f {

    /* renamed from: com.facebook.react.common.f$a */
    public static final class C1398a<K, V> {

        /* renamed from: a */
        private Map f4390a;

        /* renamed from: b */
        private boolean f4391b;

        private C1398a() {
            this.f4390a = C1397f.m5742b();
            this.f4391b = true;
        }

        /* renamed from: a */
        public C1398a<K, V> mo5183a(K k, V v) {
            if (this.f4391b) {
                this.f4390a.put(k, v);
                return this;
            }
            throw new IllegalStateException("Underlying map has already been built");
        }

        /* renamed from: a */
        public Map<K, V> mo5184a() {
            if (this.f4391b) {
                this.f4391b = false;
                return this.f4390a;
            }
            throw new IllegalStateException("Underlying map has already been built");
        }
    }

    /* renamed from: a */
    public static <K, V> C1398a<K, V> m5734a() {
        return new C1398a<>();
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m5735a(K k, V v) {
        Map<K, V> c = m5743c();
        c.put(k, v);
        return c;
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m5736a(K k, V v, K k2, V v2) {
        Map<K, V> c = m5743c();
        c.put(k, v);
        c.put(k2, v2);
        return c;
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m5737a(K k, V v, K k2, V v2, K k3, V v3) {
        Map<K, V> c = m5743c();
        c.put(k, v);
        c.put(k2, v2);
        c.put(k3, v3);
        return c;
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m5738a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        Map<K, V> c = m5743c();
        c.put(k, v);
        c.put(k2, v2);
        c.put(k3, v3);
        c.put(k4, v4);
        return c;
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m5739a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        Map<K, V> c = m5743c();
        c.put(k, v);
        c.put(k2, v2);
        c.put(k3, v3);
        c.put(k4, v4);
        c.put(k5, v5);
        return c;
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m5740a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        Map<K, V> c = m5743c();
        c.put(k, v);
        c.put(k2, v2);
        c.put(k3, v3);
        c.put(k4, v4);
        c.put(k5, v5);
        c.put(k6, v6);
        return c;
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m5741a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
        Map<K, V> c = m5743c();
        c.put(k, v);
        c.put(k2, v2);
        c.put(k3, v3);
        c.put(k4, v4);
        c.put(k5, v5);
        c.put(k6, v6);
        c.put(k7, v7);
        return c;
    }

    /* renamed from: b */
    public static <K, V> HashMap<K, V> m5742b() {
        return new HashMap<>();
    }

    /* renamed from: c */
    public static <K, V> Map<K, V> m5743c() {
        return m5742b();
    }
}
