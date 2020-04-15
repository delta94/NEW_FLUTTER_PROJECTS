package p000a.p005b.p009c.p018g.p019a;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import p000a.p005b.p021d.p022a.C0172j;

/* renamed from: a.b.c.g.a.a */
public class C0123a {

    /* renamed from: a */
    private final AccessibilityNodeInfo f325a;

    /* renamed from: b */
    public int f326b = -1;

    /* renamed from: a.b.c.g.a.a$a */
    public static class C0124a {

        /* renamed from: A */
        public static final C0124a f327A = new C0124a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_DOWN : null);

        /* renamed from: B */
        public static final C0124a f328B = new C0124a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_RIGHT : null);

        /* renamed from: C */
        public static final C0124a f329C = new C0124a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_CONTEXT_CLICK : null);

        /* renamed from: D */
        public static final C0124a f330D = new C0124a(VERSION.SDK_INT >= 24 ? AccessibilityAction.ACTION_SET_PROGRESS : null);

        /* renamed from: E */
        public static final C0124a f331E = new C0124a(VERSION.SDK_INT >= 26 ? AccessibilityAction.ACTION_MOVE_WINDOW : null);

        /* renamed from: F */
        public static final C0124a f332F = new C0124a(VERSION.SDK_INT >= 28 ? AccessibilityAction.ACTION_SHOW_TOOLTIP : null);

        /* renamed from: G */
        public static final C0124a f333G;

        /* renamed from: a */
        public static final C0124a f334a = new C0124a(1, null);

        /* renamed from: b */
        public static final C0124a f335b = new C0124a(2, null);

        /* renamed from: c */
        public static final C0124a f336c = new C0124a(4, null);

        /* renamed from: d */
        public static final C0124a f337d = new C0124a(8, null);

        /* renamed from: e */
        public static final C0124a f338e = new C0124a(16, null);

        /* renamed from: f */
        public static final C0124a f339f = new C0124a(32, null);

        /* renamed from: g */
        public static final C0124a f340g = new C0124a(64, null);

        /* renamed from: h */
        public static final C0124a f341h = new C0124a(128, null);

        /* renamed from: i */
        public static final C0124a f342i = new C0124a(256, null);

        /* renamed from: j */
        public static final C0124a f343j = new C0124a(512, null);

        /* renamed from: k */
        public static final C0124a f344k = new C0124a(1024, null);

        /* renamed from: l */
        public static final C0124a f345l = new C0124a(2048, null);

        /* renamed from: m */
        public static final C0124a f346m = new C0124a(4096, null);

        /* renamed from: n */
        public static final C0124a f347n = new C0124a(8192, null);

        /* renamed from: o */
        public static final C0124a f348o = new C0124a(16384, null);

        /* renamed from: p */
        public static final C0124a f349p = new C0124a(32768, null);

        /* renamed from: q */
        public static final C0124a f350q = new C0124a(65536, null);

        /* renamed from: r */
        public static final C0124a f351r = new C0124a(131072, null);

        /* renamed from: s */
        public static final C0124a f352s = new C0124a(262144, null);

        /* renamed from: t */
        public static final C0124a f353t = new C0124a(524288, null);

        /* renamed from: u */
        public static final C0124a f354u = new C0124a(1048576, null);

        /* renamed from: v */
        public static final C0124a f355v = new C0124a(2097152, null);

        /* renamed from: w */
        public static final C0124a f356w = new C0124a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SHOW_ON_SCREEN : null);

        /* renamed from: x */
        public static final C0124a f357x = new C0124a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_TO_POSITION : null);

        /* renamed from: y */
        public static final C0124a f358y = new C0124a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_UP : null);

        /* renamed from: z */
        public static final C0124a f359z = new C0124a(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_LEFT : null);

        /* renamed from: H */
        final Object f360H;

        static {
            AccessibilityAction accessibilityAction = null;
            if (VERSION.SDK_INT >= 28) {
                accessibilityAction = AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            f333G = new C0124a(accessibilityAction);
        }

        public C0124a(int i, CharSequence charSequence) {
            this(VERSION.SDK_INT >= 21 ? new AccessibilityAction(i, charSequence) : null);
        }

        C0124a(Object obj) {
            this.f360H = obj;
        }
    }

    /* renamed from: a.b.c.g.a.a$b */
    public static class C0125b {

        /* renamed from: a */
        final Object f361a;

        C0125b(Object obj) {
            this.f361a = obj;
        }

        /* renamed from: a */
        public static C0125b m450a(int i, int i2, int i3, int i4, boolean z) {
            return VERSION.SDK_INT >= 19 ? new C0125b(CollectionItemInfo.obtain(i, i2, i3, i4, z)) : new C0125b(null);
        }
    }

    private C0123a(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f325a = accessibilityNodeInfo;
    }

    /* renamed from: a */
    public static C0123a m403a(C0123a aVar) {
        return m404a(AccessibilityNodeInfo.obtain(aVar.f325a));
    }

    /* renamed from: a */
    public static C0123a m404a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C0123a(accessibilityNodeInfo);
    }

    /* renamed from: b */
    private static String m405b(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case C0172j.AppCompatTheme_activityChooserViewStyle /*32*/:
                return "ACTION_LONG_CLICK";
            case C0172j.AppCompatTheme_dropDownListViewStyle /*64*/:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    /* renamed from: a */
    public int mo419a() {
        return this.f325a.getActions();
    }

    /* renamed from: a */
    public void mo420a(int i) {
        this.f325a.addAction(i);
    }

    /* renamed from: a */
    public void mo421a(Rect rect) {
        this.f325a.getBoundsInParent(rect);
    }

    /* renamed from: a */
    public void mo422a(View view) {
        this.f325a.addChild(view);
    }

    /* renamed from: a */
    public void mo423a(CharSequence charSequence) {
        this.f325a.setClassName(charSequence);
    }

    /* renamed from: a */
    public void mo424a(Object obj) {
        if (VERSION.SDK_INT >= 19) {
            this.f325a.setCollectionItemInfo(obj == null ? null : (CollectionItemInfo) ((C0125b) obj).f361a);
        }
    }

    /* renamed from: a */
    public void mo425a(boolean z) {
        if (VERSION.SDK_INT >= 16) {
            this.f325a.setAccessibilityFocused(z);
        }
    }

    /* renamed from: a */
    public boolean mo426a(C0124a aVar) {
        if (VERSION.SDK_INT >= 21) {
            return this.f325a.removeAction((AccessibilityAction) aVar.f360H);
        }
        return false;
    }

    /* renamed from: b */
    public CharSequence mo427b() {
        return this.f325a.getClassName();
    }

    /* renamed from: b */
    public void mo428b(Rect rect) {
        this.f325a.getBoundsInScreen(rect);
    }

    /* renamed from: b */
    public void mo429b(View view) {
        this.f325a.setParent(view);
    }

    /* renamed from: b */
    public void mo430b(CharSequence charSequence) {
        this.f325a.setContentDescription(charSequence);
    }

    /* renamed from: b */
    public void mo431b(boolean z) {
        this.f325a.setClickable(z);
    }

    /* renamed from: c */
    public CharSequence mo432c() {
        return this.f325a.getContentDescription();
    }

    /* renamed from: c */
    public void mo433c(Rect rect) {
        this.f325a.setBoundsInParent(rect);
    }

    /* renamed from: c */
    public void mo434c(View view) {
        this.f325a.setSource(view);
    }

    /* renamed from: c */
    public void mo435c(CharSequence charSequence) {
        this.f325a.setPackageName(charSequence);
    }

    /* renamed from: c */
    public void mo436c(boolean z) {
        this.f325a.setEnabled(z);
    }

    /* renamed from: d */
    public CharSequence mo437d() {
        return this.f325a.getPackageName();
    }

    /* renamed from: d */
    public void mo438d(Rect rect) {
        this.f325a.setBoundsInScreen(rect);
    }

    /* renamed from: d */
    public void mo439d(CharSequence charSequence) {
        if (VERSION.SDK_INT >= 19) {
            this.f325a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
        }
    }

    /* renamed from: d */
    public void mo440d(boolean z) {
        this.f325a.setFocusable(z);
    }

    /* renamed from: e */
    public CharSequence mo441e() {
        return this.f325a.getText();
    }

    /* renamed from: e */
    public void mo442e(CharSequence charSequence) {
        this.f325a.setText(charSequence);
    }

    /* renamed from: e */
    public void mo443e(boolean z) {
        this.f325a.setFocused(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0123a.class != obj.getClass()) {
            return false;
        }
        C0123a aVar = (C0123a) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f325a;
        if (accessibilityNodeInfo == null) {
            if (aVar.f325a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(aVar.f325a)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public String mo445f() {
        if (VERSION.SDK_INT >= 18) {
            return this.f325a.getViewIdResourceName();
        }
        return null;
    }

    /* renamed from: f */
    public void mo446f(boolean z) {
        this.f325a.setLongClickable(z);
    }

    /* renamed from: g */
    public void mo447g(boolean z) {
        this.f325a.setScrollable(z);
    }

    /* renamed from: g */
    public boolean mo448g() {
        if (VERSION.SDK_INT >= 16) {
            return this.f325a.isAccessibilityFocused();
        }
        return false;
    }

    /* renamed from: h */
    public void mo449h(boolean z) {
        this.f325a.setSelected(z);
    }

    /* renamed from: h */
    public boolean mo450h() {
        return this.f325a.isCheckable();
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f325a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public void mo452i(boolean z) {
        if (VERSION.SDK_INT >= 16) {
            this.f325a.setVisibleToUser(z);
        }
    }

    /* renamed from: i */
    public boolean mo453i() {
        return this.f325a.isChecked();
    }

    /* renamed from: j */
    public boolean mo454j() {
        return this.f325a.isClickable();
    }

    /* renamed from: k */
    public boolean mo455k() {
        return this.f325a.isEnabled();
    }

    /* renamed from: l */
    public boolean mo456l() {
        return this.f325a.isFocusable();
    }

    /* renamed from: m */
    public boolean mo457m() {
        return this.f325a.isFocused();
    }

    /* renamed from: n */
    public boolean mo458n() {
        return this.f325a.isLongClickable();
    }

    /* renamed from: o */
    public boolean mo459o() {
        return this.f325a.isPassword();
    }

    /* renamed from: p */
    public boolean mo460p() {
        return this.f325a.isScrollable();
    }

    /* renamed from: q */
    public boolean mo461q() {
        return this.f325a.isSelected();
    }

    /* renamed from: r */
    public boolean mo462r() {
        if (VERSION.SDK_INT >= 16) {
            return this.f325a.isVisibleToUser();
        }
        return false;
    }

    /* renamed from: s */
    public void mo463s() {
        this.f325a.recycle();
    }

    /* renamed from: t */
    public AccessibilityNodeInfo mo464t() {
        return this.f325a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        mo421a(rect);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("; boundsInParent: ");
        sb2.append(rect);
        sb.append(sb2.toString());
        mo428b(rect);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("; boundsInScreen: ");
        sb3.append(rect);
        sb.append(sb3.toString());
        sb.append("; packageName: ");
        sb.append(mo437d());
        sb.append("; className: ");
        sb.append(mo427b());
        sb.append("; text: ");
        sb.append(mo441e());
        sb.append("; contentDescription: ");
        sb.append(mo432c());
        sb.append("; viewId: ");
        sb.append(mo445f());
        sb.append("; checkable: ");
        sb.append(mo450h());
        sb.append("; checked: ");
        sb.append(mo453i());
        sb.append("; focusable: ");
        sb.append(mo456l());
        sb.append("; focused: ");
        sb.append(mo457m());
        sb.append("; selected: ");
        sb.append(mo461q());
        sb.append("; clickable: ");
        sb.append(mo454j());
        sb.append("; longClickable: ");
        sb.append(mo458n());
        sb.append("; enabled: ");
        sb.append(mo455k());
        sb.append("; password: ");
        sb.append(mo459o());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("; scrollable: ");
        sb4.append(mo460p());
        sb.append(sb4.toString());
        sb.append("; [");
        int a = mo419a();
        while (a != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(a);
            a &= numberOfTrailingZeros ^ -1;
            sb.append(m405b(numberOfTrailingZeros));
            if (a != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
