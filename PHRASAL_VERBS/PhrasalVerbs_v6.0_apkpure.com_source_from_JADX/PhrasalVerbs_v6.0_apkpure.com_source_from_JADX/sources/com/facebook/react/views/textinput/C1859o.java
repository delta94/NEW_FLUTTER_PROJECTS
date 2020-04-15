package com.facebook.react.views.textinput;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.facebook.react.uimanager.C1578N;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.C1635c;

/* renamed from: com.facebook.react.views.textinput.o */
class C1859o implements OnEditorActionListener {

    /* renamed from: a */
    final /* synthetic */ C1846d f5546a;

    /* renamed from: b */
    final /* synthetic */ C1578N f5547b;

    /* renamed from: c */
    final /* synthetic */ ReactTextInputManager f5548c;

    C1859o(ReactTextInputManager reactTextInputManager, C1846d dVar, C1578N n) {
        this.f5548c = reactTextInputManager;
        this.f5546a = dVar;
        this.f5547b = n;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean z = false;
        if ((i & 255) > 0 || i == 0) {
            boolean blurOnSubmit = this.f5546a.getBlurOnSubmit();
            boolean z2 = (this.f5546a.getInputType() & 131072) != 0;
            ((UIManagerModule) this.f5547b.getNativeModule(UIManagerModule.class)).getEventDispatcher().mo5886a((C1635c) new C1862r(this.f5546a.getId(), this.f5546a.getText().toString()));
            if (blurOnSubmit) {
                this.f5546a.clearFocus();
            }
            if (blurOnSubmit || !z2) {
                z = true;
            }
            return z;
        } else if (i == 5) {
            return textView.focusSearch(2) != null && !textView.requestFocus(2);
        } else {
            return true;
        }
    }
}
