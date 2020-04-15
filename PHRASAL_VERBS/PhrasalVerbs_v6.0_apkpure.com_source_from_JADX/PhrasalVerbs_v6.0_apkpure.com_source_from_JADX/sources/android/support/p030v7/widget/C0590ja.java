package android.support.p030v7.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: android.support.v7.widget.ja */
class C0590ja implements OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ SearchView f2273a;

    C0590ja(SearchView searchView) {
        this.f2273a = searchView;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f2273a.mo2763a(i, 0, (String) null);
    }
}
