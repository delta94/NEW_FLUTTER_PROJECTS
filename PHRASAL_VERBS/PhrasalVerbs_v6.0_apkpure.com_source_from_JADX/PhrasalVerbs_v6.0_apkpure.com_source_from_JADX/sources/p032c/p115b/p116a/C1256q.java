package p032c.p115b.p116a;

/* renamed from: c.b.a.q */
public class C1256q {

    /* renamed from: a */
    private long f4107a;

    /* renamed from: b */
    private long f4108b;

    /* renamed from: c */
    private double f4109c;

    /* renamed from: d */
    private double f4110d;

    /* renamed from: e */
    private float f4111e;

    /* renamed from: f */
    private float f4112f;

    /* renamed from: g */
    private boolean f4113g;

    /* renamed from: h */
    private int[] f4114h = new int[2];

    /* renamed from: i */
    private C1257a f4115i;

    /* renamed from: c.b.a.q$a */
    public interface C1257a {
        /* renamed from: a */
        void mo4693a(C1256q qVar);

        /* renamed from: b */
        boolean mo4694b(C1256q qVar);

        /* renamed from: c */
        boolean mo4695c(C1256q qVar);
    }

    public C1256q(C1257a aVar) {
        this.f4115i = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5409b(android.view.MotionEvent r7) {
        /*
            r6 = this;
            long r0 = r6.f4107a
            r6.f4108b = r0
            long r0 = r7.getEventTime()
            r6.f4107a = r0
            int[] r0 = r6.f4114h
            r1 = 0
            r0 = r0[r1]
            int r0 = r7.findPointerIndex(r0)
            int[] r1 = r6.f4114h
            r2 = 1
            r1 = r1[r2]
            int r1 = r7.findPointerIndex(r1)
            float r2 = r7.getX(r0)
            float r0 = r7.getY(r0)
            float r3 = r7.getX(r1)
            float r7 = r7.getY(r1)
            float r1 = r3 - r2
            float r4 = r7 - r0
            float r2 = r2 + r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r3
            r6.f4111e = r2
            float r0 = r0 + r7
            float r0 = r0 * r3
            r6.f4112f = r0
            double r2 = (double) r4
            double r0 = (double) r1
            double r0 = java.lang.Math.atan2(r2, r0)
            double r0 = -r0
            double r2 = r6.f4109c
            boolean r7 = java.lang.Double.isNaN(r2)
            if (r7 == 0) goto L_0x004e
            r2 = 0
            goto L_0x0051
        L_0x004e:
            double r2 = r6.f4109c
            double r2 = r2 - r0
        L_0x0051:
            r6.f4110d = r2
            r6.f4109c = r0
            double r0 = r6.f4110d
            r2 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x0064
            double r0 = r0 - r2
        L_0x0061:
            r6.f4110d = r0
            goto L_0x006f
        L_0x0064:
            r4 = -4609115380302729960(0xc00921fb54442d18, double:-3.141592653589793)
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x006f
            double r0 = r0 + r2
            goto L_0x0061
        L_0x006f:
            double r0 = r6.f4110d
            r4 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x007e
            double r0 = r0 - r2
        L_0x007b:
            r6.f4110d = r0
            goto L_0x0089
        L_0x007e:
            r4 = -4613618979930100456(0xbff921fb54442d18, double:-1.5707963267948966)
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x0089
            double r0 = r0 + r2
            goto L_0x007b
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p032c.p115b.p116a.C1256q.m5409b(android.view.MotionEvent):void");
    }

    /* renamed from: e */
    private void m5410e() {
        if (this.f4113g) {
            this.f4113g = false;
            C1257a aVar = this.f4115i;
            if (aVar != null) {
                aVar.mo4693a(this);
            }
        }
    }

    /* renamed from: a */
    public float mo4688a() {
        return this.f4111e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        if (r5 != r0[1]) goto L_0x0078;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo4689a(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r0 = r5.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0065
            if (r0 == r2) goto L_0x0061
            r3 = 2
            if (r0 == r3) goto L_0x0052
            r3 = 5
            if (r0 == r3) goto L_0x002b
            r3 = 6
            if (r0 == r3) goto L_0x0014
            goto L_0x0078
        L_0x0014:
            boolean r0 = r4.f4113g
            if (r0 == 0) goto L_0x0078
            int r0 = r5.getActionIndex()
            int r5 = r5.getPointerId(r0)
            int[] r0 = r4.f4114h
            r1 = r0[r1]
            if (r5 == r1) goto L_0x0061
            r0 = r0[r2]
            if (r5 != r0) goto L_0x0078
            goto L_0x0061
        L_0x002b:
            boolean r0 = r4.f4113g
            if (r0 != 0) goto L_0x0078
            int[] r0 = r4.f4114h
            int r1 = r5.getActionIndex()
            int r1 = r5.getPointerId(r1)
            r0[r2] = r1
            r4.f4113g = r2
            long r0 = r5.getEventTime()
            r4.f4108b = r0
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r4.f4109c = r0
            r4.m5409b(r5)
            c.b.a.q$a r5 = r4.f4115i
            if (r5 == 0) goto L_0x0078
            r5.mo4695c(r4)
            goto L_0x0078
        L_0x0052:
            boolean r0 = r4.f4113g
            if (r0 == 0) goto L_0x0078
            r4.m5409b(r5)
            c.b.a.q$a r5 = r4.f4115i
            if (r5 == 0) goto L_0x0078
            r5.mo4694b(r4)
            goto L_0x0078
        L_0x0061:
            r4.m5410e()
            goto L_0x0078
        L_0x0065:
            r4.f4113g = r1
            int[] r0 = r4.f4114h
            int r3 = r5.getActionIndex()
            int r5 = r5.getPointerId(r3)
            r0[r1] = r5
            int[] r5 = r4.f4114h
            r0 = -1
            r5[r2] = r0
        L_0x0078:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p032c.p115b.p116a.C1256q.mo4689a(android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    public float mo4690b() {
        return this.f4112f;
    }

    /* renamed from: c */
    public double mo4691c() {
        return this.f4110d;
    }

    /* renamed from: d */
    public long mo4692d() {
        return this.f4107a - this.f4108b;
    }
}
