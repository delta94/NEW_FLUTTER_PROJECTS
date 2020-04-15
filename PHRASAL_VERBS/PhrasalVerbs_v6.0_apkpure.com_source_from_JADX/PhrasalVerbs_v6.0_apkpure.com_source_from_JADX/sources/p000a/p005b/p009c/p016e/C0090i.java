package p000a.p005b.p009c.p016e;

import android.os.Handler;
import java.util.concurrent.Callable;
import p000a.p005b.p009c.p016e.C0092k.C0093a;

/* renamed from: a.b.c.e.i */
class C0090i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Callable f198a;

    /* renamed from: b */
    final /* synthetic */ Handler f199b;

    /* renamed from: c */
    final /* synthetic */ C0093a f200c;

    /* renamed from: d */
    final /* synthetic */ C0092k f201d;

    C0090i(C0092k kVar, Callable callable, Handler handler, C0093a aVar) {
        this.f201d = kVar;
        this.f198a = callable;
        this.f199b = handler;
        this.f200c = aVar;
    }

    public void run() {
        Object obj;
        try {
            obj = this.f198a.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.f199b.post(new C0089h(this, obj));
    }
}
