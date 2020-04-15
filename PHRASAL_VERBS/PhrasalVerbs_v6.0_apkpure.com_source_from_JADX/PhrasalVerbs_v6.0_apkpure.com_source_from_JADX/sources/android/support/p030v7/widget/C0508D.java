package android.support.p030v7.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: android.support.v7.widget.D */
class C0508D implements OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ C0503C f1909a;

    /* renamed from: b */
    final /* synthetic */ C0505b f1910b;

    C0508D(C0505b bVar, C0503C c) {
        this.f1910b = bVar;
        this.f1909a = c;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C0503C.this.setSelection(i);
        if (C0503C.this.getOnItemClickListener() != null) {
            C0505b bVar = this.f1910b;
            C0503C.this.performItemClick(view, i, bVar.f1881L.getItemId(i));
        }
        this.f1910b.dismiss();
    }
}
