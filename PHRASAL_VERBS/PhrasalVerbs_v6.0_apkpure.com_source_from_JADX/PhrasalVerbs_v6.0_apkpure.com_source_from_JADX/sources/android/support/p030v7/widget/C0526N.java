package android.support.p030v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p029v4.graphics.drawable.C0311a;
import android.support.p029v4.widget.C0384p;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import p000a.p005b.p009c.p018g.C0116H;
import p000a.p005b.p021d.p022a.C0163a;
import p000a.p005b.p021d.p025c.p026a.C0187e;

/* renamed from: android.support.v7.widget.N */
class C0526N extends ListView {

    /* renamed from: a */
    private final Rect f1969a = new Rect();

    /* renamed from: b */
    private int f1970b = 0;

    /* renamed from: c */
    private int f1971c = 0;

    /* renamed from: d */
    private int f1972d = 0;

    /* renamed from: e */
    private int f1973e = 0;

    /* renamed from: f */
    private int f1974f;

    /* renamed from: g */
    private Field f1975g;

    /* renamed from: h */
    private C0527a f1976h;

    /* renamed from: i */
    private boolean f1977i;

    /* renamed from: j */
    private boolean f1978j;

    /* renamed from: k */
    private boolean f1979k;

    /* renamed from: l */
    private C0116H f1980l;

    /* renamed from: m */
    private C0384p f1981m;

    /* renamed from: n */
    C0528b f1982n;

    /* renamed from: android.support.v7.widget.N$a */
    private static class C0527a extends C0187e {

        /* renamed from: b */
        private boolean f1983b = true;

