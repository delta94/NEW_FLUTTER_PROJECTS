package android.support.p030v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.p029v4.graphics.drawable.C0311a;
import android.support.p029v4.util.C0320b;
import android.support.p029v4.util.C0326h;
import android.support.p029v4.util.C0327i;
import android.support.p029v4.util.C0339p;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import p000a.p005b.p007b.p008a.C0020d;
import p000a.p005b.p007b.p008a.C0030k;
import p000a.p005b.p009c.p010a.C0039a;
import p000a.p005b.p009c.p012b.C0061a;
import p000a.p005b.p021d.p022a.C0163a;
import p000a.p005b.p021d.p022a.C0167e;
import p000a.p005b.p021d.p025c.p026a.C0176b;

/* renamed from: android.support.v7.widget.o */
public final class C0600o {

    /* renamed from: a */
    private static final Mode f2307a = Mode.SRC_IN;

    /* renamed from: b */
    private static C0600o f2308b;

    /* renamed from: c */
    private static final C0603c f2309c = new C0603c(6);

    /* renamed from: d */
    private static final int[] f2310d = {C0167e.abc_textfield_search_default_mtrl_alpha, C0167e.abc_textfield_default_mtrl_alpha, C0167e.abc_ab_share_pack_mtrl_alpha};

    /* renamed from: e */
    private static final int[] f2311e = {C0167e.abc_ic_commit_search_api_mtrl_alpha, C0167e.abc_seekbar_tick_mark_material, C0167e.abc_ic_menu_share_mtrl_alpha, C0167e.abc_ic_menu_copy_mtrl_am_alpha, C0167e.abc_ic_menu_cut_mtrl_alpha, C0167e.abc_ic_menu_selectall_mtrl_alpha, C0167e.abc_ic_menu_paste_mtrl_am_alpha};

    /* renamed from: f */
    private static final int[] f2312f = {C0167e.abc_textfield_activated_mtrl_alpha, C0167e.abc_textfield_search_activated_mtrl_alpha, C0167e.abc_cab_background_top_mtrl_alpha, C0167e.abc_text_cursor_material, C0167e.abc_text_select_handle_left_mtrl_dark, C0167e.abc_text_select_handle_middle_mtrl_dark, C0167e.abc_text_select_handle_right_mtrl_dark, C0167e.abc_text_select_handle_left_mtrl_light, C0167e.abc_text_select_handle_middle_mtrl_light, C0167e.abc_text_select_handle_right_mtrl_light};

    /* renamed from: g */
    private static final int[] f2313g = {C0167e.abc_popup_background_mtrl_mult, C0167e.abc_cab_background_internal_bg, C0167e.abc_menu_hardkey_panel_mtrl_mult};

    /* renamed from: h */
    private static final int[] f2314h = {C0167e.abc_tab_indicator_material, C0167e.abc_textfield_search_material};

    /* renamed from: i */
    private static final int[] f2315i = {C0167e.abc_btn_check_material, C0167e.abc_btn_radio_material};

    /* renamed from: j */
    private WeakHashMap<Context, C0339p<ColorStateList>> f2316j;

    /* renamed from: k */
    private C0320b<String, C0604d> f2317k;

    /* renamed from: l */
    private C0339p<String> f2318l;

    /* renamed from: m */
    private final WeakHashMap<Context, C0326h<WeakReference<ConstantState>>> f2319m = new WeakHashMap<>(0);

    /* renamed from: n */
    private TypedValue f2320n;

    /* renamed from: o */
    private boolean f2321o;

    /* renamed from: android.support.v7.widget.o$a */
    static class C0601a implements C0604d {
        C0601a() {
        }

        /* renamed from: a */
        public Drawable mo3147a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C0176b.m601a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* renamed from: android.support.v7.widget.o$b */
    private static class C0602b implements C0604d {
        C0602b() {
        }

        /* renamed from: a */
        public Drawable mo3147a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C0020d.m30a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* renamed from: android.support.v7.widget.o$c */
    private static class C0603c extends C0327i<Integer, PorterDuffColorFilter> {
        public C0603c(int i) {
            super(i);
        }

