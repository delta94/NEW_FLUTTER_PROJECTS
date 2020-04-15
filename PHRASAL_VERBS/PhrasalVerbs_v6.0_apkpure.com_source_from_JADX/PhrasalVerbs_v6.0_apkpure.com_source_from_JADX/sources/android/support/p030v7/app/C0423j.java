package android.support.p030v7.app;

import android.support.p030v7.app.AlertController.C0396a;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: android.support.v7.app.j */
class C0423j implements OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ AlertController f1453a;

    /* renamed from: b */
    final /* synthetic */ C0396a f1454b;

    C0423j(C0396a aVar, AlertController alertController) {
        this.f1454b = aVar;
        this.f1453a = alertController;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f1454b.f1354x.onClick(this.f1453a.f1288b, i);
        if (!this.f1454b.f1322H) {
            this.f1453a.f1288b.dismiss();
        }
    }
}
