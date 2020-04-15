package com.facebook.react.views.art;

import android.view.View;
import com.facebook.react.uimanager.C1569E;
import com.facebook.react.uimanager.C1578N;
import com.facebook.react.uimanager.ViewManager;

public class ARTRenderableViewManager extends ViewManager<View, C1569E> {
    public static final String CLASS_GROUP = "ARTGroup";
    public static final String CLASS_SHAPE = "ARTShape";
    public static final String CLASS_TEXT = "ARTText";
    private final String mClassName;

    ARTRenderableViewManager(String str) {
        this.mClassName = str;
    }

    public static ARTRenderableViewManager createARTGroupViewManager() {
        return new ARTGroupViewManager();
    }

    public static ARTRenderableViewManager createARTShapeViewManager() {
        return new ARTShapeViewManager();
    }

    public static ARTRenderableViewManager createARTTextViewManager() {
        return new ARTTextViewManager();
    }

    public C1569E createShadowNodeInstance() {
        if (CLASS_GROUP.equals(this.mClassName)) {
            return new C1730a();
        }
        if (CLASS_SHAPE.equals(this.mClassName)) {
            return new C1731b();
        }
        if (CLASS_TEXT.equals(this.mClassName)) {
            return new C1735f();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected type ");
        sb.append(this.mClassName);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public View createViewInstance(C1578N n) {
        throw new IllegalStateException("ARTShape does not map into a native view");
    }

    public String getName() {
        return this.mClassName;
    }

    public Class<? extends C1569E> getShadowNodeClass() {
        if (CLASS_GROUP.equals(this.mClassName)) {
            return C1730a.class;
        }
        if (CLASS_SHAPE.equals(this.mClassName)) {
            return C1731b.class;
        }
        if (CLASS_TEXT.equals(this.mClassName)) {
            return C1735f.class;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected type ");
        sb.append(this.mClassName);
        throw new IllegalStateException(sb.toString());
    }

    public void updateExtraData(View view, Object obj) {
        throw new IllegalStateException("ARTShape does not map into a native view");
    }
}
