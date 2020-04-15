package android.support.p029v4.util;

/* renamed from: android.support.v4.util.m */
public class C0336m<T> extends Pools$SimplePool<T> {

    /* renamed from: c */
    private final Object f994c = new Object();

    public C0336m(int i) {
        super(i);
    }

    /* renamed from: a */
    public T mo1311a() {
        T a;
        synchronized (this.f994c) {
            a = super.mo1311a();
        }
        return a;
    }

    /* renamed from: a */
    public boolean mo1312a(T t) {
        boolean a;
        synchronized (this.f994c) {
            a = super.mo1312a(t);
        }
        return a;
    }
}
