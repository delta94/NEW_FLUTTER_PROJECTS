package com.facebook.react.views.scroll;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import com.facebook.react.modules.i18nmanager.C1489a;

/* renamed from: com.facebook.react.views.scroll.c */
public class C1779c extends ViewGroup {

    /* renamed from: a */
    private int f5235a;

    /* renamed from: b */
    private int f5236b = 0;

    public C1779c(Context context) {
        super(context);
        this.f5235a = C1489a.m5938a().mo5394b(context) ? 1 : 0;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f5235a == 1) {
            int i5 = (i3 - i) + 0;
            setLeft(0);
            setRight(i5);
            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) getParent();
            horizontalScrollView.scrollTo((horizontalScrollView.getScrollX() + getWidth()) - this.f5236b, horizontalScrollView.getScrollY());
        }
        this.f5236b = getWidth();
    }
}
