package android.arch.lifecycle;

import android.arch.lifecycle.C0211d.C0212a;

class FullLifecycleObserverAdapter implements GenericLifecycleObserver {

    /* renamed from: a */
    private final FullLifecycleObserver f553a;

    FullLifecycleObserverAdapter(FullLifecycleObserver fullLifecycleObserver) {
        this.f553a = fullLifecycleObserver;
    }

    /* renamed from: a */
    public void mo790a(C0215f fVar, C0212a aVar) {
        switch (C0209b.f580a[aVar.ordinal()]) {
            case 1:
                this.f553a.mo794d(fVar);
                return;
            case 2:
                this.f553a.mo791a(fVar);
                return;
            case 3:
                this.f553a.mo795e(fVar);
                return;
            case 4:
                this.f553a.mo792b(fVar);
                return;
            case 5:
                this.f553a.mo796f(fVar);
                return;
            case 6:
                this.f553a.mo793c(fVar);
                return;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                return;
        }
    }
}
