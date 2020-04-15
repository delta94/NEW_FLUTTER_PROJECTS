package android.arch.lifecycle;

import android.arch.lifecycle.C0211d.C0212a;
import android.arch.lifecycle.C0211d.C0213b;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import p000a.p001a.p002a.p004b.C0005a;

/* renamed from: android.arch.lifecycle.h */
public class C0217h extends C0211d {

    /* renamed from: a */
    private C0005a<C0214e, C0218a> f589a = new C0005a<>();

    /* renamed from: b */
    private C0213b f590b;

    /* renamed from: c */
    private final WeakReference<C0215f> f591c;

    /* renamed from: d */
    private int f592d = 0;

    /* renamed from: e */
    private boolean f593e = false;

    /* renamed from: f */
    private boolean f594f = false;

    /* renamed from: g */
    private ArrayList<C0213b> f595g = new ArrayList<>();

    /* renamed from: android.arch.lifecycle.h$a */
    static class C0218a {

        /* renamed from: a */
        C0213b f596a;

        /* renamed from: b */
        GenericLifecycleObserver f597b;

        C0218a(C0214e eVar, C0213b bVar) {
            this.f597b = C0220j.m827a((Object) eVar);
            this.f596a = bVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo820a(C0215f fVar, C0212a aVar) {
            C0213b a = C0217h.m808a(aVar);
            this.f596a = C0217h.m809a(this.f596a, a);
            this.f597b.mo790a(fVar, aVar);
            this.f596a = a;
        }
    }

    public C0217h(C0215f fVar) {
        this.f591c = new WeakReference<>(fVar);
        this.f590b = C0213b.INITIALIZED;
    }

    /* renamed from: a */
    static C0213b m808a(C0212a aVar) {
        switch (C0216g.f587a[aVar.ordinal()]) {
            case 1:
            case 2:
                return C0213b.CREATED;
            case 3:
            case 4:
                return C0213b.STARTED;
            case 5:
                return C0213b.RESUMED;
            case 6:
                return C0213b.DESTROYED;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected event value ");
                sb.append(aVar);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    static C0213b m809a(C0213b bVar, C0213b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    /* renamed from: a */
    private void m810a(C0215f fVar) {
        Iterator descendingIterator = this.f589a.descendingIterator();
        while (descendingIterator.hasNext() && !this.f594f) {
            Entry entry = (Entry) descendingIterator.next();
            C0218a aVar = (C0218a) entry.getValue();
            while (aVar.f596a.compareTo(this.f590b) > 0 && !this.f594f && this.f589a.contains(entry.getKey())) {
                C0212a b = m811b(aVar.f596a);
                m818d(m808a(b));
                aVar.mo820a(fVar, b);
                m815c();
            }
        }
    }

    /* renamed from: b */
    private static C0212a m811b(C0213b bVar) {
        int i = C0216g.f588b[bVar.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        } else if (i == 2) {
            return C0212a.ON_DESTROY;
        } else {
            if (i == 3) {
                return C0212a.ON_STOP;
            }
            if (i == 4) {
                return C0212a.ON_PAUSE;
            }
            if (i != 5) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected state value ");
                sb.append(bVar);
                throw new IllegalArgumentException(sb.toString());
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    private void m812b(C0215f fVar) {
        C0011d b = this.f589a.mo13b();
        while (b.hasNext() && !this.f594f) {
            Entry entry = (Entry) b.next();
            C0218a aVar = (C0218a) entry.getValue();
            while (aVar.f596a.compareTo(this.f590b) < 0 && !this.f594f && this.f589a.contains(entry.getKey())) {
                m818d(aVar.f596a);
                aVar.mo820a(fVar, m819e(aVar.f596a));
                m815c();
            }
        }
    }

    /* renamed from: b */
    private boolean m813b() {
        boolean z = true;
        if (this.f589a.size() == 0) {
            return true;
        }
        C0213b bVar = ((C0218a) this.f589a.mo12a().getValue()).f596a;
        C0213b bVar2 = ((C0218a) this.f589a.mo14c().getValue()).f596a;
        if (!(bVar == bVar2 && this.f590b == bVar2)) {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    private C0213b m814c(C0214e eVar) {
        Entry b = this.f589a.mo8b(eVar);
        C0213b bVar = null;
        C0213b bVar2 = b != null ? ((C0218a) b.getValue()).f596a : null;
        if (!this.f595g.isEmpty()) {
            ArrayList<C0213b> arrayList = this.f595g;
            bVar = (C0213b) arrayList.get(arrayList.size() - 1);
        }
        return m809a(m809a(this.f590b, bVar2), bVar);
    }

    /* renamed from: c */
    private void m815c() {
        ArrayList<C0213b> arrayList = this.f595g;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: c */
    private void m816c(C0213b bVar) {
        if (this.f590b != bVar) {
            this.f590b = bVar;
            if (this.f593e || this.f592d != 0) {
                this.f594f = true;
                return;
            }
            this.f593e = true;
            m817d();
            this.f593e = false;
        }
    }

    /* renamed from: d */
    private void m817d() {
        C0215f fVar = (C0215f) this.f591c.get();
        if (fVar == null) {
            Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
            return;
        }
        while (!m813b()) {
            this.f594f = false;
            if (this.f590b.compareTo(((C0218a) this.f589a.mo12a().getValue()).f596a) < 0) {
                m810a(fVar);
            }
            Entry c = this.f589a.mo14c();
            if (!this.f594f && c != null && this.f590b.compareTo(((C0218a) c.getValue()).f596a) > 0) {
                m812b(fVar);
            }
        }
        this.f594f = false;
    }

    /* renamed from: d */
    private void m818d(C0213b bVar) {
        this.f595g.add(bVar);
    }

    /* renamed from: e */
    private static C0212a m819e(C0213b bVar) {
        int i = C0216g.f588b[bVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return C0212a.ON_START;
            }
            if (i == 3) {
                return C0212a.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            } else if (i != 5) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected state value ");
                sb.append(bVar);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return C0212a.ON_CREATE;
    }

    /* renamed from: a */
    public C0213b mo813a() {
        return this.f590b;
    }

    /* renamed from: a */
    public void mo818a(C0213b bVar) {
        m816c(bVar);
    }

    /* renamed from: a */
    public void mo814a(C0214e eVar) {
        C0213b bVar = this.f590b;
        C0213b bVar2 = C0213b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = C0213b.INITIALIZED;
        }
        C0218a aVar = new C0218a(eVar, bVar2);
        if (((C0218a) this.f589a.mo7b(eVar, aVar)) == null) {
            C0215f fVar = (C0215f) this.f591c.get();
            if (fVar != null) {
                boolean z = this.f592d != 0 || this.f593e;
                C0213b c = m814c(eVar);
                this.f592d++;
                while (aVar.f596a.compareTo(c) < 0 && this.f589a.contains(eVar)) {
                    m818d(aVar.f596a);
                    aVar.mo820a(fVar, m819e(aVar.f596a));
                    m815c();
                    c = m814c(eVar);
                }
                if (!z) {
                    m817d();
                }
                this.f592d--;
            }
        }
    }

    /* renamed from: b */
    public void mo819b(C0212a aVar) {
        m816c(m808a(aVar));
    }

    /* renamed from: b */
    public void mo815b(C0214e eVar) {
        this.f589a.remove(eVar);
    }
}
