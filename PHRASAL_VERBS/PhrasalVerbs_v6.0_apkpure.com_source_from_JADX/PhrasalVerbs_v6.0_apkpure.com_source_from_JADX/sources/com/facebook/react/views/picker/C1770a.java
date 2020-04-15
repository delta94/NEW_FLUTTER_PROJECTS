package com.facebook.react.views.picker;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

/* renamed from: com.facebook.react.views.picker.a */
class C1770a implements OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ C1773c f5212a;

    C1770a(C1773c cVar) {
        this.f5212a = cVar;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (this.f5212a.f5217l != null) {
            this.f5212a.f5217l.mo6148a(i);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
        if (this.f5212a.f5217l != null) {
            this.f5212a.f5217l.mo6148a(-1);
        }
    }
}
