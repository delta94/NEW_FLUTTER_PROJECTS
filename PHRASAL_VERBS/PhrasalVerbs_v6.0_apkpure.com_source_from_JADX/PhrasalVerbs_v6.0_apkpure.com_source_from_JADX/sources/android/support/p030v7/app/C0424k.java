package android.support.p030v7.app;

import android.support.p030v7.app.AlertController.C0396a;
import android.support.p030v7.app.AlertController.RecycleListView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: android.support.v7.app.k */
class C0424k implements OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ RecycleListView f1455a;

    /* renamed from: b */
    final /* synthetic */ AlertController f1456b;

    /* renamed from: c */
    final /* synthetic */ C0396a f1457c;

    C0424k(C0396a aVar, RecycleListView recycleListView, AlertController alertController) {
        this.f1457c = aVar;
        this.f1455a = recycleListView;
        this.f1456b = alertController;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        boolean[] zArr = this.f1457c.f1320F;
        if (zArr != null) {
            zArr[i] = this.f1455a.isItemChecked(i);
        }
        this.f1457c.f1324J.onClick(this.f1456b.f1288b, i, this.f1455a.isItemChecked(i));
    }
}
