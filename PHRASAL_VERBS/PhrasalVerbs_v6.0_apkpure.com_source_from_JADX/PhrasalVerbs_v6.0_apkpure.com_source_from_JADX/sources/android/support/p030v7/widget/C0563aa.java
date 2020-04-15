package android.support.p030v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.p030v7.app.C0411a.C0414c;
import android.support.p030v7.widget.C0534Q.C0535a;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Spinner;
import android.widget.TextView;
import p000a.p005b.p021d.p022a.C0163a;
import p000a.p005b.p021d.p028e.C0191a;

/* renamed from: android.support.v7.widget.aa */
public class C0563aa extends HorizontalScrollView implements OnItemSelectedListener {

    /* renamed from: a */
    private static final Interpolator f2201a = new DecelerateInterpolator();

    /* renamed from: b */
    Runnable f2202b;

    /* renamed from: c */
    private C0565b f2203c;

    /* renamed from: d */
    C0534Q f2204d;

    /* renamed from: e */
    private Spinner f2205e;

    /* renamed from: f */
    private boolean f2206f;

    /* renamed from: g */
    int f2207g;

    /* renamed from: h */
    int f2208h;

    /* renamed from: i */
    private int f2209i;

    /* renamed from: j */
    private int f2210j;

    /* renamed from: android.support.v7.widget.aa$a */
    private class C0564a extends BaseAdapter {
        C0564a() {
        }

        public int getCount() {
            return C0563aa.this.f2204d.getChildCount();
        }

