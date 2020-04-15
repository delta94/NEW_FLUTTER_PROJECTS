package android.support.p030v7.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import p000a.p005b.p009c.p018g.C0116H;
import p000a.p005b.p009c.p018g.C0156v;
import p000a.p005b.p021d.p022a.C0163a;
import p000a.p005b.p021d.p022a.C0168f;
import p000a.p005b.p021d.p022a.C0169g;
import p000a.p005b.p021d.p022a.C0172j;

/* renamed from: android.support.v7.widget.ActionBarContextView */
public class ActionBarContextView extends C0561a {

    /* renamed from: i */
    private CharSequence f1802i;

    /* renamed from: j */
    private CharSequence f1803j;

    /* renamed from: k */
    private View f1804k;

    /* renamed from: l */
    private View f1805l;

    /* renamed from: m */
    private LinearLayout f1806m;

    /* renamed from: n */
    private TextView f1807n;

    /* renamed from: o */
    private TextView f1808o;

    /* renamed from: p */
    private int f1809p;

    /* renamed from: q */
    private int f1810q;

    /* renamed from: r */
    private boolean f1811r;

    /* renamed from: s */
    private int f1812s;

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0163a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0620va a = C0620va.m2920a(context, attributeSet, C0172j.ActionMode, i, 0);
        C0156v.m547a((View) this, a.mo3258b(C0172j.ActionMode_background));
        this.f1809p = a.mo3267g(C0172j.ActionMode_titleTextStyle, 0);
        this.f1810q = a.mo3267g(C0172j.ActionMode_subtitleTextStyle, 0);
        this.f2194e = a.mo3265f(C0172j.ActionMode_height, 0);
        this.f1812s = a.mo3267g(C0172j.ActionMode_closeItemLayout, C0169g.abc_action_mode_close_item_material);
        a.mo3255a();
    }

    /* renamed from: e */
    private void m2347e() {
        if (this.f1806m == null) {
            LayoutInflater.from(getContext()).inflate(C0169g.abc_action_bar_title_item, this);
            this.f1806m = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1807n = (TextView) this.f1806m.findViewById(C0168f.action_bar_title);
            this.f1808o = (TextView) this.f1806m.findViewById(C0168f.action_bar_subtitle);
            if (this.f1809p != 0) {
                this.f1807n.setTextAppearance(getContext(), this.f1809p);
            }
            if (this.f1810q != 0) {
                this.f1808o.setTextAppearance(getContext(), this.f1810q);
            }
        }
        this.f1807n.setText(this.f1802i);
        this.f1808o.setText(this.f1803j);
        boolean z = !TextUtils.isEmpty(this.f1802i);
        boolean z2 = !TextUtils.isEmpty(this.f1803j);
        int i = 0;
        this.f1808o.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout = this.f1806m;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout.setVisibility(i);
        if (this.f1806m.getParent() == null) {
            addView(this.f1806m);
        }
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ C0116H mo2430a(int i, long j) {
        return super.mo2430a(i, j);
    }

    /* renamed from: a */
    public void mo2431a() {
        if (this.f1804k == null) {
            mo2434c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (r0.getParent() == null) goto L_0x0015;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2432a(p000a.p005b.p021d.p028e.C0192b r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.f1804k
            if (r0 != 0) goto L_0x001b
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.f1812s
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.f1804k = r0
        L_0x0015:
            android.view.View r0 = r3.f1804k
            r3.addView(r0)
            goto L_0x0022
        L_0x001b:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0022
            goto L_0x0015
        L_0x0022:
            android.view.View r0 = r3.f1804k
            int r1 = p000a.p005b.p021d.p022a.C0168f.action_mode_close_button
            android.view.View r0 = r0.findViewById(r1)
            android.support.v7.widget.c r1 = new android.support.v7.widget.c
            r1.<init>(r3, r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.mo706c()
            android.support.v7.view.menu.l r4 = (android.support.p030v7.view.menu.C0468l) r4
            android.support.v7.widget.g r0 = r3.f2193d
            if (r0 == 0) goto L_0x003f
            r0.mo3063c()
        L_0x003f:
            android.support.v7.widget.g r0 = new android.support.v7.widget.g
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f2193d = r0
            android.support.v7.widget.g r0 = r3.f2193d
            r1 = 1
            r0.mo3062c(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            android.support.v7.widget.g r1 = r3.f2193d
            android.content.Context r2 = r3.f2191b
            r4.mo2192a(r1, r2)
            android.support.v7.widget.g r4 = r3.f2193d
            android.support.v7.view.menu.w r4 = r4.mo2148b(r3)
            android.support.v7.widget.ActionMenuView r4 = (android.support.p030v7.widget.ActionMenuView) r4
            r3.f2192c = r4
            android.support.v7.widget.ActionMenuView r4 = r3.f2192c
            r1 = 0
            p000a.p005b.p009c.p018g.C0156v.m547a(r4, r1)
            android.support.v7.widget.ActionMenuView r4 = r3.f2192c
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v7.widget.ActionBarContextView.mo2432a(a.b.d.e.b):void");
    }

    /* renamed from: b */
    public boolean mo2433b() {
        return this.f1811r;
    }

    /* renamed from: c */
    public void mo2434c() {
        removeAllViews();
        this.f1805l = null;
        this.f2192c = null;
    }

    /* renamed from: d */
    public boolean mo2435d() {
        C0577g gVar = this.f2193d;
        if (gVar != null) {
            return gVar.mo3069i();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new MarginLayoutParams(-1, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1803j;
    }

    public CharSequence getTitle() {
        return this.f1802i;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0577g gVar = this.f2193d;
        if (gVar != null) {
            gVar.mo3065e();
            this.f2193d.mo3066f();
        }
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(ActionBarContextView.class.getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f1802i);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        boolean a = C0521Ja.m2525a(this);
        int paddingRight = a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1804k;
        if (view == null || view.getVisibility() == 8) {
            i5 = paddingRight;
        } else {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f1804k.getLayoutParams();
            int i6 = a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int a2 = C0561a.m2747a(paddingRight, i6, a);
            i5 = C0561a.m2747a(a2 + mo3015a(this.f1804k, a2, paddingTop, paddingTop2, a), i7, a);
        }
        LinearLayout linearLayout = this.f1806m;
        if (!(linearLayout == null || this.f1805l != null || linearLayout.getVisibility() == 8)) {
            i5 += mo3015a(this.f1806m, i5, paddingTop, paddingTop2, a);
        }
        int i8 = i5;
        View view2 = this.f1805l;
        if (view2 != null) {
            mo3015a(view2, i8, paddingTop, paddingTop2, a);
        }
        int paddingLeft = a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f2192c;
        if (actionMenuView != null) {
            mo3015a(actionMenuView, paddingLeft, paddingTop, paddingTop2, !a);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        String str = " can only be used ";
        int i3 = 1073741824;
        if (MeasureSpec.getMode(i) != 1073741824) {
            StringBuilder sb = new StringBuilder();
            sb.append(ActionBarContextView.class.getSimpleName());
            sb.append(str);
            sb.append("with android:layout_width=\"match_parent\" (or fill_parent)");
            throw new IllegalStateException(sb.toString());
        } else if (MeasureSpec.getMode(i2) != 0) {
            int size = MeasureSpec.getSize(i);
            int i4 = this.f2194e;
            if (i4 <= 0) {
                i4 = MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingTop;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            View view = this.f1804k;
            if (view != null) {
                int a = mo3014a(view, paddingLeft, makeMeasureSpec, 0);
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f1804k.getLayoutParams();
                paddingLeft = a - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f2192c;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = mo3014a(this.f2192c, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f1806m;
            if (linearLayout != null && this.f1805l == null) {
                if (this.f1811r) {
                    this.f1806m.measure(MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f1806m.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f1806m.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = mo3014a(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f1805l;
            if (view2 != null) {
                LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
                int i7 = layoutParams.width;
                if (i7 >= 0) {
                    paddingLeft = Math.min(i7, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                int i8 = layoutParams.height;
                if (i8 >= 0) {
                    i5 = Math.min(i8, i5);
                }
                this.f1805l.measure(MeasureSpec.makeMeasureSpec(paddingLeft, i6), MeasureSpec.makeMeasureSpec(i5, i3));
            }
            if (this.f2194e <= 0) {
                int childCount = getChildCount();
                int i9 = 0;
                for (int i10 = 0; i10 < childCount; i10++) {
                    int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i9) {
                        i9 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i9);
                return;
            }
            setMeasuredDimension(size, i4);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ActionBarContextView.class.getSimpleName());
            sb2.append(str);
            sb2.append("with android:layout_height=\"wrap_content\"");
            throw new IllegalStateException(sb2.toString());
        }
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setContentHeight(int i) {
        this.f2194e = i;
    }

    public void setCustomView(View view) {
        View view2 = this.f1805l;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1805l = view;
        if (view != null) {
            LinearLayout linearLayout = this.f1806m;
            if (linearLayout != null) {
                removeView(linearLayout);
                this.f1806m = null;
            }
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1803j = charSequence;
        m2347e();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1802i = charSequence;
        m2347e();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f1811r) {
            requestLayout();
        }
        this.f1811r = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
