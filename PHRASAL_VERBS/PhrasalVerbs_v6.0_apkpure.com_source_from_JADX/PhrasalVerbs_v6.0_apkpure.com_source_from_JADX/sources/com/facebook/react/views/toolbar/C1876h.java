package com.facebook.react.views.toolbar;

import android.support.p030v7.widget.Toolbar.C0546c;
import android.view.MenuItem;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.C1638f;
import com.facebook.react.views.toolbar.p127a.C1866a;

/* renamed from: com.facebook.react.views.toolbar.h */
class C1876h implements C0546c {

    /* renamed from: a */
    final /* synthetic */ C1638f f5581a;

    /* renamed from: b */
    final /* synthetic */ C1871f f5582b;

    /* renamed from: c */
    final /* synthetic */ ReactToolbarManager f5583c;

    C1876h(ReactToolbarManager reactToolbarManager, C1638f fVar, C1871f fVar2) {
        this.f5583c = reactToolbarManager;
        this.f5581a = fVar;
        this.f5582b = fVar2;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f5581a.mo5886a((C1635c) new C1866a(this.f5582b.getId(), menuItem.getOrder()));
        return true;
    }
}
