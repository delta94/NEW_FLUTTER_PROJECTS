package p000a.p005b.p021d.p025c.p026a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.support.p029v4.graphics.drawable.C0311a;
import android.util.SparseArray;

/* renamed from: a.b.d.c.a.d */
class C0184d extends Drawable implements Callback {

    /* renamed from: a */
    private C0186b f426a;

    /* renamed from: b */
    private Rect f427b;

    /* renamed from: c */
    private Drawable f428c;

    /* renamed from: d */
    private Drawable f429d;

    /* renamed from: e */
    private int f430e = 255;

    /* renamed from: f */
    private boolean f431f;

    /* renamed from: g */
    private int f432g = -1;

    /* renamed from: h */
    private int f433h = -1;

    /* renamed from: i */
    private boolean f434i;

    /* renamed from: j */
    private Runnable f435j;

    /* renamed from: k */
    private long f436k;

    /* renamed from: l */
    private long f437l;

    /* renamed from: m */
    private C0185a f438m;

    /* renamed from: a.b.d.c.a.d$a */
    static class C0185a implements Callback {

        /* renamed from: a */
        private Callback f439a;

        C0185a() {
        }

        /* renamed from: a */
        public C0185a mo622a(Callback callback) {
            this.f439a = callback;
            return this;
        }

        /* renamed from: a */
        public Callback mo623a() {
            Callback callback = this.f439a;
            this.f439a = null;
            return callback;
        }

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Callback callback = this.f439a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Callback callback = this.f439a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: a.b.d.c.a.d$b */
    static abstract class C0186b extends ConstantState {

        /* renamed from: A */
        int f440A;

        /* renamed from: B */
        int f441B;

        /* renamed from: C */
        boolean f442C;

        /* renamed from: D */
        ColorFilter f443D;

        /* renamed from: E */
        boolean f444E;

        /* renamed from: F */
        ColorStateList f445F;

        /* renamed from: G */
        Mode f446G;

        /* renamed from: H */
        boolean f447H;

        /* renamed from: I */
        boolean f448I;

        /* renamed from: a */
        final C0184d f449a;

        /* renamed from: b */
        Resources f450b;

        /* renamed from: c */
        int f451c = 160;

        /* renamed from: d */
        int f452d;

        /* renamed from: e */
        int f453e;

        /* renamed from: f */
        SparseArray<ConstantState> f454f;

        /* renamed from: g */
        Drawable[] f455g;

        /* renamed from: h */
        int f456h;

        /* renamed from: i */
        boolean f457i;

        /* renamed from: j */
        boolean f458j;

        /* renamed from: k */
        Rect f459k;

        /* renamed from: l */
        boolean f460l;

        /* renamed from: m */
        boolean f461m;

        /* renamed from: n */
        int f462n;

        /* renamed from: o */
        int f463o;

        /* renamed from: p */
        int f464p;

        /* renamed from: q */
        int f465q;

        /* renamed from: r */
        boolean f466r;

        /* renamed from: s */
        int f467s;

        /* renamed from: t */
        boolean f468t;

        /* renamed from: u */
        boolean f469u;

        /* renamed from: v */
        boolean f470v;

        /* renamed from: w */
        boolean f471w;

        /* renamed from: x */
        boolean f472x;

        /* renamed from: y */
        boolean f473y;

        /* renamed from: z */
        int f474z;

