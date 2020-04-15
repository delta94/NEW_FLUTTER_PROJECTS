package com.facebook.react.views.checkbox;

import android.widget.CompoundButton.OnCheckedChangeListener;
import com.facebook.react.uimanager.C1578N;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.p121a.C1595a;

public class ReactCheckBoxManager extends SimpleViewManager<C1738a> {
    private static final OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER = new C1740c();
    private static final String REACT_CLASS = "AndroidCheckBox";

    /* access modifiers changed from: protected */
    public void addEventEmitters(C1578N n, C1738a aVar) {
        aVar.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    /* access modifiers changed from: protected */
    public C1738a createViewInstance(C1578N n) {
        return new C1738a(n);
    }

    public String getName() {
        return REACT_CLASS;
    }

    @C1595a(defaultBoolean = true, name = "enabled")
    public void setEnabled(C1738a aVar, boolean z) {
        aVar.setEnabled(z);
    }

    @C1595a(name = "on")
    public void setOn(C1738a aVar, boolean z) {
        aVar.setOnCheckedChangeListener(null);
        aVar.mo6050a(z);
        aVar.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }
}
