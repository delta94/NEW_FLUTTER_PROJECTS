package com.facebook.imagepipeline.memory;

import java.util.LinkedList;
import p032c.p033a.p038c.p046h.C0745c;

/* renamed from: com.facebook.imagepipeline.memory.s */
class C1289s<V> extends C1274f<V> {

    /* renamed from: f */
    private LinkedList<C0745c<V>> f4186f = new LinkedList<>();

    public C1289s(int i, int i2, int i3) {
        super(i, i2, i3, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4744a(V v) {
        C0745c cVar = (C0745c) this.f4186f.poll();
        if (cVar == null) {
            cVar = new C0745c();
        }
        cVar.mo3524a(v);
        this.f4168c.add(cVar);
    }

    /* renamed from: f */
    public V mo4750f() {
        C0745c cVar = (C0745c) this.f4168c.poll();
        V b = cVar.mo3525b();
        cVar.mo3523a();
        this.f4186f.add(cVar);
        return b;
    }
}
