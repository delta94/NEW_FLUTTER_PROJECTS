package android.support.p030v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.p029v4.graphics.drawable.C0311a;
import android.support.p030v7.view.menu.ActionMenuItemView;
import android.support.p030v7.view.menu.ActionMenuItemView.C0450b;
import android.support.p030v7.view.menu.C0453D;
import android.support.p030v7.view.menu.C0456b;
import android.support.p030v7.view.menu.C0468l;
import android.support.p030v7.view.menu.C0474p;
import android.support.p030v7.view.menu.C0484u;
import android.support.p030v7.view.menu.C0485v.C0486a;
import android.support.p030v7.view.menu.C0487w;
import android.support.p030v7.view.menu.C0487w.C0488a;
import android.support.p030v7.view.menu.C0491z;
import android.support.p030v7.widget.ActionMenuView.C0496a;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import java.util.ArrayList;
import p000a.p005b.p009c.p018g.C0136e;
import p000a.p005b.p009c.p018g.C0136e.C0137a;
import p000a.p005b.p021d.p022a.C0163a;
import p000a.p005b.p021d.p022a.C0169g;
import p000a.p005b.p021d.p028e.C0191a;

/* renamed from: android.support.v7.widget.g */
class C0577g extends C0456b implements C0137a {

    /* renamed from: A */
    C0578a f2230A;

    /* renamed from: B */
    C0580c f2231B;

    /* renamed from: C */
    private C0579b f2232C;

    /* renamed from: D */
    final C0583f f2233D = new C0583f();

    /* renamed from: E */
    int f2234E;

    /* renamed from: k */
    C0581d f2235k;

    /* renamed from: l */
    private Drawable f2236l;

    /* renamed from: m */
    private boolean f2237m;

    /* renamed from: n */
    private boolean f2238n;

    /* renamed from: o */
    private boolean f2239o;

    /* renamed from: p */
    private int f2240p;

    /* renamed from: q */
    private int f2241q;

    /* renamed from: r */
    private int f2242r;

    /* renamed from: s */
    private boolean f2243s;

    /* renamed from: t */
    private boolean f2244t;

    /* renamed from: u */
    private boolean f2245u;

    /* renamed from: v */
    private boolean f2246v;

    /* renamed from: w */
    private int f2247w;

    /* renamed from: x */
    private final SparseBooleanArray f2248x = new SparseBooleanArray();

    /* renamed from: y */
    private View f2249y;

    /* renamed from: z */
    C0582e f2250z;

    /* renamed from: android.support.v7.widget.g$a */
    private class C0578a extends C0484u {
        public C0578a(Context context, C0453D d, View view) {
            super(context, d, view, false, C0163a.actionOverflowMenuStyle);
            if (!((C0474p) d.getItem()).mo2276h()) {
                View view2 = C0577g.this.f2235k;
                if (view2 == null) {
                    view2 = (View) C0577g.this.f1639i;
                }
                mo2373a(view2);
            }
            mo2372a((C0486a) C0577g.this.f2233D);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo2379d() {
            C0577g gVar = C0577g.this;
            gVar.f2230A = null;
            gVar.f2234E = 0;
            super.mo2379d();
        }
    }

    /* renamed from: android.support.v7.widget.g$b */
    private class C0579b extends C0450b {
        C0579b() {
        }

        /* renamed from: a */
        public C0491z mo2038a() {
            C0578a aVar = C0577g.this.f2230A;
            if (aVar != null) {
                return aVar.mo2377b();
            }
            return null;
        }
    }

    /* renamed from: android.support.v7.widget.g$c */
    private class C0580c implements Runnable {

        /* renamed from: a */
        private C0582e f2253a;

        public C0580c(C0582e eVar) {
            this.f2253a = eVar;
        }

        public void run() {
            if (C0577g.this.f1633c != null) {
                C0577g.this.f1633c.mo2189a();
            }
            View view = (View) C0577g.this.f1639i;
            if (!(view == null || view.getWindowToken() == null || !this.f2253a.mo2381f())) {
                C0577g.this.f2250z = this.f2253a;
            }
            C0577g.this.f2231B = null;
        }
    }

    /* renamed from: android.support.v7.widget.g$d */
    private class C0581d extends C0615t implements C0496a {

        /* renamed from: c */
        private final float[] f2255c = new float[2];

