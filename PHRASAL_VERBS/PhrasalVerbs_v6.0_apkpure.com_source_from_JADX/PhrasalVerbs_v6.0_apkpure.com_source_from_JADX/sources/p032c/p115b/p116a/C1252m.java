package p032c.p115b.p116a;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: c.b.a.m */
public class C1252m extends C1242c<C1252m> {

    /* renamed from: A */
    private static float f4067A = Float.MIN_VALUE;

    /* renamed from: B */
    private static int f4068B = 1;

    /* renamed from: C */
    private static int f4069C = 10;

    /* renamed from: z */
    private static float f4070z = Float.MAX_VALUE;

    /* renamed from: D */
    private float f4071D;

    /* renamed from: E */
    private float f4072E;

    /* renamed from: F */
    private float f4073F;

    /* renamed from: G */
    private float f4074G;

    /* renamed from: H */
    private float f4075H;

    /* renamed from: I */
    private float f4076I;

    /* renamed from: J */
    private float f4077J;

    /* renamed from: K */
    private float f4078K;

    /* renamed from: L */
    private float f4079L;

    /* renamed from: M */
    private float f4080M;

    /* renamed from: N */
    private float f4081N;

    /* renamed from: O */
    private float f4082O;

    /* renamed from: P */
    private int f4083P = f4068B;

    /* renamed from: Q */
    private int f4084Q = f4069C;

    /* renamed from: R */
    private float f4085R;

    /* renamed from: S */
    private float f4086S;

    /* renamed from: T */
    private float f4087T;

    /* renamed from: U */
    private float f4088U;

    /* renamed from: V */
    private float f4089V;

    /* renamed from: W */
    private float f4090W;

    /* renamed from: X */
    private float f4091X;

    /* renamed from: Y */
    private float f4092Y;

    /* renamed from: Z */
    private VelocityTracker f4093Z;

    /* renamed from: aa */
    private boolean f4094aa;

    public C1252m(Context context) {
        float f = f4067A;
        this.f4071D = f;
        float f2 = f4070z;
        this.f4072E = f2;
        this.f4073F = f;
        this.f4074G = f;
        this.f4075H = f2;
        this.f4076I = f2;
        this.f4077J = f;
        this.f4078K = f;
        this.f4079L = f2;
        this.f4080M = f2;
        this.f4081N = f2;
        this.f4082O = f2;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f4071D = (float) (scaledTouchSlop * scaledTouchSlop);
    }

