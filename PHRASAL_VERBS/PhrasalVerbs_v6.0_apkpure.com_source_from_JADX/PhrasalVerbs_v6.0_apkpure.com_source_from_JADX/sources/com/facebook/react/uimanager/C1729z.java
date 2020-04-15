package com.facebook.react.uimanager;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;

/* renamed from: com.facebook.react.uimanager.z */
public class C1729z {

    /* renamed from: a */
    private static final Rect f5113a = new Rect();

    /* renamed from: a */
    public static void m6673a(View view, Rect rect) {
        ViewParent parent = view.getParent();
        if (parent == null) {
            rect.setEmpty();
            return;
        }
        if (parent instanceof C1728y) {
            C1728y yVar = (C1728y) parent;
            if (yVar.getRemoveClippedSubviews()) {
                yVar.mo6019a(f5113a);
                if (!f5113a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                    rect.setEmpty();
                    return;
                }
                f5113a.offset(-view.getLeft(), -view.getTop());
                f5113a.offset(view.getScrollX(), view.getScrollY());
                rect.set(f5113a);
                return;
            }
        }
        view.getDrawingRect(rect);
    }
}
