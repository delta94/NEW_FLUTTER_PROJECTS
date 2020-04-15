package com.facebook.react.views.switchview;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.C1635c;

/* renamed from: com.facebook.react.views.switchview.c */
class C1804c implements OnCheckedChangeListener {
    C1804c() {
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ((UIManagerModule) ((ReactContext) compoundButton.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().mo5886a((C1635c) new C1803b(compoundButton.getId(), z));
    }
}
