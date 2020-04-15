package android.support.p030v7.app;

import android.app.Activity;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p029v4.app.C0256U;
import android.support.p030v7.view.menu.C0465j;
import android.support.p030v7.view.menu.C0468l;
import android.support.p030v7.view.menu.C0468l.C0469a;
import android.support.p030v7.view.menu.C0485v;
import android.support.p030v7.view.menu.C0485v.C0486a;
import android.support.p030v7.view.menu.C0487w;
import android.support.p030v7.widget.ActionBarContextView;
import android.support.p030v7.widget.C0519Ia;
import android.support.p030v7.widget.C0521Ja;
import android.support.p030v7.widget.C0522K;
import android.support.p030v7.widget.C0529O;
import android.support.p030v7.widget.C0600o;
import android.support.p030v7.widget.C0620va;
import android.support.p030v7.widget.ContentFrameLayout;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import p000a.p005b.p009c.p018g.C0116H;
import p000a.p005b.p009c.p018g.C0118I;
import p000a.p005b.p009c.p018g.C0140g;
import p000a.p005b.p009c.p018g.C0140g.C0141a;
import p000a.p005b.p009c.p018g.C0142h;
import p000a.p005b.p009c.p018g.C0151q;
import p000a.p005b.p009c.p018g.C0156v;
import p000a.p005b.p021d.p022a.C0163a;
import p000a.p005b.p021d.p022a.C0165c;
import p000a.p005b.p021d.p022a.C0168f;
import p000a.p005b.p021d.p022a.C0169g;
import p000a.p005b.p021d.p022a.C0171i;
import p000a.p005b.p021d.p022a.C0172j;
import p000a.p005b.p021d.p023b.p024a.C0173a;
import p000a.p005b.p021d.p028e.C0192b;
import p000a.p005b.p021d.p028e.C0192b.C0193a;
import p000a.p005b.p021d.p028e.C0195d;
import p000a.p005b.p021d.p028e.C0197f.C0198a;
import p000a.p005b.p021d.p028e.C0199g;
import p000a.p005b.p021d.p028e.C0204j;

/* renamed from: android.support.v7.app.x */
class C0438x extends C0429o implements C0469a, Factory2 {

    /* renamed from: b */
    private static final boolean f1473b = (VERSION.SDK_INT < 21);

    /* renamed from: c */
    private static final int[] f1474c = {16842836};

    /* renamed from: d */
    private static boolean f1475d = true;

    /* renamed from: A */
    private boolean f1476A;

    /* renamed from: B */
    boolean f1477B;

    /* renamed from: C */
    boolean f1478C;

    /* renamed from: D */
    boolean f1479D;

    /* renamed from: E */
    boolean f1480E;

    /* renamed from: F */
    boolean f1481F;

    /* renamed from: G */
    private boolean f1482G;

    /* renamed from: H */
    private C0444f[] f1483H;

    /* renamed from: I */
    private C0444f f1484I;

    /* renamed from: J */
    private boolean f1485J;

    /* renamed from: K */
    boolean f1486K;

    /* renamed from: L */
    private int f1487L = -100;

    /* renamed from: M */
    private boolean f1488M;

    /* renamed from: N */
    private C0442d f1489N;

    /* renamed from: O */
    boolean f1490O;

    /* renamed from: P */
    int f1491P;

    /* renamed from: Q */
    private final Runnable f1492Q = new C0431q(this);

    /* renamed from: R */
    private boolean f1493R;

    /* renamed from: S */
    private Rect f1494S;

    /* renamed from: T */
    private Rect f1495T;

    /* renamed from: U */
    private AppCompatViewInflater f1496U;

    /* renamed from: e */
    final Context f1497e;

    /* renamed from: f */
    final Window f1498f;

    /* renamed from: g */
    final Callback f1499g;

    /* renamed from: h */
    final Callback f1500h;

    /* renamed from: i */
    final C0428n f1501i;

    /* renamed from: j */
    C0411a f1502j;

    /* renamed from: k */
    MenuInflater f1503k;

    /* renamed from: l */
    private CharSequence f1504l;

    /* renamed from: m */
    private C0522K f1505m;

    /* renamed from: n */
    private C0439a f1506n;

    /* renamed from: o */
    private C0445g f1507o;

    /* renamed from: p */
    C0192b f1508p;

    /* renamed from: q */
    ActionBarContextView f1509q;

    /* renamed from: r */
    PopupWindow f1510r;

    /* renamed from: s */
    Runnable f1511s;

    /* renamed from: t */
    C0116H f1512t = null;

    /* renamed from: u */
    private boolean f1513u = true;

    /* renamed from: v */
    private boolean f1514v;

    /* renamed from: w */
    private ViewGroup f1515w;

    /* renamed from: x */
    private TextView f1516x;

    /* renamed from: y */
    private View f1517y;

    /* renamed from: z */
    private boolean f1518z;

    /* renamed from: android.support.v7.app.x$a */
    private final class C0439a implements C0486a {
        C0439a() {
        }

        /* renamed from: a */
        public void mo2000a(C0468l lVar, boolean z) {
            C0438x.this.mo1980b(lVar);
        }

        /* renamed from: a */
        public boolean mo2001a(C0468l lVar) {
            Callback o = C0438x.this.mo1993o();
            if (o != null) {
                o.onMenuOpened(C0172j.AppCompatTheme_tooltipForegroundColor, lVar);
            }
            return true;
        }
    }

    /* renamed from: android.support.v7.app.x$b */
    class C0440b implements C0193a {

        /* renamed from: a */
        private C0193a f1520a;

        public C0440b(C0193a aVar) {
            this.f1520a = aVar;
        }

        /* renamed from: a */
        public void mo714a(C0192b bVar) {
            this.f1520a.mo714a(bVar);
            C0438x xVar = C0438x.this;
            if (xVar.f1510r != null) {
                xVar.f1498f.getDecorView().removeCallbacks(C0438x.this.f1511s);
            }
            C0438x xVar2 = C0438x.this;
            if (xVar2.f1509q != null) {
                xVar2.mo1990l();
                C0438x xVar3 = C0438x.this;
                C0116H a = C0156v.m537a(xVar3.f1509q);
                a.mo397a(0.0f);
                xVar3.f1512t = a;
                C0438x.this.f1512t.mo399a((C0118I) new C0446y(this));
            }
            C0438x xVar4 = C0438x.this;
            C0428n nVar = xVar4.f1501i;
            if (nVar != null) {
                nVar.mo1846a(xVar4.f1508p);
            }
            C0438x.this.f1508p = null;
        }

        /* renamed from: a */
        public boolean mo715a(C0192b bVar, Menu menu) {
            return this.f1520a.mo715a(bVar, menu);
        }

        /* renamed from: a */
        public boolean mo716a(C0192b bVar, MenuItem menuItem) {
            return this.f1520a.mo716a(bVar, menuItem);
        }

