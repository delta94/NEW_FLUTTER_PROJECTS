package android.support.p030v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p029v4.widget.C0345D;
import android.support.p029v4.widget.C0359b;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p000a.p005b.p009c.p017f.C0095b;
import p000a.p005b.p009c.p017f.C0095b.C0096a;
import p000a.p005b.p009c.p018g.C0154t;

/* renamed from: android.support.v7.widget.I */
public class C0518I extends TextView implements C0154t, C0359b {

    /* renamed from: a */
    private final C0589j f1949a;

    /* renamed from: b */
    private final C0516H f1950b;

    /* renamed from: c */
    private Future<C0095b> f1951c;

    public C0518I(Context context) {
        this(context, null);
    }

    public C0518I(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public C0518I(Context context, AttributeSet attributeSet, int i) {
        super(C0614sa.m2913a(context), attributeSet, i);
        this.f1949a = new C0589j(this);
        this.f1949a.mo3087a(attributeSet, i);
        this.f1950b = new C0516H(this);
        this.f1950b.mo2637a(attributeSet, i);
        this.f1950b.mo2632a();
    }

    /* renamed from: d */
    private void mo2021d() {
        Future<C0095b> future = this.f1951c;
        if (future != null) {
            try {
                this.f1951c = null;
                C0345D.m1494a((TextView) this, (C0095b) future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0589j jVar = this.f1949a;
        if (jVar != null) {
            jVar.mo3082a();
        }
        C0516H h = this.f1950b;
        if (h != null) {
            h.mo2632a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (C0359b.f1140a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0516H h = this.f1950b;
        if (h != null) {
            return h.mo2643c();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C0359b.f1140a) {
            return super.getAutoSizeMinTextSize();
        }
        C0516H h = this.f1950b;
        if (h != null) {
            return h.mo2644d();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C0359b.f1140a) {
            return super.getAutoSizeStepGranularity();
        }
        C0516H h = this.f1950b;
        if (h != null) {
            return h.mo2645e();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C0359b.f1140a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0516H h = this.f1950b;
        return h != null ? h.mo2646f() : new int[0];
    }

    public int getAutoSizeTextType() {
        int i = 0;
        if (C0359b.f1140a) {
            if (super.getAutoSizeTextType() == 1) {
                i = 1;
            }
            return i;
        }
        C0516H h = this.f1950b;
        if (h != null) {
            return h.mo2647g();
        }
        return 0;
    }

    public int getFirstBaselineToTopHeight() {
        return C0345D.m1490a((TextView) this);
    }

    public int getLastBaselineToBottomHeight() {
        return C0345D.m1495b(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0589j jVar = this.f1949a;
        if (jVar != null) {
            return jVar.mo3088b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C0589j jVar = this.f1949a;
        if (jVar != null) {
            return jVar.mo3090c();
        }
        return null;
    }

    public CharSequence getText() {
        mo2021d();
        return super.getText();
    }

    public C0096a getTextMetricsParamsCompat() {
        return C0345D.m1497c(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0609q.m2897a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0516H h = this.f1950b;
        if (h != null) {
            h.mo2640a(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        mo2021d();
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0516H h = this.f1950b;
        if (h != null && !C0359b.f1140a && h.mo2648h()) {
            this.f1950b.mo2642b();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (C0359b.f1140a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0516H h = this.f1950b;
        if (h != null) {
            h.mo2635a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (C0359b.f1140a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0516H h = this.f1950b;
        if (h != null) {
            h.mo2641a(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C0359b.f1140a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0516H h = this.f1950b;
        if (h != null) {
            h.mo2633a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0589j jVar = this.f1949a;
        if (jVar != null) {
            jVar.mo3086a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0589j jVar = this.f1949a;
        if (jVar != null) {
            jVar.mo3083a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0345D.m1491a((TextView) this, callback));
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C0345D.m1492a((TextView) this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C0345D.m1496b(this, i);
        }
    }

    public void setLineHeight(int i) {
        C0345D.m1498c(this, i);
    }

    public void setPrecomputedText(C0095b bVar) {
        C0345D.m1494a((TextView) this, bVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0589j jVar = this.f1949a;
        if (jVar != null) {
            jVar.mo3089b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C0589j jVar = this.f1949a;
        if (jVar != null) {
            jVar.mo3085a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0516H h = this.f1950b;
        if (h != null) {
            h.mo2636a(context, i);
        }
    }

    public void setTextFuture(Future<C0095b> future) {
        this.f1951c = future;
        requestLayout();
    }

    public void setTextMetricsParamsCompat(C0096a aVar) {
        C0345D.m1493a((TextView) this, aVar);
    }

    public void setTextSize(int i, float f) {
        if (C0359b.f1140a) {
            super.setTextSize(i, f);
            return;
        }
        C0516H h = this.f1950b;
        if (h != null) {
            h.mo2634a(i, f);
        }
    }
}
