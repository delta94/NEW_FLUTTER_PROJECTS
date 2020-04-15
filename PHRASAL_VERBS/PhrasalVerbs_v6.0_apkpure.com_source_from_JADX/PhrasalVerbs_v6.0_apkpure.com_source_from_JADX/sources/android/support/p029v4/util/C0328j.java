package android.support.p029v4.util;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: android.support.v4.util.j */
abstract class C0328j<K, V> {

    /* renamed from: a */
    C0330b f979a;

    /* renamed from: b */
    C0331c f980b;

    /* renamed from: c */
    C0333e f981c;

    /* renamed from: android.support.v4.util.j$a */
    final class C0329a<T> implements Iterator<T> {

        /* renamed from: a */
        final int f982a;

        /* renamed from: b */
        int f983b;

        /* renamed from: c */
        int f984c;

        /* renamed from: d */
        boolean f985d = false;

        C0329a(int i) {
            this.f982a = i;
            this.f983b = C0328j.this.mo1321c();
        }

        public boolean hasNext() {
            return this.f984c < this.f983b;
        }

        public T next() {
            if (hasNext()) {
                T a = C0328j.this.mo1314a(this.f984c, this.f982a);
                this.f984c++;
                this.f985d = true;
                return a;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f985d) {
                this.f984c--;
                this.f983b--;
                this.f985d = false;
                C0328j.this.mo1317a(this.f984c);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: android.support.v4.util.j$b */
    final class C0330b implements Set<Entry<K, V>> {
        C0330b() {
        }

        /* renamed from: a */
        public boolean mo1376a(Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            mo1376a((Entry) obj);
            throw null;
        }

        public boolean addAll(Collection<? extends Entry<K, V>> collection) {
            int c = C0328j.this.mo1321c();
            for (Entry entry : collection) {
                C0328j.this.mo1318a(entry.getKey(), entry.getValue());
            }
            return c != C0328j.this.mo1321c();
        }

        public void clear() {
            C0328j.this.mo1316a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            int a = C0328j.this.mo1313a(entry.getKey());
            if (a < 0) {
                return false;
            }
            return C0323e.m1397a(C0328j.this.mo1314a(a, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return C0328j.m1420a((Set<T>) this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int c = C0328j.this.mo1321c() - 1; c >= 0; c--) {
                Object a = C0328j.this.mo1314a(c, 0);
                Object a2 = C0328j.this.mo1314a(c, 1);
                i += (a == null ? 0 : a.hashCode()) ^ (a2 == null ? 0 : a2.hashCode());
            }
            return i;
        }

        public boolean isEmpty() {
            return C0328j.this.mo1321c() == 0;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C0332d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return C0328j.this.mo1321c();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: android.support.v4.util.j$c */
    final class C0331c implements Set<K> {
        C0331c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C0328j.this.mo1316a();
        }

        public boolean contains(Object obj) {
            return C0328j.this.mo1313a(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return C0328j.m1419a(C0328j.this.mo1320b(), collection);
        }

        public boolean equals(Object obj) {
            return C0328j.m1420a((Set<T>) this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int c = C0328j.this.mo1321c() - 1; c >= 0; c--) {
                Object a = C0328j.this.mo1314a(c, 0);
                i += a == null ? 0 : a.hashCode();
            }
            return i;
        }

        public boolean isEmpty() {
            return C0328j.this.mo1321c() == 0;
        }

        public Iterator<K> iterator() {
            return new C0329a(0);
        }

        public boolean remove(Object obj) {
            int a = C0328j.this.mo1313a(obj);
            if (a < 0) {
                return false;
            }
            C0328j.this.mo1317a(a);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return C0328j.m1421b(C0328j.this.mo1320b(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return C0328j.m1422c(C0328j.this.mo1320b(), collection);
        }

        public int size() {
            return C0328j.this.mo1321c();
        }

        public Object[] toArray() {
            return C0328j.this.mo1369b(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return C0328j.this.mo1368a(tArr, 0);
        }
    }

    /* renamed from: android.support.v4.util.j$d */
    final class C0332d implements Iterator<Entry<K, V>>, Entry<K, V> {

        /* renamed from: a */
        int f989a;

        /* renamed from: b */
        int f990b;

        /* renamed from: c */
        boolean f991c = false;

        C0332d() {
            this.f989a = C0328j.this.mo1321c() - 1;
            this.f990b = -1;
        }

        public boolean equals(Object obj) {
            if (this.f991c) {
                boolean z = false;
                if (!(obj instanceof Entry)) {
                    return false;
                }
                Entry entry = (Entry) obj;
                if (C0323e.m1397a(entry.getKey(), C0328j.this.mo1314a(this.f990b, 0)) && C0323e.m1397a(entry.getValue(), C0328j.this.mo1314a(this.f990b, 1))) {
                    z = true;
                }
                return z;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public K getKey() {
            if (this.f991c) {
                return C0328j.this.mo1314a(this.f990b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f991c) {
                return C0328j.this.mo1314a(this.f990b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f990b < this.f989a;
        }

        public int hashCode() {
            if (this.f991c) {
                int i = 0;
                Object a = C0328j.this.mo1314a(this.f990b, 0);
                Object a2 = C0328j.this.mo1314a(this.f990b, 1);
                int hashCode = a == null ? 0 : a.hashCode();
                if (a2 != null) {
                    i = a2.hashCode();
                }
                return hashCode ^ i;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public Entry<K, V> next() {
            if (hasNext()) {
                this.f990b++;
                this.f991c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f991c) {
                C0328j.this.mo1317a(this.f990b);
                this.f990b--;
                this.f989a--;
                this.f991c = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.f991c) {
                return C0328j.this.mo1315a(this.f990b, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append("=");
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* renamed from: android.support.v4.util.j$e */
    final class C0333e implements Collection<V> {
        C0333e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C0328j.this.mo1316a();
        }

        public boolean contains(Object obj) {
            return C0328j.this.mo1319b(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return C0328j.this.mo1321c() == 0;
        }

        public Iterator<V> iterator() {
            return new C0329a(1);
        }

        public boolean remove(Object obj) {
            int b = C0328j.this.mo1319b(obj);
            if (b < 0) {
                return false;
            }
            C0328j.this.mo1317a(b);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int c = C0328j.this.mo1321c();
            int i = 0;
            boolean z = false;
            while (i < c) {
                if (collection.contains(C0328j.this.mo1314a(i, 1))) {
                    C0328j.this.mo1317a(i);
                    i--;
                    c--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int c = C0328j.this.mo1321c();
            int i = 0;
            boolean z = false;
            while (i < c) {
                if (!collection.contains(C0328j.this.mo1314a(i, 1))) {
                    C0328j.this.mo1317a(i);
                    i--;
                    c--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return C0328j.this.mo1321c();
        }

        public Object[] toArray() {
            return C0328j.this.mo1369b(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return C0328j.this.mo1368a(tArr, 1);
        }
    }

    C0328j() {
    }

    /* renamed from: a */
    public static <K, V> boolean m1419a(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static <T> boolean m1420a(Set<T> set, Object obj) {
        boolean z = true;
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    z = false;
                }
                return z;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public static <K, V> boolean m1421b(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    /* renamed from: c */
    public static <K, V> boolean m1422c(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo1313a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo1314a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract V mo1315a(int i, V v);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo1316a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo1317a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo1318a(K k, V v);

    /* renamed from: a */
    public <T> T[] mo1368a(T[] tArr, int i) {
        int c = mo1321c();
        if (tArr.length < c) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), c);
        }
        for (int i2 = 0; i2 < c; i2++) {
            tArr[i2] = mo1314a(i2, i);
        }
        if (tArr.length > c) {
            tArr[c] = null;
        }
        return tArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo1319b(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Map<K, V> mo1320b();

    /* renamed from: b */
    public Object[] mo1369b(int i) {
        int c = mo1321c();
        Object[] objArr = new Object[c];
        for (int i2 = 0; i2 < c; i2++) {
            objArr[i2] = mo1314a(i2, i);
        }
        return objArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo1321c();

    /* renamed from: d */
    public Set<Entry<K, V>> mo1370d() {
        if (this.f979a == null) {
            this.f979a = new C0330b<>();
        }
        return this.f979a;
    }

    /* renamed from: e */
    public Set<K> mo1371e() {
        if (this.f980b == null) {
            this.f980b = new C0331c<>();
        }
        return this.f980b;
    }

    /* renamed from: f */
    public Collection<V> mo1372f() {
        if (this.f981c == null) {
            this.f981c = new C0333e<>();
        }
        return this.f981c;
    }
}
