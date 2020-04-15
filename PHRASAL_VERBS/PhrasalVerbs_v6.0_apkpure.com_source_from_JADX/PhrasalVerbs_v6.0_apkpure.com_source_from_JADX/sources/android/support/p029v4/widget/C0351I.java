package android.support.p029v4.widget;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import p000a.p005b.p009c.p018g.C0156v;

/* renamed from: android.support.v4.widget.I */
public class C0351I {

    /* renamed from: a */
    private static final Interpolator f1058a = new C0349G();

    /* renamed from: b */
    private int f1059b;

    /* renamed from: c */
    private int f1060c;

    /* renamed from: d */
    private int f1061d = -1;

    /* renamed from: e */
    private float[] f1062e;

    /* renamed from: f */
    private float[] f1063f;

    /* renamed from: g */
    private float[] f1064g;

    /* renamed from: h */
    private float[] f1065h;

    /* renamed from: i */
    private int[] f1066i;

    /* renamed from: j */
    private int[] f1067j;

    /* renamed from: k */
    private int[] f1068k;

    /* renamed from: l */
    private int f1069l;

    /* renamed from: m */
    private VelocityTracker f1070m;

    /* renamed from: n */
    private float f1071n;

    /* renamed from: o */
    private float f1072o;

    /* renamed from: p */
    private int f1073p;

    /* renamed from: q */
    private int f1074q;

    /* renamed from: r */
    private OverScroller f1075r;

    /* renamed from: s */
    private final C0352a f1076s;

    /* renamed from: t */
    private View f1077t;

    /* renamed from: u */
    private boolean f1078u;

    /* renamed from: v */
    private final ViewGroup f1079v;

    /* renamed from: w */
    private final Runnable f1080w = new C0350H(this);

    /* renamed from: android.support.v4.widget.I$a */
    public static abstract class C0352a {
        /* renamed from: a */
        public int mo1535a(int i) {
            return i;
        }

        /* renamed from: a */
        public abstract int mo1536a(View view);

        /* renamed from: a */
        public abstract int mo1537a(View view, int i, int i2);

        /* renamed from: a */
        public abstract void mo1538a(int i, int i2);

        /* renamed from: a */
        public abstract void mo1539a(View view, float f, float f2);

        /* renamed from: a */
        public abstract void mo1540a(View view, int i);

        /* renamed from: a */
        public abstract void mo1541a(View view, int i, int i2, int i3, int i4);

        /* renamed from: b */
        public int mo1542b(View view) {
            return 0;
        }

        /* renamed from: b */
        public abstract int mo1543b(View view, int i, int i2);

        /* renamed from: b */
        public abstract void mo1544b(int i, int i2);

        /* renamed from: b */
        public abstract boolean mo1545b(int i);

        /* renamed from: b */
        public abstract boolean mo1546b(View view, int i);

        /* renamed from: c */
        public abstract void mo1547c(int i);
    }

    private C0351I(Context context, ViewGroup viewGroup, C0352a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (aVar != null) {
            this.f1079v = viewGroup;
            this.f1076s = aVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f1073p = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f1060c = viewConfiguration.getScaledTouchSlop();
            this.f1071n = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f1072o = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f1075r = new OverScroller(context, f1058a);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: a */
    private float m1506a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs <= f3) {
            return f;
        }
        if (f <= 0.0f) {
            f3 = -f3;
        }
        return f3;
    }

