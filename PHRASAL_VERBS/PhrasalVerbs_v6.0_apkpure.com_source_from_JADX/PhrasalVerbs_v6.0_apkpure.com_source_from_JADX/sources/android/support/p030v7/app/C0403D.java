package android.support.p030v7.app;

/* renamed from: android.support.v7.app.D */
class C0403D {

    /* renamed from: a */
    private static C0403D f1377a;

    /* renamed from: b */
    public long f1378b;

    /* renamed from: c */
    public long f1379c;

    /* renamed from: d */
    public int f1380d;

    C0403D() {
    }

    /* renamed from: a */
    static C0403D m1847a() {
        if (f1377a == null) {
            f1377a = new C0403D();
        }
        return f1377a;
    }

    /* renamed from: a */
    public void mo1861a(long j, double d, double d2) {
        float f = ((float) (j - 946728000000L)) / 8.64E7f;
        float f2 = (0.01720197f * f) + 6.24006f;
        double d3 = (double) f2;
        double sin = Math.sin(d3) * 0.03341960161924362d;
        Double.isNaN(d3);
        double sin2 = sin + d3 + (Math.sin((double) (2.0f * f2)) * 3.4906598739326E-4d) + (Math.sin((double) (f2 * 3.0f)) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double d4 = (-d2) / 360.0d;
        double d5 = (double) (f - 9.0E-4f);
        Double.isNaN(d5);
        double round = (double) (((float) Math.round(d5 - d4)) + 9.0E-4f);
        Double.isNaN(round);
        double sin3 = round + d4 + (Math.sin(d3) * 0.0053d) + (Math.sin(2.0d * sin2) * -0.0069d);
        double asin = Math.asin(Math.sin(sin2) * Math.sin(0.4092797040939331d));
        double d6 = 0.01745329238474369d * d;
        double sin4 = (Math.sin(-0.10471975803375244d) - (Math.sin(d6) * Math.sin(asin))) / (Math.cos(d6) * Math.cos(asin));
        if (sin4 >= 1.0d) {
            this.f1380d = 1;
        } else if (sin4 <= -1.0d) {
            this.f1380d = 0;
        } else {
            double acos = (double) ((float) (Math.acos(sin4) / 6.283185307179586d));
            Double.isNaN(acos);
            this.f1378b = Math.round((sin3 + acos) * 8.64E7d) + 946728000000L;
            Double.isNaN(acos);
            this.f1379c = Math.round((sin3 - acos) * 8.64E7d) + 946728000000L;
            if (this.f1379c >= j || this.f1378b <= j) {
                this.f1380d = 1;
            } else {
                this.f1380d = 0;
            }
            return;
        }
        this.f1378b = -1;
        this.f1379c = -1;
    }
}
