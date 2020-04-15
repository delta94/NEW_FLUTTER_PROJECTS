package com.facebook.react.views.text;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C1570F;
import com.facebook.react.uimanager.C1685k;
import com.facebook.react.uimanager.C1691n;
import com.facebook.react.uimanager.C1726w;
import com.facebook.react.uimanager.p121a.C1595a;
import java.util.ArrayList;
import java.util.List;

@TargetApi(23)
/* renamed from: com.facebook.react.views.text.h */
public abstract class C1818h extends C1691n {

    /* renamed from: A */
    protected int f5380A;

    /* renamed from: B */
    protected int f5381B = -1;

    /* renamed from: C */
    protected int f5382C = 0;

    /* renamed from: D */
    protected int f5383D;

    /* renamed from: E */
    protected int f5384E;

    /* renamed from: F */
    protected C1808C f5385F;

    /* renamed from: G */
    protected float f5386G;

    /* renamed from: H */
    protected float f5387H;

    /* renamed from: I */
    protected float f5388I;

    /* renamed from: J */
    protected int f5389J;

    /* renamed from: K */
    protected boolean f5390K;

    /* renamed from: L */
    protected boolean f5391L;

    /* renamed from: M */
    protected boolean f5392M;

    /* renamed from: N */
    protected int f5393N;

    /* renamed from: O */
    protected int f5394O;

    /* renamed from: P */
    protected String f5395P;

    /* renamed from: Q */
    protected boolean f5396Q;

    /* renamed from: R */
    protected float f5397R;

    /* renamed from: w */
    protected C1837y f5398w;

    /* renamed from: x */
    protected boolean f5399x = false;

    /* renamed from: y */
    protected int f5400y;

    /* renamed from: z */
    protected boolean f5401z = false;

    /* renamed from: com.facebook.react.views.text.h$a */
    private static class C1819a {

        /* renamed from: a */
        protected int f5402a;

        /* renamed from: b */
        protected int f5403b;

        /* renamed from: c */
        protected C1825m f5404c;

        C1819a(int i, int i2, C1825m mVar) {
            this.f5402a = i;
            this.f5403b = i2;
            this.f5404c = mVar;
        }

        /* renamed from: a */
        public void mo6403a(SpannableStringBuilder spannableStringBuilder, int i) {
            spannableStringBuilder.setSpan(this.f5404c, this.f5402a, this.f5403b, ((i << 16) & 16711680) | ((this.f5402a == 0 ? 18 : 34) & -16711681));
        }
    }

    public C1818h() {
        this.f5383D = VERSION.SDK_INT < 23 ? 0 : 1;
        int i = VERSION.SDK_INT;
        this.f5384E = 0;
        this.f5385F = C1808C.UNSET;
        this.f5386G = 0.0f;
        this.f5387H = 0.0f;
        this.f5388I = 0.0f;
        this.f5389J = 1426063360;
        this.f5390K = false;
        this.f5391L = false;
        this.f5392M = true;
        this.f5393N = -1;
        this.f5394O = -1;
        this.f5395P = null;
        this.f5396Q = false;
        this.f5397R = Float.NaN;
        this.f5398w = new C1837y();
    }

    /* renamed from: a */
    protected static Spannable m6931a(C1818h hVar, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList<C1819a> arrayList = new ArrayList<>();
        if (str != null) {
            spannableStringBuilder.append(C1808C.m6909a(str, hVar.f5398w.mo6483k()));
        }
        int i = 0;
        m6932a(hVar, spannableStringBuilder, arrayList, null, 0);
        hVar.f5396Q = false;
        float f = Float.NaN;
        for (C1819a aVar : arrayList) {
            C1825m mVar = aVar.f5404c;
            if (mVar instanceof C1838z) {
                int b = ((C1838z) mVar).mo6377b();
                hVar.f5396Q = true;
                if (Float.isNaN(f) || ((float) b) > f) {
                    f = (float) b;
                }
            }
            aVar.mo6403a(spannableStringBuilder, i);
            i++;
        }
        hVar.f5398w.mo6471b(f);
        return spannableStringBuilder;
    }

