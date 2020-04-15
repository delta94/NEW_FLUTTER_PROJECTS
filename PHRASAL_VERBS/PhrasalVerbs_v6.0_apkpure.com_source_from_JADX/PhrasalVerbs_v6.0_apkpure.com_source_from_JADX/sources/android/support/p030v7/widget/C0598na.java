package android.support.p030v7.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.p029v4.widget.C0388t;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import p000a.p005b.p009c.p010a.C0039a;
import p000a.p005b.p021d.p022a.C0163a;
import p000a.p005b.p021d.p022a.C0168f;

/* renamed from: android.support.v7.widget.na */
class C0598na extends C0388t implements OnClickListener {

    /* renamed from: l */
    private final SearchManager f2287l = ((SearchManager) this.f1185d.getSystemService("search"));

    /* renamed from: m */
    private final SearchView f2288m;

    /* renamed from: n */
    private final SearchableInfo f2289n;

    /* renamed from: o */
    private final Context f2290o;

    /* renamed from: p */
    private final WeakHashMap<String, ConstantState> f2291p;

    /* renamed from: q */
    private final int f2292q;

    /* renamed from: r */
    private boolean f2293r = false;

    /* renamed from: s */
    private int f2294s = 1;

    /* renamed from: t */
    private ColorStateList f2295t;

    /* renamed from: u */
    private int f2296u = -1;

    /* renamed from: v */
    private int f2297v = -1;

    /* renamed from: w */
    private int f2298w = -1;

    /* renamed from: x */
    private int f2299x = -1;

    /* renamed from: y */
    private int f2300y = -1;

    /* renamed from: z */
    private int f2301z = -1;

    /* renamed from: android.support.v7.widget.na$a */
    private static final class C0599a {

        /* renamed from: a */
        public final TextView f2302a;

        /* renamed from: b */
        public final TextView f2303b;

        /* renamed from: c */
        public final ImageView f2304c;

        /* renamed from: d */
        public final ImageView f2305d;

        /* renamed from: e */
        public final ImageView f2306e;

        public C0599a(View view) {
            this.f2302a = (TextView) view.findViewById(16908308);
            this.f2303b = (TextView) view.findViewById(16908309);
            this.f2304c = (ImageView) view.findViewById(16908295);
            this.f2305d = (ImageView) view.findViewById(16908296);
            this.f2306e = (ImageView) view.findViewById(C0168f.edit_query);
        }
    }

    public C0598na(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f2288m = searchView;
        this.f2289n = searchableInfo;
        this.f2292q = searchView.getSuggestionCommitIconResId();
        this.f2290o = context;
        this.f2291p = weakHashMap;
    }

