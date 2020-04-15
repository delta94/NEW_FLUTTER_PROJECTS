package android.support.p029v4.util;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: android.support.v4.util.o */
public class C0338o<K, V> {

    /* renamed from: a */
    static Object[] f995a;

    /* renamed from: b */
    static int f996b;

    /* renamed from: c */
    static Object[] f997c;

    /* renamed from: d */
    static int f998d;

    /* renamed from: e */
    int[] f999e;

    /* renamed from: f */
    Object[] f1000f;

    /* renamed from: g */
    int f1001g;

    public C0338o() {
        this.f999e = C0323e.f961a;
        this.f1000f = C0323e.f963c;
        this.f1001g = 0;
    }

    public C0338o(int i) {
        if (i == 0) {
            this.f999e = C0323e.f961a;
            this.f1000f = C0323e.f963c;
        } else {
            m1446e(i);
        }
        this.f1001g = 0;
    }

    /* renamed from: a */
    private static int m1444a(int[] iArr, int i, int i2) {
        try {
            return C0323e.m1395a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    private static void m1445a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0320b.class) {
                if (f998d < 10) {
                    objArr[0] = f997c;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f997c = objArr;
                    f998d++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0320b.class) {
                if (f996b < 10) {
                    objArr[0] = f995a;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f995a = objArr;
                    f996b++;
                }
            }
        }
    }

