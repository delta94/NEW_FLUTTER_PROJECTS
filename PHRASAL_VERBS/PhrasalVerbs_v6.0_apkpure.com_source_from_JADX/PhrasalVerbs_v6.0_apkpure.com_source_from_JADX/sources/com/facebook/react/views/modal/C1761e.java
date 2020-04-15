package com.facebook.react.views.modal;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;
import com.facebook.react.bridge.ReactContext;
import p032c.p033a.p094k.p095a.C1136a;

/* renamed from: com.facebook.react.views.modal.e */
class C1761e implements OnKeyListener {

    /* renamed from: a */
    final /* synthetic */ C1763g f5194a;

    C1761e(C1763g gVar) {
        this.f5194a = gVar;
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            if (i == 4) {
                C1136a.m5054a(this.f5194a.f5206h, "setOnRequestCloseListener must be called by the manager");
                this.f5194a.f5206h.mo6117a(dialogInterface);
                return true;
            }
            Activity currentActivity = ((ReactContext) this.f5194a.getContext()).getCurrentActivity();
            if (currentActivity != null) {
                return currentActivity.onKeyUp(i, keyEvent);
            }
        }
        return false;
    }
}
