package android.support.p030v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.p030v7.view.menu.C0468l.C0470b;
import android.support.p030v7.view.menu.C0487w.C0488a;
import android.support.p030v7.widget.ActionMenuView.C0496a;
import android.support.p030v7.widget.C0509Da;
import android.support.p030v7.widget.C0518I;
import android.support.p030v7.widget.C0531P;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import p000a.p005b.p021d.p022a.C0172j;

/* renamed from: android.support.v7.view.menu.ActionMenuItemView */
public class ActionMenuItemView extends C0518I implements C0488a, OnClickListener, C0496a {

    /* renamed from: d */
    C0474p f1552d;

    /* renamed from: e */
    private CharSequence f1553e;

    /* renamed from: f */
    private Drawable f1554f;

    /* renamed from: g */
    C0470b f1555g;

    /* renamed from: h */
    private C0531P f1556h;

    /* renamed from: i */
    C0450b f1557i;

    /* renamed from: j */
    private boolean f1558j;

    /* renamed from: k */
    private boolean f1559k;

    /* renamed from: l */
    private int f1560l;

    /* renamed from: m */
    private int f1561m;

    /* renamed from: n */
    private int f1562n;

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView$a */
    private class C0449a extends C0531P {
        public C0449a() {
            super(ActionMenuItemView.this);
        }

        /* renamed from: a */
        public C0491z mo2036a() {
            C0450b bVar = ActionMenuItemView.this.f1557i;
            if (bVar != null) {
                return bVar.mo2038a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public boolean mo2037b() {
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0470b bVar = actionMenuItemView.f1555g;
            if (bVar == null || !bVar.mo2091a(actionMenuItemView.f1552d)) {
                return false;
            }
            C0491z a = mo2036a();
            return a != null && a.mo2052b();
        }
    }

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView$b */
    public static abstract class C0450b {
        /* renamed from: a */
        public abstract C0491z mo2038a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f1558j = m2076e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0172j.ActionMenuItemView, i, 0);
        this.f1560l = obtainStyledAttributes.getDimensionPixelSize(C0172j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f1562n = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1561m = -1;
        setSaveEnabled(false);
    }

    /* renamed from: e */
    private boolean m2076e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: f */
    private void m2077f() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1553e);
        if (this.f1554f != null && (!this.f1552d.mo2287n() || (!this.f1558j && !this.f1559k))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.f1553e : null);
        CharSequence contentDescription = this.f1552d.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z3 ? null : this.f1552d.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f1552d.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence = this.f1552d.getTitle();
            }
            C0509Da.m2457a(this, charSequence);
            return;
        }
        C0509Da.m2457a(this, tooltipText);
    }

    /* renamed from: a */
    public void mo2017a(C0474p pVar, int i) {
        this.f1552d = pVar;
        setIcon(pVar.getIcon());
        setTitle(pVar.mo2250a((C0488a) this));
        setId(pVar.getItemId());
        setVisibility(pVar.isVisible() ? 0 : 8);
        setEnabled(pVar.isEnabled());
        if (pVar.hasSubMenu() && this.f1556h == null) {
            this.f1556h = new C0449a();
        }
    }

    /* renamed from: a */
    public boolean mo2018a() {
        return mo2021d();
    }

    /* renamed from: b */
    public boolean mo2019b() {
        return mo2021d() && this.f1552d.getIcon() == null;
    }

    /* renamed from: c */
    public boolean mo2020c() {
        return true;
    }

    /* renamed from: d */
    public boolean mo2021d() {
        return !TextUtils.isEmpty(getText());
    }

    public C0474p getItemData() {
        return this.f1552d;
    }

    public void onClick(View view) {
        C0470b bVar = this.f1555g;
        if (bVar != null) {
            bVar.mo2091a(this.f1552d);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1558j = m2076e();
        m2077f();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean d = mo2021d();
        if (d) {
            int i3 = this.f1561m;
            if (i3 >= 0) {
                super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
            }
        }
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f1560l) : this.f1560l;
        if (mode != 1073741824 && this.f1560l > 0 && measuredWidth < min) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!d && this.f1554f != null) {
            super.setPadding((getMeasuredWidth() - this.f1554f.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f1552d.hasSubMenu()) {
            C0531P p = this.f1556h;
            if (p != null && p.onTouch(this, motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f1559k != z) {
            this.f1559k = z;
            C0474p pVar = this.f1552d;
            if (pVar != null) {
                pVar.mo2254b();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1554f = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f1562n;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            int i2 = this.f1562n;
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i2) / ((float) intrinsicHeight)));
                intrinsicHeight = i2;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        m2077f();
    }

    public void setItemInvoker(C0470b bVar) {
        this.f1555g = bVar;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f1561m = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C0450b bVar) {
        this.f1557i = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1553e = charSequence;
        m2077f();
    }
}
