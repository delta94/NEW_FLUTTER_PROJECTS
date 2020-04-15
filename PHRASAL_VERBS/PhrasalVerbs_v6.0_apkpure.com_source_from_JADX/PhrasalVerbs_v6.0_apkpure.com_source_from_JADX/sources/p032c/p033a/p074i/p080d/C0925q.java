package p032c.p033a.p074i.p080d;

import android.graphics.Bitmap;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p042d.C0719k;
import p032c.p033a.p038c.p042d.C0721m;
import p032c.p033a.p038c.p045g.C0732b;
import p032c.p033a.p038c.p046h.C0744b;

/* renamed from: c.a.i.d.q */
public class C0925q<K, V> implements C0902A<K, V>, C0732b {

    /* renamed from: a */
    static final long f3201a = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: b */
    final C0922n<K, C0927b<K, V>> f3202b;

    /* renamed from: c */
    final C0922n<K, C0927b<K, V>> f3203c;

    /* renamed from: d */
    final Map<Bitmap, Object> f3204d = new WeakHashMap();

    /* renamed from: e */
    private final C0908G<V> f3205e;

    /* renamed from: f */
    private final C0926a f3206f;

    /* renamed from: g */
    private final C0721m<C0903B> f3207g;

    /* renamed from: h */
    protected C0903B f3208h;

    /* renamed from: i */
    private long f3209i;

    /* renamed from: c.a.i.d.q$a */
    public interface C0926a {
    }

    /* renamed from: c.a.i.d.q$b */
    static class C0927b<K, V> {

        /* renamed from: a */
        public final K f3210a;

        /* renamed from: b */
        public final C0744b<V> f3211b;

        /* renamed from: c */
        public int f3212c = 0;

        /* renamed from: d */
        public boolean f3213d = false;

        /* renamed from: e */
        public final C0928c<K> f3214e;

        private C0927b(K k, C0744b<V> bVar, C0928c<K> cVar) {
            C0718j.m3240a(k);
            this.f3210a = k;
            C0744b<V> a = C0744b.m3333a(bVar);
            C0718j.m3240a(a);
            this.f3211b = a;
            this.f3214e = cVar;
        }

        /* renamed from: a */
        static <K, V> C0927b<K, V> m4091a(K k, C0744b<V> bVar, C0928c<K> cVar) {
            return new C0927b<>(k, bVar, cVar);
        }
    }

    /* renamed from: c.a.i.d.q$c */
    public interface C0928c<K> {
        /* renamed from: a */
        void mo4033a(K k, boolean z);
    }

    public C0925q(C0908G<V> g, C0926a aVar, C0721m<C0903B> mVar) {
        this.f3205e = g;
        this.f3202b = new C0922n<>(m4067a(g));
        this.f3203c = new C0922n<>(m4067a(g));
        this.f3206f = aVar;
        this.f3207g = mVar;
        this.f3208h = (C0903B) this.f3207g.get();
        this.f3209i = SystemClock.uptimeMillis();
    }

    /* renamed from: a */
    private C0908G<C0927b<K, V>> m4067a(C0908G<V> g) {
        return new C0923o(this, g);
    }

    /* renamed from: a */
    private synchronized ArrayList<C0927b<K, V>> m4068a(int i, int i2) {
        int max = Math.max(i, 0);
        int max2 = Math.max(i2, 0);
        if (this.f3202b.mo4021a() <= max && this.f3202b.mo4028c() <= max2) {
            return null;
        }
        ArrayList<C0927b<K, V>> arrayList = new ArrayList<>();
        while (true) {
            if (this.f3202b.mo4021a() <= max && this.f3202b.mo4028c() <= max2) {
                return arrayList;
            }
            Object b = this.f3202b.mo4025b();
            this.f3202b.mo4026b(b);
            arrayList.add(this.f3203c.mo4026b(b));
        }
    }

    /* renamed from: a */
    private synchronized void m4069a(C0927b<K, V> bVar) {
        C0718j.m3240a(bVar);
        C0718j.m3247b(bVar.f3212c > 0);
        bVar.f3212c--;
    }

