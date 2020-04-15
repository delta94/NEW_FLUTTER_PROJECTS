package p032c.p033a.p059g.p060a.p061a.p062a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p032c.p033a.p038c.p043e.C0727a;

/* renamed from: c.a.g.a.a.a.a */
public class C0787a implements C0791b {

    /* renamed from: a */
    private final List<C0791b> f2708a;

    public C0787a(C0791b... bVarArr) {
        this.f2708a = new ArrayList(bVarArr.length);
        Collections.addAll(this.f2708a, bVarArr);
    }

    /* renamed from: a */
    public synchronized void mo3581a(C0791b bVar) {
        this.f2708a.add(bVar);
    }

    /* renamed from: a */
    public synchronized void mo3582a(String str, int i, boolean z) {
        int size = this.f2708a.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                ((C0791b) this.f2708a.get(i2)).mo3582a(str, i, z);
            } catch (Exception e) {
                C0727a.m3267a("ForwardingImageOriginListener", "InternalListener exception in onImageLoaded", (Throwable) e);
            }
        }
    }

    /* renamed from: b */
    public synchronized void mo3583b(C0791b bVar) {
        this.f2708a.remove(bVar);
    }
}
