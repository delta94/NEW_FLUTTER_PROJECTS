package android.support.p030v7.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

/* renamed from: android.support.v7.widget.T */
class C0543T implements OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ C0548U f2079a;

    C0543T(C0548U u) {
        this.f2079a = u;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (i != -1) {
            C0526N n = this.f2079a.f2142f;
            if (n != null) {
                n.setListSelectionHidden(false);
            }
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
