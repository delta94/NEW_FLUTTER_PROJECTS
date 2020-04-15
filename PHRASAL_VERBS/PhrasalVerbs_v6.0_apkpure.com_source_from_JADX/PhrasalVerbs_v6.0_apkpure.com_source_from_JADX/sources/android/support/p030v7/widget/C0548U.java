package android.support.p030v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.p029v4.widget.C0387s;
import android.support.p030v7.view.menu.C0491z;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import java.lang.reflect.Method;
import p000a.p005b.p009c.p018g.C0156v;
import p000a.p005b.p021d.p022a.C0172j;

/* renamed from: android.support.v7.widget.U */
public class C0548U implements C0491z {

    /* renamed from: a */
    private static Method f2127a;

    /* renamed from: b */
    private static Method f2128b;

    /* renamed from: c */
    private static Method f2129c;

    /* renamed from: A */
    final C0553e f2130A;

    /* renamed from: B */
    private final C0552d f2131B;

    /* renamed from: C */
    private final C0551c f2132C;

    /* renamed from: D */
    private final C0549a f2133D;

    /* renamed from: E */
    private Runnable f2134E;

    /* renamed from: F */
    final Handler f2135F;

    /* renamed from: G */
    private final Rect f2136G;

    /* renamed from: H */
    private Rect f2137H;

    /* renamed from: I */
    private boolean f2138I;

    /* renamed from: J */
    PopupWindow f2139J;

    /* renamed from: d */
    private Context f2140d;

    /* renamed from: e */
    private ListAdapter f2141e;

    /* renamed from: f */
    C0526N f2142f;

    /* renamed from: g */
    private int f2143g;

    /* renamed from: h */
    private int f2144h;

    /* renamed from: i */
    private int f2145i;

    /* renamed from: j */
    private int f2146j;

    /* renamed from: k */
    private int f2147k;

    /* renamed from: l */
    private boolean f2148l;

    /* renamed from: m */
    private boolean f2149m;

    /* renamed from: n */
    private boolean f2150n;

    /* renamed from: o */
    private boolean f2151o;

    /* renamed from: p */
    private int f2152p;

    /* renamed from: q */
    private boolean f2153q;

    /* renamed from: r */
    private boolean f2154r;

    /* renamed from: s */
    int f2155s;

    /* renamed from: t */
    private View f2156t;

    /* renamed from: u */
    private int f2157u;

    /* renamed from: v */
    private DataSetObserver f2158v;

    /* renamed from: w */
    private View f2159w;

    /* renamed from: x */
    private Drawable f2160x;

    /* renamed from: y */
    private OnItemClickListener f2161y;

    /* renamed from: z */
    private OnItemSelectedListener f2162z;

    /* renamed from: android.support.v7.widget.U$a */
    private class C0549a implements Runnable {
        C0549a() {
        }

        public void run() {
            C0548U.this.mo2912a();
        }
    }

    /* renamed from: android.support.v7.widget.U$b */
    private class C0550b extends DataSetObserver {
        C0550b() {
        }

        public void onChanged() {
            if (C0548U.this.mo2052b()) {
                C0548U.this.mo2053c();
            }
        }

        public void onInvalidated() {
            C0548U.this.dismiss();
        }
    }

