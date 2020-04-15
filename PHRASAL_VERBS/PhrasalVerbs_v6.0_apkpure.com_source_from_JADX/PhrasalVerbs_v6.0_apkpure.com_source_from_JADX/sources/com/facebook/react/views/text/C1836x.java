package com.facebook.react.views.text;

import android.os.Build.VERSION;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C1571G;
import com.facebook.react.uimanager.C1726w;
import com.facebook.yoga.YogaDirection;

/* renamed from: com.facebook.react.views.text.x */
public class C1836x {

    /* renamed from: A */
    protected boolean f5440A;

    /* renamed from: B */
    protected float f5441B;

    /* renamed from: C */
    private final C1571G f5442C;

    /* renamed from: a */
    protected float f5443a = Float.NaN;

    /* renamed from: b */
    protected float f5444b = Float.NaN;

    /* renamed from: c */
    protected boolean f5445c = false;

    /* renamed from: d */
    protected boolean f5446d = true;

    /* renamed from: e */
    protected int f5447e;

    /* renamed from: f */
    protected boolean f5448f = false;

    /* renamed from: g */
    protected int f5449g;

    /* renamed from: h */
    protected int f5450h = -1;

    /* renamed from: i */
    protected int f5451i = -1;

    /* renamed from: j */
    protected float f5452j = -1.0f;

    /* renamed from: k */
    protected float f5453k = -1.0f;

    /* renamed from: l */
    protected float f5454l = Float.NaN;

    /* renamed from: m */
    protected int f5455m = 0;

    /* renamed from: n */
    protected int f5456n;

    /* renamed from: o */
    protected int f5457o;

    /* renamed from: p */
    protected C1808C f5458p;

    /* renamed from: q */
    protected float f5459q;

    /* renamed from: r */
    protected float f5460r;

    /* renamed from: s */
    protected float f5461s;

    /* renamed from: t */
    protected int f5462t;

    /* renamed from: u */
    protected boolean f5463u;

    /* renamed from: v */
    protected boolean f5464v;

    /* renamed from: w */
    protected boolean f5465w;

    /* renamed from: x */
    protected int f5466x;

    /* renamed from: y */
    protected int f5467y;

    /* renamed from: z */
    protected String f5468z;

    public C1836x(C1571G g) {
        this.f5456n = VERSION.SDK_INT < 23 ? 0 : 1;
        int i = VERSION.SDK_INT;
        this.f5457o = 0;
        this.f5458p = C1808C.UNSET;
        this.f5459q = 0.0f;
        this.f5460r = 0.0f;
        this.f5461s = 1.0f;
        this.f5462t = 1426063360;
        this.f5463u = false;
        this.f5464v = false;
        this.f5465w = true;
        this.f5466x = -1;
        this.f5467y = -1;
        ReadableMap readableMap = null;
        this.f5468z = null;
        this.f5440A = false;
        this.f5441B = Float.NaN;
        this.f5442C = g;
        mo6443a(m6971a("numberOfLines", -1));
        mo6455c(m6970a("lineHeight", -1.0f));
        mo6449b(m6970a("letterSpacing", Float.NaN));
        mo6447a(m6972a("allowFontScaling", true));
        mo6459d(m6975i("textAlign"));
        mo6442a(m6970a("fontSize", -1.0f));
        String str = "color";
        mo6451b(g.mo5676e(str) ? Integer.valueOf(g.mo5670a(str, 0)) : null);
        String str2 = "foregroundColor";
        mo6451b(g.mo5676e(str2) ? Integer.valueOf(g.mo5670a(str2, 0)) : null);
        String str3 = "backgroundColor";
        mo6445a(g.mo5676e(str3) ? Integer.valueOf(g.mo5670a(str3, 0)) : null);
        mo6446a(m6975i("fontFamily"));
        mo6456c(m6975i("fontWeight"));
        mo6452b(m6975i("fontStyle"));
        mo6453b(m6972a("includeFontPadding", true));
        mo6463f(m6975i("textDecorationLine"));
        mo6461e(m6975i("textBreakStrategy"));
        String str4 = "textShadowOffset";
        if (g.mo5676e(str4)) {
            readableMap = g.mo5674c(str4);
        }
        mo6444a(readableMap);
        mo6458d((float) m6971a("textShadowRadius", 1));
        mo6450b(m6971a("textShadowColor", 1426063360));
        mo6464g(m6975i("textTransform"));
    }

