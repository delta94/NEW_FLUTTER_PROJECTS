package com.facebook.react.views.text;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.C1726w;

/* renamed from: com.facebook.react.views.text.y */
public class C1837y {

    /* renamed from: a */
    private boolean f5469a = true;

    /* renamed from: b */
    private float f5470b = Float.NaN;

    /* renamed from: c */
    private float f5471c = Float.NaN;

    /* renamed from: d */
    private float f5472d = Float.NaN;

    /* renamed from: e */
    private float f5473e = Float.NaN;

    /* renamed from: f */
    private float f5474f = Float.NaN;

    /* renamed from: g */
    private C1808C f5475g = C1808C.UNSET;

    /* renamed from: a */
    public C1837y mo6465a(C1837y yVar) {
        C1837y yVar2 = new C1837y();
        yVar2.f5469a = this.f5469a;
        yVar2.f5470b = !Float.isNaN(yVar.f5470b) ? yVar.f5470b : this.f5470b;
        yVar2.f5471c = !Float.isNaN(yVar.f5471c) ? yVar.f5471c : this.f5471c;
        yVar2.f5472d = !Float.isNaN(yVar.f5472d) ? yVar.f5472d : this.f5472d;
        yVar2.f5473e = !Float.isNaN(yVar.f5473e) ? yVar.f5473e : this.f5473e;
        yVar2.f5474f = !Float.isNaN(yVar.f5474f) ? yVar.f5474f : this.f5474f;
        C1808C c = yVar.f5475g;
        if (c == C1808C.UNSET) {
            c = this.f5475g;
        }
        yVar2.f5475g = c;
        return yVar2;
    }

    /* renamed from: a */
    public void mo6466a(float f) {
        this.f5470b = f;
    }

    /* renamed from: a */
    public void mo6467a(C1808C c) {
        this.f5475g = c;
    }

    /* renamed from: a */
    public void mo6468a(boolean z) {
        this.f5469a = z;
    }

    /* renamed from: a */
    public boolean mo6469a() {
        return this.f5469a;
    }

    /* renamed from: b */
    public int mo6470b() {
        float f = !Float.isNaN(this.f5470b) ? this.f5470b : 14.0f;
        return (int) Math.ceil((double) (this.f5469a ? C1726w.m6667a(f, mo6476e()) : C1726w.m6668b(f)));
    }

    /* renamed from: b */
    public void mo6471b(float f) {
        this.f5474f = f;
    }

    /* renamed from: c */
    public float mo6472c() {
        if (Float.isNaN(this.f5472d)) {
            return Float.NaN;
        }
        return (this.f5469a ? C1726w.m6667a(this.f5472d, mo6476e()) : C1726w.m6668b(this.f5472d)) / ((float) mo6470b());
    }

    /* renamed from: c */
    public void mo6473c(float f) {
        this.f5472d = f;
    }

    /* renamed from: d */
    public float mo6474d() {
        if (Float.isNaN(this.f5471c)) {
            return Float.NaN;
        }
        float a = this.f5469a ? C1726w.m6667a(this.f5471c, mo6476e()) : C1726w.m6668b(this.f5471c);
        if (!Float.isNaN(this.f5474f) && this.f5474f > a) {
            a = this.f5474f;
        }
        return a;
    }

    /* renamed from: d */
    public void mo6475d(float f) {
        this.f5471c = f;
    }

    /* renamed from: e */
    public float mo6476e() {
        if (!Float.isNaN(this.f5473e)) {
            return this.f5473e;
        }
        return 0.0f;
    }

    /* renamed from: e */
    public void mo6477e(float f) {
        if (f == 0.0f || f >= 1.0f) {
            this.f5473e = f;
            return;
        }
        throw new JSApplicationIllegalArgumentException("maxFontSizeMultiplier must be NaN, 0, or >= 1");
    }

    /* renamed from: f */
    public float mo6478f() {
        return this.f5470b;
    }

    /* renamed from: g */
    public float mo6479g() {
        return this.f5474f;
    }

    /* renamed from: h */
    public float mo6480h() {
        return this.f5472d;
    }

    /* renamed from: i */
    public float mo6481i() {
        return this.f5471c;
    }

    /* renamed from: j */
    public float mo6482j() {
        return this.f5473e;
    }

    /* renamed from: k */
    public C1808C mo6483k() {
        return this.f5475g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TextAttributes {\n  getAllowFontScaling(): ");
        sb.append(mo6469a());
        sb.append("\n  getFontSize(): ");
        sb.append(mo6478f());
        sb.append("\n  getEffectiveFontSize(): ");
        sb.append(mo6470b());
        sb.append("\n  getHeightOfTallestInlineImage(): ");
        sb.append(mo6479g());
        sb.append("\n  getLetterSpacing(): ");
        sb.append(mo6480h());
        sb.append("\n  getEffectiveLetterSpacing(): ");
        sb.append(mo6472c());
        sb.append("\n  getLineHeight(): ");
        sb.append(mo6481i());
        sb.append("\n  getEffectiveLineHeight(): ");
        sb.append(mo6474d());
        sb.append("\n  getTextTransform(): ");
        sb.append(mo6483k());
        sb.append("\n  getMaxFontSizeMultiplier(): ");
        sb.append(mo6482j());
        sb.append("\n  getEffectiveMaxFontSizeMultiplier(): ");
        sb.append(mo6476e());
        sb.append("\n}");
        return sb.toString();
    }
}
