package android.support.p030v7.app;

import android.view.View;

/* renamed from: android.support.v7.app.e */
class C0418e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f1437a;

    /* renamed from: b */
    final /* synthetic */ View f1438b;

    /* renamed from: c */
    final /* synthetic */ AlertController f1439c;

    C0418e(AlertController alertController, View view, View view2) {
        this.f1439c = alertController;
        this.f1437a = view;
        this.f1438b = view2;
    }

    public void run() {
        AlertController.m1786a(this.f1439c.f1268A, this.f1437a, this.f1438b);
    }
}
