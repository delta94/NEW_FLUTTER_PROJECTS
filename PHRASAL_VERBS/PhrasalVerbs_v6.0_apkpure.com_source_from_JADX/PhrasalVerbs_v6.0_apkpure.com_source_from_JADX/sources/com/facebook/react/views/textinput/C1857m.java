package com.facebook.react.views.textinput;

import android.view.View;
import android.view.View.OnLongClickListener;

/* renamed from: com.facebook.react.views.textinput.m */
class C1857m implements OnLongClickListener {

    /* renamed from: a */
    final /* synthetic */ boolean f5541a;

    /* renamed from: b */
    final /* synthetic */ ReactTextInputManager f5542b;

    C1857m(ReactTextInputManager reactTextInputManager, boolean z) {
        this.f5542b = reactTextInputManager;
        this.f5541a = z;
    }

    public boolean onLongClick(View view) {
        return this.f5541a;
    }
}
