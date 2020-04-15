package android.support.p030v7.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p029v4.widget.C0367h;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView.OnEditorActionListener;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p000a.p005b.p009c.p018g.C0133c;
import p000a.p005b.p009c.p018g.C0156v;
import p000a.p005b.p021d.p022a.C0163a;
import p000a.p005b.p021d.p022a.C0166d;
import p000a.p005b.p021d.p022a.C0168f;
import p000a.p005b.p021d.p022a.C0169g;
import p000a.p005b.p021d.p022a.C0170h;
import p000a.p005b.p021d.p022a.C0172j;
import p000a.p005b.p021d.p028e.C0194c;

/* renamed from: android.support.v7.widget.SearchView */
public class SearchView extends C0534Q implements C0194c {

    /* renamed from: p */
    static final C0537a f2014p = new C0537a();

    /* renamed from: A */
    private Rect f2015A;

    /* renamed from: B */
    private Rect f2016B;

    /* renamed from: C */
    private int[] f2017C;

    /* renamed from: D */
    private int[] f2018D;

    /* renamed from: E */
    private final ImageView f2019E;

    /* renamed from: F */
    private final Drawable f2020F;

    /* renamed from: G */
    private final int f2021G;

    /* renamed from: H */
    private final int f2022H;

    /* renamed from: I */
    private final Intent f2023I;

    /* renamed from: J */
    private final Intent f2024J;

    /* renamed from: K */
    private final CharSequence f2025K;

    /* renamed from: L */
    private C0539c f2026L;

    /* renamed from: M */
    private C0538b f2027M;

    /* renamed from: N */
    OnFocusChangeListener f2028N;

    /* renamed from: O */
    private C0540d f2029O;

    /* renamed from: P */
    private OnClickListener f2030P;

    /* renamed from: Q */
    private boolean f2031Q;

    /* renamed from: R */
    private boolean f2032R;

    /* renamed from: S */
    C0367h f2033S;

    /* renamed from: T */
    private boolean f2034T;

    /* renamed from: U */
    private CharSequence f2035U;

    /* renamed from: V */
    private boolean f2036V;

    /* renamed from: W */
    private boolean f2037W;

    /* renamed from: aa */
    private int f2038aa;

    /* renamed from: ba */
    private boolean f2039ba;

    /* renamed from: ca */
    private CharSequence f2040ca;

    /* renamed from: da */
    private CharSequence f2041da;

    /* renamed from: ea */
    private boolean f2042ea;

    /* renamed from: fa */
    private int f2043fa;

    /* renamed from: ga */
    SearchableInfo f2044ga;

    /* renamed from: ha */
    private Bundle f2045ha;

    /* renamed from: ia */
    private final Runnable f2046ia;

    /* renamed from: ja */
    private Runnable f2047ja;

    /* renamed from: ka */
    private final WeakHashMap<String, ConstantState> f2048ka;

    /* renamed from: la */
    private final OnClickListener f2049la;

    /* renamed from: ma */
    OnKeyListener f2050ma;

    /* renamed from: na */
    private final OnEditorActionListener f2051na;

    /* renamed from: oa */
    private final OnItemClickListener f2052oa;

    /* renamed from: pa */
    private final OnItemSelectedListener f2053pa;

    /* renamed from: q */
    final SearchAutoComplete f2054q;

    /* renamed from: qa */
    private TextWatcher f2055qa;

    /* renamed from: r */
    private final View f2056r;

    /* renamed from: s */
    private final View f2057s;

    /* renamed from: t */
    private final View f2058t;

    /* renamed from: u */
    final ImageView f2059u;

    /* renamed from: v */
    final ImageView f2060v;

    /* renamed from: w */
    final ImageView f2061w;

    /* renamed from: x */
    final ImageView f2062x;

    /* renamed from: y */
    private final View f2063y;

    /* renamed from: z */
    private C0542f f2064z;

    /* renamed from: android.support.v7.widget.SearchView$SearchAutoComplete */
    public static class SearchAutoComplete extends C0587i {

        /* renamed from: d */
        private int f2065d;

        /* renamed from: e */
        private SearchView f2066e;

