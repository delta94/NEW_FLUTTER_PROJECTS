package com.facebook.react.modules.network;

import android.os.Handler.Callback;
import android.os.Message;

/* renamed from: com.facebook.react.modules.network.g */
class C1514g implements Callback {

    /* renamed from: a */
    final /* synthetic */ C1516i f4639a;

    /* renamed from: b */
    final /* synthetic */ C1517a f4640b;

    C1514g(C1517a aVar, C1516i iVar) {
        this.f4640b = aVar;
        this.f4639a = iVar;
    }

    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        this.f4640b.mo5458b();
        return true;
    }
}
