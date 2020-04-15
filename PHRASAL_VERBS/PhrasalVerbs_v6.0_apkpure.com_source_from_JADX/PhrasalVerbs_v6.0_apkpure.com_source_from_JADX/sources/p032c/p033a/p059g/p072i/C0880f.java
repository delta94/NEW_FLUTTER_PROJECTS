package p032c.p033a.p059g.p072i;

import android.net.Uri;
import p032c.p033a.p038c.p042d.C0721m;
import p032c.p033a.p038c.p049k.C0758f;
import p032c.p033a.p059g.p065c.C0816e;
import p032c.p033a.p059g.p071h.C0873d;
import p032c.p033a.p074i.p091o.C1114c;

/* renamed from: c.a.g.i.f */
public class C0880f extends C0878d {

    /* renamed from: g */
    private static C0721m<? extends C0816e> f3103g;

    /* renamed from: h */
    private C0816e f3104h;

    /* renamed from: a */
    public static void m3937a(C0721m<? extends C0816e> mVar) {
        f3103g = mVar;
    }

    /* renamed from: a */
    public void mo3942a(int i, Object obj) {
        mo3943a(C0758f.m3371a(i), obj);
    }

    /* renamed from: a */
    public void mo3943a(Uri uri, Object obj) {
        C0816e eVar = this.f3104h;
        eVar.mo3700a(obj);
        C0873d a = eVar.mo3653a(uri);
        a.mo3699a(getController());
        setController(a.build());
    }

    /* renamed from: a */
    public void mo3944a(String str, Object obj) {
        mo3943a(str != null ? Uri.parse(str) : null, obj);
    }

    /* access modifiers changed from: protected */
    public C0816e getControllerBuilder() {
        return this.f3104h;
    }

    public void setActualImageResource(int i) {
        mo3942a(i, (Object) null);
    }

    public void setImageRequest(C1114c cVar) {
        C0816e eVar = this.f3104h;
        eVar.mo3703b(cVar);
        eVar.mo3699a(getController());
        setController(eVar.build());
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
    }

    public void setImageURI(Uri uri) {
        mo3943a(uri, (Object) null);
    }

    public void setImageURI(String str) {
        mo3944a(str, (Object) null);
    }
}
