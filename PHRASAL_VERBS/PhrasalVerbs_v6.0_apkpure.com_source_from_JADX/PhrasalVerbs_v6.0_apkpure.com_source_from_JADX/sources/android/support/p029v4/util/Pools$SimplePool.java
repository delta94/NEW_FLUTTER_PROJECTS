package android.support.p029v4.util;

/* renamed from: android.support.v4.util.Pools$SimplePool */
public class Pools$SimplePool<T> implements C0335l<T> {

    /* renamed from: a */
    private final Object[] f946a;

    /* renamed from: b */
    private int f947b;

    public Pools$SimplePool(int i) {
        if (i > 0) {
            this.f946a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: b */
    private boolean m1363b(T t) {
        for (int i = 0; i < this.f947b; i++) {
            if (this.f946a[i] == t) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public T mo1311a() {
        int i = this.f947b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f946a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f947b = i - 1;
        return t;
    }

    /* renamed from: a */
    public boolean mo1312a(T t) {
        if (!m1363b(t)) {
            int i = this.f947b;
            Object[] objArr = this.f946a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f947b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }
}
