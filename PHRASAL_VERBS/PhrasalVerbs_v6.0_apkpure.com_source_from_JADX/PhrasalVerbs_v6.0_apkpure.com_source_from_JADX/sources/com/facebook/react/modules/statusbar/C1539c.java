package com.facebook.react.modules.statusbar;

import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

/* renamed from: com.facebook.react.modules.statusbar.c */
class C1539c implements OnApplyWindowInsetsListener {

    /* renamed from: a */
    final /* synthetic */ C1540d f4692a;

    C1539c(C1540d dVar) {
        this.f4692a = dVar;
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        return onApplyWindowInsets.replaceSystemWindowInsets(onApplyWindowInsets.getSystemWindowInsetLeft(), 0, onApplyWindowInsets.getSystemWindowInsetRight(), onApplyWindowInsets.getSystemWindowInsetBottom());
    }
}