        public Object getItem(int i) {
            return ((C0566c) C0563aa.this.f2204d.getChildAt(i)).mo3034a();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C0563aa.this.mo3018a((C0414c) getItem(i), true);
            }
            ((C0566c) view).mo3035a((C0414c) getItem(i));
            return view;
        }
    }

    /* renamed from: android.support.v7.widget.aa$b */
    private class C0565b implements OnClickListener {
        C0565b() {
        }

        public void onClick(View view) {
            ((C0566c) view).mo3034a().mo1900e();
            int childCount = C0563aa.this.f2204d.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C0563aa.this.f2204d.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* renamed from: android.support.v7.widget.aa$c */
    private class C0566c extends LinearLayout {

        /* renamed from: a */
        private final int[] f2213a = {16842964};

        /* renamed from: b */
        private C0414c f2214b;

        /* renamed from: c */
        private TextView f2215c;

        /* renamed from: d */
        private ImageView f2216d;

        /* renamed from: e */
        private View f2217e;

        public C0566c(Context context, C0414c cVar, boolean z) {
            super(context, null, C0163a.actionBarTabStyle);
            this.f2214b = cVar;
            C0620va a = C0620va.m2920a(context, null, this.f2213a, C0163a.actionBarTabStyle, 0);
            if (a.mo3268g(0)) {
                setBackgroundDrawable(a.mo3258b(0));
            }
            a.mo3255a();
            if (z) {
                setGravity(8388627);
            }
            mo3036b();
        }

        /* renamed from: a */
        public C0414c mo3034a() {
            return this.f2214b;
        }

        /* renamed from: a */
        public void mo3035a(C0414c cVar) {
            this.f2214b = cVar;
            mo3036b();
        }

        /* renamed from: b */
        public void mo3036b() {
            C0414c cVar = this.f2214b;
            View b = cVar.mo1897b();
            CharSequence charSequence = null;
            if (b != null) {
                ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b);
                    }
                    addView(b);
                }
                this.f2217e = b;
                TextView textView = this.f2215c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f2216d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f2216d.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f2217e;
            if (view != null) {
                removeView(view);
                this.f2217e = null;
            }
            Drawable c = cVar.mo1898c();
            CharSequence d = cVar.mo1899d();
            if (c != null) {
                if (this.f2216d == null) {
                    C0615t tVar = new C0615t(getContext());
                    LayoutParams layoutParams = new LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    tVar.setLayoutParams(layoutParams);
                    addView(tVar, 0);
                    this.f2216d = tVar;
                }
                this.f2216d.setImageDrawable(c);
                this.f2216d.setVisibility(0);
            } else {
                ImageView imageView2 = this.f2216d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f2216d.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(d);
            if (z) {
                if (this.f2215c == null) {
                    C0518I i = new C0518I(getContext(), null, C0163a.actionBarTabTextStyle);
                    i.setEllipsize(TruncateAt.END);
                    LayoutParams layoutParams2 = new LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    i.setLayoutParams(layoutParams2);
                    addView(i);
                    this.f2215c = i;
                }
                this.f2215c.setText(d);
                this.f2215c.setVisibility(0);
            } else {
                TextView textView2 = this.f2215c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f2215c.setText(null);
                }
            }
            ImageView imageView3 = this.f2216d;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.mo1896a());
            }
            if (!z) {
                charSequence = cVar.mo1896a();
            }
            C0509Da.m2457a(this, charSequence);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(C0414c.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(C0414c.class.getName());
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (C0563aa.this.f2207g > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = C0563aa.this.f2207g;
                if (measuredWidth > i3) {
                    super.onMeasure(MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* renamed from: a */
    private Spinner m2757a() {
        C0503C c = new C0503C(getContext(), null, C0163a.actionDropDownStyle);
        c.setLayoutParams(new C0535a(-2, -1));
        c.setOnItemSelectedListener(this);
        return c;
    }

    /* renamed from: b */
    private boolean m2758b() {
        Spinner spinner = this.f2205e;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: c */
    private void m2759c() {
        if (!m2758b()) {
            if (this.f2205e == null) {
                this.f2205e = m2757a();
            }
            removeView(this.f2204d);
            addView(this.f2205e, new ViewGroup.LayoutParams(-2, -1));
            if (this.f2205e.getAdapter() == null) {
                this.f2205e.setAdapter(new C0564a());
            }
            Runnable runnable = this.f2202b;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f2202b = null;
            }
            this.f2205e.setSelection(this.f2210j);
        }
    }

    /* renamed from: d */
    private boolean m2760d() {
        if (!m2758b()) {
            return false;
        }
        removeView(this.f2205e);
        addView(this.f2204d, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f2205e.getSelectedItemPosition());
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0566c mo3018a(C0414c cVar, boolean z) {
        C0566c cVar2 = new C0566c(getContext(), cVar, z);
        if (z) {
            cVar2.setBackgroundDrawable(null);
            cVar2.setLayoutParams(new AbsListView.LayoutParams(-1, this.f2209i));
        } else {
            cVar2.setFocusable(true);
            if (this.f2203c == null) {
                this.f2203c = new C0565b();
            }
            cVar2.setOnClickListener(this.f2203c);
        }
        return cVar2;
    }

    /* renamed from: a */
    public void mo3019a(int i) {
        View childAt = this.f2204d.getChildAt(i);
        Runnable runnable = this.f2202b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.f2202b = new C0560Z(this, childAt);
        post(this.f2202b);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f2202b;
        if (runnable != null) {
            post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0191a a = C0191a.m682a(getContext());
        setContentHeight(a.mo694e());
        this.f2208h = a.mo693d();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f2202b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0566c) view).mo3034a().mo1900e();
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int mode = MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f2204d.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i3 = -1;
        } else {
            if (childCount > 2) {
                this.f2207g = (int) (((float) MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.f2207g = MeasureSpec.getSize(i) / 2;
            }
            i3 = Math.min(this.f2207g, this.f2208h);
        }
        this.f2207g = i3;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f2209i, 1073741824);
        if (z2 || !this.f2206f) {
            z = false;
        }
        if (z) {
            this.f2204d.measure(0, makeMeasureSpec);
            if (this.f2204d.getMeasuredWidth() > MeasureSpec.getSize(i)) {
                m2759c();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z2 && measuredWidth != measuredWidth2) {
                    setTabSelected(this.f2210j);
                    return;
                }
            }
        }
        m2760d();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z2) {
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f2206f = z;
    }

    public void setContentHeight(int i) {
        this.f2209i = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f2210j = i;
        int childCount = this.f2204d.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f2204d.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                mo3019a(i);
            }
            i2++;
        }
        Spinner spinner = this.f2205e;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }
}
