package android.support.p030v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p029v4.widget.C0345D;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import p000a.p005b.p009c.p018g.C0154t;
import p000a.p005b.p021d.p022a.C0163a;
import p000a.p005b.p021d.p023b.p024a.C0173a;

/* renamed from: android.support.v7.widget.i */
public class C0587i extends AutoCompleteTextView implements C0154t {

    /* renamed from: a */
    private static final int[] f2263a = {16843126};

    /* renamed from: b */
    private final C0589j f2264b;

    /* renamed from: c */
    private final C0516H f2265c;

    public C0587i(Context context) {
        this(context, null);
    }

    public C0587i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0163a.autoCompleteTextViewStyle);
    }

    public C0587i(Context context, AttributeSet attributeSet, int i) {
        super(C0614sa.m2913a(context), attributeSet, i);
        C0620va a = C0620va.m2920a(getContext(), attributeSet, f2263a, i, 0);
        if (a.mo3268g(0)) {
            setDropDownBackgroundDrawable(a.mo3258b(0));
        }
        a.mo3255a();
        this.f2264b = new C0589j(this);
        this.f2264b.mo3087a(attributeSet, i);
        this.f2265c = new C0516H(this);
        this.f2265c.mo2637a(attributeSet, i);
        this.f2265c.mo2632a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0589j jVar = this.f2264b;
        if (jVar != null) {
            jVar.mo3082a();
        }
        C0516H h = this.f2265c;
        if (h != null) {
            h.mo2632a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0589j jVar = this.f2264b;
        if (jVar != null) {
            return jVar.mo3088b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C0589j jVar = this.f2264b;
        if (jVar != null) {
            return jVar.mo3090c();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0609q.m2897a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0589j jVar = this.f2264b;
        if (jVar != null) {
            jVar.mo3086a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0589j jVar = this.f2264b;
        if (jVar != null) {
            jVar.mo3083a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0345D.m1491a((TextView) this, callback));
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0173a.m597b(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0589j jVar = this.f2264b;
        if (jVar != null) {
            jVar.mo3089b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C0589j jVar = this.f2264b;
        if (jVar != null) {
            jVar.mo3085a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0516H h = this.f2265c;
        if (h != null) {
            h.mo2636a(context, i);
        }
    }
}
