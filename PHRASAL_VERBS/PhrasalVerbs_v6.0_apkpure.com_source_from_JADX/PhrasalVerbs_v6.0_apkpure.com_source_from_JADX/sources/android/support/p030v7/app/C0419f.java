package android.support.p030v7.app;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

/* renamed from: android.support.v7.app.f */
class C0419f implements OnScrollListener {

    /* renamed from: a */
    final /* synthetic */ View f1440a;

    /* renamed from: b */
    final /* synthetic */ View f1441b;

    /* renamed from: c */
    final /* synthetic */ AlertController f1442c;

    C0419f(AlertController alertController, View view, View view2) {
        this.f1442c = alertController;
        this.f1440a = view;
        this.f1441b = view2;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AlertController.m1786a(absListView, this.f1440a, this.f1441b);
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
