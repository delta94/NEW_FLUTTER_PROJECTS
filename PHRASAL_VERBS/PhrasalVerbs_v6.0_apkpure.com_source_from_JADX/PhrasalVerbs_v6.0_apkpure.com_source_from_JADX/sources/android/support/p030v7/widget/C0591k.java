package android.support.p030v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p029v4.widget.C0345D;
import android.support.p029v4.widget.C0359b;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import p000a.p005b.p009c.p018g.C0154t;
import p000a.p005b.p021d.p022a.C0163a;

/* renamed from: android.support.v7.widget.k */
public class C0591k extends Button implements C0154t, C0359b {

    /* renamed from: a */
    private final C0589j f2274a;

    /* renamed from: b */
    private final C0516H f2275b;

    public C0591k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0163a.buttonStyle);
    }

    public C0591k(Context context, AttributeSet attributeSet, int i) {
        super(C0614sa.m2913a(context), attributeSet, i);
        this.f2274a = new C0589j(this);
        this.f2274a.mo3087a(attributeSet, i);
        this.f2275b = new C0516H(this);
        this.f2275b.mo2637a(attributeSet, i);
        this.f2275b.mo2632a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0589j jVar = this.f2274a;
        if (jVar != null) {
            jVar.mo3082a();
        }
        C0516H h = this.f2275b;
        if (h != null) {
            h.mo2632a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (C0359b.f1140a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0516H h = this.f2275b;
        if (h != null) {
            return h.mo2643c();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C0359b.f1140a) {
            return super.getAutoSizeMinTextSize();
        }
        C0516H h = this.f2275b;
        if (h != null) {
            return h.mo2644d();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C0359b.f1140a) {
            return super.getAutoSizeStepGranularity();
        }
        C0516H h = this.f2275b;
        if (h != null) {
            return h.mo2645e();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C0359b.f1140a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0516H h = this.f2275b;
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
        C0516H h = this.f2275b;
        if (h != null) {
            return h.mo2647g();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0589j jVar = this.f2274a;
        if (jVar != null) {
            return jVar.mo3088b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C0589j jVar = this.f2274a;
        if (jVar != null) {
            return jVar.mo3090c();
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0516H h = this.f2275b;
        if (h != null) {
            h.mo2640a(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0516H h = this.f2275b;
        if (h != null && !C0359b.f1140a && h.mo2648h()) {
            this.f2275b.mo2642b();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (C0359b.f1140a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0516H h = this.f2275b;
        if (h != null) {
            h.mo2635a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (C0359b.f1140a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0516H h = this.f2275b;
        if (h != null) {
            h.mo2641a(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C0359b.f1140a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0516H h = this.f2275b;
        if (h != null) {
            h.mo2633a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0589j jVar = this.f2274a;
        if (jVar != null) {
            jVar.mo3086a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0589j jVar = this.f2274a;
        if (jVar != null) {
            jVar.mo3083a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0345D.m1491a((TextView) this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        C0516H h = this.f2275b;
        if (h != null) {
            h.mo2639a(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0589j jVar = this.f2274a;
        if (jVar != null) {
            jVar.mo3089b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C0589j jVar = this.f2274a;
        if (jVar != null) {
            jVar.mo3085a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0516H h = this.f2275b;
        if (h != null) {
            h.mo2636a(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (C0359b.f1140a) {
            super.setTextSize(i, f);
            return;
        }
        C0516H h = this.f2275b;
        if (h != null) {
            h.mo2634a(i, f);
        }
    }
}