    /* renamed from: a */
    private static void m6932a(C1818h hVar, SpannableStringBuilder spannableStringBuilder, List<C1819a> list, C1837y yVar, int i) {
        C1837y a = yVar != null ? yVar.mo6465a(hVar.f5398w) : hVar.f5398w;
        int e = hVar.mo5589e();
        for (int i2 = 0; i2 < e; i2++) {
            C1570F e2 = hVar.mo5590e(i2);
            if (e2 instanceof C1824l) {
                spannableStringBuilder.append(C1808C.m6909a(((C1824l) e2).mo6042N(), a.mo6483k()));
            } else if (e2 instanceof C1818h) {
                m6932a((C1818h) e2, spannableStringBuilder, list, a, spannableStringBuilder.length());
            } else if (e2 instanceof C1828p) {
                spannableStringBuilder.append("I");
                list.add(new C1819a(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), ((C1828p) e2).mo6042N()));
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected view type nested under text node: ");
                sb.append(e2.getClass());
                throw new C1685k(sb.toString());
            }
            e2.mo5577b();
        }
        int length = spannableStringBuilder.length();
        if (length >= i) {
            if (hVar.f5399x) {
                list.add(new C1819a(i, length, new C1823k(hVar.f5400y)));
            }
            if (hVar.f5401z) {
                list.add(new C1819a(i, length, new C1817g(hVar.f5380A)));
            }
            if (VERSION.SDK_INT >= 21) {
                float c = a.mo6472c();
                if (!Float.isNaN(c) && (yVar == null || yVar.mo6472c() != c)) {
                    list.add(new C1819a(i, length, new C1809a(c)));
                }
            }
            int b = a.mo6470b();
            if (yVar == null || yVar.mo6470b() != b) {
                list.add(new C1819a(i, length, new C1814f(b)));
            }
            if (!(hVar.f5393N == -1 && hVar.f5394O == -1 && hVar.f5395P == null)) {
                list.add(new C1819a(i, length, new C1811c(hVar.f5393N, hVar.f5394O, hVar.f5395P, hVar.mo5602p().getAssets())));
            }
            if (hVar.f5390K) {
                list.add(new C1819a(i, length, new C1833u()));
            }
            if (hVar.f5391L) {
                list.add(new C1819a(i, length, new C1826n()));
            }
            if (!((hVar.f5386G == 0.0f && hVar.f5387H == 0.0f && hVar.f5388I == 0.0f) || Color.alpha(hVar.f5389J) == 0)) {
                list.add(new C1819a(i, length, new C1835w(hVar.f5386G, hVar.f5387H, hVar.f5388I, hVar.f5389J)));
            }
            float d = a.mo6474d();
            if (!Float.isNaN(d) && (yVar == null || yVar.mo6474d() != d)) {
                list.add(new C1819a(i, length, new C1810b(d)));
            }
            list.add(new C1819a(i, length, new C1827o(hVar.mo5592g())));
        }
    }

    /* renamed from: b */
    private static int m6933b(String str) {
        if (str.length() != 3 || !str.endsWith("00") || str.charAt(0) > '9' || str.charAt(0) < '1') {
            return -1;
        }
        return (str.charAt(0) - '0') * 100;
    }

    @C1595a(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(boolean z) {
        if (z != this.f5398w.mo6469a()) {
            this.f5398w.mo6468a(z);
            mo5622K();
        }
    }

    @C1595a(name = "backgroundColor")
    public void setBackgroundColor(Integer num) {
        if (!mo5609w()) {
            this.f5401z = num != null;
            if (this.f5401z) {
                this.f5380A = num.intValue();
            }
            mo5622K();
        }
    }

    @C1595a(name = "color")
    public void setColor(Integer num) {
        this.f5399x = num != null;
        if (this.f5399x) {
            this.f5400y = num.intValue();
        }
        mo5622K();
    }

    @C1595a(name = "fontFamily")
    public void setFontFamily(String str) {
        this.f5395P = str;
        mo5622K();
    }

    @C1595a(defaultFloat = Float.NaN, name = "fontSize")
    public void setFontSize(float f) {
        this.f5398w.mo6466a(f);
        mo5622K();
    }

    @C1595a(name = "fontStyle")
    public void setFontStyle(String str) {
        int i = "italic".equals(str) ? 2 : "normal".equals(str) ? 0 : -1;
        if (i != this.f5393N) {
            this.f5393N = i;
            mo5622K();
        }
    }

    @C1595a(name = "fontWeight")
    public void setFontWeight(String str) {
        int i = -1;
        int b = str != null ? m6933b(str) : -1;
        if (b >= 500 || "bold".equals(str)) {
            i = 1;
        } else if ("normal".equals(str) || (b != -1 && b < 500)) {
            i = 0;
        }
        if (i != this.f5394O) {
            this.f5394O = i;
            mo5622K();
        }
    }

    @C1595a(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(boolean z) {
        this.f5392M = z;
    }

    @C1595a(defaultFloat = Float.NaN, name = "letterSpacing")
    public void setLetterSpacing(float f) {
        this.f5398w.mo6473c(f);
        mo5622K();
    }

    @C1595a(defaultFloat = Float.NaN, name = "lineHeight")
    public void setLineHeight(float f) {
        this.f5398w.mo6475d(f);
        mo5622K();
    }

    @C1595a(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(float f) {
        if (f != this.f5398w.mo6482j()) {
            this.f5398w.mo6477e(f);
            mo5622K();
        }
    }

    @C1595a(defaultInt = -1, name = "numberOfLines")
    public void setNumberOfLines(int i) {
        if (i == 0) {
            i = -1;
        }
        this.f5381B = i;
        mo5622K();
    }

    @C1595a(name = "textAlign")
    public void setTextAlign(String str) {
        if (!"justify".equals(str)) {
            if (VERSION.SDK_INT >= 26) {
                this.f5384E = 0;
            }
            if (str == null || "auto".equals(str)) {
                this.f5382C = 0;
                mo5622K();
            } else if (!"left".equals(str)) {
                if ("right".equals(str)) {
                    this.f5382C = 5;
                } else if ("center".equals(str)) {
                    this.f5382C = 1;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid textAlign: ");
                    sb.append(str);
                    throw new JSApplicationIllegalArgumentException(sb.toString());
                }
                mo5622K();
            }
        } else if (VERSION.SDK_INT >= 26) {
            this.f5384E = 1;
        }
        this.f5382C = 3;
        mo5622K();
    }

    @C1595a(name = "textBreakStrategy")
    public void setTextBreakStrategy(String str) {
        int i;
        if (VERSION.SDK_INT >= 23) {
            if (str == null || "highQuality".equals(str)) {
                i = 1;
            } else if ("simple".equals(str)) {
                i = 0;
            } else if ("balanced".equals(str)) {
                i = 2;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid textBreakStrategy: ");
                sb.append(str);
                throw new JSApplicationIllegalArgumentException(sb.toString());
            }
            this.f5383D = i;
            mo5622K();
        }
    }

    @C1595a(name = "textDecorationLine")
    public void setTextDecorationLine(String str) {
        String[] split;
        this.f5390K = false;
        this.f5391L = false;
        if (str != null) {
            for (String str2 : str.split(" ")) {
                if ("underline".equals(str2)) {
                    this.f5390K = true;
                } else if ("line-through".equals(str2)) {
                    this.f5391L = true;
                }
            }
        }
        mo5622K();
    }

    @C1595a(customType = "Color", defaultInt = 1426063360, name = "textShadowColor")
    public void setTextShadowColor(int i) {
        if (i != this.f5389J) {
            this.f5389J = i;
            mo5622K();
        }
    }

    @C1595a(name = "textShadowOffset")
    public void setTextShadowOffset(ReadableMap readableMap) {
        this.f5386G = 0.0f;
        this.f5387H = 0.0f;
        if (readableMap != null) {
            String str = "width";
            if (readableMap.hasKey(str) && !readableMap.isNull(str)) {
                this.f5386G = C1726w.m6665a(readableMap.getDouble(str));
            }
            String str2 = "height";
            if (readableMap.hasKey(str2) && !readableMap.isNull(str2)) {
                this.f5387H = C1726w.m6665a(readableMap.getDouble(str2));
            }
        }
        mo5622K();
    }

    @C1595a(defaultInt = 1, name = "textShadowRadius")
    public void setTextShadowRadius(float f) {
        if (f != this.f5388I) {
            this.f5388I = f;
            mo5622K();
        }
    }

    @C1595a(name = "textTransform")
    public void setTextTransform(String str) {
        C1837y yVar;
        C1808C c;
        if (str == null) {
            yVar = this.f5398w;
            c = C1808C.UNSET;
        } else if ("none".equals(str)) {
            yVar = this.f5398w;
            c = C1808C.NONE;
        } else if ("uppercase".equals(str)) {
            yVar = this.f5398w;
            c = C1808C.UPPERCASE;
        } else if ("lowercase".equals(str)) {
            yVar = this.f5398w;
            c = C1808C.LOWERCASE;
        } else if ("capitalize".equals(str)) {
            yVar = this.f5398w;
            c = C1808C.CAPITALIZE;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid textTransform: ");
            sb.append(str);
            throw new JSApplicationIllegalArgumentException(sb.toString());
        }
        yVar.mo6467a(c);
        mo5622K();
    }
}
