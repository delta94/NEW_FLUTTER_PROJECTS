package p032c.p033a.p074i.p080d;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import p032c.p033a.p035b.p036a.C0657d;
import p032c.p033a.p038c.p042d.C0715i;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p049k.C0754b;
import p032c.p033a.p074i.p081e.C0939b;
import p032c.p033a.p074i.p081e.C0942e;
import p032c.p033a.p074i.p081e.C0943f;

/* renamed from: c.a.i.d.e */
public class C0913e implements C0657d {

    /* renamed from: a */
    private final String f3166a;

    /* renamed from: b */
    private final C0942e f3167b;

    /* renamed from: c */
    private final C0943f f3168c;

    /* renamed from: d */
    private final C0939b f3169d;

    /* renamed from: e */
    private final C0657d f3170e;

    /* renamed from: f */
    private final String f3171f;

    /* renamed from: g */
    private final int f3172g;

    /* renamed from: h */
    private final Object f3173h;

    /* renamed from: i */
    private final long f3174i;

    public C0913e(String str, C0942e eVar, C0943f fVar, C0939b bVar, C0657d dVar, String str2, Object obj) {
        C0718j.m3240a(str);
        this.f3166a = str;
        this.f3167b = eVar;
        this.f3168c = fVar;
        this.f3169d = bVar;
        this.f3170e = dVar;
        this.f3171f = str2;
        this.f3172g = C0754b.m3367a((Object) Integer.valueOf(str.hashCode()), (Object) Integer.valueOf(eVar != null ? eVar.hashCode() : 0), (Object) Integer.valueOf(fVar.hashCode()), (Object) this.f3169d, (Object) this.f3170e, (Object) str2);
        this.f3173h = obj;
        this.f3174i = RealtimeSinceBootClock.get().now();
    }

    /* renamed from: a */
    public String mo3352a() {
        return this.f3166a;
    }

    /* renamed from: a */
    public boolean mo3353a(Uri uri) {
        return mo3352a().contains(uri.toString());
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C0913e)) {
            return false;
        }
        C0913e eVar = (C0913e) obj;
        if (this.f3172g == eVar.f3172g && this.f3166a.equals(eVar.f3166a) && C0715i.m3232a(this.f3167b, eVar.f3167b) && C0715i.m3232a(this.f3168c, eVar.f3168c) && C0715i.m3232a(this.f3169d, eVar.f3169d) && C0715i.m3232a(this.f3170e, eVar.f3170e) && C0715i.m3232a(this.f3171f, eVar.f3171f)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return this.f3172g;
    }

    public String toString() {
        return String.format(null, "%s_%s_%s_%s_%s_%s_%d", new Object[]{this.f3166a, this.f3167b, this.f3168c, this.f3169d, this.f3170e, this.f3171f, Integer.valueOf(this.f3172g)});
    }
}
