package android.support.p030v7.widget;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: android.support.v7.widget.ga */
class C0584ga implements OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SearchView f2259a;

    C0584ga(SearchView searchView) {
        this.f2259a = searchView;
    }

    public void onClick(View view) {
        SearchView searchView = this.f2259a;
        if (view == searchView.f2059u) {
            searchView.mo2771e();
        } else if (view == searchView.f2061w) {
            searchView.mo2769d();
        } else if (view == searchView.f2060v) {
            searchView.mo2772f();
        } else if (view == searchView.f2062x) {
            searchView.mo2782h();
        } else if (view == searchView.f2054q) {
            searchView.mo2765b();
        }
    }
}
