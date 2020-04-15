package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.fabric.p119a.C1418b;
import com.facebook.systrace.C1937a;
import p032c.p033a.p096l.p097a.C1137a;

@C1137a
public class BatchMountItem implements C1428e {

    /* renamed from: a */
    private final C1428e[] f4432a;

    /* renamed from: b */
    private final int f4433b;

    public BatchMountItem(C1428e[] eVarArr, int i) {
        if (eVarArr == null) {
            throw new NullPointerException();
        } else if (i < 0 || i > eVarArr.length) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid size received by parameter size: ");
            sb.append(i);
            sb.append(" items.size = ");
            sb.append(eVarArr.length);
            throw new IllegalArgumentException(sb.toString());
        } else {
            this.f4432a = eVarArr;
            this.f4433b = i;
        }
    }

    /* renamed from: a */
    public void mo5251a(C1418b bVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("FabricUIManager::mountViews (");
        sb.append(this.f4433b);
        sb.append(" items)");
        C1937a.m7339a(0, sb.toString());
        for (int i = 0; i < this.f4433b; i++) {
            this.f4432a[i].mo5251a(bVar);
        }
        C1937a.m7338a(0);
    }
}
