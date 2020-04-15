package android.support.p030v7.widget;

import android.support.p030v7.view.menu.C0455a;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window.Callback;

/* renamed from: android.support.v7.widget.Aa */
class C0493Aa implements OnClickListener {

    /* renamed from: a */
    final C0455a f1790a;

    /* renamed from: b */
    final /* synthetic */ C0506Ca f1791b;

    C0493Aa(C0506Ca ca) {
        this.f1791b = ca;
        C0455a aVar = new C0455a(this.f1791b.f1884a.getContext(), 0, 16908332, 0, 0, this.f1791b.f1892i);
        this.f1790a = aVar;
    }

    public void onClick(View view) {
        C0506Ca ca = this.f1791b;
        Callback callback = ca.f1895l;
        if (callback != null && ca.f1896m) {
            callback.onMenuItemSelected(0, this.f1790a);
        }
    }
}
