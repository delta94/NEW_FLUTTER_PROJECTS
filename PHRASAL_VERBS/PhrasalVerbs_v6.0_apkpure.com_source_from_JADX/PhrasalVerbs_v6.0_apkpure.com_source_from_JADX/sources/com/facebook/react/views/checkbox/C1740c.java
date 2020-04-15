package com.facebook.react.views.checkbox;

import android.content.Context;
import android.support.p030v7.widget.C0614sa;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.C1635c;

/* renamed from: com.facebook.react.views.checkbox.c */
class C1740c implements OnCheckedChangeListener {
    C1740c() {
    }

    /* renamed from: a */
    private ReactContext m6702a(CompoundButton compoundButton) {
        Context context = compoundButton.getContext();
        return (ReactContext) (context instanceof C0614sa ? ((C0614sa) context).getBaseContext() : compoundButton.getContext());
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ((UIManagerModule) m6702a(compoundButton).getNativeModule(UIManagerModule.class)).getEventDispatcher().mo5886a((C1635c) new C1739b(compoundButton.getId(), z));
    }
}
