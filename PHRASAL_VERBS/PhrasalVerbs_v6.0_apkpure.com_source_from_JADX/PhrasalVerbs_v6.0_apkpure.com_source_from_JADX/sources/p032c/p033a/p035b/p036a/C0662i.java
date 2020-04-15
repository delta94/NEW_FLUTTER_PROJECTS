package p032c.p033a.p035b.p036a;

import android.net.Uri;
import p032c.p033a.p038c.p042d.C0718j;

/* renamed from: c.a.b.a.i */
public class C0662i implements C0657d {

    /* renamed from: a */
    final String f2484a;

    public C0662i(String str) {
        C0718j.m3240a(str);
        this.f2484a = str;
    }

    /* renamed from: a */
    public String mo3352a() {
        return this.f2484a;
    }

    /* renamed from: a */
    public boolean mo3353a(Uri uri) {
        return this.f2484a.contains(uri.toString());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0662i)) {
            return false;
        }
        return this.f2484a.equals(((C0662i) obj).f2484a);
    }

    public int hashCode() {
        return this.f2484a.hashCode();
    }

    public String toString() {
        return this.f2484a;
    }
}
