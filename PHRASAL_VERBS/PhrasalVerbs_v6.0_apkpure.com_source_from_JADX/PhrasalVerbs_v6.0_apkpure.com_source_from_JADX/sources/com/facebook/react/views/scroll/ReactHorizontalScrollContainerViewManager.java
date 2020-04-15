package com.facebook.react.views.scroll;

import com.facebook.react.uimanager.C1578N;
import com.facebook.react.uimanager.ViewGroupManager;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "AndroidHorizontalScrollContentView")
public class ReactHorizontalScrollContainerViewManager extends ViewGroupManager<C1779c> {
    public static final String REACT_CLASS = "AndroidHorizontalScrollContentView";

    public C1779c createViewInstance(C1578N n) {
        return new C1779c(n);
    }

    public String getName() {
        return REACT_CLASS;
    }
}
