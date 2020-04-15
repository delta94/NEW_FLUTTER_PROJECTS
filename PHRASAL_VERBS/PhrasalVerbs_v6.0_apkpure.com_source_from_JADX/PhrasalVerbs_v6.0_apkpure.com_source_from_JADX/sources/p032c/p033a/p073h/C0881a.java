package p032c.p033a.p073h;

import p032c.p033a.p038c.p042d.C0713g;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p050l.C0762c;
import p032c.p033a.p073h.C0883c.C0884a;

/* renamed from: c.a.h.a */
public class C0881a implements C0884a {

    /* renamed from: a */
    private static final byte[] f3105a = {-1, -40, -1};

    /* renamed from: b */
    private static final int f3106b = f3105a.length;

    /* renamed from: c */
    private static final byte[] f3107c = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: d */
    private static final int f3108d = f3107c.length;

    /* renamed from: e */
    private static final byte[] f3109e = C0886e.m3962a("GIF87a");

    /* renamed from: f */
    private static final byte[] f3110f = C0886e.m3962a("GIF89a");

    /* renamed from: g */
    private static final byte[] f3111g = C0886e.m3962a("BM");

    /* renamed from: h */
    private static final int f3112h = f3111g.length;

    /* renamed from: i */
    private static final String[] f3113i = {"heic", "heix", "hevc", "hevx"};

    /* renamed from: j */
    private static final int f3114j;

    /* renamed from: k */
    final int f3115k = C0713g.m3228a(21, 20, f3106b, f3108d, 6, f3112h, f3114j);

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("ftyp");
        sb.append(f3113i[0]);
        f3114j = C0886e.m3962a(sb.toString()).length;
    }

    /* renamed from: b */
    private static C0883c m3941b(byte[] bArr, int i) {
        C0718j.m3243a(C0762c.m3394b(bArr, 0, i));
        return C0762c.m3396d(bArr, 0) ? C0882b.f3120e : C0762c.m3395c(bArr, 0) ? C0882b.f3121f : C0762c.m3389a(bArr, 0, i) ? C0762c.m3388a(bArr, 0) ? C0882b.f3124i : C0762c.m3393b(bArr, 0) ? C0882b.f3123h : C0882b.f3122g : C0883c.f3126a;
    }

    /* renamed from: c */
    private static boolean m3942c(byte[] bArr, int i) {
        byte[] bArr2 = f3111g;
        if (i < bArr2.length) {
            return false;
        }
        return C0886e.m3961a(bArr, bArr2);
    }

    /* renamed from: d */
    private static boolean m3943d(byte[] bArr, int i) {
        boolean z = false;
        if (i < 6) {
            return false;
        }
        if (C0886e.m3961a(bArr, f3109e) || C0886e.m3961a(bArr, f3110f)) {
            z = true;
        }
        return z;
    }

    /* renamed from: e */
    private static boolean m3944e(byte[] bArr, int i) {
        String[] strArr;
        if (i < f3114j || bArr[3] < 8) {
            return false;
        }
        for (String str : f3113i) {
            int length = bArr.length;
            StringBuilder sb = new StringBuilder();
            sb.append("ftyp");
            sb.append(str);
            if (C0886e.m3960a(bArr, length, C0886e.m3962a(sb.toString()), f3114j) > -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private static boolean m3945f(byte[] bArr, int i) {
        byte[] bArr2 = f3105a;
        return i >= bArr2.length && C0886e.m3961a(bArr, bArr2);
    }

    /* renamed from: g */
    private static boolean m3946g(byte[] bArr, int i) {
        byte[] bArr2 = f3107c;
        return i >= bArr2.length && C0886e.m3961a(bArr, bArr2);
    }

    /* renamed from: a */
    public int mo3949a() {
        return this.f3115k;
    }

    /* renamed from: a */
    public final C0883c mo3950a(byte[] bArr, int i) {
        C0718j.m3240a(bArr);
        return C0762c.m3394b(bArr, 0, i) ? m3941b(bArr, i) : m3945f(bArr, i) ? C0882b.f3116a : m3946g(bArr, i) ? C0882b.f3117b : m3943d(bArr, i) ? C0882b.f3118c : m3942c(bArr, i) ? C0882b.f3119d : m3944e(bArr, i) ? C0882b.f3125j : C0883c.f3126a;
    }
}
