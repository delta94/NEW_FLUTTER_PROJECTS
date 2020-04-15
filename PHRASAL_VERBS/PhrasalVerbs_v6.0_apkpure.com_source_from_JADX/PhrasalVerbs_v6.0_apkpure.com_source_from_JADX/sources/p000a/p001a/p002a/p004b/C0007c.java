package p000a.p001a.p002a.p004b;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: a.a.a.b.c */
public class C0007c<K, V> implements Iterable<Entry<K, V>> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C0010c<K, V> f9a;

    /* renamed from: b */
    private C0010c<K, V> f10b;

    /* renamed from: c */
    private WeakHashMap<C0013f<K, V>, Boolean> f11c = new WeakHashMap<>();

    /* renamed from: d */
    private int f12d = 0;

    /* renamed from: a.a.a.b.c$a */
    static class C0008a<K, V> extends C0012e<K, V> {
        C0008a(C0010c<K, V> cVar, C0010c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C0010c<K, V> mo20b(C0010c<K, V> cVar) {
            return cVar.f16d;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C0010c<K, V> mo21c(C0010c<K, V> cVar) {
            return cVar.f15c;
        }
    }

    /* renamed from: a.a.a.b.c$b */
    private static class C0009b<K, V> extends C0012e<K, V> {
        C0009b(C0010c<K, V> cVar, C0010c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C0010c<K, V> mo20b(C0010c<K, V> cVar) {
            return cVar.f15c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C0010c<K, V> mo21c(C0010c<K, V> cVar) {
            return cVar.f16d;
        }
    }

    /* renamed from: a.a.a.b.c$c */
    static class C0010c<K, V> implements Entry<K, V> {

        /* renamed from: a */
        final K f13a;

        /* renamed from: b */
        final V f14b;

        /* renamed from: c */
        C0010c<K, V> f15c;

        /* renamed from: d */
        C0010c<K, V> f16d;

        C0010c(K k, V v) {
            this.f13a = k;
            this.f14b = v;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0010c)) {
                return false;
            }
            C0010c cVar = (C0010c) obj;
            if (!this.f13a.equals(cVar.f13a) || !this.f14b.equals(cVar.f14b)) {
                z = false;
            }
            return z;
        }

        public K getKey() {
            return this.f13a;
        }

        public V getValue() {
            return this.f14b;
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f13a);
            sb.append("=");
            sb.append(this.f14b);
            return sb.toString();
        }
    }

    /* renamed from: a.a.a.b.c$d */
    private class C0011d implements Iterator<Entry<K, V>>, C0013f<K, V> {

        /* renamed from: a */
        private C0010c<K, V> f17a;

        /* renamed from: b */
        private boolean f18b;

        private C0011d() {
            this.f18b = true;
        }

        /* renamed from: a */
        public void mo27a(C0010c<K, V> cVar) {
            C0010c<K, V> cVar2 = this.f17a;
            if (cVar == cVar2) {
                this.f17a = cVar2.f16d;
                this.f18b = this.f17a == null;
            }
        }

        public boolean hasNext() {
            boolean z = true;
            if (this.f18b) {
                if (C0007c.this.f9a == null) {
                    z = false;
                }
                return z;
            }
            C0010c<K, V> cVar = this.f17a;
            if (cVar == null || cVar.f15c == null) {
                z = false;
            }
            return z;
        }

        public Entry<K, V> next() {
            C0010c<K, V> cVar;
            if (this.f18b) {
                this.f18b = false;
                cVar = C0007c.this.f9a;
            } else {
                C0010c<K, V> cVar2 = this.f17a;
                cVar = cVar2 != null ? cVar2.f15c : null;
            }
            this.f17a = cVar;
            return this.f17a;
        }
    }

    /* renamed from: a.a.a.b.c$e */
    private static abstract class C0012e<K, V> implements Iterator<Entry<K, V>>, C0013f<K, V> {

        /* renamed from: a */
        C0010c<K, V> f20a;

        /* renamed from: b */
        C0010c<K, V> f21b;

        C0012e(C0010c<K, V> cVar, C0010c<K, V> cVar2) {
            this.f20a = cVar2;
            this.f21b = cVar;
        }

        /* renamed from: a */
        private C0010c<K, V> m25a() {
            C0010c<K, V> cVar = this.f21b;
            C0010c<K, V> cVar2 = this.f20a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo21c(cVar);
        }

        /* renamed from: a */
        public void mo27a(C0010c<K, V> cVar) {
            if (this.f20a == cVar && cVar == this.f21b) {
                this.f21b = null;
                this.f20a = null;
            }
            C0010c<K, V> cVar2 = this.f20a;
            if (cVar2 == cVar) {
                this.f20a = mo20b(cVar2);
            }
            if (this.f21b == cVar) {
                this.f21b = m25a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract C0010c<K, V> mo20b(C0010c<K, V> cVar);

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public abstract C0010c<K, V> mo21c(C0010c<K, V> cVar);

        public boolean hasNext() {
            return this.f21b != null;
        }

        public Entry<K, V> next() {
            C0010c<K, V> cVar = this.f21b;
            this.f21b = m25a();
            return cVar;
        }
    }

    /* renamed from: a.a.a.b.c$f */
    interface C0013f<K, V> {
        /* renamed from: a */
        void mo27a(C0010c<K, V> cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0010c<K, V> mo6a(K k) {
        C0010c<K, V> cVar = this.f9a;
        while (cVar != null && !cVar.f13a.equals(k)) {
            cVar = cVar.f15c;
        }
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0010c<K, V> mo11a(K k, V v) {
        C0010c<K, V> cVar = new C0010c<>(k, v);
        this.f12d++;
        C0010c<K, V> cVar2 = this.f10b;
        if (cVar2 == null) {
            this.f9a = cVar;
            this.f10b = this.f9a;
            return cVar;
        }
        cVar2.f15c = cVar;
        cVar.f16d = cVar2;
        this.f10b = cVar;
        return cVar;
    }

    /* renamed from: a */
    public Entry<K, V> mo12a() {
        return this.f9a;
    }

    /* renamed from: b */
    public C0011d mo13b() {
        C0011d dVar = new C0011d<>();
        this.f11c.put(dVar, Boolean.valueOf(false));
        return dVar;
    }

    /* renamed from: b */
    public V mo7b(K k, V v) {
        C0010c a = mo6a(k);
        if (a != null) {
            return a.f14b;
        }
        mo11a(k, v);
        return null;
    }

    /* renamed from: c */
    public Entry<K, V> mo14c() {
        return this.f10b;
    }

    public Iterator<Entry<K, V>> descendingIterator() {
        C0009b bVar = new C0009b(this.f10b, this.f9a);
        this.f11c.put(bVar, Boolean.valueOf(false));
        return bVar;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0007c)) {
            return false;
        }
        C0007c cVar = (C0007c) obj;
        if (size() != cVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = cVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Entry entry = (Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            z = false;
        }
        return z;
    }

    public Iterator<Entry<K, V>> iterator() {
        C0008a aVar = new C0008a(this.f9a, this.f10b);
        this.f11c.put(aVar, Boolean.valueOf(false));
        return aVar;
    }

    public V remove(K k) {
        C0010c a = mo6a(k);
        if (a == null) {
            return null;
        }
        this.f12d--;
        if (!this.f11c.isEmpty()) {
            for (C0013f a2 : this.f11c.keySet()) {
                a2.mo27a(a);
            }
        }
        C0010c<K, V> cVar = a.f16d;
        if (cVar != null) {
            cVar.f15c = a.f15c;
        } else {
            this.f9a = a.f15c;
        }
        C0010c<K, V> cVar2 = a.f15c;
        if (cVar2 != null) {
            cVar2.f16d = a.f16d;
        } else {
            this.f10b = a.f16d;
        }
        a.f15c = null;
        a.f16d = null;
        return a.f14b;
    }

    public int size() {
        return this.f12d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
