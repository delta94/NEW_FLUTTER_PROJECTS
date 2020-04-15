package android.arch.lifecycle;

import java.util.HashMap;

/* renamed from: android.arch.lifecycle.s */
public class C0231s {

    /* renamed from: a */
    private final HashMap<String, C0228q> f605a = new HashMap<>();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C0228q mo837a(String str) {
        return (C0228q) this.f605a.get(str);
    }

    /* renamed from: a */
    public final void mo838a() {
        for (C0228q a : this.f605a.values()) {
            a.mo833a();
        }
        this.f605a.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo839a(String str, C0228q qVar) {
        C0228q qVar2 = (C0228q) this.f605a.put(str, qVar);
        if (qVar2 != null) {
            qVar2.mo833a();
        }
    }
}