        /* renamed from: f */
        private boolean f2067f;

        /* renamed from: g */
        final Runnable f2068g;

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C0163a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f2068g = new C0596ma(this);
            this.f2065d = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i < 960 || i2 < 720 || configuration.orientation != 2) {
                return (i >= 600 || (i >= 640 && i2 >= 480)) ? 192 : 160;
            }
            return 256;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo2805a() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo2806b() {
            if (this.f2067f) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f2067f = false;
            }
        }

        public boolean enoughToFilter() {
            return this.f2065d <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f2067f) {
                removeCallbacks(this.f2068g);
                post(this.f2068g);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f2066e.mo2773g();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f2066e.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f2066e.hasFocus() && getVisibility() == 0) {
                this.f2067f = true;
                if (SearchView.m2613a(getContext())) {
                    SearchView.f2014p.mo2819a(this, true);
                }
            }
        }

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        /* access modifiers changed from: 0000 */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f2067f = false;
                removeCallbacks(this.f2068g);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f2067f = false;
                removeCallbacks(this.f2068g);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f2067f = true;
            }
        }

        /* access modifiers changed from: 0000 */
        public void setSearchView(SearchView searchView) {
            this.f2066e = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f2065d = i;
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$a */
    private static class C0537a {

        /* renamed from: a */
        private Method f2069a;

        /* renamed from: b */
        private Method f2070b;

        /* renamed from: c */
        private Method f2071c;

        C0537a() {
            try {
                this.f2069a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f2069a.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                this.f2070b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f2070b.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                this.f2071c = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f2071c.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2818a(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f2070b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2819a(AutoCompleteTextView autoCompleteTextView, boolean z) {
            Method method = this.f2071c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo2820b(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.f2069a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$b */
    public interface C0538b {
        boolean onClose();
    }

    /* renamed from: android.support.v7.widget.SearchView$c */
    public interface C0539c {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    /* renamed from: android.support.v7.widget.SearchView$d */
    public interface C0540d {
        boolean onSuggestionClick(int i);

        boolean onSuggestionSelect(int i);
    }

    /* renamed from: android.support.v7.widget.SearchView$e */
    static class C0541e extends C0133c {
        public static final Creator<C0541e> CREATOR = new C0594la();

        /* renamed from: a */
        boolean f2072a;

        public C0541e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2072a = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        C0541e(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SearchView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" isIconified=");
            sb.append(this.f2072a);
            sb.append("}");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f2072a));
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$f */
    private static class C0542f extends TouchDelegate {

        /* renamed from: a */
        private final View f2073a;

        /* renamed from: b */
        private final Rect f2074b = new Rect();

        /* renamed from: c */
        private final Rect f2075c = new Rect();

        /* renamed from: d */
        private final Rect f2076d = new Rect();

        /* renamed from: e */
        private final int f2077e;

        /* renamed from: f */
        private boolean f2078f;

        public C0542f(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f2077e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            mo2827a(rect, rect2);
            this.f2073a = view;
        }

        /* renamed from: a */
        public void mo2827a(Rect rect, Rect rect2) {
            this.f2074b.set(rect);
            this.f2076d.set(rect);
            Rect rect3 = this.f2076d;
            int i = this.f2077e;
            rect3.inset(-i, -i);
            this.f2075c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
        /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
                r7 = this;
                float r0 = r8.getX()
                int r0 = (int) r0
                float r1 = r8.getY()
                int r1 = (int) r1
                int r2 = r8.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x002e
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003a
            L_0x001b:
                boolean r2 = r7.f2078f
                r7.f2078f = r5
                goto L_0x003b
            L_0x0020:
                boolean r2 = r7.f2078f
                if (r2 == 0) goto L_0x003b
                android.graphics.Rect r6 = r7.f2076d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x003b
                r4 = 0
                goto L_0x003b
            L_0x002e:
                android.graphics.Rect r2 = r7.f2074b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003a
                r7.f2078f = r4
                r2 = 1
                goto L_0x003b
            L_0x003a:
                r2 = 0
            L_0x003b:
                if (r2 == 0) goto L_0x006a
                if (r4 == 0) goto L_0x0057
                android.graphics.Rect r2 = r7.f2075c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x0057
                android.view.View r0 = r7.f2073a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r7.f2073a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                goto L_0x0060
            L_0x0057:
                android.graphics.Rect r2 = r7.f2075c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
            L_0x0060:
                float r1 = (float) r1
                r8.setLocation(r0, r1)
                android.view.View r0 = r7.f2073a
                boolean r5 = r0.dispatchTouchEvent(r8)
            L_0x006a:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p030v7.widget.SearchView.C0542f.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0163a.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2015A = new Rect();
        this.f2016B = new Rect();
        this.f2017C = new int[2];
        this.f2018D = new int[2];
        this.f2046ia = new C0570ca(this);
        this.f2047ja = new C0572da(this);
        this.f2048ka = new WeakHashMap<>();
        this.f2049la = new C0584ga(this);
        this.f2050ma = new C0586ha(this);
        this.f2051na = new C0588ia(this);
        this.f2052oa = new C0590ja(this);
        this.f2053pa = new C0592ka(this);
        this.f2055qa = new C0568ba(this);
        C0620va a = C0620va.m2920a(context, attributeSet, C0172j.SearchView, i, 0);
        LayoutInflater.from(context).inflate(a.mo3267g(C0172j.SearchView_layout, C0169g.abc_search_view), this, true);
        this.f2054q = (SearchAutoComplete) findViewById(C0168f.search_src_text);
        this.f2054q.setSearchView(this);
        this.f2056r = findViewById(C0168f.search_edit_frame);
        this.f2057s = findViewById(C0168f.search_plate);
        this.f2058t = findViewById(C0168f.submit_area);
        this.f2059u = (ImageView) findViewById(C0168f.search_button);
        this.f2060v = (ImageView) findViewById(C0168f.search_go_btn);
        this.f2061w = (ImageView) findViewById(C0168f.search_close_btn);
        this.f2062x = (ImageView) findViewById(C0168f.search_voice_btn);
        this.f2019E = (ImageView) findViewById(C0168f.search_mag_icon);
        C0156v.m547a(this.f2057s, a.mo3258b(C0172j.SearchView_queryBackground));
        C0156v.m547a(this.f2058t, a.mo3258b(C0172j.SearchView_submitBackground));
        this.f2059u.setImageDrawable(a.mo3258b(C0172j.SearchView_searchIcon));
        this.f2060v.setImageDrawable(a.mo3258b(C0172j.SearchView_goIcon));
        this.f2061w.setImageDrawable(a.mo3258b(C0172j.SearchView_closeIcon));
        this.f2062x.setImageDrawable(a.mo3258b(C0172j.SearchView_voiceIcon));
        this.f2019E.setImageDrawable(a.mo3258b(C0172j.SearchView_searchIcon));
        this.f2020F = a.mo3258b(C0172j.SearchView_searchHintIcon);
        C0509Da.m2457a(this.f2059u, getResources().getString(C0170h.abc_searchview_description_search));
        this.f2021G = a.mo3267g(C0172j.SearchView_suggestionRowLayout, C0169g.abc_search_dropdown_item_icons_2line);
        this.f2022H = a.mo3267g(C0172j.SearchView_commitIcon, 0);
        this.f2059u.setOnClickListener(this.f2049la);
        this.f2061w.setOnClickListener(this.f2049la);
        this.f2060v.setOnClickListener(this.f2049la);
        this.f2062x.setOnClickListener(this.f2049la);
        this.f2054q.setOnClickListener(this.f2049la);
        this.f2054q.addTextChangedListener(this.f2055qa);
        this.f2054q.setOnEditorActionListener(this.f2051na);
        this.f2054q.setOnItemClickListener(this.f2052oa);
        this.f2054q.setOnItemSelectedListener(this.f2053pa);
        this.f2054q.setOnKeyListener(this.f2050ma);
        this.f2054q.setOnFocusChangeListener(new C0574ea(this));
        setIconifiedByDefault(a.mo3256a(C0172j.SearchView_iconifiedByDefault, true));
        int c = a.mo3259c(C0172j.SearchView_android_maxWidth, -1);
        if (c != -1) {
            setMaxWidth(c);
        }
        this.f2025K = a.mo3264e(C0172j.SearchView_defaultQueryHint);
        this.f2035U = a.mo3264e(C0172j.SearchView_queryHint);
        int d = a.mo3261d(C0172j.SearchView_android_imeOptions, -1);
        if (d != -1) {
            setImeOptions(d);
        }
        int d2 = a.mo3261d(C0172j.SearchView_android_inputType, -1);
        if (d2 != -1) {
            setInputType(d2);
        }
        setFocusable(a.mo3256a(C0172j.SearchView_android_focusable, true));
        a.mo3255a();
        this.f2023I = new Intent("android.speech.action.WEB_SEARCH");
        this.f2023I.addFlags(268435456);
        this.f2023I.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        this.f2024J = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f2024J.addFlags(268435456);
        this.f2063y = findViewById(this.f2054q.getDropDownAnchor());
        View view = this.f2063y;
        if (view != null) {
            view.addOnLayoutChangeListener(new C0576fa(this));
        }
        m2615b(this.f2031Q);
        m2625o();
    }

    /* renamed from: a */
    private Intent m2607a(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2045ha;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: a */
    private Intent m2608a(Cursor cursor, int i, String str) {
        int i2;
        try {
            String a = C0598na.m2827a(cursor, "suggest_intent_action");
            if (a == null) {
                a = this.f2044ga.getSuggestIntentAction();
            }
            if (a == null) {
                a = "android.intent.action.SEARCH";
            }
            String str2 = a;
            String a2 = C0598na.m2827a(cursor, "suggest_intent_data");
            if (a2 == null) {
                a2 = this.f2044ga.getSuggestIntentData();
            }
            if (a2 != null) {
                String a3 = C0598na.m2827a(cursor, "suggest_intent_data_id");
                if (a3 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(a2);
                    sb.append("/");
                    sb.append(Uri.encode(a3));
                    a2 = sb.toString();
                }
            }
            return m2609a(str2, a2 == null ? null : Uri.parse(a2), C0598na.m2827a(cursor, "suggest_intent_extra_data"), C0598na.m2827a(cursor, "suggest_intent_query"), i, str);
        } catch (RuntimeException e) {
            try {
                i2 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i2 = -1;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Search suggestions cursor at row ");
            sb2.append(i2);
            sb2.append(" returned exception.");
            Log.w("SearchView", sb2.toString(), e);
            return null;
        }
    }

    /* renamed from: a */
    private Intent m2609a(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f2041da);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f2045ha;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f2044ga.getSearchActivity());
        return intent;
    }

    /* renamed from: a */
    private void m2610a(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed launch activity: ");
                sb.append(intent);
                Log.e("SearchView", sb.toString(), e);
            }
        }
    }

    /* renamed from: a */
    private void m2611a(View view, Rect rect) {
        view.getLocationInWindow(this.f2017C);
        getLocationInWindow(this.f2018D);
        int[] iArr = this.f2017C;
        int i = iArr[1];
        int[] iArr2 = this.f2018D;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    /* renamed from: a */
    private void m2612a(boolean z) {
        this.f2060v.setVisibility((!this.f2034T || !m2622l() || !hasFocus() || (!z && this.f2039ba)) ? 8 : 0);
    }

    /* renamed from: a */
    static boolean m2613a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: b */
    private Intent m2614b(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    /* renamed from: b */
    private void m2615b(boolean z) {
        this.f2032R = z;
        int i = 8;
        boolean z2 = false;
        boolean z3 = !TextUtils.isEmpty(this.f2054q.getText());
        this.f2059u.setVisibility(z ? 0 : 8);
        m2612a(z3);
        this.f2056r.setVisibility(z ? 8 : 0);
        if (this.f2019E.getDrawable() != null && !this.f2031Q) {
            i = 0;
        }
        this.f2019E.setVisibility(i);
        m2624n();
        if (!z3) {
            z2 = true;
        }
        m2618c(z2);
        m2627q();
    }

    /* renamed from: b */
    private boolean m2616b(int i, int i2, String str) {
        Cursor a = this.f2033S.mo1696a();
        if (a == null || !a.moveToPosition(i)) {
            return false;
        }
        m2610a(m2608a(a, i2, str));
        return true;
    }

    /* renamed from: c */
    private CharSequence m2617c(CharSequence charSequence) {
        if (!this.f2031Q || this.f2020F == null) {
            return charSequence;
        }
        double textSize = (double) this.f2054q.getTextSize();
        Double.isNaN(textSize);
        int i = (int) (textSize * 1.25d);
        this.f2020F.setBounds(0, 0, i, i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f2020F), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: c */
    private void m2618c(boolean z) {
        int i;
        if (!this.f2039ba || mo2767c() || !z) {
            i = 8;
        } else {
            i = 0;
            this.f2060v.setVisibility(8);
        }
        this.f2062x.setVisibility(i);
    }

    /* renamed from: e */
    private void m2619e(int i) {
        Editable text = this.f2054q.getText();
        Cursor a = this.f2033S.mo1696a();
        if (a != null) {
            if (a.moveToPosition(i)) {
                CharSequence convertToString = this.f2033S.convertToString(a);
                if (convertToString != null) {
                    setQuery(convertToString);
                }
            }
            setQuery(text);
        }
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C0166d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C0166d.abc_search_view_preferred_width);
    }

    /* renamed from: j */
    private void m2620j() {
        this.f2054q.dismissDropDown();
    }

    /* renamed from: k */
    private boolean m2621k() {
        SearchableInfo searchableInfo = this.f2044ga;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f2044ga.getVoiceSearchLaunchWebSearch()) {
            intent = this.f2023I;
        } else if (this.f2044ga.getVoiceSearchLaunchRecognizer()) {
            intent = this.f2024J;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    /* renamed from: l */
    private boolean m2622l() {
        return (this.f2034T || this.f2039ba) && !mo2767c();
    }

    /* renamed from: m */
    private void m2623m() {
        post(this.f2046ia);
    }

    /* renamed from: n */
    private void m2624n() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f2054q.getText());
        int i = 0;
        if (!z2 && (!this.f2031Q || this.f2042ea)) {
            z = false;
        }
        ImageView imageView = this.f2061w;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f2061w.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: o */
    private void m2625o() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f2054q;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m2617c(queryHint));
    }

    /* renamed from: p */
    private void m2626p() {
        this.f2054q.setThreshold(this.f2044ga.getSuggestThreshold());
        this.f2054q.setImeOptions(this.f2044ga.getImeOptions());
        int inputType = this.f2044ga.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f2044ga.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f2054q.setInputType(inputType);
        C0367h hVar = this.f2033S;
        if (hVar != null) {
            hVar.mo1699a(null);
        }
        if (this.f2044ga.getSuggestAuthority() != null) {
            this.f2033S = new C0598na(getContext(), this, this.f2044ga, this.f2048ka);
            this.f2054q.setAdapter(this.f2033S);
            C0598na naVar = (C0598na) this.f2033S;
            if (this.f2036V) {
                i = 2;
            }
            naVar.mo3137a(i);
        }
    }

    /* renamed from: q */
    private void m2627q() {
        this.f2058t.setVisibility((!m2622l() || !(this.f2060v.getVisibility() == 0 || this.f2062x.getVisibility() == 0)) ? 8 : 0);
    }

    private void setQuery(CharSequence charSequence) {
        this.f2054q.setText(charSequence);
        this.f2054q.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2759a() {
        if (this.f2063y.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f2057s.getPaddingLeft();
            Rect rect = new Rect();
            boolean a = C0521Ja.m2525a(this);
            int dimensionPixelSize = this.f2031Q ? resources.getDimensionPixelSize(C0166d.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(C0166d.abc_dropdownitem_text_padding_left) : 0;
            this.f2054q.getDropDownBackground().getPadding(rect);
            this.f2054q.setDropDownHorizontalOffset(a ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f2054q.setDropDownWidth((((this.f2063y.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2760a(int i, String str, String str2) {
        getContext().startActivity(m2609a("android.intent.action.SEARCH", null, null, str2, i, str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2761a(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: a */
    public void mo2762a(CharSequence charSequence, boolean z) {
        this.f2054q.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f2054q;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f2041da = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            mo2772f();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo2763a(int i, int i2, String str) {
        C0540d dVar = this.f2029O;
        if (dVar != null && dVar.onSuggestionClick(i)) {
            return false;
        }
        m2616b(i, 0, null);
        this.f2054q.setImeVisibility(false);
        m2620j();
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo2764a(View view, int i, KeyEvent keyEvent) {
        if (this.f2044ga != null && this.f2033S != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return mo2763a(this.f2054q.getListSelection(), 0, (String) null);
            }
            if (i == 21 || i == 22) {
                this.f2054q.setSelection(i == 21 ? 0 : this.f2054q.length());
                this.f2054q.setListSelection(0);
                this.f2054q.clearListSelection();
                f2014p.mo2819a(this.f2054q, true);
                return true;
            } else if (i != 19 || this.f2054q.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2765b() {
        f2014p.mo2820b(this.f2054q);
        f2014p.mo2818a(this.f2054q);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2766b(CharSequence charSequence) {
        Editable text = this.f2054q.getText();
        this.f2041da = text;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(text);
        m2612a(z2);
        if (z2) {
            z = false;
        }
        m2618c(z);
        m2624n();
        m2627q();
        if (this.f2026L != null && !TextUtils.equals(charSequence, this.f2040ca)) {
            this.f2026L.onQueryTextChange(charSequence.toString());
        }
        this.f2040ca = charSequence.toString();
    }

    /* renamed from: c */
    public boolean mo2767c() {
        return this.f2032R;
    }

    public void clearFocus() {
        this.f2037W = true;
        super.clearFocus();
        this.f2054q.clearFocus();
        this.f2054q.setImeVisibility(false);
        this.f2037W = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo2769d() {
        if (!TextUtils.isEmpty(this.f2054q.getText())) {
            this.f2054q.setText("");
            this.f2054q.requestFocus();
            this.f2054q.setImeVisibility(true);
        } else if (this.f2031Q) {
            C0538b bVar = this.f2027M;
            if (bVar == null || !bVar.onClose()) {
                clearFocus();
                m2615b(true);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo2770d(int i) {
        C0540d dVar = this.f2029O;
        if (dVar != null && dVar.onSuggestionSelect(i)) {
            return false;
        }
        m2619e(i);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo2771e() {
        m2615b(false);
        this.f2054q.requestFocus();
        this.f2054q.setImeVisibility(true);
        OnClickListener onClickListener = this.f2030P;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo2772f() {
        Editable text = this.f2054q.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            C0539c cVar = this.f2026L;
            if (cVar == null || !cVar.onQueryTextSubmit(text.toString())) {
                if (this.f2044ga != null) {
                    mo2760a(0, (String) null, text.toString());
                }
                this.f2054q.setImeVisibility(false);
                m2620j();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo2773g() {
        m2615b(mo2767c());
        m2623m();
        if (this.f2054q.hasFocus()) {
            mo2765b();
        }
    }

    public int getImeOptions() {
        return this.f2054q.getImeOptions();
    }

    public int getInputType() {
        return this.f2054q.getInputType();
    }

    public int getMaxWidth() {
        return this.f2038aa;
    }

    public CharSequence getQuery() {
        return this.f2054q.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f2035U;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f2044ga;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f2025K : getContext().getText(this.f2044ga.getHintId());
    }

    /* access modifiers changed from: 0000 */
    public int getSuggestionCommitIconResId() {
        return this.f2022H;
    }

    /* access modifiers changed from: 0000 */
    public int getSuggestionRowLayout() {
        return this.f2021G;
    }

    public C0367h getSuggestionsAdapter() {
        return this.f2033S;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo2782h() {
        Intent a;
        SearchableInfo searchableInfo = this.f2044ga;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    a = m2614b(this.f2023I, searchableInfo);
                } else {
                    if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        a = m2607a(this.f2024J, searchableInfo);
                    }
                }
                getContext().startActivity(a);
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo2783i() {
        int[] iArr = this.f2054q.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f2057s.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f2058t.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public void onActionViewCollapsed() {
        mo2762a((CharSequence) "", false);
        clearFocus();
        m2615b(true);
        this.f2054q.setImeOptions(this.f2043fa);
        this.f2042ea = false;
    }

    public void onActionViewExpanded() {
        if (!this.f2042ea) {
            this.f2042ea = true;
            this.f2043fa = this.f2054q.getImeOptions();
            this.f2054q.setImeOptions(this.f2043fa | 33554432);
            this.f2054q.setText("");
            setIconified(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f2046ia);
        post(this.f2047ja);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m2611a((View) this.f2054q, this.f2015A);
            Rect rect = this.f2016B;
            Rect rect2 = this.f2015A;
            rect.set(rect2.left, 0, rect2.right, i4 - i2);
            C0542f fVar = this.f2064z;
            if (fVar == null) {
                this.f2064z = new C0542f(this.f2016B, this.f2015A, this.f2054q);
                setTouchDelegate(this.f2064z);
                return;
            }
            fVar.mo2827a(this.f2016B, this.f2015A);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r0 > 0) goto L_0x0035;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.mo2767c()
            if (r0 == 0) goto L_0x000a
            super.onMeasure(r4, r5)
            return
        L_0x000a:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x002c
            if (r0 == 0) goto L_0x0022
            if (r0 == r2) goto L_0x001d
            goto L_0x0039
        L_0x001d:
            int r0 = r3.f2038aa
            if (r0 <= 0) goto L_0x0039
            goto L_0x0030
        L_0x0022:
            int r4 = r3.f2038aa
            if (r4 <= 0) goto L_0x0027
            goto L_0x0039
        L_0x0027:
            int r4 = r3.getPreferredWidth()
            goto L_0x0039
        L_0x002c:
            int r0 = r3.f2038aa
            if (r0 <= 0) goto L_0x0031
        L_0x0030:
            goto L_0x0035
        L_0x0031:
            int r0 = r3.getPreferredWidth()
        L_0x0035:
            int r4 = java.lang.Math.min(r0, r4)
        L_0x0039:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L_0x004b
            if (r0 == 0) goto L_0x0046
            goto L_0x0053
        L_0x0046:
            int r5 = r3.getPreferredHeight()
            goto L_0x0053
        L_0x004b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L_0x0053:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v7.widget.SearchView.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0541e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0541e eVar = (C0541e) parcelable;
        super.onRestoreInstanceState(eVar.mo471a());
        m2615b(eVar.f2072a);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0541e eVar = new C0541e(super.onSaveInstanceState());
        eVar.f2072a = mo2767c();
        return eVar;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m2623m();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f2037W || !isFocusable()) {
            return false;
        }
        if (mo2767c()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f2054q.requestFocus(i, rect);
        if (requestFocus) {
            m2615b(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f2045ha = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            mo2769d();
        } else {
            mo2771e();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f2031Q != z) {
            this.f2031Q = z;
            m2615b(z);
            m2625o();
        }
    }

    public void setImeOptions(int i) {
        this.f2054q.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f2054q.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f2038aa = i;
        requestLayout();
    }

    public void setOnCloseListener(C0538b bVar) {
        this.f2027M = bVar;
    }

    public void setOnQueryTextFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
        this.f2028N = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C0539c cVar) {
        this.f2026L = cVar;
    }

    public void setOnSearchClickListener(OnClickListener onClickListener) {
        this.f2030P = onClickListener;
    }

    public void setOnSuggestionListener(C0540d dVar) {
        this.f2029O = dVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f2035U = charSequence;
        m2625o();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f2036V = z;
        C0367h hVar = this.f2033S;
        if (hVar instanceof C0598na) {
            ((C0598na) hVar).mo3137a(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f2044ga = searchableInfo;
        if (this.f2044ga != null) {
            m2626p();
            m2625o();
        }
        this.f2039ba = m2621k();
        if (this.f2039ba) {
            this.f2054q.setPrivateImeOptions("nm");
        }
        m2615b(mo2767c());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f2034T = z;
        m2615b(mo2767c());
    }

    public void setSuggestionsAdapter(C0367h hVar) {
        this.f2033S = hVar;
        this.f2054q.setAdapter(this.f2033S);
    }
}
