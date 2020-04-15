package android.support.p030v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p030v7.app.C0411a.C0412a;
import android.support.p030v7.view.menu.C0453D;
import android.support.p030v7.view.menu.C0468l;
import android.support.p030v7.view.menu.C0468l.C0469a;
import android.support.p030v7.view.menu.C0474p;
import android.support.p030v7.view.menu.C0485v;
import android.support.p030v7.view.menu.C0485v.C0486a;
import android.support.p030v7.widget.ActionMenuView.C0500e;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import p000a.p005b.p009c.p018g.C0133c;
import p000a.p005b.p009c.p018g.C0139f;
import p000a.p005b.p009c.p018g.C0143i;
import p000a.p005b.p009c.p018g.C0156v;
import p000a.p005b.p021d.p022a.C0163a;
import p000a.p005b.p021d.p022a.C0172j;
import p000a.p005b.p021d.p023b.p024a.C0173a;
import p000a.p005b.p021d.p028e.C0194c;
import p000a.p005b.p021d.p028e.C0199g;

/* renamed from: android.support.v7.widget.Toolbar */
public class Toolbar extends ViewGroup {

    /* renamed from: A */
    private int f2080A;

    /* renamed from: B */
    private boolean f2081B;

    /* renamed from: C */
    private boolean f2082C;

    /* renamed from: D */
    private final ArrayList<View> f2083D;

    /* renamed from: E */
    private final ArrayList<View> f2084E;

    /* renamed from: F */
    private final int[] f2085F;

    /* renamed from: G */
    C0546c f2086G;

    /* renamed from: H */
    private final C0500e f2087H;

    /* renamed from: I */
    private C0506Ca f2088I;

    /* renamed from: J */
    private C0577g f2089J;

    /* renamed from: K */
    private C0544a f2090K;

    /* renamed from: L */
    private C0486a f2091L;

    /* renamed from: M */
    private C0469a f2092M;

    /* renamed from: N */
    private boolean f2093N;

    /* renamed from: O */
    private final Runnable f2094O;

    /* renamed from: a */
    private ActionMenuView f2095a;

    /* renamed from: b */
    private TextView f2096b;

    /* renamed from: c */
    private TextView f2097c;

    /* renamed from: d */
    private ImageButton f2098d;

    /* renamed from: e */
    private ImageView f2099e;

    /* renamed from: f */
    private Drawable f2100f;

    /* renamed from: g */
    private CharSequence f2101g;

    /* renamed from: h */
    ImageButton f2102h;

    /* renamed from: i */
    View f2103i;

    /* renamed from: j */
    private Context f2104j;

    /* renamed from: k */
    private int f2105k;

    /* renamed from: l */
    private int f2106l;

    /* renamed from: m */
    private int f2107m;

    /* renamed from: n */
    int f2108n;

    /* renamed from: o */
    private int f2109o;

    /* renamed from: p */
    private int f2110p;

    /* renamed from: q */
    private int f2111q;

    /* renamed from: r */
    private int f2112r;

    /* renamed from: s */
    private int f2113s;

    /* renamed from: t */
    private C0559Y f2114t;

    /* renamed from: u */
    private int f2115u;

    /* renamed from: v */
    private int f2116v;

    /* renamed from: w */
    private int f2117w;

    /* renamed from: x */
    private CharSequence f2118x;

    /* renamed from: y */
    private CharSequence f2119y;

    /* renamed from: z */
    private int f2120z;

    /* renamed from: android.support.v7.widget.Toolbar$a */
    private class C0544a implements C0485v {

        /* renamed from: a */
        C0468l f2121a;

        /* renamed from: b */
        C0474p f2122b;

        C0544a() {
        }

        /* renamed from: a */
        public void mo2141a(Context context, C0468l lVar) {
            C0468l lVar2 = this.f2121a;
            if (lVar2 != null) {
                C0474p pVar = this.f2122b;
                if (pVar != null) {
                    lVar2.mo2062a(pVar);
                }
            }
            this.f2121a = lVar;
        }

        /* renamed from: a */
        public void mo2043a(C0468l lVar, boolean z) {
        }

        /* renamed from: a */
        public void mo2047a(boolean z) {
            if (this.f2122b != null) {
                C0468l lVar = this.f2121a;
                boolean z2 = false;
                if (lVar != null) {
                    int size = lVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f2121a.getItem(i) == this.f2122b) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo2149b(this.f2121a, this.f2122b);
                }
            }
        }

        /* renamed from: a */
        public boolean mo2048a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo2049a(C0453D d) {
            return false;
        }

