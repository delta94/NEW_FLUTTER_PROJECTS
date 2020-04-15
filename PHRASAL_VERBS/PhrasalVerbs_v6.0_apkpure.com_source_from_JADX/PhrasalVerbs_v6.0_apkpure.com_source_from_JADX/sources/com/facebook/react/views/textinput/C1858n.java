package com.facebook.react.views.textinput;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.facebook.react.uimanager.C1578N;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.C1638f;

/* renamed from: com.facebook.react.views.textinput.n */
class C1858n implements OnFocusChangeListener {

    /* renamed from: a */
    final /* synthetic */ C1578N f5543a;

    /* renamed from: b */
    final /* synthetic */ C1846d f5544b;

    /* renamed from: c */
    final /* synthetic */ ReactTextInputManager f5545c;

    C1858n(ReactTextInputManager reactTextInputManager, C1578N n, C1846d dVar) {
        this.f5545c = reactTextInputManager;
        this.f5543a = n;
        this.f5544b = dVar;
    }

    public void onFocusChange(View view, boolean z) {
        C1635c cVar;
        C1638f eventDispatcher = ((UIManagerModule) this.f5543a.getNativeModule(UIManagerModule.class)).getEventDispatcher();
        if (z) {
            cVar = new C1854j(this.f5544b.getId());
        } else {
            eventDispatcher.mo5886a((C1635c) new C1851g(this.f5544b.getId()));
            cVar = new C1852h(this.f5544b.getId(), this.f5544b.getText().toString());
        }
        eventDispatcher.mo5886a(cVar);
    }
}
