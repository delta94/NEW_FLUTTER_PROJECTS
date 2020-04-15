package android.support.p029v4.util;

/* renamed from: android.support.v4.util.p */
public class C0339p<E> implements Cloneable {

    /* renamed from: a */
    private static final Object f1002a = new Object();

    /* renamed from: b */
    private boolean f1003b;

    /* renamed from: c */
    private int[] f1004c;

    /* renamed from: d */
    private Object[] f1005d;

    /* renamed from: e */
    private int f1006e;

    public C0339p() {
        this(10);
    }

    public C0339p(int i) {
        Object[] objArr;
        this.f1003b = false;
        if (i == 0) {
            this.f1004c = C0323e.f961a;
            objArr = C0323e.f963c;
        } else {
            int b = C0323e.m1398b(i);
            this.f1004c = new int[b];
            objArr = new Object[b];
        }
        this.f1005d = objArr;
        this.f1006e = 0;
    }

    /* renamed from: c */
    private void m1456c() {
        int i = this.f1006e;
        int[] iArr = this.f1004c;
        Object[] objArr = this.f1005d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f1002a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1003b = false;
        this.f1006e = i2;
    }

    /* renamed from: a */
    public void mo1449a() {
        int i = this.f1006e;
        Object[] objArr = this.f1005d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f1006e = 0;
        this.f1003b = false;
    }

    /* renamed from: a */
    public void mo1450a(int i) {
        int a = C0323e.m1395a(this.f1004c, this.f1006e, i);
        if (a >= 0) {
            Object[] objArr = this.f1005d;
            Object obj = objArr[a];
            Object obj2 = f1002a;
            if (obj != obj2) {
                objArr[a] = obj2;
                this.f1003b = true;
            }
        }
    }

    /* renamed from: a */
    public void mo1451a(int i, E e) {
        int i2 = this.f1006e;
        if (i2 == 0 || i > this.f1004c[i2 - 1]) {
            if (this.f1003b && this.f1006e >= this.f1004c.length) {
                m1456c();
            }
            int i3 = this.f1006e;
            if (i3 >= this.f1004c.length) {
                int b = C0323e.m1398b(i3 + 1);
                int[] iArr = new int[b];
                Object[] objArr = new Object[b];
                int[] iArr2 = this.f1004c;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f1005d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f1004c = iArr;
                this.f1005d = objArr;
            }
            this.f1004c[i3] = i;
            this.f1005d[i3] = e;
            this.f1006e = i3 + 1;
            return;
        }
        mo1456c(i, e);
    }

    /* renamed from: b */
    public int mo1452b() {
        if (this.f1003b) {
            m1456c();
        }
        return this.f1006e;
    }

    /* renamed from: b */
    public E mo1453b(int i) {
        return mo1454b(i, null);
    }

    /* renamed from: b */
    public E mo1454b(int i, E e) {
        int a = C0323e.m1395a(this.f1004c, this.f1006e, i);
        if (a >= 0) {
            E[] eArr = this.f1005d;
            if (eArr[a] != f1002a) {
                return eArr[a];
            }
        }
        return e;
    }

    /* renamed from: c */
    public int mo1455c(int i) {
        if (this.f1003b) {
            m1456c();
        }
        return this.f1004c[i];
    }

    /* renamed from: c */
    public void mo1456c(int i, E e) {
        int a = C0323e.m1395a(this.f1004c, this.f1006e, i);
        if (a >= 0) {
            this.f1005d[a] = e;
        } else {
            int i2 = a ^ -1;
            if (i2 < this.f1006e) {
                Object[] objArr = this.f1005d;
                if (objArr[i2] == f1002a) {
                    this.f1004c[i2] = i;
                    objArr[i2] = e;
                    return;
                }
            }
            if (this.f1003b && this.f1006e >= this.f1004c.length) {
                m1456c();
                i2 = C0323e.m1395a(this.f1004c, this.f1006e, i) ^ -1;
            }
            int i3 = this.f1006e;
            if (i3 >= this.f1004c.length) {
                int b = C0323e.m1398b(i3 + 1);
                int[] iArr = new int[b];
                Object[] objArr2 = new Object[b];
                int[] iArr2 = this.f1004c;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr3 = this.f1005d;
                System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                this.f1004c = iArr;
                this.f1005d = objArr2;
            }
            int i4 = this.f1006e;
            if (i4 - i2 != 0) {
                int[] iArr3 = this.f1004c;
                int i5 = i2 + 1;
                System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
                Object[] objArr4 = this.f1005d;
                System.arraycopy(objArr4, i2, objArr4, i5, this.f1006e - i2);
            }
            this.f1004c[i2] = i;
            this.f1005d[i2] = e;
            this.f1006e++;
        }
    }

    public C0339p<E> clone() {
        try {
            C0339p<E> pVar = (C0339p) super.clone();
            pVar.f1004c = (int[]) this.f1004c.clone();
            pVar.f1005d = (Object[]) this.f1005d.clone();
            return pVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: d */
    public void mo1458d(int i) {
        mo1450a(i);
    }

    /* renamed from: e */
    public E mo1459e(int i) {
        if (this.f1003b) {
            m1456c();
        }
        return this.f1005d[i];
    }

    public String toString() {
        if (mo1452b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1006e * 28);
        sb.append('{');
        for (int i = 0; i < this.f1006e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo1455c(i));
            sb.append('=');
            Object e = mo1459e(i);
            if (e != this) {
                sb.append(e);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
