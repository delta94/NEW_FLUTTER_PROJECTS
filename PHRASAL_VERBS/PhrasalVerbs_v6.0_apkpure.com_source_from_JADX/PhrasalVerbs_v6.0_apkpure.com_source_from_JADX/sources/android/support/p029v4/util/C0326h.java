package android.support.p029v4.util;

/* renamed from: android.support.v4.util.h */
public class C0326h<E> implements Cloneable {

    /* renamed from: a */
    private static final Object f966a = new Object();

    /* renamed from: b */
    private boolean f967b;

    /* renamed from: c */
    private long[] f968c;

    /* renamed from: d */
    private Object[] f969d;

    /* renamed from: e */
    private int f970e;

    public C0326h() {
        this(10);
    }

    public C0326h(int i) {
        Object[] objArr;
        this.f967b = false;
        if (i == 0) {
            this.f968c = C0323e.f962b;
            objArr = C0323e.f963c;
        } else {
            int c = C0323e.m1399c(i);
            this.f968c = new long[c];
            objArr = new Object[c];
        }
        this.f969d = objArr;
        this.f970e = 0;
    }

    /* renamed from: c */
    private void m1402c() {
        int i = this.f970e;
        long[] jArr = this.f968c;
        Object[] objArr = this.f969d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f966a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f967b = false;
        this.f970e = i2;
    }

    /* renamed from: a */
    public long mo1350a(int i) {
        if (this.f967b) {
            m1402c();
        }
        return this.f968c[i];
    }

    /* renamed from: a */
    public void mo1351a() {
        int i = this.f970e;
        Object[] objArr = this.f969d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f970e = 0;
        this.f967b = false;
    }

    /* renamed from: a */
    public void mo1352a(long j) {
        int a = C0323e.m1396a(this.f968c, this.f970e, j);
        if (a >= 0) {
            Object[] objArr = this.f969d;
            Object obj = objArr[a];
            Object obj2 = f966a;
            if (obj != obj2) {
                objArr[a] = obj2;
                this.f967b = true;
            }
        }
    }

    /* renamed from: a */
    public void mo1353a(long j, E e) {
        int i = this.f970e;
        if (i == 0 || j > this.f968c[i - 1]) {
            if (this.f967b && this.f970e >= this.f968c.length) {
                m1402c();
            }
            int i2 = this.f970e;
            if (i2 >= this.f968c.length) {
                int c = C0323e.m1399c(i2 + 1);
                long[] jArr = new long[c];
                Object[] objArr = new Object[c];
                long[] jArr2 = this.f968c;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f969d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f968c = jArr;
                this.f969d = objArr;
            }
            this.f968c[i2] = j;
            this.f969d[i2] = e;
            this.f970e = i2 + 1;
            return;
        }
        mo1358c(j, e);
    }

    /* renamed from: b */
    public int mo1354b() {
        if (this.f967b) {
            m1402c();
        }
        return this.f970e;
    }

    /* renamed from: b */
    public E mo1355b(int i) {
        if (this.f967b) {
            m1402c();
        }
        return this.f969d[i];
    }

    /* renamed from: b */
    public E mo1356b(long j) {
        return mo1357b(j, null);
    }

    /* renamed from: b */
    public E mo1357b(long j, E e) {
        int a = C0323e.m1396a(this.f968c, this.f970e, j);
        if (a >= 0) {
            E[] eArr = this.f969d;
            if (eArr[a] != f966a) {
                return eArr[a];
            }
        }
        return e;
    }

    /* renamed from: c */
    public void mo1358c(long j, E e) {
        int a = C0323e.m1396a(this.f968c, this.f970e, j);
        if (a >= 0) {
            this.f969d[a] = e;
        } else {
            int i = a ^ -1;
            if (i < this.f970e) {
                Object[] objArr = this.f969d;
                if (objArr[i] == f966a) {
                    this.f968c[i] = j;
                    objArr[i] = e;
                    return;
                }
            }
            if (this.f967b && this.f970e >= this.f968c.length) {
                m1402c();
                i = C0323e.m1396a(this.f968c, this.f970e, j) ^ -1;
            }
            int i2 = this.f970e;
            if (i2 >= this.f968c.length) {
                int c = C0323e.m1399c(i2 + 1);
                long[] jArr = new long[c];
                Object[] objArr2 = new Object[c];
                long[] jArr2 = this.f968c;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr3 = this.f969d;
                System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                this.f968c = jArr;
                this.f969d = objArr2;
            }
            int i3 = this.f970e;
            if (i3 - i != 0) {
                long[] jArr3 = this.f968c;
                int i4 = i + 1;
                System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
                Object[] objArr4 = this.f969d;
                System.arraycopy(objArr4, i, objArr4, i4, this.f970e - i);
            }
            this.f968c[i] = j;
            this.f969d[i] = e;
            this.f970e++;
        }
    }

    public C0326h<E> clone() {
        try {
            C0326h<E> hVar = (C0326h) super.clone();
            hVar.f968c = (long[]) this.f968c.clone();
            hVar.f969d = (Object[]) this.f969d.clone();
            return hVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public String toString() {
        if (mo1354b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f970e * 28);
        sb.append('{');
        for (int i = 0; i < this.f970e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo1350a(i));
            sb.append('=');
            Object b = mo1355b(i);
            if (b != this) {
                sb.append(b);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
