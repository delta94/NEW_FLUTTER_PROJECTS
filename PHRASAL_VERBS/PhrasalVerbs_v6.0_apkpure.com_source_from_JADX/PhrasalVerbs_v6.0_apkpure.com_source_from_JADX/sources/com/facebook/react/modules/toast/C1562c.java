package com.facebook.react.modules.toast;

import android.widget.Toast;

/* renamed from: com.facebook.react.modules.toast.c */
class C1562c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f4745a;

    /* renamed from: b */
    final /* synthetic */ int f4746b;

    /* renamed from: c */
    final /* synthetic */ int f4747c;

    /* renamed from: d */
    final /* synthetic */ int f4748d;

    /* renamed from: e */
    final /* synthetic */ int f4749e;

    /* renamed from: f */
    final /* synthetic */ ToastModule f4750f;

    C1562c(ToastModule toastModule, String str, int i, int i2, int i3, int i4) {
        this.f4750f = toastModule;
        this.f4745a = str;
        this.f4746b = i;
        this.f4747c = i2;
        this.f4748d = i3;
        this.f4749e = i4;
    }

    public void run() {
        Toast makeText = Toast.makeText(this.f4750f.getReactApplicationContext(), this.f4745a, this.f4746b);
        makeText.setGravity(this.f4747c, this.f4748d, this.f4749e);
        makeText.show();
    }
}
