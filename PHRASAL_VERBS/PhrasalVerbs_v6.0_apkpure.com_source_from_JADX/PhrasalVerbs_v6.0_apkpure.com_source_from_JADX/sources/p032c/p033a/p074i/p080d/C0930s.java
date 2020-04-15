package p032c.p033a.p074i.p080d;

import android.net.Uri;
import p032c.p033a.p035b.p036a.C0657d;
import p032c.p033a.p035b.p036a.C0662i;
import p032c.p033a.p074i.p091o.C1114c;
import p032c.p033a.p074i.p091o.C1119e;

/* renamed from: c.a.i.d.s */
public class C0930s implements C0921m {

    /* renamed from: a */
    private static C0930s f3216a;

    protected C0930s() {
    }

    /* renamed from: a */
    public static synchronized C0930s m4094a() {
        C0930s sVar;
        synchronized (C0930s.class) {
            if (f3216a == null) {
                f3216a = new C0930s();
            }
            sVar = f3216a;
        }
        return sVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Uri mo4034a(Uri uri) {
        return uri;
    }

    /* renamed from: a */
    public C0657d mo4017a(C1114c cVar, Uri uri, Object obj) {
        mo4034a(uri);
        return new C0662i(uri.toString());
    }

    /* renamed from: a */
    public C0657d mo4018a(C1114c cVar, Object obj) {
        Uri o = cVar.mo4372o();
        mo4034a(o);
        C0913e eVar = new C0913e(o.toString(), cVar.mo4369l(), cVar.mo4370m(), cVar.mo4358c(), null, null, obj);
        return eVar;
    }

    /* renamed from: b */
    public C0657d mo4019b(C1114c cVar, Object obj) {
        String str;
        C0657d dVar;
        C1119e f = cVar.mo4362f();
        if (f != null) {
            C0657d a = f.mo4246a();
            str = f.getClass().getName();
            dVar = a;
        } else {
            dVar = null;
            str = null;
        }
        Uri o = cVar.mo4372o();
        mo4034a(o);
        C0913e eVar = new C0913e(o.toString(), cVar.mo4369l(), cVar.mo4370m(), cVar.mo4358c(), dVar, str, obj);
        return eVar;
    }

    /* renamed from: c */
    public C0657d mo4020c(C1114c cVar, Object obj) {
        return mo4017a(cVar, cVar.mo4372o(), obj);
    }
}
