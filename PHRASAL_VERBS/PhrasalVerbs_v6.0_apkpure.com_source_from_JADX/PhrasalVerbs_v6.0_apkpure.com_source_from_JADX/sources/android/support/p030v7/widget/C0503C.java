package android.support.p030v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import p000a.p005b.p009c.p018g.C0154t;
import p000a.p005b.p009c.p018g.C0156v;
import p000a.p005b.p021d.p022a.C0163a;
import p000a.p005b.p021d.p023b.p024a.C0173a;

/* renamed from: android.support.v7.widget.C */
public class C0503C extends Spinner implements C0154t {

    /* renamed from: a */
    private static final int[] f1869a = {16843505};

    /* renamed from: b */
    private final C0589j f1870b;

    /* renamed from: c */
    private final Context f1871c;

    /* renamed from: d */
    private C0531P f1872d;

    /* renamed from: e */
    private SpinnerAdapter f1873e;

    /* renamed from: f */
    private final boolean f1874f;

    /* renamed from: g */
    C0505b f1875g;

    /* renamed from: h */
    int f1876h;

    /* renamed from: i */
    final Rect f1877i;

    /* renamed from: android.support.v7.widget.C$a */
    private static class C0504a implements ListAdapter, SpinnerAdapter {

        /* renamed from: a */
        private SpinnerAdapter f1878a;

        /* renamed from: b */
        private ListAdapter f1879b;