        C0186b(C0186b bVar, C0184d dVar, Resources resources) {
            this.f457i = false;
            this.f460l = false;
            this.f472x = true;
            this.f440A = 0;
            this.f441B = 0;
            this.f449a = dVar;
            Resources resources2 = resources != null ? resources : bVar != null ? bVar.f450b : null;
            this.f450b = resources2;
            this.f451c = C0184d.m636a(resources, bVar != null ? bVar.f451c : 0);
            if (bVar != null) {
                this.f452d = bVar.f452d;
                this.f453e = bVar.f453e;
                this.f470v = true;
                this.f471w = true;
                this.f457i = bVar.f457i;
                this.f460l = bVar.f460l;
                this.f472x = bVar.f472x;
                this.f473y = bVar.f473y;
                this.f474z = bVar.f474z;
                this.f440A = bVar.f440A;
                this.f441B = bVar.f441B;
                this.f442C = bVar.f442C;
                this.f443D = bVar.f443D;
                this.f444E = bVar.f444E;
                this.f445F = bVar.f445F;
                this.f446G = bVar.f446G;
                this.f447H = bVar.f447H;
                this.f448I = bVar.f448I;
                if (bVar.f451c == this.f451c) {
                    if (bVar.f458j) {
                        this.f459k = new Rect(bVar.f459k);
                        this.f458j = true;
                    }
                    if (bVar.f461m) {
                        this.f462n = bVar.f462n;
                        this.f463o = bVar.f463o;
                        this.f464p = bVar.f464p;
                        this.f465q = bVar.f465q;
                        this.f461m = true;
                    }
                }
                if (bVar.f466r) {
                    this.f467s = bVar.f467s;
                    this.f466r = true;
                }
                if (bVar.f468t) {
                    this.f469u = bVar.f469u;
                    this.f468t = true;
                }
                Drawable[] drawableArr = bVar.f455g;
                this.f455g = new Drawable[drawableArr.length];
                this.f456h = bVar.f456h;
                SparseArray<ConstantState> sparseArray = bVar.f454f;
                this.f454f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f456h);
                int i = this.f456h;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null) {
                        ConstantState constantState = drawableArr[i2].getConstantState();
                        if (constantState != null) {
                            this.f454f.put(i2, constantState);
                        } else {
                            this.f455g[i2] = drawableArr[i2];
                        }
                    }
                }
                return;
            }
            this.f455g = new Drawable[10];
            this.f456h = 0;
        }

        /* renamed from: b */
        private Drawable m647b(Drawable drawable) {
            if (VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.f474z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f449a);
            return mutate;
        }

        /* renamed from: n */
        private void m648n() {
            SparseArray<ConstantState> sparseArray = this.f454f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f455g[this.f454f.keyAt(i)] = m647b(((ConstantState) this.f454f.valueAt(i)).newDrawable(this.f450b));
                }
                this.f454f = null;
            }
        }

        /* renamed from: a */
        public final int mo627a(Drawable drawable) {
            int i = this.f456h;
            if (i >= this.f455g.length) {
                mo629a(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f449a);
            this.f455g[i] = drawable;
            this.f456h++;
            this.f453e = drawable.getChangingConfigurations() | this.f453e;
            mo649k();
            this.f459k = null;
            this.f458j = false;
            this.f461m = false;
            this.f470v = false;
            return i;
        }

        /* renamed from: a */
        public final Drawable mo628a(int i) {
            Drawable drawable = this.f455g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<ConstantState> sparseArray = this.f454f;
            if (sparseArray != null) {
                int indexOfKey = sparseArray.indexOfKey(i);
                if (indexOfKey >= 0) {
                    Drawable b = m647b(((ConstantState) this.f454f.valueAt(indexOfKey)).newDrawable(this.f450b));
                    this.f455g[i] = b;
                    this.f454f.removeAt(indexOfKey);
                    if (this.f454f.size() == 0) {
                        this.f454f = null;
                    }
                    return b;
                }
            }
            return null;
        }

        /* renamed from: a */
        public void mo629a(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            System.arraycopy(this.f455g, 0, drawableArr, 0, i);
            this.f455g = drawableArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo630a(Theme theme) {
            if (theme != null) {
                m648n();
                int i = this.f456h;
                Drawable[] drawableArr = this.f455g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                        drawableArr[i2].applyTheme(theme);
                        this.f453e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                mo631a(theme.getResources());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo631a(Resources resources) {
            if (resources != null) {
                this.f450b = resources;
                int a = C0184d.m636a(resources, this.f451c);
                int i = this.f451c;
                this.f451c = a;
                if (i != a) {
                    this.f461m = false;
                    this.f458j = false;
                }
            }
        }

        /* renamed from: a */
        public final void mo632a(boolean z) {
            this.f460l = z;
        }

        /* renamed from: a */
        public synchronized boolean mo633a() {
            if (this.f470v) {
                return this.f471w;
            }
            m648n();
            this.f470v = true;
            int i = this.f456h;
            Drawable[] drawableArr = this.f455g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f471w = false;
                    return false;
                }
            }
            this.f471w = true;
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo634b() {
            this.f461m = true;
            m648n();
            int i = this.f456h;
            Drawable[] drawableArr = this.f455g;
            this.f463o = -1;
            this.f462n = -1;
            this.f465q = 0;
            this.f464p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f462n) {
                    this.f462n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f463o) {
                    this.f463o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f464p) {
                    this.f464p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f465q) {
                    this.f465q = minimumHeight;
                }
            }
        }

        /* renamed from: b */
        public final void mo635b(int i) {
            this.f440A = i;
        }

        /* renamed from: b */
        public final void mo636b(boolean z) {
            this.f457i = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo637b(int i, int i2) {
            int i3 = this.f456h;
            Drawable[] drawableArr = this.f455g;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    boolean layoutDirection = VERSION.SDK_INT >= 23 ? drawableArr[i4].setLayoutDirection(i) : false;
                    if (i4 == i2) {
                        z = layoutDirection;
                    }
                }
            }
            this.f474z = i;
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final int mo638c() {
            return this.f455g.length;
        }

        /* renamed from: c */
        public final void mo639c(int i) {
            this.f441B = i;
        }

        public boolean canApplyTheme() {
            int i = this.f456h;
            Drawable[] drawableArr = this.f455g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    ConstantState constantState = (ConstantState) this.f454f.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public final int mo641d() {
            return this.f456h;
        }

        /* renamed from: e */
        public final int mo642e() {
            if (!this.f461m) {
                mo634b();
            }
            return this.f463o;
        }

        /* renamed from: f */
        public final int mo643f() {
            if (!this.f461m) {
                mo634b();
            }
            return this.f465q;
        }

        /* renamed from: g */
        public final int mo644g() {
            if (!this.f461m) {
                mo634b();
            }
            return this.f464p;
        }

        public int getChangingConfigurations() {
            return this.f452d | this.f453e;
        }

        /* renamed from: h */
        public final Rect mo646h() {
            if (this.f457i) {
                return null;
            }
            if (this.f459k != null || this.f458j) {
                return this.f459k;
            }
            m648n();
            Rect rect = new Rect();
            int i = this.f456h;
            Drawable[] drawableArr = this.f455g;
            Rect rect2 = null;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect)) {
                    if (rect2 == null) {
                        rect2 = new Rect(0, 0, 0, 0);
                    }
                    int i3 = rect.left;
                    if (i3 > rect2.left) {
                        rect2.left = i3;
                    }
                    int i4 = rect.top;
                    if (i4 > rect2.top) {
                        rect2.top = i4;
                    }
                    int i5 = rect.right;
                    if (i5 > rect2.right) {
                        rect2.right = i5;
                    }
                    int i6 = rect.bottom;
                    if (i6 > rect2.bottom) {
                        rect2.bottom = i6;
                    }
                }
            }
            this.f458j = true;
            this.f459k = rect2;
            return rect2;
        }

        /* renamed from: i */
        public final int mo647i() {
            if (!this.f461m) {
                mo634b();
            }
            return this.f462n;
        }

        /* renamed from: j */
        public final int mo648j() {
            if (this.f466r) {
                return this.f467s;
            }
            m648n();
            int i = this.f456h;
            Drawable[] drawableArr = this.f455g;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.f467s = opacity;
            this.f466r = true;
            return opacity;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public void mo649k() {
            this.f466r = false;
            this.f468t = false;
        }

        /* renamed from: l */
        public final boolean mo650l() {
            return this.f460l;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public abstract void mo606m();
    }

    C0184d() {
    }

    /* renamed from: a */
    static int m636a(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    /* renamed from: a */
    private void m637a(Drawable drawable) {
        if (this.f438m == null) {
            this.f438m = new C0185a();
        }
        C0185a aVar = this.f438m;
        aVar.mo622a(drawable.getCallback());
        drawable.setCallback(aVar);
        try {
            if (this.f426a.f440A <= 0 && this.f431f) {
                drawable.setAlpha(this.f430e);
            }
            if (this.f426a.f444E) {
                drawable.setColorFilter(this.f426a.f443D);
            } else {
                if (this.f426a.f447H) {
                    C0311a.m1336a(drawable, this.f426a.f445F);
                }
                if (this.f426a.f448I) {
                    C0311a.m1339a(drawable, this.f426a.f446G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f426a.f472x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (VERSION.SDK_INT >= 19) {
                drawable.setAutoMirrored(this.f426a.f442C);
            }
            Rect rect = this.f427b;
            if (VERSION.SDK_INT >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f438m.mo623a());
        }
    }

    @SuppressLint({"WrongConstant"})
    @TargetApi(23)
    /* renamed from: c */
    private boolean m638c() {
        return isAutoMirrored() && getLayoutDirection() == 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0186b mo562a() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo563a(C0186b bVar) {
        this.f426a = bVar;
        int i = this.f432g;
        if (i >= 0) {
            this.f428c = bVar.mo628a(i);
            Drawable drawable = this.f428c;
            if (drawable != null) {
                m637a(drawable);
            }
        }
        this.f433h = -1;
        this.f429d = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo615a(Resources resources) {
        this.f426a.mo631a(resources);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo616a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f431f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f428c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0036
            long r9 = r13.f436k
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x0038
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0020
            int r9 = r13.f430e
            r3.setAlpha(r9)
            goto L_0x0036
        L_0x0020:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            a.b.d.c.a.d$b r9 = r13.f426a
            int r9 = r9.f440A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f430e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L_0x0039
        L_0x0036:
            r13.f436k = r7
        L_0x0038:
            r3 = 0
        L_0x0039:
            android.graphics.drawable.Drawable r9 = r13.f429d
            if (r9 == 0) goto L_0x0064
            long r10 = r13.f437l
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0066
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0051
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f429d = r0
            r0 = -1
            r13.f433h = r0
            goto L_0x0064
        L_0x0051:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            a.b.d.c.a.d$b r4 = r13.f426a
            int r4 = r4.f441B
            int r3 = r3 / r4
            int r4 = r13.f430e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0067
        L_0x0064:
            r13.f437l = r7
        L_0x0066:
            r0 = r3
        L_0x0067:
            if (r14 == 0) goto L_0x0073
            if (r0 == 0) goto L_0x0073
            java.lang.Runnable r14 = r13.f435j
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p021d.p025c.p026a.C0184d.mo616a(boolean):void");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0079  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo617a(int r9) {
        /*
            r8 = this;
            int r0 = r8.f432g
            r1 = 0
            if (r9 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            a.b.d.c.a.d$b r0 = r8.f426a
            int r0 = r0.f441B
            r4 = -1
            r5 = 0
            r6 = 0
            if (r0 <= 0) goto L_0x0035
            android.graphics.drawable.Drawable r0 = r8.f429d
            if (r0 == 0) goto L_0x001b
            r0.setVisible(r1, r1)
        L_0x001b:
            android.graphics.drawable.Drawable r0 = r8.f428c
            if (r0 == 0) goto L_0x002e
            r8.f429d = r0
            int r0 = r8.f432g
            r8.f433h = r0
            a.b.d.c.a.d$b r0 = r8.f426a
            int r0 = r0.f441B
            long r0 = (long) r0
            long r0 = r0 + r2
            r8.f437l = r0
            goto L_0x003c
        L_0x002e:
            r8.f429d = r5
            r8.f433h = r4
            r8.f437l = r6
            goto L_0x003c
        L_0x0035:
            android.graphics.drawable.Drawable r0 = r8.f428c
            if (r0 == 0) goto L_0x003c
            r0.setVisible(r1, r1)
        L_0x003c:
            if (r9 < 0) goto L_0x005c
            a.b.d.c.a.d$b r0 = r8.f426a
            int r1 = r0.f456h
            if (r9 >= r1) goto L_0x005c
            android.graphics.drawable.Drawable r0 = r0.mo628a(r9)
            r8.f428c = r0
            r8.f432g = r9
            if (r0 == 0) goto L_0x0060
            a.b.d.c.a.d$b r9 = r8.f426a
            int r9 = r9.f440A
            if (r9 <= 0) goto L_0x0058
            long r4 = (long) r9
            long r2 = r2 + r4
            r8.f436k = r2
        L_0x0058:
            r8.m637a(r0)
            goto L_0x0060
        L_0x005c:
            r8.f428c = r5
            r8.f432g = r4
        L_0x0060:
            long r0 = r8.f436k
            r9 = 1
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x006d
            long r0 = r8.f437l
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x007f
        L_0x006d:
            java.lang.Runnable r0 = r8.f435j
            if (r0 != 0) goto L_0x0079
            a.b.d.c.a.c r0 = new a.b.d.c.a.c
            r0.<init>(r8)
            r8.f435j = r0
            goto L_0x007c
        L_0x0079:
            r8.unscheduleSelf(r0)
        L_0x007c:
            r8.mo616a(r9)
        L_0x007f:
            r8.invalidateSelf()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p021d.p025c.p026a.C0184d.mo617a(int):boolean");
    }

    public void applyTheme(Theme theme) {
        this.f426a.mo630a(theme);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo618b() {
        return this.f432g;
    }

    public boolean canApplyTheme() {
        return this.f426a.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f428c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f429d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public int getAlpha() {
        return this.f430e;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f426a.getChangingConfigurations();
    }

    public final ConstantState getConstantState() {
        if (!this.f426a.mo633a()) {
            return null;
        }
        this.f426a.f452d = getChangingConfigurations();
        return this.f426a;
    }

    public Drawable getCurrent() {
        return this.f428c;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f427b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f426a.mo650l()) {
            return this.f426a.mo642e();
        }
        Drawable drawable = this.f428c;
        return drawable != null ? drawable.getIntrinsicHeight() : -1;
    }

    public int getIntrinsicWidth() {
        if (this.f426a.mo650l()) {
            return this.f426a.mo647i();
        }
        Drawable drawable = this.f428c;
        return drawable != null ? drawable.getIntrinsicWidth() : -1;
    }

    public int getMinimumHeight() {
        if (this.f426a.mo650l()) {
            return this.f426a.mo643f();
        }
        Drawable drawable = this.f428c;
        return drawable != null ? drawable.getMinimumHeight() : 0;
    }

    public int getMinimumWidth() {
        if (this.f426a.mo650l()) {
            return this.f426a.mo644g();
        }
        Drawable drawable = this.f428c;
        return drawable != null ? drawable.getMinimumWidth() : 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f428c;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f426a.mo648j();
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f428c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        Rect h = this.f426a.mo646h();
        if (h != null) {
            rect.set(h);
            z = (h.right | ((h.left | h.top) | h.bottom)) != 0;
        } else {
            Drawable drawable = this.f428c;
            z = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (m638c()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return z;
    }

    public void invalidateDrawable(Drawable drawable) {
        C0186b bVar = this.f426a;
        if (bVar != null) {
            bVar.mo649k();
        }
        if (drawable == this.f428c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f426a.f442C;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f429d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f429d = null;
            this.f433h = -1;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f428c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f431f) {
                this.f428c.setAlpha(this.f430e);
            }
        }
        if (this.f437l != 0) {
            this.f437l = 0;
            z = true;
        }
        if (this.f436k != 0) {
            this.f436k = 0;
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f434i && super.mutate() == this) {
            C0186b a = mo562a();
            a.mo606m();
            mo563a(a);
            this.f434i = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f429d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f428c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        return this.f426a.mo637b(i, mo618b());
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f429d;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f428c;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f429d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f428c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f428c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (!this.f431f || this.f430e != i) {
            this.f431f = true;
            this.f430e = i;
            Drawable drawable = this.f428c;
            if (drawable == null) {
                return;
            }
            if (this.f436k == 0) {
                drawable.setAlpha(i);
            } else {
                mo616a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        C0186b bVar = this.f426a;
        if (bVar.f442C != z) {
            bVar.f442C = z;
            Drawable drawable = this.f428c;
            if (drawable != null) {
                C0311a.m1340a(drawable, bVar.f442C);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        C0186b bVar = this.f426a;
        bVar.f444E = true;
        if (bVar.f443D != colorFilter) {
            bVar.f443D = colorFilter;
            Drawable drawable = this.f428c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        C0186b bVar = this.f426a;
        if (bVar.f472x != z) {
            bVar.f472x = z;
            Drawable drawable = this.f428c;
            if (drawable != null) {
                drawable.setDither(bVar.f472x);
            }
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f428c;
        if (drawable != null) {
            C0311a.m1334a(drawable, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f427b;
        if (rect == null) {
            this.f427b = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f428c;
        if (drawable != null) {
            C0311a.m1335a(drawable, i, i2, i3, i4);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        C0186b bVar = this.f426a;
        bVar.f447H = true;
        if (bVar.f445F != colorStateList) {
            bVar.f445F = colorStateList;
            C0311a.m1336a(this.f428c, colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        C0186b bVar = this.f426a;
        bVar.f448I = true;
        if (bVar.f446G != mode) {
            bVar.f446G = mode;
            C0311a.m1339a(this.f428c, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f429d;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f428c;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f428c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
