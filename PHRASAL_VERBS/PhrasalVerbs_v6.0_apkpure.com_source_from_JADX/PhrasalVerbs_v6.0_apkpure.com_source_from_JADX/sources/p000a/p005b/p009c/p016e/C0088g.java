package p000a.p005b.p009c.p016e;

import android.os.Handler.Callback;
import android.os.Message;

/* renamed from: a.b.c.e.g */
class C0088g implements Callback {

    /* renamed from: a */
    final /* synthetic */ C0092k f195a;

    C0088g(C0092k kVar) {
        this.f195a = kVar;
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.f195a.mo289a();
            return true;
        } else if (i != 1) {
            return true;
        } else {
            this.f195a.mo290a((Runnable) message.obj);
            return true;
        }
    }
}
