package android.support.p029v4.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.p029v4.graphics.drawable.C0311a;
import android.support.p029v4.widget.C0351I.C0352a;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;
import p000a.p005b.p009c.p010a.C0039a;
import p000a.p005b.p009c.p018g.C0133c;
import p000a.p005b.p009c.p018g.C0134d;
import p000a.p005b.p009c.p018g.C0139f;
import p000a.p005b.p009c.p018g.C0156v;
import p000a.p005b.p009c.p018g.p019a.C0123a;
import p000a.p005b.p009c.p018g.p019a.C0123a.C0124a;
import p000a.p005b.p021d.p022a.C0172j;

/* renamed from: android.support.v4.widget.k */
public class C0373k extends ViewGroup {

    /* renamed from: a */
    private static final int[] f1194a = {16843828};

    /* renamed from: b */
    static final int[] f1195b = {16842931};

    /* renamed from: c */
    static final boolean f1196c = (VERSION.SDK_INT >= 19);

    /* renamed from: d */
    private static final boolean f1197d;

    /* renamed from: A */
    private float f1198A;

    /* renamed from: B */
    private Drawable f1199B;

    /* renamed from: C */
    private Drawable f1200C;

    /* renamed from: D */
    private Drawable f1201D;

    /* renamed from: E */
    private CharSequence f1202E;

    /* renamed from: F */
    private CharSequence f1203F;

    /* renamed from: G */
    private Object f1204G;

    /* renamed from: H */
    private boolean f1205H;

    /* renamed from: I */
    private Drawable f1206I;

    /* renamed from: J */
    private Drawable f1207J;

    /* renamed from: K */
    private Drawable f1208K;

    /* renamed from: L */
    private Drawable f1209L;

    /* renamed from: M */
    private final ArrayList<View> f1210M;

    /* renamed from: N */
    private Rect f1211N;

    /* renamed from: O */
    private Matrix f1212O;

    /* renamed from: e */
    private final C0375b f1213e;

    /* renamed from: f */
    private float f1214f;

    /* renamed from: g */
    private int f1215g;

    /* renamed from: h */
    private int f1216h;

    /* renamed from: i */
    private float f1217i;

    /* renamed from: j */
    private Paint f1218j;

    /* renamed from: k */
    private final C0351I f1219k;

    /* renamed from: l */
    private final C0351I f1220l;

    /* renamed from: m */
    private final C0379f f1221m;

    /* renamed from: n */
    private final C0379f f1222n;

    /* renamed from: o */
    private int f1223o;

    /* renamed from: p */
    private boolean f1224p;

    /* renamed from: q */
    private boolean f1225q;

    /* renamed from: r */
    private int f1226r;

    /* renamed from: s */
    private int f1227s;

    /* renamed from: t */
    private int f1228t;

    /* renamed from: u */
    private int f1229u;

    /* renamed from: v */
    private boolean f1230v;

    /* renamed from: w */
    private boolean f1231w;

    /* renamed from: x */
    private C0376c f1232x;

    /* renamed from: y */
    private List<C0376c> f1233y;

    /* renamed from: z */
    private float f1234z;

    /* renamed from: android.support.v4.widget.k$a */
    class C0374a extends C0134d {

        /* renamed from: c */
        private final Rect f1235c = new Rect();

        C0374a() {
        }

        /* renamed from: a */
        private void m1743a(C0123a aVar, C0123a aVar2) {
            Rect rect = this.f1235c;
            aVar2.mo421a(rect);
            aVar.mo433c(rect);
            aVar2.mo428b(rect);
            aVar.mo438d(rect);
            aVar.mo452i(aVar2.mo462r());
            aVar.mo435c(aVar2.mo437d());
            aVar.mo423a(aVar2.mo427b());
            aVar.mo430b(aVar2.mo432c());
            aVar.mo436c(aVar2.mo455k());
            aVar.mo431b(aVar2.mo454j());
            aVar.mo440d(aVar2.mo456l());
            aVar.mo443e(aVar2.mo457m());
            aVar.mo425a(aVar2.mo448g());
            aVar.mo449h(aVar2.mo461q());
            aVar.mo446f(aVar2.mo458n());
            aVar.mo420a(aVar2.mo419a());
        }

        /* renamed from: a */
        private void m1744a(C0123a aVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (C0373k.m1705g(childAt)) {
                    aVar.mo422a(childAt);
                }
            }
        }

        /* renamed from: a */
        public void mo376a(View view, C0123a aVar) {
            if (C0373k.f1196c) {
                super.mo376a(view, aVar);
            } else {
                C0123a a = C0123a.m403a(aVar);
                super.mo376a(view, a);
                aVar.mo434c(view);
                ViewParent k = C0156v.m570k(view);
                if (k instanceof View) {
                    aVar.mo429b((View) k);
                }
                m1743a(aVar, a);
                a.mo463s();
                m1744a(aVar, (ViewGroup) view);
            }
            aVar.mo423a((CharSequence) C0373k.class.getName());
            aVar.mo440d(false);
            aVar.mo443e(false);
            aVar.mo426a(C0124a.f334a);
            aVar.mo426a(C0124a.f335b);
        }

