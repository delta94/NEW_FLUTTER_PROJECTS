package android.support.p030v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p000a.p005b.p021d.p022a.C0172j;

/* renamed from: android.support.v7.widget.ViewStubCompat */
public final class ViewStubCompat extends View {

    /* renamed from: a */
    private int f2168a;

    /* renamed from: b */
    private int f2169b;

    /* renamed from: c */
    private WeakReference<View> f2170c;

    /* renamed from: d */
    private LayoutInflater f2171d;

    /* renamed from: e */
    private C0555a f2172e;

    /* renamed from: android.support.v7.widget.ViewStubCompat$a */
    public interface C0555a {
        /* renamed from: a */
        void mo2955a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2168a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0172j.ViewStubCompat, i, 0);
        this.f2169b = obtainStyledAttributes.getResourceId(C0172j.ViewStubCompat_android_inflatedId, -1);
        this.f2168a = obtainStyledAttributes.getResourceId(C0172j.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(C0172j.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* renamed from: a */
    public View mo2943a() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f2168a != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f2171d;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f2168a, viewGroup, false);
            int i = this.f2169b;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f2170c = new WeakReference<>(inflate);
            C0555a aVar = this.f2172e;
            if (aVar != null) {
                aVar.mo2955a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f2169b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f2171d;
    }

    public int getLayoutResource() {
        return this.f2168a;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f2169b = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f2171d = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f2168a = i;
    }

    public void setOnInflateListener(C0555a aVar) {
        this.f2172e = aVar;
    }

    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f2170c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo2943a();
        }
    }
}