        /* renamed from: b */
        public boolean mo717b(C0192b bVar, Menu menu) {
            return this.f1520a.mo717b(bVar, menu);
        }
    }

    /* renamed from: android.support.v7.app.x$c */
    class C0441c extends C0204j {
        C0441c(Callback callback) {
            super(callback);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final ActionMode mo2002a(ActionMode.Callback callback) {
            C0198a aVar = new C0198a(C0438x.this.f1497e, callback);
            C0192b a = C0438x.this.mo1970a((C0193a) aVar);
            if (a != null) {
                return aVar.mo747b(a);
            }
            return null;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C0438x.this.mo1978a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || C0438x.this.mo1981b(keyEvent.getKeyCode(), keyEvent);
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0468l)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            C0438x.this.mo1986g(i);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            C0438x.this.mo1987h(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0468l lVar = menu instanceof C0468l ? (C0468l) menu : null;
            if (i == 0 && lVar == null) {
                return false;
            }
            if (lVar != null) {
                lVar.mo2215c(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (lVar != null) {
                lVar.mo2215c(false);
            }
            return onPreparePanel;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0444f a = C0438x.this.mo1971a(0, true);
            if (a != null) {
                C0468l lVar = a.f1538j;
                if (lVar != null) {
                    super.onProvideKeyboardShortcuts(list, lVar, i);
                    return;
                }
            }
            super.onProvideKeyboardShortcuts(list, menu, i);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (VERSION.SDK_INT >= 23) {
                return null;
            }
            return C0438x.this.mo1996p() ? mo2002a(callback) : super.onWindowStartingActionMode(callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (!C0438x.this.mo1996p() || i != 0) ? super.onWindowStartingActionMode(callback, i) : mo2002a(callback);
        }
    }

    /* renamed from: android.support.v7.app.x$d */
    final class C0442d {

        /* renamed from: a */
        private C0404E f1523a;

        /* renamed from: b */
        private boolean f1524b;

        /* renamed from: c */
        private BroadcastReceiver f1525c;

        /* renamed from: d */
        private IntentFilter f1526d;

        C0442d(C0404E e) {
            this.f1523a = e;
            this.f1524b = e.mo1862a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2004a() {
            BroadcastReceiver broadcastReceiver = this.f1525c;
            if (broadcastReceiver != null) {
                C0438x.this.f1497e.unregisterReceiver(broadcastReceiver);
                this.f1525c = null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo2005b() {
            boolean a = this.f1523a.mo1862a();
            if (a != this.f1524b) {
                this.f1524b = a;
                C0438x.this.mo1950a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo2006c() {
            this.f1524b = this.f1523a.mo1862a();
            return this.f1524b ? 2 : 1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo2007d() {
            mo2004a();
            if (this.f1525c == null) {
                this.f1525c = new C0447z(this);
            }
            if (this.f1526d == null) {
                this.f1526d = new IntentFilter();
                this.f1526d.addAction("android.intent.action.TIME_SET");
                this.f1526d.addAction("android.intent.action.TIMEZONE_CHANGED");
                this.f1526d.addAction("android.intent.action.TIME_TICK");
            }
            C0438x.this.f1497e.registerReceiver(this.f1525c, this.f1526d);
        }
    }

    /* renamed from: android.support.v7.app.x$e */
    private class C0443e extends ContentFrameLayout {
        public C0443e(Context context) {
            super(context);
        }

        /* renamed from: a */
        private boolean m2068a(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C0438x.this.mo1978a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m2068a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            C0438x.this.mo1983d(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C0173a.m597b(getContext(), i));
        }
    }

    /* renamed from: android.support.v7.app.x$f */
    protected static final class C0444f {

        /* renamed from: a */
        int f1529a;

        /* renamed from: b */
        int f1530b;

        /* renamed from: c */
        int f1531c;

        /* renamed from: d */
        int f1532d;

        /* renamed from: e */
        int f1533e;

        /* renamed from: f */
        int f1534f;

        /* renamed from: g */
        ViewGroup f1535g;

        /* renamed from: h */
        View f1536h;

        /* renamed from: i */
        View f1537i;

        /* renamed from: j */
        C0468l f1538j;

        /* renamed from: k */
        C0465j f1539k;

        /* renamed from: l */
        Context f1540l;

        /* renamed from: m */
        boolean f1541m;

        /* renamed from: n */
        boolean f1542n;

        /* renamed from: o */
        boolean f1543o;

        /* renamed from: p */
        public boolean f1544p;

        /* renamed from: q */
        boolean f1545q = false;

        /* renamed from: r */
        boolean f1546r;

        /* renamed from: s */
        Bundle f1547s;

        C0444f(int i) {
            this.f1529a = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C0487w mo2011a(C0486a aVar) {
            if (this.f1538j == null) {
                return null;
            }
            if (this.f1539k == null) {
                this.f1539k = new C0465j(this.f1540l, C0169g.abc_list_menu_item_layout);
                this.f1539k.mo2044a(aVar);
                this.f1538j.mo2191a((C0485v) this.f1539k);
            }
            return this.f1539k.mo2165a(this.f1535g);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2012a(Context context) {
            TypedValue typedValue = new TypedValue();
            Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C0163a.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(C0163a.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 == 0) {
                i2 = C0171i.Theme_AppCompat_CompactMenu;
            }
            newTheme.applyStyle(i2, true);
            C0195d dVar = new C0195d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f1540l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(C0172j.AppCompatTheme);
            this.f1530b = obtainStyledAttributes.getResourceId(C0172j.AppCompatTheme_panelBackground, 0);
            this.f1534f = obtainStyledAttributes.getResourceId(C0172j.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2013a(C0468l lVar) {
            C0468l lVar2 = this.f1538j;
            if (lVar != lVar2) {
                if (lVar2 != null) {
                    lVar2.mo2210b((C0485v) this.f1539k);
                }
                this.f1538j = lVar;
                if (lVar != null) {
                    C0465j jVar = this.f1539k;
                    if (jVar != null) {
                        lVar.mo2191a((C0485v) jVar);
                    }
                }
            }
        }

        /* renamed from: a */
        public boolean mo2014a() {
            boolean z = false;
            if (this.f1536h == null) {
                return false;
            }
            if (this.f1537i != null) {
                return true;
            }
            if (this.f1539k.mo2166b().getCount() > 0) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: android.support.v7.app.x$g */
    private final class C0445g implements C0486a {
        C0445g() {
        }

        /* renamed from: a */
        public void mo2000a(C0468l lVar, boolean z) {
            C0468l m = lVar.mo2066m();
            boolean z2 = m != lVar;
            C0438x xVar = C0438x.this;
            if (z2) {
                lVar = m;
            }
            C0444f a = xVar.mo1972a((Menu) lVar);
            if (a == null) {
                return;
            }
            if (z2) {
                C0438x.this.mo1974a(a.f1529a, a, m);
                C0438x.this.mo1975a(a, true);
                return;
            }
            C0438x.this.mo1975a(a, z);
        }

        /* renamed from: a */
        public boolean mo2001a(C0468l lVar) {
            if (lVar == null) {
                C0438x xVar = C0438x.this;
                if (xVar.f1477B) {
                    Callback o = xVar.mo1993o();
                    if (o != null && !C0438x.this.f1486K) {
                        o.onMenuOpened(C0172j.AppCompatTheme_tooltipForegroundColor, lVar);
                    }
                }
            }
            return true;
        }
    }

    static {
        if (f1473b && !f1475d) {
            Thread.setDefaultUncaughtExceptionHandler(new C0430p(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    C0438x(Context context, Window window, C0428n nVar) {
        this.f1497e = context;
        this.f1498f = window;
        this.f1501i = nVar;
        this.f1499g = this.f1498f.getCallback();
        Callback callback = this.f1499g;
        if (!(callback instanceof C0441c)) {
            this.f1500h = new C0441c(callback);
            this.f1498f.setCallback(this.f1500h);
            C0620va a = C0620va.m2919a(context, (AttributeSet) null, f1474c);
            Drawable c = a.mo3260c(0);
            if (c != null) {
                this.f1498f.setBackgroundDrawable(c);
            }
            a.mo3255a();
            return;
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* renamed from: A */
    private void m1986A() {
        if (this.f1514v) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: a */
    private void m1987a(C0444f fVar, KeyEvent keyEvent) {
        int i;
        if (!fVar.f1543o && !this.f1486K) {
            if (fVar.f1529a == 0) {
                if ((this.f1497e.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Callback o = mo1993o();
            if (o == null || o.onMenuOpened(fVar.f1529a, fVar.f1538j)) {
                WindowManager windowManager = (WindowManager) this.f1497e.getSystemService("window");
                if (windowManager != null && m1993b(fVar, keyEvent)) {
                    if (fVar.f1535g == null || fVar.f1545q) {
                        ViewGroup viewGroup = fVar.f1535g;
                        if (viewGroup == null) {
                            if (!m1992b(fVar) || fVar.f1535g == null) {
                                return;
                            }
                        } else if (fVar.f1545q && viewGroup.getChildCount() > 0) {
                            fVar.f1535g.removeAllViews();
                        }
                        if (m1989a(fVar) && fVar.mo2014a()) {
                            LayoutParams layoutParams = fVar.f1536h.getLayoutParams();
                            if (layoutParams == null) {
                                layoutParams = new LayoutParams(-2, -2);
                            }
                            fVar.f1535g.setBackgroundResource(fVar.f1530b);
                            ViewParent parent = fVar.f1536h.getParent();
                            if (parent != null && (parent instanceof ViewGroup)) {
                                ((ViewGroup) parent).removeView(fVar.f1536h);
                            }
                            fVar.f1535g.addView(fVar.f1536h, layoutParams);
                            if (!fVar.f1536h.hasFocus()) {
                                fVar.f1536h.requestFocus();
                            }
                        }
                    } else {
                        View view = fVar.f1537i;
                        if (view != null) {
                            LayoutParams layoutParams2 = view.getLayoutParams();
                            if (layoutParams2 != null && layoutParams2.width == -1) {
                                i = -1;
                                fVar.f1542n = false;
                                WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, fVar.f1532d, fVar.f1533e, 1002, 8519680, -3);
                                layoutParams3.gravity = fVar.f1531c;
                                layoutParams3.windowAnimations = fVar.f1534f;
                                windowManager.addView(fVar.f1535g, layoutParams3);
                                fVar.f1543o = true;
                            }
                        }
                    }
                    i = -2;
                    fVar.f1542n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, fVar.f1532d, fVar.f1533e, 1002, 8519680, -3);
                    layoutParams32.gravity = fVar.f1531c;
                    layoutParams32.windowAnimations = fVar.f1534f;
                    windowManager.addView(fVar.f1535g, layoutParams32);
                    fVar.f1543o = true;
                }
            } else {
                mo1975a(fVar, true);
            }
        }
    }

    /* renamed from: a */
    private void m1988a(C0468l lVar, boolean z) {
        C0522K k = this.f1505m;
        if (k == null || !k.mo2459c() || (ViewConfiguration.get(this.f1497e).hasPermanentMenuKey() && !this.f1505m.mo2461d())) {
            C0444f a = mo1971a(0, true);
            a.f1545q = true;
            mo1975a(a, false);
            m1987a(a, (KeyEvent) null);
            return;
        }
        Callback o = mo1993o();
        if (this.f1505m.mo2457a() && z) {
            this.f1505m.mo2463e();
            if (!this.f1486K) {
                o.onPanelClosed(C0172j.AppCompatTheme_tooltipForegroundColor, mo1971a(0, true).f1538j);
            }
        } else if (o != null && !this.f1486K) {
            if (this.f1490O && (this.f1491P & 1) != 0) {
                this.f1498f.getDecorView().removeCallbacks(this.f1492Q);
                this.f1492Q.run();
            }
            C0444f a2 = mo1971a(0, true);
            C0468l lVar2 = a2.f1538j;
            if (lVar2 != null && !a2.f1546r && o.onPreparePanel(0, a2.f1537i, lVar2)) {
                o.onMenuOpened(C0172j.AppCompatTheme_tooltipForegroundColor, a2.f1538j);
                this.f1505m.mo2464f();
            }
        }
    }

    /* renamed from: a */
    private boolean m1989a(C0444f fVar) {
        View view = fVar.f1537i;
        boolean z = true;
        if (view != null) {
            fVar.f1536h = view;
            return true;
        } else if (fVar.f1538j == null) {
            return false;
        } else {
            if (this.f1507o == null) {
                this.f1507o = new C0445g();
            }
            fVar.f1536h = (View) fVar.mo2011a((C0486a) this.f1507o);
            if (fVar.f1536h == null) {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: a */
    private boolean m1990a(C0444f fVar, int i, KeyEvent keyEvent, int i2) {
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if (fVar.f1541m || m1993b(fVar, keyEvent)) {
            C0468l lVar = fVar.f1538j;
            if (lVar != null) {
                z = lVar.performShortcut(i, keyEvent, i2);
            }
        }
        if (z && (i2 & 1) == 0 && this.f1505m == null) {
            mo1975a(fVar, true);
        }
        return z;
    }

    /* renamed from: a */
    private boolean m1991a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f1498f.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C0156v.m576q((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: b */
    private boolean m1992b(C0444f fVar) {
        fVar.mo2012a(mo1991m());
        fVar.f1535g = new C0443e(fVar.f1540l);
        fVar.f1531c = 81;
        return true;
    }

    /* renamed from: b */
    private boolean m1993b(C0444f fVar, KeyEvent keyEvent) {
        if (this.f1486K) {
            return false;
        }
        if (fVar.f1541m) {
            return true;
        }
        C0444f fVar2 = this.f1484I;
        if (!(fVar2 == null || fVar2 == fVar)) {
            mo1975a(fVar2, false);
        }
        Callback o = mo1993o();
        if (o != null) {
            fVar.f1537i = o.onCreatePanelView(fVar.f1529a);
        }
        int i = fVar.f1529a;
        boolean z = i == 0 || i == 108;
        if (z) {
            C0522K k = this.f1505m;
            if (k != null) {
                k.mo2458b();
            }
        }
        if (fVar.f1537i == null) {
            if (z) {
                mo1998r();
            }
            if (fVar.f1538j == null || fVar.f1546r) {
                if (fVar.f1538j == null && (!m1994c(fVar) || fVar.f1538j == null)) {
                    return false;
                }
                if (z && this.f1505m != null) {
                    if (this.f1506n == null) {
                        this.f1506n = new C0439a();
                    }
                    this.f1505m.mo2456a(fVar.f1538j, this.f1506n);
                }
                fVar.f1538j.mo2240s();
                if (!o.onCreatePanelMenu(fVar.f1529a, fVar.f1538j)) {
                    fVar.mo2013a((C0468l) null);
                    if (z) {
                        C0522K k2 = this.f1505m;
                        if (k2 != null) {
                            k2.mo2456a(null, this.f1506n);
                        }
                    }
                    return false;
                }
                fVar.f1546r = false;
            }
            fVar.f1538j.mo2240s();
            Bundle bundle = fVar.f1547s;
            if (bundle != null) {
                fVar.f1538j.mo2190a(bundle);
                fVar.f1547s = null;
            }
            if (!o.onPreparePanel(0, fVar.f1537i, fVar.f1538j)) {
                if (z) {
                    C0522K k3 = this.f1505m;
                    if (k3 != null) {
                        k3.mo2456a(null, this.f1506n);
                    }
                }
                fVar.f1538j.mo2237r();
                return false;
            }
            fVar.f1544p = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            fVar.f1538j.setQwertyMode(fVar.f1544p);
            fVar.f1538j.mo2237r();
        }
        fVar.f1541m = true;
        fVar.f1542n = false;
        this.f1484I = fVar;
        return true;
    }

    /* renamed from: c */
    private boolean m1994c(C0444f fVar) {
        Context context = this.f1497e;
        int i = fVar.f1529a;
        if ((i == 0 || i == 108) && this.f1505m != null) {
            TypedValue typedValue = new TypedValue();
            Theme theme = context.getTheme();
            theme.resolveAttribute(C0163a.actionBarTheme, typedValue, true);
            Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C0163a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(C0163a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                C0195d dVar = new C0195d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        C0468l lVar = new C0468l(context);
        lVar.mo2060a((C0469a) this);
        fVar.mo2013a(lVar);
        return true;
    }

    /* renamed from: d */
    private boolean m1995d(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            C0444f a = mo1971a(i, true);
            if (!a.f1543o) {
                return m1993b(a, keyEvent);
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1996e(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            a.b.d.e.b r0 = r3.f1508p
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            android.support.v7.app.x$f r2 = r3.mo1971a(r4, r0)
            if (r4 != 0) goto L_0x0043
            android.support.v7.widget.K r4 = r3.f1505m
            if (r4 == 0) goto L_0x0043
            boolean r4 = r4.mo2459c()
            if (r4 == 0) goto L_0x0043
            android.content.Context r4 = r3.f1497e
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            boolean r4 = r4.hasPermanentMenuKey()
            if (r4 != 0) goto L_0x0043
            android.support.v7.widget.K r4 = r3.f1505m
            boolean r4 = r4.mo2457a()
            if (r4 != 0) goto L_0x003c
            boolean r4 = r3.f1486K
            if (r4 != 0) goto L_0x0063
            boolean r4 = r3.m1993b(r2, r5)
            if (r4 == 0) goto L_0x0063
            android.support.v7.widget.K r4 = r3.f1505m
            boolean r4 = r4.mo2464f()
            goto L_0x006a
        L_0x003c:
            android.support.v7.widget.K r4 = r3.f1505m
            boolean r4 = r4.mo2463e()
            goto L_0x006a
        L_0x0043:
            boolean r4 = r2.f1543o
            if (r4 != 0) goto L_0x0065
            boolean r4 = r2.f1542n
            if (r4 == 0) goto L_0x004c
            goto L_0x0065
        L_0x004c:
            boolean r4 = r2.f1541m
            if (r4 == 0) goto L_0x0063
            boolean r4 = r2.f1546r
            if (r4 == 0) goto L_0x005b
            r2.f1541m = r1
            boolean r4 = r3.m1993b(r2, r5)
            goto L_0x005c
        L_0x005b:
            r4 = 1
        L_0x005c:
            if (r4 == 0) goto L_0x0063
            r3.m1987a(r2, r5)
            r4 = 1
            goto L_0x006a
        L_0x0063:
            r4 = 0
            goto L_0x006a
        L_0x0065:
            boolean r4 = r2.f1543o
            r3.mo1975a(r2, r0)
        L_0x006a:
            if (r4 == 0) goto L_0x0083
            android.content.Context r5 = r3.f1497e
            java.lang.String r0 = "audio"
            java.lang.Object r5 = r5.getSystemService(r0)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x007c
            r5.playSoundEffect(r1)
            goto L_0x0083
        L_0x007c:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r5, r0)
        L_0x0083:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v7.app.C0438x.m1996e(int, android.view.KeyEvent):boolean");
    }

    /* renamed from: j */
    private void m1997j(int i) {
        this.f1491P = (1 << i) | this.f1491P;
        if (!this.f1490O) {
            C0156v.m548a(this.f1498f.getDecorView(), this.f1492Q);
            this.f1490O = true;
        }
    }

    /* renamed from: k */
    private int m1998k(int i) {
        String str = "AppCompatDelegate";
        if (i == 8) {
            Log.i(str, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return C0172j.AppCompatTheme_tooltipForegroundColor;
        }
        if (i == 9) {
            Log.i(str, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = C0172j.AppCompatTheme_tooltipFrameBackground;
        }
        return i;
    }

    /* renamed from: l */
    private boolean m1999l(int i) {
        Resources resources = this.f1497e.getResources();
        Configuration configuration = resources.getConfiguration();
        int i2 = configuration.uiMode & 48;
        int i3 = i == 2 ? 32 : 16;
        if (i2 == i3) {
            return false;
        }
        if (m2006z()) {
            ((Activity) this.f1497e).recreate();
        } else {
            Configuration configuration2 = new Configuration(configuration);
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            configuration2.uiMode = i3 | (configuration2.uiMode & -49);
            resources.updateConfiguration(configuration2, displayMetrics);
            if (VERSION.SDK_INT < 26) {
                C0402C.m1842a(resources);
            }
        }
        return true;
    }

    /* renamed from: t */
    private void m2000t() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f1515w.findViewById(16908290);
        View decorView = this.f1498f.getDecorView();
        contentFrameLayout.mo2604a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f1497e.obtainStyledAttributes(C0172j.AppCompatTheme);
        obtainStyledAttributes.getValue(C0172j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C0172j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(C0172j.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(C0172j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(C0172j.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(C0172j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(C0172j.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(C0172j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(C0172j.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(C0172j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: u */
    private ViewGroup m2001u() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f1497e.obtainStyledAttributes(C0172j.AppCompatTheme);
        if (obtainStyledAttributes.hasValue(C0172j.AppCompatTheme_windowActionBar)) {
            if (obtainStyledAttributes.getBoolean(C0172j.AppCompatTheme_windowNoTitle, false)) {
                mo1953b(1);
            } else if (obtainStyledAttributes.getBoolean(C0172j.AppCompatTheme_windowActionBar, false)) {
                mo1953b((int) C0172j.AppCompatTheme_tooltipForegroundColor);
            }
            if (obtainStyledAttributes.getBoolean(C0172j.AppCompatTheme_windowActionBarOverlay, false)) {
                mo1953b((int) C0172j.AppCompatTheme_tooltipFrameBackground);
            }
            if (obtainStyledAttributes.getBoolean(C0172j.AppCompatTheme_windowActionModeOverlay, false)) {
                mo1953b(10);
            }
            this.f1480E = obtainStyledAttributes.getBoolean(C0172j.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            this.f1498f.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f1497e);
            if (this.f1481F) {
                viewGroup = (ViewGroup) from.inflate(this.f1479D ? C0169g.abc_screen_simple_overlay_action_mode : C0169g.abc_screen_simple, null);
                if (VERSION.SDK_INT >= 21) {
                    C0156v.m544a((View) viewGroup, (C0151q) new C0432r(this));
                } else {
                    ((C0529O) viewGroup).setOnFitSystemWindowsListener(new C0433s(this));
                }
            } else if (this.f1480E) {
                viewGroup = (ViewGroup) from.inflate(C0169g.abc_dialog_title_material, null);
                this.f1478C = false;
                this.f1477B = false;
            } else if (this.f1477B) {
                TypedValue typedValue = new TypedValue();
                this.f1497e.getTheme().resolveAttribute(C0163a.actionBarTheme, typedValue, true);
                int i = typedValue.resourceId;
                viewGroup = (ViewGroup) LayoutInflater.from(i != 0 ? new C0195d(this.f1497e, i) : this.f1497e).inflate(C0169g.abc_screen_toolbar, null);
                this.f1505m = (C0522K) viewGroup.findViewById(C0168f.decor_content_parent);
                this.f1505m.setWindowCallback(mo1993o());
                if (this.f1478C) {
                    this.f1505m.mo2455a(C0172j.AppCompatTheme_tooltipFrameBackground);
                }
                if (this.f1518z) {
                    this.f1505m.mo2455a(2);
                }
                if (this.f1476A) {
                    this.f1505m.mo2455a(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (this.f1505m == null) {
                    this.f1516x = (TextView) viewGroup.findViewById(C0168f.title);
                }
                C0521Ja.m2526b(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C0168f.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f1498f.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.f1498f.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C0434t(this));
                return viewGroup;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.f1477B);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.f1478C);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.f1480E);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.f1479D);
            sb.append(", windowNoTitle: ");
            sb.append(this.f1481F);
            sb.append(" }");
            throw new IllegalArgumentException(sb.toString());
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: v */
    private void m2002v() {
        if (this.f1489N == null) {
            this.f1489N = new C0442d(C0404E.m1850a(this.f1497e));
        }
    }

    /* renamed from: w */
    private void m2003w() {
        if (!this.f1514v) {
            this.f1515w = m2001u();
            CharSequence n = mo1992n();
            if (!TextUtils.isEmpty(n)) {
                C0522K k = this.f1505m;
                if (k != null) {
                    k.setWindowTitle(n);
                } else if (mo1998r() != null) {
                    mo1998r().mo1869a(n);
                } else {
                    TextView textView = this.f1516x;
                    if (textView != null) {
                        textView.setText(n);
                    }
                }
            }
            m2000t();
            mo1976a(this.f1515w);
            this.f1514v = true;
            C0444f a = mo1971a(0, false);
            if (this.f1486K) {
                return;
            }
            if (a == null || a.f1538j == null) {
                m1997j(C0172j.AppCompatTheme_tooltipForegroundColor);
            }
        }
    }

    /* renamed from: x */
    private int m2004x() {
        int i = this.f1487L;
        return i != -100 ? i : C0429o.m1957b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2005y() {
        /*
            r3 = this;
            r3.m2003w()
            boolean r0 = r3.f1477B
            if (r0 == 0) goto L_0x0033
            android.support.v7.app.a r0 = r3.f1502j
            if (r0 == 0) goto L_0x000c
            goto L_0x0033
        L_0x000c:
            android.view.Window$Callback r0 = r3.f1499g
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x001e
            android.support.v7.app.I r1 = new android.support.v7.app.I
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r2 = r3.f1478C
            r1.<init>(r0, r2)
        L_0x001b:
            r3.f1502j = r1
            goto L_0x002a
        L_0x001e:
            boolean r1 = r0 instanceof android.app.Dialog
            if (r1 == 0) goto L_0x002a
            android.support.v7.app.I r1 = new android.support.v7.app.I
            android.app.Dialog r0 = (android.app.Dialog) r0
            r1.<init>(r0)
            goto L_0x001b
        L_0x002a:
            android.support.v7.app.a r0 = r3.f1502j
            if (r0 == 0) goto L_0x0033
            boolean r1 = r3.f1493R
            r0.mo1875c(r1)
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v7.app.C0438x.m2005y():void");
    }

    /* renamed from: z */
    private boolean m2006z() {
        boolean z = false;
        if (this.f1488M) {
            Context context = this.f1497e;
            if (context instanceof Activity) {
                try {
                    if ((context.getPackageManager().getActivityInfo(new ComponentName(this.f1497e, this.f1497e.getClass()), 0).configChanges & 512) == 0) {
                        z = true;
                    }
                    return z;
                } catch (NameNotFoundException e) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public C0192b mo1970a(C0193a aVar) {
        if (aVar != null) {
            C0192b bVar = this.f1508p;
            if (bVar != null) {
                bVar.mo697a();
            }
            C0440b bVar2 = new C0440b(aVar);
            C0411a d = mo1957d();
            if (d != null) {
                this.f1508p = d.mo1863a((C0193a) bVar2);
                C0192b bVar3 = this.f1508p;
                if (bVar3 != null) {
                    C0428n nVar = this.f1501i;
                    if (nVar != null) {
                        nVar.mo1850b(bVar3);
                    }
                }
            }
            if (this.f1508p == null) {
                this.f1508p = mo1979b((C0193a) bVar2);
            }
            return this.f1508p;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0444f mo1971a(int i, boolean z) {
        C0444f[] fVarArr = this.f1483H;
        if (fVarArr == null || fVarArr.length <= i) {
            C0444f[] fVarArr2 = new C0444f[(i + 1)];
            if (fVarArr != null) {
                System.arraycopy(fVarArr, 0, fVarArr2, 0, fVarArr.length);
            }
            this.f1483H = fVarArr2;
            fVarArr = fVarArr2;
        }
        C0444f fVar = fVarArr[i];
        if (fVar != null) {
            return fVar;
        }
        C0444f fVar2 = new C0444f(i);
        fVarArr[i] = fVar2;
        return fVar2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0444f mo1972a(Menu menu) {
        C0444f[] fVarArr = this.f1483H;
        int length = fVarArr != null ? fVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            C0444f fVar = fVarArr[i];
            if (fVar != null && fVar.f1538j == menu) {
                return fVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public <T extends View> T mo1944a(int i) {
        m2003w();
        return this.f1498f.findViewById(i);
    }

    /* renamed from: a */
    public View mo1973a(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        AppCompatViewInflater appCompatViewInflater;
        boolean z2 = false;
        if (this.f1496U == null) {
            String string = this.f1497e.obtainStyledAttributes(C0172j.AppCompatTheme).getString(C0172j.AppCompatTheme_viewInflaterClass);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                appCompatViewInflater = new AppCompatViewInflater();
            } else {
                try {
                    this.f1496U = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to instantiate custom view inflater ");
                    sb.append(string);
                    sb.append(". Falling back to default.");
                    Log.i("AppCompatDelegate", sb.toString(), th);
                    appCompatViewInflater = new AppCompatViewInflater();
                }
            }
            this.f1496U = appCompatViewInflater;
        }
        if (f1473b) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z2 = m1991a((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = false;
        }
        return this.f1496U.mo1830a(view, str, context, attributeSet, z, f1473b, true, C0519Ia.m2496b());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1974a(int i, C0444f fVar, Menu menu) {
        if (menu == null) {
            if (fVar == null && i >= 0) {
                C0444f[] fVarArr = this.f1483H;
                if (i < fVarArr.length) {
                    fVar = fVarArr[i];
                }
            }
            if (fVar != null) {
                menu = fVar.f1538j;
            }
        }
        if ((fVar == null || fVar.f1543o) && !this.f1486K) {
            this.f1499g.onPanelClosed(i, menu);
        }
    }

    /* renamed from: a */
    public void mo1945a(Configuration configuration) {
        if (this.f1477B && this.f1514v) {
            C0411a d = mo1957d();
            if (d != null) {
                d.mo1868a(configuration);
            }
        }
        C0600o.m2852a().mo3145a(this.f1497e);
        mo1950a();
    }

    /* renamed from: a */
    public void mo1946a(Bundle bundle) {
        Callback callback = this.f1499g;
        if (callback instanceof Activity) {
            String str = null;
            try {
                str = C0256U.m951b((Activity) callback);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                C0411a r = mo1998r();
                if (r == null) {
                    this.f1493R = true;
                } else {
                    r.mo1875c(true);
                }
            }
        }
        if (bundle != null && this.f1487L == -100) {
            this.f1487L = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1975a(C0444f fVar, boolean z) {
        if (z && fVar.f1529a == 0) {
            C0522K k = this.f1505m;
            if (k != null && k.mo2457a()) {
                mo1980b(fVar.f1538j);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f1497e.getSystemService("window");
        if (windowManager != null && fVar.f1543o) {
            ViewGroup viewGroup = fVar.f1535g;
            if (viewGroup != null) {
                windowManager.removeView(viewGroup);
                if (z) {
                    mo1974a(fVar.f1529a, fVar, null);
                }
            }
        }
        fVar.f1541m = false;
        fVar.f1542n = false;
        fVar.f1543o = false;
        fVar.f1536h = null;
        fVar.f1545q = true;
        if (this.f1484I == fVar) {
            this.f1484I = null;
        }
    }

    /* renamed from: a */
    public void mo728a(C0468l lVar) {
        m1988a(lVar, true);
    }

    /* renamed from: a */
    public void mo1947a(View view) {
        m2003w();
        ViewGroup viewGroup = (ViewGroup) this.f1515w.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f1499g.onContentChanged();
    }

    /* renamed from: a */
    public void mo1948a(View view, LayoutParams layoutParams) {
        m2003w();
        ((ViewGroup) this.f1515w.findViewById(16908290)).addView(view, layoutParams);
        this.f1499g.onContentChanged();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1976a(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public final void mo1949a(CharSequence charSequence) {
        this.f1504l = charSequence;
        C0522K k = this.f1505m;
        if (k != null) {
            k.setWindowTitle(charSequence);
        } else if (mo1998r() != null) {
            mo1998r().mo1869a(charSequence);
        } else {
            TextView textView = this.f1516x;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* renamed from: a */
    public boolean mo1950a() {
        int x = m2004x();
        int f = mo1985f(x);
        boolean l = f != -1 ? m1999l(f) : false;
        if (x == 0) {
            m2002v();
            this.f1489N.mo2007d();
        }
        this.f1488M = true;
        return l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo1977a(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.f1485J = z;
        } else if (i == 82) {
            m1995d(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo729a(C0468l lVar, MenuItem menuItem) {
        Callback o = mo1993o();
        if (o != null && !this.f1486K) {
            C0444f a = mo1972a((Menu) lVar.mo2066m());
            if (a != null) {
                return o.onMenuItemSelected(a.f1529a, menuItem);
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo1978a(KeyEvent keyEvent) {
        Callback callback = this.f1499g;
        boolean z = true;
        if ((callback instanceof C0141a) || (callback instanceof C0401B)) {
            View decorView = this.f1498f.getDecorView();
            if (decorView != null && C0140g.m481a(decorView, keyEvent)) {
                return true;
            }
        }
        if (keyEvent.getKeyCode() == 82 && this.f1499g.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? mo1977a(keyCode, keyEvent) : mo1982c(keyCode, keyEvent);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0169  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000a.p005b.p021d.p028e.C0192b mo1979b(p000a.p005b.p021d.p028e.C0192b.C0193a r8) {
        /*
            r7 = this;
            r7.mo1990l()
            a.b.d.e.b r0 = r7.f1508p
            if (r0 == 0) goto L_0x000a
            r0.mo697a()
        L_0x000a:
            boolean r0 = r8 instanceof android.support.p030v7.app.C0438x.C0440b
            if (r0 != 0) goto L_0x0014
            android.support.v7.app.x$b r0 = new android.support.v7.app.x$b
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            android.support.v7.app.n r0 = r7.f1501i
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.f1486K
            if (r2 != 0) goto L_0x0022
            a.b.d.e.b r0 = r0.mo1844a(r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.f1508p = r0
            goto L_0x0165
        L_0x0029:
            android.support.v7.widget.ActionBarContextView r0 = r7.f1509q
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d6
            boolean r0 = r7.f1480E
            if (r0 == 0) goto L_0x00b7
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f1497e
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = p000a.p005b.p021d.p022a.C0163a.actionBarTheme
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.f1497e
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            a.b.d.e.d r4 = new a.b.d.e.d
            android.content.Context r6 = r7.f1497e
            r4.<init>(r6, r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.f1497e
        L_0x006a:
            android.support.v7.widget.ActionBarContextView r5 = new android.support.v7.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f1509q = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = p000a.p005b.p021d.p022a.C0163a.actionModePopupWindowStyle
            r5.<init>(r4, r1, r6)
            r7.f1510r = r5
            android.widget.PopupWindow r5 = r7.f1510r
            r6 = 2
            android.support.p029v4.widget.C0387s.m1779a(r5, r6)
            android.widget.PopupWindow r5 = r7.f1510r
            android.support.v7.widget.ActionBarContextView r6 = r7.f1509q
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f1510r
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = p000a.p005b.p021d.p022a.C0163a.actionBarSize
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            android.support.v7.widget.ActionBarContextView r4 = r7.f1509q
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.f1510r
            r4 = -2
            r0.setHeight(r4)
            android.support.v7.app.v r0 = new android.support.v7.app.v
            r0.<init>(r7)
            r7.f1511s = r0
            goto L_0x00d6
        L_0x00b7:
            android.view.ViewGroup r0 = r7.f1515w
            int r4 = p000a.p005b.p021d.p022a.C0168f.action_mode_bar_stub
            android.view.View r0 = r0.findViewById(r4)
            android.support.v7.widget.ViewStubCompat r0 = (android.support.p030v7.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d6
            android.content.Context r4 = r7.mo1991m()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.mo2943a()
            android.support.v7.widget.ActionBarContextView r0 = (android.support.p030v7.widget.ActionBarContextView) r0
            r7.f1509q = r0
        L_0x00d6:
            android.support.v7.widget.ActionBarContextView r0 = r7.f1509q
            if (r0 == 0) goto L_0x0165
            r7.mo1990l()
            android.support.v7.widget.ActionBarContextView r0 = r7.f1509q
            r0.mo2434c()
            a.b.d.e.e r0 = new a.b.d.e.e
            android.support.v7.widget.ActionBarContextView r4 = r7.f1509q
            android.content.Context r4 = r4.getContext()
            android.support.v7.widget.ActionBarContextView r5 = r7.f1509q
            android.widget.PopupWindow r6 = r7.f1510r
            if (r6 != 0) goto L_0x00f1
            goto L_0x00f2
        L_0x00f1:
            r3 = 0
        L_0x00f2:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.mo706c()
            boolean r8 = r8.mo715a(r0, r3)
            if (r8 == 0) goto L_0x0163
            r0.mo712i()
            android.support.v7.widget.ActionBarContextView r8 = r7.f1509q
            r8.mo2432a(r0)
            r7.f1508p = r0
            boolean r8 = r7.mo1999s()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x012d
            android.support.v7.widget.ActionBarContextView r8 = r7.f1509q
            r1 = 0
            r8.setAlpha(r1)
            android.support.v7.widget.ActionBarContextView r8 = r7.f1509q
            a.b.c.g.H r8 = p000a.p005b.p009c.p018g.C0156v.m537a(r8)
            r8.mo397a(r0)
            r7.f1512t = r8
            a.b.c.g.H r8 = r7.f1512t
            android.support.v7.app.w r0 = new android.support.v7.app.w
            r0.<init>(r7)
            r8.mo399a(r0)
            goto L_0x0153
        L_0x012d:
            android.support.v7.widget.ActionBarContextView r8 = r7.f1509q
            r8.setAlpha(r0)
            android.support.v7.widget.ActionBarContextView r8 = r7.f1509q
            r8.setVisibility(r2)
            android.support.v7.widget.ActionBarContextView r8 = r7.f1509q
            r0 = 32
            r8.sendAccessibilityEvent(r0)
            android.support.v7.widget.ActionBarContextView r8 = r7.f1509q
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0153
            android.support.v7.widget.ActionBarContextView r8 = r7.f1509q
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            p000a.p005b.p009c.p018g.C0156v.m580u(r8)
        L_0x0153:
            android.widget.PopupWindow r8 = r7.f1510r
            if (r8 == 0) goto L_0x0165
            android.view.Window r8 = r7.f1498f
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f1511s
            r8.post(r0)
            goto L_0x0165
        L_0x0163:
            r7.f1508p = r1
        L_0x0165:
            a.b.d.e.b r8 = r7.f1508p
            if (r8 == 0) goto L_0x0170
            android.support.v7.app.n r0 = r7.f1501i
            if (r0 == 0) goto L_0x0170
            r0.mo1850b(r8)
        L_0x0170:
            a.b.d.e.b r8 = r7.f1508p
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v7.app.C0438x.mo1979b(a.b.d.e.b$a):a.b.d.e.b");
    }

    /* renamed from: b */
    public void mo1951b(Bundle bundle) {
        m2003w();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1980b(C0468l lVar) {
        if (!this.f1482G) {
            this.f1482G = true;
            this.f1505m.mo2466g();
            Callback o = mo1993o();
            if (o != null && !this.f1486K) {
                o.onPanelClosed(C0172j.AppCompatTheme_tooltipForegroundColor, lVar);
            }
            this.f1482G = false;
        }
    }

    /* renamed from: b */
    public void mo1952b(View view, LayoutParams layoutParams) {
        m2003w();
        ViewGroup viewGroup = (ViewGroup) this.f1515w.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f1499g.onContentChanged();
    }

    /* renamed from: b */
    public boolean mo1953b(int i) {
        int k = m1998k(i);
        if (this.f1481F && k == 108) {
            return false;
        }
        if (this.f1477B && k == 1) {
            this.f1477B = false;
        }
        if (k == 1) {
            m1986A();
            this.f1481F = true;
            return true;
        } else if (k == 2) {
            m1986A();
            this.f1518z = true;
            return true;
        } else if (k == 5) {
            m1986A();
            this.f1476A = true;
            return true;
        } else if (k == 10) {
            m1986A();
            this.f1479D = true;
            return true;
        } else if (k == 108) {
            m1986A();
            this.f1477B = true;
            return true;
        } else if (k != 109) {
            return this.f1498f.requestFeature(k);
        } else {
            m1986A();
            this.f1478C = true;
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo1981b(int i, KeyEvent keyEvent) {
        C0411a d = mo1957d();
        if (d != null && d.mo1871a(i, keyEvent)) {
            return true;
        }
        C0444f fVar = this.f1484I;
        if (fVar == null || !m1990a(fVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f1484I == null) {
                C0444f a = mo1971a(0, true);
                m1993b(a, keyEvent);
                boolean a2 = m1990a(a, keyEvent.getKeyCode(), keyEvent, 1);
                a.f1541m = false;
                if (a2) {
                    return true;
                }
            }
            return false;
        }
        C0444f fVar2 = this.f1484I;
        if (fVar2 != null) {
            fVar2.f1542n = true;
        }
        return true;
    }

    /* renamed from: c */
    public MenuInflater mo1954c() {
        if (this.f1503k == null) {
            m2005y();
            C0411a aVar = this.f1502j;
            this.f1503k = new C0199g(aVar != null ? aVar.mo1883h() : this.f1497e);
        }
        return this.f1503k;
    }

    /* renamed from: c */
    public void mo1955c(int i) {
        m2003w();
        ViewGroup viewGroup = (ViewGroup) this.f1515w.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1497e).inflate(i, viewGroup);
        this.f1499g.onContentChanged();
    }

    /* renamed from: c */
    public void mo1956c(Bundle bundle) {
        int i = this.f1487L;
        if (i != -100) {
            bundle.putInt("appcompat:local_night_mode", i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo1982c(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f1485J;
            this.f1485J = false;
            C0444f a = mo1971a(0, false);
            if (a != null && a.f1543o) {
                if (!z) {
                    mo1975a(a, true);
                }
                return true;
            } else if (mo1997q()) {
                return true;
            }
        } else if (i == 82) {
            m1996e(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public C0411a mo1957d() {
        m2005y();
        return this.f1502j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo1983d(int i) {
        mo1975a(mo1971a(i, true), true);
    }

    /* renamed from: e */
    public void mo1958e() {
        LayoutInflater from = LayoutInflater.from(this.f1497e);
        if (from.getFactory() == null) {
            C0142h.m483a(from, this);
        } else if (!(from.getFactory2() instanceof C0438x)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo1984e(int i) {
        C0444f a = mo1971a(i, true);
        if (a.f1538j != null) {
            Bundle bundle = new Bundle();
            a.f1538j.mo2209b(bundle);
            if (bundle.size() > 0) {
                a.f1547s = bundle;
            }
            a.f1538j.mo2240s();
            a.f1538j.clear();
        }
        a.f1546r = true;
        a.f1545q = true;
        if ((i == 108 || i == 0) && this.f1505m != null) {
            C0444f a2 = mo1971a(0, false);
            if (a2 != null) {
                a2.f1541m = false;
                m1993b(a2, (KeyEvent) null);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo1985f(int i) {
        if (i == -100) {
            return -1;
        }
        if (i != 0) {
            return i;
        }
        if (VERSION.SDK_INT >= 23 && ((UiModeManager) this.f1497e.getSystemService(UiModeManager.class)).getNightMode() == 0) {
            return -1;
        }
        m2002v();
        return this.f1489N.mo2006c();
    }

    /* renamed from: f */
    public void mo1959f() {
        C0411a d = mo1957d();
        if (d == null || !d.mo1892i()) {
            m1997j(0);
        }
    }

    /* renamed from: g */
    public void mo1960g() {
        if (this.f1490O) {
            this.f1498f.getDecorView().removeCallbacks(this.f1492Q);
        }
        this.f1486K = true;
        C0411a aVar = this.f1502j;
        if (aVar != null) {
            aVar.mo1893j();
        }
        C0442d dVar = this.f1489N;
        if (dVar != null) {
            dVar.mo2004a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo1986g(int i) {
        if (i == 108) {
            C0411a d = mo1957d();
            if (d != null) {
                d.mo1873b(true);
            }
        }
    }

    /* renamed from: h */
    public void mo1961h() {
        C0411a d = mo1957d();
        if (d != null) {
            d.mo1877d(true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo1987h(int i) {
        if (i == 108) {
            C0411a d = mo1957d();
            if (d != null) {
                d.mo1873b(false);
            }
        } else if (i == 0) {
            C0444f a = mo1971a(i, true);
            if (a.f1543o) {
                mo1975a(a, false);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public int mo1988i(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        ActionBarContextView actionBarContextView = this.f1509q;
        int i2 = 0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof MarginLayoutParams)) {
            z = false;
        } else {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f1509q.getLayoutParams();
            z = true;
            if (this.f1509q.isShown()) {
                if (this.f1494S == null) {
                    this.f1494S = new Rect();
                    this.f1495T = new Rect();
                }
                Rect rect = this.f1494S;
                Rect rect2 = this.f1495T;
                rect.set(0, i, 0, 0);
                C0521Ja.m2524a(this.f1515w, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    View view = this.f1517y;
                    if (view == null) {
                        this.f1517y = new View(this.f1497e);
                        this.f1517y.setBackgroundColor(this.f1497e.getResources().getColor(C0165c.abc_input_method_navigation_guard));
                        this.f1515w.addView(this.f1517y, -1, new LayoutParams(-1, i));
                    } else {
                        LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f1517y.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.f1517y == null) {
                    z = false;
                }
                if (!this.f1479D && z) {
                    i = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z3 = true;
                } else {
                    z3 = false;
                }
                z = false;
            }
            if (z2) {
                this.f1509q.setLayoutParams(marginLayoutParams);
            }
        }
        View view2 = this.f1517y;
        if (view2 != null) {
            if (!z) {
                i2 = 8;
            }
            view2.setVisibility(i2);
        }
        return i;
    }

    /* renamed from: i */
    public void mo1962i() {
        mo1950a();
    }

    /* renamed from: j */
    public void mo1963j() {
        C0411a d = mo1957d();
        if (d != null) {
            d.mo1877d(false);
        }
        C0442d dVar = this.f1489N;
        if (dVar != null) {
            dVar.mo2004a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo1989k() {
        C0522K k = this.f1505m;
        if (k != null) {
            k.mo2466g();
        }
        if (this.f1510r != null) {
            this.f1498f.getDecorView().removeCallbacks(this.f1511s);
            if (this.f1510r.isShowing()) {
                try {
                    this.f1510r.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f1510r = null;
        }
        mo1990l();
        C0444f a = mo1971a(0, false);
        if (a != null) {
            C0468l lVar = a.f1538j;
            if (lVar != null) {
                lVar.close();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo1990l() {
        C0116H h = this.f1512t;
        if (h != null) {
            h.mo402a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final Context mo1991m() {
        C0411a d = mo1957d();
        Context h = d != null ? d.mo1883h() : null;
        return h == null ? this.f1497e : h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final CharSequence mo1992n() {
        Callback callback = this.f1499g;
        return callback instanceof Activity ? ((Activity) callback).getTitle() : this.f1504l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final Callback mo1993o() {
        return this.f1498f.getCallback();
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return mo1973a(view, str, context, attributeSet);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* renamed from: p */
    public boolean mo1996p() {
        return this.f1513u;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public boolean mo1997q() {
        C0192b bVar = this.f1508p;
        if (bVar != null) {
            bVar.mo697a();
            return true;
        }
        C0411a d = mo1957d();
        return d != null && d.mo1880f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public final C0411a mo1998r() {
        return this.f1502j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public final boolean mo1999s() {
        if (this.f1514v) {
            ViewGroup viewGroup = this.f1515w;
            if (viewGroup != null && C0156v.m577r(viewGroup)) {
                return true;
            }
        }
        return false;
    }
}
