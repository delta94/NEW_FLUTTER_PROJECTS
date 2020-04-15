package android.support.p030v7.app;

import android.content.Context;
import android.support.p030v7.app.AlertController.C0396a;
import android.support.p030v7.app.AlertController.RecycleListView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* renamed from: android.support.v7.app.h */
class C0421h extends ArrayAdapter<CharSequence> {

    /* renamed from: a */
    final /* synthetic */ RecycleListView f1446a;

    /* renamed from: b */
    final /* synthetic */ C0396a f1447b;

    C0421h(C0396a aVar, Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
        this.f1447b = aVar;
        this.f1446a = recycleListView;
        super(context, i, i2, charSequenceArr);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = this.f1447b.f1320F;
        if (zArr != null && zArr[i]) {
            this.f1446a.setItemChecked(i, true);
        }
        return view2;
    }
}
