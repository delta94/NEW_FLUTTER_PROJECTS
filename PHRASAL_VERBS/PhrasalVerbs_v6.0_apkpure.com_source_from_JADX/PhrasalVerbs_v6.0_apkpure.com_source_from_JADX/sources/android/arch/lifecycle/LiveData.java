package android.arch.lifecycle;

import android.arch.lifecycle.C0211d.C0212a;
import android.arch.lifecycle.C0211d.C0213b;
import java.util.Map.Entry;
import p000a.p001a.p002a.p003a.C0002c;
import p000a.p001a.p002a.p004b.C0007c;

public abstract class LiveData<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Object f554a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f555b = new Object();

    /* renamed from: c */
    private C0007c<C0224n<T>, C0205a> f556c = new C0007c<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f557d = 0;

    /* renamed from: e */
    private volatile Object f558e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public volatile Object f559f;

    /* renamed from: g */
    private int f560g;

    /* renamed from: h */
    private boolean f561h;

    /* renamed from: i */
    private boolean f562i;

    /* renamed from: j */
    private final Runnable f563j;

    class LifecycleBoundObserver extends C0205a implements GenericLifecycleObserver {

        /* renamed from: e */
        final C0215f f564e;

        LifecycleBoundObserver(C0215f fVar, C0224n<T> nVar) {
            super(nVar);
            this.f564e = fVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo802a() {
            this.f564e.mo817a().mo815b(this);
        }

        /* renamed from: a */
        public void mo790a(C0215f fVar, C0212a aVar) {
            if (this.f564e.mo817a().mo813a() == C0213b.DESTROYED) {
                LiveData.this.mo798a(this.f566a);
            } else {
                mo805a(mo804b());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo803a(C0215f fVar) {
            return this.f564e == fVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo804b() {
            return this.f564e.mo817a().mo813a().mo816a(C0213b.STARTED);
        }
    }

    /* renamed from: android.arch.lifecycle.LiveData$a */
    private abstract class C0205a {

        /* renamed from: a */
        final C0224n<T> f566a;

        /* renamed from: b */
        boolean f567b;

        /* renamed from: c */
        int f568c = -1;

        C0205a(C0224n<T> nVar) {
            this.f566a = nVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo802a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo805a(boolean z) {
            if (z != this.f567b) {
                this.f567b = z;
                int i = 1;
                boolean z2 = LiveData.this.f557d == 0;
                LiveData liveData = LiveData.this;
                int c = liveData.f557d;
                if (!this.f567b) {
                    i = -1;
                }
                liveData.f557d = c + i;
                if (z2 && this.f567b) {
                    LiveData.this.mo800b();
                }
                if (LiveData.this.f557d == 0 && !this.f567b) {
                    LiveData.this.mo801c();
                }
                if (this.f567b) {
                    LiveData.this.m777b(this);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo803a(C0215f fVar) {
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract boolean mo804b();
    }

    public LiveData() {
        Object obj = f554a;
        this.f558e = obj;
        this.f559f = obj;
        this.f560g = -1;
        this.f563j = new C0221k(this);
    }

    /* renamed from: a */
    private void m773a(C0205a aVar) {
        if (aVar.f567b) {
            if (!aVar.mo804b()) {
                aVar.mo805a(false);
                return;
            }
            int i = aVar.f568c;
            int i2 = this.f560g;
            if (i < i2) {
                aVar.f568c = i2;
                aVar.f566a.mo822a(this.f558e);
            }
        }
    }

    /* renamed from: a */
    private static void m775a(String str) {
        if (!C0002c.m0b().mo4a()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot invoke ");
            sb.append(str);
            sb.append(" on a background");
            sb.append(" thread");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m777b(C0205a aVar) {
        if (this.f561h) {
            this.f562i = true;
            return;
        }
        this.f561h = true;
        do {
            this.f562i = false;
            if (aVar == null) {
                C0011d b = this.f556c.mo13b();
                while (b.hasNext()) {
                    m773a((C0205a) ((Entry) b.next()).getValue());
                    if (this.f562i) {
                        break;
                    }
                }
            } else {
                m773a(aVar);
                aVar = null;
            }
        } while (this.f562i);
        this.f561h = false;
    }

    /* renamed from: a */
    public void mo797a(C0215f fVar, C0224n<T> nVar) {
        if (fVar.mo817a().mo813a() != C0213b.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(fVar, nVar);
            C0205a aVar = (C0205a) this.f556c.mo7b(nVar, lifecycleBoundObserver);
            if (aVar != null && !aVar.mo803a(fVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (aVar == null) {
                fVar.mo817a().mo814a(lifecycleBoundObserver);
            }
        }
    }

    /* renamed from: a */
    public void mo798a(C0224n<T> nVar) {
        m775a("removeObserver");
        C0205a aVar = (C0205a) this.f556c.remove(nVar);
        if (aVar != null) {
            aVar.mo802a();
            aVar.mo805a(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo799a(T t) {
        m775a("setValue");
        this.f560g++;
        this.f558e = t;
        m777b(null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo800b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo801c() {
    }
}
