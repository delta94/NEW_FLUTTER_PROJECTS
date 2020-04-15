package android.arch.lifecycle;

import android.arch.lifecycle.C0211d.C0212a;

class ReflectiveGenericLifecycleObserver implements GenericLifecycleObserver {

    /* renamed from: a */
    private final Object f570a;

    /* renamed from: b */
    private final C0207a f571b = C0206a.f573a.mo806a(this.f570a.getClass());

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f570a = obj;
    }

    /* renamed from: a */
    public void mo790a(C0215f fVar, C0212a aVar) {
        this.f571b.mo808a(fVar, aVar, this.f570a);
    }
}
