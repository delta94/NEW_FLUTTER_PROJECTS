package p032c.p033a.p074i.p077b.p078a;

import android.os.Looper;
import okhttp3.Call;
import p032c.p033a.p074i.p090n.C1058f;

/* renamed from: c.a.i.b.a.c */
class C0891c extends C1058f {

    /* renamed from: a */
    final /* synthetic */ Call f3136a;

    /* renamed from: b */
    final /* synthetic */ C0893e f3137b;

    C0891c(C0893e eVar, Call call) {
        this.f3137b = eVar;
        this.f3136a = call;
    }

    /* renamed from: a */
    public void mo3958a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.f3136a.cancel();
        } else {
            this.f3137b.f3142b.execute(new C0890b(this));
        }
    }
}
