package android.support.p030v7.widget;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;

/* renamed from: android.support.v7.widget.ha */
class C0586ha implements OnKeyListener {

    /* renamed from: a */
    final /* synthetic */ SearchView f2262a;

    C0586ha(SearchView searchView) {
        this.f2262a = searchView;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        SearchView searchView = this.f2262a;
        if (searchView.f2044ga == null) {
            return false;
        }
        if (searchView.f2054q.isPopupShowing() && this.f2262a.f2054q.getListSelection() != -1) {
            return this.f2262a.mo2764a(view, i, keyEvent);
        }
        if (this.f2262a.f2054q.mo2805a() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
            return false;
        }
        view.cancelLongPress();
        SearchView searchView2 = this.f2262a;
        searchView2.mo2760a(0, (String) null, searchView2.f2054q.getText().toString());
        return true;
    }
}
