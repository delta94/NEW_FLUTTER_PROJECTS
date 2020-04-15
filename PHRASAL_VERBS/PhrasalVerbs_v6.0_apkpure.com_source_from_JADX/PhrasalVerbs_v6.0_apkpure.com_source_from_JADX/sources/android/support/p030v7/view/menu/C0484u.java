package android.support.p030v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.support.p030v7.view.menu.C0485v.C0486a;
import android.view.View;
import android.widget.PopupWindow.OnDismissListener;
import p000a.p005b.p009c.p018g.C0139f;
import p000a.p005b.p009c.p018g.C0156v;

/* renamed from: android.support.v7.view.menu.u */
public class C0484u implements C0472n {

    /* renamed from: a */
    private final Context f1772a;

    /* renamed from: b */
    private final C0468l f1773b;

    /* renamed from: c */
    private final boolean f1774c;

    /* renamed from: d */
    private final int f1775d;

    /* renamed from: e */
    private final int f1776e;

    /* renamed from: f */
    private View f1777f;

    /* renamed from: g */
    private int f1778g;

    /* renamed from: h */
    private boolean f1779h;

    /* renamed from: i */
    private C0486a f1780i;

    /* renamed from: j */
    private C0482s f1781j;

    /* renamed from: k */
    private OnDismissListener f1782k;

    /* renamed from: l */
    private final OnDismissListener f1783l;

    public C0484u(Context context, C0468l lVar, View view, boolean z, int i) {
        this(context, lVar, view, z, i, 0);
    }

    public C0484u(Context context, C0468l lVar, View view, boolean z, int i, int i2) {
        this.f1778g = 8388611;
        this.f1783l = new C0483t(this);
        this.f1772a = context;
        this.f1773b = lVar;
        this.f1777f = view;
        this.f1774c = z;
        this.f1775d = i;
        this.f1776e = i2;
    }

    /* renamed from: a */
    private void m2306a(int i, int i2, boolean z, boolean z2) {
        C0482s b = mo2377b();
        b.mo2055c(z2);
        if (z) {
            if ((C0139f.m475a(this.f1778g, C0156v.m565g(this.f1777f)) & 7) == 5) {
                i -= this.f1777f.getWidth();
            }
            b.mo2050b(i);
            b.mo2054c(i2);
            int i3 = (int) ((this.f1772a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            b.mo2366a(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        b.mo2053c();
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [android.support.v7.view.menu.v, android.support.v7.view.menu.s] */
    /* JADX WARNING: type inference failed for: r7v0, types: [android.support.v7.view.menu.C] */
    /* JADX WARNING: type inference failed for: r1v12, types: [android.support.v7.view.menu.i] */
    /* JADX WARNING: type inference failed for: r7v1, types: [android.support.v7.view.menu.C] */
    /* JADX WARNING: type inference failed for: r1v13, types: [android.support.v7.view.menu.i] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r7v1, types: [android.support.v7.view.menu.C]
      assigns: [android.support.v7.view.menu.C, android.support.v7.view.menu.i]
      uses: [android.support.v7.view.menu.C, android.support.v7.view.menu.s, android.support.v7.view.menu.v, android.support.v7.view.menu.i]
      mth insns count: 49
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.support.p030v7.view.menu.C0482s m2307g() {
        /*
            r14 = this;
            android.content.Context r0 = r14.f1772a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x001d
            r0.getRealSize(r1)
            goto L_0x0020
        L_0x001d:
            r0.getSize(r1)
        L_0x0020:
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f1772a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = p000a.p005b.p021d.p022a.C0166d.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x004c
            android.support.v7.view.menu.i r0 = new android.support.v7.view.menu.i
            android.content.Context r2 = r14.f1772a
            android.view.View r3 = r14.f1777f
            int r4 = r14.f1775d
            int r5 = r14.f1776e
            boolean r6 = r14.f1774c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x005e
        L_0x004c:
            android.support.v7.view.menu.C r0 = new android.support.v7.view.menu.C
            android.content.Context r8 = r14.f1772a
            android.support.v7.view.menu.l r9 = r14.f1773b
            android.view.View r10 = r14.f1777f
            int r11 = r14.f1775d
            int r12 = r14.f1776e
            boolean r13 = r14.f1774c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x005e:
            android.support.v7.view.menu.l r1 = r14.f1773b
            r0.mo2042a(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f1783l
            r0.mo2046a(r1)
            android.view.View r1 = r14.f1777f
            r0.mo2045a(r1)
            android.support.v7.view.menu.v$a r1 = r14.f1780i
            r0.mo2044a(r1)
            boolean r1 = r14.f1779h
            r0.mo2051b(r1)
            int r1 = r14.f1778g
            r0.mo2041a(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v7.view.menu.C0484u.m2307g():android.support.v7.view.menu.s");
    }

    /* renamed from: a */
    public void mo2370a() {
        if (mo2378c()) {
            this.f1781j.dismiss();
        }
    }

    /* renamed from: a */
    public void mo2371a(int i) {
        this.f1778g = i;
    }

    /* renamed from: a */
    public void mo2372a(C0486a aVar) {
        this.f1780i = aVar;
        C0482s sVar = this.f1781j;
        if (sVar != null) {
            sVar.mo2044a(aVar);
        }
    }

    /* renamed from: a */
    public void mo2373a(View view) {
        this.f1777f = view;
    }

    /* renamed from: a */
    public void mo2374a(OnDismissListener onDismissListener) {
        this.f1782k = onDismissListener;
    }

    /* renamed from: a */
    public void mo2375a(boolean z) {
        this.f1779h = z;
        C0482s sVar = this.f1781j;
        if (sVar != null) {
            sVar.mo2051b(z);
        }
    }

    /* renamed from: a */
    public boolean mo2376a(int i, int i2) {
        if (mo2378c()) {
            return true;
        }
        if (this.f1777f == null) {
            return false;
        }
        m2306a(i, i2, true, true);
        return true;
    }

    /* renamed from: b */
    public C0482s mo2377b() {
        if (this.f1781j == null) {
            this.f1781j = m2307g();
        }
        return this.f1781j;
    }

    /* renamed from: c */
    public boolean mo2378c() {
        C0482s sVar = this.f1781j;
        return sVar != null && sVar.mo2052b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo2379d() {
        this.f1781j = null;
        OnDismissListener onDismissListener = this.f1782k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: e */
    public void mo2380e() {
        if (!mo2381f()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: f */
    public boolean mo2381f() {
        if (mo2378c()) {
            return true;
        }
        if (this.f1777f == null) {
            return false;
        }
        m2306a(0, 0, false, false);
        return true;
    }
}