    /* renamed from: a */
    private int m1507a(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs <= i3) {
            return i;
        }
        if (i <= 0) {
            i3 = -i3;
        }
        return i3;
    }

    /* renamed from: a */
    private int m1508a(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int a = m1507a(i3, (int) this.f1072o, (int) this.f1071n);
        int a2 = m1507a(i4, (int) this.f1072o, (int) this.f1071n);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(a);
        int abs4 = Math.abs(a2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (a != 0) {
            f2 = (float) abs3;
            f = (float) i5;
        } else {
            f2 = (float) abs;
            f = (float) i6;
        }
        float f5 = f2 / f;
        if (a2 != 0) {
            f4 = (float) abs4;
            f3 = (float) i5;
        } else {
            f4 = (float) abs2;
            f3 = (float) i6;
        }
        float f6 = f4 / f3;
        return (int) ((((float) m1517b(i, a, this.f1076s.mo1536a(view))) * f5) + (((float) m1517b(i2, a2, this.f1076s.mo1542b(view))) * f6));
    }

    /* renamed from: a */
    public static C0351I m1509a(ViewGroup viewGroup, float f, C0352a aVar) {
        C0351I a = m1510a(viewGroup, aVar);
        a.f1060c = (int) (((float) a.f1060c) * (1.0f / f));
        return a;
    }

    /* renamed from: a */
    public static C0351I m1510a(ViewGroup viewGroup, C0352a aVar) {
        return new C0351I(viewGroup.getContext(), viewGroup, aVar);
    }

    /* renamed from: a */
    private void m1511a(float f, float f2) {
        this.f1078u = true;
        this.f1076s.mo1539a(this.f1077t, f, f2);
        this.f1078u = false;
        if (this.f1059b == 1) {
            mo1529c(0);
        }
    }

    /* renamed from: a */
    private void m1512a(float f, float f2, int i) {
        int i2 = 1;
        if (!m1514a(f, f2, i, 1)) {
            i2 = 0;
        }
        if (m1514a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m1514a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m1514a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f1067j;
            iArr[i] = iArr[i] | i2;
            this.f1076s.mo1538a(i2, i);
        }
    }

    /* renamed from: a */
    private void m1513a(int i, int i2, int i3, int i4) {
        int left = this.f1077t.getLeft();
        int top = this.f1077t.getTop();
        if (i3 != 0) {
            i = this.f1076s.mo1537a(this.f1077t, i, i3);
            C0156v.m541a(this.f1077t, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f1076s.mo1543b(this.f1077t, i2, i4);
            C0156v.m555b(this.f1077t, i2 - top);
        }
        int i6 = i2;
        if (i3 != 0 || i4 != 0) {
            this.f1076s.mo1541a(this.f1077t, i5, i6, i5 - left, i6 - top);
        }
    }

    /* renamed from: a */
    private boolean m1514a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        boolean z = false;
        if (!((this.f1066i[i] & i2) != i2 || (this.f1074q & i2) == 0 || (this.f1068k[i] & i2) == i2 || (this.f1067j[i] & i2) == i2)) {
            int i3 = this.f1060c;
            if (abs > ((float) i3) || abs2 > ((float) i3)) {
                if (abs < abs2 * 0.5f && this.f1076s.mo1545b(i2)) {
                    int[] iArr = this.f1068k;
                    iArr[i] = iArr[i] | i2;
                    return false;
                } else if ((this.f1067j[i] & i2) == 0 && abs > ((float) this.f1060c)) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    private boolean m1515a(View view, float f, float f2) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        boolean z2 = this.f1076s.mo1536a(view) > 0;
        boolean z3 = this.f1076s.mo1542b(view) > 0;
        if (z2 && z3) {
            float f3 = (f * f) + (f2 * f2);
            int i = this.f1060c;
            if (f3 > ((float) (i * i))) {
                z = true;
            }
            return z;
        } else if (z2) {
            if (Math.abs(f) > ((float) this.f1060c)) {
                z = true;
            }
            return z;
        } else {
            if (z3 && Math.abs(f2) > ((float) this.f1060c)) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: b */
    private float m1516b(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: b */
    private int m1517b(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f1079v.getWidth();
        float f = (float) (width / 2);
        float b = f + (m1516b(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f);
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(b / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f), 600);
    }

    /* renamed from: b */
    private void m1518b(float f, float f2, int i) {
        m1524f(i);
        float[] fArr = this.f1062e;
        this.f1064g[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f1063f;
        this.f1065h[i] = f2;
        fArr2[i] = f2;
        this.f1066i[i] = m1521e((int) f, (int) f2);
        this.f1069l |= 1 << i;
    }

    /* renamed from: b */
    private boolean m1519b(int i, int i2, int i3, int i4) {
        int left = this.f1077t.getLeft();
        int top = this.f1077t.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f1075r.abortAnimation();
            mo1529c(0);
            return false;
        }
        this.f1075r.startScroll(left, top, i5, i6, m1508a(this.f1077t, i5, i6, i3, i4));
        mo1529c(2);
        return true;
    }

    /* renamed from: c */
    private void m1520c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m1526g(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f1064g[pointerId] = x;
                this.f1065h[pointerId] = y;
            }
        }
    }

    /* renamed from: e */
    private int m1521e(int i, int i2) {
        int i3 = i < this.f1079v.getLeft() + this.f1073p ? 1 : 0;
        if (i2 < this.f1079v.getTop() + this.f1073p) {
            i3 |= 4;
        }
        if (i > this.f1079v.getRight() - this.f1073p) {
            i3 |= 2;
        }
        return i2 > this.f1079v.getBottom() - this.f1073p ? i3 | 8 : i3;
    }

    /* renamed from: e */
    private void m1522e(int i) {
        if (this.f1062e != null && mo1524b(i)) {
            this.f1062e[i] = 0.0f;
            this.f1063f[i] = 0.0f;
            this.f1064g[i] = 0.0f;
            this.f1065h[i] = 0.0f;
            this.f1066i[i] = 0;
            this.f1067j[i] = 0;
            this.f1068k[i] = 0;
            this.f1069l = ((1 << i) ^ -1) & this.f1069l;
        }
    }

    /* renamed from: f */
    private void m1523f() {
        float[] fArr = this.f1062e;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f1063f, 0.0f);
            Arrays.fill(this.f1064g, 0.0f);
            Arrays.fill(this.f1065h, 0.0f);
            Arrays.fill(this.f1066i, 0);
            Arrays.fill(this.f1067j, 0);
            Arrays.fill(this.f1068k, 0);
            this.f1069l = 0;
        }
    }

    /* renamed from: f */
    private void m1524f(int i) {
        float[] fArr = this.f1062e;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            float[] fArr6 = this.f1062e;
            if (fArr6 != null) {
                System.arraycopy(fArr6, 0, fArr2, 0, fArr6.length);
                float[] fArr7 = this.f1063f;
                System.arraycopy(fArr7, 0, fArr3, 0, fArr7.length);
                float[] fArr8 = this.f1064g;
                System.arraycopy(fArr8, 0, fArr4, 0, fArr8.length);
                float[] fArr9 = this.f1065h;
                System.arraycopy(fArr9, 0, fArr5, 0, fArr9.length);
                int[] iArr4 = this.f1066i;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f1067j;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f1068k;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f1062e = fArr2;
            this.f1063f = fArr3;
            this.f1064g = fArr4;
            this.f1065h = fArr5;
            this.f1066i = iArr;
            this.f1067j = iArr2;
            this.f1068k = iArr3;
        }
    }

    /* renamed from: g */
    private void m1525g() {
        this.f1070m.computeCurrentVelocity(1000, this.f1071n);
        m1511a(m1506a(this.f1070m.getXVelocity(this.f1061d), this.f1072o, this.f1071n), m1506a(this.f1070m.getYVelocity(this.f1061d), this.f1072o, this.f1071n));
    }

    /* renamed from: g */
    private boolean m1526g(int i) {
        if (mo1524b(i)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Ignoring pointerId=");
        sb.append(i);
        sb.append(" because ACTION_DOWN was not received ");
        sb.append("for this pointer before ACTION_MOVE. It likely happened because ");
        sb.append(" ViewDragHelper did not receive all the events in the event stream.");
        Log.e("ViewDragHelper", sb.toString());
        return false;
    }

    /* renamed from: a */
    public void mo1514a() {
        this.f1061d = -1;
        m1523f();
        VelocityTracker velocityTracker = this.f1070m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1070m = null;
        }
    }

    /* renamed from: a */
    public void mo1515a(float f) {
        this.f1072o = f;
    }

    /* renamed from: a */
    public void mo1516a(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo1514a();
        }
        if (this.f1070m == null) {
            this.f1070m = VelocityTracker.obtain();
        }
        this.f1070m.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f1059b != 1) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (i2 < pointerCount) {
                            int pointerId = motionEvent.getPointerId(i2);
                            if (m1526g(pointerId)) {
                                float x = motionEvent.getX(i2);
                                float y = motionEvent.getY(i2);
                                float f = x - this.f1062e[pointerId];
                                float f2 = y - this.f1063f[pointerId];
                                m1512a(f, f2, pointerId);
                                if (this.f1059b != 1) {
                                    View b = mo1523b((int) x, (int) y);
                                    if (m1515a(b, f, f2) && mo1526b(b, pointerId)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i2++;
                        }
                    } else if (m1526g(this.f1061d)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f1061d);
                        float x2 = motionEvent.getX(findPointerIndex);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f1064g;
                        int i3 = this.f1061d;
                        int i4 = (int) (x2 - fArr[i3]);
                        int i5 = (int) (y2 - this.f1065h[i3]);
                        m1513a(this.f1077t.getLeft() + i4, this.f1077t.getTop() + i5, i4, i5);
                    } else {
                        return;
                    }
                    m1520c(motionEvent);
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        float x3 = motionEvent.getX(actionIndex);
                        float y3 = motionEvent.getY(actionIndex);
                        m1518b(x3, y3, pointerId2);
                        if (this.f1059b == 0) {
                            mo1526b(mo1523b((int) x3, (int) y3), pointerId2);
                            int i6 = this.f1066i[pointerId2];
                            int i7 = this.f1074q;
                            if ((i6 & i7) != 0) {
                                this.f1076s.mo1544b(i6 & i7, pointerId2);
                                return;
                            }
                            return;
                        } else if (mo1530c((int) x3, (int) y3)) {
                            mo1526b(this.f1077t, pointerId2);
                            return;
                        } else {
                            return;
                        }
                    } else if (actionMasked == 6) {
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        if (this.f1059b == 1 && pointerId3 == this.f1061d) {
                            int pointerCount2 = motionEvent.getPointerCount();
                            while (true) {
                                if (i2 >= pointerCount2) {
                                    i = -1;
                                    break;
                                }
                                int pointerId4 = motionEvent.getPointerId(i2);
                                if (pointerId4 != this.f1061d) {
                                    View b2 = mo1523b((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                    View view = this.f1077t;
                                    if (b2 == view && mo1526b(view, pointerId4)) {
                                        i = this.f1061d;
                                        break;
                                    }
                                }
                                i2++;
                            }
                            if (i == -1) {
                                m1525g();
                            }
                        }
                        m1522e(pointerId3);
                        return;
                    } else {
                        return;
                    }
                } else if (this.f1059b == 1) {
                    m1511a(0.0f, 0.0f);
                }
            } else if (this.f1059b == 1) {
                m1525g();
            }
            mo1514a();
            return;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View b3 = mo1523b((int) x4, (int) y4);
        m1518b(x4, y4, pointerId5);
        mo1526b(b3, pointerId5);
        int i8 = this.f1066i[pointerId5];
        int i9 = this.f1074q;
        if ((i8 & i9) != 0) {
            this.f1076s.mo1544b(i8 & i9, pointerId5);
        }
    }

    /* renamed from: a */
    public void mo1517a(View view, int i) {
        if (view.getParent() == this.f1079v) {
            this.f1077t = view;
            this.f1061d = i;
            this.f1076s.mo1540a(view, i);
            mo1529c(1);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        sb.append(this.f1079v);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public boolean mo1518a(int i) {
        int length = this.f1062e.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (mo1519a(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo1519a(int i, int i2) {
        boolean z = false;
        if (!mo1524b(i2)) {
            return false;
        }
        boolean z2 = (i & 1) == 1;
        boolean z3 = (i & 2) == 2;
        float f = this.f1064g[i2] - this.f1062e[i2];
        float f2 = this.f1065h[i2] - this.f1063f[i2];
        if (z2 && z3) {
            float f3 = (f * f) + (f2 * f2);
            int i3 = this.f1060c;
            if (f3 > ((float) (i3 * i3))) {
                z = true;
            }
            return z;
        } else if (z2) {
            if (Math.abs(f) > ((float) this.f1060c)) {
                z = true;
            }
            return z;
        } else {
            if (z3 && Math.abs(f2) > ((float) this.f1060c)) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: a */
    public boolean mo1520a(View view, int i, int i2) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        if (i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom()) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo1521a(boolean z) {
        if (this.f1059b == 2) {
            boolean computeScrollOffset = this.f1075r.computeScrollOffset();
            int currX = this.f1075r.getCurrX();
            int currY = this.f1075r.getCurrY();
            int left = currX - this.f1077t.getLeft();
            int top = currY - this.f1077t.getTop();
            if (left != 0) {
                C0156v.m541a(this.f1077t, left);
            }
            if (top != 0) {
                C0156v.m555b(this.f1077t, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f1076s.mo1541a(this.f1077t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f1075r.getFinalX() && currY == this.f1075r.getFinalY()) {
                this.f1075r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f1079v.post(this.f1080w);
                } else {
                    mo1529c(0);
                }
            }
        }
        return this.f1059b == 2;
    }

    /* renamed from: b */
    public View mo1522b() {
        return this.f1077t;
    }

    /* renamed from: b */
    public View mo1523b(int i, int i2) {
        for (int childCount = this.f1079v.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f1079v;
            this.f1076s.mo1535a(childCount);
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo1524b(int i) {
        return ((1 << i) & this.f1069l) != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1525b(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.mo1514a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f1070m
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f1070m = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f1070m
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0104
            if (r2 == r6) goto L_0x00ff
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x00ff
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0034
        L_0x0031:
            r5 = 0
            goto L_0x0135
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.m1522e(r1)
            goto L_0x0031
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.m1518b(r7, r1, r2)
            int r3 = r0.f1059b
            if (r3 != 0) goto L_0x0060
            int[] r1 = r0.f1066i
            r1 = r1[r2]
            int r3 = r0.f1074q
            r4 = r1 & r3
            if (r4 == 0) goto L_0x0031
            android.support.v4.widget.I$a r4 = r0.f1076s
            r1 = r1 & r3
            r4.mo1544b(r1, r2)
            goto L_0x0031
        L_0x0060:
            if (r3 != r4) goto L_0x0031
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.mo1523b(r3, r1)
            android.view.View r3 = r0.f1077t
            if (r1 != r3) goto L_0x0031
            r0.mo1526b(r1, r2)
            goto L_0x0031
        L_0x0070:
            float[] r2 = r0.f1062e
            if (r2 == 0) goto L_0x0031
            float[] r2 = r0.f1063f
            if (r2 != 0) goto L_0x0079
            goto L_0x0031
        L_0x0079:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007e:
            if (r3 >= r2) goto L_0x00fa
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.m1526g(r4)
            if (r7 != 0) goto L_0x008c
            goto L_0x00f7
        L_0x008c:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f1062e
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f1063f
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.mo1523b(r7, r8)
            if (r7 == 0) goto L_0x00b0
            boolean r8 = r0.m1515a(r7, r9, r10)
            if (r8 == 0) goto L_0x00b0
            r8 = 1
            goto L_0x00b1
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            if (r8 == 0) goto L_0x00e6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            android.support.v4.widget.I$a r14 = r0.f1076s
            int r12 = r14.mo1537a(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            android.support.v4.widget.I$a r5 = r0.f1076s
            int r5 = r5.mo1543b(r7, r15, r14)
            android.support.v4.widget.I$a r14 = r0.f1076s
            int r14 = r14.mo1536a(r7)
            android.support.v4.widget.I$a r15 = r0.f1076s
            int r15 = r15.mo1542b(r7)
            if (r14 == 0) goto L_0x00df
            if (r14 <= 0) goto L_0x00e6
            if (r12 != r11) goto L_0x00e6
        L_0x00df:
            if (r15 == 0) goto L_0x00fa
            if (r15 <= 0) goto L_0x00e6
            if (r5 != r13) goto L_0x00e6
            goto L_0x00fa
        L_0x00e6:
            r0.m1512a(r9, r10, r4)
            int r5 = r0.f1059b
            if (r5 != r6) goto L_0x00ee
            goto L_0x00fa
        L_0x00ee:
            if (r8 == 0) goto L_0x00f7
            boolean r4 = r0.mo1526b(r7, r4)
            if (r4 == 0) goto L_0x00f7
            goto L_0x00fa
        L_0x00f7:
            int r3 = r3 + 1
            goto L_0x007e
        L_0x00fa:
            r16.m1520c(r17)
            goto L_0x0031
        L_0x00ff:
            r16.mo1514a()
            goto L_0x0031
        L_0x0104:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.m1518b(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.mo1523b(r2, r3)
            android.view.View r3 = r0.f1077t
            if (r2 != r3) goto L_0x0125
            int r3 = r0.f1059b
            if (r3 != r4) goto L_0x0125
            r0.mo1526b(r2, r1)
        L_0x0125:
            int[] r2 = r0.f1066i
            r2 = r2[r1]
            int r3 = r0.f1074q
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0135
            android.support.v4.widget.I$a r4 = r0.f1076s
            r2 = r2 & r3
            r4.mo1544b(r2, r1)
        L_0x0135:
            int r1 = r0.f1059b
            if (r1 != r6) goto L_0x013a
            r5 = 1
        L_0x013a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v4.widget.C0351I.mo1525b(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo1526b(View view, int i) {
        if (view == this.f1077t && this.f1061d == i) {
            return true;
        }
        if (view == null || !this.f1076s.mo1546b(view, i)) {
            return false;
        }
        this.f1061d = i;
        mo1517a(view, i);
        return true;
    }

    /* renamed from: b */
    public boolean mo1527b(View view, int i, int i2) {
        this.f1077t = view;
        this.f1061d = -1;
        boolean b = m1519b(i, i2, 0, 0);
        if (!b && this.f1059b == 0 && this.f1077t != null) {
            this.f1077t = null;
        }
        return b;
    }

    /* renamed from: c */
    public int mo1528c() {
        return this.f1073p;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo1529c(int i) {
        this.f1079v.removeCallbacks(this.f1080w);
        if (this.f1059b != i) {
            this.f1059b = i;
            this.f1076s.mo1547c(i);
            if (this.f1059b == 0) {
                this.f1077t = null;
            }
        }
    }

    /* renamed from: c */
    public boolean mo1530c(int i, int i2) {
        return mo1520a(this.f1077t, i, i2);
    }

    /* renamed from: d */
    public int mo1531d() {
        return this.f1060c;
    }

    /* renamed from: d */
    public void mo1532d(int i) {
        this.f1074q = i;
    }

    /* renamed from: d */
    public boolean mo1533d(int i, int i2) {
        if (this.f1078u) {
            return m1519b(i, i2, (int) this.f1070m.getXVelocity(this.f1061d), (int) this.f1070m.getYVelocity(this.f1061d));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* renamed from: e */
    public int mo1534e() {
        return this.f1059b;
    }
}