        C0527a(Drawable drawable) {
            super(drawable);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2707a(boolean z) {
            this.f1983b = z;
        }

        public void draw(Canvas canvas) {
            if (this.f1983b) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f, float f2) {
            if (this.f1983b) {
                super.setHotspot(f, f2);
            }
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f1983b) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.f1983b) {
                return super.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z, boolean z2) {
            if (this.f1983b) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.N$b */
    private class C0528b implements Runnable {
        C0528b() {
        }

        /* renamed from: a */
        public void mo2708a() {
            C0526N n = C0526N.this;
            n.f1982n = null;
            n.removeCallbacks(this);
        }

        /* renamed from: b */
        public void mo2709b() {
            C0526N.this.post(this);
        }

        public void run() {
            C0526N n = C0526N.this;
            n.f1982n = null;
            n.drawableStateChanged();
        }
    }

    C0526N(Context context, boolean z) {
        super(context, null, C0163a.dropDownListViewStyle);
        this.f1978j = z;
        setCacheColorHint(0);
        try {
            this.f1975g = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1975g.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m2564a() {
        this.f1979k = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1974f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C0116H h = this.f1980l;
        if (h != null) {
            h.mo402a();
            this.f1980l = null;
        }
    }

    /* renamed from: a */
    private void m2565a(int i, View view) {
        Rect rect = this.f1969a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1970b;
        rect.top -= this.f1971c;
        rect.right += this.f1972d;
        rect.bottom += this.f1973e;
        try {
            boolean z = this.f1975g.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f1975g.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m2566a(int i, View view, float f, float f2) {
        m2570b(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            C0311a.m1334a(selector, f, f2);
        }
    }

    /* renamed from: a */
    private void m2567a(Canvas canvas) {
        if (!this.f1969a.isEmpty()) {
            Drawable selector = getSelector();
            if (selector != null) {
                selector.setBounds(this.f1969a);
                selector.draw(canvas);
            }
        }
    }

    /* renamed from: a */
    private void m2568a(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: a */
    private void m2569a(View view, int i, float f, float f2) {
        this.f1979k = true;
        if (VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f1974f;
        if (i2 != -1) {
            View childAt = getChildAt(i2 - getFirstVisiblePosition());
            if (!(childAt == null || childAt == view || !childAt.isPressed())) {
                childAt.setPressed(false);
            }
        }
        this.f1974f = i;
        float left = f - ((float) view.getLeft());
        float top = f2 - ((float) view.getTop());
        if (VERSION.SDK_INT >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m2566a(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: b */
    private void m2570b(int i, View view) {
        Drawable selector = getSelector();
        boolean z = true;
        boolean z2 = (selector == null || i == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        m2565a(i, view);
        if (z2) {
            Rect rect = this.f1969a;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            C0311a.m1334a(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: b */
    private boolean m2571b() {
        return this.f1979k;
    }

    /* renamed from: c */
    private void m2572c() {
        Drawable selector = getSelector();
        if (selector != null && m2571b() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z) {
        C0527a aVar = this.f1976h;
        if (aVar != null) {
            aVar.mo2707a(z);
        }
    }

    /* renamed from: a */
    public int mo2694a(int i, int i2, int i3, int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i6 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i7 = i6;
        View view = null;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < count; i10++) {
            int itemViewType = adapter.getItemViewType(i10);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = adapter.getView(i10, view, this);
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i11 = layoutParams.height;
            view.measure(i, i11 > 0 ? MeasureSpec.makeMeasureSpec(i11, 1073741824) : MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i10 > 0) {
                i7 += dividerHeight;
            }
            i7 += view.getMeasuredHeight();
            if (i7 >= i4) {
                if (i5 >= 0 && i10 > i5 && i9 > 0 && i7 != i4) {
                    i4 = i9;
                }
                return i4;
            }
            if (i5 >= 0 && i10 >= i5) {
                i9 = i7;
            }
        }
        return i7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2695a(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x0014
            r9 = 3
            if (r0 == r9) goto L_0x0011
        L_0x000e:
            r9 = 0
            r3 = 1
            goto L_0x0046
        L_0x0011:
            r9 = 0
            r3 = 0
            goto L_0x0046
        L_0x0014:
            r3 = 1
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L_0x001e
            goto L_0x0011
        L_0x001e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L_0x0031
            r9 = 1
            goto L_0x0046
        L_0x0031:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m2569a(r3, r5, r4, r9)
            if (r0 != r2) goto L_0x000e
            r7.m2568a(r3, r5)
            goto L_0x000e
        L_0x0046:
            if (r3 == 0) goto L_0x004a
            if (r9 == 0) goto L_0x004d
        L_0x004a:
            r7.m2564a()
        L_0x004d:
            if (r3 == 0) goto L_0x0065
            android.support.v4.widget.p r9 = r7.f1981m
            if (r9 != 0) goto L_0x005a
            android.support.v4.widget.p r9 = new android.support.v4.widget.p
            r9.<init>(r7)
            r7.f1981m = r9
        L_0x005a:
            android.support.v4.widget.p r9 = r7.f1981m
            r9.mo1613a(r2)
            android.support.v4.widget.p r9 = r7.f1981m
            r9.onTouch(r7, r8)
            goto L_0x006c
        L_0x0065:
            android.support.v4.widget.p r8 = r7.f1981m
            if (r8 == 0) goto L_0x006c
            r8.mo1613a(r1)
        L_0x006c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v7.widget.C0526N.mo2695a(android.view.MotionEvent, int):boolean");
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        m2567a(canvas);
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.f1982n == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            m2572c();
        }
    }

    public boolean hasFocus() {
        return this.f1978j || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f1978j || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f1978j || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f1978j && this.f1977i) || super.isInTouchMode();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f1982n = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1982n == null) {
            this.f1982n = new C0528b();
            this.f1982n.mo2709b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m2572c();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1974f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C0528b bVar = this.f1982n;
        if (bVar != null) {
            bVar.mo2708a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: 0000 */
    public void setListSelectionHidden(boolean z) {
        this.f1977i = z;
    }

    public void setSelector(Drawable drawable) {
        this.f1976h = drawable != null ? new C0527a(drawable) : null;
        super.setSelector(this.f1976h);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1970b = rect.left;
        this.f1971c = rect.top;
        this.f1972d = rect.right;
        this.f1973e = rect.bottom;
    }
}
