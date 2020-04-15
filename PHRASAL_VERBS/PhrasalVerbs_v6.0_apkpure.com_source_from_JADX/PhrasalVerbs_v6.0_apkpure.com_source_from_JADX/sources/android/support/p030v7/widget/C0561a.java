package android.support.p030v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import p000a.p005b.p009c.p018g.C0116H;
import p000a.p005b.p009c.p018g.C0118I;
import p000a.p005b.p009c.p018g.C0156v;
import p000a.p005b.p021d.p022a.C0163a;
import p000a.p005b.p021d.p022a.C0172j;

/* renamed from: android.support.v7.widget.a */
abstract class C0561a extends ViewGroup {

    /* renamed from: a */
    protected final C0562a f2190a;

    /* renamed from: b */
    protected final Context f2191b;

    /* renamed from: c */
    protected ActionMenuView f2192c;

    /* renamed from: d */
    protected C0577g f2193d;

    /* renamed from: e */
    protected int f2194e;

    /* renamed from: f */
    protected C0116H f2195f;

    /* renamed from: g */
    private boolean f2196g;

    /* renamed from: h */
    private boolean f2197h;

    /* renamed from: android.support.v7.widget.a$a */
    protected class C0562a implements C0118I {

        /* renamed from: a */
        private boolean f2198a = false;

        /* renamed from: b */
        int f2199b;

        protected C0562a() {
        }

        /* renamed from: a */
        public C0562a mo3017a(C0116H h, int i) {
            C0561a.this.f2195f = h;
            this.f2199b = i;
            return this;
        }

        /* renamed from: a */
        public void mo407a(View view) {
            this.f2198a = true;
        }

        /* renamed from: b */
        public void mo408b(View view) {
            if (!this.f2198a) {
                C0561a aVar = C0561a.this;
                aVar.f2195f = null;
                C0561a.super.setVisibility(this.f2199b);
            }
        }

        /* renamed from: c */
        public void mo409c(View view) {
            C0561a.super.setVisibility(0);
            this.f2198a = false;
        }
    }

    C0561a(Context context) {
        this(context, null);
    }

    C0561a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    C0561a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2190a = new C0562a();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(C0163a.actionBarPopupTheme, typedValue, true)) {
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f2191b = new ContextThemeWrapper(context, i2);
                return;
            }
        }
        this.f2191b = context;
    }

    /* renamed from: a */
    protected static int m2747a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo3014a(View view, int i, int i2, int i3) {
        view.measure(MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo3015a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: a */
    public C0116H mo2430a(int i, long j) {
        C0116H h = this.f2195f;
        if (h != null) {
            h.mo402a();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C0116H a = C0156v.m537a(this);
            a.mo397a(1.0f);
            a.mo398a(j);
            C0562a aVar = this.f2190a;
            aVar.mo3017a(a, i);
            a.mo399a((C0118I) aVar);
            return a;
        }
        C0116H a2 = C0156v.m537a(this);
        a2.mo397a(0.0f);
        a2.mo398a(j);
        C0562a aVar2 = this.f2190a;
        aVar2.mo3017a(a2, i);
        a2.mo399a((C0118I) aVar2);
        return a2;
    }

    public int getAnimatedVisibility() {
        return this.f2195f != null ? this.f2190a.f2199b : getVisibility();
    }

    public int getContentHeight() {
        return this.f2194e;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C0172j.ActionBar, C0163a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C0172j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        C0577g gVar = this.f2193d;
        if (gVar != null) {
            gVar.mo3058a(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2197h = false;
        }
        if (!this.f2197h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f2197h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f2197h = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2196g = false;
        }
        if (!this.f2196g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f2196g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f2196g = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C0116H h = this.f2195f;
            if (h != null) {
                h.mo402a();
            }
            super.setVisibility(i);
        }
    }
}
