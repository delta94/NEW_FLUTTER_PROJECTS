package com.facebook.react.uimanager;

import android.view.View;
import java.util.Comparator;

/* renamed from: com.facebook.react.uimanager.ka */
class C1686ka implements Comparator<View> {

    /* renamed from: a */
    final /* synthetic */ C1688la f5033a;

    C1686ka(C1688la laVar) {
        this.f5033a = laVar;
    }

    /* renamed from: a */
    public int compare(View view, View view2) {
        Integer viewZIndex = ViewGroupManager.getViewZIndex(view);
        Integer valueOf = Integer.valueOf(0);
        if (viewZIndex == null) {
            viewZIndex = valueOf;
        }
        Integer viewZIndex2 = ViewGroupManager.getViewZIndex(view2);
        if (viewZIndex2 == null) {
            viewZIndex2 = valueOf;
        }
        return viewZIndex.intValue() - viewZIndex2.intValue();
    }
}
