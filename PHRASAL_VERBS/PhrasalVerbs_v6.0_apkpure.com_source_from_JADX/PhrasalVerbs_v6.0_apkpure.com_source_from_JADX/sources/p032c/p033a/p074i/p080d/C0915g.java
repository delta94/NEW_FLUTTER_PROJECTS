package p032c.p033a.p074i.p080d;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import p032c.p033a.p035b.p036a.C0657d;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p038c.p046h.C0744b;
import p032c.p033a.p074i.p086j.C0988d;

/* renamed from: c.a.i.d.g */
class C0915g implements Callable<C0988d> {

    /* renamed from: a */
    final /* synthetic */ AtomicBoolean f3175a;

    /* renamed from: b */
    final /* synthetic */ C0657d f3176b;

    /* renamed from: c */
    final /* synthetic */ C0920l f3177c;

    C0915g(C0920l lVar, AtomicBoolean atomicBoolean, C0657d dVar) {
        this.f3177c = lVar;
        this.f3175a = atomicBoolean;
        this.f3176b = dVar;
    }

    public C0988d call() {
        C0744b a;
        if (!this.f3175a.get()) {
            C0988d b = this.f3177c.f3192g.mo3998b(this.f3176b);
            if (b != null) {
                C0727a.m3271b(C0920l.f3186a, "Found image for %s in staging area", (Object) this.f3176b.mo3352a());
                this.f3177c.f3193h.mo3989c(this.f3176b);
            } else {
                C0727a.m3271b(C0920l.f3186a, "Did not find image for %s in staging area", (Object) this.f3176b.mo3352a());
                this.f3177c.f3193h.mo3992f();
                try {
                    a = C0744b.m3334a(this.f3177c.m4044e(this.f3176b));
                    C0988d dVar = new C0988d(a);
                    C0744b.m3336b(a);
                    b = dVar;
                } catch (Exception unused) {
                    return null;
                } catch (Throwable th) {
                    C0744b.m3336b(a);
                    throw th;
                }
            }
            if (!Thread.interrupted()) {
                return b;
            }
            C0727a.m3270b(C0920l.f3186a, "Host thread was interrupted, decreasing reference count");
            if (b != null) {
                b.close();
            }
            throw new InterruptedException();
        }
        throw new CancellationException();
    }
}
