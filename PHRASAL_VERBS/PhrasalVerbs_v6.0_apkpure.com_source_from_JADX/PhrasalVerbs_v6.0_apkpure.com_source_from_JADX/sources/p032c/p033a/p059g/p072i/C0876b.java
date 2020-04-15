package p032c.p033a.p059g.p072i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import p032c.p033a.p038c.p042d.C0715i;
import p032c.p033a.p038c.p042d.C0715i.C0716a;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p059g.p064b.C0808c;
import p032c.p033a.p059g.p064b.C0808c.C0809a;
import p032c.p033a.p059g.p068e.C0860w;
import p032c.p033a.p059g.p068e.C0861x;
import p032c.p033a.p059g.p071h.C0870a;
import p032c.p033a.p059g.p071h.C0871b;

/* renamed from: c.a.g.i.b */
public class C0876b<DH extends C0871b> implements C0861x {

    /* renamed from: a */
    private boolean f3089a = false;

    /* renamed from: b */
    private boolean f3090b = false;

    /* renamed from: c */
    private boolean f3091c = true;

    /* renamed from: d */
    private DH f3092d;

    /* renamed from: e */
    private C0870a f3093e = null;

    /* renamed from: f */
    private final C0808c f3094f = C0808c.m3586a();

    public C0876b(DH dh) {
        if (dh != null) {
            mo3906a(dh);
        }
    }

    /* renamed from: a */
    public static <DH extends C0871b> C0876b<DH> m3910a(DH dh, Context context) {
        C0876b<DH> bVar = new C0876b<>(dh);
        bVar.mo3904a(context);
        return bVar;
    }

    /* renamed from: a */
    private void m3911a(C0861x xVar) {
        Drawable c = mo3909c();
        if (c instanceof C0860w) {
            ((C0860w) c).mo3845a(xVar);
        }
    }

    /* renamed from: f */
    private void m3912f() {
        if (!this.f3089a) {
            this.f3094f.mo3663a(C0809a.ON_ATTACH_CONTROLLER);
            this.f3089a = true;
            C0870a aVar = this.f3093e;
            if (!(aVar == null || aVar.mo3681c() == null)) {
                this.f3093e.mo3683e();
            }
        }
    }

    /* renamed from: g */
    private void m3913g() {
        if (!this.f3090b || !this.f3091c) {
            m3914h();
        } else {
            m3912f();
        }
    }

    /* renamed from: h */
    private void m3914h() {
        if (this.f3089a) {
            this.f3094f.mo3663a(C0809a.ON_DETACH_CONTROLLER);
            this.f3089a = false;
            if (m3915i()) {
                this.f3093e.mo3678b();
            }
        }
    }

    /* renamed from: i */
    private boolean m3915i() {
        C0870a aVar = this.f3093e;
        return aVar != null && aVar.mo3681c() == this.f3092d;
    }

    /* renamed from: a */
    public C0870a mo3903a() {
        return this.f3093e;
    }

    /* renamed from: a */
    public void mo3904a(Context context) {
    }

    /* renamed from: a */
    public void mo3905a(C0870a aVar) {
        boolean z = this.f3089a;
        if (z) {
            m3914h();
        }
        if (m3915i()) {
            this.f3094f.mo3663a(C0809a.ON_CLEAR_OLD_CONTROLLER);
            this.f3093e.mo3633a((C0871b) null);
        }
        this.f3093e = aVar;
        if (this.f3093e != null) {
            this.f3094f.mo3663a(C0809a.ON_SET_CONTROLLER);
            this.f3093e.mo3633a((C0871b) this.f3092d);
        } else {
            this.f3094f.mo3663a(C0809a.ON_CLEAR_CONTROLLER);
        }
        if (z) {
            m3912f();
        }
    }

    /* renamed from: a */
    public void mo3906a(DH dh) {
        this.f3094f.mo3663a(C0809a.ON_SET_HIERARCHY);
        boolean i = m3915i();
        m3911a((C0861x) null);
        C0718j.m3240a(dh);
        this.f3092d = (C0871b) dh;
        Drawable a = this.f3092d.mo3848a();
        mo3846a(a == null || a.isVisible());
        m3911a((C0861x) this);
        if (i) {
            this.f3093e.mo3633a((C0871b) dh);
        }
    }

    /* renamed from: a */
    public void mo3846a(boolean z) {
        if (this.f3091c != z) {
            this.f3094f.mo3663a(z ? C0809a.ON_DRAWABLE_SHOW : C0809a.ON_DRAWABLE_HIDE);
            this.f3091c = z;
            m3913g();
        }
    }

    /* renamed from: a */
    public boolean mo3907a(MotionEvent motionEvent) {
        if (!m3915i()) {
            return false;
        }
        return this.f3093e.mo3676a(motionEvent);
    }

    /* renamed from: b */
    public DH mo3908b() {
        DH dh = this.f3092d;
        C0718j.m3240a(dh);
        return (C0871b) dh;
    }

    /* renamed from: c */
    public Drawable mo3909c() {
        DH dh = this.f3092d;
        if (dh == null) {
            return null;
        }
        return dh.mo3848a();
    }

    /* renamed from: d */
    public void mo3910d() {
        this.f3094f.mo3663a(C0809a.ON_HOLDER_ATTACH);
        this.f3090b = true;
        m3913g();
    }

    /* renamed from: e */
    public void mo3911e() {
        this.f3094f.mo3663a(C0809a.ON_HOLDER_DETACH);
        this.f3090b = false;
        m3913g();
    }

    public void onDraw() {
        if (!this.f3089a) {
            C0727a.m3280c(C0808c.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f3093e)), toString());
            this.f3090b = true;
            this.f3091c = true;
            m3913g();
        }
    }

    public String toString() {
        C0716a a = C0715i.m3230a((Object) this);
        a.mo3472a("controllerAttached", this.f3089a);
        a.mo3472a("holderAttached", this.f3090b);
        a.mo3472a("drawableVisible", this.f3091c);
        a.mo3471a("events", (Object) this.f3094f.toString());
        return a.toString();
    }
}
