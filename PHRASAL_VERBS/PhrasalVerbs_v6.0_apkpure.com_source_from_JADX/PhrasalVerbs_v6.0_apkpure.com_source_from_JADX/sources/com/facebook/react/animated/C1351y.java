package com.facebook.react.animated;

import com.facebook.react.uimanager.C1582S;
import com.facebook.react.uimanager.C1719s;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.facebook.react.animated.y */
class C1351y implements C1582S {

    /* renamed from: a */
    final /* synthetic */ ArrayList f4377a;

    /* renamed from: b */
    final /* synthetic */ NativeAnimatedModule f4378b;

    C1351y(NativeAnimatedModule nativeAnimatedModule, ArrayList arrayList) {
        this.f4378b = nativeAnimatedModule;
        this.f4377a = arrayList;
    }

    /* renamed from: a */
    public void mo4871a(C1719s sVar) {
        C1312H access$000 = this.f4378b.getNodesManager();
        Iterator it = this.f4377a.iterator();
        while (it.hasNext()) {
            ((C1320a) it.next()).mo4803a(access$000);
        }
    }
}