    /* renamed from: a */
    private float m6970a(String str, float f) {
        return this.f5442C.mo5676e(str) ? this.f5442C.mo5669a(str, f) : f;
    }

    /* renamed from: a */
    private int m6971a(String str, int i) {
        return this.f5442C.mo5676e(str) ? this.f5442C.mo5670a(str, i) : i;
    }

    /* renamed from: a */
    private boolean m6972a(String str, boolean z) {
        return this.f5442C.mo5676e(str) ? this.f5442C.mo5672a(str, z) : z;
    }

    /* renamed from: g */
    private YogaDirection m6973g() {
        return YogaDirection.LTR;
    }

    /* renamed from: h */
    private float m6974h(String str) {
        String str2 = "padding";
        return C1726w.m6668b(this.f5442C.mo5676e(str2) ? m6970a(str2, 0.0f) : m6970a(str, 0.0f));
    }

    /* renamed from: i */
    private String m6975i(String str) {
        if (this.f5442C.mo5676e(str)) {
            return this.f5442C.mo5675d(str);
        }
        return null;
    }

    /* renamed from: j */
    private static int m6976j(String str) {
        if (str.length() != 3 || !str.endsWith("00") || str.charAt(0) > '9' || str.charAt(0) < '1') {
            return -1;
        }
        return (str.charAt(0) - '0') * 100;
    }

    /* renamed from: a */
    public float mo6441a() {
        return m6974h("paddingBottom");
    }

    /* renamed from: a */
    public void mo6442a(float f) {
        this.f5452j = f;
        if (f != -1.0f) {
            f = (float) Math.ceil((double) (this.f5446d ? C1726w.m6669c(f) : C1726w.m6668b(f)));
        }
        this.f5451i = (int) f;
    }

    /* renamed from: a */
    public void mo6443a(int i) {
        if (i == 0) {
            i = -1;
        }
        this.f5450h = i;
    }

    /* renamed from: a */
    public void mo6444a(ReadableMap readableMap) {
        this.f5459q = 0.0f;
        this.f5460r = 0.0f;
        if (readableMap != null) {
            String str = "width";
            if (readableMap.hasKey(str) && !readableMap.isNull(str)) {
                this.f5459q = C1726w.m6665a(readableMap.getDouble(str));
            }
            String str2 = "height";
            if (readableMap.hasKey(str2) && !readableMap.isNull(str2)) {
                this.f5460r = C1726w.m6665a(readableMap.getDouble(str2));
            }
        }
    }

    /* renamed from: a */
    public void mo6445a(Integer num) {
        this.f5448f = num != null;
        if (this.f5448f) {
            this.f5449g = num.intValue();
        }
    }

    /* renamed from: a */
    public void mo6446a(String str) {
        this.f5468z = str;
    }

    /* renamed from: a */
    public void mo6447a(boolean z) {
        if (z != this.f5446d) {
            this.f5446d = z;
            mo6442a(this.f5452j);
            mo6455c(this.f5453k);
            mo6449b(this.f5454l);
        }
    }

    /* renamed from: b */
    public float mo6448b() {
        return !Float.isNaN(this.f5443a) && !Float.isNaN(this.f5441B) && (this.f5441B > this.f5443a ? 1 : (this.f5441B == this.f5443a ? 0 : -1)) > 0 ? this.f5441B : this.f5443a;
    }

