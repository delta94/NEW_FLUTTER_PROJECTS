package p032c.p033a.p074i.p090n;

import java.util.Map;
import p032c.p033a.p038c.p040b.C0698e;

/* renamed from: c.a.i.n.wa */
public abstract class C1104wa<T> extends C0698e<T> {

    /* renamed from: b */
    private final C1081n<T> f3718b;

    /* renamed from: c */
    private final C1091qa f3719c;

    /* renamed from: d */
    private final String f3720d;

    /* renamed from: e */
    private final String f3721e;

    public C1104wa(C1081n<T> nVar, C1091qa qaVar, String str, String str2) {
        this.f3718b = nVar;
        this.f3719c = qaVar;
        this.f3720d = str;
        this.f3721e = str2;
        this.f3719c.mo4232a(this.f3721e, this.f3720d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3460a(Exception exc) {
        C1091qa qaVar = this.f3719c;
        String str = this.f3721e;
        qaVar.mo4234a(str, this.f3720d, exc, qaVar.mo4236a(str) ? mo4349b(exc) : null);
        this.f3718b.mo4311a((Throwable) exc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Map<String, String> mo4349b(Exception exc) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo3463b(T t) {
        C1091qa qaVar = this.f3719c;
        String str = this.f3721e;
        qaVar.mo4237b(str, this.f3720d, qaVar.mo4236a(str) ? mo4283c(t) : null);
        this.f3718b.mo4310a(t, 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Map<String, String> mo4283c(T t) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo3464c() {
        C1091qa qaVar = this.f3719c;
        String str = this.f3721e;
        qaVar.mo4235a(str, this.f3720d, qaVar.mo4236a(str) ? mo4350d() : null);
        this.f3718b.mo4307a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Map<String, String> mo4350d() {
        return null;
    }
}
