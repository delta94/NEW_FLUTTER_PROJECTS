package p032c.p115b.p116a;

import android.view.MotionEvent;
import android.view.MotionEvent.PointerCoords;
import android.view.MotionEvent.PointerProperties;
import android.view.View;
import java.util.Arrays;
import p032c.p115b.p116a.C1242c;

/* renamed from: c.b.a.c */
public class C1242c<T extends C1242c> {

    /* renamed from: a */
    private static int f4014a = 11;

    /* renamed from: b */
    private static PointerProperties[] f4015b;

    /* renamed from: c */
    private static PointerCoords[] f4016c;

    /* renamed from: d */
    private final int[] f4017d = new int[f4014a];

    /* renamed from: e */
    private int f4018e = 0;

    /* renamed from: f */
    private int f4019f;

    /* renamed from: g */
    private View f4020g;

    /* renamed from: h */
    private int f4021h = 0;

    /* renamed from: i */
    private float f4022i;

    /* renamed from: j */
    private float f4023j;

    /* renamed from: k */
    private boolean f4024k;

    /* renamed from: l */
    private boolean f4025l = true;

    /* renamed from: m */
    private float[] f4026m;

    /* renamed from: n */
    private float f4027n;

    /* renamed from: o */
    private float f4028o;

    /* renamed from: p */
    private float f4029p;

    /* renamed from: q */
    private float f4030q;

    /* renamed from: r */
    private boolean f4031r;

    /* renamed from: s */
    private int f4032s = 0;

    /* renamed from: t */
    private C1245f f4033t;

    /* renamed from: u */
    private C1251l<T> f4034u;

    /* renamed from: v */
    private C1243d f4035v;

    /* renamed from: w */
    int f4036w;

    /* renamed from: x */
    boolean f4037x;

    /* renamed from: y */
    boolean f4038y;

