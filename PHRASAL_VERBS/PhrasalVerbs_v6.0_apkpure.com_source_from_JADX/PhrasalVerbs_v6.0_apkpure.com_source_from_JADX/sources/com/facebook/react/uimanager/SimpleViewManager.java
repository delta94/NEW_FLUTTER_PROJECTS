package com.facebook.react.uimanager;

import android.view.View;

public abstract class SimpleViewManager<T extends View> extends BaseViewManager<T, C1691n> {
    public C1691n createShadowNodeInstance() {
        return new C1691n();
    }

    public Class<C1691n> getShadowNodeClass() {
        return C1691n.class;
    }

    public void updateExtraData(T t, Object obj) {
    }
}
