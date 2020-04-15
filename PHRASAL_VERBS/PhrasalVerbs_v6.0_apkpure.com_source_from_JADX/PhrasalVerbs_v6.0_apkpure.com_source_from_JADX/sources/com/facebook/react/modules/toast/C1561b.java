package com.facebook.react.modules.toast;

import android.widget.Toast;

/* renamed from: com.facebook.react.modules.toast.b */
class C1561b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f4741a;

    /* renamed from: b */
    final /* synthetic */ int f4742b;

    /* renamed from: c */
    final /* synthetic */ int f4743c;

    /* renamed from: d */
    final /* synthetic */ ToastModule f4744d;

    C1561b(ToastModule toastModule, String str, int i, int i2) {
        this.f4744d = toastModule;
        this.f4741a = str;
        this.f4742b = i;
        this.f4743c = i2;
    }

    public void run() {
        Toast makeText = Toast.makeText(this.f4744d.getReactApplicationContext(), this.f4741a, this.f4742b);
        makeText.setGravity(this.f4743c, 0, 0);
        makeText.show();
    }
}
