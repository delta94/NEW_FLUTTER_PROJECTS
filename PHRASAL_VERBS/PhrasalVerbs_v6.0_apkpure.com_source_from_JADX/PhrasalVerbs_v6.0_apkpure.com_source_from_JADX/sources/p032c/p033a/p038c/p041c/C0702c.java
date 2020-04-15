package p032c.p033a.p038c.p041c;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import p032c.p033a.p038c.p042d.C0718j;

/* renamed from: c.a.c.c.c */
public class C0702c {

    /* renamed from: c.a.c.c.c$a */
    public static class C0703a extends IOException {
        public C0703a(String str) {
            super(str);
        }

        public C0703a(String str, Throwable th) {
            super(str);
            initCause(th);
        }
    }

    /* renamed from: c.a.c.c.c$b */
    public static class C0704b extends IOException {
        public C0704b(String str) {
            super(str);
        }
    }

    /* renamed from: c.a.c.c.c$c */
    public static class C0705c extends FileNotFoundException {
        public C0705c(String str) {
            super(str);
        }
    }

    /* renamed from: c.a.c.c.c$d */
    public static class C0706d extends IOException {
        public C0706d(String str, Throwable th) {
            super(str);
            initCause(th);
        }
    }

    /* renamed from: a */
    public static void m3218a(File file) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                if (!file.delete()) {
                    throw new C0703a(file.getAbsolutePath(), new C0704b(file.getAbsolutePath()));
                }
            } else {
                return;
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new C0703a(file.getAbsolutePath());
        }
    }

    /* renamed from: a */
    public static void m3219a(File file, File file2) {
        C0718j.m3240a(file);
        C0718j.m3240a(file2);
        file2.delete();
        if (!file.renameTo(file2)) {
            Throwable th = null;
            if (file2.exists()) {
                th = new C0704b(file2.getAbsolutePath());
            } else if (!file.getParentFile().exists()) {
                th = new C0705c(file.getAbsolutePath());
            } else if (!file.exists()) {
                th = new FileNotFoundException(file.getAbsolutePath());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown error renaming ");
            sb.append(file.getAbsolutePath());
            sb.append(" to ");
            sb.append(file2.getAbsolutePath());
            throw new C0706d(sb.toString(), th);
        }
    }
}
