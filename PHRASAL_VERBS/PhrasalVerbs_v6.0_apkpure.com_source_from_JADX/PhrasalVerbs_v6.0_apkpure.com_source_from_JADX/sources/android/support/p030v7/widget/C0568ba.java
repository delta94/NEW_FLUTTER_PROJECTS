package android.support.p030v7.widget;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: android.support.v7.widget.ba */
class C0568ba implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ SearchView f2220a;

    C0568ba(SearchView searchView) {
        this.f2220a = searchView;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f2220a.mo2766b(charSequence);
    }
}
