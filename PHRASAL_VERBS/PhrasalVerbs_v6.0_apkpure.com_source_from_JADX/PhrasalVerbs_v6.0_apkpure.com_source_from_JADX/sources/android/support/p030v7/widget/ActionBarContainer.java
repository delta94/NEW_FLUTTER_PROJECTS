package android.support.p030v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import p000a.p005b.p009c.p018g.C0156v;
import p000a.p005b.p021d.p022a.C0168f;
import p000a.p005b.p021d.p022a.C0172j;

/* renamed from: android.support.v7.widget.ActionBarContainer */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a */
    private boolean f1792a;

    /* renamed from: b */
    private View f1793b;

    /* renamed from: c */
    private View f1794c;

    /* renamed from: d */
    private View f1795d;

    /* renamed from: e */
    Drawable f1796e;

    /* renamed from: f */
    Drawable f1797f;

    /* renamed from: g */
    Drawable f1798g;

    /* renamed from: h */
    boolean f1799h;

    /* renamed from: i */
    boolean f1800i;

    /* renamed from: j */
    private int f1801j;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0156v.m547a((View) this, (Drawable) new C0567b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0172j.ActionBar);
        this.f1796e = obtainStyledAttributes.getDrawable(C0172j.ActionBar_background);
        this.f1797f = obtainStyledAttributes.getDrawable(C0172j.ActionBar_backgroundStacked);
        this.f1801j = obtainStyledAttributes.getDimensionPixelSize(C0172j.ActionBar_height, -1);
        if (getId() == C0168f.split_action_bar) {
            this.f1799h = true;
            this.f1798g = obtainStyledAttributes.getDrawable(C0172j.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        boolean z = false;
        if (!this.f1799h ? this.f1796e == null && this.f1797f == null : this.f1798g == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    private int m2345a(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    private boolean m2346b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1796e;
        if (drawable != null && drawable.isStateful()) {
            this.f1796e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1797f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1797f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1798g;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f1798g.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f1793b;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1796e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1797f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1798g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1794c = findViewById(C0168f.action_bar);
        this.f1795d = findViewById(C0168f.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1792a || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z, i, i2, i3, i4);
        View view2 = this.f1793b;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (!(view2 == null || view2.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            LayoutParams layoutParams = (LayoutParams) view2.getLayoutParams();
            view2.layout(i, (measuredHeight - view2.getMeasuredHeight()) - layoutParams.bottomMargin, i3, measuredHeight - layoutParams.bottomMargin);
        }
        if (this.f1799h) {
            Drawable drawable2 = this.f1798g;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f1796e != null) {
                if (this.f1794c.getVisibility() == 0) {
                    drawable = this.f1796e;
                    left = this.f1794c.getLeft();
                    top = this.f1794c.getTop();
                    right = this.f1794c.getRight();
                    view = this.f1794c;
                } else {
                    View view3 = this.f1795d;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f1796e.setBounds(0, 0, 0, 0);
                        z3 = true;
                    } else {
                        drawable = this.f1796e;
                        left = this.f1795d.getLeft();
                        top = this.f1795d.getTop();
                        right = this.f1795d.getRight();
                        view = this.f1795d;
                    }
                }
                drawable.setBounds(left, top, right, view.getBottom());
                z3 = true;
            }
            this.f1800i = z4;
            if (z4) {
                Drawable drawable3 = this.f1797f;
                if (drawable3 != null) {
                    drawable3.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                }
            }
            z2 = z3;
        }
        if (z2) {
            invalidate();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f1794c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x001c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L_0x001c
            int r0 = r3.f1801j
            if (r0 < 0) goto L_0x001c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L_0x001c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f1794c
            if (r4 != 0) goto L_0x0024
            return
        L_0x0024:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f1793b
            if (r0 == 0) goto L_0x006f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x006f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L_0x006f
            android.view.View r0 = r3.f1794c
            boolean r0 = r3.m2346b(r0)
            if (r0 != 0) goto L_0x0047
            android.view.View r0 = r3.f1794c
        L_0x0042:
            int r0 = r3.m2345a(r0)
            goto L_0x0053
        L_0x0047:
            android.view.View r0 = r3.f1795d
            boolean r0 = r3.m2346b(r0)
            if (r0 != 0) goto L_0x0052
            android.view.View r0 = r3.f1795d
            goto L_0x0042
        L_0x0052:
            r0 = 0
        L_0x0053:
            if (r4 != r1) goto L_0x005a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L_0x005d
        L_0x005a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x005d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f1793b
            int r1 = r3.m2345a(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v7.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1796e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1796e);
        }
        this.f1796e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1794c;
            if (view != null) {
                this.f1796e.setBounds(view.getLeft(), this.f1794c.getTop(), this.f1794c.getRight(), this.f1794c.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1799h ? !(this.f1796e == null && this.f1797f == null) : this.f1798g != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2 = this.f1798g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1798g);
        }
        this.f1798g = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1799h) {
                Drawable drawable3 = this.f1798g;
                if (drawable3 != null) {
                    drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                }
            }
        }
        if (!this.f1799h ? this.f1796e == null && this.f1797f == null : this.f1798g == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f1797f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1797f);
        }
        this.f1797f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1800i) {
                Drawable drawable3 = this.f1797f;
                if (drawable3 != null) {
                    drawable3.setBounds(this.f1793b.getLeft(), this.f1793b.getTop(), this.f1793b.getRight(), this.f1793b.getBottom());
                }
            }
        }
        boolean z = true;
        if (!this.f1799h ? !(this.f1796e == null && this.f1797f == null) : this.f1798g != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setTabContainer(C0563aa aaVar) {
        View view = this.f1793b;
        if (view != null) {
            removeView(view);
        }
        this.f1793b = aaVar;
        if (aaVar != null) {
            addView(aaVar);
            ViewGroup.LayoutParams layoutParams = aaVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            aaVar.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f1792a = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f1796e;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f1797f;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f1798g;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f1796e && !this.f1799h) || (drawable == this.f1797f && this.f1800i) || ((drawable == this.f1798g && this.f1799h) || super.verifyDrawable(drawable));
    }
}
