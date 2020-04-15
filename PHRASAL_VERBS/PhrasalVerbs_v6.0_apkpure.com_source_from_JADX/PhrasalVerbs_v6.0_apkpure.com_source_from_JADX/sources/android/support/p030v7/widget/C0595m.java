package android.support.p030v7.widget;

import android.content.Context;
import android.support.p029v4.widget.C0345D;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;
import p000a.p005b.p021d.p023b.p024a.C0173a;

/* renamed from: android.support.v7.widget.m */
public class C0595m extends CheckedTextView {

    /* renamed from: a */
    private static final int[] f2278a = {16843016};

    /* renamed from: b */
    private final C0516H f2279b;

    public C0595m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public C0595m(Context context, AttributeSet attributeSet, int i) {
        super(C0614sa.m2913a(context), attributeSet, i);
        this.f2279b = new C0516H(this);
        this.f2279b.mo2637a(attributeSet, i);
        this.f2279b.mo2632a();
        C0620va a = C0620va.m2920a(getContext(), attributeSet, f2278a, i, 0);
        setCheckMarkDrawable(a.mo3258b(0));
        a.mo3255a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0516H h = this.f2279b;
        if (h != null) {
            h.mo2632a();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0609q.m2897a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C0173a.m597b(getContext(), i));
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0345D.m1491a((TextView) this, callback));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0516H h = this.f2279b;
        if (h != null) {
            h.mo2636a(context, i);
        }
    }
}
