package com.facebook.react.uimanager;

import android.view.ViewGroup;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;

public class RootViewManager extends ViewGroupManager<ViewGroup> {
    public static final String REACT_CLASS = "RootView";

    /* access modifiers changed from: protected */
    public ViewGroup createViewInstance(C1578N n) {
        return new SizeMonitoringFrameLayout(n);
    }

    public String getName() {
        return REACT_CLASS;
    }
}
