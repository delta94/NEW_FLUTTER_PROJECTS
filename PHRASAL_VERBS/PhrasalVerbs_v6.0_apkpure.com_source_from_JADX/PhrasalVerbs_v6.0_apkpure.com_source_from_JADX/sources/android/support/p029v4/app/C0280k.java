package android.support.p029v4.app;

import android.os.Handler;
import android.os.Message;

/* renamed from: android.support.v4.app.k */
class C0280k extends Handler {

    /* renamed from: a */
    final /* synthetic */ C0281l f821a;

    C0280k(C0281l lVar) {
        this.f821a = lVar;
    }

    public void handleMessage(Message message) {
        if (message.what != 2) {
            super.handleMessage(message);
            return;
        }
        this.f821a.mo1077f();
        this.f821a.f823d.mo1133i();
    }
}
