package android.support.p029v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.ListView;
import p000a.p005b.p009c.p010a.C0039a;
import p000a.p005b.p009c.p018g.C0146l;
import p000a.p005b.p009c.p018g.C0147m;
import p000a.p005b.p009c.p018g.C0149o;
import p000a.p005b.p009c.p018g.C0150p;
import p000a.p005b.p009c.p018g.C0156v;

/* renamed from: android.support.v4.widget.C */
public class C0342C extends ViewGroup implements C0149o, C0146l {

    /* renamed from: a */
    private static final String f1009a = "C";

    /* renamed from: b */
    private static final int[] f1010b = {16842766};

    /* renamed from: A */
    protected int f1011A;

    /* renamed from: B */
    int f1012B;

    /* renamed from: C */
    int f1013C;

    /* renamed from: D */
    C0364f f1014D;

    /* renamed from: E */
    private Animation f1015E;

    /* renamed from: F */
    private Animation f1016F;

    /* renamed from: G */
    private Animation f1017G;

    /* renamed from: H */
    private Animation f1018H;

    /* renamed from: I */
    private Animation f1019I;

    /* renamed from: J */
    boolean f1020J;

    /* renamed from: K */
    private int f1021K;

    /* renamed from: L */
    boolean f1022L;

    /* renamed from: M */
    private C0343a f1023M;

    /* renamed from: N */
    private AnimationListener f1024N;

    /* renamed from: O */
    private final Animation f1025O;

    /* renamed from: P */
    private final Animation f1026P;

    /* renamed from: c */
    private View f1027c;

    /* renamed from: d */
    C0344b f1028d;

    /* renamed from: e */
    boolean f1029e;

    /* renamed from: f */
    private int f1030f;

    /* renamed from: g */
    private float f1031g;

    /* renamed from: h */
    private float f1032h;

    /* renamed from: i */
    private final C0150p f1033i;

    /* renamed from: j */
    private final C0147m f1034j;

    /* renamed from: k */
    private final int[] f1035k;

    /* renamed from: l */
    private final int[] f1036l;

    /* renamed from: m */
    private boolean f1037m;

    /* renamed from: n */
    private int f1038n;

    /* renamed from: o */
    int f1039o;

    /* renamed from: p */
    private float f1040p;

    /* renamed from: q */
    private float f1041q;

    /* renamed from: r */
    private boolean f1042r;

    /* renamed from: s */
    private int f1043s;

    /* renamed from: t */
    boolean f1044t;

    /* renamed from: u */
    private boolean f1045u;

    /* renamed from: v */
    private final DecelerateInterpolator f1046v;

    /* renamed from: w */
    C0360c f1047w;

    /* renamed from: x */
    private int f1048x;

    /* renamed from: y */
    protected int f1049y;

    /* renamed from: z */
    float f1050z;

    /* renamed from: android.support.v4.widget.C$a */
    public interface C0343a {
        /* renamed from: a */
        boolean mo1500a(C0342C c, View view);
    }

    /* renamed from: android.support.v4.widget.C$b */
    public interface C0344b {
        /* renamed from: a */
        void mo1501a();
    }

    public C0342C(Context context) {
        this(context, null);
    }