    /* renamed from: b */
    public void mo6449b(float f) {
        this.f5454l = f;
        this.f5444b = this.f5446d ? C1726w.m6669c(this.f5454l) : C1726w.m6668b(this.f5454l);
    }

    /* renamed from: b */
    public void mo6450b(int i) {
        if (i != this.f5462t) {
            this.f5462t = i;
        }
    }

    /* renamed from: b */
    public void mo6451b(Integer num) {
        this.f5445c = num != null;
        if (this.f5445c) {
            this.f5447e = num.intValue();
        }
    }

    /* renamed from: b */
    public void mo6452b(String str) {
        int i = "italic".equals(str) ? 2 : "normal".equals(str) ? 0 : -1;
        if (i != this.f5466x) {
            this.f5466x = i;
        }
    }

    /* renamed from: b */
    public void mo6453b(boolean z) {
        this.f5465w = z;
    }

    /* renamed from: c */
    public float mo6454c() {
        return m6974h("paddingEnd");
    }

    /* renamed from: c */
    public void mo6455c(float f) {
        this.f5453k = f;
        float b = f == -1.0f ? Float.NaN : this.f5446d ? C1726w.m6669c(f) : C1726w.m6668b(f);
        this.f5443a = b;
    }

    /* renamed from: c */
    public void mo6456c(String str) {
        int i = -1;
        int j = str != null ? m6976j(str) : -1;
        if (j >= 500 || "bold".equals(str)) {
            i = 1;
        } else if ("normal".equals(str) || (j != -1 && j < 500)) {
            i = 0;
        }
        if (i != this.f5467y) {
            this.f5467y = i;
        }
    }

    /* renamed from: d */
    public float mo6457d() {
        return m6974h("paddingStart");
    }

    /* renamed from: d */
    public void mo6458d(float f) {
        if (f != this.f5461s) {
            this.f5461s = f;
        }
    }

    /* renamed from: d */
    public void mo6459d(String str) {
        if (!"justify".equals(str)) {
            if (VERSION.SDK_INT >= 26) {
                this.f5457o = 0;
            }
            if (str == null || "auto".equals(str)) {
                this.f5455m = 0;
                return;
            } else if (!"left".equals(str)) {
                if ("right".equals(str)) {
                    this.f5455m = 5;
                    return;
                } else if ("center".equals(str)) {
                    this.f5455m = 1;
                    return;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid textAlign: ");
                    sb.append(str);
                    throw new JSApplicationIllegalArgumentException(sb.toString());
                }
            }
        } else if (VERSION.SDK_INT >= 26) {
            this.f5457o = 1;
        }
        this.f5455m = 3;
    }

    /* renamed from: e */
    public int mo6460e() {
        int i = this.f5455m;
        if (m6973g() != YogaDirection.RTL) {
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

    /* renamed from: e */
    public void mo6461e(String str) {
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
            this.f5456n = i;
        }
    }

    /* renamed from: f */
    public float mo6462f() {
        return m6974h("paddingTop");
    }

    /* renamed from: f */
    public void mo6463f(String str) {
        String[] split;
        this.f5463u = false;
        this.f5464v = false;
        if (str != null) {
            for (String str2 : str.split(" ")) {
                if ("underline".equals(str2)) {
                    this.f5463u = true;
                } else if ("line-through".equals(str2)) {
                    this.f5464v = true;
                }
            }
        }
    }

    /* renamed from: g */
    public void mo6464g(String str) {
        C1808C c;
        if (str == null || "none".equals(str)) {
            c = C1808C.NONE;
        } else if ("uppercase".equals(str)) {
            c = C1808C.UPPERCASE;
        } else if ("lowercase".equals(str)) {
            c = C1808C.LOWERCASE;
        } else if ("capitalize".equals(str)) {
            c = C1808C.CAPITALIZE;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid textTransform: ");
            sb.append(str);
            throw new JSApplicationIllegalArgumentException(sb.toString());
        }
        this.f5458p = c;
    }
}
