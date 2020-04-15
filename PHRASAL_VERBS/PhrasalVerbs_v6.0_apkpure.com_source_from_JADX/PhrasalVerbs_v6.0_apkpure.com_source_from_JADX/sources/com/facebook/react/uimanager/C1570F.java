package com.facebook.react.uimanager;

import com.facebook.yoga.C1943a;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaConfig;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaNode;
import com.facebook.yoga.YogaOverflow;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaWrap;
import java.util.ArrayList;
import java.util.Arrays;
import p032c.p033a.p094k.p095a.C1136a;

/* renamed from: com.facebook.react.uimanager.F */
public class C1570F implements C1569E<C1570F> {

    /* renamed from: a */
    private static final YogaConfig f4754a = C1572H.m6245a();

    /* renamed from: b */
    private int f4755b;

    /* renamed from: c */
    private String f4756c;

    /* renamed from: d */
    private int f4757d;

    /* renamed from: e */
    private C1578N f4758e;

    /* renamed from: f */
    private boolean f4759f;

    /* renamed from: g */
    private boolean f4760g = true;

    /* renamed from: h */
    private ArrayList<C1570F> f4761h;

    /* renamed from: i */
    private C1570F f4762i;

    /* renamed from: j */
    private boolean f4763j;

    /* renamed from: k */
    private int f4764k = 0;

    /* renamed from: l */
    private C1570F f4765l;

    /* renamed from: m */
    private ArrayList<C1570F> f4766m;

    /* renamed from: n */
    private int f4767n;

    /* renamed from: o */
    private int f4768o;

    /* renamed from: p */
    private int f4769p;

    /* renamed from: q */
    private int f4770q;

    /* renamed from: r */
    private final C1577M f4771r = new C1577M(0.0f);

    /* renamed from: s */
    private final float[] f4772s = new float[9];

    /* renamed from: t */
    private final boolean[] f4773t = new boolean[9];

    /* renamed from: u */
    private YogaNode f4774u;

    public C1570F() {
        if (!mo5596j()) {
            YogaNode yogaNode = (YogaNode) C1721sa.m6642a().mo5175a();
            if (yogaNode == null) {
                yogaNode = new YogaNode(f4754a);
            }
            this.f4774u = yogaNode;
            this.f4774u.mo6851a((Object) this);
            Arrays.fill(this.f4772s, Float.NaN);
            return;
        }
        this.f4774u = null;
    }

    /* renamed from: N */
    private void mo6042N() {
        float f;
        YogaEdge yogaEdge;
        YogaNode yogaNode;
        for (int i = 0; i <= 8; i++) {
            if (i == 0 || i == 2 || i == 4 || i == 5 ? !(!C1943a.m7432a(this.f4772s[i]) || !C1943a.m7432a(this.f4772s[6]) || !C1943a.m7432a(this.f4772s[8])) : !(i == 1 || i == 3 ? !C1943a.m7432a(this.f4772s[i]) || !C1943a.m7432a(this.f4772s[7]) || !C1943a.m7432a(this.f4772s[8]) : !C1943a.m7432a(this.f4772s[i]))) {
                yogaNode = this.f4774u;
                yogaEdge = YogaEdge.m7365a(i);
                f = this.f4771r.mo5691b(i);
            } else if (this.f4773t[i]) {
                this.f4774u.mo6868e(YogaEdge.m7365a(i), this.f4772s[i]);
            } else {
                yogaNode = this.f4774u;
                yogaEdge = YogaEdge.m7365a(i);
                f = this.f4772s[i];
            }
            yogaNode.mo6865d(yogaEdge, f);
        }
    }

