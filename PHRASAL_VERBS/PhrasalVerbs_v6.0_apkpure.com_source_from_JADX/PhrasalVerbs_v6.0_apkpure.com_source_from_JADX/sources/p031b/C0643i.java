package p031b;

import java.util.concurrent.CancellationException;

/* renamed from: b.i */
class C0643i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0639e f2432a;

    /* renamed from: b */
    final /* synthetic */ C0647l f2433b;

    /* renamed from: c */
    final /* synthetic */ C0640f f2434c;

    /* renamed from: d */
    final /* synthetic */ C0645k f2435d;

    C0643i(C0639e eVar, C0647l lVar, C0640f fVar, C0645k kVar) {
        this.f2432a = eVar;
        this.f2433b = lVar;
        this.f2434c = fVar;
        this.f2435d = kVar;
    }

    public void run() {
        C0639e eVar = this.f2432a;
        if (eVar == null) {
            try {
                this.f2433b.mo3331a(this.f2434c.mo3315a(this.f2435d));
            } catch (CancellationException unused) {
                this.f2433b.mo3332b();
            } catch (Exception e) {
                this.f2433b.mo3330a(e);
            }
        } else {
            eVar.mo3314a();
            throw null;
        }
    }
}
