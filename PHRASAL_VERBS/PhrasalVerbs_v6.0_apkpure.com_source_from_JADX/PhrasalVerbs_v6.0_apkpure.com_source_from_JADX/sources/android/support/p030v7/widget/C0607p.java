package android.support.p030v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p029v4.widget.C0345D;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import p000a.p005b.p009c.p018g.C0154t;
import p000a.p005b.p021d.p022a.C0163a;

/* renamed from: android.support.v7.widget.p */
public class C0607p extends EditText implements C0154t {

    /* renamed from: a */
    private final C0589j f2322a;

    /* renamed from: b */
    private final C0516H f2323b;

    public C0607p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0163a.editTextStyle);
    }

    public C0607p(Context context, AttributeSet attributeSet, int i) {
        super(C0614sa.m2913a(context), attributeSet, i);
        this.f2322a = new C0589j(this);
        this.f2322a.mo3087a(attributeSet, i);
        this.f2323b = new C0516H(this);
        this.f2323b.mo2637a(attributeSet, i);
        this.f2323b.mo2632a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0589j jVar = this.f2322a;
        if (jVar != null) {
            jVar.mo3082a();
        }
        C0516H h = this.f2323b;
        if (h != null) {
            h.mo2632a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0589j jVar = this.f2322a;
        if (jVar != null) {
            return jVar.mo3088b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C0589j jVar = this.f2322a;
        if (jVar != null) {
            return jVar.mo3090c();
        }
        return null;
    }

    public Editable getText() {
        return VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0609q.m2897a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0589j jVar = this.f2322a;
        if (jVar != null) {
            jVar.mo3086a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0589j jVar = this.f2322a;
        if (jVar != null) {
            jVar.mo3083a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0345D.m1491a((TextView) this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0589j jVar = this.f2322a;
        if (jVar != null) {
            jVar.mo3089b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C0589j jVar = this.f2322a;
        if (jVar != null) {
            jVar.mo3085a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0516H h = this.f2323b;
        if (h != null) {
            h.mo2636a(context, i);
        }
    }
}
