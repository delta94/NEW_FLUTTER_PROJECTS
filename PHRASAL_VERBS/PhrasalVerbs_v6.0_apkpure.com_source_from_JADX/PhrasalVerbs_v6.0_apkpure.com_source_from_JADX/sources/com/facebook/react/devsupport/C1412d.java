package com.facebook.react.devsupport;

import android.os.Handler;
import android.view.View;
import android.widget.EditText;

/* renamed from: com.facebook.react.devsupport.d */
public class C1412d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f4403a = false;

    /* renamed from: a */
    public boolean mo5226a(int i, View view) {
        if (i == 46 && !(view instanceof EditText)) {
            if (this.f4403a) {
                this.f4403a = false;
                return true;
            }
            this.f4403a = true;
            new Handler().postDelayed(new C1411c(this), 200);
        }
        return false;
    }
}
