package com.swmansion.gesturehandler.react;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.C1567C;
import com.facebook.react.uimanager.C1727x;
import com.facebook.react.views.view.C1886h;
import p032c.p115b.p116a.C1255p;
import p032c.p115b.p116a.C1262v;

/* renamed from: com.swmansion.gesturehandler.react.n */
public class C1994n implements C1262v {
    /* renamed from: a */
    public View mo4704a(ViewGroup viewGroup, int i) {
        return viewGroup instanceof C1886h ? viewGroup.getChildAt(((C1886h) viewGroup).mo5679a(i)) : viewGroup.getChildAt(i);
    }

    /* renamed from: a */
    public C1255p mo4705a(View view) {
        C1727x pointerEvents = view instanceof C1567C ? ((C1567C) view).getPointerEvents() : C1727x.AUTO;
        if (!view.isEnabled()) {
            if (pointerEvents == C1727x.AUTO) {
                return C1255p.BOX_NONE;
            }
            if (pointerEvents == C1727x.BOX_ONLY) {
                return C1255p.NONE;
            }
        }
        int i = C1993m.f5912a[pointerEvents.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? C1255p.AUTO : C1255p.NONE : C1255p.BOX_NONE : C1255p.BOX_ONLY;
    }

    /* renamed from: a */
    public boolean mo4706a(ViewGroup viewGroup) {
        if (VERSION.SDK_INT < 18 || viewGroup.getClipChildren()) {
            return true;
        }
        if (!(viewGroup instanceof C1886h)) {
            return false;
        }
        return "hidden".equals(((C1886h) viewGroup).getOverflow());
    }
}
