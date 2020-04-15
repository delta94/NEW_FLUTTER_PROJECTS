package p032c.p033a.p038c.p041c;

import java.io.File;

/* renamed from: c.a.c.c.a */
public class C0700a {
    /* renamed from: a */
    public static void m3212a(File file, C0701b bVar) {
        bVar.mo3374b(file);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    m3212a(file2, bVar);
                } else {
                    bVar.mo3373a(file2);
                }
            }
        }
        bVar.mo3375c(file);
    }

    /* renamed from: a */
    public static boolean m3213a(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File b : listFiles) {
                z &= m3214b(b);
            }
        }
        return z;
    }

    /* renamed from: b */
    public static boolean m3214b(File file) {
        if (file.isDirectory()) {
            m3213a(file);
        }
        return file.delete();
    }
}