    /* renamed from: a */
    private static void m5373a(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        motionEvent.offsetLocation(rawX, rawY);
        velocityTracker.addMovement(motionEvent);
        motionEvent.offsetLocation(-rawX, -rawY);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0072, code lost:
        if (r0 >= r1) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008f, code lost:
        if (r0 >= r2) goto L_0x0091;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m5374x() {
        /*
            r6 = this;
            float r0 = r6.f4089V
            float r1 = r6.f4085R
            float r0 = r0 - r1
            float r1 = r6.f4087T
            float r0 = r0 + r1
            float r1 = r6.f4072E
            float r2 = f4070z
            r3 = 1
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0016
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0016
            return r3
        L_0x0016:
            float r1 = r6.f4073F
            float r2 = f4067A
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0023
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0023
            return r3
        L_0x0023:
            float r1 = r6.f4090W
            float r2 = r6.f4086S
            float r1 = r1 - r2
            float r2 = r6.f4088U
            float r1 = r1 + r2
            float r2 = r6.f4076I
            float r4 = f4070z
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0038
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0038
            return r3
        L_0x0038:
            float r2 = r6.f4077J
            float r4 = f4067A
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0045
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0045
            return r3
        L_0x0045:
            float r0 = r0 * r0
            float r1 = r1 * r1
            float r0 = r0 + r1
            float r1 = r6.f4071D
            float r2 = f4070z
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0057
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0057
            return r3
        L_0x0057:
            float r0 = r6.f4091X
            float r1 = r6.f4080M
            float r2 = f4070z
            r4 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0075
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x006a
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0074
        L_0x006a:
            float r1 = r6.f4080M
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x0075
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0075
        L_0x0074:
            return r3
        L_0x0075:
            float r1 = r6.f4092Y
            float r2 = r6.f4081N
            float r5 = f4070z
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x0092
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x0087
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0091
        L_0x0087:
            float r2 = r6.f4081N
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x0092
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0092
        L_0x0091:
            return r3
        L_0x0092:
            float r0 = r0 * r0
            float r1 = r1 * r1
            float r0 = r0 + r1
            float r1 = r6.f4082O
            float r2 = f4070z
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00a4
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00a4
            return r3
        L_0x00a4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p032c.p115b.p116a.C1252m.m5374x():boolean");
    }

    /* renamed from: y */
    private boolean m5375y() {
        float f = (this.f4089V - this.f4085R) + this.f4087T;
        float f2 = this.f4074G;
        if (f2 != f4067A && f < f2) {
            return true;
        }
        float f3 = this.f4075H;
        if (f3 != f4070z && f > f3) {
            return true;
        }
        float f4 = (this.f4090W - this.f4086S) + this.f4088U;
        float f5 = this.f4078K;
        if (f5 != f4067A && f4 < f5) {
            return true;
        }
        float f6 = this.f4079L;
        return f6 != f4070z && f4 > f6;
    }

    /* renamed from: a */
    public C1252m mo4660a(float f) {
        this.f4073F = f;
        return this;
    }

    /* renamed from: b */
    public C1252m mo4666b(float f) {
        this.f4072E = f;
        return this;
    }

    /* renamed from: c */
    public C1252m mo4667c(float f) {
        this.f4077J = f;
        return this;
    }

    /* renamed from: c */
    public C1252m mo4668c(boolean z) {
        this.f4094aa = z;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo4606c(MotionEvent motionEvent) {
        int k = mo4640k();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 6 || actionMasked == 5) {
            this.f4087T += this.f4089V - this.f4085R;
            this.f4088U += this.f4090W - this.f4086S;
            this.f4089V = C1247h.m5357a(motionEvent, this.f4094aa);
            this.f4090W = C1247h.m5358b(motionEvent, this.f4094aa);
            this.f4085R = this.f4089V;
            this.f4086S = this.f4090W;
        } else {
            this.f4089V = C1247h.m5357a(motionEvent, this.f4094aa);
            this.f4090W = C1247h.m5358b(motionEvent, this.f4094aa);
        }
        if (k != 0 || motionEvent.getPointerCount() < this.f4083P) {
            VelocityTracker velocityTracker = this.f4093Z;
            if (velocityTracker != null) {
                m5373a(velocityTracker, motionEvent);
                this.f4093Z.computeCurrentVelocity(1000);
                this.f4091X = this.f4093Z.getXVelocity();
                this.f4092Y = this.f4093Z.getYVelocity();
            }
        } else {
            this.f4085R = this.f4089V;
            this.f4086S = this.f4090W;
            this.f4087T = 0.0f;
            this.f4088U = 0.0f;
            this.f4093Z = VelocityTracker.obtain();
            m5373a(this.f4093Z, motionEvent);
            mo4623b();
        }
        if (actionMasked == 1) {
            if (k == 4 || k == 2) {
                mo4631d();
                return;
            }
        } else if (actionMasked != 5 || motionEvent.getPointerCount() <= this.f4084Q) {
            if (!(actionMasked == 6 && k == 4 && motionEvent.getPointerCount() < this.f4083P)) {
                if (k != 2) {
                    return;
                }
                if (!m5375y()) {
                    if (m5374x()) {
                        this.f4085R = this.f4089V;
                        this.f4086S = this.f4090W;
                        mo4615a();
                        return;
                    }
                    return;
                }
            }
        } else if (k == 4) {
            mo4628c();
            return;
        }
        mo4633e();
    }

    /* renamed from: d */
    public C1252m mo4669d(float f) {
        this.f4076I = f;
        return this;
    }

    /* renamed from: d */
    public C1252m mo4607d(int i) {
        this.f4084Q = i;
        return this;
    }

    /* renamed from: e */
    public C1252m mo4670e(float f) {
        this.f4075H = f;
        return this;
    }

    /* renamed from: e */
    public C1252m mo4608e(int i) {
        this.f4083P = i;
        return this;
    }

    /* renamed from: f */
    public C1252m mo4671f(float f) {
        this.f4074G = f;
        return this;
    }

    /* renamed from: g */
    public C1252m mo4672g(float f) {
        this.f4079L = f;
        return this;
    }

    /* renamed from: h */
    public C1252m mo4673h(float f) {
        this.f4078K = f;
        return this;
    }

    /* renamed from: i */
    public C1252m mo4674i(float f) {
        this.f4071D = f * f;
        return this;
    }

    /* renamed from: j */
    public C1252m mo4675j(float f) {
        this.f4082O = f * f;
        return this;
    }

    /* renamed from: k */
    public C1252m mo4676k(float f) {
        this.f4080M = f;
        return this;
    }

    /* renamed from: l */
    public C1252m mo4677l(float f) {
        this.f4081N = f;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo4610q() {
        VelocityTracker velocityTracker = this.f4093Z;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4093Z = null;
        }
    }

    /* renamed from: t */
    public float mo4678t() {
        return (this.f4089V - this.f4085R) + this.f4087T;
    }

    /* renamed from: u */
    public float mo4679u() {
        return (this.f4090W - this.f4086S) + this.f4088U;
    }

    /* renamed from: v */
    public float mo4680v() {
        return this.f4091X;
    }

    /* renamed from: w */
    public float mo4681w() {
        return this.f4092Y;
    }
}