        /* renamed from: b */
        private static int m2878b(int i, Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public PorterDuffColorFilter mo3148a(int i, Mode mode) {
            return (PorterDuffColorFilter) mo1366b(Integer.valueOf(m2878b(i, mode)));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public PorterDuffColorFilter mo3149a(int i, Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) mo1362a(Integer.valueOf(m2878b(i, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: android.support.v7.widget.o$d */
    private interface C0604d {
        /* renamed from: a */
        Drawable mo3147a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme);
    }

    /* renamed from: android.support.v7.widget.o$e */
    private static class C0605e implements C0604d {
        C0605e() {
        }

        /* renamed from: a */
        public Drawable mo3147a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C0030k.createFromXmlInner(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    private static long m2846a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* renamed from: a */
    static Mode m2847a(int i) {
        if (i == C0167e.abc_switch_thumb_material) {
            return Mode.MULTIPLY;
        }
        return null;
    }

    /* renamed from: a */
    public static synchronized PorterDuffColorFilter m2848a(int i, Mode mode) {
        PorterDuffColorFilter a;
        synchronized (C0600o.class) {
            a = f2309c.mo3148a(i, mode);
            if (a == null) {
                a = new PorterDuffColorFilter(i, mode);
                f2309c.mo3149a(i, mode, a);
            }
        }
        return a;
    }

    /* renamed from: a */
    private static PorterDuffColorFilter m2849a(ColorStateList colorStateList, Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m2848a(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: a */
    private Drawable m2850a(Context context, int i, boolean z, Drawable drawable) {
        LayerDrawable layerDrawable;
        Drawable findDrawableByLayerId;
        int i2;
        ColorStateList b = mo3146b(context, i);
        if (b != null) {
            if (C0525M.m2560a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable h = C0311a.m1350h(drawable);
            C0311a.m1336a(h, b);
            Mode a = m2847a(i);
            if (a == null) {
                return h;
            }
            C0311a.m1339a(h, a);
            return h;
        }
        if (i == C0167e.abc_seekbar_track_material) {
            layerDrawable = (LayerDrawable) drawable;
            m2854a(layerDrawable.findDrawableByLayerId(16908288), C0610qa.m2901b(context, C0163a.colorControlNormal), f2307a);
            findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
            i2 = C0163a.colorControlNormal;
        } else if (i == C0167e.abc_ratingbar_material || i == C0167e.abc_ratingbar_indicator_material || i == C0167e.abc_ratingbar_small_material) {
            layerDrawable = (LayerDrawable) drawable;
            m2854a(layerDrawable.findDrawableByLayerId(16908288), C0610qa.m2898a(context, C0163a.colorControlNormal), f2307a);
            findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
            i2 = C0163a.colorControlActivated;
        } else if (m2858a(context, i, drawable) || !z) {
            return drawable;
        } else {
            return null;
        }
        m2854a(findDrawableByLayerId, C0610qa.m2901b(context, i2), f2307a);
        m2854a(layerDrawable.findDrawableByLayerId(16908301), C0610qa.m2901b(context, C0163a.colorControlActivated), f2307a);
        return drawable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable m2851a(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, android.support.v4.util.h<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f2319m     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            android.support.v4.util.h r0 = (android.support.p029v4.util.C0326h) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.mo1356b(r5)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.mo1352a(r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v7.widget.C0600o.m2851a(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    public static synchronized C0600o m2852a() {
        C0600o oVar;
        synchronized (C0600o.class) {
            if (f2308b == null) {
                f2308b = new C0600o();
                m2856a(f2308b);
            }
            oVar = f2308b;
        }
        return oVar;
    }

    /* renamed from: a */
    private void m2853a(Context context, int i, ColorStateList colorStateList) {
        if (this.f2316j == null) {
            this.f2316j = new WeakHashMap<>();
        }
        C0339p pVar = (C0339p) this.f2316j.get(context);
        if (pVar == null) {
            pVar = new C0339p();
            this.f2316j.put(context, pVar);
        }
        pVar.mo1451a(i, colorStateList);
    }

    /* renamed from: a */
    private static void m2854a(Drawable drawable, int i, Mode mode) {
        if (C0525M.m2560a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f2307a;
        }
        drawable.setColorFilter(m2848a(i, mode));
    }

    /* renamed from: a */
    static void m2855a(Drawable drawable, C0616ta taVar, int[] iArr) {
        if (!C0525M.m2560a(drawable) || drawable.mutate() == drawable) {
            if (taVar.f2389d || taVar.f2388c) {
                drawable.setColorFilter(m2849a(taVar.f2389d ? taVar.f2386a : null, taVar.f2388c ? taVar.f2387b : f2307a, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
            return;
        }
        Log.d("AppCompatDrawableManag", "Mutated drawable is not the same instance as the input.");
    }

    /* renamed from: a */
    private static void m2856a(C0600o oVar) {
        if (VERSION.SDK_INT < 24) {
            oVar.m2857a("vector", (C0604d) new C0605e());
            oVar.m2857a("animated-vector", (C0604d) new C0602b());
            oVar.m2857a("animated-selector", (C0604d) new C0601a());
        }
    }

    /* renamed from: a */
    private void m2857a(String str, C0604d dVar) {
        if (this.f2317k == null) {
            this.f2317k = new C0320b<>();
        }
        this.f2317k.put(str, dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0061 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m2858a(android.content.Context r6, int r7, android.graphics.drawable.Drawable r8) {
        /*
            android.graphics.PorterDuff$Mode r0 = f2307a
            int[] r1 = f2310d
            boolean r1 = m2861a(r1, r7)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            r3 = -1
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0015
            int r2 = p000a.p005b.p021d.p022a.C0163a.colorControlNormal
        L_0x0012:
            r7 = 1
            r1 = -1
            goto L_0x0044
        L_0x0015:
            int[] r1 = f2312f
            boolean r1 = m2861a(r1, r7)
            if (r1 == 0) goto L_0x0020
            int r2 = p000a.p005b.p021d.p022a.C0163a.colorControlActivated
            goto L_0x0012
        L_0x0020:
            int[] r1 = f2313g
            boolean r1 = m2861a(r1, r7)
            if (r1 == 0) goto L_0x002b
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0012
        L_0x002b:
            int r1 = p000a.p005b.p021d.p022a.C0167e.abc_list_divider_mtrl_alpha
            if (r7 != r1) goto L_0x003c
            r2 = 16842800(0x1010030, float:2.3693693E-38)
            r7 = 1109603123(0x42233333, float:40.8)
            int r7 = java.lang.Math.round(r7)
            r1 = r7
            r7 = 1
            goto L_0x0044
        L_0x003c:
            int r1 = p000a.p005b.p021d.p022a.C0167e.abc_dialog_material_background
            if (r7 != r1) goto L_0x0041
            goto L_0x0012
        L_0x0041:
            r7 = 0
            r1 = -1
            r2 = 0
        L_0x0044:
            if (r7 == 0) goto L_0x0061
            boolean r7 = android.support.p030v7.widget.C0525M.m2560a(r8)
            if (r7 == 0) goto L_0x0050
            android.graphics.drawable.Drawable r8 = r8.mutate()
        L_0x0050:
            int r6 = android.support.p030v7.widget.C0610qa.m2901b(r6, r2)
            android.graphics.PorterDuffColorFilter r6 = m2848a(r6, r0)
            r8.setColorFilter(r6)
            if (r1 == r3) goto L_0x0060
            r8.setAlpha(r1)
        L_0x0060:
            return r5
        L_0x0061:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v7.widget.C0600o.m2858a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    /* renamed from: a */
    private synchronized boolean m2859a(Context context, long j, Drawable drawable) {
        boolean z;
        ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C0326h hVar = (C0326h) this.f2319m.get(context);
            if (hVar == null) {
                hVar = new C0326h();
                this.f2319m.put(context, hVar);
            }
            hVar.mo1358c(j, new WeakReference(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    private static boolean m2860a(Drawable drawable) {
        if (!(drawable instanceof C0030k)) {
            if (!"android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m2861a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m2862b(Context context) {
        if (!this.f2321o) {
            this.f2321o = true;
            Drawable a = mo3142a(context, C0167e.abc_vector_test);
            if (a == null || !m2860a(a)) {
                this.f2321o = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    /* renamed from: c */
    private ColorStateList m2863c(Context context) {
        return m2864c(context, 0);
    }

    /* renamed from: c */
    private ColorStateList m2864c(Context context, int i) {
        int b = C0610qa.m2901b(context, C0163a.colorControlHighlight);
        return new ColorStateList(new int[][]{C0610qa.f2365b, C0610qa.f2368e, C0610qa.f2366c, C0610qa.f2372i}, new int[]{C0610qa.m2898a(context, C0163a.colorButtonNormal), C0061a.m191a(b, i), C0061a.m191a(b, i), i});
    }

    /* renamed from: d */
    private ColorStateList m2865d(Context context) {
        return m2864c(context, C0610qa.m2901b(context, C0163a.colorAccent));
    }

    /* renamed from: d */
    private Drawable m2866d(Context context, int i) {
        if (this.f2320n == null) {
            this.f2320n = new TypedValue();
        }
        TypedValue typedValue = this.f2320n;
        context.getResources().getValue(i, typedValue, true);
        long a = m2846a(typedValue);
        Drawable a2 = m2851a(context, a);
        if (a2 != null) {
            return a2;
        }
        if (i == C0167e.abc_cab_background_top_material) {
            a2 = new LayerDrawable(new Drawable[]{mo3142a(context, C0167e.abc_cab_background_internal_bg), mo3142a(context, C0167e.abc_cab_background_top_mtrl_alpha)});
        }
        if (a2 != null) {
            a2.setChangingConfigurations(typedValue.changingConfigurations);
            m2859a(context, a, a2);
        }
        return a2;
    }

    /* renamed from: e */
    private ColorStateList m2867e(Context context) {
        return m2864c(context, C0610qa.m2901b(context, C0163a.colorButtonNormal));
    }

    /* renamed from: e */
    private ColorStateList m2868e(Context context, int i) {
        WeakHashMap<Context, C0339p<ColorStateList>> weakHashMap = this.f2316j;
        if (weakHashMap == null) {
            return null;
        }
        C0339p pVar = (C0339p) weakHashMap.get(context);
        if (pVar != null) {
            return (ColorStateList) pVar.mo1453b(i);
        }
        return null;
    }

    /* renamed from: f */
    private ColorStateList m2869f(Context context) {
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList c = C0610qa.m2902c(context, C0163a.colorSwitchThumbNormal);
        if (c == null || !c.isStateful()) {
            iArr[0] = C0610qa.f2365b;
            iArr2[0] = C0610qa.m2898a(context, C0163a.colorSwitchThumbNormal);
            iArr[1] = C0610qa.f2369f;
            iArr2[1] = C0610qa.m2901b(context, C0163a.colorControlActivated);
            iArr[2] = C0610qa.f2372i;
            iArr2[2] = C0610qa.m2901b(context, C0163a.colorSwitchThumbNormal);
        } else {
            iArr[0] = C0610qa.f2365b;
            iArr2[0] = c.getColorForState(iArr[0], 0);
            iArr[1] = C0610qa.f2369f;
            iArr2[1] = C0610qa.m2901b(context, C0163a.colorControlActivated);
            iArr[2] = C0610qa.f2372i;
            iArr2[2] = c.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ Exception -> 0x00a2 }] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m2870f(android.content.Context r11, int r12) {
        /*
            r10 = this;
            android.support.v4.util.b<java.lang.String, android.support.v7.widget.o$d> r0 = r10.f2317k
            r1 = 0
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b2
            android.support.v4.util.p<java.lang.String> r0 = r10.f2318l
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.mo1453b(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            android.support.v4.util.b<java.lang.String, android.support.v7.widget.o$d> r3 = r10.f2317k
            java.lang.Object r0 = r3.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            android.support.v4.util.p r0 = new android.support.v4.util.p
            r0.<init>()
            r10.f2318l = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.f2320n
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f2320n = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.f2320n
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            long r4 = m2846a(r0)
            android.graphics.drawable.Drawable r6 = r10.m2851a(r11, r4)
            if (r6 == 0) goto L_0x004f
            return r6
        L_0x004f:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00aa
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00aa
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x00a2 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a2 }
        L_0x0067:
            int r8 = r1.next()     // Catch:{ Exception -> 0x00a2 }
            r9 = 2
            if (r8 == r9) goto L_0x0071
            if (r8 == r3) goto L_0x0071
            goto L_0x0067
        L_0x0071:
            if (r8 != r9) goto L_0x009a
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00a2 }
            android.support.v4.util.p<java.lang.String> r8 = r10.f2318l     // Catch:{ Exception -> 0x00a2 }
            r8.mo1451a(r12, r3)     // Catch:{ Exception -> 0x00a2 }
            android.support.v4.util.b<java.lang.String, android.support.v7.widget.o$d> r8 = r10.f2317k     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x00a2 }
            android.support.v7.widget.o$d r3 = (android.support.p030v7.widget.C0600o.C0604d) r3     // Catch:{ Exception -> 0x00a2 }
            if (r3 == 0) goto L_0x008f
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x00a2 }
            android.graphics.drawable.Drawable r1 = r3.mo3147a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x00a2 }
            r6 = r1
        L_0x008f:
            if (r6 == 0) goto L_0x00aa
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a2 }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a2 }
            r10.m2859a(r11, r4, r6)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00aa
        L_0x009a:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x00a2 }
            throw r11     // Catch:{ Exception -> 0x00a2 }
        L_0x00a2:
            r11 = move-exception
            java.lang.String r0 = "AppCompatDrawableManag"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r11)
        L_0x00aa:
            if (r6 != 0) goto L_0x00b1
            android.support.v4.util.p<java.lang.String> r11 = r10.f2318l
            r11.mo1451a(r12, r2)
        L_0x00b1:
            return r6
        L_0x00b2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v7.widget.C0600o.m2870f(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    public synchronized Drawable mo3142a(Context context, int i) {
        return mo3143a(context, i, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized Drawable mo3143a(Context context, int i, boolean z) {
        Drawable f;
        m2862b(context);
        f = m2870f(context, i);
        if (f == null) {
            f = m2866d(context, i);
        }
        if (f == null) {
            f = C0039a.m111c(context, i);
        }
        if (f != null) {
            f = m2850a(context, i, z, f);
        }
        if (f != null) {
            C0525M.m2561b(f);
        }
        return f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized Drawable mo3144a(Context context, C0519Ia ia, int i) {
        Drawable f = m2870f(context, i);
        if (f == null) {
            f = ia.mo2679a(i);
        }
        if (f == null) {
            return null;
        }
        return m2850a(context, i, false, f);
    }

    /* renamed from: a */
    public synchronized void mo3145a(Context context) {
        C0326h hVar = (C0326h) this.f2319m.get(context);
        if (hVar != null) {
            hVar.mo1351a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0078  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.content.res.ColorStateList mo3146b(android.content.Context r3, int r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.res.ColorStateList r0 = r2.m2868e(r3, r4)     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x007b
            int r1 = p000a.p005b.p021d.p022a.C0167e.abc_edit_text_material     // Catch:{ all -> 0x007d }
            if (r4 != r1) goto L_0x0013
            int r0 = p000a.p005b.p021d.p022a.C0165c.abc_tint_edittext     // Catch:{ all -> 0x007d }
        L_0x000d:
            android.content.res.ColorStateList r0 = p000a.p005b.p021d.p023b.p024a.C0173a.m594a(r3, r0)     // Catch:{ all -> 0x007d }
            goto L_0x0076
        L_0x0013:
            int r1 = p000a.p005b.p021d.p022a.C0167e.abc_switch_track_mtrl_alpha     // Catch:{ all -> 0x007d }
            if (r4 != r1) goto L_0x001a
            int r0 = p000a.p005b.p021d.p022a.C0165c.abc_tint_switch_track     // Catch:{ all -> 0x007d }
            goto L_0x000d
        L_0x001a:
            int r1 = p000a.p005b.p021d.p022a.C0167e.abc_switch_thumb_material     // Catch:{ all -> 0x007d }
            if (r4 != r1) goto L_0x0023
            android.content.res.ColorStateList r0 = r2.m2869f(r3)     // Catch:{ all -> 0x007d }
            goto L_0x0076
        L_0x0023:
            int r1 = p000a.p005b.p021d.p022a.C0167e.abc_btn_default_mtrl_shape     // Catch:{ all -> 0x007d }
            if (r4 != r1) goto L_0x002c
            android.content.res.ColorStateList r0 = r2.m2867e(r3)     // Catch:{ all -> 0x007d }
            goto L_0x0076
        L_0x002c:
            int r1 = p000a.p005b.p021d.p022a.C0167e.abc_btn_borderless_material     // Catch:{ all -> 0x007d }
            if (r4 != r1) goto L_0x0035
            android.content.res.ColorStateList r0 = r2.m2863c(r3)     // Catch:{ all -> 0x007d }
            goto L_0x0076
        L_0x0035:
            int r1 = p000a.p005b.p021d.p022a.C0167e.abc_btn_colored_material     // Catch:{ all -> 0x007d }
            if (r4 != r1) goto L_0x003e
            android.content.res.ColorStateList r0 = r2.m2865d(r3)     // Catch:{ all -> 0x007d }
            goto L_0x0076
        L_0x003e:
            int r1 = p000a.p005b.p021d.p022a.C0167e.abc_spinner_mtrl_am_alpha     // Catch:{ all -> 0x007d }
            if (r4 == r1) goto L_0x0073
            int r1 = p000a.p005b.p021d.p022a.C0167e.abc_spinner_textfield_background_material     // Catch:{ all -> 0x007d }
            if (r4 != r1) goto L_0x0047
            goto L_0x0073
        L_0x0047:
            int[] r1 = f2311e     // Catch:{ all -> 0x007d }
            boolean r1 = m2861a(r1, r4)     // Catch:{ all -> 0x007d }
            if (r1 == 0) goto L_0x0056
            int r0 = p000a.p005b.p021d.p022a.C0163a.colorControlNormal     // Catch:{ all -> 0x007d }
            android.content.res.ColorStateList r0 = android.support.p030v7.widget.C0610qa.m2902c(r3, r0)     // Catch:{ all -> 0x007d }
            goto L_0x0076
        L_0x0056:
            int[] r1 = f2314h     // Catch:{ all -> 0x007d }
            boolean r1 = m2861a(r1, r4)     // Catch:{ all -> 0x007d }
            if (r1 == 0) goto L_0x0061
            int r0 = p000a.p005b.p021d.p022a.C0165c.abc_tint_default     // Catch:{ all -> 0x007d }
            goto L_0x000d
        L_0x0061:
            int[] r1 = f2315i     // Catch:{ all -> 0x007d }
            boolean r1 = m2861a(r1, r4)     // Catch:{ all -> 0x007d }
            if (r1 == 0) goto L_0x006c
            int r0 = p000a.p005b.p021d.p022a.C0165c.abc_tint_btn_checkable     // Catch:{ all -> 0x007d }
            goto L_0x000d
        L_0x006c:
            int r1 = p000a.p005b.p021d.p022a.C0167e.abc_seekbar_thumb_material     // Catch:{ all -> 0x007d }
            if (r4 != r1) goto L_0x0076
            int r0 = p000a.p005b.p021d.p022a.C0165c.abc_tint_seek_thumb     // Catch:{ all -> 0x007d }
            goto L_0x000d
        L_0x0073:
            int r0 = p000a.p005b.p021d.p022a.C0165c.abc_tint_spinner     // Catch:{ all -> 0x007d }
            goto L_0x000d
        L_0x0076:
            if (r0 == 0) goto L_0x007b
            r2.m2853a(r3, r4, r0)     // Catch:{ all -> 0x007d }
        L_0x007b:
            monitor-exit(r2)
            return r0
        L_0x007d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v7.widget.C0600o.mo3146b(android.content.Context, int):android.content.res.ColorStateList");
    }
}
