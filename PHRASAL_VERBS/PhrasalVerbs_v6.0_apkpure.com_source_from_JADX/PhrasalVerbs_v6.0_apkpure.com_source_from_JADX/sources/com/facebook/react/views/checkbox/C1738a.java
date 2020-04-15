package com.facebook.react.views.checkbox;

import android.content.Context;
import android.support.p030v7.widget.C0593l;

/* renamed from: com.facebook.react.views.checkbox.a */
class C1738a extends C0593l {

    /* renamed from: b */
    private boolean f5131b = true;

    public C1738a(Context context) {
        super(context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6050a(boolean z) {
        if (isChecked() != z) {
            super.setChecked(z);
        }
        this.f5131b = true;
    }

    public void setChecked(boolean z) {
        if (this.f5131b) {
            this.f5131b = false;
            super.setChecked(z);
        }
    }
}