    /* renamed from: h */
    private void m6131h(int i) {
        if (this.f4763j) {
            C1570F parent = getParent();
            while (parent != null) {
                parent.f4764k += i;
                if (parent.mo5563A()) {
                    parent = parent.getParent();
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: A */
    public final boolean mo5563A() {
        return this.f4763j;
    }

    /* renamed from: B */
    public final YogaDirection mo5613B() {
        return this.f4774u.mo6858c();
    }

    /* renamed from: C */
    public final float mo5614C() {
        return this.f4774u.mo6863d();
    }

    /* renamed from: D */
    public final float mo5615D() {
        return this.f4774u.mo6866e();
    }

    /* renamed from: E */
    public final int mo5616E() {
        return this.f4764k;
    }

    /* renamed from: F */
    public final boolean mo5617F() {
        YogaNode yogaNode = this.f4774u;
        return yogaNode != null && yogaNode.mo6877h();
    }

    /* renamed from: G */
    public final boolean mo5618G() {
        YogaNode yogaNode = this.f4774u;
        return yogaNode != null && yogaNode.mo6879i();
    }

    /* renamed from: H */
    public boolean mo5619H() {
        return this.f4774u.mo6881j();
    }

    /* renamed from: I */
    public boolean mo5620I() {
        return mo5619H();
    }

    /* renamed from: J */
    public final void mo5621J() {
        YogaNode yogaNode = this.f4774u;
        if (yogaNode != null) {
            yogaNode.mo6882k();
        }
    }

    /* renamed from: K */
    public void mo5622K() {
        if (!this.f4760g) {
            this.f4760g = true;
            C1570F parent = getParent();
            if (parent != null) {
                parent.mo5622K();
            }
        }
    }

    /* renamed from: L */
    public void mo5623L() {
    }

    /* renamed from: M */
    public void mo5624M() {
        this.f4774u.mo6886m();
    }

    /* renamed from: a */
    public int mo5564a() {
        return this.f4770q;
    }

    /* renamed from: a */
    public final int mo5565a(C1570F f) {
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= mo5589e()) {
                break;
            }
            C1570F e = mo5590e(i);
            if (f == e) {
                z = true;
                break;
            }
            if (e.mo5563A()) {
                i3 = e.mo5616E();
            }
            i2 += i3;
            i++;
        }
        if (z) {
            return i2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Child ");
        sb.append(f.mo5592g());
        sb.append(" was not a child of ");
        sb.append(this.f4755b);
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: a */
    public C1570F m6149a(int i) {
        ArrayList<C1570F> arrayList = this.f4761h;
        if (arrayList != null) {
            C1570F f = (C1570F) arrayList.remove(i);
            f.f4762i = null;
            if (this.f4774u != null && !mo5620I()) {
                this.f4774u.mo6836a(i);
            }
            mo5622K();
            int E = f.mo5563A() ? f.mo5616E() : 1;
            this.f4764k -= E;
            m6131h(-E);
            return f;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index ");
        sb.append(i);
        sb.append(" out of bounds: node has no children");
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: a */
    public void mo5567a(float f) {
        this.f4774u.mo6883k(f);
    }

    /* renamed from: a */
    public void mo5626a(int i, float f) {
        this.f4774u.mo6843a(YogaEdge.m7365a(i), f);
    }

    /* renamed from: a */
    public void mo5580b(C1570F f, int i) {
        if (this.f4761h == null) {
            this.f4761h = new ArrayList<>(4);
        }
        this.f4761h.add(i, f);
        f.f4762i = this;
        if (this.f4774u != null && !mo5620I()) {
            YogaNode yogaNode = f.f4774u;
            if (yogaNode != null) {
                this.f4774u.mo6847a(yogaNode, i);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot add a child that doesn't have a YogaNode to a parent without a measure function! (Trying to add a '");
                sb.append(f.toString());
                sb.append("' to a '");
                sb.append(toString());
                sb.append("')");
                throw new RuntimeException(sb.toString());
            }
        }
        mo5622K();
        int E = f.mo5563A() ? f.mo5616E() : 1;
        this.f4764k += E;
        m6131h(E);
    }

    /* renamed from: a */
    public final void mo5569a(C1571G g) {
        C1693na.m6550a(this, g);
        mo5623L();
    }

    /* renamed from: a */
    public void mo5570a(C1578N n) {
        this.f4758e = n;
    }

    /* renamed from: a */
    public void mo5628a(C1655ha haVar) {
    }

    /* renamed from: a */
    public void mo5629a(YogaAlign yogaAlign) {
        this.f4774u.mo6840a(yogaAlign);
    }

    /* renamed from: a */
    public void mo5571a(YogaDirection yogaDirection) {
        this.f4774u.mo6841a(yogaDirection);
    }

    /* renamed from: a */
    public void mo5630a(YogaDisplay yogaDisplay) {
        this.f4774u.mo6842a(yogaDisplay);
    }

    /* renamed from: a */
    public void mo5631a(YogaFlexDirection yogaFlexDirection) {
        this.f4774u.mo6844a(yogaFlexDirection);
    }

    /* renamed from: a */
    public void mo5632a(YogaJustify yogaJustify) {
        this.f4774u.mo6845a(yogaJustify);
    }

    /* renamed from: a */
    public void mo5633a(YogaMeasureFunction yogaMeasureFunction) {
        this.f4774u.mo6846a(yogaMeasureFunction);
    }

    /* renamed from: a */
    public void mo5634a(YogaOverflow yogaOverflow) {
        this.f4774u.mo6848a(yogaOverflow);
    }

    /* renamed from: a */
    public void mo5635a(YogaPositionType yogaPositionType) {
        this.f4774u.mo6849a(yogaPositionType);
    }

    /* renamed from: a */
    public void mo5636a(YogaWrap yogaWrap) {
        this.f4774u.mo6850a(yogaWrap);
    }

    /* renamed from: a */
    public void mo5572a(Object obj) {
    }

    /* renamed from: a */
    public final void mo5573a(String str) {
        this.f4756c = str;
    }

    /* renamed from: a */
    public final void mo5574a(boolean z) {
        boolean z2 = true;
        C1136a.m5056a(getParent() == null, "Must remove from no opt parent first");
        C1136a.m5056a(this.f4765l == null, "Must remove from native parent first");
        if (mo5597k() != 0) {
            z2 = false;
        }
        C1136a.m5056a(z2, "Must remove all native children first");
        this.f4763j = z;
    }

    /* renamed from: a */
    public boolean mo5575a(float f, float f2, C1655ha haVar, C1722t tVar) {
        if (this.f4760g) {
            mo5628a(haVar);
        }
        boolean z = false;
        if (mo5617F()) {
            float x = mo5610x();
            float u = mo5607u();
            float f3 = f + x;
            int round = Math.round(f3);
            float f4 = f2 + u;
            int round2 = Math.round(f4);
            int round3 = Math.round(f3 + mo5615D());
            int round4 = Math.round(f4 + mo5614C());
            int round5 = Math.round(x);
            int round6 = Math.round(u);
            int i = round3 - round;
            int i2 = round4 - round2;
            if (!(round5 == this.f4767n && round6 == this.f4768o && i == this.f4769p && i2 == this.f4770q)) {
                z = true;
            }
            this.f4767n = round5;
            this.f4768o = round6;
            this.f4769p = i;
            this.f4770q = i2;
            if (z) {
                if (tVar != null) {
                    tVar.mo6016b(this);
                } else {
                    haVar.mo5911a(getParent().mo5592g(), mo5592g(), mo5608v(), mo5601o(), mo5598l(), mo5564a());
                }
            }
        }
        return z;
    }

    /* renamed from: b */
    public final int mo5581c(C1570F f) {
        ArrayList<C1570F> arrayList = this.f4761h;
        if (arrayList == null) {
            return -1;
        }
        return arrayList.indexOf(f);
    }

    /* renamed from: b */
    public final void mo5577b() {
        this.f4760g = false;
        if (mo5617F()) {
            mo5621J();
        }
    }

    /* renamed from: b */
    public void mo5578b(float f) {
        this.f4774u.mo6874g(f);
    }

    /* renamed from: b */
    public final void mo5579b(int i) {
        this.f4757d = i;
    }

    /* renamed from: b */
    public void mo5638b(int i, float f) {
        this.f4771r.mo5690a(i, f);
        mo6042N();
    }

    /* renamed from: b */
    public final void mo5568a(C1570F f, int i) {
        C1136a.m5055a(!this.f4763j);
        C1136a.m5055a(!f.f4763j);
        if (this.f4766m == null) {
            this.f4766m = new ArrayList<>(4);
        }
        this.f4766m.add(i, f);
        f.f4765l = this;
    }

    /* renamed from: b */
    public void mo5640b(YogaAlign yogaAlign) {
        this.f4774u.mo6854b(yogaAlign);
    }

    /* renamed from: c */
    public final int mo5576b(C1570F f) {
        C1136a.m5053a(this.f4766m);
        return this.f4766m.indexOf(f);
    }

    /* renamed from: c */
    public void mo5582c() {
        if (!mo5596j()) {
            this.f4774u.mo6837a();
        }
    }

    /* renamed from: c */
    public void mo5583c(float f) {
        this.f4774u.mo6878i(f);
    }

    /* renamed from: c */
    public void mo5584c(int i) {
        this.f4755b = i;
    }

    /* renamed from: c */
    public void mo5642c(int i, float f) {
        this.f4774u.mo6856b(YogaEdge.m7365a(i), f);
    }

    /* renamed from: c */
    public void mo5643c(YogaAlign yogaAlign) {
        this.f4774u.mo6860c(yogaAlign);
    }

    /* renamed from: d */
    public final C1570F m6187d(int i) {
        C1136a.m5053a(this.f4766m);
        C1570F f = (C1570F) this.f4766m.remove(i);
        f.f4765l = null;
        return f;
    }

    /* renamed from: d */
    public void mo5586d(float f) {
        this.f4774u.mo6894q(f);
    }

    /* renamed from: d */
    public void mo5644d(int i, float f) {
        this.f4774u.mo6861c(YogaEdge.m7365a(i), f);
    }

    /* renamed from: d */
    public final boolean mo5587d() {
        return this.f4760g || mo5617F() || mo5618G();
    }

    /* renamed from: d */
    public boolean mo5588d(C1570F f) {
        for (C1570F parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent == f) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final int mo5589e() {
        ArrayList<C1570F> arrayList = this.f4761h;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* renamed from: e */
    public final C1570F m6195e(int i) {
        ArrayList<C1570F> arrayList = this.f4761h;
        if (arrayList != null) {
            return (C1570F) arrayList.get(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index ");
        sb.append(i);
        sb.append(" out of bounds: node has no children");
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: e */
    public void mo5646e(float f) {
        this.f4774u.mo6859c(f);
    }

    /* renamed from: e */
    public void mo5647e(int i, float f) {
        this.f4772s[i] = f;
        this.f4773t[i] = false;
        mo6042N();
    }

    /* renamed from: f */
    public final float mo5648f(int i) {
        return this.f4774u.mo6835a(YogaEdge.m7365a(i));
    }

    /* renamed from: f */
    public void mo5591f() {
        if (mo5589e() != 0) {
            int i = 0;
            for (int e = mo5589e() - 1; e >= 0; e--) {
                if (this.f4774u != null && !mo5620I()) {
                    this.f4774u.mo6836a(e);
                }
                C1570F e2 = mo5590e(e);
                e2.f4762i = null;
                e2.mo5600n();
                i += e2.mo5563A() ? e2.mo5616E() : 1;
            }
            ArrayList<C1570F> arrayList = this.f4761h;
            C1136a.m5053a(arrayList);
            arrayList.clear();
            mo5622K();
            this.f4764k -= i;
            m6131h(-i);
        }
    }

    /* renamed from: f */
    public void mo5649f(float f) {
        this.f4774u.mo6864d(f);
    }

    /* renamed from: f */
    public void mo5650f(int i, float f) {
        this.f4772s[i] = f;
        this.f4773t[i] = !C1943a.m7432a(f);
        mo6042N();
    }

    /* renamed from: g */
    public final int mo5592g() {
        return this.f4755b;
    }

    /* renamed from: g */
    public void mo5651g(float f) {
        this.f4774u.mo6838a(f);
    }

    /* renamed from: g */
    public void mo5652g(int i) {
        this.f4774u.mo6855b(YogaEdge.m7365a(i));
    }

    /* renamed from: g */
    public void mo5653g(int i, float f) {
        this.f4774u.mo6871f(YogaEdge.m7365a(i), f);
    }

    public final C1570F getParent() {
        return this.f4762i;
    }

    /* renamed from: h */
    public final void mo5594h() {
        ArrayList<C1570F> arrayList = this.f4766m;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C1570F) this.f4766m.get(size)).f4765l = null;
            }
            this.f4766m.clear();
        }
    }

    /* renamed from: h */
    public void mo5654h(float f) {
        this.f4774u.mo6876h(f);
    }

    /* renamed from: h */
    public void mo5655h(int i, float f) {
        this.f4774u.mo6875g(YogaEdge.m7365a(i), f);
    }

    /* renamed from: i */
    public void mo5595i() {
        this.f4774u.mo6839a(Float.NaN, Float.NaN);
    }

    /* renamed from: i */
    public void mo5656i(float f) {
        this.f4774u.mo6880j(f);
    }

    /* renamed from: j */
    public void mo5657j(float f) {
        this.f4774u.mo6885l(f);
    }

    /* renamed from: j */
    public boolean mo5596j() {
        return false;
    }

    /* renamed from: k */
    public final int mo5597k() {
        ArrayList<C1570F> arrayList = this.f4766m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* renamed from: k */
    public void mo5658k(float f) {
        this.f4774u.mo6887m(f);
    }

    /* renamed from: l */
    public int mo5598l() {
        return this.f4769p;
    }

    /* renamed from: l */
    public void mo5659l(float f) {
        this.f4774u.mo6890n(f);
    }

    /* renamed from: m */
    public void mo5599m() {
    }

    /* renamed from: m */
    public void mo5660m(float f) {
        this.f4774u.mo6892o(f);
    }

    /* renamed from: n */
    public void mo5600n() {
        YogaNode yogaNode = this.f4774u;
        if (yogaNode != null) {
            yogaNode.mo6884l();
            C1721sa.m6642a().mo5176a(this.f4774u);
        }
    }

    /* renamed from: n */
    public void mo5661n(float f) {
        this.f4774u.mo6893p(f);
    }

    /* renamed from: o */
    public int mo5601o() {
        return this.f4768o;
    }

    /* renamed from: o */
    public void mo5662o(float f) {
        this.f4774u.mo6895r(f);
    }

    /* renamed from: p */
    public final C1578N mo5602p() {
        C1578N n = this.f4758e;
        C1136a.m5053a(n);
        return n;
    }

    /* renamed from: q */
    public final int mo5603q() {
        C1136a.m5055a(this.f4757d != 0);
        return this.f4757d;
    }

    /* renamed from: r */
    public final boolean mo5604r() {
        return this.f4759f;
    }

    /* renamed from: s */
    public void mo5605s() {
        this.f4774u.mo6889n();
    }

    public void setFlex(float f) {
        this.f4774u.mo6853b(f);
    }

    public void setFlexGrow(float f) {
        this.f4774u.mo6867e(f);
    }

    public void setFlexShrink(float f) {
        this.f4774u.mo6870f(f);
    }

    public void setShouldNotifyOnLayout(boolean z) {
        this.f4759f = z;
    }

    /* renamed from: t */
    public final String mo5606t() {
        String str = this.f4756c;
        C1136a.m5053a(str);
        return str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(this.f4756c);
        sb.append(" ");
        sb.append(mo5592g());
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    public final float mo5607u() {
        return this.f4774u.mo6873g();
    }

    /* renamed from: v */
    public int mo5608v() {
        return this.f4767n;
    }

    /* renamed from: w */
    public boolean mo5609w() {
        return false;
    }

    /* renamed from: x */
    public final float mo5610x() {
        return this.f4774u.mo6869f();
    }

    /* renamed from: y */
    public void mo5611y() {
        this.f4774u.mo6891o();
    }

    /* renamed from: z */
    public final C1570F m6234z() {
        return this.f4765l;
    }
}
