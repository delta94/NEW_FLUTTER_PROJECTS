package com.oblador.vectoricons;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p032c.p033a.p098m.C1151K;

/* renamed from: com.oblador.vectoricons.a */
public class C1948a implements C1151K {
    /* renamed from: a */
    public List<ViewManager> mo4465a(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    /* renamed from: b */
    public List<NativeModule> mo4452b(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VectorIconsModule(reactApplicationContext));
        return arrayList;
    }
}
