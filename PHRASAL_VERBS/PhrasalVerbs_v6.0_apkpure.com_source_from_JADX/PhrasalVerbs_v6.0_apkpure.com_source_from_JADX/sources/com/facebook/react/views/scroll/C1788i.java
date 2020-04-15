package com.facebook.react.views.scroll;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.C1635c;

/* renamed from: com.facebook.react.views.scroll.i */
public class C1788i {
    /* renamed from: a */
    public static int m6849a(String str) {
        if (str == null || str.equals("auto")) {
            return 1;
        }
        if (str.equals("always")) {
            return 0;
        }
        if (str.equals("never")) {
            return 2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("wrong overScrollMode: ");
        sb.append(str);
        throw new JSApplicationIllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static void m6850a(ViewGroup viewGroup) {
        m6853a(viewGroup, C1791l.BEGIN_DRAG);
    }

    /* renamed from: a */
    public static void m6851a(ViewGroup viewGroup, float f, float f2) {
        m6854a(viewGroup, C1791l.END_DRAG, f, f2);
    }

    /* renamed from: a */
    public static void m6852a(ViewGroup viewGroup, int i, int i2) {
        m6854a(viewGroup, C1791l.MOMENTUM_BEGIN, (float) i, (float) i2);
    }

    /* renamed from: a */
    private static void m6853a(ViewGroup viewGroup, C1791l lVar) {
        m6854a(viewGroup, lVar, 0.0f, 0.0f);
    }

    /* renamed from: a */
    private static void m6854a(ViewGroup viewGroup, C1791l lVar, float f, float f2) {
        View childAt = viewGroup.getChildAt(0);
        if (childAt != null) {
            ((UIManagerModule) ((ReactContext) viewGroup.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().mo5886a((C1635c) C1789j.m6857a(viewGroup.getId(), lVar, viewGroup.getScrollX(), viewGroup.getScrollY(), f, f2, childAt.getWidth(), childAt.getHeight(), viewGroup.getWidth(), viewGroup.getHeight()));
        }
    }

    /* renamed from: b */
    public static void m6855b(ViewGroup viewGroup) {
        m6853a(viewGroup, C1791l.MOMENTUM_END);
    }

    /* renamed from: b */
    public static void m6856b(ViewGroup viewGroup, float f, float f2) {
        m6854a(viewGroup, C1791l.SCROLL, f, f2);
    }
}
