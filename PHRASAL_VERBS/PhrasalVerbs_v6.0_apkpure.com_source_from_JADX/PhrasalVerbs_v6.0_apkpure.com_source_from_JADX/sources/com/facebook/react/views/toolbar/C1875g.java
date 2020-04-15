package com.facebook.react.views.toolbar;

import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.C1638f;
import com.facebook.react.views.toolbar.p127a.C1866a;

/* renamed from: com.facebook.react.views.toolbar.g */
class C1875g implements OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C1638f f5578a;

    /* renamed from: b */
    final /* synthetic */ C1871f f5579b;

    /* renamed from: c */
    final /* synthetic */ ReactToolbarManager f5580c;

    C1875g(ReactToolbarManager reactToolbarManager, C1638f fVar, C1871f fVar2) {
        this.f5580c = reactToolbarManager;
        this.f5578a = fVar;
        this.f5579b = fVar2;
    }

    public void onClick(View view) {
        this.f5578a.mo5886a((C1635c) new C1866a(this.f5579b.getId(), -1));
    }
}