        /* renamed from: a */
        public boolean mo2145a(C0468l lVar, C0474p pVar) {
            Toolbar.this.mo2840e();
            ViewParent parent = Toolbar.this.f2102h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f2102h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f2102h);
            }
            Toolbar.this.f2103i = pVar.getActionView();
            this.f2122b = pVar;
            ViewParent parent2 = Toolbar.this.f2103i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f2103i);
                }
                C0545b generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f1432a = 8388611 | (toolbar4.f2108n & C0172j.AppCompatTheme_windowActionBarOverlay);
                generateDefaultLayoutParams.f2124b = 2;
                toolbar4.f2103i.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f2103i);
            }
            Toolbar.this.mo2874j();
            Toolbar.this.requestLayout();
            pVar.mo2253a(true);
            View view = Toolbar.this.f2103i;
            if (view instanceof C0194c) {
                ((C0194c) view).onActionViewExpanded();
            }
            return true;
        }

        /* renamed from: b */
        public boolean mo2149b(C0468l lVar, C0474p pVar) {
            View view = Toolbar.this.f2103i;
            if (view instanceof C0194c) {
                ((C0194c) view).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f2103i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f2102h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f2103i = null;
            toolbar3.mo2831a();
            this.f2122b = null;
            Toolbar.this.requestLayout();
            pVar.mo2253a(false);
            return true;
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$b */
    public static class C0545b extends C0412a {

        /* renamed from: b */
        int f2124b;

        public C0545b(int i, int i2) {
            super(i, i2);
            this.f2124b = 0;
            this.f1432a = 8388627;
        }

        public C0545b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2124b = 0;
        }

        public C0545b(C0412a aVar) {
            super(aVar);
            this.f2124b = 0;
        }

        public C0545b(C0545b bVar) {
            super((C0412a) bVar);
            this.f2124b = 0;
            this.f2124b = bVar.f2124b;
        }

        public C0545b(LayoutParams layoutParams) {
            super(layoutParams);
            this.f2124b = 0;
        }

        public C0545b(MarginLayoutParams marginLayoutParams) {
            super((LayoutParams) marginLayoutParams);
            this.f2124b = 0;
            mo2909a(marginLayoutParams);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2909a(MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$c */
    public interface C0546c {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* renamed from: android.support.v7.widget.Toolbar$d */
    public static class C0547d extends C0133c {
        public static final Creator<C0547d> CREATOR = new C0628za();

        /* renamed from: a */
        int f2125a;

        /* renamed from: b */
        boolean f2126b;

        public C0547d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2125a = parcel.readInt();
            this.f2126b = parcel.readInt() != 0;
        }

        public C0547d(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2125a);
            parcel.writeInt(this.f2126b ? 1 : 0);
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0163a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2117w = 8388627;
        this.f2083D = new ArrayList<>();
        this.f2084E = new ArrayList<>();
        this.f2085F = new int[2];
        this.f2087H = new C0622wa(this);
        this.f2094O = new C0624xa(this);
        C0620va a = C0620va.m2920a(getContext(), attributeSet, C0172j.Toolbar, i, 0);
        this.f2106l = a.mo3267g(C0172j.Toolbar_titleTextAppearance, 0);
        this.f2107m = a.mo3267g(C0172j.Toolbar_subtitleTextAppearance, 0);
        this.f2117w = a.mo3263e(C0172j.Toolbar_android_gravity, this.f2117w);
        this.f2108n = a.mo3263e(C0172j.Toolbar_buttonGravity, 48);
        int b = a.mo3257b(C0172j.Toolbar_titleMargin, 0);
        if (a.mo3268g(C0172j.Toolbar_titleMargins)) {
            b = a.mo3257b(C0172j.Toolbar_titleMargins, b);
        }
        this.f2113s = b;
        this.f2112r = b;
        this.f2111q = b;
        this.f2110p = b;
        int b2 = a.mo3257b(C0172j.Toolbar_titleMarginStart, -1);
        if (b2 >= 0) {
            this.f2110p = b2;
        }
        int b3 = a.mo3257b(C0172j.Toolbar_titleMarginEnd, -1);
        if (b3 >= 0) {
            this.f2111q = b3;
        }
        int b4 = a.mo3257b(C0172j.Toolbar_titleMarginTop, -1);
        if (b4 >= 0) {
            this.f2112r = b4;
        }
        int b5 = a.mo3257b(C0172j.Toolbar_titleMarginBottom, -1);
        if (b5 >= 0) {
            this.f2113s = b5;
        }
        this.f2109o = a.mo3259c(C0172j.Toolbar_maxButtonHeight, -1);
        int b6 = a.mo3257b(C0172j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int b7 = a.mo3257b(C0172j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int c = a.mo3259c(C0172j.Toolbar_contentInsetLeft, 0);
        int c2 = a.mo3259c(C0172j.Toolbar_contentInsetRight, 0);
        m2664l();
        this.f2114t.mo3007a(c, c2);
        if (!(b6 == Integer.MIN_VALUE && b7 == Integer.MIN_VALUE)) {
            this.f2114t.mo3010b(b6, b7);
        }
        this.f2115u = a.mo3257b(C0172j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f2116v = a.mo3257b(C0172j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f2100f = a.mo3258b(C0172j.Toolbar_collapseIcon);
        this.f2101g = a.mo3264e(C0172j.Toolbar_collapseContentDescription);
        CharSequence e = a.mo3264e(C0172j.Toolbar_title);
        if (!TextUtils.isEmpty(e)) {
            setTitle(e);
        }
        CharSequence e2 = a.mo3264e(C0172j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(e2)) {
            setSubtitle(e2);
        }
        this.f2104j = getContext();
        setPopupTheme(a.mo3267g(C0172j.Toolbar_popupTheme, 0));
        Drawable b8 = a.mo3258b(C0172j.Toolbar_navigationIcon);
        if (b8 != null) {
            setNavigationIcon(b8);
        }
        CharSequence e3 = a.mo3264e(C0172j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(e3)) {
            setNavigationContentDescription(e3);
        }
        Drawable b9 = a.mo3258b(C0172j.Toolbar_logo);
        if (b9 != null) {
            setLogo(b9);
        }
        CharSequence e4 = a.mo3264e(C0172j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(e4)) {
            setLogoDescription(e4);
        }
        if (a.mo3268g(C0172j.Toolbar_titleTextColor)) {
            setTitleTextColor(a.mo3252a(C0172j.Toolbar_titleTextColor, -1));
        }
        if (a.mo3268g(C0172j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(a.mo3252a(C0172j.Toolbar_subtitleTextColor, -1));
        }
        a.mo3255a();
    }

    /* renamed from: a */
    private int m2650a(int i) {
        int g = C0156v.m565g(this);
        int a = C0139f.m475a(i, g) & 7;
        if (a != 1) {
            int i2 = 3;
            if (!(a == 3 || a == 5)) {
                if (g == 1) {
                    i2 = 5;
                }
                return i2;
            }
        }
        return a;
    }

    /* renamed from: a */
    private int m2651a(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return C0143i.m486b(marginLayoutParams) + C0143i.m485a(marginLayoutParams);
    }

    /* renamed from: a */
    private int m2652a(View view, int i) {
        C0545b bVar = (C0545b) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int b = m2659b(bVar.f1432a);
        if (b == 48) {
            return getPaddingTop() - i2;
        }
        if (b == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - bVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = bVar.topMargin;
        if (i3 < i4) {
            i3 = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            int i6 = bVar.bottomMargin;
            if (i5 < i6) {
                i3 = Math.max(0, i3 - (i6 - i5));
            }
        }
        return paddingTop + i3;
    }

    /* renamed from: a */
    private int m2653a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: a */
    private int m2654a(View view, int i, int[] iArr, int i2) {
        C0545b bVar = (C0545b) view.getLayoutParams();
        int i3 = bVar.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int a = m2652a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a, max + measuredWidth, view.getMeasuredHeight() + a);
        return max + measuredWidth + bVar.rightMargin;
    }

    /* renamed from: a */
    private int m2655a(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = i2;
        int i4 = i;
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            View view = (View) list.get(i5);
            C0545b bVar = (C0545b) view.getLayoutParams();
            int i7 = bVar.leftMargin - i4;
            int i8 = bVar.rightMargin - i3;
            int max = Math.max(0, i7);
            int max2 = Math.max(0, i8);
            int max3 = Math.max(0, -i7);
            i6 += max + view.getMeasuredWidth() + max2;
            i5++;
            i3 = Math.max(0, -i8);
            i4 = max3;
        }
        return i6;
    }

    /* renamed from: a */
    private void m2656a(View view, int i, int i2, int i3, int i4, int i5) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: a */
    private void m2657a(View view, boolean z) {
        LayoutParams layoutParams = view.getLayoutParams();
        C0545b bVar = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C0545b) layoutParams;
        bVar.f2124b = 1;
        if (!z || this.f2103i == null) {
            addView(view, bVar);
            return;
        }
        view.setLayoutParams(bVar);
        this.f2084E.add(view);
    }

    /* renamed from: a */
    private void m2658a(List<View> list, int i) {
        boolean z = C0156v.m565g(this) == 1;
        int childCount = getChildCount();
        int a = C0139f.m475a(i, C0156v.m565g(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C0545b bVar = (C0545b) childAt.getLayoutParams();
                if (bVar.f2124b == 0 && m2663d(childAt) && m2650a(bVar.f1432a) == a) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C0545b bVar2 = (C0545b) childAt2.getLayoutParams();
            if (bVar2.f2124b == 0 && m2663d(childAt2) && m2650a(bVar2.f1432a) == a) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: b */
    private int m2659b(int i) {
        int i2 = i & C0172j.AppCompatTheme_windowActionBarOverlay;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f2117w & C0172j.AppCompatTheme_windowActionBarOverlay;
    }

    /* renamed from: b */
    private int m2660b(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: b */
    private int m2661b(View view, int i, int[] iArr, int i2) {
        C0545b bVar = (C0545b) view.getLayoutParams();
        int i3 = bVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int a = m2652a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a, max, view.getMeasuredHeight() + a);
        return max - (measuredWidth + bVar.leftMargin);
    }

    /* renamed from: c */
    private boolean m2662c(View view) {
        return view.getParent() == this || this.f2084E.contains(view);
    }

    /* renamed from: d */
    private boolean m2663d(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private MenuInflater getMenuInflater() {
        return new C0199g(getContext());
    }

    /* renamed from: l */
    private void m2664l() {
        if (this.f2114t == null) {
            this.f2114t = new C0559Y();
        }
    }

    /* renamed from: m */
    private void m2665m() {
        if (this.f2099e == null) {
            this.f2099e = new C0615t(getContext());
        }
    }

    /* renamed from: n */
    private void m2666n() {
        m2667o();
        if (this.f2095a.mo2505g() == null) {
            C0468l lVar = (C0468l) this.f2095a.getMenu();
            if (this.f2090K == null) {
                this.f2090K = new C0544a();
            }
            this.f2095a.setExpandedActionViewsExclusive(true);
            lVar.mo2192a((C0485v) this.f2090K, this.f2104j);
        }
    }

    /* renamed from: o */
    private void m2667o() {
        if (this.f2095a == null) {
            this.f2095a = new ActionMenuView(getContext());
            this.f2095a.setPopupTheme(this.f2105k);
            this.f2095a.setOnMenuItemClickListener(this.f2087H);
            this.f2095a.mo2496a(this.f2091L, this.f2092M);
            C0545b generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f1432a = 8388613 | (this.f2108n & C0172j.AppCompatTheme_windowActionBarOverlay);
            this.f2095a.setLayoutParams(generateDefaultLayoutParams);
            m2657a((View) this.f2095a, false);
        }
    }

    /* renamed from: p */
    private void m2668p() {
        if (this.f2098d == null) {
            this.f2098d = new C0611r(getContext(), null, C0163a.toolbarNavigationButtonStyle);
            C0545b generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f1432a = 8388611 | (this.f2108n & C0172j.AppCompatTheme_windowActionBarOverlay);
            this.f2098d.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    /* renamed from: q */
    private void m2669q() {
        removeCallbacks(this.f2094O);
        post(this.f2094O);
    }

    /* renamed from: r */
    private boolean m2670r() {
        if (!this.f2093N) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m2663d(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2831a() {
        for (int size = this.f2084E.size() - 1; size >= 0; size--) {
            addView((View) this.f2084E.get(size));
        }
        this.f2084E.clear();
    }

    /* renamed from: a */
    public void mo2832a(int i, int i2) {
        m2664l();
        this.f2114t.mo3010b(i, i2);
    }

    /* renamed from: a */
    public void mo2833a(Context context, int i) {
        this.f2107m = i;
        TextView textView = this.f2097c;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: a */
    public void mo2834a(C0468l lVar, C0577g gVar) {
        if (lVar != null || this.f2095a != null) {
            m2667o();
            C0468l g = this.f2095a.mo2505g();
            if (g != lVar) {
                if (g != null) {
                    g.mo2210b((C0485v) this.f2089J);
                    g.mo2210b((C0485v) this.f2090K);
                }
                if (this.f2090K == null) {
                    this.f2090K = new C0544a();
                }
                gVar.mo3061b(true);
                if (lVar != null) {
                    lVar.mo2192a((C0485v) gVar, this.f2104j);
                    lVar.mo2192a((C0485v) this.f2090K, this.f2104j);
                } else {
                    gVar.mo2141a(this.f2104j, (C0468l) null);
                    this.f2090K.mo2141a(this.f2104j, (C0468l) null);
                    gVar.mo2047a(true);
                    this.f2090K.mo2047a(true);
                }
                this.f2095a.setPopupTheme(this.f2105k);
                this.f2095a.setPresenter(gVar);
                this.f2089J = gVar;
            }
        }
    }

    /* renamed from: b */
    public void mo2835b(Context context, int i) {
        this.f2106l = i;
        TextView textView = this.f2096b;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: b */
    public boolean mo2836b() {
        if (getVisibility() == 0) {
            ActionMenuView actionMenuView = this.f2095a;
            if (actionMenuView != null && actionMenuView.mo2504f()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void mo2837c() {
        C0544a aVar = this.f2090K;
        C0474p pVar = aVar == null ? null : aVar.f2122b;
        if (pVar != null) {
            pVar.collapseActionView();
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0545b);
    }

    /* renamed from: d */
    public void mo2839d() {
        ActionMenuView actionMenuView = this.f2095a;
        if (actionMenuView != null) {
            actionMenuView.mo2495a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo2840e() {
        if (this.f2102h == null) {
            this.f2102h = new C0611r(getContext(), null, C0163a.toolbarNavigationButtonStyle);
            this.f2102h.setImageDrawable(this.f2100f);
            this.f2102h.setContentDescription(this.f2101g);
            C0545b generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f1432a = 8388611 | (this.f2108n & C0172j.AppCompatTheme_windowActionBarOverlay);
            generateDefaultLayoutParams.f2124b = 2;
            this.f2102h.setLayoutParams(generateDefaultLayoutParams);
            this.f2102h.setOnClickListener(new C0626ya(this));
        }
    }

    /* renamed from: f */
    public boolean mo2841f() {
        C0544a aVar = this.f2090K;
        return (aVar == null || aVar.f2122b == null) ? false : true;
    }

    /* renamed from: g */
    public boolean mo2842g() {
        ActionMenuView actionMenuView = this.f2095a;
        return actionMenuView != null && actionMenuView.mo2498c();
    }

    /* access modifiers changed from: protected */
    public C0545b generateDefaultLayoutParams() {
        return new C0545b(-2, -2);
    }

    public C0545b generateLayoutParams(AttributeSet attributeSet) {
        return new C0545b(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0545b generateLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0545b ? new C0545b((C0545b) layoutParams) : layoutParams instanceof C0412a ? new C0545b((C0412a) layoutParams) : layoutParams instanceof MarginLayoutParams ? new C0545b((MarginLayoutParams) layoutParams) : new C0545b(layoutParams);
    }

    public int getContentInsetEnd() {
        C0559Y y = this.f2114t;
        if (y != null) {
            return y.mo3006a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f2116v;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0559Y y = this.f2114t;
        if (y != null) {
            return y.mo3009b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0559Y y = this.f2114t;
        if (y != null) {
            return y.mo3011c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0559Y y = this.f2114t;
        if (y != null) {
            return y.mo3012d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f2115u;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            android.support.v7.widget.ActionMenuView r0 = r3.f2095a
            r1 = 0
            if (r0 == 0) goto L_0x0013
            android.support.v7.view.menu.l r0 = r0.mo2505g()
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x0025
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.f2116v
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0029
        L_0x0025:
            int r0 = r3.getContentInsetEnd()
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v7.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        return C0156v.m565g(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return C0156v.m565g(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f2115u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f2099e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f2099e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m2666n();
        return this.f2095a.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f2098d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f2098d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public C0577g getOuterActionMenuPresenter() {
        return this.f2089J;
    }

    public Drawable getOverflowIcon() {
        m2666n();
        return this.f2095a.getOverflowIcon();
    }

    /* access modifiers changed from: 0000 */
    public Context getPopupContext() {
        return this.f2104j;
    }

    public int getPopupTheme() {
        return this.f2105k;
    }

    public CharSequence getSubtitle() {
        return this.f2119y;
    }

    public CharSequence getTitle() {
        return this.f2118x;
    }

    public int getTitleMarginBottom() {
        return this.f2113s;
    }

    public int getTitleMarginEnd() {
        return this.f2111q;
    }

    public int getTitleMarginStart() {
        return this.f2110p;
    }

    public int getTitleMarginTop() {
        return this.f2112r;
    }

    public C0524L getWrapper() {
        if (this.f2088I == null) {
            this.f2088I = new C0506Ca(this, true);
        }
        return this.f2088I;
    }

    /* renamed from: h */
    public boolean mo2872h() {
        ActionMenuView actionMenuView = this.f2095a;
        return actionMenuView != null && actionMenuView.mo2500d();
    }

    /* renamed from: i */
    public boolean mo2873i() {
        ActionMenuView actionMenuView = this.f2095a;
        return actionMenuView != null && actionMenuView.mo2503e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo2874j() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((C0545b) childAt.getLayoutParams()).f2124b == 2 || childAt == this.f2095a)) {
                removeViewAt(childCount);
                this.f2084E.add(childAt);
            }
        }
    }

    /* renamed from: k */
    public boolean mo2875k() {
        ActionMenuView actionMenuView = this.f2095a;
        return actionMenuView != null && actionMenuView.mo2513h();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f2094O);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2082C = false;
        }
        if (!this.f2082C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f2082C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f2082C = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02a6 A[LOOP:0: B:101:0x02a4->B:102:0x02a6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02c8 A[LOOP:1: B:104:0x02c6->B:105:0x02c8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0302 A[LOOP:2: B:112:0x0300->B:113:0x0302, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x022c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = p000a.p005b.p009c.p018g.C0156v.m565g(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f2085F
            r11[r2] = r3
            r11[r3] = r3
            int r12 = p000a.p005b.p009c.p018g.C0156v.m567h(r19)
            if (r12 < 0) goto L_0x003a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = 0
        L_0x003b:
            android.widget.ImageButton r13 = r0.f2098d
            boolean r13 = r0.m2663d(r13)
            if (r13 == 0) goto L_0x0055
            if (r1 == 0) goto L_0x004e
            android.widget.ImageButton r13 = r0.f2098d
            int r13 = r0.m2661b(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0057
        L_0x004e:
            android.widget.ImageButton r13 = r0.f2098d
            int r13 = r0.m2654a(r13, r6, r11, r12)
            goto L_0x0056
        L_0x0055:
            r13 = r6
        L_0x0056:
            r14 = r10
        L_0x0057:
            android.widget.ImageButton r15 = r0.f2102h
            boolean r15 = r0.m2663d(r15)
            if (r15 == 0) goto L_0x006e
            if (r1 == 0) goto L_0x0068
            android.widget.ImageButton r15 = r0.f2102h
            int r14 = r0.m2661b(r15, r14, r11, r12)
            goto L_0x006e
        L_0x0068:
            android.widget.ImageButton r15 = r0.f2102h
            int r13 = r0.m2654a(r15, r13, r11, r12)
        L_0x006e:
            android.support.v7.widget.ActionMenuView r15 = r0.f2095a
            boolean r15 = r0.m2663d(r15)
            if (r15 == 0) goto L_0x0085
            if (r1 == 0) goto L_0x007f
            android.support.v7.widget.ActionMenuView r15 = r0.f2095a
            int r13 = r0.m2654a(r15, r13, r11, r12)
            goto L_0x0085
        L_0x007f:
            android.support.v7.widget.ActionMenuView r15 = r0.f2095a
            int r14 = r0.m2661b(r15, r14, r11, r12)
        L_0x0085:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f2103i
            boolean r13 = r0.m2663d(r13)
            if (r13 == 0) goto L_0x00c2
            if (r1 == 0) goto L_0x00bc
            android.view.View r13 = r0.f2103i
            int r10 = r0.m2661b(r13, r10, r11, r12)
            goto L_0x00c2
        L_0x00bc:
            android.view.View r13 = r0.f2103i
            int r2 = r0.m2654a(r13, r2, r11, r12)
        L_0x00c2:
            android.widget.ImageView r13 = r0.f2099e
            boolean r13 = r0.m2663d(r13)
            if (r13 == 0) goto L_0x00d9
            if (r1 == 0) goto L_0x00d3
            android.widget.ImageView r13 = r0.f2099e
            int r10 = r0.m2661b(r13, r10, r11, r12)
            goto L_0x00d9
        L_0x00d3:
            android.widget.ImageView r13 = r0.f2099e
            int r2 = r0.m2654a(r13, r2, r11, r12)
        L_0x00d9:
            android.widget.TextView r13 = r0.f2096b
            boolean r13 = r0.m2663d(r13)
            android.widget.TextView r14 = r0.f2097c
            boolean r14 = r0.m2663d(r14)
            if (r13 == 0) goto L_0x0100
            android.widget.TextView r15 = r0.f2096b
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            android.support.v7.widget.Toolbar$b r15 = (android.support.p030v7.widget.Toolbar.C0545b) r15
            int r3 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f2096b
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 + r7
            int r7 = r15.bottomMargin
            int r3 = r3 + r7
            r7 = 0
            int r3 = r3 + r7
            goto L_0x0103
        L_0x0100:
            r23 = r7
            r3 = 0
        L_0x0103:
            if (r14 == 0) goto L_0x011d
            android.widget.TextView r7 = r0.f2097c
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            android.support.v7.widget.Toolbar$b r7 = (android.support.p030v7.widget.Toolbar.C0545b) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f2097c
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r3 = r3 + r15
            goto L_0x011f
        L_0x011d:
            r16 = r4
        L_0x011f:
            if (r13 != 0) goto L_0x012b
            if (r14 == 0) goto L_0x0124
            goto L_0x012b
        L_0x0124:
            r17 = r6
            r22 = r12
        L_0x0128:
            r7 = 0
            goto L_0x0296
        L_0x012b:
            if (r13 == 0) goto L_0x0130
            android.widget.TextView r4 = r0.f2096b
            goto L_0x0132
        L_0x0130:
            android.widget.TextView r4 = r0.f2097c
        L_0x0132:
            if (r14 == 0) goto L_0x0137
            android.widget.TextView r7 = r0.f2097c
            goto L_0x0139
        L_0x0137:
            android.widget.TextView r7 = r0.f2096b
        L_0x0139:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.support.v7.widget.Toolbar$b r4 = (android.support.p030v7.widget.Toolbar.C0545b) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            android.support.v7.widget.Toolbar$b r7 = (android.support.p030v7.widget.Toolbar.C0545b) r7
            if (r13 == 0) goto L_0x014f
            android.widget.TextView r15 = r0.f2096b
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0159
        L_0x014f:
            if (r14 == 0) goto L_0x015d
            android.widget.TextView r15 = r0.f2097c
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015d
        L_0x0159:
            r17 = r6
            r15 = 1
            goto L_0x0160
        L_0x015d:
            r17 = r6
            r15 = 0
        L_0x0160:
            int r6 = r0.f2117w
            r6 = r6 & 112(0x70, float:1.57E-43)
            r22 = r12
            r12 = 48
            if (r6 == r12) goto L_0x01a8
            r12 = 80
            if (r6 == r12) goto L_0x019a
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r3
            int r6 = r6 / 2
            int r12 = r4.topMargin
            r24 = r2
            int r2 = r0.f2112r
            r18 = r14
            int r14 = r12 + r2
            if (r6 >= r14) goto L_0x0183
            int r6 = r12 + r2
            goto L_0x0198
        L_0x0183:
            int r5 = r5 - r9
            int r5 = r5 - r3
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.f2113s
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x0198
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x0198:
            int r8 = r8 + r6
            goto L_0x01b7
        L_0x019a:
            r24 = r2
            r18 = r14
            int r5 = r5 - r9
            int r2 = r7.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.f2113s
            int r5 = r5 - r2
            int r8 = r5 - r3
            goto L_0x01b7
        L_0x01a8:
            r24 = r2
            r18 = r14
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.f2112r
            int r8 = r2 + r3
        L_0x01b7:
            if (r1 == 0) goto L_0x022c
            if (r15 == 0) goto L_0x01bf
            int r3 = r0.f2110p
            r1 = 1
            goto L_0x01c1
        L_0x01bf:
            r1 = 1
            r3 = 0
        L_0x01c1:
            r2 = r11[r1]
            int r3 = r3 - r2
            r2 = 0
            int r4 = java.lang.Math.max(r2, r3)
            int r10 = r10 - r4
            int r3 = -r3
            int r3 = java.lang.Math.max(r2, r3)
            r11[r1] = r3
            if (r13 == 0) goto L_0x01f7
            android.widget.TextView r1 = r0.f2096b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v7.widget.Toolbar$b r1 = (android.support.p030v7.widget.Toolbar.C0545b) r1
            android.widget.TextView r2 = r0.f2096b
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f2096b
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f2096b
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f2111q
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01f8
        L_0x01f7:
            r2 = r10
        L_0x01f8:
            if (r18 == 0) goto L_0x0220
            android.widget.TextView r1 = r0.f2097c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v7.widget.Toolbar$b r1 = (android.support.p030v7.widget.Toolbar.C0545b) r1
            int r3 = r1.topMargin
            int r8 = r8 + r3
            android.widget.TextView r3 = r0.f2097c
            int r3 = r3.getMeasuredWidth()
            int r3 = r10 - r3
            android.widget.TextView r4 = r0.f2097c
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f2097c
            r5.layout(r3, r8, r10, r4)
            int r3 = r0.f2111q
            int r3 = r10 - r3
            int r1 = r1.bottomMargin
            goto L_0x0221
        L_0x0220:
            r3 = r10
        L_0x0221:
            if (r15 == 0) goto L_0x0228
            int r1 = java.lang.Math.min(r2, r3)
            r10 = r1
        L_0x0228:
            r2 = r24
            goto L_0x0128
        L_0x022c:
            if (r15 == 0) goto L_0x0231
            int r3 = r0.f2110p
            goto L_0x0232
        L_0x0231:
            r3 = 0
        L_0x0232:
            r7 = 0
            r1 = r11[r7]
            int r3 = r3 - r1
            int r1 = java.lang.Math.max(r7, r3)
            int r2 = r24 + r1
            int r1 = -r3
            int r1 = java.lang.Math.max(r7, r1)
            r11[r7] = r1
            if (r13 == 0) goto L_0x0268
            android.widget.TextView r1 = r0.f2096b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v7.widget.Toolbar$b r1 = (android.support.p030v7.widget.Toolbar.C0545b) r1
            android.widget.TextView r3 = r0.f2096b
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 + r2
            android.widget.TextView r4 = r0.f2096b
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f2096b
            r5.layout(r2, r8, r3, r4)
            int r5 = r0.f2111q
            int r3 = r3 + r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x0269
        L_0x0268:
            r3 = r2
        L_0x0269:
            if (r18 == 0) goto L_0x028f
            android.widget.TextView r1 = r0.f2097c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v7.widget.Toolbar$b r1 = (android.support.p030v7.widget.Toolbar.C0545b) r1
            int r4 = r1.topMargin
            int r8 = r8 + r4
            android.widget.TextView r4 = r0.f2097c
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r2
            android.widget.TextView r5 = r0.f2097c
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f2097c
            r6.layout(r2, r8, r4, r5)
            int r5 = r0.f2111q
            int r4 = r4 + r5
            int r1 = r1.bottomMargin
            goto L_0x0290
        L_0x028f:
            r4 = r2
        L_0x0290:
            if (r15 == 0) goto L_0x0296
            int r2 = java.lang.Math.max(r3, r4)
        L_0x0296:
            java.util.ArrayList<android.view.View> r1 = r0.f2083D
            r3 = 3
            r0.m2658a(r1, r3)
            java.util.ArrayList<android.view.View> r1 = r0.f2083D
            int r1 = r1.size()
            r3 = r2
            r2 = 0
        L_0x02a4:
            if (r2 >= r1) goto L_0x02b7
            java.util.ArrayList<android.view.View> r4 = r0.f2083D
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r3 = r0.m2654a(r4, r3, r11, r12)
            int r2 = r2 + 1
            goto L_0x02a4
        L_0x02b7:
            r12 = r22
            java.util.ArrayList<android.view.View> r1 = r0.f2083D
            r2 = 5
            r0.m2658a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.f2083D
            int r1 = r1.size()
            r2 = 0
        L_0x02c6:
            if (r2 >= r1) goto L_0x02d7
            java.util.ArrayList<android.view.View> r4 = r0.f2083D
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.m2661b(r4, r10, r11, r12)
            int r2 = r2 + 1
            goto L_0x02c6
        L_0x02d7:
            java.util.ArrayList<android.view.View> r1 = r0.f2083D
            r2 = 1
            r0.m2658a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.f2083D
            int r1 = r0.m2655a(r1, r11)
            int r4 = r16 - r17
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r6 = r17 + r4
            int r2 = r1 / 2
            int r2 = r6 - r2
            int r1 = r1 + r2
            if (r2 >= r3) goto L_0x02f3
            goto L_0x02fa
        L_0x02f3:
            if (r1 <= r10) goto L_0x02f9
            int r1 = r1 - r10
            int r3 = r2 - r1
            goto L_0x02fa
        L_0x02f9:
            r3 = r2
        L_0x02fa:
            java.util.ArrayList<android.view.View> r1 = r0.f2083D
            int r1 = r1.size()
        L_0x0300:
            if (r7 >= r1) goto L_0x0311
            java.util.ArrayList<android.view.View> r2 = r0.f2083D
            java.lang.Object r2 = r2.get(r7)
            android.view.View r2 = (android.view.View) r2
            int r3 = r0.m2654a(r2, r3, r11, r12)
            int r7 = r7 + 1
            goto L_0x0300
        L_0x0311:
            java.util.ArrayList<android.view.View> r1 = r0.f2083D
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v7.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f2085F;
        if (C0521Ja.m2525a(this)) {
            c2 = 1;
            c = 0;
        } else {
            c2 = 0;
            c = 1;
        }
        if (m2663d(this.f2098d)) {
            m2656a((View) this.f2098d, i, 0, i2, 0, this.f2109o);
            i5 = this.f2098d.getMeasuredWidth() + m2651a((View) this.f2098d);
            i4 = Math.max(0, this.f2098d.getMeasuredHeight() + m2660b((View) this.f2098d));
            i3 = View.combineMeasuredStates(0, this.f2098d.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (m2663d(this.f2102h)) {
            m2656a((View) this.f2102h, i, 0, i2, 0, this.f2109o);
            i5 = this.f2102h.getMeasuredWidth() + m2651a((View) this.f2102h);
            i4 = Math.max(i4, this.f2102h.getMeasuredHeight() + m2660b((View) this.f2102h));
            i3 = View.combineMeasuredStates(i3, this.f2102h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i5);
        iArr[c2] = Math.max(0, currentContentInsetStart - i5);
        if (m2663d(this.f2095a)) {
            m2656a((View) this.f2095a, i, max, i2, 0, this.f2109o);
            i6 = this.f2095a.getMeasuredWidth() + m2651a((View) this.f2095a);
            i4 = Math.max(i4, this.f2095a.getMeasuredHeight() + m2660b((View) this.f2095a));
            i3 = View.combineMeasuredStates(i3, this.f2095a.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (m2663d(this.f2103i)) {
            max2 += m2653a(this.f2103i, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f2103i.getMeasuredHeight() + m2660b(this.f2103i));
            i3 = View.combineMeasuredStates(i3, this.f2103i.getMeasuredState());
        }
        if (m2663d(this.f2099e)) {
            max2 += m2653a((View) this.f2099e, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f2099e.getMeasuredHeight() + m2660b((View) this.f2099e));
            i3 = View.combineMeasuredStates(i3, this.f2099e.getMeasuredState());
        }
        int childCount = getChildCount();
        int i10 = i4;
        int i11 = max2;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((C0545b) childAt.getLayoutParams()).f2124b == 0 && m2663d(childAt)) {
                i11 += m2653a(childAt, i, i11, i2, 0, iArr);
                i10 = Math.max(i10, childAt.getMeasuredHeight() + m2660b(childAt));
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
            }
        }
        int i13 = this.f2112r + this.f2113s;
        int i14 = this.f2110p + this.f2111q;
        if (m2663d(this.f2096b)) {
            m2653a((View) this.f2096b, i, i11 + i14, i2, i13, iArr);
            int measuredWidth = this.f2096b.getMeasuredWidth() + m2651a((View) this.f2096b);
            i7 = this.f2096b.getMeasuredHeight() + m2660b((View) this.f2096b);
            i9 = View.combineMeasuredStates(i3, this.f2096b.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i9 = i3;
            i8 = 0;
            i7 = 0;
        }
        if (m2663d(this.f2097c)) {
            int i15 = i7 + i13;
            int i16 = i9;
            i8 = Math.max(i8, m2653a((View) this.f2097c, i, i11 + i14, i2, i15, iArr));
            i7 += this.f2097c.getMeasuredHeight() + m2660b((View) this.f2097c);
            i9 = View.combineMeasuredStates(i16, this.f2097c.getMeasuredState());
        } else {
            int i17 = i9;
        }
        int i18 = i11 + i8;
        int max3 = Math.max(i10, i7) + getPaddingTop() + getPaddingBottom();
        int i19 = i;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(i18 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i19, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(max3, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (m2670r()) {
            resolveSizeAndState2 = 0;
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0547d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0547d dVar = (C0547d) parcelable;
        super.onRestoreInstanceState(dVar.mo471a());
        ActionMenuView actionMenuView = this.f2095a;
        C0468l g = actionMenuView != null ? actionMenuView.mo2505g() : null;
        int i = dVar.f2125a;
        if (!(i == 0 || this.f2090K == null || g == null)) {
            MenuItem findItem = g.findItem(i);
            if (findItem != null) {
                findItem.expandActionView();
            }
        }
        if (dVar.f2126b) {
            m2669q();
        }
    }

    public void onRtlPropertiesChanged(int i) {
        if (VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        m2664l();
        C0559Y y = this.f2114t;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        y.mo3008a(z);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0547d dVar = new C0547d(super.onSaveInstanceState());
        C0544a aVar = this.f2090K;
        if (aVar != null) {
            C0474p pVar = aVar.f2122b;
            if (pVar != null) {
                dVar.f2125a = pVar.getItemId();
            }
        }
        dVar.f2126b = mo2873i();
        return dVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2081B = false;
        }
        if (!this.f2081B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f2081B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f2081B = false;
        }
        return true;
    }

    public void setCollapsible(boolean z) {
        this.f2093N = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f2116v) {
            this.f2116v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f2115u) {
            this.f2115u = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C0173a.m597b(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m2665m();
            if (!m2662c(this.f2099e)) {
                m2657a((View) this.f2099e, true);
            }
        } else {
            ImageView imageView = this.f2099e;
            if (imageView != null && m2662c(imageView)) {
                removeView(this.f2099e);
                this.f2084E.remove(this.f2099e);
            }
        }
        ImageView imageView2 = this.f2099e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m2665m();
        }
        ImageView imageView = this.f2099e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m2668p();
        }
        ImageButton imageButton = this.f2098d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C0173a.m597b(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m2668p();
            if (!m2662c(this.f2098d)) {
                m2657a((View) this.f2098d, true);
            }
        } else {
            ImageButton imageButton = this.f2098d;
            if (imageButton != null && m2662c(imageButton)) {
                removeView(this.f2098d);
                this.f2084E.remove(this.f2098d);
            }
        }
        ImageButton imageButton2 = this.f2098d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(OnClickListener onClickListener) {
        m2668p();
        this.f2098d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(C0546c cVar) {
        this.f2086G = cVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        m2666n();
        this.f2095a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f2105k != i) {
            this.f2105k = i;
            if (i == 0) {
                this.f2104j = getContext();
            } else {
                this.f2104j = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f2097c == null) {
                Context context = getContext();
                this.f2097c = new C0518I(context);
                this.f2097c.setSingleLine();
                this.f2097c.setEllipsize(TruncateAt.END);
                int i = this.f2107m;
                if (i != 0) {
                    this.f2097c.setTextAppearance(context, i);
                }
                int i2 = this.f2080A;
                if (i2 != 0) {
                    this.f2097c.setTextColor(i2);
                }
            }
            if (!m2662c(this.f2097c)) {
                m2657a((View) this.f2097c, true);
            }
        } else {
            TextView textView = this.f2097c;
            if (textView != null && m2662c(textView)) {
                removeView(this.f2097c);
                this.f2084E.remove(this.f2097c);
            }
        }
        TextView textView2 = this.f2097c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f2119y = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        this.f2080A = i;
        TextView textView = this.f2097c;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f2096b == null) {
                Context context = getContext();
                this.f2096b = new C0518I(context);
                this.f2096b.setSingleLine();
                this.f2096b.setEllipsize(TruncateAt.END);
                int i = this.f2106l;
                if (i != 0) {
                    this.f2096b.setTextAppearance(context, i);
                }
                int i2 = this.f2120z;
                if (i2 != 0) {
                    this.f2096b.setTextColor(i2);
                }
            }
            if (!m2662c(this.f2096b)) {
                m2657a((View) this.f2096b, true);
            }
        } else {
            TextView textView = this.f2096b;
            if (textView != null && m2662c(textView)) {
                removeView(this.f2096b);
                this.f2084E.remove(this.f2096b);
            }
        }
        TextView textView2 = this.f2096b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f2118x = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f2113s = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f2111q = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f2110p = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f2112r = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        this.f2120z = i;
        TextView textView = this.f2096b;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }
}
