package com.facebook.react.modules.toast;

import android.widget.Toast;

/* renamed from: com.facebook.react.modules.toast.a */
class C1560a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f4738a;

    /* renamed from: b */
    final /* synthetic */ int f4739b;

    /* renamed from: c */
    final /* synthetic */ ToastModule f4740c;

    C1560a(ToastModule toastModule, String str, int i) {
        this.f4740c = toastModule;
        this.f4738a = str;
        this.f4739b = i;
    }

    public void run() {
        Toast.makeText(this.f4740c.getReactApplicationContext(), this.f4738a, this.f4739b).show();
    }
}
