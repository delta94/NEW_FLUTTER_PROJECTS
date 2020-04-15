package com.facebook.react.views.switchview;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p030v7.widget.C0608pa;

/* renamed from: com.facebook.react.views.switchview.a */
class C1802a extends C0608pa {

    /* renamed from: O */
    private boolean f5340O = true;

    /* renamed from: P */
    private Integer f5341P = null;

    /* renamed from: Q */
    private Integer f5342Q = null;

    public C1802a(Context context) {
        super(context);
    }

    /* renamed from: b */
    private void m6891b(boolean z) {
        if (this.f5342Q != null || this.f5341P != null) {
            mo6343b(z ? this.f5342Q : this.f5341P);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6340a(Drawable drawable, Integer num) {
        if (num == null) {
            drawable.clearColorFilter();
        } else {
            drawable.setColorFilter(num.intValue(), Mode.MULTIPLY);
        }
    }

    /* renamed from: a */
    public void mo6341a(Integer num) {
        mo6340a(super.getThumbDrawable(), num);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6342a(boolean z) {
        if (isChecked() != z) {
            super.setChecked(z);
            m6891b(z);
        }
        this.f5340O = true;
    }

    /* renamed from: b */
    public void mo6343b(Integer num) {
        mo6340a(super.getTrackDrawable(), num);
    }

    /* renamed from: c */
    public void mo6344c(Integer num) {
        if (num != this.f5341P) {
            this.f5341P = num;
            if (!isChecked()) {
                mo6343b(this.f5341P);
            }
        }
    }

    /* renamed from: d */
    public void mo6345d(Integer num) {
        if (num != this.f5342Q) {
            this.f5342Q = num;
            if (isChecked()) {
                mo6343b(this.f5342Q);
            }
        }
    }

    public void setChecked(boolean z) {
        if (this.f5340O && isChecked() != z) {
            this.f5340O = false;
            super.setChecked(z);
            m6891b(z);
        }
    }
}