    /* renamed from: android.support.v7.widget.U$c */
    private class C0551c implements OnScrollListener {
        C0551c() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !C0548U.this.mo2934j() && C0548U.this.f2139J.getContentView() != null) {
                C0548U u = C0548U.this;
                u.f2135F.removeCallbacks(u.f2130A);
                C0548U.this.f2130A.run();
            }
        }
    }

    /* renamed from: android.support.v7.widget.U$d */
    private class C0552d implements OnTouchListener {
        C0552d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0) {
                PopupWindow popupWindow = C0548U.this.f2139J;
                if (popupWindow != null && popupWindow.isShowing() && x >= 0 && x < C0548U.this.f2139J.getWidth() && y >= 0 && y < C0548U.this.f2139J.getHeight()) {
                    C0548U u = C0548U.this;
                    u.f2135F.postDelayed(u.f2130A, 250);
                    return false;
                }
            }
            if (action == 1) {
                C0548U u2 = C0548U.this;
                u2.f2135F.removeCallbacks(u2.f2130A);
            }
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.U$e */
    private class C0553e implements Runnable {
        C0553e() {
        }

        public void run() {
            C0526N n = C0548U.this.f2142f;
            if (n != null && C0156v.m576q(n) && C0548U.this.f2142f.getCount() > C0548U.this.f2142f.getChildCount()) {
                int childCount = C0548U.this.f2142f.getChildCount();
                C0548U u = C0548U.this;
                if (childCount <= u.f2155s) {
                    u.f2139J.setInputMethodMode(2);
                    C0548U.this.mo2053c();
                }
            }
        }
    }

    static {
        String str = "ListPopupWindow";
        try {
            f2127a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException unused) {
            Log.i(str, "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        try {
            f2128b = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
        } catch (NoSuchMethodException unused2) {
            Log.i(str, "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
        try {
            f2129c = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
        } catch (NoSuchMethodException unused3) {
            Log.i(str, "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        }
    }

    public C0548U(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C0548U(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f2143g = -2;
        this.f2144h = -2;
        this.f2147k = 1002;
        this.f2149m = true;
        this.f2152p = 0;
        this.f2153q = false;
        this.f2154r = false;
        this.f2155s = Integer.MAX_VALUE;
        this.f2157u = 0;
        this.f2130A = new C0553e();
        this.f2131B = new C0552d();
        this.f2132C = new C0551c();
        this.f2133D = new C0549a();
        this.f2136G = new Rect();
        this.f2140d = context;
        this.f2135F = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0172j.ListPopupWindow, i, i2);
        this.f2145i = obtainStyledAttributes.getDimensionPixelOffset(C0172j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.f2146j = obtainStyledAttributes.getDimensionPixelOffset(C0172j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.f2146j != 0) {
            this.f2148l = true;
        }
        obtainStyledAttributes.recycle();
        this.f2139J = new C0619v(context, attributeSet, i, i2);
        this.f2139J.setInputMethodMode(1);
    }

    /* renamed from: a */
    private int m2694a(View view, int i, boolean z) {
        Method method = f2128b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f2139J, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f2139J.getMaxAvailableHeight(view, i);
    }

    /* renamed from: c */
    private void mo2959c(boolean z) {
        Method method = f2127a;
        if (method != null) {
            try {
                method.invoke(this.f2139J, new Object[]{Boolean.valueOf(z)});
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0154  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int mo2566l() {
        /*
            r12 = this;
            android.support.v7.widget.N r0 = r12.f2142f
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00c1
            android.content.Context r0 = r12.f2140d
            android.support.v7.widget.S r5 = new android.support.v7.widget.S
            r5.<init>(r12)
            r12.f2134E = r5
            boolean r5 = r12.f2138I
            r5 = r5 ^ r3
            android.support.v7.widget.N r5 = r12.mo2911a(r0, r5)
            r12.f2142f = r5
            android.graphics.drawable.Drawable r5 = r12.f2160x
            if (r5 == 0) goto L_0x0024
            android.support.v7.widget.N r6 = r12.f2142f
            r6.setSelector(r5)
        L_0x0024:
            android.support.v7.widget.N r5 = r12.f2142f
            android.widget.ListAdapter r6 = r12.f2141e
            r5.setAdapter(r6)
            android.support.v7.widget.N r5 = r12.f2142f
            android.widget.AdapterView$OnItemClickListener r6 = r12.f2161y
            r5.setOnItemClickListener(r6)
            android.support.v7.widget.N r5 = r12.f2142f
            r5.setFocusable(r3)
            android.support.v7.widget.N r5 = r12.f2142f
            r5.setFocusableInTouchMode(r3)
            android.support.v7.widget.N r5 = r12.f2142f
            android.support.v7.widget.T r6 = new android.support.v7.widget.T
            r6.<init>(r12)
            r5.setOnItemSelectedListener(r6)
            android.support.v7.widget.N r5 = r12.f2142f
            android.support.v7.widget.U$c r6 = r12.f2132C
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.f2162z
            if (r5 == 0) goto L_0x0056
            android.support.v7.widget.N r6 = r12.f2142f
            r6.setOnItemSelectedListener(r5)
        L_0x0056:
            android.support.v7.widget.N r5 = r12.f2142f
            android.view.View r6 = r12.f2156t
            if (r6 == 0) goto L_0x00ba
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.f2157u
            if (r8 == 0) goto L_0x0091
            if (r8 == r3) goto L_0x008a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Invalid hint position "
            r0.append(r5)
            int r5 = r12.f2157u
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "ListPopupWindow"
            android.util.Log.e(r5, r0)
            goto L_0x0097
        L_0x008a:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x0097
        L_0x0091:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x0097:
            int r0 = r12.f2144h
            if (r0 < 0) goto L_0x009e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x00a0
        L_0x009e:
            r0 = 0
            r5 = 0
        L_0x00a0:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00bb
        L_0x00ba:
            r0 = 0
        L_0x00bb:
            android.widget.PopupWindow r6 = r12.f2139J
            r6.setContentView(r5)
            goto L_0x00df
        L_0x00c1:
            android.widget.PopupWindow r0 = r12.f2139J
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r12.f2156t
            if (r0 == 0) goto L_0x00de
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00df
        L_0x00de:
            r0 = 0
        L_0x00df:
            android.widget.PopupWindow r5 = r12.f2139J
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x00fb
            android.graphics.Rect r6 = r12.f2136G
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.f2136G
            int r6 = r5.top
            int r5 = r5.bottom
            int r5 = r5 + r6
            boolean r7 = r12.f2148l
            if (r7 != 0) goto L_0x0101
            int r6 = -r6
            r12.f2146j = r6
            goto L_0x0101
        L_0x00fb:
            android.graphics.Rect r5 = r12.f2136G
            r5.setEmpty()
            r5 = 0
        L_0x0101:
            android.widget.PopupWindow r6 = r12.f2139J
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x010b
            goto L_0x010c
        L_0x010b:
            r3 = 0
        L_0x010c:
            android.view.View r4 = r12.mo2924e()
            int r6 = r12.f2146j
            int r3 = r12.m2694a(r4, r6, r3)
            boolean r4 = r12.f2153q
            if (r4 != 0) goto L_0x0165
            int r4 = r12.f2143g
            if (r4 != r2) goto L_0x011f
            goto L_0x0165
        L_0x011f:
            int r4 = r12.f2144h
            r6 = -2
            if (r4 == r6) goto L_0x012e
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L_0x012e
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
        L_0x012c:
            r7 = r1
            goto L_0x0147
        L_0x012e:
            android.content.Context r2 = r12.f2140d
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.f2136G
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            goto L_0x012c
        L_0x0147:
            android.support.v7.widget.N r6 = r12.f2142f
            r8 = 0
            r9 = -1
            int r10 = r3 - r0
            r11 = -1
            int r1 = r6.mo2694a(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L_0x0163
            android.support.v7.widget.N r2 = r12.f2142f
            int r2 = r2.getPaddingTop()
            android.support.v7.widget.N r3 = r12.f2142f
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x0163:
            int r1 = r1 + r0
            return r1
        L_0x0165:
            int r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v7.widget.C0548U.mo2566l():int");
    }

    /* renamed from: m */
    private void mo2567m() {
        View view = this.f2156t;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f2156t);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0526N mo2911a(Context context, boolean z) {
        return new C0526N(context, z);
    }

    /* renamed from: a */
    public void mo2912a() {
        C0526N n = this.f2142f;
        if (n != null) {
            n.setListSelectionHidden(true);
            n.requestLayout();
        }
    }

    /* renamed from: a */
    public void mo2913a(int i) {
        this.f2139J.setAnimationStyle(i);
    }

    /* renamed from: a */
    public void mo2914a(Rect rect) {
        this.f2137H = rect;
    }

    /* renamed from: a */
    public void mo2915a(Drawable drawable) {
        this.f2139J.setBackgroundDrawable(drawable);
    }

    /* renamed from: a */
    public void mo2916a(View view) {
        this.f2159w = view;
    }

    /* renamed from: a */
    public void mo2917a(OnItemClickListener onItemClickListener) {
        this.f2161y = onItemClickListener;
    }

    /* renamed from: a */
    public void mo2563a(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f2158v;
        if (dataSetObserver == null) {
            this.f2158v = new C0550b();
        } else {
            ListAdapter listAdapter2 = this.f2141e;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f2141e = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2158v);
        }
        C0526N n = this.f2142f;
        if (n != null) {
            n.setAdapter(this.f2141e);
        }
    }

    /* renamed from: a */
    public void mo2918a(OnDismissListener onDismissListener) {
        this.f2139J.setOnDismissListener(onDismissListener);
    }

    /* renamed from: a */
    public void mo2919a(boolean z) {
        this.f2138I = z;
        this.f2139J.setFocusable(z);
    }

    /* renamed from: b */
    public void mo2920b(int i) {
        Drawable background = this.f2139J.getBackground();
        if (background != null) {
            background.getPadding(this.f2136G);
            Rect rect = this.f2136G;
            this.f2144h = rect.left + rect.right + i;
            return;
        }
        mo2933i(i);
    }

    /* renamed from: b */
    public void mo2921b(boolean z) {
        this.f2151o = true;
        this.f2150n = z;
    }

    /* renamed from: b */
    public boolean mo2052b() {
        return this.f2139J.isShowing();
    }

    /* renamed from: c */
    public void mo2053c() {
        int l = mo2566l();
        boolean j = mo2934j();
        C0387s.m1779a(this.f2139J, this.f2147k);
        boolean z = true;
        if (!this.f2139J.isShowing()) {
            int i = this.f2144h;
            if (i == -1) {
                i = -1;
            } else if (i == -2) {
                i = mo2924e().getWidth();
            }
            int i2 = this.f2143g;
            if (i2 == -1) {
                l = -1;
            } else if (i2 != -2) {
                l = i2;
            }
            this.f2139J.setWidth(i);
            this.f2139J.setHeight(l);
            mo2959c(true);
            this.f2139J.setOutsideTouchable(!this.f2154r && !this.f2153q);
            this.f2139J.setTouchInterceptor(this.f2131B);
            if (this.f2151o) {
                C0387s.m1781a(this.f2139J, this.f2150n);
            }
            Method method = f2129c;
            if (method != null) {
                try {
                    method.invoke(this.f2139J, new Object[]{this.f2137H});
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
            C0387s.m1780a(this.f2139J, mo2924e(), this.f2145i, this.f2146j, this.f2152p);
            this.f2142f.setSelection(-1);
            if (!this.f2138I || this.f2142f.isInTouchMode()) {
                mo2912a();
            }
            if (!this.f2138I) {
                this.f2135F.post(this.f2133D);
            }
        } else if (C0156v.m576q(mo2924e())) {
            int i3 = this.f2144h;
            if (i3 == -1) {
                i3 = -1;
            } else if (i3 == -2) {
                i3 = mo2924e().getWidth();
            }
            int i4 = this.f2143g;
            if (i4 == -1) {
                if (!j) {
                    l = -1;
                }
                if (j) {
                    this.f2139J.setWidth(this.f2144h == -1 ? -1 : 0);
                    this.f2139J.setHeight(0);
                } else {
                    this.f2139J.setWidth(this.f2144h == -1 ? -1 : 0);
                    this.f2139J.setHeight(-1);
                }
            } else if (i4 != -2) {
                l = i4;
            }
            PopupWindow popupWindow = this.f2139J;
            if (this.f2154r || this.f2153q) {
                z = false;
            }
            popupWindow.setOutsideTouchable(z);
            this.f2139J.update(mo2924e(), this.f2145i, this.f2146j, i3 < 0 ? -1 : i3, l < 0 ? -1 : l);
        }
    }

    /* renamed from: c */
    public void mo2922c(int i) {
        this.f2152p = i;
    }

    /* renamed from: d */
    public ListView mo2056d() {
        return this.f2142f;
    }

    /* renamed from: d */
    public void mo2923d(int i) {
        this.f2145i = i;
    }

    public void dismiss() {
        this.f2139J.dismiss();
        mo2567m();
        this.f2139J.setContentView(null);
        this.f2142f = null;
        this.f2135F.removeCallbacks(this.f2130A);
    }

    /* renamed from: e */
    public View mo2924e() {
        return this.f2159w;
    }

    /* renamed from: e */
    public void mo2925e(int i) {
        this.f2139J.setInputMethodMode(i);
    }

    /* renamed from: f */
    public Drawable mo2926f() {
        return this.f2139J.getBackground();
    }

    /* renamed from: f */
    public void mo2927f(int i) {
        this.f2157u = i;
    }

    /* renamed from: g */
    public int mo2928g() {
        return this.f2145i;
    }

    /* renamed from: g */
    public void mo2929g(int i) {
        C0526N n = this.f2142f;
        if (mo2052b() && n != null) {
            n.setListSelectionHidden(false);
            n.setSelection(i);
            if (n.getChoiceMode() != 0) {
                n.setItemChecked(i, true);
            }
        }
    }

    /* renamed from: h */
    public int mo2930h() {
        if (!this.f2148l) {
            return 0;
        }
        return this.f2146j;
    }

    /* renamed from: h */
    public void mo2931h(int i) {
        this.f2146j = i;
        this.f2148l = true;
    }

    /* renamed from: i */
    public int mo2932i() {
        return this.f2144h;
    }

    /* renamed from: i */
    public void mo2933i(int i) {
        this.f2144h = i;
    }

    /* renamed from: j */
    public boolean mo2934j() {
        return this.f2139J.getInputMethodMode() == 2;
    }

    /* renamed from: k */
    public boolean mo2935k() {
        return this.f2138I;
    }
}
