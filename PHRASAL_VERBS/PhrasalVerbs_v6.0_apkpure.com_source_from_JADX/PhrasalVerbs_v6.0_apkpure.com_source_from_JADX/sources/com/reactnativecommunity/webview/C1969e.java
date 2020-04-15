package com.reactnativecommunity.webview;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Collections;
import java.util.List;
import p032c.p033a.p098m.C1151K;

/* renamed from: com.reactnativecommunity.webview.e */
public class C1969e implements C1151K {
    /* renamed from: a */
    public List<ViewManager> mo4465a(ReactApplicationContext reactApplicationContext) {
        return Collections.singletonList(new RNCWebViewManager());
    }

    /* renamed from: b */
    public List<NativeModule> mo4452b(ReactApplicationContext reactApplicationContext) {
        return Collections.singletonList(new RNCWebViewModule(reactApplicationContext));
    }
}
