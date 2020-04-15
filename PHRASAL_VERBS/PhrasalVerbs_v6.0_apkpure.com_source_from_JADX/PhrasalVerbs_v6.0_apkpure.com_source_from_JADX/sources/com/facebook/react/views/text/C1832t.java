package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p030v7.widget.C0518I;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils.TruncateAt;
import android.view.ViewGroup.LayoutParams;
import com.facebook.react.uimanager.C1565A;
import com.facebook.react.views.view.C1884f;
import p000a.p005b.p021d.p022a.C0172j;
import p032c.p033a.p038c.p043e.C0727a;

/* renamed from: com.facebook.react.views.text.t */
public class C1832t extends C0518I implements C1565A {

    /* renamed from: d */
    private static final LayoutParams f5427d = new LayoutParams(0, 0);

    /* renamed from: e */
    private boolean f5428e;

    /* renamed from: f */
    private int f5429f = (getGravity() & 8388615);

    /* renamed from: g */
    private int f5430g = (getGravity() & C0172j.AppCompatTheme_windowActionBarOverlay);

    /* renamed from: h */
    private int f5431h = 0;

    /* renamed from: i */
    private int f5432i = Integer.MAX_VALUE;

    /* renamed from: j */
    private TruncateAt f5433j = TruncateAt.END;

    /* renamed from: k */
    private C1884f f5434k = new C1884f(this);

    /* renamed from: l */
    private Spannable f5435l;

    public C1832t(Context context) {
        super(context);
    }

    /* renamed from: a */
    public int mo5539a(float f, float f2) {
        CharSequence text = getText();
        int id = getId();
        int i = (int) f;
        int i2 = (int) f2;
        Layout layout = getLayout();
        if (layout == null) {
            return id;
        }
        int lineForVertical = layout.getLineForVertical(i2);
        int lineLeft = (int) layout.getLineLeft(lineForVertical);
        int lineRight = (int) layout.getLineRight(lineForVertical);
        if ((text instanceof Spanned) && i >= lineLeft && i <= lineRight) {
            Spanned spanned = (Spanned) text;
            try {
                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (float) i);
                C1827o[] oVarArr = (C1827o[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, C1827o.class);
                if (oVarArr != null) {
                    int length = text.length();
                    for (int i3 = 0; i3 < oVarArr.length; i3++) {
                        int spanStart = spanned.getSpanStart(oVarArr[i3]);
                        int spanEnd = spanned.getSpanEnd(oVarArr[i3]);
                        if (spanEnd > offsetForHorizontal) {
                            int i4 = spanEnd - spanStart;
                            if (i4 <= length) {
                                id = oVarArr[i3].mo6408a();
                                length = i4;
                            }
                        }
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Crash in HorizontalMeasurementProvider: ");
                sb.append(e.getMessage());
                C0727a.m3275b("ReactNative", sb.toString());
            }
        }
        return id;
    }

    /* renamed from: a */
    public void mo6420a(float f, int i) {
        this.f5434k.mo6687a(f, i);
    }

    /* renamed from: a */
    public void mo6421a(int i, float f) {
        this.f5434k.mo6689a(i, f);
    }

    /* renamed from: a */
    public void mo6422a(int i, float f, float f2) {
        this.f5434k.mo6690a(i, f, f2);
    }

    /* renamed from: d */
    public void mo2021d() {
        setEllipsize(this.f5432i == Integer.MAX_VALUE ? null : this.f5433j);
    }

    public Spannable getSpanned() {
        return this.f5435l;
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    public void invalidateDrawable(Drawable drawable) {
        if (this.f5428e && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (C1838z a : (C1838z[]) spanned.getSpans(0, spanned.length(), C1838z.class)) {
                if (a.mo6375a() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5428e && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (C1838z c : (C1838z[]) spanned.getSpans(0, spanned.length(), C1838z.class)) {
                c.mo6378c();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f5428e && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (C1838z d : (C1838z[]) spanned.getSpans(0, spanned.length(), C1838z.class)) {
                d.mo6379d();
            }
        }
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.f5428e && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (C1838z e : (C1838z[]) spanned.getSpans(0, spanned.length(), C1838z.class)) {
                e.mo6381e();
            }
        }
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.f5428e && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (C1838z f : (C1838z[]) spanned.getSpans(0, spanned.length(), C1838z.class)) {
                f.mo6382f();
            }
        }
    }

    public void setBackgroundColor(int i) {
        this.f5434k.mo6688a(i);
    }

    public void setBorderRadius(float f) {
        this.f5434k.mo6686a(f);
    }

    public void setBorderStyle(String str) {
        this.f5434k.mo6691a(str);
    }

    public void setEllipsizeLocation(TruncateAt truncateAt) {
        this.f5433j = truncateAt;
    }

    /* access modifiers changed from: 0000 */
    public void setGravityHorizontal(int i) {
        if (i == 0) {
            i = this.f5429f;
        }
        setGravity(i | (getGravity() & -8 & -8388616));
    }

    /* access modifiers changed from: 0000 */
    public void setGravityVertical(int i) {
        if (i == 0) {
            i = this.f5430g;
        }
        setGravity(i | (getGravity() & -113));
    }

    public void setNumberOfLines(int i) {
        if (i == 0) {
            i = Integer.MAX_VALUE;
        }
        this.f5432i = i;
        boolean z = true;
        if (this.f5432i != 1) {
            z = false;
        }
        setSingleLine(z);
        setMaxLines(this.f5432i);
    }

    public void setSpanned(Spannable spannable) {
        this.f5435l = spannable;
    }

    public void setText(C1831s sVar) {
        this.f5428e = sVar.mo6410a();
        if (getLayoutParams() == null) {
            setLayoutParams(f5427d);
        }
        setText(sVar.mo6417h());
        setPadding((int) Math.floor((double) sVar.mo6414e()), (int) Math.floor((double) sVar.mo6416g()), (int) Math.floor((double) sVar.mo6415f()), (int) Math.floor((double) sVar.mo6413d()));
        int i = sVar.mo6418i();
        if (this.f5431h != i) {
            this.f5431h = i;
        }
        setGravityHorizontal(this.f5431h);
        if (VERSION.SDK_INT >= 23 && getBreakStrategy() != sVar.mo6419j()) {
            setBreakStrategy(sVar.mo6419j());
        }
        if (VERSION.SDK_INT >= 26 && getJustificationMode() != sVar.mo6412c()) {
            setJustificationMode(sVar.mo6412c());
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (this.f5428e && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (C1838z a : (C1838z[]) spanned.getSpans(0, spanned.length(), C1838z.class)) {
                if (a.mo6375a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }
}
