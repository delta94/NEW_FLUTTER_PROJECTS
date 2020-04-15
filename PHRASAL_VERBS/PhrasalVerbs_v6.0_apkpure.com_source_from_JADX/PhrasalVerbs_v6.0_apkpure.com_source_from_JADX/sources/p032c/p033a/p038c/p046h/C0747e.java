package p032c.p033a.p038c.p046h;

import java.util.IdentityHashMap;
import java.util.Map;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p043e.C0727a;

/* renamed from: c.a.c.h.e */
public class C0747e<T> {

    /* renamed from: a */
    private static final Map<Object, Integer> f2622a = new IdentityHashMap();

    /* renamed from: b */
    private T f2623b;

    /* renamed from: c */
    private int f2624c = 1;

    /* renamed from: d */
    private final C0746d<T> f2625d;

    /* renamed from: c.a.c.h.e$a */
    public static class C0748a extends RuntimeException {
        public C0748a() {
            super("Null shared reference");
        }
    }

    public C0747e(T t, C0746d<T> dVar) {
        C0718j.m3240a(t);
        this.f2623b = t;
        C0718j.m3240a(dVar);
        this.f2625d = dVar;
        m3346a((Object) t);
    }

    /* renamed from: a */
    private static void m3346a(Object obj) {
        synchronized (f2622a) {
            Integer num = (Integer) f2622a.get(obj);
            if (num == null) {
                f2622a.put(obj, Integer.valueOf(1));
            } else {
                f2622a.put(obj, Integer.valueOf(num.intValue() + 1));
            }
        }
    }

    /* renamed from: a */
    public static boolean m3347a(C0747e<?> eVar) {
        return eVar != null && eVar.mo3529d();
    }

    /* renamed from: b */
    private static void m3348b(Object obj) {
        synchronized (f2622a) {
            Integer num = (Integer) f2622a.get(obj);
            if (num == null) {
                C0727a.m3285d("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
            } else if (num.intValue() == 1) {
                f2622a.remove(obj);
            } else {
                f2622a.put(obj, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    /* renamed from: e */
    private synchronized int m3349e() {
        m3350f();
        C0718j.m3243a(this.f2624c > 0);
        this.f2624c--;
        return this.f2624c;
    }

    /* renamed from: f */
    private void m3350f() {
        if (!m3347a(this)) {
            throw new C0748a();
        }
    }

    /* renamed from: a */
    public synchronized void mo3526a() {
        m3350f();
        this.f2624c++;
    }

    /* renamed from: b */
    public void mo3527b() {
        T t;
        if (m3349e() == 0) {
            synchronized (this) {
                t = this.f2623b;
                this.f2623b = null;
            }
            this.f2625d.mo3486a(t);
            m3348b(t);
        }
    }

    /* renamed from: c */
    public synchronized T mo3528c() {
        return this.f2623b;
    }

    /* renamed from: d */
    public synchronized boolean mo3529d() {
        return this.f2624c > 0;
    }
}
