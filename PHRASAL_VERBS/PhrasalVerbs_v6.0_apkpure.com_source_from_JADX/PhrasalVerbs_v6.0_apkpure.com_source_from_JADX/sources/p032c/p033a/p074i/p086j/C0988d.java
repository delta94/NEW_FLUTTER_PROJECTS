package p032c.p033a.p074i.p086j;

import android.util.Pair;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStream;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p042d.C0721m;
import p032c.p033a.p038c.p045g.C0737g;
import p032c.p033a.p038c.p045g.C0740i;
import p032c.p033a.p038c.p046h.C0744b;
import p032c.p033a.p073h.C0882b;
import p032c.p033a.p073h.C0883c;
import p032c.p033a.p073h.C0885d;
import p032c.p033a.p074i.p081e.C0938a;
import p032c.p033a.p093j.C1130c;
import p032c.p033a.p093j.C1135g;

/* renamed from: c.a.i.j.d */
public class C0988d implements Closeable {

    /* renamed from: a */
    private final C0744b<C0737g> f3446a;

    /* renamed from: b */
    private final C0721m<FileInputStream> f3447b;

    /* renamed from: c */
    private C0883c f3448c;

    /* renamed from: d */
    private int f3449d;

    /* renamed from: e */
    private int f3450e;

    /* renamed from: f */
    private int f3451f;

    /* renamed from: g */
    private int f3452g;

    /* renamed from: h */
    private int f3453h;

    /* renamed from: i */
    private int f3454i;

    /* renamed from: j */
    private C0938a f3455j;

    public C0988d(C0721m<FileInputStream> mVar) {
        this.f3448c = C0883c.f3126a;
        this.f3449d = -1;
        this.f3450e = 0;
        this.f3451f = -1;
        this.f3452g = -1;
        this.f3453h = 1;
        this.f3454i = -1;
        C0718j.m3240a(mVar);
        this.f3446a = null;
        this.f3447b = mVar;
    }

    public C0988d(C0721m<FileInputStream> mVar, int i) {
        this(mVar);
        this.f3454i = i;
    }

    public C0988d(C0744b<C0737g> bVar) {
        this.f3448c = C0883c.f3126a;
        this.f3449d = -1;
        this.f3450e = 0;
        this.f3451f = -1;
        this.f3452g = -1;
        this.f3453h = 1;
        this.f3454i = -1;
        C0718j.m3243a(C0744b.m3337c(bVar));
        this.f3446a = bVar.clone();
        this.f3447b = null;
    }

    /* renamed from: A */
    private Pair<Integer, Integer> m4404A() {
        Pair<Integer, Integer> b = C1135g.m5045b(mo4220s());
        if (b != null) {
            this.f3451f = ((Integer) b.first).intValue();
            this.f3452g = ((Integer) b.second).intValue();
        }
        return b;
    }

    /* renamed from: a */
    public static C0988d m4405a(C0988d dVar) {
        if (dVar != null) {
            return dVar.mo4214m();
        }
        return null;
    }

    /* renamed from: b */
    public static void m4406b(C0988d dVar) {
        if (dVar != null) {
            dVar.close();
        }
    }

    /* renamed from: d */
    public static boolean m4407d(C0988d dVar) {
        return dVar.f3449d >= 0 && dVar.f3451f >= 0 && dVar.f3452g >= 0;
    }

