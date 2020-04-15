package com.facebook.react.views.modal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.C1638f;

/* renamed from: com.facebook.react.views.modal.d */
class C1760d implements OnShowListener {

    /* renamed from: a */
    final /* synthetic */ C1638f f5191a;

    /* renamed from: b */
    final /* synthetic */ C1763g f5192b;

    /* renamed from: c */
    final /* synthetic */ ReactModalHostManager f5193c;

    C1760d(ReactModalHostManager reactModalHostManager, C1638f fVar, C1763g gVar) {
        this.f5193c = reactModalHostManager;
        this.f5191a = fVar;
        this.f5192b = gVar;
    }

    public void onShow(DialogInterface dialogInterface) {
        this.f5191a.mo5886a((C1635c) new C1767i(this.f5192b.getId()));
    }
}
