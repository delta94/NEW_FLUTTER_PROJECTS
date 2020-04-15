package android.support.p030v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import p000a.p005b.p009c.p018g.C0156v;
import p000a.p005b.p021d.p022a.C0168f;
import p000a.p005b.p021d.p022a.C0172j;

/* renamed from: android.support.v7.widget.ButtonBarLayout */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a */
    private boolean f1866a;

    /* renamed from: b */
    private int f1867b = -1;

    /* renamed from: c */
    private int f1868c = 0;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0172j.ButtonBarLayout);
        this.f1866a = obtainStyledAttributes.getBoolean(C0172j.ButtonBarLayout_allowStacking, true);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private int m2409a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    private boolean m2410a() {
        return getOrientation() == 1;
    }

    private void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 5 : 80);
        View findViewById = findViewById(C0168f.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    public int getMinimumHeight() {
        return Math.max(this.f1868c, super.getMinimumHeight());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int size = MeasureSpec.getSize(i);
        int i4 = 0;
        if (this.f1866a) {
            if (size > this.f1867b && m2410a()) {
                setStacked(false);
            }
            this.f1867b = size;
        }
        if (m2410a() || MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.f1866a && !m2410a()) {
            if ((getMeasuredWidthAndState() & -16777216) == 16777216) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int a = m2409a(0);
        if (a >= 0) {
            View childAt = getChildAt(a);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (m2410a()) {
                int a2 = m2409a(a + 1);
                if (a2 >= 0) {
                    paddingTop += getChildAt(a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i4 = paddingTop;
            } else {
                i4 = paddingTop + getPaddingBottom();
            }
        }
        if (C0156v.m567h(this) != i4) {
            setMinimumHeight(i4);
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f1866a != z) {
            this.f1866a = z;
            if (!this.f1866a && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
