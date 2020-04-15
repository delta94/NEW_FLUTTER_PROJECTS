package android.support.p030v7.widget;

import android.view.View;
import android.view.View.OnFocusChangeListener;

/* renamed from: android.support.v7.widget.ea */
class C0574ea implements OnFocusChangeListener {

    /* renamed from: a */
    final /* synthetic */ SearchView f2227a;

    C0574ea(SearchView searchView) {
        this.f2227a = searchView;
    }

    public void onFocusChange(View view, boolean z) {
        SearchView searchView = this.f2227a;
        OnFocusChangeListener onFocusChangeListener = searchView.f2028N;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z);
        }
    }
}
