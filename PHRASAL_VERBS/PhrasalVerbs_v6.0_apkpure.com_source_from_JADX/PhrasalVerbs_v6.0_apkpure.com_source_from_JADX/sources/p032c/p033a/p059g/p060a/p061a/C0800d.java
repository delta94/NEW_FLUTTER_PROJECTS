package p032c.p033a.p059g.p060a.p061a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import p032c.p033a.p035b.p036a.C0657d;
import p032c.p033a.p038c.p042d.C0711e;
import p032c.p033a.p038c.p042d.C0715i;
import p032c.p033a.p038c.p042d.C0715i.C0716a;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p042d.C0721m;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p038c.p046h.C0744b;
import p032c.p033a.p051d.C0768e;
import p032c.p033a.p057f.p058a.C0785a;
import p032c.p033a.p059g.p060a.p061a.p062a.C0787a;
import p032c.p033a.p059g.p060a.p061a.p062a.C0791b;
import p032c.p033a.p059g.p060a.p061a.p062a.C0795f;
import p032c.p033a.p059g.p060a.p061a.p062a.C0796g;
import p032c.p033a.p059g.p064b.C0806b;
import p032c.p033a.p059g.p065c.C0812b;
import p032c.p033a.p059g.p065c.C0819g;
import p032c.p033a.p059g.p066d.C0822a;
import p032c.p033a.p059g.p066d.p067a.C0823a;
import p032c.p033a.p059g.p068e.C0844s;
import p032c.p033a.p059g.p068e.C0845t;
import p032c.p033a.p059g.p068e.C0845t.C0847b;
import p032c.p033a.p059g.p071h.C0871b;
import p032c.p033a.p074i.p080d.C0902A;
import p032c.p033a.p074i.p085i.C0984a;
import p032c.p033a.p074i.p086j.C0986b;
import p032c.p033a.p074i.p086j.C0989e;
import p032c.p033a.p074i.p087k.C0994c;

/* renamed from: c.a.g.a.a.d */
public class C0800d extends C0812b<C0744b<C0986b>, C0989e> {

    /* renamed from: w */
    private static final Class<?> f2764w = C0800d.class;

    /* renamed from: A */
    private final C0902A<C0657d, C0986b> f2765A;

    /* renamed from: B */
    private C0657d f2766B;

    /* renamed from: C */
    private C0721m<C0768e<C0744b<C0986b>>> f2767C;

    /* renamed from: D */
    private boolean f2768D;

    /* renamed from: E */
    private C0711e<C0984a> f2769E;

    /* renamed from: F */
    private C0796g f2770F;

    /* renamed from: G */
    private Set<C0994c> f2771G;

    /* renamed from: H */
    private C0791b f2772H;

    /* renamed from: x */
    private final Resources f2773x;

    /* renamed from: y */
    private final C0984a f2774y;

    /* renamed from: z */
    private final C0711e<C0984a> f2775z;

    public C0800d(Resources resources, C0806b bVar, C0984a aVar, Executor executor, C0902A<C0657d, C0986b> a, C0711e<C0984a> eVar) {
        super(bVar, executor, null, null);
        this.f2773x = resources;
        this.f2774y = new C0786a(resources, aVar);
        this.f2775z = eVar;
        this.f2765A = a;
    }

