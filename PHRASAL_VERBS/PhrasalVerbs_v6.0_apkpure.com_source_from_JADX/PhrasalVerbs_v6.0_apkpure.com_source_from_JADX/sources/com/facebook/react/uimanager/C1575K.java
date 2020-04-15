package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewParent;
import p032c.p033a.p094k.p095a.C1136a;

/* renamed from: com.facebook.react.uimanager.K */
public class C1575K {
    /* renamed from: a */
    public static C1574J m6250a(View view) {
        while (!(view instanceof C1574J)) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                return null;
            }
            C1136a.m5055a(parent instanceof View);
            view = (View) parent;
        }
        return (C1574J) view;
    }
}
