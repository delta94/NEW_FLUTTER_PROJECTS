package android.support.p029v4.util;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: android.support.v4.util.d */
public final class C0322d<E> implements Collection<E>, Set<E> {

    /* renamed from: a */
    private static final int[] f951a = new int[0];

    /* renamed from: b */
    private static final Object[] f952b = new Object[0];

    /* renamed from: c */
    private static Object[] f953c;

    /* renamed from: d */
    private static int f954d;

    /* renamed from: e */
    private static Object[] f955e;

    /* renamed from: f */
    private static int f956f;

    /* renamed from: g */
    private int[] f957g;

    /* renamed from: h */
    Object[] f958h;

    /* renamed from: i */
    int f959i;

    /* renamed from: j */
    private C0328j<E, E> f960j;

    public C0322d() {
        this(0);
    }

    public C0322d(int i) {
        if (i == 0) {
            this.f957g = f951a;
            this.f958h = f952b;
        } else {
            m1390d(i);
        }
        this.f959i = 0;
    }

    /* renamed from: a */
    private int m1386a(Object obj, int i) {
        int i2 = this.f959i;
        if (i2 == 0) {
            return -1;
        }
        int a = C0323e.m1395a(this.f957g, i2, i);
        if (a < 0 || obj.equals(this.f958h[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f957g[i3] == i) {
            if (obj.equals(this.f958h[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f957g[i4] == i) {
            if (obj.equals(this.f958h[i4])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    /* renamed from: a */
    private C0328j<E, E> m1387a() {
        if (this.f960j == null) {
            this.f960j = new C0321c(this);
        }
        return this.f960j;
    }

    /* renamed from: a */
    private static void m1388a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0322d.class) {
                if (f956f < 10) {
                    objArr[0] = f955e;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f955e = objArr;
                    f956f++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0322d.class) {
                if (f954d < 10) {
                    objArr[0] = f953c;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f953c = objArr;
                    f954d++;
                }
            }
        }
    }

    /* renamed from: b */
    private int m1389b() {
        int i = this.f959i;
        if (i == 0) {
            return -1;
        }
        int a = C0323e.m1395a(this.f957g, i, 0);
        if (a < 0 || this.f958h[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f957g[i2] == 0) {
            if (this.f958h[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f957g[i3] == 0) {
            if (this.f958h[i3] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    /* renamed from: d */
    private void m1390d(int i) {
        if (i == 8) {
            synchronized (C0322d.class) {
                if (f955e != null) {
                    Object[] objArr = f955e;
                    this.f958h = objArr;
                    f955e = (Object[]) objArr[0];
                    this.f957g = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f956f--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0322d.class) {
                if (f953c != null) {
                    Object[] objArr2 = f953c;
                    this.f958h = objArr2;
                    f953c = (Object[]) objArr2[0];
                    this.f957g = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f954d--;
                    return;
                }
            }
        }
        this.f957g = new int[i];
        this.f958h = new Object[i];
    }

    /* renamed from: a */
    public void mo1327a(int i) {
        int[] iArr = this.f957g;
        if (iArr.length < i) {
            Object[] objArr = this.f958h;
            m1390d(i);
            int i2 = this.f959i;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f957g, 0, i2);
                System.arraycopy(objArr, 0, this.f958h, 0, this.f959i);
            }
            m1388a(iArr, objArr, this.f959i);
        }
    }

    public boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = m1389b();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = m1386a(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = i2 ^ -1;
        int i4 = this.f959i;
        if (i4 >= this.f957g.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            int[] iArr = this.f957g;
            Object[] objArr = this.f958h;
            m1390d(i5);
            int[] iArr2 = this.f957g;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f958h, 0, objArr.length);
            }
            m1388a(iArr, objArr, this.f959i);
        }
        int i6 = this.f959i;
        if (i3 < i6) {
            int[] iArr3 = this.f957g;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f958h;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f959i - i3);
        }
        this.f957g[i3] = i;
        this.f958h[i3] = e;
        this.f959i++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo1327a(this.f959i + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    /* renamed from: b */
    public E mo1330b(int i) {
        E[] eArr = this.f958h;
        E e = eArr[i];
        int i2 = this.f959i;
        if (i2 <= 1) {
            m1388a(this.f957g, eArr, i2);
            this.f957g = f951a;
            this.f958h = f952b;
            this.f959i = 0;
        } else {
            int[] iArr = this.f957g;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                this.f959i--;
                int i4 = this.f959i;
                if (i < i4) {
                    int[] iArr2 = this.f957g;
                    int i5 = i + 1;
                    System.arraycopy(iArr2, i5, iArr2, i, i4 - i);
                    Object[] objArr = this.f958h;
                    System.arraycopy(objArr, i5, objArr, i, this.f959i - i);
                }
                this.f958h[this.f959i] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                int[] iArr3 = this.f957g;
                Object[] objArr2 = this.f958h;
                m1390d(i3);
                this.f959i--;
                if (i > 0) {
                    System.arraycopy(iArr3, 0, this.f957g, 0, i);
                    System.arraycopy(objArr2, 0, this.f958h, 0, i);
                }
                int i6 = this.f959i;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr3, i7, this.f957g, i, i6 - i);
                    System.arraycopy(objArr2, i7, this.f958h, i, this.f959i - i);
                }
            }
        }
        return e;
    }

    /* renamed from: c */
    public E mo1331c(int i) {
        return this.f958h[i];
    }

    public void clear() {
        int i = this.f959i;
        if (i != 0) {
            m1388a(this.f957g, this.f958h, i);
            this.f957g = f951a;
            this.f958h = f952b;
            this.f959i = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
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
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f959i) {
                try {
                    if (!set.contains(mo1331c(i))) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.f957g;
        int i = 0;
        for (int i2 = 0; i2 < this.f959i; i2++) {
            i += iArr[i2];
        }
        return i;
    }

    public int indexOf(Object obj) {
        return obj == null ? m1389b() : m1386a(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f959i <= 0;
    }

    public Iterator<E> iterator() {
        return m1387a().mo1371e().iterator();
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        mo1330b(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f959i - 1; i >= 0; i--) {
            if (!collection.contains(this.f958h[i])) {
                mo1330b(i);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f959i;
    }

    public Object[] toArray() {
        int i = this.f959i;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f958h, 0, objArr, 0, i);
        return objArr;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f959i) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f959i);
        }
        System.arraycopy(this.f958h, 0, tArr, 0, this.f959i);
        int length = tArr.length;
        int i = this.f959i;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f959i * 14);
        sb.append('{');
        for (int i = 0; i < this.f959i; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object c = mo1331c(i);
            if (c != this) {
                sb.append(c);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
