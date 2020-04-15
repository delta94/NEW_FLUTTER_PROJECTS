package android.support.p030v7.app;

import android.view.View;

/* renamed from: android.support.v7.app.g */
class C0420g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f1443a;

    /* renamed from: b */
    final /* synthetic */ View f1444b;

    /* renamed from: c */
    final /* synthetic */ AlertController f1445c;

    C0420g(AlertController alertController, View view, View view2) {
        this.f1445c = alertController;
        this.f1443a = view;
        this.f1444b = view2;
    }

    public void run() {
        AlertController.m1786a(this.f1445c.f1293g, this.f1443a, this.f1444b);
    }
}