    /* renamed from: e */
    public static boolean m4408e(C0988d dVar) {
        return dVar != null && dVar.mo4225x();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002a A[SYNTHETIC, Splitter:B:15:0x002a] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.util.Pair<java.lang.Integer, java.lang.Integer> m4409z() {
        /*
            r3 = this;
            java.io.InputStream r0 = r3.mo4220s()     // Catch:{ all -> 0x0026 }
            android.util.Pair r1 = p032c.p033a.p093j.C1129b.m5030a(r0)     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x001e
            java.lang.Object r2 = r1.first     // Catch:{ all -> 0x0024 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0024 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0024 }
            r3.f3451f = r2     // Catch:{ all -> 0x0024 }
            java.lang.Object r2 = r1.second     // Catch:{ all -> 0x0024 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0024 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0024 }
            r3.f3452g = r2     // Catch:{ all -> 0x0024 }
        L_0x001e:
            if (r0 == 0) goto L_0x0023
            r0.close()     // Catch:{ IOException -> 0x0023 }
        L_0x0023:
            return r1
        L_0x0024:
            r1 = move-exception
            goto L_0x0028
        L_0x0026:
            r1 = move-exception
            r0 = 0
        L_0x0028:
            if (r0 == 0) goto L_0x002d
            r0.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p032c.p033a.p074i.p086j.C0988d.m4409z():android.util.Pair");
    }

    /* renamed from: a */
    public void mo4203a(C0883c cVar) {
        this.f3448c = cVar;
    }

    /* renamed from: a */
    public void mo4204a(C0938a aVar) {
        this.f3455j = aVar;
    }

    /* renamed from: b */
    public String mo4205b(int i) {
        C0744b n = mo4215n();
        String str = "";
        if (n == null) {
            return str;
        }
        int min = Math.min(mo4223v(), i);
        byte[] bArr = new byte[min];
        try {
            C0737g gVar = (C0737g) n.mo3520n();
            if (gVar == null) {
                return str;
            }
            gVar.mo3495a(0, bArr, 0, min);
            n.close();
            StringBuilder sb = new StringBuilder(bArr.length * 2);
            for (byte valueOf : bArr) {
                sb.append(String.format("%02X", new Object[]{Byte.valueOf(valueOf)}));
            }
            return sb.toString();
        } finally {
            n.close();
        }
    }

    /* renamed from: c */
    public void mo4206c(C0988d dVar) {
        this.f3448c = dVar.mo4219r();
        this.f3451f = dVar.mo4224w();
        this.f3452g = dVar.mo4218q();
        this.f3449d = dVar.mo4221t();
        this.f3450e = dVar.mo4217p();
        this.f3453h = dVar.mo4222u();
        this.f3454i = dVar.mo4223v();
        this.f3455j = dVar.mo4216o();
    }

    /* renamed from: c */
    public boolean mo4207c(int i) {
        boolean z = true;
        if (this.f3448c != C0882b.f3116a || this.f3447b != null) {
            return true;
        }
        C0718j.m3240a(this.f3446a);
        C0737g gVar = (C0737g) this.f3446a.mo3520n();
        if (!(gVar.mo3494a(i - 2) == -1 && gVar.mo3494a(i - 1) == -39)) {
            z = false;
        }
        return z;
    }

    public void close() {
        C0744b.m3336b(this.f3446a);
    }

    /* renamed from: d */
    public void mo4209d(int i) {
        this.f3450e = i;
    }

    /* renamed from: e */
    public void mo4210e(int i) {
        this.f3452g = i;
    }

    /* renamed from: f */
    public void mo4211f(int i) {
        this.f3449d = i;
    }

    /* renamed from: g */
    public void mo4212g(int i) {
        this.f3453h = i;
    }

    /* renamed from: h */
    public void mo4213h(int i) {
        this.f3451f = i;
    }

    /* renamed from: m */
    public C0988d mo4214m() {
        C0988d dVar;
        C0721m<FileInputStream> mVar = this.f3447b;
        if (mVar != null) {
            dVar = new C0988d(mVar, this.f3454i);
        } else {
            C0744b a = C0744b.m3333a(this.f3446a);
            if (a == null) {
                dVar = null;
            } else {
                try {
                    dVar = new C0988d(a);
                } catch (Throwable th) {
                    C0744b.m3336b(a);
                    throw th;
                }
            }
            C0744b.m3336b(a);
        }
        if (dVar != null) {
            dVar.mo4206c(this);
        }
        return dVar;
    }

    /* renamed from: n */
    public C0744b<C0737g> mo4215n() {
        return C0744b.m3333a(this.f3446a);
    }

    /* renamed from: o */
    public C0938a mo4216o() {
        return this.f3455j;
    }

    /* renamed from: p */
    public int mo4217p() {
        return this.f3450e;
    }

    /* renamed from: q */
    public int mo4218q() {
        return this.f3452g;
    }

    /* renamed from: r */
    public C0883c mo4219r() {
        return this.f3448c;
    }

    /* renamed from: s */
    public InputStream mo4220s() {
        C0721m<FileInputStream> mVar = this.f3447b;
        if (mVar != null) {
            return (InputStream) mVar.get();
        }
        C0744b a = C0744b.m3333a(this.f3446a);
        if (a == null) {
            return null;
        }
        try {
            return new C0740i((C0737g) a.mo3520n());
        } finally {
            C0744b.m3336b(a);
        }
    }

    /* renamed from: t */
    public int mo4221t() {
        return this.f3449d;
    }

    /* renamed from: u */
    public int mo4222u() {
        return this.f3453h;
    }

    /* renamed from: v */
    public int mo4223v() {
        C0744b<C0737g> bVar = this.f3446a;
        return (bVar == null || bVar.mo3520n() == null) ? this.f3454i : ((C0737g) this.f3446a.mo3520n()).size();
    }

    /* renamed from: w */
    public int mo4224w() {
        return this.f3451f;
    }

    /* renamed from: x */
    public synchronized boolean mo4225x() {
        return C0744b.m3337c(this.f3446a) || this.f3447b != null;
    }

    /* renamed from: y */
    public void mo4226y() {
        int i;
        C0883c c = C0885d.m3958c(mo4220s());
        this.f3448c = c;
        Pair A = C0882b.m3950b(c) ? m4404A() : m4409z();
        if (c != C0882b.f3116a || this.f3449d != -1) {
            i = 0;
        } else if (A != null) {
            this.f3450e = C1130c.m5032a(mo4220s());
            i = C1130c.m5031a(this.f3450e);
        } else {
            return;
        }
        this.f3449d = i;
    }
}
