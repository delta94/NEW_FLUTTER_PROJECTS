package com.facebook.react.views.text.frescosupport;

import android.view.View;
import com.facebook.react.uimanager.C1578N;
import com.facebook.react.uimanager.ViewManager;
import p032c.p033a.p059g.p060a.p061a.C0799c;
import p032c.p033a.p059g.p065c.C0816e;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "RCTTextInlineImage")
public class FrescoBasedReactTextInlineImageViewManager extends ViewManager<View, C1815a> {
    public static final String REACT_CLASS = "RCTTextInlineImage";
    private final Object mCallerContext;
    private final C0816e mDraweeControllerBuilder;

    public FrescoBasedReactTextInlineImageViewManager() {
        this(null, null);
    }

    public FrescoBasedReactTextInlineImageViewManager(C0816e eVar, Object obj) {
        this.mDraweeControllerBuilder = eVar;
        this.mCallerContext = obj;
    }

    public C1815a createShadowNodeInstance() {
        C0816e eVar = this.mDraweeControllerBuilder;
        if (eVar == null) {
            eVar = C0799c.m3538c();
        }
        return new C1815a(eVar, this.mCallerContext);
    }

    public View createViewInstance(C1578N n) {
        throw new IllegalStateException("RCTTextInlineImage doesn't map into a native view");
    }

    public String getName() {
        return REACT_CLASS;
    }

    public Class<C1815a> getShadowNodeClass() {
        return C1815a.class;
    }

    public void updateExtraData(View view, Object obj) {
    }
}
