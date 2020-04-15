package com.facebook.react.views.swiperefresh;

import android.support.p029v4.widget.C0342C.C0344b;
import com.facebook.react.uimanager.C1578N;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.C1635c;

/* renamed from: com.facebook.react.views.swiperefresh.c */
class C1800c implements C0344b {

    /* renamed from: a */
    final /* synthetic */ C1578N f5334a;

    /* renamed from: b */
    final /* synthetic */ C1798a f5335b;

    /* renamed from: c */
    final /* synthetic */ SwipeRefreshLayoutManager f5336c;

    C1800c(SwipeRefreshLayoutManager swipeRefreshLayoutManager, C1578N n, C1798a aVar) {
        this.f5336c = swipeRefreshLayoutManager;
        this.f5334a = n;
        this.f5335b = aVar;
    }

    /* renamed from: a */
    public void mo1501a() {
        ((UIManagerModule) this.f5334a.getNativeModule(UIManagerModule.class)).getEventDispatcher().mo5886a((C1635c) new C1799b(this.f5335b.getId()));
    }
}
