package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.p123c.C1611i;

/* renamed from: com.facebook.react.uimanager.q */
class C1704q implements C1611i {

    /* renamed from: a */
    final /* synthetic */ ViewGroupManager f5058a;

    /* renamed from: b */
    final /* synthetic */ ViewGroup f5059b;

    /* renamed from: c */
    final /* synthetic */ View f5060c;

    /* renamed from: d */
    final /* synthetic */ C1719s f5061d;

    C1704q(C1719s sVar, ViewGroupManager viewGroupManager, ViewGroup viewGroup, View view) {
        this.f5061d = sVar;
        this.f5058a = viewGroupManager;
        this.f5059b = viewGroup;
        this.f5060c = view;
    }

    /* renamed from: a */
    public void mo5847a() {
        this.f5058a.removeView(this.f5059b, this.f5060c);
        this.f5061d.mo5999a(this.f5060c);
    }
}
