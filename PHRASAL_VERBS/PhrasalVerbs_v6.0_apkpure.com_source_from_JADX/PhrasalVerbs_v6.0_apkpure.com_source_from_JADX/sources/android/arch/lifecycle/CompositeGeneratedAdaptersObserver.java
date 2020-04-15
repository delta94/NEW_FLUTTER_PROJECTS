package android.arch.lifecycle;

import android.arch.lifecycle.C0211d.C0212a;

public class CompositeGeneratedAdaptersObserver implements GenericLifecycleObserver {

    /* renamed from: a */
    private final C0210c[] f552a;

    CompositeGeneratedAdaptersObserver(C0210c[] cVarArr) {
        this.f552a = cVarArr;
    }

    /* renamed from: a */
    public void mo790a(C0215f fVar, C0212a aVar) {
        C0222l lVar = new C0222l();
        for (C0210c a : this.f552a) {
            a.mo812a(fVar, aVar, false, lVar);
        }
        for (C0210c a2 : this.f552a) {
            a2.mo812a(fVar, aVar, true, lVar);
        }
    }
}
