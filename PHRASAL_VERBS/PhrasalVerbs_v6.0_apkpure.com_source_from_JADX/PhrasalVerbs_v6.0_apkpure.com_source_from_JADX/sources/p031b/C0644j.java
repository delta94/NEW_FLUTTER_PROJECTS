package p031b;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;

/* renamed from: b.j */
class C0644j implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0639e f2436a;

    /* renamed from: b */
    final /* synthetic */ C0647l f2437b;

    /* renamed from: c */
    final /* synthetic */ Callable f2438c;

    C0644j(C0639e eVar, C0647l lVar, Callable callable) {
        this.f2436a = eVar;
        this.f2437b = lVar;
        this.f2438c = callable;
    }

    public void run() {
        C0639e eVar = this.f2436a;
        if (eVar == null) {
            try {
                this.f2437b.mo3331a(this.f2438c.call());
            } catch (CancellationException unused) {
                this.f2437b.mo3332b();
            } catch (Exception e) {
                this.f2437b.mo3330a(e);
            }
        } else {
            eVar.mo3314a();
            throw null;
        }
    }
}
