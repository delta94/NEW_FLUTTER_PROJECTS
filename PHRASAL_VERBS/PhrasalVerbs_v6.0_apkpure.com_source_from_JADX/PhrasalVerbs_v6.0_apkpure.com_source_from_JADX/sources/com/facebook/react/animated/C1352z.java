package com.facebook.react.animated;

import com.facebook.react.uimanager.C1582S;
import com.facebook.react.uimanager.C1719s;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.facebook.react.animated.z */
class C1352z implements C1582S {

    /* renamed from: a */
    final /* synthetic */ ArrayList f4379a;

    /* renamed from: b */
    final /* synthetic */ NativeAnimatedModule f4380b;

    C1352z(NativeAnimatedModule nativeAnimatedModule, ArrayList arrayList) {
        this.f4380b = nativeAnimatedModule;
        this.f4379a = arrayList;
    }

    /* renamed from: a */
    public void mo4871a(C1719s sVar) {
        C1312H access$000 = this.f4380b.getNodesManager();
        Iterator it = this.f4379a.iterator();
        while (it.hasNext()) {
            ((C1320a) it.next()).mo4803a(access$000);
        }
    }
}