    /* renamed from: e */
    private void m1446e(int i) {
        if (i == 8) {
            synchronized (C0320b.class) {
                if (f997c != null) {
                    Object[] objArr = f997c;
                    this.f1000f = objArr;
                    f997c = (Object[]) objArr[0];
                    this.f999e = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f998d--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0320b.class) {
                if (f995a != null) {
                    Object[] objArr2 = f995a;
                    this.f1000f = objArr2;
                    f995a = (Object[]) objArr2[0];
                    this.f999e = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f996b--;
                    return;
                }
            }
        }
        this.f999e = new int[i];
        this.f1000f = new Object[(i << 1)];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo1429a() {
        int i = this.f1001g;
        if (i == 0) {
            return -1;
        }
        int a = m1444a(this.f999e, i, 0);
        if (a < 0 || this.f1000f[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f999e[i2] == 0) {
            if (this.f1000f[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f999e[i3] == 0) {
            if (this.f1000f[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    /* renamed from: a */
    public int mo1430a(Object obj) {
        return obj == null ? mo1429a() : mo1431a(obj, obj.hashCode());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo1431a(Object obj, int i) {
        int i2 = this.f1001g;
        if (i2 == 0) {
            return -1;
        }
        int a = m1444a(this.f999e, i2, i);
        if (a < 0 || obj.equals(this.f1000f[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f999e[i3] == i) {
            if (obj.equals(this.f1000f[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f999e[i4] == i) {
            if (obj.equals(this.f1000f[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    /* renamed from: a */
    public V mo1432a(int i, V v) {
        int i2 = (i << 1) + 1;
        V[] vArr = this.f1000f;
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    /* renamed from: a */
    public void mo1433a(int i) {
        int i2 = this.f1001g;
        int[] iArr = this.f999e;
        if (iArr.length < i) {
            Object[] objArr = this.f1000f;
            m1446e(i);
            if (this.f1001g > 0) {
                System.arraycopy(iArr, 0, this.f999e, 0, i2);
                System.arraycopy(objArr, 0, this.f1000f, 0, i2 << 1);
            }
            m1445a(iArr, objArr, i2);
        }
        if (this.f1001g != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo1434b(Object obj) {
        int i = this.f1001g * 2;
        Object[] objArr = this.f1000f;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
        } else {
            for (int i3 = 1; i3 < i; i3 += 2) {
                if (obj.equals(objArr[i3])) {
                    return i3 >> 1;
                }
            }
        }
        return -1;
    }

    /* renamed from: b */
    public K mo1435b(int i) {
        return this.f1000f[i << 1];
    }

    /* renamed from: c */
    public V mo1436c(int i) {
        int i2;
        V[] vArr = this.f1000f;
        int i3 = i << 1;
        V v = vArr[i3 + 1];
        int i4 = this.f1001g;
        if (i4 <= 1) {
            m1445a(this.f999e, (Object[]) vArr, i4);
            this.f999e = C0323e.f961a;
            this.f1000f = C0323e.f963c;
            i2 = 0;
        } else {
            i2 = i4 - 1;
            int[] iArr = this.f999e;
            int i5 = 8;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i < i2) {
                    int[] iArr2 = this.f999e;
                    int i6 = i + 1;
                    int i7 = i2 - i;
                    System.arraycopy(iArr2, i6, iArr2, i, i7);
                    Object[] objArr = this.f1000f;
                    System.arraycopy(objArr, i6 << 1, objArr, i3, i7 << 1);
                }
                Object[] objArr2 = this.f1000f;
                int i8 = i2 << 1;
                objArr2[i8] = null;
                objArr2[i8 + 1] = null;
            } else {
                if (i4 > 8) {
                    i5 = i4 + (i4 >> 1);
                }
                int[] iArr3 = this.f999e;
                Object[] objArr3 = this.f1000f;
                m1446e(i5);
                if (i4 == this.f1001g) {
                    if (i > 0) {
                        System.arraycopy(iArr3, 0, this.f999e, 0, i);
                        System.arraycopy(objArr3, 0, this.f1000f, 0, i3);
                    }
                    if (i < i2) {
                        int i9 = i + 1;
                        int i10 = i2 - i;
                        System.arraycopy(iArr3, i9, this.f999e, i, i10);
                        System.arraycopy(objArr3, i9 << 1, this.f1000f, i3, i10 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
        }
        if (i4 == this.f1001g) {
            this.f1001g = i2;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public void clear() {
        int i = this.f1001g;
        if (i > 0) {
            int[] iArr = this.f999e;
            Object[] objArr = this.f1000f;
            this.f999e = C0323e.f961a;
            this.f1000f = C0323e.f963c;
            this.f1001g = 0;
            m1445a(iArr, objArr, i);
        }
        if (this.f1001g > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return mo1430a(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return mo1434b(obj) >= 0;
    }

    /* renamed from: d */
    public V mo1440d(int i) {
        return this.f1000f[(i << 1) + 1];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0338o) {
            C0338o oVar = (C0338o) obj;
            if (size() != oVar.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f1001g) {
                try {
                    Object b = mo1435b(i);
                    Object d = mo1440d(i);
                    Object obj2 = oVar.get(b);
                    if (d == null) {
                        if (obj2 != null || !oVar.containsKey(b)) {
                            return false;
                        }
                    } else if (!d.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f1001g) {
                try {
                    Object b2 = mo1435b(i2);
                    Object d2 = mo1440d(i2);
                    Object obj3 = map.get(b2);
                    if (d2 == null) {
                        if (obj3 != null || !map.containsKey(b2)) {
                            return false;
                        }
                    } else if (!d2.equals(obj3)) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public V get(Object obj) {
        int a = mo1430a(obj);
        if (a >= 0) {
            return this.f1000f[(a << 1) + 1];
        }
        return null;
    }

    public int hashCode() {
        int[] iArr = this.f999e;
        Object[] objArr = this.f1000f;
        int i = this.f1001g;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < i) {
            Object obj = objArr[i4];
            i3 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i2];
            i2++;
            i4 += 2;
        }
        return i3;
    }

    public boolean isEmpty() {
        return this.f1001g <= 0;
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f1001g;
        if (k == null) {
            i2 = mo1429a();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = mo1431a((Object) k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V[] vArr = this.f1000f;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = i2 ^ -1;
        if (i3 >= this.f999e.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            int[] iArr = this.f999e;
            Object[] objArr = this.f1000f;
            m1446e(i6);
            if (i3 == this.f1001g) {
                int[] iArr2 = this.f999e;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f1000f, 0, objArr.length);
                }
                m1445a(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f999e;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr2 = this.f1000f;
            System.arraycopy(objArr2, i5 << 1, objArr2, i7 << 1, (this.f1001g - i5) << 1);
        }
        int i8 = this.f1001g;
        if (i3 == i8) {
            int[] iArr4 = this.f999e;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr3 = this.f1000f;
                int i9 = i5 << 1;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.f1001g = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V remove(Object obj) {
        int a = mo1430a(obj);
        if (a >= 0) {
            return mo1436c(a);
        }
        return null;
    }

    public int size() {
        return this.f1001g;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1001g * 28);
        sb.append('{');
        for (int i = 0; i < this.f1001g; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object b = mo1435b(i);
            String str = "(this Map)";
            if (b != this) {
                sb.append(b);
            } else {
                sb.append(str);
            }
            sb.append('=');
            Object d = mo1440d(i);
            if (d != this) {
                sb.append(d);
            } else {
                sb.append(str);
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
