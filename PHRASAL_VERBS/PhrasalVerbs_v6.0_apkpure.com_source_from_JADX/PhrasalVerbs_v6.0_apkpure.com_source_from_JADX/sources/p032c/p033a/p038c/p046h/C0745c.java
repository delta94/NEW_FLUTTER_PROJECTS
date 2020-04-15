package p032c.p033a.p038c.p046h;

import java.lang.ref.SoftReference;

/* renamed from: c.a.c.h.c */
public class C0745c<T> {

    /* renamed from: a */
    SoftReference<T> f2619a = null;

    /* renamed from: b */
    SoftReference<T> f2620b = null;

    /* renamed from: c */
    SoftReference<T> f2621c = null;

    /* renamed from: a */
    public void mo3523a() {
        SoftReference<T> softReference = this.f2619a;
        if (softReference != null) {
            softReference.clear();
            this.f2619a = null;
        }
        SoftReference<T> softReference2 = this.f2620b;
        if (softReference2 != null) {
            softReference2.clear();
            this.f2620b = null;
        }
        SoftReference<T> softReference3 = this.f2621c;
        if (softReference3 != null) {
            softReference3.clear();
            this.f2621c = null;
        }
    }

    /* renamed from: a */
    public void mo3524a(T t) {
        this.f2619a = new SoftReference<>(t);
        this.f2620b = new SoftReference<>(t);
        this.f2621c = new SoftReference<>(t);
    }

    /* renamed from: b */
    public T mo3525b() {
        SoftReference<T> softReference = this.f2619a;
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }
}