    /* renamed from: a */
    private static boolean mo4660a(float f) {
        return !Float.isNaN(f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.MotionEvent m5278d(android.view.MotionEvent r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            boolean r2 = r25.m5281e(r26)
            if (r2 != 0) goto L_0x000b
            return r1
        L_0x000b:
            int r2 = r26.getActionMasked()
            r3 = 2
            r4 = 5
            r5 = 0
            r6 = -1
            r7 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r4) goto L_0x0019
            goto L_0x0037
        L_0x0019:
            r4 = 6
            if (r2 == r7) goto L_0x0022
            if (r2 != r4) goto L_0x001f
            goto L_0x0022
        L_0x001f:
            r3 = r2
            r2 = -1
            goto L_0x004b
        L_0x0022:
            int r2 = r26.getActionIndex()
            int r8 = r1.getPointerId(r2)
            int[] r9 = r0.f4017d
            r8 = r9[r8]
            if (r8 == r6) goto L_0x004b
            int r3 = r0.f4018e
            if (r3 != r7) goto L_0x0035
            r4 = 1
        L_0x0035:
            r3 = r4
            goto L_0x004b
        L_0x0037:
            int r2 = r26.getActionIndex()
            int r8 = r1.getPointerId(r2)
            int[] r9 = r0.f4017d
            r8 = r9[r8]
            if (r8 == r6) goto L_0x004b
            int r3 = r0.f4018e
            if (r3 != r7) goto L_0x0035
            r4 = 0
            goto L_0x0035
        L_0x004b:
            int r4 = r0.f4018e
            mo4607d(r4)
            float r4 = r26.getX()
            float r7 = r26.getY()
            float r8 = r26.getRawX()
            float r9 = r26.getRawY()
            r1.setLocation(r8, r9)
            int r8 = r26.getPointerCount()
            r13 = r3
            r14 = 0
        L_0x0069:
            if (r5 >= r8) goto L_0x0097
            int r3 = r1.getPointerId(r5)
            int[] r9 = r0.f4017d
            r9 = r9[r3]
            if (r9 == r6) goto L_0x0094
            android.view.MotionEvent$PointerProperties[] r9 = f4015b
            r9 = r9[r14]
            r1.getPointerProperties(r5, r9)
            android.view.MotionEvent$PointerProperties[] r9 = f4015b
            r9 = r9[r14]
            int[] r10 = r0.f4017d
            r3 = r10[r3]
            r9.id = r3
            android.view.MotionEvent$PointerCoords[] r3 = f4016c
            r3 = r3[r14]
            r1.getPointerCoords(r5, r3)
            if (r5 != r2) goto L_0x0092
            int r3 = r14 << 8
            r13 = r13 | r3
        L_0x0092:
            int r14 = r14 + 1
        L_0x0094:
            int r5 = r5 + 1
            goto L_0x0069
        L_0x0097:
            long r9 = r26.getDownTime()
            long r11 = r26.getEventTime()
            android.view.MotionEvent$PointerProperties[] r15 = f4015b
            android.view.MotionEvent$PointerCoords[] r16 = f4016c
            int r17 = r26.getMetaState()
            int r18 = r26.getButtonState()
            float r19 = r26.getXPrecision()
            float r20 = r26.getYPrecision()
            int r21 = r26.getDeviceId()
            int r22 = r26.getEdgeFlags()
            int r23 = r26.getSource()
            int r24 = r26.getFlags()
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r1.setLocation(r4, r7)
            r2.setLocation(r4, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p032c.p115b.p116a.C1242c.m5278d(android.view.MotionEvent):android.view.MotionEvent");
    }

    /* renamed from: d */
    private static void mo4607d(int i) {
        if (f4015b == null) {
            int i2 = f4014a;
            f4015b = new PointerProperties[i2];
            f4016c = new PointerCoords[i2];
        }
        while (i > 0) {
            PointerProperties[] pointerPropertiesArr = f4015b;
            int i3 = i - 1;
            if (pointerPropertiesArr[i3] == null) {
                pointerPropertiesArr[i3] = new PointerProperties();
                f4016c[i3] = new PointerCoords();
                i--;
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    private void mo4608e(int i) {
        int i2 = this.f4021h;
        if (i2 != i) {
            this.f4021h = i;
            this.f4033t.mo4656a(this, i, i2);
            mo4625b(i, i2);
        }
    }

    /* renamed from: e */
    private boolean m5281e(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != this.f4018e) {
            return true;
        }
        int i = 0;
        while (true) {
            int[] iArr = this.f4017d;
            if (i >= iArr.length) {
                return false;
            }
            if (iArr[i] != -1 && iArr[i] != i) {
                return true;
            }
            i++;
        }
    }

    /* renamed from: t */
    private int mo4678t() {
        int i = 0;
        while (i < this.f4018e) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f4017d;
                if (i2 < iArr.length && iArr[i2] != i) {
                    i2++;
                }
            }
            if (i2 == this.f4017d.length) {
                return i;
            }
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public T mo4611a(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.f4026m == null) {
            this.f4026m = new float[6];
        }
        float[] fArr = this.f4026m;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        if (mo4660a(f5) && mo4660a(f) && mo4660a(f3)) {
            throw new IllegalArgumentException("Cannot have all of left, right and width defined");
        } else if (mo4660a(f5) && !mo4660a(f) && !mo4660a(f3)) {
            throw new IllegalArgumentException("When width is set one of left or right pads need to be defined");
        } else if (mo4660a(f6) && mo4660a(f4) && mo4660a(f2)) {
            throw new IllegalArgumentException("Cannot have all of top, bottom and height defined");
        } else if (!mo4660a(f6) || mo4660a(f4) || mo4660a(f2)) {
            return this;
        } else {
            throw new IllegalArgumentException("When height is set one of top or bottom pads need to be defined");
        }
    }

    /* renamed from: a */
    public T mo4612a(C1243d dVar) {
        this.f4035v = dVar;
        return this;
    }

    /* renamed from: a */
    public C1242c mo4613a(C1251l<T> lVar) {
        this.f4034u = lVar;
        return this;
    }

    /* renamed from: a */
    public T mo4614a(boolean z) {
        if (this.f4020g != null) {
            mo4628c();
        }
        this.f4025l = z;
        return this;
    }

    /* renamed from: a */
    public final void mo4615a() {
        int i = this.f4021h;
        if (i == 0 || i == 2) {
            mo4608e(4);
        }
    }

    /* renamed from: a */
    public void mo4616a(int i) {
        this.f4019f = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4617a(int i, int i2) {
        C1251l<T> lVar = this.f4034u;
        if (lVar != null) {
            lVar.mo4664a(this, i, i2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4618a(MotionEvent motionEvent) {
        C1251l<T> lVar = this.f4034u;
        if (lVar != null) {
            lVar.mo4665a(this, motionEvent);
        }
    }

    /* renamed from: a */
    public final void mo4619a(View view, C1245f fVar) {
        if (this.f4020g == null && this.f4033t == null) {
            Arrays.fill(this.f4017d, -1);
            this.f4018e = 0;
            this.f4021h = 0;
            this.f4020g = view;
            this.f4033t = fVar;
            return;
        }
        throw new IllegalStateException("Already prepared or hasn't been reset");
    }

    /* renamed from: a */
    public boolean mo4620a(View view, float f, float f2) {
        float f3;
        float width = (float) view.getWidth();
        float height = (float) view.getHeight();
        float[] fArr = this.f4026m;
        float f4 = 0.0f;
        if (fArr != null) {
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = fArr[2];
            float f8 = fArr[3];
            f3 = mo4660a(f5) ? 0.0f - f5 : 0.0f;
            if (mo4660a(f6)) {
                f4 = 0.0f - f8;
            }
            if (mo4660a(f7)) {
                width += f7;
            }
            if (mo4660a(f8)) {
                height += f8;
            }
            float[] fArr2 = this.f4026m;
            float f9 = fArr2[4];
            float f10 = fArr2[5];
            if (mo4660a(f9)) {
                if (!mo4660a(f5)) {
                    f3 = width - f9;
                } else if (!mo4660a(f7)) {
                    width = f9 + f3;
                }
            }
            if (mo4660a(f10)) {
                if (!mo4660a(f4)) {
                    f4 = height - f10;
                } else if (!mo4660a(height)) {
                    height = f4 + f10;
                }
            }
        } else {
            f3 = 0.0f;
        }
        return f >= f3 && f <= width && f2 >= f4 && f2 <= height;
    }

    /* renamed from: a */
    public boolean mo4621a(C1242c cVar) {
        int i = 0;
        while (true) {
            int[] iArr = this.f4017d;
            if (i >= iArr.length) {
                return false;
            }
            if (iArr[i] != -1 && cVar.f4017d[i] != -1) {
                return true;
            }
            i++;
        }
    }

    /* renamed from: b */
    public T mo4622b(boolean z) {
        this.f4031r = z;
        return this;
    }

    /* renamed from: b */
    public final void mo4623b() {
        if (this.f4021h == 0) {
            mo4608e(2);
        }
    }

    /* renamed from: b */
    public void mo4624b(int i) {
        int[] iArr = this.f4017d;
        if (iArr[i] == -1) {
            iArr[i] = mo4678t();
            this.f4018e++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo4625b(int i, int i2) {
    }

    /* renamed from: b */
    public final void mo4626b(MotionEvent motionEvent) {
        if (this.f4025l) {
            int i = this.f4021h;
            if (!(i == 3 || i == 1 || i == 5 || this.f4018e < 1)) {
                MotionEvent d = m5278d(motionEvent);
                this.f4022i = d.getX();
                this.f4023j = d.getY();
                this.f4032s = d.getPointerCount();
                this.f4024k = mo4620a(this.f4020g, this.f4022i, this.f4023j);
                if (!this.f4031r || this.f4024k) {
                    this.f4027n = C1247h.m5357a(d, true);
                    this.f4028o = C1247h.m5358b(d, true);
                    this.f4029p = d.getRawX() - d.getX();
                    this.f4030q = d.getRawY() - d.getY();
                    mo4606c(d);
                    if (d != motionEvent) {
                        d.recycle();
                    }
                } else {
                    int i2 = this.f4021h;
                    if (i2 == 4) {
                        mo4628c();
                    } else if (i2 == 2) {
                        mo4633e();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public boolean mo4627b(C1242c cVar) {
        if (cVar == this) {
            return false;
        }
        C1243d dVar = this.f4035v;
        if (dVar != null) {
            return dVar.mo4648a(this, cVar);
        }
        return false;
    }

    /* renamed from: c */
    public final void mo4628c() {
        int i = this.f4021h;
        if (i == 4 || i == 0 || i == 2) {
            mo4609p();
            mo4608e(3);
        }
    }

    /* renamed from: c */
    public void mo4629c(int i) {
        int[] iArr = this.f4017d;
        if (iArr[i] != -1) {
            iArr[i] = -1;
            this.f4018e--;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo4606c(MotionEvent motionEvent) {
        mo4608e(1);
    }

    /* renamed from: c */
    public boolean mo4630c(C1242c cVar) {
        if (cVar == this) {
            return true;
        }
        C1243d dVar = this.f4035v;
        if (dVar != null) {
            return dVar.mo4649b(this, cVar);
        }
        return false;
    }

    /* renamed from: d */
    public final void mo4631d() {
        int i = this.f4021h;
        if (i == 2 || i == 4) {
            mo4608e(5);
        }
    }

    /* renamed from: d */
    public boolean mo4632d(C1242c cVar) {
        if (cVar != this) {
            C1243d dVar = this.f4035v;
            if (dVar != null) {
                return dVar.mo4651d(this, cVar);
            }
        }
        return false;
    }

    /* renamed from: e */
    public final void mo4633e() {
        int i = this.f4021h;
        if (i == 4 || i == 0 || i == 2) {
            mo4608e(1);
        }
    }

    /* renamed from: e */
    public boolean mo4634e(C1242c cVar) {
        if (cVar != this) {
            C1243d dVar = this.f4035v;
            if (dVar != null) {
                return dVar.mo4650c(this, cVar);
            }
        }
        return false;
    }

    /* renamed from: f */
    public float mo4635f() {
        return this.f4027n;
    }

    /* renamed from: g */
    public float mo4636g() {
        return this.f4028o;
    }

    /* renamed from: h */
    public float mo4637h() {
        return this.f4027n - this.f4029p;
    }

    /* renamed from: i */
    public float mo4638i() {
        return this.f4028o - this.f4030q;
    }

    /* renamed from: j */
    public int mo4639j() {
        return this.f4032s;
    }

    /* renamed from: k */
    public int mo4640k() {
        return this.f4021h;
    }

    /* renamed from: l */
    public int mo4641l() {
        return this.f4019f;
    }

    /* renamed from: m */
    public View mo4642m() {
        return this.f4020g;
    }

    /* renamed from: n */
    public boolean mo4643n() {
        return this.f4025l;
    }

    /* renamed from: o */
    public boolean mo4644o() {
        return this.f4024k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo4609p() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo4610q() {
    }

    /* renamed from: r */
    public final void mo4645r() {
        this.f4020g = null;
        this.f4033t = null;
        Arrays.fill(this.f4017d, -1);
        this.f4018e = 0;
        mo4610q();
    }

    /* renamed from: s */
    public boolean mo4646s() {
        if (this.f4025l) {
            int i = this.f4021h;
            if (!(i == 1 || i == 3 || i == 5 || this.f4018e <= 0)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        View view = this.f4020g;
        String simpleName = view == null ? null : view.getClass().getSimpleName();
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@[");
        sb.append(this.f4019f);
        sb.append("]:");
        sb.append(simpleName);
        return sb.toString();
    }
}