    /* renamed from: a */
    private Drawable m3539a(C0711e<C0984a> eVar, C0986b bVar) {
        if (eVar == null) {
            return null;
        }
        Iterator it = eVar.iterator();
        while (it.hasNext()) {
            C0984a aVar = (C0984a) it.next();
            if (aVar.mo3579a(bVar)) {
                Drawable b = aVar.mo3580b(bVar);
                if (b != null) {
                    return b;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m3540a(C0721m<C0768e<C0744b<C0986b>>> mVar) {
        this.f2767C = mVar;
        m3541a((C0986b) null);
    }

    /* renamed from: a */
    private void m3541a(C0986b bVar) {
        if (this.f2768D) {
            if (mo3686i() == null) {
                C0822a aVar = new C0822a();
                mo3670a((C0819g<? super INFO>) new C0823a<Object>(aVar));
                mo3679b((Drawable) aVar);
            }
            if (mo3686i() instanceof C0822a) {
                C0822a aVar2 = (C0822a) mo3686i();
                aVar2.mo3727a(mo3688l());
                C0871b c = mo3681c();
                C0847b bVar2 = null;
                if (c != null) {
                    C0844s a = C0845t.m3795a(c.mo3848a());
                    if (a != null) {
                        bVar2 = a.mo3832c();
                    }
                }
                aVar2.mo3726a(bVar2);
                if (bVar != null) {
                    aVar2.mo3724a(bVar.mo4199n(), bVar.mo4198m());
                    aVar2.mo3723a(bVar.mo4196p());
                } else {
                    aVar2.mo3722a();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Drawable mo3627a(C0744b<C0986b> bVar) {
        C0718j.m3247b(C0744b.m3337c(bVar));
        C0986b bVar2 = (C0986b) bVar.mo3520n();
        m3541a(bVar2);
        Drawable a = m3539a(this.f2769E, bVar2);
        if (a != null) {
            return a;
        }
        Drawable a2 = m3539a(this.f2775z, bVar2);
        if (a2 != null) {
            return a2;
        }
        Drawable b = this.f2774y.mo3580b(bVar2);
        if (b != null) {
            return b;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unrecognized image class: ");
        sb.append(bVar2);
        throw new UnsupportedOperationException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3628a(Drawable drawable) {
        if (drawable instanceof C0785a) {
            ((C0785a) drawable).mo3578a();
        }
    }

    /* renamed from: a */
    public void mo3629a(C0711e<C0984a> eVar) {
        this.f2769E = eVar;
    }

    /* renamed from: a */
    public void mo3630a(C0721m<C0768e<C0744b<C0986b>>> mVar, String str, C0657d dVar, Object obj, C0711e<C0984a> eVar, C0791b bVar) {
        super.mo3674a(str, obj);
        m3540a(mVar);
        this.f2766B = dVar;
        mo3629a(eVar);
        mo3648p();
        mo3631a(bVar);
    }

    /* renamed from: a */
    public synchronized void mo3631a(C0791b bVar) {
        if (this.f2772H instanceof C0787a) {
            ((C0787a) this.f2772H).mo3581a(bVar);
        } else if (this.f2772H != null) {
            this.f2772H = new C0787a(this.f2772H, bVar);
        } else {
            this.f2772H = bVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo3632a(C0795f fVar) {
        if (this.f2770F != null) {
            this.f2770F.mo3602b();
        }
        if (fVar != null) {
            if (this.f2770F == null) {
                this.f2770F = new C0796g(RealtimeSinceBootClock.get(), this);
            }
            this.f2770F.mo3599a(fVar);
            this.f2770F.mo3601a(true);
        }
    }

    /* renamed from: a */
    public void mo3633a(C0871b bVar) {
        super.mo3633a(bVar);
        m3541a((C0986b) null);
    }

    /* renamed from: a */
    public synchronized void mo3634a(C0994c cVar) {
        if (this.f2771G == null) {
            this.f2771G = new HashSet();
        }
        this.f2771G.add(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3639b(String str, C0744b<C0986b> bVar) {
        super.mo3639b(str, bVar);
        synchronized (this) {
            if (this.f2772H != null) {
                this.f2772H.mo3582a(str, 3, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo3641c(C0744b<C0986b> bVar) {
        if (bVar != null) {
            return bVar.mo3521o();
        }
        return 0;
    }

    /* renamed from: b */
    public synchronized void mo3637b(C0791b bVar) {
        if (this.f2772H instanceof C0787a) {
            ((C0787a) this.f2772H).mo3583b(bVar);
        } else if (this.f2772H != null) {
            this.f2772H = new C0787a(this.f2772H, bVar);
        } else {
            this.f2772H = bVar;
        }
    }

    /* renamed from: b */
    public synchronized void mo3638b(C0994c cVar) {
        if (this.f2771G != null) {
            this.f2771G.remove(cVar);
        }
    }

    /* renamed from: b */
    public void mo3640b(boolean z) {
        this.f2768D = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C0989e mo3643d(C0744b<C0986b> bVar) {
        C0718j.m3247b(C0744b.m3337c(bVar));
        return (C0989e) bVar.mo3520n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo3645e(C0744b<C0986b> bVar) {
        C0744b.m3336b(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C0744b<C0986b> m3563g() {
        C0902A<C0657d, C0986b> a = this.f2765A;
        if (a != null) {
            C0657d dVar = this.f2766B;
            if (dVar != null) {
                C0744b<C0986b> bVar = a.get(dVar);
                if (bVar == null || ((C0986b) bVar.mo3520n()).mo4195o().mo4227a()) {
                    return bVar;
                }
                bVar.close();
                return null;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C0768e<C0744b<C0986b>> mo3647j() {
        if (C0727a.m3269a(2)) {
            C0727a.m3271b(f2764w, "controller %x: getDataSource", (Object) Integer.valueOf(System.identityHashCode(this)));
        }
        return (C0768e) this.f2767C.get();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo3648p() {
        synchronized (this) {
            this.f2772H = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return r1;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p032c.p033a.p074i.p087k.C0994c mo3649q() {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            c.a.g.a.a.a.b r1 = r3.f2772H     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x0011
            c.a.g.a.a.a.c r0 = new c.a.g.a.a.a.c     // Catch:{ all -> 0x0025 }
            java.lang.String r1 = r3.mo3688l()     // Catch:{ all -> 0x0025 }
            c.a.g.a.a.a.b r2 = r3.f2772H     // Catch:{ all -> 0x0025 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0025 }
        L_0x0011:
            java.util.Set<c.a.i.k.c> r1 = r3.f2771G     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x0023
            c.a.i.k.b r1 = new c.a.i.k.b     // Catch:{ all -> 0x0025 }
            java.util.Set<c.a.i.k.c> r2 = r3.f2771G     // Catch:{ all -> 0x0025 }
            r1.<init>(r2)     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0021
            r1.mo4238a(r0)     // Catch:{ all -> 0x0025 }
        L_0x0021:
            monitor-exit(r3)
            return r1
        L_0x0023:
            monitor-exit(r3)
            return r0
        L_0x0025:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p032c.p033a.p059g.p060a.p061a.C0800d.mo3649q():c.a.i.k.c");
    }

    public String toString() {
        C0716a a = C0715i.m3230a((Object) this);
        a.mo3471a("super", (Object) super.toString());
        a.mo3471a("dataSourceSupplier", (Object) this.f2767C);
        return a.toString();
    }
}
