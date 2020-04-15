package p032c.p033a.p034a;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import p032c.p033a.p038c.p042d.C0718j;

/* renamed from: c.a.a.b */
public class C0651b implements C0650a {

    /* renamed from: a */
    private final File f2457a;

    private C0651b(File file) {
        C0718j.m3240a(file);
        this.f2457a = file;
    }

    /* renamed from: a */
    public static C0651b m3026a(File file) {
        if (file != null) {
            return new C0651b(file);
        }
        return null;
    }

    /* renamed from: a */
    public InputStream mo3338a() {
        return new FileInputStream(this.f2457a);
    }

    /* renamed from: b */
    public File mo3340b() {
        return this.f2457a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0651b)) {
            return false;
        }
        return this.f2457a.equals(((C0651b) obj).f2457a);
    }

    public int hashCode() {
        return this.f2457a.hashCode();
    }

    public long size() {
        return this.f2457a.length();
    }
}
