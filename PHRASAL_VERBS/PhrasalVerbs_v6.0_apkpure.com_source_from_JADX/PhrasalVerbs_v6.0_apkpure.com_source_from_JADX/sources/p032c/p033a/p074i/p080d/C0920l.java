package p032c.p033a.p074i.p080d;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p031b.C0645k;
import p032c.p033a.p034a.C0650a;
import p032c.p033a.p035b.p036a.C0657d;
import p032c.p033a.p035b.p037b.C0689n;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p038c.p045g.C0737g;
import p032c.p033a.p038c.p045g.C0739h;
import p032c.p033a.p038c.p045g.C0742k;
import p032c.p033a.p074i.p086j.C0988d;

/* renamed from: c.a.i.d.l */
public class C0920l {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Class<?> f3186a = C0920l.class;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C0689n f3187b;

    /* renamed from: c */
    private final C0739h f3188c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C0742k f3189d;

    /* renamed from: e */
    private final Executor f3190e;

    /* renamed from: f */
    private final Executor f3191f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C0907F f3192g = C0907F.m4013b();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C0936y f3193h;

    public C0920l(C0689n nVar, C0739h hVar, C0742k kVar, Executor executor, Executor executor2, C0936y yVar) {
        this.f3187b = nVar;
        this.f3188c = hVar;
        this.f3189d = kVar;
        this.f3190e = executor;
        this.f3191f = executor2;
        this.f3193h = yVar;
    }

    /* renamed from: b */
    private C0645k<C0988d> m4037b(C0657d dVar, C0988d dVar2) {
        C0727a.m3271b(f3186a, "Found image for %s in staging area", (Object) dVar.mo3352a());
        this.f3193h.mo3989c(dVar);
        return C0645k.m2999a(dVar2);
    }

    /* renamed from: b */
    private C0645k<C0988d> m4038b(C0657d dVar, AtomicBoolean atomicBoolean) {
        try {
            return C0645k.m3000a(new C0915g(this, atomicBoolean, dVar), this.f3190e);
        } catch (Exception e) {
            C0727a.m3274b(f3186a, e, "Failed to schedule disk-cache read for %s", dVar.mo3352a());
            return C0645k.m2998a(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m4041c(C0657d dVar, C0988d dVar2) {
        C0727a.m3271b(f3186a, "About to write to disk-cache for key %s", (Object) dVar.mo3352a());
        try {
            this.f3187b.mo3405a(dVar, new C0919k(this, dVar2));
            C0727a.m3271b(f3186a, "Successful disk-cache write for key %s", (Object) dVar.mo3352a());
        } catch (IOException e) {
            C0727a.m3274b(f3186a, e, "Failed to write to disk-cache for key %s", dVar.mo3352a());
        }
    }

    /* renamed from: d */
    private boolean m4043d(C0657d dVar) {
        C0988d b = this.f3192g.mo3998b(dVar);
        if (b != null) {
            b.close();
            C0727a.m3271b(f3186a, "Found image for %s in staging area", (Object) dVar.mo3352a());
            this.f3193h.mo3989c(dVar);
            return true;
        }
        C0727a.m3271b(f3186a, "Did not find image for %s in staging area", (Object) dVar.mo3352a());
        this.f3193h.mo3992f();
        try {
            return this.f3187b.mo3409d(dVar);
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public C0737g m4044e(C0657d dVar) {
        InputStream a;
        try {
            C0727a.m3271b(f3186a, "Disk cache read for %s", (Object) dVar.mo3352a());
            C0650a a2 = this.f3187b.mo3404a(dVar);
            if (a2 == null) {
                C0727a.m3271b(f3186a, "Disk cache miss for %s", (Object) dVar.mo3352a());
                this.f3193h.mo3990d();
                return null;
            }
            C0727a.m3271b(f3186a, "Found entry in disk cache for %s", (Object) dVar.mo3352a());
            this.f3193h.mo3982a();
            a = a2.mo3338a();
            C0737g a3 = this.f3188c.mo3499a(a, (int) a2.size());
            a.close();
            C0727a.m3271b(f3186a, "Successful read from disk cache for %s", (Object) dVar.mo3352a());
            return a3;
        } catch (IOException e) {
            C0727a.m3274b(f3186a, e, "Exception reading from cache for %s", dVar.mo3352a());
            this.f3193h.mo3988c();
            throw e;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* renamed from: a */
    public C0645k<C0988d> mo4011a(C0657d dVar, AtomicBoolean atomicBoolean) {
        C0988d b = this.f3192g.mo3998b(dVar);
        return b != null ? m4037b(dVar, b) : m4038b(dVar, atomicBoolean);
    }

    /* renamed from: a */
    public void mo4012a(C0657d dVar, C0988d dVar2) {
        C0718j.m3240a(dVar);
        C0718j.m3243a(C0988d.m4408e(dVar2));
        this.f3192g.mo3996a(dVar, dVar2);
        C0988d a = C0988d.m4405a(dVar2);
        try {
            this.f3191f.execute(new C0916h(this, dVar, a));
        } catch (Exception e) {
            C0727a.m3274b(f3186a, e, "Failed to schedule disk-cache write for %s", dVar.mo3352a());
            this.f3192g.mo3999b(dVar, dVar2);
            C0988d.m4406b(a);
        }
    }

    /* renamed from: a */
    public boolean mo4013a(C0657d dVar) {
        return this.f3192g.mo3997a(dVar) || this.f3187b.mo3407b(dVar);
    }

    /* renamed from: b */
    public C0645k<Void> mo4014b() {
        this.f3192g.mo3995a();
        try {
            return C0645k.m3000a(new C0918j(this), this.f3191f);
        } catch (Exception e) {
            C0727a.m3274b(f3186a, e, "Failed to schedule disk-cache clear", new Object[0]);
            return C0645k.m2998a(e);
        }
    }

    /* renamed from: b */
    public boolean mo4015b(C0657d dVar) {
        if (mo4013a(dVar)) {
            return true;
        }
        return m4043d(dVar);
    }

    /* renamed from: c */
    public C0645k<Void> mo4016c(C0657d dVar) {
        C0718j.m3240a(dVar);
        this.f3192g.mo4000c(dVar);
        try {
            return C0645k.m3000a(new C0917i(this, dVar), this.f3191f);
        } catch (Exception e) {
            C0727a.m3274b(f3186a, e, "Failed to schedule disk-cache remove for %s", dVar.mo3352a());
            return C0645k.m2998a(e);
        }
    }
}
