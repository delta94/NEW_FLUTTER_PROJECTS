package p032c.p033a.p073h;

/* renamed from: c.a.h.b */
public final class C0882b {

    /* renamed from: a */
    public static final C0883c f3116a = new C0883c("JPEG", "jpeg");

    /* renamed from: b */
    public static final C0883c f3117b = new C0883c("PNG", "png");

    /* renamed from: c */
    public static final C0883c f3118c = new C0883c("GIF", "gif");

    /* renamed from: d */
    public static final C0883c f3119d = new C0883c("BMP", "bmp");

    /* renamed from: e */
    public static final C0883c f3120e;

    /* renamed from: f */
    public static final C0883c f3121f;

    /* renamed from: g */
    public static final C0883c f3122g;

    /* renamed from: h */
    public static final C0883c f3123h;

    /* renamed from: i */
    public static final C0883c f3124i;

    /* renamed from: j */
    public static final C0883c f3125j = new C0883c("HEIF", "heif");

    static {
        String str = "webp";
        f3120e = new C0883c("WEBP_SIMPLE", str);
        f3121f = new C0883c("WEBP_LOSSLESS", str);
        f3122g = new C0883c("WEBP_EXTENDED", str);
        f3123h = new C0883c("WEBP_EXTENDED_WITH_ALPHA", str);
        f3124i = new C0883c("WEBP_ANIMATED", str);
    }

    /* renamed from: a */
    public static boolean m3949a(C0883c cVar) {
        return cVar == f3120e || cVar == f3121f || cVar == f3122g || cVar == f3123h;
    }

    /* renamed from: b */
    public static boolean m3950b(C0883c cVar) {
        return m3949a(cVar) || cVar == f3124i;
    }
}