        /* renamed from: a */
        public boolean mo476a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.mo476a(view, accessibilityEvent);
            }
            List text = accessibilityEvent.getText();
            View d = C0373k.this.mo1748d();
            if (d != null) {
                CharSequence d2 = C0373k.this.mo1749d(C0373k.this.mo1752e(d));
                if (d2 != null) {
                    text.add(d2);
                }
            }
            return true;
        }

        /* renamed from: a */
        public boolean mo477a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (C0373k.f1196c || C0373k.m1705g(view)) {
                return super.mo477a(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        /* renamed from: b */
        public void mo378b(View view, AccessibilityEvent accessibilityEvent) {
            super.mo378b(view, accessibilityEvent);
            accessibilityEvent.setClassName(C0373k.class.getName());
        }
    }

    /* renamed from: android.support.v4.widget.k$b */
    static final class C0375b extends C0134d {
        C0375b() {
        }

        /* renamed from: a */
        public void mo376a(View view, C0123a aVar) {
            super.mo376a(view, aVar);
            if (!C0373k.m1705g(view)) {
                aVar.mo429b((View) null);
            }
        }
    }

    /* renamed from: android.support.v4.widget.k$c */
    public interface C0376c {
        /* renamed from: a */
        void mo1786a(int i);

        /* renamed from: a */
        void mo1787a(View view);

        /* renamed from: a */
        void mo1788a(View view, float f);

        /* renamed from: b */
        void mo1789b(View view);
    }

    /* renamed from: android.support.v4.widget.k$d */
    public static class C0377d extends MarginLayoutParams {

        /* renamed from: a */
        public int f1237a = 0;

        /* renamed from: b */
        float f1238b;

        /* renamed from: c */
        boolean f1239c;

        /* renamed from: d */
        int f1240d;

        public C0377d(int i, int i2) {
            super(i, i2);
        }

        public C0377d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0373k.f1195b);
            this.f1237a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C0377d(C0377d dVar) {
            super(dVar);
            this.f1237a = dVar.f1237a;
        }

        public C0377d(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0377d(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* renamed from: android.support.v4.widget.k$e */
    protected static class C0378e extends C0133c {
        public static final Creator<C0378e> CREATOR = new C0380l();

        /* renamed from: a */
        int f1241a = 0;

        /* renamed from: b */
        int f1242b;

        /* renamed from: c */
        int f1243c;

        /* renamed from: d */
        int f1244d;

        /* renamed from: e */
        int f1245e;

        public C0378e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1241a = parcel.readInt();
            this.f1242b = parcel.readInt();
            this.f1243c = parcel.readInt();
            this.f1244d = parcel.readInt();
            this.f1245e = parcel.readInt();
        }

        public C0378e(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1241a);
            parcel.writeInt(this.f1242b);
            parcel.writeInt(this.f1243c);
            parcel.writeInt(this.f1244d);
            parcel.writeInt(this.f1245e);
        }
    }

    /* renamed from: android.support.v4.widget.k$f */
    private class C0379f extends C0352a {

        /* renamed from: a */
        private final int f1246a;

        /* renamed from: b */
        private C0351I f1247b;

        /* renamed from: c */
        private final Runnable f1248c = new C0381m(this);

        C0379f(int i) {
            this.f1246a = i;
        }

        /* renamed from: c */
        private void m1754c() {
            int i = 3;
            if (this.f1246a == 3) {
                i = 5;
            }
            View b = C0373k.this.mo1734b(i);
            if (b != null) {
                C0373k.this.mo1726a(b);
            }
        }

        /* renamed from: a */
        public int mo1536a(View view) {
            if (C0373k.this.mo1762j(view)) {
                return view.getWidth();
            }
            return 0;
        }

        /* renamed from: a */
        public int mo1537a(View view, int i, int i2) {
            int width;
            int width2;
            if (C0373k.this.mo1731a(view, 3)) {
                width2 = -view.getWidth();
                width = 0;
            } else {
                width = C0373k.this.getWidth();
                width2 = width - view.getWidth();
            }
            return Math.max(width2, Math.min(i, width));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1790a() {
            View view;
            int i;
            int c = this.f1247b.mo1528c();
            int i2 = 0;
            boolean z = this.f1246a == 3;
            if (z) {
                view = C0373k.this.mo1734b(3);
                if (view != null) {
                    i2 = -view.getWidth();
                }
                i = i2 + c;
            } else {
                view = C0373k.this.mo1734b(5);
                i = C0373k.this.getWidth() - c;
            }
            if (view == null) {
                return;
            }
            if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && C0373k.this.mo1747d(view) == 0) {
                C0377d dVar = (C0377d) view.getLayoutParams();
                this.f1247b.mo1527b(view, i, view.getTop());
                dVar.f1239c = true;
                C0373k.this.invalidate();
                m1754c();
                C0373k.this.mo1720a();
            }
        }

        /* renamed from: a */
        public void mo1538a(int i, int i2) {
            C0373k kVar;
            int i3;
            if ((i & 1) == 1) {
                kVar = C0373k.this;
                i3 = 3;
            } else {
                kVar = C0373k.this;
                i3 = 5;
            }
            View b = kVar.mo1734b(i3);
            if (b != null && C0373k.this.mo1747d(b) == 0) {
                this.f1247b.mo1517a(b, i2);
            }
        }

        /* renamed from: a */
        public void mo1791a(C0351I i) {
            this.f1247b = i;
        }

        /* renamed from: a */
        public void mo1539a(View view, float f, float f2) {
            int i;
            float f3 = C0373k.this.mo1753f(view);
            int width = view.getWidth();
            if (C0373k.this.mo1731a(view, 3)) {
                i = (f > 0.0f || (f == 0.0f && f3 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = C0373k.this.getWidth();
                if (f < 0.0f || (f == 0.0f && f3 > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f1247b.mo1533d(i, view.getTop());
            C0373k.this.invalidate();
        }

        /* renamed from: a */
        public void mo1540a(View view, int i) {
            ((C0377d) view.getLayoutParams()).f1239c = false;
            m1754c();
        }

        /* renamed from: a */
        public void mo1541a(View view, int i, int i2, int i3, int i4) {
            int width = view.getWidth();
            float width2 = (C0373k.this.mo1731a(view, 3) ? (float) (i + width) : (float) (C0373k.this.getWidth() - i)) / ((float) width);
            C0373k.this.mo1744c(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            C0373k.this.invalidate();
        }

        /* renamed from: b */
        public int mo1543b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: b */
        public void mo1792b() {
            C0373k.this.removeCallbacks(this.f1248c);
        }

        /* renamed from: b */
        public void mo1544b(int i, int i2) {
            C0373k.this.postDelayed(this.f1248c, 160);
        }

        /* renamed from: b */
        public boolean mo1545b(int i) {
            return false;
        }

        /* renamed from: b */
        public boolean mo1546b(View view, int i) {
            return C0373k.this.mo1762j(view) && C0373k.this.mo1731a(view, this.f1246a) && C0373k.this.mo1747d(view) == 0;
        }

        /* renamed from: c */
        public void mo1547c(int i) {
            C0373k.this.mo1723a(this.f1246a, i, this.f1247b.mo1522b());
        }
    }

    static {
        boolean z = true;
        if (VERSION.SDK_INT < 21) {
            z = false;
        }
        f1197d = z;
    }

    public C0373k(Context context) {
        this(context, null);
    }

    public C0373k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0373k(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1213e = new C0375b();
        this.f1216h = -1728053248;
        this.f1218j = new Paint();
        this.f1225q = true;
        this.f1226r = 3;
        this.f1227s = 3;
        this.f1228t = 3;
        this.f1229u = 3;
        this.f1206I = null;
        this.f1207J = null;
        this.f1208K = null;
        this.f1209L = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f1215g = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        this.f1221m = new C0379f(3);
        this.f1222n = new C0379f(5);
        this.f1219k = C0351I.m1509a((ViewGroup) this, 1.0f, (C0352a) this.f1221m);
        this.f1219k.mo1532d(1);
        this.f1219k.mo1515a(f2);
        this.f1221m.mo1791a(this.f1219k);
        this.f1220l = C0351I.m1509a((ViewGroup) this, 1.0f, (C0352a) this.f1222n);
        this.f1220l.mo1532d(2);
        this.f1220l.mo1515a(f2);
        this.f1222n.mo1791a(this.f1220l);
        setFocusableInTouchMode(true);
        C0156v.m560d(this, 1);
        C0156v.m543a((View) this, (C0134d) new C0374a());
        setMotionEventSplittingEnabled(false);
        if (C0156v.m562e(this)) {
            if (VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new C0372j(this));
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f1194a);
                try {
                    this.f1199B = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.f1199B = null;
            }
        }
        this.f1214f = f * 10.0f;
        this.f1210M = new ArrayList<>();
    }

    /* renamed from: a */
    private boolean m1696a(float f, float f2, View view) {
        if (this.f1211N == null) {
            this.f1211N = new Rect();
        }
        view.getHitRect(this.f1211N);
        return this.f1211N.contains((int) f, (int) f2);
    }

    /* renamed from: a */
    private boolean m1697a(Drawable drawable, int i) {
        if (drawable == null || !C0311a.m1347e(drawable)) {
            return false;
        }
        C0311a.m1342a(drawable, i);
        return true;
    }

    /* renamed from: a */
    private boolean m1698a(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent b = m1699b(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(b);
            b.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = (float) (getScrollX() - view.getLeft());
        float scrollY = (float) (getScrollY() - view.getTop());
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    /* renamed from: b */
    private MotionEvent m1699b(MotionEvent motionEvent, View view) {
        float scrollX = (float) (getScrollX() - view.getLeft());
        float scrollY = (float) (getScrollY() - view.getTop());
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f1212O == null) {
                this.f1212O = new Matrix();
            }
            matrix.invert(this.f1212O);
            obtain.transform(this.f1212O);
        }
        return obtain;
    }

    /* renamed from: c */
    private void m1700c(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0156v.m560d(childAt, ((z || mo1762j(childAt)) && (!z || childAt != view)) ? 4 : 1);
        }
    }

    /* renamed from: e */
    static String m1701e(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    /* renamed from: e */
    private boolean mo6061e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C0377d) getChildAt(i).getLayoutParams()).f1239c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private boolean mo6062f() {
        return mo1748d() != null;
    }

    /* renamed from: g */
    private Drawable mo6063g() {
        int g = C0156v.m565g(this);
        if (g == 0) {
            Drawable drawable = this.f1206I;
            if (drawable != null) {
                m1697a(drawable, g);
                return this.f1206I;
            }
        } else {
            Drawable drawable2 = this.f1207J;
            if (drawable2 != null) {
                m1697a(drawable2, g);
                return this.f1207J;
            }
        }
        return this.f1208K;
    }

    /* renamed from: g */
    static boolean m1705g(View view) {
        return (C0156v.m563f(view) == 4 || C0156v.m563f(view) == 2) ? false : true;
    }

    /* renamed from: h */
    private Drawable m1706h() {
        int g = C0156v.m565g(this);
        if (g == 0) {
            Drawable drawable = this.f1207J;
            if (drawable != null) {
                m1697a(drawable, g);
                return this.f1207J;
            }
        } else {
            Drawable drawable2 = this.f1206I;
            if (drawable2 != null) {
                m1697a(drawable2, g);
                return this.f1206I;
            }
        }
        return this.f1209L;
    }

    /* renamed from: i */
    private void m1707i() {
        if (!f1197d) {
            this.f1200C = mo6063g();
            this.f1201D = m1706h();
        }
    }

    /* renamed from: m */
    private static boolean m1708m(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1720a() {
        if (!this.f1231w) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.f1231w = true;
        }
    }

    /* renamed from: a */
    public void mo1721a(int i) {
        mo1724a(i, true);
    }

    /* renamed from: a */
    public void mo1722a(int i, int i2) {
        int a = C0139f.m475a(i2, C0156v.m565g(this));
        if (i2 == 3) {
            this.f1226r = i;
        } else if (i2 == 5) {
            this.f1227s = i;
        } else if (i2 == 8388611) {
            this.f1228t = i;
        } else if (i2 == 8388613) {
            this.f1229u = i;
        }
        if (i != 0) {
            (a == 3 ? this.f1219k : this.f1220l).mo1514a();
        }
        if (i == 1) {
            View b = mo1734b(a);
            if (b != null) {
                mo1726a(b);
            }
        } else if (i == 2) {
            View b2 = mo1734b(a);
            if (b2 != null) {
                mo1764l(b2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1723a(int i, int i2, View view) {
        int e = this.f1219k.mo1534e();
        int e2 = this.f1220l.mo1534e();
        int i3 = 2;
        if (e == 1 || e2 == 1) {
            i3 = 1;
        } else if (!(e == 2 || e2 == 2)) {
            i3 = 0;
        }
        if (view != null && i2 == 0) {
            float f = ((C0377d) view.getLayoutParams()).f1238b;
            if (f == 0.0f) {
                mo1738b(view);
            } else if (f == 1.0f) {
                mo1743c(view);
            }
        }
        if (i3 != this.f1223o) {
            this.f1223o = i3;
            List<C0376c> list = this.f1233y;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C0376c) this.f1233y.get(size)).mo1786a(i3);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1724a(int i, boolean z) {
        View b = mo1734b(i);
        if (b != null) {
            mo1728a(b, z);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No drawer view found with gravity ");
        sb.append(m1701e(i));
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public void mo1725a(C0376c cVar) {
        if (cVar != null) {
            if (this.f1233y == null) {
                this.f1233y = new ArrayList();
            }
            this.f1233y.add(cVar);
        }
    }

    /* renamed from: a */
    public void mo1726a(View view) {
        mo1728a(view, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1727a(View view, float f) {
        List<C0376c> list = this.f1233y;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((C0376c) this.f1233y.get(size)).mo1788a(view, f);
            }
        }
    }

    /* renamed from: a */
    public void mo1728a(View view, boolean z) {
        C0351I i;
        int i2;
        if (mo1762j(view)) {
            C0377d dVar = (C0377d) view.getLayoutParams();
            if (this.f1225q) {
                dVar.f1238b = 0.0f;
                dVar.f1240d = 0;
            } else if (z) {
                dVar.f1240d |= 4;
                if (mo1731a(view, 3)) {
                    i = this.f1219k;
                    i2 = -view.getWidth();
                } else {
                    i = this.f1220l;
                    i2 = getWidth();
                }
                i.mo1527b(view, i2, view.getTop());
            } else {
                mo1739b(view, 0.0f);
                mo1723a(dVar.f1237a, 0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a sliding drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public void mo1729a(Object obj, boolean z) {
        this.f1204G = obj;
        this.f1205H = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1730a(boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0377d dVar = (C0377d) childAt.getLayoutParams();
            if (mo1762j(childAt) && (!z || dVar.f1239c)) {
                z2 |= mo1731a(childAt, 3) ? this.f1219k.mo1527b(childAt, -childAt.getWidth(), childAt.getTop()) : this.f1220l.mo1527b(childAt, getWidth(), childAt.getTop());
                dVar.f1239c = false;
            }
        }
        this.f1221m.mo1792b();
        this.f1222n.mo1792b();
        if (z2) {
            invalidate();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo1731a(View view, int i) {
        return (mo1752e(view) & i) == i;
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z = false;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!mo1762j(childAt)) {
                    this.f1210M.add(childAt);
                } else if (mo1761i(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            }
            if (!z) {
                int size = this.f1210M.size();
                for (int i4 = 0; i4 < size; i4++) {
                    View view = (View) this.f1210M.get(i4);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.f1210M.clear();
        }
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        C0156v.m560d(view, (mo1742c() != null || mo1762j(view)) ? 4 : 1);
        if (!f1196c) {
            C0156v.m543a(view, (C0134d) this.f1213e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public View mo1734b(int i) {
        int a = C0139f.m475a(i, C0156v.m565g(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((mo1752e(childAt) & 7) == a) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: b */
    public void mo1735b() {
        mo1730a(false);
    }

    /* renamed from: b */
    public void mo1736b(int i, boolean z) {
        View b = mo1734b(i);
        if (b != null) {
            mo1740b(b, z);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No drawer view found with gravity ");
        sb.append(m1701e(i));
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public void mo1737b(C0376c cVar) {
        if (cVar != null) {
            List<C0376c> list = this.f1233y;
            if (list != null) {
                list.remove(cVar);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1738b(View view) {
        C0377d dVar = (C0377d) view.getLayoutParams();
        if ((dVar.f1240d & 1) == 1) {
            dVar.f1240d = 0;
            List<C0376c> list = this.f1233y;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C0376c) this.f1233y.get(size)).mo1789b(view);
                }
            }
            m1700c(view, false);
            if (hasWindowFocus()) {
                View rootView = getRootView();
                if (rootView != null) {
                    rootView.sendAccessibilityEvent(32);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1739b(View view, float f) {
        float width = (float) view.getWidth();
        int i = (int) (width * f);
        int f2 = i - ((int) (mo1753f(view) * width));
        if (!mo1731a(view, 3)) {
            f2 = -f2;
        }
        view.offsetLeftAndRight(f2);
        mo1744c(view, f);
    }

    /* renamed from: b */
    public void mo1740b(View view, boolean z) {
        if (mo1762j(view)) {
            C0377d dVar = (C0377d) view.getLayoutParams();
            if (this.f1225q) {
                dVar.f1238b = 1.0f;
                dVar.f1240d = 1;
                m1700c(view, true);
            } else if (z) {
                dVar.f1240d |= 2;
                if (mo1731a(view, 3)) {
                    this.f1219k.mo1527b(view, 0, view.getTop());
                } else {
                    this.f1220l.mo1527b(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                mo1739b(view, 1.0f);
                mo1723a(dVar.f1237a, 0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a sliding drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    public int mo1741c(int i) {
        int g = C0156v.m565g(this);
        if (i == 3) {
            int i2 = this.f1226r;
            if (i2 != 3) {
                return i2;
            }
            int i3 = g == 0 ? this.f1228t : this.f1229u;
            if (i3 != 3) {
                return i3;
            }
        } else if (i == 5) {
            int i4 = this.f1227s;
            if (i4 != 3) {
                return i4;
            }
            int i5 = g == 0 ? this.f1229u : this.f1228t;
            if (i5 != 3) {
                return i5;
            }
        } else if (i == 8388611) {
            int i6 = this.f1228t;
            if (i6 != 3) {
                return i6;
            }
            int i7 = g == 0 ? this.f1226r : this.f1227s;
            if (i7 != 3) {
                return i7;
            }
        } else if (i == 8388613) {
            int i8 = this.f1229u;
            if (i8 != 3) {
                return i8;
            }
            int i9 = g == 0 ? this.f1227s : this.f1226r;
            if (i9 != 3) {
                return i9;
            }
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public View mo1742c() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((C0377d) childAt.getLayoutParams()).f1240d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo1743c(View view) {
        C0377d dVar = (C0377d) view.getLayoutParams();
        if ((dVar.f1240d & 1) == 0) {
            dVar.f1240d = 1;
            List<C0376c> list = this.f1233y;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C0376c) this.f1233y.get(size)).mo1787a(view);
                }
            }
            m1700c(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo1744c(View view, float f) {
        C0377d dVar = (C0377d) view.getLayoutParams();
        if (f != dVar.f1238b) {
            dVar.f1238b = f;
            mo1727a(view, f);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof C0377d) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((C0377d) getChildAt(i).getLayoutParams()).f1238b);
        }
        this.f1217i = f;
        boolean a = this.f1219k.mo1521a(true);
        boolean a2 = this.f1220l.mo1521a(true);
        if (a || a2) {
            C0156v.m579t(this);
        }
    }

    /* renamed from: d */
    public int mo1747d(View view) {
        if (mo1762j(view)) {
            return mo1741c(((C0377d) view.getLayoutParams()).f1237a);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public View mo1748d() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (mo1762j(childAt) && mo1763k(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: d */
    public CharSequence mo1749d(int i) {
        int a = C0139f.m475a(i, C0156v.m565g(this));
        if (a == 3) {
            return this.f1202E;
        }
        if (a == 5) {
            return this.f1203F;
        }
        return null;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f1217i <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount != 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            for (int i = childCount - 1; i >= 0; i--) {
                View childAt = getChildAt(i);
                if (m1696a(x, y, childAt) && !mo1760h(childAt) && m1698a(motionEvent, childAt)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        Drawable drawable;
        Canvas canvas2 = canvas;
        View view2 = view;
        int height = getHeight();
        boolean h = mo1760h(view2);
        int width = getWidth();
        int save = canvas.save();
        int i2 = 0;
        if (h) {
            int childCount = getChildCount();
            i = width;
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt != view2 && childAt.getVisibility() == 0 && m1708m(childAt) && mo1762j(childAt) && childAt.getHeight() >= height) {
                    if (mo1731a(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i3) {
                            i3 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < i) {
                            i = left;
                        }
                    }
                }
            }
            canvas.clipRect(i3, 0, i, getHeight());
            i2 = i3;
        } else {
            i = width;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f = this.f1217i;
        if (f <= 0.0f || !h) {
            if (this.f1200C != null && mo1731a(view2, 3)) {
                int intrinsicWidth = this.f1200C.getIntrinsicWidth();
                int right2 = view.getRight();
                float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.f1219k.mo1528c()), 1.0f));
                this.f1200C.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
                this.f1200C.setAlpha((int) (max * 255.0f));
                drawable = this.f1200C;
            } else if (this.f1201D != null && mo1731a(view2, 5)) {
                int intrinsicWidth2 = this.f1201D.getIntrinsicWidth();
                int left2 = view.getLeft();
                float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left2)) / ((float) this.f1220l.mo1528c()), 1.0f));
                this.f1201D.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
                this.f1201D.setAlpha((int) (max2 * 255.0f));
                drawable = this.f1201D;
            }
            drawable.draw(canvas);
        } else {
            int i5 = this.f1216h;
            this.f1218j.setColor((i5 & 16777215) | (((int) (((float) ((-16777216 & i5) >>> 24)) * f)) << 24));
            canvas.drawRect((float) i2, 0.0f, (float) i, (float) getHeight(), this.f1218j);
        }
        return drawChild;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo1752e(View view) {
        return C0139f.m475a(((C0377d) view.getLayoutParams()).f1237a, C0156v.m565g(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public float mo1753f(View view) {
        return ((C0377d) view.getLayoutParams()).f1238b;
    }

    /* renamed from: f */
    public void mo1754f(int i) {
        mo1736b(i, true);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new C0377d(-1, -1);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0377d(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0377d ? new C0377d((C0377d) layoutParams) : layoutParams instanceof MarginLayoutParams ? new C0377d((MarginLayoutParams) layoutParams) : new C0377d(layoutParams);
    }

    public float getDrawerElevation() {
        if (f1197d) {
            return this.f1214f;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f1199B;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public boolean mo1760h(View view) {
        return ((C0377d) view.getLayoutParams()).f1237a == 0;
    }

    /* renamed from: i */
    public boolean mo1761i(View view) {
        if (mo1762j(view)) {
            return (((C0377d) view.getLayoutParams()).f1240d & 1) == 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo1762j(View view) {
        int a = C0139f.m475a(((C0377d) view.getLayoutParams()).f1237a, C0156v.m565g(view));
        return ((a & 3) == 0 && (a & 5) == 0) ? false : true;
    }

    /* renamed from: k */
    public boolean mo1763k(View view) {
        if (mo1762j(view)) {
            return ((C0377d) view.getLayoutParams()).f1238b > 0.0f;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: l */
    public void mo1764l(View view) {
        mo1740b(view, true);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1225q = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1225q = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r5) {
        /*
            r4 = this;
            super.onDraw(r5)
            boolean r0 = r4.f1205H
            if (r0 == 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r4.f1199B
            if (r0 == 0) goto L_0x002e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            r2 = 0
            if (r0 < r1) goto L_0x001d
            java.lang.Object r0 = r4.f1204G
            if (r0 == 0) goto L_0x001d
            android.view.WindowInsets r0 = (android.view.WindowInsets) r0
            int r0 = r0.getSystemWindowInsetTop()
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r1 = r4.f1199B
            int r3 = r4.getWidth()
            r1.setBounds(r2, r2, r3, r0)
            android.graphics.drawable.Drawable r0 = r4.f1199B
            r0.draw(r5)
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v4.widget.C0373k.onDraw(android.graphics.Canvas):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0 != 3) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            android.support.v4.widget.I r1 = r6.f1219k
            boolean r1 = r1.mo1525b(r7)
            android.support.v4.widget.I r2 = r6.f1220l
            boolean r2 = r2.mo1525b(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x003a
            if (r0 == r2) goto L_0x0031
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L_0x001e
            if (r0 == r4) goto L_0x0031
            goto L_0x0038
        L_0x001e:
            android.support.v4.widget.I r7 = r6.f1219k
            boolean r7 = r7.mo1518a(r4)
            if (r7 == 0) goto L_0x0038
            android.support.v4.widget.k$f r7 = r6.f1221m
            r7.mo1792b()
            android.support.v4.widget.k$f r7 = r6.f1222n
            r7.mo1792b()
            goto L_0x0038
        L_0x0031:
            r6.mo1730a(r2)
            r6.f1230v = r3
            r6.f1231w = r3
        L_0x0038:
            r7 = 0
            goto L_0x0064
        L_0x003a:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f1234z = r0
            r6.f1198A = r7
            float r4 = r6.f1217i
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x005f
            android.support.v4.widget.I r4 = r6.f1219k
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.mo1523b(r0, r7)
            if (r7 == 0) goto L_0x005f
            boolean r7 = r6.mo1760h(r7)
            if (r7 == 0) goto L_0x005f
            r7 = 1
            goto L_0x0060
        L_0x005f:
            r7 = 0
        L_0x0060:
            r6.f1230v = r3
            r6.f1231w = r3
        L_0x0064:
            if (r1 != 0) goto L_0x0074
            if (r7 != 0) goto L_0x0074
            boolean r7 = r6.mo6061e()
            if (r7 != 0) goto L_0x0074
            boolean r7 = r6.f1231w
            if (r7 == 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r2 = 0
        L_0x0074:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v4.widget.C0373k.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !mo6062f()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View d = mo1748d();
        if (d != null && mo1747d(d) == 0) {
            mo1735b();
        }
        return d != null;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        int measuredHeight;
        int i6;
        int i7;
        this.f1224p = true;
        int i8 = i3 - i;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C0377d dVar = (C0377d) childAt.getLayoutParams();
                if (mo1760h(childAt)) {
                    int i10 = dVar.leftMargin;
                    childAt.layout(i10, dVar.topMargin, childAt.getMeasuredWidth() + i10, dVar.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    if (mo1731a(childAt, 3)) {
                        float f2 = (float) measuredWidth;
                        i5 = (-measuredWidth) + ((int) (dVar.f1238b * f2));
                        f = ((float) (measuredWidth + i5)) / f2;
                    } else {
                        float f3 = (float) measuredWidth;
                        int i11 = i8 - ((int) (dVar.f1238b * f3));
                        f = ((float) (i8 - i11)) / f3;
                        i5 = i11;
                    }
                    boolean z2 = f != dVar.f1238b;
                    int i12 = dVar.f1237a & C0172j.AppCompatTheme_windowActionBarOverlay;
                    if (i12 != 16) {
                        if (i12 != 80) {
                            measuredHeight = dVar.topMargin;
                            i6 = measuredWidth + i5;
                            i7 = measuredHeight2 + measuredHeight;
                        } else {
                            int i13 = i4 - i2;
                            measuredHeight = (i13 - dVar.bottomMargin) - childAt.getMeasuredHeight();
                            i6 = measuredWidth + i5;
                            i7 = i13 - dVar.bottomMargin;
                        }
                        childAt.layout(i5, measuredHeight, i6, i7);
                    } else {
                        int i14 = i4 - i2;
                        int i15 = (i14 - measuredHeight2) / 2;
                        int i16 = dVar.topMargin;
                        if (i15 < i16) {
                            i15 = i16;
                        } else {
                            int i17 = i15 + measuredHeight2;
                            int i18 = dVar.bottomMargin;
                            if (i17 > i14 - i18) {
                                i15 = (i14 - i18) - measuredHeight2;
                            }
                        }
                        childAt.layout(i5, i15, measuredWidth + i5, measuredHeight2 + i15);
                    }
                    if (z2) {
                        mo1744c(childAt, f);
                    }
                    int i19 = dVar.f1238b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i19) {
                        childAt.setVisibility(i19);
                    }
                }
            }
        }
        this.f1224p = false;
        this.f1225q = false;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = 300;
                }
                if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        boolean z = this.f1204G != null && C0156v.m562e(this);
        int g = C0156v.m565g(this);
        int childCount = getChildCount();
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0377d dVar = (C0377d) childAt.getLayoutParams();
                if (z) {
                    int a = C0139f.m475a(dVar.f1237a, g);
                    if (C0156v.m562e(childAt)) {
                        if (VERSION.SDK_INT >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.f1204G;
                            if (a == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                            } else if (a == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (VERSION.SDK_INT >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.f1204G;
                        if (a == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i3, windowInsets2.getSystemWindowInsetBottom());
                        } else if (a == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i3, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        dVar.leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        dVar.topMargin = windowInsets2.getSystemWindowInsetTop();
                        dVar.rightMargin = windowInsets2.getSystemWindowInsetRight();
                        dVar.bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (mo1760h(childAt)) {
                    childAt.measure(MeasureSpec.makeMeasureSpec((size - dVar.leftMargin) - dVar.rightMargin, 1073741824), MeasureSpec.makeMeasureSpec((size2 - dVar.topMargin) - dVar.bottomMargin, 1073741824));
                } else if (mo1762j(childAt)) {
                    if (f1197d) {
                        float d = C0156v.m559d(childAt);
                        float f = this.f1214f;
                        if (d != f) {
                            C0156v.m540a(childAt, f);
                        }
                    }
                    int e = mo1752e(childAt) & 7;
                    boolean z4 = e == 3;
                    if ((!z4 || !z2) && (z4 || !z3)) {
                        if (z4) {
                            z2 = true;
                        } else {
                            z3 = true;
                        }
                        childAt.measure(ViewGroup.getChildMeasureSpec(i, this.f1215g + dVar.leftMargin + dVar.rightMargin, dVar.width), ViewGroup.getChildMeasureSpec(i2, dVar.topMargin + dVar.bottomMargin, dVar.height));
                        i4++;
                        i3 = 0;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Child drawer has absolute gravity ");
                        sb.append(m1701e(e));
                        sb.append(" but this ");
                        sb.append("DrawerLayout");
                        sb.append(" already has a ");
                        sb.append("drawer view along that edge");
                        throw new IllegalStateException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Child ");
                    sb2.append(childAt);
                    sb2.append(" at index ");
                    sb2.append(i4);
                    sb2.append(" does not have a valid layout_gravity - must be Gravity.LEFT, ");
                    sb2.append("Gravity.RIGHT or Gravity.NO_GRAVITY");
                    throw new IllegalStateException(sb2.toString());
                }
            }
            int i5 = i;
            int i6 = i2;
            i4++;
            i3 = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0378e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0378e eVar = (C0378e) parcelable;
        super.onRestoreInstanceState(eVar.mo471a());
        int i = eVar.f1241a;
        if (i != 0) {
            View b = mo1734b(i);
            if (b != null) {
                mo1764l(b);
            }
        }
        int i2 = eVar.f1242b;
        if (i2 != 3) {
            mo1722a(i2, 3);
        }
        int i3 = eVar.f1243c;
        if (i3 != 3) {
            mo1722a(i3, 5);
        }
        int i4 = eVar.f1244d;
        if (i4 != 3) {
            mo1722a(i4, 8388611);
        }
        int i5 = eVar.f1245e;
        if (i5 != 3) {
            mo1722a(i5, 8388613);
        }
    }

    public void onRtlPropertiesChanged(int i) {
        m1707i();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0378e eVar = new C0378e(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            C0377d dVar = (C0377d) getChildAt(i).getLayoutParams();
            boolean z = true;
            boolean z2 = dVar.f1240d == 1;
            if (dVar.f1240d != 2) {
                z = false;
            }
            if (z2 || z) {
                eVar.f1241a = dVar.f1237a;
            } else {
                i++;
            }
        }
        eVar.f1242b = this.f1226r;
        eVar.f1243c = this.f1227s;
        eVar.f1244d = this.f1228t;
        eVar.f1245e = this.f1229u;
        return eVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        this.f1219k.mo1516a(motionEvent);
        this.f1220l.mo1516a(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action == 1) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                View b = this.f1219k.mo1523b((int) x, (int) y);
                if (b != null && mo1760h(b)) {
                    float f = x - this.f1234z;
                    float f2 = y - this.f1198A;
                    int d = this.f1219k.mo1531d();
                    if ((f * f) + (f2 * f2) < ((float) (d * d))) {
                        View c = mo1742c();
                        if (!(c == null || mo1747d(c) == 2)) {
                            z = false;
                            mo1730a(z);
                            this.f1230v = false;
                        }
                    }
                }
                z = true;
                mo1730a(z);
                this.f1230v = false;
            } else if (action == 3) {
                mo1730a(true);
            }
            return true;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        this.f1234z = x2;
        this.f1198A = y2;
        this.f1230v = false;
        this.f1231w = false;
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f1230v = z;
        if (z) {
            mo1730a(true);
        }
    }

    public void requestLayout() {
        if (!this.f1224p) {
            super.requestLayout();
        }
    }

    public void setDrawerElevation(float f) {
        this.f1214f = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (mo1762j(childAt)) {
                C0156v.m540a(childAt, this.f1214f);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(C0376c cVar) {
        C0376c cVar2 = this.f1232x;
        if (cVar2 != null) {
            mo1737b(cVar2);
        }
        if (cVar != null) {
            mo1725a(cVar);
        }
        this.f1232x = cVar;
    }

    public void setDrawerLockMode(int i) {
        mo1722a(i, 3);
        mo1722a(i, 5);
    }

    public void setScrimColor(int i) {
        this.f1216h = i;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.f1199B = i != 0 ? C0039a.m111c(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f1199B = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f1199B = new ColorDrawable(i);
        invalidate();
    }
}