    /* renamed from: a */
    private Drawable m2824a(ComponentName componentName) {
        String nameNotFoundException;
        String str = "SuggestionsAdapter";
        PackageManager packageManager = this.f1185d.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid icon resource ");
            sb.append(iconResource);
            sb.append(" for ");
            sb.append(componentName.flattenToShortString());
            nameNotFoundException = sb.toString();
            Log.w(str, nameNotFoundException);
            return null;
        } catch (NameNotFoundException e) {
            nameNotFoundException = e.toString();
        }
    }

    /* renamed from: a */
    private Drawable m2825a(String str) {
        ConstantState constantState = (ConstantState) this.f2291p.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: a */
    private static String m2826a(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m2827a(Cursor cursor, String str) {
        return m2826a(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: a */
    private void m2828a(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: a */
    private void m2829a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    /* renamed from: a */
    private void m2830a(String str, Drawable drawable) {
        if (drawable != null) {
            this.f2291p.put(str, drawable.getConstantState());
        }
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v2, types: [android.graphics.drawable.Drawable$ConstantState] */
    /* JADX WARNING: type inference failed for: r2v3, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], android.graphics.drawable.Drawable, android.graphics.drawable.Drawable$ConstantState]
      uses: [java.lang.Object, android.graphics.drawable.Drawable]
      mth insns count: 21
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
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m2831b(android.content.ComponentName r4) {
        /*
            r3 = this;
            java.lang.String r0 = r4.flattenToShortString()
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r1 = r3.f2291p
            boolean r1 = r1.containsKey(r0)
            r2 = 0
            if (r1 == 0) goto L_0x0023
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r4 = r3.f2291p
            java.lang.Object r4 = r4.get(r0)
            android.graphics.drawable.Drawable$ConstantState r4 = (android.graphics.drawable.Drawable.ConstantState) r4
            if (r4 != 0) goto L_0x0018
            goto L_0x0022
        L_0x0018:
            android.content.Context r0 = r3.f2290o
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.drawable.Drawable r2 = r4.newDrawable(r0)
        L_0x0022:
            return r2
        L_0x0023:
            android.graphics.drawable.Drawable r4 = r3.m2824a(r4)
            if (r4 != 0) goto L_0x002a
            goto L_0x002e
        L_0x002a:
            android.graphics.drawable.Drawable$ConstantState r2 = r4.getConstantState()
        L_0x002e:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r1 = r3.f2291p
            r1.put(r0, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v7.widget.C0598na.m2831b(android.content.ComponentName):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append("Resource does not exist: ");
        r3.append(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        throw new java.io.FileNotFoundException(r3.toString());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m2832b(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Error closing icon stream for "
            java.lang.String r1 = "SuggestionsAdapter"
            r2 = 0
            java.lang.String r3 = r7.getScheme()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "android.resource"
            boolean r3 = r4.equals(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            if (r3 == 0) goto L_0x002d
            android.graphics.drawable.Drawable r7 = r6.mo3136a(r7)     // Catch:{ NotFoundException -> 0x0016 }
            return r7
        L_0x0016:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "Resource does not exist: "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x002d:
            android.content.Context r3 = r6.f2290o     // Catch:{ FileNotFoundException -> 0x0085 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.io.InputStream r3 = r3.openInputStream(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            if (r3 == 0) goto L_0x006e
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromStream(r3, r2)     // Catch:{ all -> 0x0055 }
            r3.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0054
        L_0x0041:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x0054:
            return r4
        L_0x0055:
            r4 = move-exception
            r3.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x006d
        L_0x005a:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x006d:
            throw r4     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x006e:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "Failed to open "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x0085:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Icon not found: "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = ", "
            r3.append(r7)
            java.lang.String r7 = r0.getMessage()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            android.util.Log.w(r1, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v7.widget.C0598na.m2832b(android.net.Uri):android.graphics.drawable.Drawable");
    }

    /* renamed from: b */
    private Drawable m2833b(String str) {
        Drawable drawable = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                StringBuilder sb = new StringBuilder();
                sb.append("android.resource://");
                sb.append(this.f2290o.getPackageName());
                sb.append("/");
                sb.append(parseInt);
                String sb2 = sb.toString();
                Drawable a = m2825a(sb2);
                if (a != null) {
                    return a;
                }
                Drawable c = C0039a.m111c(this.f2290o, parseInt);
                m2830a(sb2, c);
                return c;
            } catch (NumberFormatException unused) {
                Drawable a2 = m2825a(str);
                if (a2 != null) {
                    return a2;
                }
                drawable = m2832b(Uri.parse(str));
                m2830a(str, drawable);
            } catch (NotFoundException unused2) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Icon resource not found: ");
                sb3.append(str);
                Log.w("SuggestionsAdapter", sb3.toString());
                return null;
            }
        }
        return drawable;
    }

    /* renamed from: b */
    private CharSequence m2834b(CharSequence charSequence) {
        if (this.f2295t == null) {
            TypedValue typedValue = new TypedValue();
            this.f1185d.getTheme().resolveAttribute(C0163a.textColorSearchUrl, typedValue, true);
            this.f2295t = this.f1185d.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(null, 0, 0, this.f2295t, null);
        spannableString.setSpan(textAppearanceSpan, 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: c */
    private Drawable m2835c(Cursor cursor) {
        Drawable b = m2831b(this.f2289n.getSearchActivity());
        return b != null ? b : this.f1185d.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: d */
    private Drawable m2836d(Cursor cursor) {
        int i = this.f2299x;
        if (i == -1) {
            return null;
        }
        Drawable b = m2833b(cursor.getString(i));
        return b != null ? b : m2835c(cursor);
    }

    /* renamed from: e */
    private Drawable m2837e(Cursor cursor) {
        int i = this.f2300y;
        if (i == -1) {
            return null;
        }
        return m2833b(cursor.getString(i));
    }

    /* renamed from: f */
    private void m2838f(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Cursor mo3135a(SearchableInfo searchableInfo, String str, int i) {
        String[] strArr = null;
        if (searchableInfo == null) {
            return null;
        }
        String suggestAuthority = searchableInfo.getSuggestAuthority();
        if (suggestAuthority == null) {
            return null;
        }
        Builder authority = new Builder().scheme("content").authority(suggestAuthority);
        String str2 = "";
        Builder fragment = authority.query(str2).fragment(str2);
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f1185d.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    /* renamed from: a */
    public Cursor mo1718a(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f2288m.getVisibility() == 0 && this.f2288m.getWindowVisibility() == 0) {
            try {
                Cursor a = mo3135a(this.f2289n, charSequence2, 50);
                if (a != null) {
                    a.getCount();
                    return a;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Drawable mo3136a(Uri uri) {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f1185d.getPackageManager().getResourcesForApplication(authority);
                List pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt((String) pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Single path segment is not a resource ID: ");
                            sb.append(uri);
                            throw new FileNotFoundException(sb.toString());
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier((String) pathSegments.get(1), (String) pathSegments.get(0), authority);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("More than two path segments: ");
                        sb2.append(uri);
                        throw new FileNotFoundException(sb2.toString());
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("No resource found for: ");
                    sb3.append(uri);
                    throw new FileNotFoundException(sb3.toString());
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("No path: ");
                sb4.append(uri);
                throw new FileNotFoundException(sb4.toString());
            } catch (NameNotFoundException unused2) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("No package found for authority: ");
                sb5.append(uri);
                throw new FileNotFoundException(sb5.toString());
            }
        } else {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("No authority: ");
            sb6.append(uri);
            throw new FileNotFoundException(sb6.toString());
        }
    }

    /* renamed from: a */
    public void mo3137a(int i) {
        this.f2294s = i;
    }

    /* renamed from: a */
    public void mo1699a(Cursor cursor) {
        String str = "SuggestionsAdapter";
        if (this.f2293r) {
            Log.w(str, "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
            }
            return;
        }
        try {
            super.mo1699a(cursor);
            if (cursor != null) {
                this.f2296u = cursor.getColumnIndex("suggest_text_1");
                this.f2297v = cursor.getColumnIndex("suggest_text_2");
                this.f2298w = cursor.getColumnIndex("suggest_text_2_url");
                this.f2299x = cursor.getColumnIndex("suggest_icon_1");
                this.f2300y = cursor.getColumnIndex("suggest_icon_2");
                this.f2301z = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e(str, "error changing cursor and caching columns", e);
        }
    }

    /* renamed from: a */
    public void mo1700a(View view, Context context, Cursor cursor) {
        C0599a aVar = (C0599a) view.getTag();
        int i = this.f2301z;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (aVar.f2302a != null) {
            m2829a(aVar.f2302a, (CharSequence) m2826a(cursor, this.f2296u));
        }
        if (aVar.f2303b != null) {
            String a = m2826a(cursor, this.f2298w);
            CharSequence b = a != null ? m2834b((CharSequence) a) : m2826a(cursor, this.f2297v);
            if (TextUtils.isEmpty(b)) {
                TextView textView = aVar.f2302a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f2302a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f2302a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f2302a.setMaxLines(1);
                }
            }
            m2829a(aVar.f2303b, b);
        }
        ImageView imageView = aVar.f2304c;
        if (imageView != null) {
            m2828a(imageView, m2836d(cursor), 4);
        }
        ImageView imageView2 = aVar.f2305d;
        if (imageView2 != null) {
            m2828a(imageView2, m2837e(cursor), 8);
        }
        int i3 = this.f2294s;
        if (i3 == 2 || (i3 == 1 && (i2 & 1) != 0)) {
            aVar.f2306e.setVisibility(0);
            aVar.f2306e.setTag(aVar.f2302a.getText());
            aVar.f2306e.setOnClickListener(this);
            return;
        }
        aVar.f2306e.setVisibility(8);
    }

    /* renamed from: b */
    public View mo1702b(Context context, Cursor cursor, ViewGroup viewGroup) {
        View b = super.mo1702b(context, cursor, viewGroup);
        b.setTag(new C0599a(b));
        ((ImageView) b.findViewById(C0168f.edit_query)).setImageResource(this.f2292q);
        return b;
    }

    public CharSequence convertToString(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        String a = m2827a(cursor, "suggest_intent_query");
        if (a != null) {
            return a;
        }
        if (this.f2289n.shouldRewriteQueryFromData()) {
            String a2 = m2827a(cursor, "suggest_intent_data");
            if (a2 != null) {
                return a2;
            }
        }
        if (this.f2289n.shouldRewriteQueryFromText()) {
            String a3 = m2827a(cursor, "suggest_text_1");
            if (a3 != null) {
                return a3;
            }
        }
        return null;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View a = mo1697a(this.f1185d, this.f1184c, viewGroup);
            if (a != null) {
                ((C0599a) a.getTag()).f2302a.setText(e.toString());
            }
            return a;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View b = mo1702b(this.f1185d, this.f1184c, viewGroup);
            if (b != null) {
                ((C0599a) b.getTag()).f2302a.setText(e.toString());
            }
            return b;
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m2838f(mo1696a());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m2838f(mo1696a());
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f2288m.mo2761a((CharSequence) tag);
        }
    }
}
