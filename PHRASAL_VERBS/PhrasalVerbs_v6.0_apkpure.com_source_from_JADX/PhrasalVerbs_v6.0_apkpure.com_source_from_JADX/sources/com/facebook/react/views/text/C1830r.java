package com.facebook.react.views.text;

import android.annotation.TargetApi;
import android.text.Spannable;
import android.text.TextPaint;
import com.facebook.react.uimanager.C1655ha;
import com.facebook.react.uimanager.p121a.C1595a;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaMeasureFunction;

@TargetApi(23)
/* renamed from: com.facebook.react.views.text.r */
public class C1830r extends C1818h {
    /* access modifiers changed from: private */

    /* renamed from: S */
    public static final TextPaint f5413S = new TextPaint(1);
    /* access modifiers changed from: private */

    /* renamed from: T */
    public Spannable f5414T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public boolean f5415U;

    /* renamed from: V */
    private final YogaMeasureFunction f5416V = new C1829q(this);

    public C1830r() {
        m6946P();
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public int m6945O() {
        int i = this.f5382C;
        if (mo5613B() != YogaDirection.RTL) {
            return i;
        }
        if (i == 5) {
            return 3;
        }
        if (i == 3) {
            return 5;
        }
        return i;
    }

    /* renamed from: P */
    private void m6946P() {
        if (!mo5596j()) {
            mo5633a(this.f5416V);
        }
    }

    /* renamed from: K */
    public void mo5622K() {
        super.mo5622K();
        super.mo5582c();
    }

    /* renamed from: a */
    public void mo5628a(C1655ha haVar) {
        super.mo5628a(haVar);
        Spannable spannable = this.f5414T;
        if (spannable != null) {
            C1831s sVar = new C1831s(spannable, -1, this.f5396Q, mo5648f(4), mo5648f(1), mo5648f(5), mo5648f(3), m6945O(), this.f5383D, this.f5384E);
            haVar.mo5919a(mo5592g(), (Object) sVar);
        }
    }

    /* renamed from: m */
    public void mo5599m() {
        this.f5414T = C1818h.m6931a(this, null);
        mo5622K();
    }

    @C1595a(name = "onTextLayout")
    public void setShouldNotifyOnTextLayout(boolean z) {
        this.f5415U = z;
    }

    /* renamed from: w */
    public boolean mo5609w() {
        return true;
    }
}