    /* renamed from: a */
    private synchronized void m4071a(ArrayList<C0927b<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m4076c((C0927b) it.next());
            }
        }
    }

    /* renamed from: b */
    private synchronized void m4072b(C0927b<K, V> bVar) {
        C0718j.m3240a(bVar);
        C0718j.m3247b(!bVar.f3213d);
        bVar.f3212c++;
    }

    /* renamed from: b */
    private void m4073b(ArrayList<C0927b<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0744b.m3336b(m4083h((C0927b) it.next()));
            }
        }
    }

    /* renamed from: b */
    private synchronized boolean m4074b(V v) {
        boolean z;
        int a = this.f3205e.mo4001a(v);
        z = true;
        if (a > this.f3208h.f3161e || mo4030a() > this.f3208h.f3158b - 1 || mo4032b() > this.f3208h.f3157a - a) {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    private void m4075c() {
        ArrayList a;
        synchronized (this) {
            a = m4068a(Math.min(this.f3208h.f3160d, this.f3208h.f3158b - mo4030a()), Math.min(this.f3208h.f3159c, this.f3208h.f3157a - mo4032b()));
            m4071a(a);
        }
        m4073b(a);
        m4077c(a);
    }

    /* renamed from: c */
    private synchronized void m4076c(C0927b<K, V> bVar) {
        C0718j.m3240a(bVar);
        C0718j.m3247b(!bVar.f3213d);
        bVar.f3213d = true;
    }

    /* renamed from: c */
    private void m4077c(ArrayList<C0927b<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m4081f((C0927b) it.next());
            }
        }
    }

    /* renamed from: d */
    private synchronized void m4078d() {
        if (this.f3209i + f3201a <= SystemClock.uptimeMillis()) {
            this.f3209i = SystemClock.uptimeMillis();
            this.f3208h = (C0903B) this.f3207g.get();
        }
    }

    /* renamed from: d */
    private synchronized boolean m4079d(C0927b<K, V> bVar) {
        boolean z;
        if (bVar.f3213d || bVar.f3212c != 0) {
            z = false;
        } else {
            this.f3202b.mo4023a(bVar.f3210a, bVar);
            z = true;
        }
        return z;
    }

    /* renamed from: e */
    private static <K, V> void m4080e(C0927b<K, V> bVar) {
        if (bVar != null) {
            C0928c<K> cVar = bVar.f3214e;
            if (cVar != null) {
                cVar.mo4033a(bVar.f3210a, true);
            }
        }
    }

    /* renamed from: f */
    private static <K, V> void m4081f(C0927b<K, V> bVar) {
        if (bVar != null) {
            C0928c<K> cVar = bVar.f3214e;
            if (cVar != null) {
                cVar.mo4033a(bVar.f3210a, false);
            }
        }
    }

    /* renamed from: g */
    private synchronized C0744b<V> m4082g(C0927b<K, V> bVar) {
        m4072b(bVar);
        return C0744b.m3335a(bVar.f3211b.mo3520n(), new C0924p(this, bVar));
    }

    /* renamed from: h */
    private synchronized C0744b<V> m4083h(C0927b<K, V> bVar) {
        C0718j.m3240a(bVar);
        return (!bVar.f3213d || bVar.f3212c != 0) ? null : bVar.f3211b;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m4084i(C0927b<K, V> bVar) {
        boolean d;
        C0744b h;
        C0718j.m3240a(bVar);
        synchronized (this) {
            m4069a(bVar);
            d = m4079d(bVar);
            h = m4083h(bVar);
        }
        C0744b.m3336b(h);
        if (!d) {
            bVar = null;
        }
        m4080e(bVar);
        m4078d();
        m4075c();
    }

    /* renamed from: a */
    public synchronized int mo4030a() {
        return this.f3203c.mo4021a() - this.f3202b.mo4021a();
    }

    /* renamed from: a */
    public int mo3975a(C0719k<K> kVar) {
        ArrayList b;
        ArrayList b2;
        synchronized (this) {
            b = this.f3202b.mo4027b(kVar);
            b2 = this.f3203c.mo4027b(kVar);
            m4071a(b2);
        }
        m4073b(b2);
        m4077c(b);
        m4078d();
        m4075c();
        return b2.size();
    }

    /* renamed from: a */
    public C0744b<V> mo3976a(K k, C0744b<V> bVar) {
        return mo4031a(k, bVar, null);
    }

    /* renamed from: a */
    public C0744b<V> mo4031a(K k, C0744b<V> bVar, C0928c<K> cVar) {
        C0927b bVar2;
        C0744b<V> bVar3;
        C0744b bVar4;
        C0718j.m3240a(k);
        C0718j.m3240a(bVar);
        m4078d();
        synchronized (this) {
            bVar2 = (C0927b) this.f3202b.mo4026b(k);
            C0927b bVar5 = (C0927b) this.f3203c.mo4026b(k);
            bVar3 = null;
            if (bVar5 != null) {
                m4076c(bVar5);
                bVar4 = m4083h(bVar5);
            } else {
                bVar4 = null;
            }
            if (m4074b((V) bVar.mo3520n())) {
                C0927b a = C0927b.m4091a(k, bVar, cVar);
                this.f3203c.mo4023a(k, a);
                bVar3 = m4082g(a);
            }
        }
        C0744b.m3336b(bVar4);
        m4081f(bVar2);
        m4075c();
        return bVar3;
    }

    /* renamed from: b */
    public synchronized int mo4032b() {
        return this.f3203c.mo4028c() - this.f3202b.mo4028c();
    }

    /* renamed from: b */
    public synchronized boolean mo3977b(C0719k<K> kVar) {
        return !this.f3203c.mo4024a(kVar).isEmpty();
    }

    public C0744b<V> get(K k) {
        C0927b bVar;
        C0744b<V> g;
        C0718j.m3240a(k);
        synchronized (this) {
            bVar = (C0927b) this.f3202b.mo4026b(k);
            C0927b bVar2 = (C0927b) this.f3203c.mo4022a(k);
            g = bVar2 != null ? m4082g(bVar2) : null;
        }
        m4081f(bVar);
        m4078d();
        m4075c();
        return g;
    }
}
