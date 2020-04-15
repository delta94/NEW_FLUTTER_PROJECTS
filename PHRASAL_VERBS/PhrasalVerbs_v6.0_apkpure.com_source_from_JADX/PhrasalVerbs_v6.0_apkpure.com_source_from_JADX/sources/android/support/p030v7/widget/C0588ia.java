package android.support.p030v7.widget;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

/* renamed from: android.support.v7.widget.ia */
class C0588ia implements OnEditorActionListener {

    /* renamed from: a */
    final /* synthetic */ SearchView f2266a;

    C0588ia(SearchView searchView) {
        this.f2266a = searchView;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.f2266a.mo2772f();
        return true;
    }
}
