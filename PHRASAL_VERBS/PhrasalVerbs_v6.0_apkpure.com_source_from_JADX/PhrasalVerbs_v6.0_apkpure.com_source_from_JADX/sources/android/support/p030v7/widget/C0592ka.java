package android.support.p030v7.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

/* renamed from: android.support.v7.widget.ka */
class C0592ka implements OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ SearchView f2276a;

    C0592ka(SearchView searchView) {
        this.f2276a = searchView;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        this.f2276a.mo2770d(i);
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
