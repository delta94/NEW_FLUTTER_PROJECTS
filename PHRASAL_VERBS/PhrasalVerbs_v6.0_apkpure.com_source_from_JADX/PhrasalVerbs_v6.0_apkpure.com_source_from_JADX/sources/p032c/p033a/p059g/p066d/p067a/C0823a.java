package p032c.p033a.p059g.p066d.p067a;

import android.graphics.drawable.Animatable;
import p032c.p033a.p059g.p065c.C0818f;

/* renamed from: c.a.g.d.a.a */
public class C0823a extends C0818f {

    /* renamed from: b */
    private long f2904b = -1;

    /* renamed from: c */
    private long f2905c = -1;

    /* renamed from: d */
    private C0824b f2906d;

    public C0823a(C0824b bVar) {
        this.f2906d = bVar;
    }

    /* renamed from: a */
    public void mo3588a(String str, Object obj, Animatable animatable) {
        this.f2905c = System.currentTimeMillis();
        C0824b bVar = this.f2906d;
        if (bVar != null) {
            bVar.mo3725a(this.f2905c - this.f2904b);
        }
    }

    /* renamed from: b */
    public void mo3590b(String str, Object obj) {
        this.f2904b = System.currentTimeMillis();
    }
}
