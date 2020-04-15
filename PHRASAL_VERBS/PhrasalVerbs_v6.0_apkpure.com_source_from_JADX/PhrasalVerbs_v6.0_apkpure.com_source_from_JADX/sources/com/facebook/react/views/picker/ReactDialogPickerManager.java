package com.facebook.react.views.picker;

import com.facebook.react.uimanager.C1578N;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "AndroidDialogPicker")
public class ReactDialogPickerManager extends ReactPickerManager {
    public static final String REACT_CLASS = "AndroidDialogPicker";

    /* access modifiers changed from: protected */
    public C1773c createViewInstance(C1578N n) {
        return new C1773c(n, 0);
    }

    public String getName() {
        return REACT_CLASS;
    }
}
