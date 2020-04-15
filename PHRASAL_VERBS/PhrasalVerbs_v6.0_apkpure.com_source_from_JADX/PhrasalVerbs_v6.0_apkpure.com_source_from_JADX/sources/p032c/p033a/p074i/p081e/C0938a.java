package p032c.p033a.p074i.p081e;

import java.util.regex.Pattern;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p049k.C0754b;

/* renamed from: c.a.i.e.a */
public class C0938a {

    /* renamed from: a */
    private static Pattern f3220a;

    /* renamed from: b */
    public final int f3221b;

    /* renamed from: c */
    public final int f3222c;

    public C0938a(int i, int i2) {
        this.f3221b = i;
        this.f3222c = i2;
    }

    /* renamed from: a */
    public static C0938a m4125a(int i) {
        C0718j.m3243a(i >= 0);
        return new C0938a(i, Integer.MAX_VALUE);
    }

    /* renamed from: a */
    public static C0938a m4126a(String str) {
        if (str == null) {
            return null;
        }
        if (f3220a == null) {
            f3220a = Pattern.compile("[-/ ]");
        }
        try {
            String[] split = f3220a.split(str);
            C0718j.m3243a(split.length == 4);
            C0718j.m3243a(split[0].equals("bytes"));
            int parseInt = Integer.parseInt(split[1]);
            int parseInt2 = Integer.parseInt(split[2]);
            int parseInt3 = Integer.parseInt(split[3]);
            C0718j.m3243a(parseInt2 > parseInt);
            C0718j.m3243a(parseInt3 > parseInt2);
            return parseInt2 < parseInt3 - 1 ? new C0938a(parseInt, parseInt2) : new C0938a(parseInt, Integer.MAX_VALUE);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(String.format(null, "Invalid Content-Range header value: \"%s\"", new Object[]{str}), e);
        }
    }

    /* renamed from: b */
    public static C0938a m4127b(int i) {
        C0718j.m3243a(i > 0);
        return new C0938a(0, i);
    }

    /* renamed from: c */
    private static String m4128c(int i) {
        return i == Integer.MAX_VALUE ? "" : Integer.toString(i);
    }

    /* renamed from: a */
    public String mo4037a() {
        return String.format(null, "bytes=%s-%s", new Object[]{m4128c(this.f3221b), m4128c(this.f3222c)});
    }

    /* renamed from: a */
    public boolean mo4038a(C0938a aVar) {
        boolean z = false;
        if (aVar == null) {
            return false;
        }
        if (this.f3221b <= aVar.f3221b && this.f3222c >= aVar.f3222c) {
            z = true;
        }
        return z;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0938a)) {
            return false;
        }
        C0938a aVar = (C0938a) obj;
        if (!(this.f3221b == aVar.f3221b && this.f3222c == aVar.f3222c)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C0754b.m3364a(this.f3221b, this.f3222c);
    }

    public String toString() {
        return String.format(null, "%s-%s", new Object[]{m4128c(this.f3221b), m4128c(this.f3222c)});
    }
}
