package p032c.p033a.p038c.p042d;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: c.a.c.d.b */
public final class C0708b {

    /* renamed from: a */
    static final Logger f2586a = Logger.getLogger(C0708b.class.getName());

    private C0708b() {
    }

    /* renamed from: a */
    public static void m3222a(Closeable closeable, boolean z) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                if (z) {
                    f2586a.log(Level.WARNING, "IOException thrown while closing Closeable.", e);
                } else {
                    throw e;
                }
            }
        }
    }

    /* renamed from: a */
    public static void m3223a(InputStream inputStream) {
        try {
            m3222a(inputStream, true);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
