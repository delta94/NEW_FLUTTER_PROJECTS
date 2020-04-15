package android.support.p029v4.widget;

import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

/* renamed from: android.support.v4.widget.j */
class C0372j implements OnApplyWindowInsetsListener {

    /* renamed from: a */
    final /* synthetic */ C0373k f1193a;

    C0372j(C0373k kVar) {
        this.f1193a = kVar;
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        ((C0373k) view).mo1729a((Object) windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
        return windowInsets.consumeSystemWindowInsets();
    }
}
