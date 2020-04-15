package p032c.p033a.p074i.p086j;

import android.graphics.Bitmap;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p046h.C0744b;
import p032c.p033a.p038c.p046h.C0746d;
import p032c.p033a.p093j.C1129b;

/* renamed from: c.a.i.j.c */
public class C0987c extends C0985a {

    /* renamed from: a */
    private C0744b<Bitmap> f3441a;

    /* renamed from: b */
    private volatile Bitmap f3442b;

    /* renamed from: c */
    private final C0991g f3443c;

    /* renamed from: d */
    private final int f3444d;

    /* renamed from: e */
    private final int f3445e;

    public C0987c(Bitmap bitmap, C0746d<Bitmap> dVar, C0991g gVar, int i) {
        this(bitmap, dVar, gVar, i, 0);
    }

    public C0987c(Bitmap bitmap, C0746d<Bitmap> dVar, C0991g gVar, int i, int i2) {
        C0718j.m3240a(bitmap);
        this.f3442b = bitmap;
        Bitmap bitmap2 = this.f3442b;
        C0718j.m3240a(dVar);
        this.f3441a = C0744b.m3335a(bitmap2, dVar);
        this.f3443c = gVar;
        this.f3444d = i;
        this.f3445e = i2;
    }

    public C0987c(C0744b<Bitmap> bVar, C0991g gVar, int i, int i2) {
        C0744b<Bitmap> m = bVar.mo3519m();
        C0718j.m3240a(m);
        this.f3441a = m;
        this.f3442b = (Bitmap) this.f3441a.mo3520n();
        this.f3443c = gVar;
        this.f3444d = i;
        this.f3445e = i2;
    }

    /* renamed from: a */
    private static int m4394a(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    /* renamed from: b */
    private static int m4395b(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    /* renamed from: u */
    private synchronized C0744b<Bitmap> m4396u() {
        C0744b<Bitmap> bVar;
        bVar = this.f3441a;
        this.f3441a = null;
        this.f3442b = null;
        return bVar;
    }

    public void close() {
        C0744b u = m4396u();
        if (u != null) {
            u.close();
        }
    }

    public synchronized boolean isClosed() {
        return this.f3441a == null;
    }

    /* renamed from: m */
    public int mo4198m() {
        if (this.f3444d % 180 == 0) {
            int i = this.f3445e;
            if (!(i == 5 || i == 7)) {
                return m4394a(this.f3442b);
            }
        }
        return m4395b(this.f3442b);
    }

    /* renamed from: n */
    public int mo4199n() {
        if (this.f3444d % 180 == 0) {
            int i = this.f3445e;
            if (!(i == 5 || i == 7)) {
                return m4395b(this.f3442b);
            }
        }
        return m4394a(this.f3442b);
    }

    /* renamed from: o */
    public C0991g mo4195o() {
        return this.f3443c;
    }

    /* renamed from: p */
    public int mo4196p() {
        return C1129b.m5029a(this.f3442b);
    }

    /* renamed from: r */
    public int mo4200r() {
        return this.f3445e;
    }

    /* renamed from: s */
    public int mo4201s() {
        return this.f3444d;
    }

    /* renamed from: t */
    public Bitmap mo4202t() {
        return this.f3442b;
    }
}
