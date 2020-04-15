package com.swmansion.gesturehandler.react;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Arrays;
import java.util.List;
import p032c.p033a.p098m.C1151K;

/* renamed from: com.swmansion.gesturehandler.react.g */
public class C1986g implements C1151K {
    /* renamed from: a */
    public List<ViewManager> mo4465a(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new ViewManager[]{new RNGestureHandlerRootViewManager(), new RNGestureHandlerButtonViewManager()});
    }

    /* renamed from: b */
    public List<NativeModule> mo4452b(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new NativeModule[]{new RNGestureHandlerModule(reactApplicationContext)});
    }
}
