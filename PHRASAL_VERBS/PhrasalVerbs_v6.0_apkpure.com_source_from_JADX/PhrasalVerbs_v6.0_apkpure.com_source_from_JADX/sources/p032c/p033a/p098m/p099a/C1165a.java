package p032c.p033a.p098m.p099a;

import android.view.View;

/* renamed from: c.a.m.a.a */
public abstract class C1165a {

    /* renamed from: a */
    private final int f3880a;

    /* renamed from: b */
    private final C1167c f3881b;

    /* renamed from: c */
    private volatile boolean f3882c;

    /* renamed from: d */
    private volatile boolean f3883d;

    /* renamed from: e */
    private C1166b f3884e;

    /* renamed from: f */
    private View f3885f;

    /* renamed from: a */
    public final void mo4519a() {
        if (!this.f3883d && !this.f3882c) {
            this.f3882c = true;
            C1166b bVar = this.f3884e;
            if (bVar != null) {
                bVar.onCancel();
            }
        }
    }

    /* renamed from: a */
    public final void mo4520a(View view) {
        this.f3885f = view;
        this.f3881b.mo4525a(view);
        mo4523c();
    }

    /* renamed from: a */
    public void mo4521a(C1166b bVar) {
        this.f3884e = bVar;
    }

    /* renamed from: b */
    public int mo4522b() {
        return this.f3880a;
    }

    /* renamed from: c */
    public abstract void mo4523c();
}
