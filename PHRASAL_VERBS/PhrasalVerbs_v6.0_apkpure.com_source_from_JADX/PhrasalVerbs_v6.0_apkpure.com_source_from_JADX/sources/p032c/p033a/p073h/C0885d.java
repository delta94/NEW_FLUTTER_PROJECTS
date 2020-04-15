package p032c.p033a.p073h;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import p032c.p033a.p038c.p042d.C0707a;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p042d.C0726r;
import p032c.p033a.p073h.C0883c.C0884a;

/* renamed from: c.a.h.d */
public class C0885d {

    /* renamed from: a */
    private static C0885d f3129a;

    /* renamed from: b */
    private int f3130b;

    /* renamed from: c */
    private List<C0884a> f3131c;

    /* renamed from: d */
    private final C0884a f3132d = new C0881a();

    private C0885d() {
        m3957b();
    }

    /* renamed from: a */
    private static int m3954a(int i, InputStream inputStream, byte[] bArr) {
        C0718j.m3240a(inputStream);
        C0718j.m3240a(bArr);
        C0718j.m3243a(bArr.length >= i);
        if (!inputStream.markSupported()) {
            return C0707a.m3220a(inputStream, bArr, 0, i);
        }
        try {
            inputStream.mark(i);
            return C0707a.m3220a(inputStream, bArr, 0, i);
        } finally {
            inputStream.reset();
        }
    }

    /* renamed from: a */
    public static synchronized C0885d m3955a() {
        C0885d dVar;
        synchronized (C0885d.class) {
            if (f3129a == null) {
                f3129a = new C0885d();
            }
            dVar = f3129a;
        }
        return dVar;
    }

    /* renamed from: b */
    public static C0883c m3956b(InputStream inputStream) {
        return m3955a().mo3953a(inputStream);
    }

    /* renamed from: b */
    private void m3957b() {
        this.f3130b = this.f3132d.mo3949a();
        List<C0884a> list = this.f3131c;
        if (list != null) {
            for (C0884a a : list) {
                this.f3130b = Math.max(this.f3130b, a.mo3949a());
            }
        }
    }

    /* renamed from: c */
    public static C0883c m3958c(InputStream inputStream) {
        try {
            return m3956b(inputStream);
        } catch (IOException e) {
            C0726r.m3253a(e);
            throw null;
        }
    }

    /* renamed from: a */
    public C0883c mo3953a(InputStream inputStream) {
        C0718j.m3240a(inputStream);
        int i = this.f3130b;
        byte[] bArr = new byte[i];
        int a = m3954a(i, inputStream, bArr);
        C0883c a2 = this.f3132d.mo3950a(bArr, a);
        if (a2 != null && a2 != C0883c.f3126a) {
            return a2;
        }
        List<C0884a> list = this.f3131c;
        if (list != null) {
            for (C0884a a3 : list) {
                C0883c a4 = a3.mo3950a(bArr, a);
                if (a4 != null && a4 != C0883c.f3126a) {
                    return a4;
                }
            }
        }
        return C0883c.f3126a;
    }
}
