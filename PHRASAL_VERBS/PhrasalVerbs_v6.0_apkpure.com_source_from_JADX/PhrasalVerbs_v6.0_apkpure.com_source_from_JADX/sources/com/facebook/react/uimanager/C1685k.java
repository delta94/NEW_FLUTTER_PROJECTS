package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.JSApplicationCausedNativeException;

/* renamed from: com.facebook.react.uimanager.k */
public class C1685k extends JSApplicationCausedNativeException {

    /* renamed from: a */
    private View f5032a;

    public C1685k(String str) {
        super(str);
    }

    public C1685k(String str, View view, Throwable th) {
        super(str, th);
        this.f5032a = view;
    }
}
