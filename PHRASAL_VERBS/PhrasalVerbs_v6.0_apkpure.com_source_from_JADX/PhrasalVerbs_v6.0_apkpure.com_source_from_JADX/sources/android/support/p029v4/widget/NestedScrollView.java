package android.support.p029v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.OverScroller;
import android.widget.ScrollView;
import java.util.ArrayList;
import p000a.p005b.p009c.p018g.C0134d;
import p000a.p005b.p009c.p018g.C0145k;
import p000a.p005b.p009c.p018g.C0147m;
import p000a.p005b.p009c.p018g.C0148n;
import p000a.p005b.p009c.p018g.C0150p;
import p000a.p005b.p009c.p018g.C0153s;
import p000a.p005b.p009c.p018g.C0156v;
import p000a.p005b.p009c.p018g.p019a.C0123a;
import p000a.p005b.p009c.p018g.p019a.C0127c;

/* renamed from: android.support.v4.widget.NestedScrollView */
public class NestedScrollView extends FrameLayout implements C0148n, C0145k, C0153s {

    /* renamed from: a */
    private static final C0353a f1081a = new C0353a();

    /* renamed from: b */
    private static final int[] f1082b = {16843130};

    /* renamed from: A */
    private float f1083A;

    /* renamed from: B */
    private C0354b f1084B;

    /* renamed from: c */
    private long f1085c;

    /* renamed from: d */
    private final Rect f1086d;

    /* renamed from: e */
    private OverScroller f1087e;

    /* renamed from: f */
    private EdgeEffect f1088f;

    /* renamed from: g */
    private EdgeEffect f1089g;

    /* renamed from: h */
    private int f1090h;

    /* renamed from: i */
    private boolean f1091i;

    /* renamed from: j */
    private boolean f1092j;

    /* renamed from: k */
    private View f1093k;

    /* renamed from: l */
    private boolean f1094l;

    /* renamed from: m */
    private VelocityTracker f1095m;

    /* renamed from: n */
    private boolean f1096n;

    /* renamed from: o */
    private boolean f1097o;

    /* renamed from: p */
    private int f1098p;

    /* renamed from: q */
    private int f1099q;

    /* renamed from: r */
    private int f1100r;

    /* renamed from: s */
    private int f1101s;

    /* renamed from: t */
    private final int[] f1102t;

    /* renamed from: u */
    private final int[] f1103u;

    /* renamed from: v */
    private int f1104v;

    /* renamed from: w */
    private int f1105w;

    /* renamed from: x */
    private C0355c f1106x;

    /* renamed from: y */
    private final C0150p f1107y;

    /* renamed from: z */
    private final C0147m f1108z;

    /* renamed from: android.support.v4.widget.NestedScrollView$a */
    static class C0353a extends C0134d {
        C0353a() {
        }