        public C0504a(SpinnerAdapter spinnerAdapter, Theme theme) {
            this.f1878a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1879b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof C0612ra) {
                C0612ra raVar = (C0612ra) spinnerAdapter;
                if (raVar.getDropDownViewTheme() == null) {
                    raVar.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1879b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1878a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1878a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f1878a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f1878a;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1878a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f1879b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1878a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1878a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: android.support.v7.widget.C$b */
    private class C0505b extends C0548U {

        /* renamed from: K */
        private CharSequence f1880K;

        /* renamed from: L */
        ListAdapter f1881L;

        /* renamed from: M */
        private final Rect f1882M = new Rect();

        public C0505b(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            mo2916a((View) C0503C.this);
            mo2919a(true);
            mo2927f(0);
            mo2917a((OnItemClickListener) new C0508D(this, C0503C.this));
        }

        /* renamed from: a */
        public void mo2563a(ListAdapter listAdapter) {
            super.mo2563a(listAdapter);
            this.f1881L = listAdapter;
        }

        /* renamed from: a */
        public void mo2564a(CharSequence charSequence) {
            this.f1880K = charSequence;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo2565b(View view) {
            return C0156v.m576q(view) && view.getGlobalVisibleRect(this.f1882M);
        }

        /* renamed from: c */
        public void mo2053c() {
            boolean b = mo2052b();
            mo2566l();
            mo2925e(2);
            super.mo2053c();
            mo2056d().setChoiceMode(1);
            mo2929g(C0503C.this.getSelectedItemPosition());
            if (!b) {
                ViewTreeObserver viewTreeObserver = C0503C.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    C0510E e = new C0510E(this);
                    viewTreeObserver.addOnGlobalLayoutListener(e);
                    mo2918a((OnDismissListener) new C0512F(this, e));
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0095  */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo2566l() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.mo2926f()
                r1 = 0
                if (r0 == 0) goto L_0x0026
                android.support.v7.widget.C r1 = android.support.p030v7.widget.C0503C.this
                android.graphics.Rect r1 = r1.f1877i
                r0.getPadding(r1)
                android.support.v7.widget.C r0 = android.support.p030v7.widget.C0503C.this
                boolean r0 = android.support.p030v7.widget.C0521Ja.m2525a(r0)
                if (r0 == 0) goto L_0x001d
                android.support.v7.widget.C r0 = android.support.p030v7.widget.C0503C.this
                android.graphics.Rect r0 = r0.f1877i
                int r0 = r0.right
                goto L_0x0024
            L_0x001d:
                android.support.v7.widget.C r0 = android.support.p030v7.widget.C0503C.this
                android.graphics.Rect r0 = r0.f1877i
                int r0 = r0.left
                int r0 = -r0
            L_0x0024:
                r1 = r0
                goto L_0x002e
            L_0x0026:
                android.support.v7.widget.C r0 = android.support.p030v7.widget.C0503C.this
                android.graphics.Rect r0 = r0.f1877i
                r0.right = r1
                r0.left = r1
            L_0x002e:
                android.support.v7.widget.C r0 = android.support.p030v7.widget.C0503C.this
                int r0 = r0.getPaddingLeft()
                android.support.v7.widget.C r2 = android.support.p030v7.widget.C0503C.this
                int r2 = r2.getPaddingRight()
                android.support.v7.widget.C r3 = android.support.p030v7.widget.C0503C.this
                int r3 = r3.getWidth()
                android.support.v7.widget.C r4 = android.support.p030v7.widget.C0503C.this
                int r5 = r4.f1876h
                r6 = -2
                if (r5 != r6) goto L_0x0078
                android.widget.ListAdapter r5 = r8.f1881L
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.mo2926f()
                int r4 = r4.mo2528a(r5, r6)
                android.support.v7.widget.C r5 = android.support.p030v7.widget.C0503C.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                android.support.v7.widget.C r6 = android.support.p030v7.widget.C0503C.this
                android.graphics.Rect r6 = r6.f1877i
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L_0x0070
                r4 = r5
            L_0x0070:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L_0x007e
            L_0x0078:
                r4 = -1
                if (r5 != r4) goto L_0x0082
                int r4 = r3 - r0
                int r4 = r4 - r2
            L_0x007e:
                r8.mo2920b(r4)
                goto L_0x0085
            L_0x0082:
                r8.mo2920b(r5)
            L_0x0085:
                android.support.v7.widget.C r4 = android.support.p030v7.widget.C0503C.this
                boolean r4 = android.support.p030v7.widget.C0521Ja.m2525a(r4)
                if (r4 == 0) goto L_0x0095
                int r3 = r3 - r2
                int r0 = r8.mo2932i()
                int r3 = r3 - r0
                int r1 = r1 + r3
                goto L_0x0096
            L_0x0095:
                int r1 = r1 + r0
            L_0x0096:
                r8.mo2923d(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p030v7.widget.C0503C.C0505b.mo2566l():void");
        }

        /* renamed from: m */
        public CharSequence mo2567m() {
            return this.f1880K;
        }
    }

    public C0503C(Context context, int i) {
        this(context, null, C0163a.spinnerStyle, i);
    }

    public C0503C(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0163a.spinnerStyle);
    }

    public C0503C(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public C0503C(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        if (r12 != null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        r12.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0068, code lost:
        if (r12 != null) goto L_0x0056;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0503C(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11, android.content.res.Resources.Theme r12) {
        /*
            r7 = this;
            r7.<init>(r8, r9, r10)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.f1877i = r0
            int[] r0 = p000a.p005b.p021d.p022a.C0172j.Spinner
            r1 = 0
            android.support.v7.widget.va r0 = android.support.p030v7.widget.C0620va.m2920a(r8, r9, r0, r10, r1)
            android.support.v7.widget.j r2 = new android.support.v7.widget.j
            r2.<init>(r7)
            r7.f1870b = r2
            r2 = 0
            if (r12 == 0) goto L_0x0023
            a.b.d.e.d r3 = new a.b.d.e.d
            r3.<init>(r8, r12)
        L_0x0020:
            r7.f1871c = r3
            goto L_0x003c
        L_0x0023:
            int r12 = p000a.p005b.p021d.p022a.C0172j.Spinner_popupTheme
            int r12 = r0.mo3267g(r12, r1)
            if (r12 == 0) goto L_0x0031
            a.b.d.e.d r3 = new a.b.d.e.d
            r3.<init>(r8, r12)
            goto L_0x0020
        L_0x0031:
            int r12 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r12 >= r3) goto L_0x0039
            r12 = r8
            goto L_0x003a
        L_0x0039:
            r12 = r2
        L_0x003a:
            r7.f1871c = r12
        L_0x003c:
            android.content.Context r12 = r7.f1871c
            r3 = 1
            if (r12 == 0) goto L_0x00aa
            r12 = -1
            if (r11 != r12) goto L_0x0072
            int[] r12 = f1869a     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            android.content.res.TypedArray r12 = r8.obtainStyledAttributes(r9, r12, r10, r1)     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            boolean r4 = r12.hasValue(r1)     // Catch:{ Exception -> 0x005a }
            if (r4 == 0) goto L_0x0054
            int r11 = r12.getInt(r1, r1)     // Catch:{ Exception -> 0x005a }
        L_0x0054:
            if (r12 == 0) goto L_0x0072
        L_0x0056:
            r12.recycle()
            goto L_0x0072
        L_0x005a:
            r4 = move-exception
            goto L_0x0061
        L_0x005c:
            r8 = move-exception
            r12 = r2
            goto L_0x006c
        L_0x005f:
            r4 = move-exception
            r12 = r2
        L_0x0061:
            java.lang.String r5 = "AppCompatSpinner"
            java.lang.String r6 = "Could not read android:spinnerMode"
            android.util.Log.i(r5, r6, r4)     // Catch:{ all -> 0x006b }
            if (r12 == 0) goto L_0x0072
            goto L_0x0056
        L_0x006b:
            r8 = move-exception
        L_0x006c:
            if (r12 == 0) goto L_0x0071
            r12.recycle()
        L_0x0071:
            throw r8
        L_0x0072:
            if (r11 != r3) goto L_0x00aa
            android.support.v7.widget.C$b r11 = new android.support.v7.widget.C$b
            android.content.Context r12 = r7.f1871c
            r11.<init>(r12, r9, r10)
            android.content.Context r12 = r7.f1871c
            int[] r4 = p000a.p005b.p021d.p022a.C0172j.Spinner
            android.support.v7.widget.va r12 = android.support.p030v7.widget.C0620va.m2920a(r12, r9, r4, r10, r1)
            int r1 = p000a.p005b.p021d.p022a.C0172j.Spinner_android_dropDownWidth
            r4 = -2
            int r1 = r12.mo3265f(r1, r4)
            r7.f1876h = r1
            int r1 = p000a.p005b.p021d.p022a.C0172j.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r1 = r12.mo3258b(r1)
            r11.mo2915a(r1)
            int r1 = p000a.p005b.p021d.p022a.C0172j.Spinner_android_prompt
            java.lang.String r1 = r0.mo3262d(r1)
            r11.mo2564a(r1)
            r12.mo3255a()
            r7.f1875g = r11
            android.support.v7.widget.B r12 = new android.support.v7.widget.B
            r12.<init>(r7, r7, r11)
            r7.f1872d = r12
        L_0x00aa:
            int r11 = p000a.p005b.p021d.p022a.C0172j.Spinner_android_entries
            java.lang.CharSequence[] r11 = r0.mo3266f(r11)
            if (r11 == 0) goto L_0x00c2
            android.widget.ArrayAdapter r12 = new android.widget.ArrayAdapter
            r1 = 17367048(0x1090008, float:2.5162948E-38)
            r12.<init>(r8, r1, r11)
            int r8 = p000a.p005b.p021d.p022a.C0169g.support_simple_spinner_dropdown_item
            r12.setDropDownViewResource(r8)
            r7.setAdapter(r12)
        L_0x00c2:
            r0.mo3255a()
            r7.f1874f = r3
            android.widget.SpinnerAdapter r8 = r7.f1873e
            if (r8 == 0) goto L_0x00d0
            r7.setAdapter(r8)
            r7.f1873e = r2
        L_0x00d0:
            android.support.v7.widget.j r8 = r7.f1870b
            r8.mo3087a(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v7.widget.C0503C.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo2528a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.f1877i);
            Rect rect = this.f1877i;
            i2 += rect.left + rect.right;
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0589j jVar = this.f1870b;
        if (jVar != null) {
            jVar.mo3082a();
        }
    }

    public int getDropDownHorizontalOffset() {
        C0505b bVar = this.f1875g;
        if (bVar != null) {
            return bVar.mo2928g();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        C0505b bVar = this.f1875g;
        if (bVar != null) {
            return bVar.mo2930h();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.f1875g != null) {
            return this.f1876h;
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    public Drawable getPopupBackground() {
        C0505b bVar = this.f1875g;
        if (bVar != null) {
            return bVar.mo2926f();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public Context getPopupContext() {
        if (this.f1875g != null) {
            return this.f1871c;
        }
        if (VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    public CharSequence getPrompt() {
        C0505b bVar = this.f1875g;
        return bVar != null ? bVar.mo2567m() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0589j jVar = this.f1870b;
        if (jVar != null) {
            return jVar.mo3088b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C0589j jVar = this.f1870b;
        if (jVar != null) {
            return jVar.mo3090c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0505b bVar = this.f1875g;
        if (bVar != null && bVar.mo2052b()) {
            this.f1875g.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1875g != null && MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo2528a(getAdapter(), getBackground())), MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0531P p = this.f1872d;
        if (p == null || !p.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        C0505b bVar = this.f1875g;
        if (bVar == null) {
            return super.performClick();
        }
        if (!bVar.mo2052b()) {
            this.f1875g.mo2053c();
        }
        return true;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1874f) {
            this.f1873e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1875g != null) {
            Context context = this.f1871c;
            if (context == null) {
                context = getContext();
            }
            this.f1875g.mo2563a((ListAdapter) new C0504a(spinnerAdapter, context.getTheme()));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0589j jVar = this.f1870b;
        if (jVar != null) {
            jVar.mo3086a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0589j jVar = this.f1870b;
        if (jVar != null) {
            jVar.mo3083a(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        C0505b bVar = this.f1875g;
        if (bVar != null) {
            bVar.mo2923d(i);
        } else if (VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public void setDropDownVerticalOffset(int i) {
        C0505b bVar = this.f1875g;
        if (bVar != null) {
            bVar.mo2931h(i);
        } else if (VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f1875g != null) {
            this.f1876h = i;
        } else if (VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        C0505b bVar = this.f1875g;
        if (bVar != null) {
            bVar.mo2915a(drawable);
        } else if (VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C0173a.m597b(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        C0505b bVar = this.f1875g;
        if (bVar != null) {
            bVar.mo2564a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0589j jVar = this.f1870b;
        if (jVar != null) {
            jVar.mo3089b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C0589j jVar = this.f1870b;
        if (jVar != null) {
            jVar.mo3085a(mode);
        }
    }
}
