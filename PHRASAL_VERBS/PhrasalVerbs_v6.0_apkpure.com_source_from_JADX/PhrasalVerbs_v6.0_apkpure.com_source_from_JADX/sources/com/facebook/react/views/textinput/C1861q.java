package com.facebook.react.views.textinput;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.C1578N;
import com.facebook.react.uimanager.C1655ha;
import com.facebook.react.uimanager.p121a.C1595a;
import com.facebook.react.views.text.C1818h;
import com.facebook.react.views.text.C1831s;
import com.facebook.react.views.view.C1878b;
import com.facebook.yoga.C1944b;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;
import p000a.p005b.p009c.p018g.C0156v;
import p032c.p033a.p094k.p095a.C1136a;

@TargetApi(23)
/* renamed from: com.facebook.react.views.textinput.q */
public class C1861q extends C1818h implements YogaMeasureFunction {

    /* renamed from: S */
    private int f5551S = -1;

    /* renamed from: T */
    private EditText f5552T;

    /* renamed from: U */
    private C1856l f5553U;

    /* renamed from: V */
    private String f5554V = null;

    /* renamed from: W */
    private String f5555W = null;

    public C1861q() {
        this.f5383D = VERSION.SDK_INT < 23 ? 0 : 1;
        m7087P();
    }

    /* renamed from: P */
    private void m7087P() {
        mo5633a((YogaMeasureFunction) this);
    }

    /* renamed from: I */
    public boolean mo5620I() {
        return true;
    }

    /* renamed from: N */
    public String mo6042N() {
        return this.f5555W;
    }

    /* renamed from: O */
    public String mo6608O() {
        return this.f5554V;
    }

    /* renamed from: a */
    public void mo5570a(C1578N n) {
        super.mo5570a(n);
        EditText editText = new EditText(mo5602p());
        mo5638b(4, (float) C0156v.m569j(editText));
        mo5638b(1, (float) editText.getPaddingTop());
        mo5638b(5, (float) C0156v.m568i(editText));
        mo5638b(3, (float) editText.getPaddingBottom());
        this.f5552T = editText;
        this.f5552T.setPadding(0, 0, 0, 0);
        this.f5552T.setLayoutParams(new LayoutParams(-2, -2));
    }

    /* renamed from: a */
    public void mo5628a(C1655ha haVar) {
        super.mo5628a(haVar);
        if (this.f5551S != -1) {
            C1831s sVar = new C1831s(C1818h.m6931a(this, mo6608O()), this.f5551S, this.f5396Q, mo5648f(0), mo5648f(1), mo5648f(2), mo5648f(3), this.f5382C, this.f5383D, this.f5384E);
            haVar.mo5919a(mo5592g(), (Object) sVar);
        }
    }

    /* renamed from: a */
    public void mo5572a(Object obj) {
        C1136a.m5055a(obj instanceof C1856l);
        this.f5553U = (C1856l) obj;
        mo5582c();
    }

    /* renamed from: e */
    public void mo5647e(int i, float f) {
        super.mo5647e(i, f);
        mo5622K();
    }

    public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        EditText editText = this.f5552T;
        C1136a.m5053a(editText);
        EditText editText2 = editText;
        C1856l lVar = this.f5553U;
        if (lVar != null) {
            lVar.mo6604a(editText2);
        } else {
            editText2.setTextSize(0, (float) this.f5398w.mo6470b());
            int i = this.f5381B;
            if (i != -1) {
                editText2.setLines(i);
            }
            if (VERSION.SDK_INT >= 23) {
                int breakStrategy = editText2.getBreakStrategy();
                int i2 = this.f5383D;
                if (breakStrategy != i2) {
                    editText2.setBreakStrategy(i2);
                }
            }
        }
        editText2.setHint(mo6042N());
        editText2.measure(C1878b.m7126a(f, yogaMeasureMode), C1878b.m7126a(f2, yogaMeasureMode2));
        return C1944b.m7434a(editText2.getMeasuredWidth(), editText2.getMeasuredHeight());
    }

    @C1595a(name = "mostRecentEventCount")
    public void setMostRecentEventCount(int i) {
        this.f5551S = i;
    }

    @C1595a(name = "placeholder")
    public void setPlaceholder(String str) {
        this.f5555W = str;
        mo5622K();
    }

    @C1595a(name = "text")
    public void setText(String str) {
        this.f5554V = str;
        mo5622K();
    }

    public void setTextBreakStrategy(String str) {
        int i;
        if (VERSION.SDK_INT >= 23) {
            if (str == null || "simple".equals(str)) {
                i = 0;
            } else if ("highQuality".equals(str)) {
                i = 1;
            } else if ("balanced".equals(str)) {
                i = 2;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid textBreakStrategy: ");
                sb.append(str);
                throw new JSApplicationIllegalArgumentException(sb.toString());
            }
            this.f5383D = i;
        }
    }

    /* renamed from: w */
    public boolean mo5609w() {
        return true;
    }
}
