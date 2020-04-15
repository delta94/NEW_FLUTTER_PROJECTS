package p032c.p033a.p035b.p036a;

import android.net.Uri;
import java.util.List;
import p032c.p033a.p038c.p042d.C0718j;

/* renamed from: c.a.b.a.f */
public class C0659f implements C0657d {

    /* renamed from: a */
    final List<C0657d> f2481a;

    public C0659f(List<C0657d> list) {
        C0718j.m3240a(list);
        this.f2481a = list;
    }

    /* renamed from: a */
    public String mo3352a() {
        return ((C0657d) this.f2481a.get(0)).mo3352a();
    }

    /* renamed from: a */
    public boolean mo3353a(Uri uri) {
        for (int i = 0; i < this.f2481a.size(); i++) {
            if (((C0657d) this.f2481a.get(i)).mo3353a(uri)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public List<C0657d> mo3354b() {
        return this.f2481a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0659f)) {
            return false;
        }
        return this.f2481a.equals(((C0659f) obj).f2481a);
    }

    public int hashCode() {
        return this.f2481a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MultiCacheKey:");
        sb.append(this.f2481a.toString());
        return sb.toString();
    }
}