        /* renamed from: a */
        public void mo376a(View view, C0123a aVar) {
            super.mo376a(view, aVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            aVar.mo423a((CharSequence) ScrollView.class.getName());
            if (nestedScrollView.isEnabled()) {
                int scrollRange = nestedScrollView.getScrollRange();
                if (scrollRange > 0) {
                    aVar.mo447g(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        aVar.mo420a(8192);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        aVar.mo420a(4096);
                    }
                }
            }
        }

        /* renamed from: a */
        public boolean mo377a(View view, int i, Bundle bundle) {
            if (super.mo377a(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i == 4096) {
                int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (min == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.mo1560b(0, min);
                return true;
            } else if (i != 8192) {
                return false;
            } else {
                int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.mo1560b(0, max);
                return true;
            }
        }

        /* renamed from: b */
        public void mo378b(View view, AccessibilityEvent accessibilityEvent) {
            super.mo378b(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C0127c.m452a(accessibilityEvent, nestedScrollView.getScrollX());
            C0127c.m453b(accessibilityEvent, nestedScrollView.getScrollRange());
        }
    }

    /* renamed from: android.support.v4.widget.NestedScrollView$b */
    public interface C0354b {
        /* renamed from: a */
        void mo1609a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    /* renamed from: android.support.v4.widget.NestedScrollView$c */
    static class C0355c extends BaseSavedState {
        public static final Creator<C0355c> CREATOR = new C0386r();

        /* renamed from: a */
        public int f1109a;

        C0355c(Parcel parcel) {
            super(parcel);
            this.f1109a = parcel.readInt();
        }

        C0355c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HorizontalScrollView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" scrollPosition=");
            sb.append(this.f1109a);
            sb.append("}");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1109a);
        }
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1086d = new Rect();
        this.f1091i = true;
        this.f1092j = false;
        this.f1093k = null;
        this.f1094l = false;
        this.f1097o = true;
        this.f1101s = -1;
        this.f1102t = new int[2];
        this.f1103u = new int[2];
        m1575e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1082b, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f1107y = new C0150p(this);
        this.f1108z = new C0147m(this);
        setNestedScrollingEnabled(true);
        C0156v.m543a((View) this, (C0134d) f1081a);
    }

    /* renamed from: a */
    private static int m1561a(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    /* renamed from: a */
    private View m1562a(boolean z, int i, int i2) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else if (!z4) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    /* renamed from: a */
    private void m1563a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1101s) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1090h = (int) motionEvent.getY(i);
            this.f1101s = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f1095m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: a */
    private boolean m1564a() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* renamed from: a */
    private boolean m1565a(Rect rect, boolean z) {
        int a = mo1548a(rect);
        boolean z2 = a != 0;
        if (z2) {
            if (z) {
                scrollBy(0, a);
            } else {
                mo1549a(0, a);
            }
        }
        return z2;
    }

    /* renamed from: a */
    private boolean m1566a(View view) {
        return !m1567a(view, 0, getHeight());
    }

    /* renamed from: a */
    private boolean m1567a(View view, int i, int i2) {
        view.getDrawingRect(this.f1086d);
        offsetDescendantRectToMyCoords(view, this.f1086d);
        return this.f1086d.bottom + i >= getScrollY() && this.f1086d.top - i <= getScrollY() + i2;
    }

    /* renamed from: a */
    private static boolean m1568a(View view, View view2) {
        boolean z = true;
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !m1568a((View) parent, view2)) {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    private void m1569b() {
        this.f1094l = false;
        m1577g();
        mo1578f(0);
        EdgeEffect edgeEffect = this.f1088f;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f1089g.onRelease();
        }
    }

    /* renamed from: b */
    private void m1570b(View view) {
        view.getDrawingRect(this.f1086d);
        offsetDescendantRectToMyCoords(view, this.f1086d);
        int a = mo1548a(this.f1086d);
        if (a != 0) {
            scrollBy(0, a);
        }
    }

    /* renamed from: b */
    private boolean m1571b(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View a = m1562a(z2, i2, i3);
        if (a == null) {
            a = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m1578g(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (a != findFocus()) {
            a.requestFocus(i);
        }
        return z;
    }

    /* renamed from: c */
    private void m1572c() {
        if (getOverScrollMode() == 2) {
            this.f1088f = null;
            this.f1089g = null;
        } else if (this.f1088f == null) {
            Context context = getContext();
            this.f1088f = new EdgeEffect(context);
            this.f1089g = new EdgeEffect(context);
        }
    }

    /* renamed from: d */
    private void m1573d() {
        VelocityTracker velocityTracker = this.f1095m;
        if (velocityTracker == null) {
            this.f1095m = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: d */
    private boolean m1574d(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
    }

    /* renamed from: e */
    private void m1575e() {
        this.f1087e = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1098p = viewConfiguration.getScaledTouchSlop();
        this.f1099q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1100r = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: f */
    private void m1576f() {
        if (this.f1095m == null) {
            this.f1095m = VelocityTracker.obtain();
        }
    }

    /* renamed from: g */
    private void m1577g() {
        VelocityTracker velocityTracker = this.f1095m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1095m = null;
        }
    }

    /* renamed from: g */
    private void m1578g(int i) {
        if (i == 0) {
            return;
        }
        if (this.f1097o) {
            mo1549a(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f1083A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f1083A = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f1083A;
    }

    /* renamed from: h */
    private void m1579h(int i) {
        int scrollY = getScrollY();
        boolean z = (scrollY > 0 || i > 0) && (scrollY < getScrollRange() || i < 0);
        float f = (float) i;
        if (!dispatchNestedPreFling(0.0f, f)) {
            dispatchNestedFling(0.0f, f, z);
            mo1559b(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo1548a(Rect rect) {
        int i = 0;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        int i3 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i2 - verticalFadingEdgeLength : i2;
        if (rect.bottom > i3 && rect.top > scrollY) {
            i = Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i3) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i2);
        } else if (rect.top < scrollY && rect.bottom < i3) {
            i = Math.max(rect.height() > height ? 0 - (i3 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
        return i;
    }

    /* renamed from: a */
    public final void mo1549a(int i, int i2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f1085c > 250) {
                View childAt = getChildAt(0);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int scrollY = getScrollY();
                int max = Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY;
                this.f1105w = getScrollY();
                this.f1087e.startScroll(getScrollX(), scrollY, 0, max);
                C0156v.m579t(this);
            } else {
                if (!this.f1087e.isFinished()) {
                    this.f1087e.abortAnimation();
                }
                scrollBy(i, i2);
            }
            this.f1085c = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: a */
    public void mo518a(View view, int i) {
        this.f1107y.mo532a(view, i);
        mo1578f(i);
    }

    /* renamed from: a */
    public void mo519a(View view, int i, int i2, int i3, int i4, int i5) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        mo1552a(0, scrollY2, 0, i4 - scrollY2, (int[]) null, i5);
    }

    /* renamed from: a */
    public void mo520a(View view, int i, int i2, int[] iArr, int i3) {
        mo1553a(i, i2, iArr, (int[]) null, i3);
    }

    /* renamed from: a */
    public boolean mo1550a(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m1567a(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m1578g(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f1086d);
            offsetDescendantRectToMyCoords(findNextFocus, this.f1086d);
            m1578g(mo1548a(this.f1086d));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && m1566a(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0083 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1551a(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x002a
            if (r1 != r5) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 0
            goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x0034
            if (r1 != r5) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r1 = 0
            goto L_0x0035
        L_0x0034:
            r1 = 1
        L_0x0035:
            int r3 = r15 + r13
            if (r2 != 0) goto L_0x003b
            r2 = 0
            goto L_0x003d
        L_0x003b:
            r2 = r19
        L_0x003d:
            int r6 = r16 + r14
            if (r1 != 0) goto L_0x0043
            r1 = 0
            goto L_0x0045
        L_0x0043:
            r1 = r20
        L_0x0045:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L_0x0050
            r7 = r2
        L_0x004e:
            r2 = 1
            goto L_0x0055
        L_0x0050:
            if (r3 >= r7) goto L_0x0053
            goto L_0x004e
        L_0x0053:
            r7 = r3
            r2 = 0
        L_0x0055:
            if (r6 <= r1) goto L_0x005a
            r6 = r1
        L_0x0058:
            r1 = 1
            goto L_0x005f
        L_0x005a:
            if (r6 >= r8) goto L_0x005e
            r6 = r8
            goto L_0x0058
        L_0x005e:
            r1 = 0
        L_0x005f:
            if (r1 == 0) goto L_0x007e
            boolean r3 = r12.mo1570d(r5)
            if (r3 != 0) goto L_0x007e
            android.widget.OverScroller r3 = r0.f1087e
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r3
            r14 = r7
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L_0x007e:
            r12.onOverScrolled(r7, r6, r2, r1)
            if (r2 != 0) goto L_0x0085
            if (r1 == 0) goto L_0x0086
        L_0x0085:
            r4 = 1
        L_0x0086:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v4.widget.NestedScrollView.mo1551a(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    /* renamed from: a */
    public boolean mo1552a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.f1108z.mo511a(i, i2, i3, i4, iArr, i5);
    }

    /* renamed from: a */
    public boolean mo1553a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f1108z.mo513a(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: a */
    public boolean mo1554a(KeyEvent keyEvent) {
        this.f1086d.setEmpty();
        boolean z = false;
        int i = 130;
        if (!m1564a()) {
            if (isFocused() && keyEvent.getKeyCode() != 4) {
                View findFocus = findFocus();
                if (findFocus == this) {
                    findFocus = null;
                }
                View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
                if (!(findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130))) {
                    z = true;
                }
            }
            return z;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                z = !keyEvent.isAltPressed() ? mo1550a(33) : mo1561c(33);
            } else if (keyCode == 20) {
                z = !keyEvent.isAltPressed() ? mo1550a(130) : mo1561c(130);
            } else if (keyCode == 62) {
                if (keyEvent.isShiftPressed()) {
                    i = 33;
                }
                mo1577e(i);
            }
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo521a(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public void mo1559b(int i) {
        if (getChildCount() > 0) {
            mo1562c(2, 1);
            this.f1087e.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f1105w = getScrollY();
            C0156v.m579t(this);
        }
    }

    /* renamed from: b */
    public final void mo1560b(int i, int i2) {
        mo1549a(i - getScrollX(), i2 - getScrollY());
    }

    /* renamed from: b */
    public void mo522b(View view, View view2, int i, int i2) {
        this.f1107y.mo534a(view, view2, i, i2);
        mo1562c(2, i2);
    }

    /* renamed from: c */
    public boolean mo1561c(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f1086d;
        rect.top = 0;
        rect.bottom = height;
        if (z) {
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                this.f1086d.bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect2 = this.f1086d;
                rect2.top = rect2.bottom - height;
            }
        }
        Rect rect3 = this.f1086d;
        return m1571b(i, rect3.top, rect3.bottom);
    }

    /* renamed from: c */
    public boolean mo1562c(int i, int i2) {
        return this.f1108z.mo509a(i, i2);
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (this.f1087e.computeScrollOffset()) {
            this.f1087e.getCurrX();
            int currY = this.f1087e.getCurrY();
            int i = currY - this.f1105w;
            if (mo1553a(0, i, this.f1103u, (int[]) null, 1)) {
                i -= this.f1103u[1];
            }
            int i2 = i;
            if (i2 != 0) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i3 = scrollY;
                mo1551a(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - i3;
                if (!mo1552a(0, scrollY2, 0, i2 - scrollY2, (int[]) null, 1)) {
                    int overScrollMode = getOverScrollMode();
                    if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                        m1572c();
                        if (currY <= 0 && i3 > 0) {
                            edgeEffect = this.f1088f;
                        } else if (currY >= scrollRange && i3 < scrollRange) {
                            edgeEffect = this.f1089g;
                        }
                        edgeEffect.onAbsorb((int) this.f1087e.getCurrVelocity());
                    }
                }
            }
            this.f1105w = currY;
            C0156v.m579t(this);
            return;
        }
        if (mo1570d(1)) {
            mo1578f(1);
        }
        this.f1105w = 0;
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (getChildCount() == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            bottom -= scrollY;
        } else if (scrollY > max) {
            bottom += scrollY - max;
        }
        return bottom;
    }

    /* renamed from: d */
    public boolean mo1570d(int i) {
        return this.f1108z.mo508a(i);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo1554a(keyEvent);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f1108z.mo507a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f1108z.mo506a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return mo1553a(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return mo1552a(i, i2, i3, i4, iArr, 0);
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f1088f != null) {
            int scrollY = getScrollY();
            int i2 = 0;
            if (!this.f1088f.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = getPaddingLeft() + 0;
                } else {
                    i = 0;
                }
                if (VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i, (float) min);
                this.f1088f.setSize(width, height);
                if (this.f1088f.draw(canvas)) {
                    C0156v.m579t(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f1089g.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                if (VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i2 = 0 + getPaddingLeft();
                }
                if (VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i2 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f1089g.setSize(width2, height2);
                if (this.f1089g.draw(canvas)) {
                    C0156v.m579t(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    /* renamed from: e */
    public boolean mo1577e(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f1086d.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f1086d;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f1086d.top = getScrollY() - height;
            Rect rect2 = this.f1086d;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f1086d;
        int i2 = rect3.top;
        rect3.bottom = height + i2;
        return m1571b(i, i2, rect3.bottom);
    }

    /* renamed from: f */
    public void mo1578f(int i) {
        this.f1108z.mo517c(i);
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.f1107y.mo530a();
    }

    /* access modifiers changed from: 0000 */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public boolean hasNestedScrollingParent() {
        return mo1570d(0);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f1108z.mo514b();
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i, int i2) {
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1092j = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f1094l) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i = scrollY - verticalScrollFactorCompat;
                if (i < 0) {
                    i = 0;
                } else if (i > scrollRange) {
                    i = scrollRange;
                }
                if (i != scrollY) {
                    super.scrollTo(getScrollX(), i);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f1094l) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f1101s;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid pointerId=");
                            sb.append(i2);
                            sb.append(" in onInterceptTouchEvent");
                            Log.e("NestedScrollView", sb.toString());
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f1090h) > this.f1098p && (2 & getNestedScrollAxes()) == 0) {
                                this.f1094l = true;
                                this.f1090h = y;
                                m1576f();
                                this.f1095m.addMovement(motionEvent);
                                this.f1104v = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        m1563a(motionEvent);
                    }
                }
            }
            this.f1094l = false;
            this.f1101s = -1;
            m1577g();
            if (this.f1087e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                C0156v.m579t(this);
            }
            mo1578f(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (!m1574d((int) motionEvent.getX(), y2)) {
                this.f1094l = false;
                m1577g();
            } else {
                this.f1090h = y2;
                this.f1101s = motionEvent.getPointerId(0);
                m1573d();
                this.f1095m.addMovement(motionEvent);
                this.f1087e.computeScrollOffset();
                this.f1094l = !this.f1087e.isFinished();
                mo1562c(2, 0);
            }
        }
        return this.f1094l;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f1091i = false;
        View view = this.f1093k;
        if (view != null && m1568a(view, (View) this)) {
            m1570b(this.f1093k);
        }
        this.f1093k = null;
        if (!this.f1092j) {
            if (this.f1106x != null) {
                scrollTo(getScrollX(), this.f1106x.f1109a);
                this.f1106x = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int a = m1561a(scrollY, paddingTop, i5);
            if (a != scrollY) {
                scrollTo(getScrollX(), a);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1092j = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1096n && MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        m1579h((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo520a(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo519a(view, i, i2, i3, i4, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo522b(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (findNextFocus != null && !m1566a(findNextFocus)) {
            return findNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0355c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0355c cVar = (C0355c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.f1106x = cVar;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0355c cVar = new C0355c(super.onSaveInstanceState());
        cVar.f1109a = getScrollY();
        return cVar;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C0354b bVar = this.f1084B;
        if (bVar != null) {
            bVar.mo1609a(this, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m1567a(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f1086d);
            offsetDescendantRectToMyCoords(findFocus, this.f1086d);
            m1578g(mo1548a(this.f1086d));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo521a(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo518a(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        if (r10.f1087e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0218, code lost:
        if (r10.f1087e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            r23 = this;
            r10 = r23
            r11 = r24
            r23.m1576f()
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r24)
            int r0 = r24.getActionMasked()
            r13 = 0
            if (r0 != 0) goto L_0x0014
            r10.f1104v = r13
        L_0x0014:
            int r1 = r10.f1104v
            float r1 = (float) r1
            r14 = 0
            r12.offsetLocation(r14, r1)
            r1 = 2
            r15 = 1
            if (r0 == 0) goto L_0x021c
            r2 = -1
            if (r0 == r15) goto L_0x01e4
            if (r0 == r1) goto L_0x007f
            r1 = 3
            if (r0 == r1) goto L_0x0054
            r1 = 5
            if (r0 == r1) goto L_0x0041
            r1 = 6
            if (r0 == r1) goto L_0x002f
            goto L_0x0254
        L_0x002f:
            r23.m1563a(r24)
            int r0 = r10.f1101s
            int r0 = r11.findPointerIndex(r0)
            float r0 = r11.getY(r0)
            int r0 = (int) r0
            r10.f1090h = r0
            goto L_0x0254
        L_0x0041:
            int r0 = r24.getActionIndex()
            float r1 = r11.getY(r0)
            int r1 = (int) r1
            r10.f1090h = r1
            int r0 = r11.getPointerId(r0)
            r10.f1101s = r0
            goto L_0x0254
        L_0x0054:
            boolean r0 = r10.f1094l
            if (r0 == 0) goto L_0x0078
            int r0 = r23.getChildCount()
            if (r0 <= 0) goto L_0x0078
            android.widget.OverScroller r3 = r10.f1087e
            int r4 = r23.getScrollX()
            int r5 = r23.getScrollY()
            r6 = 0
            r7 = 0
            r8 = 0
            int r9 = r23.getScrollRange()
            boolean r0 = r3.springBack(r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x0078
        L_0x0075:
            p000a.p005b.p009c.p018g.C0156v.m579t(r23)
        L_0x0078:
            r10.f1101s = r2
            r23.m1569b()
            goto L_0x0254
        L_0x007f:
            int r0 = r10.f1101s
            int r9 = r11.findPointerIndex(r0)
            if (r9 != r2) goto L_0x00a6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r0.append(r1)
            int r1 = r10.f1101s
            r0.append(r1)
            java.lang.String r1 = " in onTouchEvent"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NestedScrollView"
            android.util.Log.e(r1, r0)
            goto L_0x0254
        L_0x00a6:
            float r0 = r11.getY(r9)
            int r6 = (int) r0
            int r0 = r10.f1090h
            int r7 = r0 - r6
            r1 = 0
            int[] r3 = r10.f1103u
            int[] r4 = r10.f1102t
            r5 = 0
            r0 = r23
            r2 = r7
            boolean r0 = r0.mo1553a(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00d4
            int[] r0 = r10.f1103u
            r0 = r0[r15]
            int r7 = r7 - r0
            int[] r0 = r10.f1102t
            r0 = r0[r15]
            float r0 = (float) r0
            r12.offsetLocation(r14, r0)
            int r0 = r10.f1104v
            int[] r1 = r10.f1102t
            r1 = r1[r15]
            int r0 = r0 + r1
            r10.f1104v = r0
        L_0x00d4:
            boolean r0 = r10.f1094l
            if (r0 != 0) goto L_0x00f4
            int r0 = java.lang.Math.abs(r7)
            int r1 = r10.f1098p
            if (r0 <= r1) goto L_0x00f4
            android.view.ViewParent r0 = r23.getParent()
            if (r0 == 0) goto L_0x00e9
            r0.requestDisallowInterceptTouchEvent(r15)
        L_0x00e9:
            r10.f1094l = r15
            if (r7 <= 0) goto L_0x00f1
            int r0 = r10.f1098p
            int r7 = r7 - r0
            goto L_0x00f4
        L_0x00f1:
            int r0 = r10.f1098p
            int r7 = r7 + r0
        L_0x00f4:
            r8 = r7
            boolean r0 = r10.f1094l
            if (r0 == 0) goto L_0x0254
            int[] r0 = r10.f1102t
            r0 = r0[r15]
            int r6 = r6 - r0
            r10.f1090h = r6
            int r16 = r23.getScrollY()
            int r7 = r23.getScrollRange()
            int r0 = r23.getOverScrollMode()
            if (r0 == 0) goto L_0x0116
            if (r0 != r15) goto L_0x0113
            if (r7 <= 0) goto L_0x0113
            goto L_0x0116
        L_0x0113:
            r17 = 0
            goto L_0x0118
        L_0x0116:
            r17 = 1
        L_0x0118:
            r1 = 0
            r3 = 0
            int r4 = r23.getScrollY()
            r5 = 0
            r18 = 0
            r19 = 0
            r20 = 1
            r0 = r23
            r2 = r8
            r6 = r7
            r21 = r7
            r7 = r18
            r14 = r8
            r8 = r19
            r22 = r9
            r9 = r20
            boolean r0 = r0.mo1551a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x0145
            boolean r0 = r10.mo1570d(r13)
            if (r0 != 0) goto L_0x0145
            android.view.VelocityTracker r0 = r10.f1095m
            r0.clear()
        L_0x0145:
            int r0 = r23.getScrollY()
            int r2 = r0 - r16
            int r4 = r14 - r2
            r1 = 0
            r3 = 0
            int[] r5 = r10.f1102t
            r6 = 0
            r0 = r23
            boolean r0 = r0.mo1552a(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0175
            int r0 = r10.f1090h
            int[] r1 = r10.f1102t
            r2 = r1[r15]
            int r0 = r0 - r2
            r10.f1090h = r0
            r0 = r1[r15]
            float r0 = (float) r0
            r1 = 0
            r12.offsetLocation(r1, r0)
            int r0 = r10.f1104v
            int[] r1 = r10.f1102t
            r1 = r1[r15]
            int r0 = r0 + r1
            r10.f1104v = r0
            goto L_0x0254
        L_0x0175:
            if (r17 == 0) goto L_0x0254
            r23.m1572c()
            int r0 = r16 + r14
            if (r0 >= 0) goto L_0x01a4
            android.widget.EdgeEffect r0 = r10.f1088f
            float r1 = (float) r14
            int r2 = r23.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            r2 = r22
            float r2 = r11.getX(r2)
            int r3 = r23.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            android.support.p029v4.widget.C0382n.m1769a(r0, r1, r2)
            android.widget.EdgeEffect r0 = r10.f1089g
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01ce
            android.widget.EdgeEffect r0 = r10.f1089g
        L_0x01a0:
            r0.onRelease()
            goto L_0x01ce
        L_0x01a4:
            r1 = r21
            r2 = r22
            if (r0 <= r1) goto L_0x01ce
            android.widget.EdgeEffect r0 = r10.f1089g
            float r1 = (float) r14
            int r3 = r23.getHeight()
            float r3 = (float) r3
            float r1 = r1 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r11.getX(r2)
            int r4 = r23.getWidth()
            float r4 = (float) r4
            float r2 = r2 / r4
            float r3 = r3 - r2
            android.support.p029v4.widget.C0382n.m1769a(r0, r1, r3)
            android.widget.EdgeEffect r0 = r10.f1088f
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01ce
            android.widget.EdgeEffect r0 = r10.f1088f
            goto L_0x01a0
        L_0x01ce:
            android.widget.EdgeEffect r0 = r10.f1088f
            if (r0 == 0) goto L_0x0254
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x01e0
            android.widget.EdgeEffect r0 = r10.f1089g
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0254
        L_0x01e0:
            p000a.p005b.p009c.p018g.C0156v.m579t(r23)
            goto L_0x0254
        L_0x01e4:
            android.view.VelocityTracker r0 = r10.f1095m
            r1 = 1000(0x3e8, float:1.401E-42)
            int r3 = r10.f1100r
            float r3 = (float) r3
            r0.computeCurrentVelocity(r1, r3)
            int r1 = r10.f1101s
            float r0 = r0.getYVelocity(r1)
            int r0 = (int) r0
            int r1 = java.lang.Math.abs(r0)
            int r3 = r10.f1099q
            if (r1 <= r3) goto L_0x0203
            int r0 = -r0
            r10.m1579h(r0)
            goto L_0x0078
        L_0x0203:
            android.widget.OverScroller r3 = r10.f1087e
            int r4 = r23.getScrollX()
            int r5 = r23.getScrollY()
            r6 = 0
            r7 = 0
            r8 = 0
            int r9 = r23.getScrollRange()
            boolean r0 = r3.springBack(r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x0078
            goto L_0x0075
        L_0x021c:
            int r0 = r23.getChildCount()
            if (r0 != 0) goto L_0x0223
            return r13
        L_0x0223:
            android.widget.OverScroller r0 = r10.f1087e
            boolean r0 = r0.isFinished()
            r0 = r0 ^ r15
            r10.f1094l = r0
            if (r0 == 0) goto L_0x0237
            android.view.ViewParent r0 = r23.getParent()
            if (r0 == 0) goto L_0x0237
            r0.requestDisallowInterceptTouchEvent(r15)
        L_0x0237:
            android.widget.OverScroller r0 = r10.f1087e
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0244
            android.widget.OverScroller r0 = r10.f1087e
            r0.abortAnimation()
        L_0x0244:
            float r0 = r24.getY()
            int r0 = (int) r0
            r10.f1090h = r0
            int r0 = r11.getPointerId(r13)
            r10.f1101s = r0
            r10.mo1562c(r1, r13)
        L_0x0254:
            android.view.VelocityTracker r0 = r10.f1095m
            if (r0 == 0) goto L_0x025b
            r0.addMovement(r12)
        L_0x025b:
            r12.recycle()
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v4.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f1091i) {
            m1570b(view2);
        } else {
            this.f1093k = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m1565a(rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m1577g();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.f1091i = true;
        super.requestLayout();
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int width = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int a = m1561a(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), width);
            int a2 = m1561a(i2, height, height2);
            if (a != getScrollX() || a2 != getScrollY()) {
                super.scrollTo(a, a2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f1096n) {
            this.f1096n = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f1108z.mo504a(z);
    }

    public void setOnScrollChangeListener(C0354b bVar) {
        this.f1084B = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f1097o = z;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i) {
        return mo1562c(i, 0);
    }

    public void stopNestedScroll() {
        mo1578f(0);
    }
}
