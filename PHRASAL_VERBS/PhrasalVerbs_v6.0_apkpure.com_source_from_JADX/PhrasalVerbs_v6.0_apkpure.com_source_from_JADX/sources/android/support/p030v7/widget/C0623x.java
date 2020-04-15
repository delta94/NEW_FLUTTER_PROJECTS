package android.support.p030v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p029v4.widget.C0347E;
import android.util.AttributeSet;
import android.widget.RadioButton;
import p000a.p005b.p021d.p022a.C0163a;
import p000a.p005b.p021d.p023b.p024a.C0173a;

/* renamed from: android.support.v7.widget.x */
public class C0623x extends RadioButton implements C0347E {

    /* renamed from: a */
    private final C0597n f2403a;

    /* renamed from: b */
    private final C0516H f2404b;

    public C0623x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0163a.radioButtonStyle);
    }

    public C0623x(Context context, AttributeSet attributeSet, int i) {
        super(C0614sa.m2913a(context), attributeSet, i);
        this.f2403a = new C0597n(this);
        this.f2403a.mo3131a(attributeSet, i);
        this.f2404b = new C0516H(this);
        this.f2404b.mo2637a(attributeSet, i);
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0597n nVar = this.f2403a;
        return nVar != null ? nVar.mo3127a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportButtonTintList() {
        C0597n nVar = this.f2403a;
        if (nVar != null) {
            return nVar.mo3132b();
        }
        return null;
    }

    public Mode getSupportButtonTintMode() {
        C0597n nVar = this.f2403a;
        if (nVar != null) {
            return nVar.mo3133c();
        }
        return null;
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C0173a.m597b(getContext(), i));
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0597n nVar = this.f2403a;
        if (nVar != null) {
            nVar.mo3134d();
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0597n nVar = this.f2403a;
        if (nVar != null) {
            nVar.mo3129a(colorStateList);
        }
    }

    public void setSupportButtonTintMode(Mode mode) {
        C0597n nVar = this.f2403a;
        if (nVar != null) {
            nVar.mo3130a(mode);
        }
    }
}