        public C0581d(Context context) {
            super(context, null, C0163a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0509Da.m2457a(this, getContentDescription());
            setOnTouchListener(new C0585h(this, this, C0577g.this));
        }

        /* renamed from: a */
        public boolean mo2018a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo2019b() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0577g.this.mo3069i();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0311a.m1335a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: android.support.v7.widget.g$e */
    private class C0582e extends C0484u {
        public C0582e(Context context, C0468l lVar, View view, boolean z) {
            super(context, lVar, view, z, C0163a.actionOverflowMenuStyle);
            mo2371a(8388613);
            mo2372a((C0486a) C0577g.this.f2233D);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo2379d() {
            if (C0577g.this.f1633c != null) {
                C0577g.this.f1633c.close();
            }
            C0577g.this.f2250z = null;
            super.mo2379d();
        }
    }

    /* renamed from: android.support.v7.widget.g$f */
    private class C0583f implements C0486a {
        C0583f() {
        }

        /* renamed from: a */
        public void mo2000a(C0468l lVar, boolean z) {
            if (lVar instanceof C0453D) {
                lVar.mo2066m().mo2195a(false);
            }
            C0486a b = C0577g.this.mo2147b();
            if (b != null) {
                b.mo2000a(lVar, z);
            }
        }

        /* renamed from: a */
        public boolean mo2001a(C0468l lVar) {
            boolean z = false;
            if (lVar == null) {
                return false;
            }
            C0577g.this.f2234E = ((C0453D) lVar).getItem().getItemId();
            C0486a b = C0577g.this.mo2147b();
            if (b != null) {
                z = b.mo2001a(lVar);
            }
            return z;
        }
    }

    public C0577g(Context context) {
        super(context, C0169g.abc_action_menu_layout, C0169g.abc_action_menu_item_layout);
    }

    /* renamed from: a */
    private View m2767a(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f1639i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof C0488a) && ((C0488a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public View mo2139a(C0474p pVar, View view, ViewGroup viewGroup) {
        View actionView = pVar.getActionView();
        if (actionView == null || pVar.mo2262f()) {
            actionView = super.mo2139a(pVar, view, viewGroup);
        }
        actionView.setVisibility(pVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    /* renamed from: a */
    public void mo2141a(Context context, C0468l lVar) {
        super.mo2141a(context, lVar);
        Resources resources = context.getResources();
        C0191a a = C0191a.m682a(context);
        if (!this.f2239o) {
            this.f2238n = a.mo696g();
        }
        if (!this.f2245u) {
            this.f2240p = a.mo691b();
        }
        if (!this.f2243s) {
            this.f2242r = a.mo692c();
        }
        int i = this.f2240p;
        if (this.f2238n) {
            if (this.f2235k == null) {
                this.f2235k = new C0581d(this.f1631a);
                if (this.f2237m) {
                    this.f2235k.setImageDrawable(this.f2236l);
                    this.f2236l = null;
                    this.f2237m = false;
                }
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
                this.f2235k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f2235k.getMeasuredWidth();
        } else {
            this.f2235k = null;
        }
        this.f2241q = i;
        this.f2247w = (int) (resources.getDisplayMetrics().density * 56.0f);
        this.f2249y = null;
    }

    /* renamed from: a */
    public void mo3058a(Configuration configuration) {
        if (!this.f2243s) {
            this.f2242r = C0191a.m682a(this.f1632b).mo692c();
        }
        C0468l lVar = this.f1633c;
        if (lVar != null) {
            lVar.mo2211b(true);
        }
    }

    /* renamed from: a */
    public void mo3059a(Drawable drawable) {
        C0581d dVar = this.f2235k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f2237m = true;
        this.f2236l = drawable;
    }

    /* renamed from: a */
    public void mo2043a(C0468l lVar, boolean z) {
        mo3063c();
        super.mo2043a(lVar, z);
    }

    /* renamed from: a */
    public void mo2142a(C0474p pVar, C0488a aVar) {
        aVar.mo2017a(pVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f1639i);
        if (this.f2232C == null) {
            this.f2232C = new C0579b();
        }
        actionMenuItemView.setPopupCallback(this.f2232C);
    }

    /* renamed from: a */
    public void mo3060a(ActionMenuView actionMenuView) {
        this.f1639i = actionMenuView;
        actionMenuView.mo2090a(this.f1633c);
    }

    /* renamed from: a */
    public void mo2047a(boolean z) {
        super.mo2047a(z);
        ((View) this.f1639i).requestLayout();
        C0468l lVar = this.f1633c;
        boolean z2 = false;
        if (lVar != null) {
            ArrayList c = lVar.mo2213c();
            int size = c.size();
            for (int i = 0; i < size; i++) {
                C0136e a = ((C0474p) c.get(i)).mo242a();
                if (a != null) {
                    a.mo490a((C0137a) this);
                }
            }
        }
        C0468l lVar2 = this.f1633c;
        ArrayList j = lVar2 != null ? lVar2.mo2231j() : null;
        if (this.f2238n && j != null) {
            int size2 = j.size();
            if (size2 == 1) {
                z2 = !((C0474p) j.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f2235k == null) {
                this.f2235k = new C0581d(this.f1631a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f2235k.getParent();
            if (viewGroup != this.f1639i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f2235k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1639i;
                actionMenuView.addView(this.f2235k, actionMenuView.mo2497b());
            }
        } else {
            C0581d dVar = this.f2235k;
            if (dVar != null) {
                ViewParent parent = dVar.getParent();
                C0487w wVar = this.f1639i;
                if (parent == wVar) {
                    ((ViewGroup) wVar).removeView(this.f2235k);
                }
            }
        }
        ((ActionMenuView) this.f1639i).setOverflowReserved(this.f2238n);
    }

    /* renamed from: a */
    public boolean mo2048a() {
        int i;
        ArrayList arrayList;
        int i2;
        int i3;
        int i4;
        boolean z;
        C0577g gVar = this;
        C0468l lVar = gVar.f1633c;
        int i5 = 0;
        if (lVar != null) {
            arrayList = lVar.mo2234n();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = gVar.f2242r;
        int i7 = gVar.f2241q;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) gVar.f1639i;
        int i8 = i6;
        boolean z2 = false;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            C0474p pVar = (C0474p) arrayList.get(i11);
            if (pVar.mo2284k()) {
                i9++;
            } else if (pVar.mo2283j()) {
                i10++;
            } else {
                z2 = true;
            }
            if (gVar.f2246v && pVar.isActionViewExpanded()) {
                i8 = 0;
            }
        }
        if (gVar.f2238n && (z2 || i10 + i9 > i8)) {
            i8--;
        }
        int i12 = i8 - i9;
        SparseBooleanArray sparseBooleanArray = gVar.f2248x;
        sparseBooleanArray.clear();
        if (gVar.f2244t) {
            int i13 = gVar.f2247w;
            i2 = i7 / i13;
            i3 = i13 + ((i7 % i13) / i2);
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i14 = i7;
        int i15 = 0;
        int i16 = 0;
        while (i15 < i) {
            C0474p pVar2 = (C0474p) arrayList.get(i15);
            if (pVar2.mo2284k()) {
                View a = gVar.mo2139a(pVar2, gVar.f2249y, viewGroup);
                if (gVar.f2249y == null) {
                    gVar.f2249y = a;
                }
                if (gVar.f2244t) {
                    i2 -= ActionMenuView.m2380a(a, i3, i2, makeMeasureSpec, i5);
                } else {
                    a.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = a.getMeasuredWidth();
                i14 -= measuredWidth;
                if (i16 != 0) {
                    measuredWidth = i16;
                }
                int groupId = pVar2.getGroupId();
                if (groupId != 0) {
                    z = true;
                    sparseBooleanArray.put(groupId, true);
                } else {
                    z = true;
                }
                pVar2.mo2259d(z);
                i4 = i;
                i16 = measuredWidth;
            } else if (pVar2.mo2283j()) {
                int groupId2 = pVar2.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i12 > 0 || z3) && i14 > 0 && (!gVar.f2244t || i2 > 0);
                if (z4) {
                    boolean z5 = z4;
                    View a2 = gVar.mo2139a(pVar2, gVar.f2249y, viewGroup);
                    i4 = i;
                    if (gVar.f2249y == null) {
                        gVar.f2249y = a2;
                    }
                    if (gVar.f2244t) {
                        int a3 = ActionMenuView.m2380a(a2, i3, i2, makeMeasureSpec, 0);
                        i2 -= a3;
                        if (a3 == 0) {
                            z5 = false;
                        }
                    } else {
                        a2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    int measuredWidth2 = a2.getMeasuredWidth();
                    i14 -= measuredWidth2;
                    if (i16 == 0) {
                        i16 = measuredWidth2;
                    }
                    z4 = z5 & (!gVar.f2244t ? i14 + i16 > 0 : i14 >= 0);
                } else {
                    boolean z6 = z4;
                    i4 = i;
                }
                if (z4 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    int i17 = 0;
                    while (i17 < i15) {
                        C0474p pVar3 = (C0474p) arrayList.get(i17);
                        if (pVar3.getGroupId() == groupId2) {
                            if (pVar3.mo2276h()) {
                                i12++;
                            }
                            pVar3.mo2259d(false);
                        }
                        i17++;
                    }
                }
                if (z4) {
                    i12--;
                }
                pVar2.mo2259d(z4);
            } else {
                i4 = i;
                pVar2.mo2259d(false);
                i15++;
                i5 = 0;
                gVar = this;
                i = i4;
            }
            i15++;
            i5 = 0;
            gVar = this;
            i = i4;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo2144a(int i, C0474p pVar) {
        return pVar.mo2276h();
    }

    /* renamed from: a */
    public boolean mo2049a(C0453D d) {
        boolean z = false;
        if (!d.hasVisibleItems()) {
            return false;
        }
        C0453D d2 = d;
        while (d2.mo2079t() != this.f1633c) {
            d2 = (C0453D) d2.mo2079t();
        }
        View a = m2767a(d2.getItem());
        if (a == null) {
            return false;
        }
        this.f2234E = d.getItem().getItemId();
        int size = d.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = d.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        this.f2230A = new C0578a(this.f1632b, d, a);
        this.f2230A.mo2375a(z);
        this.f2230A.mo2380e();
        super.mo2049a(d);
        return true;
    }

    /* renamed from: a */
    public boolean mo2146a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f2235k) {
            return false;
        }
        return super.mo2146a(viewGroup, i);
    }

    /* renamed from: b */
    public C0487w mo2148b(ViewGroup viewGroup) {
        C0487w wVar = this.f1639i;
        C0487w b = super.mo2148b(viewGroup);
        if (wVar != b) {
            ((ActionMenuView) b).setPresenter(this);
        }
        return b;
    }

    /* renamed from: b */
    public void mo3061b(boolean z) {
        this.f2246v = z;
    }

    /* renamed from: c */
    public void mo3062c(boolean z) {
        this.f2238n = z;
        this.f2239o = true;
    }

    /* renamed from: c */
    public boolean mo3063c() {
        return mo3065e() | mo3066f();
    }

    /* renamed from: d */
    public Drawable mo3064d() {
        C0581d dVar = this.f2235k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f2237m) {
            return this.f2236l;
        }
        return null;
    }

    /* renamed from: e */
    public boolean mo3065e() {
        C0580c cVar = this.f2231B;
        if (cVar != null) {
            C0487w wVar = this.f1639i;
            if (wVar != null) {
                ((View) wVar).removeCallbacks(cVar);
                this.f2231B = null;
                return true;
            }
        }
        C0582e eVar = this.f2250z;
        if (eVar == null) {
            return false;
        }
        eVar.mo2370a();
        return true;
    }

    /* renamed from: f */
    public boolean mo3066f() {
        C0578a aVar = this.f2230A;
        if (aVar == null) {
            return false;
        }
        aVar.mo2370a();
        return true;
    }

    /* renamed from: g */
    public boolean mo3067g() {
        return this.f2231B != null || mo3068h();
    }

    /* renamed from: h */
    public boolean mo3068h() {
        C0582e eVar = this.f2250z;
        return eVar != null && eVar.mo2378c();
    }

    /* renamed from: i */
    public boolean mo3069i() {
        if (this.f2238n && !mo3068h()) {
            C0468l lVar = this.f1633c;
            if (lVar != null && this.f1639i != null && this.f2231B == null && !lVar.mo2231j().isEmpty()) {
                C0582e eVar = new C0582e(this.f1632b, this.f1633c, this.f2235k, true);
                this.f2231B = new C0580c(eVar);
                ((View) this.f1639i).post(this.f2231B);
                super.mo2049a((C0453D) null);
                return true;
            }
        }
        return false;
    }
}