    public C0342C(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1029e = false;
        this.f1031g = -1.0f;
        this.f1035k = new int[2];
        this.f1036l = new int[2];
        this.f1043s = -1;
        this.f1048x = -1;
        this.f1024N = new C0389u(this);
        this.f1025O = new C0394z(this);
        this.f1026P = new C0340A(this);
        this.f1030f = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f1038n = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f1046v = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f1021K = (int) (displayMetrics.density * 40.0f);
        m1475c();
        setChildrenDrawingOrderEnabled(true);
        this.f1012B = (int) (displayMetrics.density * 64.0f);
        this.f1031g = (float) this.f1012B;
        this.f1033i = new C0150p(this);
        this.f1034j = new C0147m(this);
        setNestedScrollingEnabled(true);
        int i = -this.f1021K;
        this.f1039o = i;
        this.f1011A = i;
        mo1463a(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1010b);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private Animation m1467a(int i, int i2) {
        C0392x xVar = new C0392x(this, i, i2);
        xVar.setDuration(300);
        this.f1047w.mo1640a(null);
        this.f1047w.clearAnimation();
        this.f1047w.startAnimation(xVar);
        return xVar;
    }

    /* renamed from: a */
    private void m1468a(int i, AnimationListener animationListener) {
        this.f1049y = i;
        this.f1025O.reset();
        this.f1025O.setDuration(200);
        this.f1025O.setInterpolator(this.f1046v);
        if (animationListener != null) {
            this.f1047w.mo1640a(animationListener);
        }
        this.f1047w.clearAnimation();
        this.f1047w.startAnimation(this.f1025O);
    }

    /* renamed from: a */
    private void m1469a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1043s) {
            this.f1043s = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    /* renamed from: a */
    private void m1470a(boolean z, boolean z2) {
        if (this.f1029e != z) {
            this.f1020J = z2;
            m1478d();
            this.f1029e = z;
            if (this.f1029e) {
                m1468a(this.f1039o, this.f1024N);
            } else {
                mo1464a(this.f1024N);
            }
        }
    }

    /* renamed from: a */
    private boolean m1471a(Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    /* renamed from: b */
    private void m1472b(float f) {
        if (f > this.f1031g) {
            m1470a(true, true);
            return;
        }
        this.f1029e = false;
        this.f1014D.mo1653a(0.0f, 0.0f);
        C0393y yVar = null;
        if (!this.f1044t) {
            yVar = new C0393y(this);
        }
        m1473b(this.f1039o, yVar);
        this.f1014D.mo1657a(false);
    }

    /* renamed from: b */
    private void m1473b(int i, AnimationListener animationListener) {
        if (this.f1044t) {
            m1477c(i, animationListener);
            return;
        }
        this.f1049y = i;
        this.f1026P.reset();
        this.f1026P.setDuration(200);
        this.f1026P.setInterpolator(this.f1046v);
        if (animationListener != null) {
            this.f1047w.mo1640a(animationListener);
        }
        this.f1047w.clearAnimation();
        this.f1047w.startAnimation(this.f1026P);
    }

    /* renamed from: b */
    private void m1474b(AnimationListener animationListener) {
        this.f1047w.setVisibility(0);
        this.f1014D.setAlpha(255);
        this.f1015E = new C0390v(this);
        this.f1015E.setDuration((long) this.f1038n);
        if (animationListener != null) {
            this.f1047w.mo1640a(animationListener);
        }
        this.f1047w.clearAnimation();
        this.f1047w.startAnimation(this.f1015E);
    }

    /* renamed from: c */
    private void m1475c() {
        this.f1047w = new C0360c(getContext(), -328966);
        this.f1014D = new C0364f(getContext());
        this.f1014D.mo1656a(1);
        this.f1047w.setImageDrawable(this.f1014D);
        this.f1047w.setVisibility(8);
        addView(this.f1047w);
    }

    /* renamed from: c */
    private void m1476c(float f) {
        this.f1014D.mo1657a(true);
        float min = Math.min(1.0f, Math.abs(f / this.f1031g));
        double d = (double) min;
        Double.isNaN(d);
        float max = (((float) Math.max(d - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f1031g;
        int i = this.f1013C;
        if (i <= 0) {
            i = this.f1022L ? this.f1012B - this.f1011A : this.f1012B;
        }
        float f2 = (float) i;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2) / 4.0f);
        double pow = Math.pow(max2, 2.0d);
        Double.isNaN(max2);
        float f3 = ((float) (max2 - pow)) * 2.0f;
        int i2 = this.f1011A + ((int) ((f2 * min) + (f2 * f3 * 2.0f)));
        if (this.f1047w.getVisibility() != 0) {
            this.f1047w.setVisibility(0);
        }
        if (!this.f1044t) {
            this.f1047w.setScaleX(1.0f);
            this.f1047w.setScaleY(1.0f);
        }
        if (this.f1044t) {
            setAnimationProgress(Math.min(1.0f, f / this.f1031g));
        }
        if (f < this.f1031g) {
            if (this.f1014D.getAlpha() > 76 && !m1471a(this.f1017G)) {
                m1481f();
            }
        } else if (this.f1014D.getAlpha() < 255 && !m1471a(this.f1018H)) {
            m1480e();
        }
        this.f1014D.mo1653a(0.0f, Math.min(0.8f, max * 0.8f));
        this.f1014D.mo1652a(Math.min(1.0f, max));
        this.f1014D.mo1659b((((max * 0.4f) - 16.0f) + (f3 * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i2 - this.f1039o);
    }

    /* renamed from: c */
    private void m1477c(int i, AnimationListener animationListener) {
        this.f1049y = i;
        this.f1050z = this.f1047w.getScaleX();
        this.f1019I = new C0341B(this);
        this.f1019I.setDuration(150);
        if (animationListener != null) {
            this.f1047w.mo1640a(animationListener);
        }
        this.f1047w.clearAnimation();
        this.f1047w.startAnimation(this.f1019I);
    }

    /* renamed from: d */
    private void m1478d() {
        if (this.f1027c == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f1047w)) {
                    this.f1027c = childAt;
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    private void m1479d(float f) {
        float f2 = this.f1041q;
        float f3 = f - f2;
        int i = this.f1030f;
        if (f3 > ((float) i) && !this.f1042r) {
            this.f1040p = f2 + ((float) i);
            this.f1042r = true;
            this.f1014D.setAlpha(76);
        }
    }

    /* renamed from: e */
    private void m1480e() {
        this.f1018H = m1467a(this.f1014D.getAlpha(), 255);
    }

    /* renamed from: f */
    private void m1481f() {
        this.f1017G = m1467a(this.f1014D.getAlpha(), 76);
    }

    private void setColorViewAlpha(int i) {
        this.f1047w.getBackground().setAlpha(i);
        this.f1014D.setAlpha(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1463a(float f) {
        int i = this.f1049y;
        setTargetOffsetTopAndBottom((i + ((int) (((float) (this.f1011A - i)) * f))) - this.f1047w.getTop());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1464a(AnimationListener animationListener) {
        this.f1016F = new C0391w(this);
        this.f1016F.setDuration(150);
        this.f1047w.mo1640a(animationListener);
        this.f1047w.clearAnimation();
        this.f1047w.startAnimation(this.f1016F);
    }

    /* renamed from: a */
    public void mo1465a(boolean z, int i, int i2) {
        this.f1044t = z;
        this.f1011A = i;
        this.f1012B = i2;
        this.f1022L = true;
        mo1467b();
        this.f1029e = false;
    }

    /* renamed from: a */
    public boolean mo1466a() {
        C0343a aVar = this.f1023M;
        if (aVar != null) {
            return aVar.mo1500a(this, this.f1027c);
        }
        View view = this.f1027c;
        return view instanceof ListView ? C0385q.m1777a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1467b() {
        this.f1047w.clearAnimation();
        this.f1014D.stop();
        this.f1047w.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f1044t) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f1011A - this.f1039o);
        }
        this.f1039o = this.f1047w.getTop();
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f1034j.mo507a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f1034j.mo506a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f1034j.mo512a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f1034j.mo510a(i, i2, i3, i4, iArr);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f1048x;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        if (i2 >= i3) {
            i2++;
        }
        return i2;
    }

    public int getNestedScrollAxes() {
        return this.f1033i.mo530a();
    }

    public int getProgressCircleDiameter() {
        return this.f1021K;
    }

    public int getProgressViewEndOffset() {
        return this.f1012B;
    }

    public int getProgressViewStartOffset() {
        return this.f1011A;
    }

    public boolean hasNestedScrollingParent() {
        return this.f1034j.mo505a();
    }

    public boolean isNestedScrollingEnabled() {
        return this.f1034j.mo514b();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1467b();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m1478d();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f1045u && actionMasked == 0) {
            this.f1045u = false;
        }
        if (!isEnabled() || this.f1045u || mo1466a() || this.f1029e || this.f1037m) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.f1043s;
                    if (i == -1) {
                        Log.e(f1009a, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    m1479d(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        m1469a(motionEvent);
                    }
                }
            }
            this.f1042r = false;
            this.f1043s = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f1011A - this.f1047w.getTop());
            this.f1043s = motionEvent.getPointerId(0);
            this.f1042r = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f1043s);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f1041q = motionEvent.getY(findPointerIndex2);
        }
        return this.f1042r;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f1027c == null) {
                m1478d();
            }
            View view = this.f1027c;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.f1047w.getMeasuredWidth();
                int measuredHeight2 = this.f1047w.getMeasuredHeight();
                C0360c cVar = this.f1047w;
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                int i7 = i5 - i6;
                int i8 = this.f1039o;
                cVar.layout(i7, i8, i5 + i6, measuredHeight2 + i8);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1027c == null) {
            m1478d();
        }
        View view = this.f1027c;
        if (view != null) {
            view.measure(MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.f1047w.measure(MeasureSpec.makeMeasureSpec(this.f1021K, 1073741824), MeasureSpec.makeMeasureSpec(this.f1021K, 1073741824));
            this.f1048x = -1;
            int i3 = 0;
            while (true) {
                if (i3 >= getChildCount()) {
                    break;
                } else if (getChildAt(i3) == this.f1047w) {
                    this.f1048x = i3;
                    break;
                } else {
                    i3++;
                }
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f1032h;
            if (f > 0.0f) {
                float f2 = (float) i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.f1032h = 0.0f;
                } else {
                    this.f1032h = f - f2;
                    iArr[1] = i2;
                }
                m1476c(this.f1032h);
            }
        }
        if (this.f1022L && i2 > 0 && this.f1032h == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.f1047w.setVisibility(8);
        }
        int[] iArr2 = this.f1035k;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f1036l);
        int i5 = i4 + this.f1036l[1];
        if (i5 < 0 && !mo1466a()) {
            this.f1032h += (float) Math.abs(i5);
            m1476c(this.f1032h);
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1033i.mo533a(view, view2, i);
        startNestedScroll(i & 2);
        this.f1032h = 0.0f;
        this.f1037m = true;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return isEnabled() && !this.f1045u && !this.f1029e && (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.f1033i.mo531a(view);
        this.f1037m = false;
        float f = this.f1032h;
        if (f > 0.0f) {
            m1472b(f);
            this.f1032h = 0.0f;
        }
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f1045u && actionMasked == 0) {
            this.f1045u = false;
        }
        if (!isEnabled() || this.f1045u || mo1466a() || this.f1029e || this.f1037m) {
            return false;
        }
        if (actionMasked == 0) {
            this.f1043s = motionEvent.getPointerId(0);
            this.f1042r = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f1043s);
            if (findPointerIndex < 0) {
                Log.e(f1009a, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.f1042r) {
                float y = (motionEvent.getY(findPointerIndex) - this.f1040p) * 0.5f;
                this.f1042r = false;
                m1472b(y);
            }
            this.f1043s = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f1043s);
            if (findPointerIndex2 < 0) {
                Log.e(f1009a, "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y2 = motionEvent.getY(findPointerIndex2);
            m1479d(y2);
            if (this.f1042r) {
                float f = (y2 - this.f1040p) * 0.5f;
                if (f <= 0.0f) {
                    return false;
                }
                m1476c(f);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e(f1009a, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.f1043s = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m1469a(motionEvent);
            }
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (VERSION.SDK_INT >= 21 || !(this.f1027c instanceof AbsListView)) {
            View view = this.f1027c;
            if (view == null || C0156v.m578s(view)) {
                super.requestDisallowInterceptTouchEvent(z);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void setAnimationProgress(float f) {
        this.f1047w.setScaleX(f);
        this.f1047w.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        m1478d();
        this.f1014D.mo1658a(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C0039a.m105a(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f1031g = (float) i;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            mo1467b();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f1034j.mo504a(z);
    }

    public void setOnChildScrollUpCallback(C0343a aVar) {
        this.f1023M = aVar;
    }

    public void setOnRefreshListener(C0344b bVar) {
        this.f1028d = bVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f1047w.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C0039a.m105a(getContext(), i));
    }

    public void setRefreshing(boolean z) {
        if (!z || this.f1029e == z) {
            m1470a(z, false);
            return;
        }
        this.f1029e = z;
        setTargetOffsetTopAndBottom((!this.f1022L ? this.f1012B + this.f1011A : this.f1012B) - this.f1039o);
        this.f1020J = false;
        m1474b(this.f1024N);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            this.f1021K = (int) (getResources().getDisplayMetrics().density * (i == 0 ? 56.0f : 40.0f));
            this.f1047w.setImageDrawable(null);
            this.f1014D.mo1656a(i);
            this.f1047w.setImageDrawable(this.f1014D);
        }
    }

    public void setSlingshotDistance(int i) {
        this.f1013C = i;
    }

    /* access modifiers changed from: 0000 */
    public void setTargetOffsetTopAndBottom(int i) {
        this.f1047w.bringToFront();
        C0156v.m555b((View) this.f1047w, i);
        this.f1039o = this.f1047w.getTop();
    }

    public boolean startNestedScroll(int i) {
        return this.f1034j.mo515b(i);
    }

    public void stopNestedScroll() {
        this.f1034j.mo516c();
    }
}
