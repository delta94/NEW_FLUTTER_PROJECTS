package android.support.p030v7.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;
import p000a.p005b.p021d.p022a.C0166d;
import p000a.p005b.p021d.p022a.C0168f;
import p000a.p005b.p021d.p022a.C0169g;
import p000a.p005b.p021d.p022a.C0171i;

/* renamed from: android.support.v7.widget.Ha */
class C0517Ha {

    /* renamed from: a */
    private final Context f1942a;

    /* renamed from: b */
    private final View f1943b;

    /* renamed from: c */
    private final TextView f1944c;

    /* renamed from: d */
    private final LayoutParams f1945d = new LayoutParams();

    /* renamed from: e */
    private final Rect f1946e = new Rect();

    /* renamed from: f */
    private final int[] f1947f = new int[2];

    /* renamed from: g */
    private final int[] f1948g = new int[2];

    C0517Ha(Context context) {
        this.f1942a = context;
        this.f1943b = LayoutInflater.from(this.f1942a).inflate(C0169g.abc_tooltip, null);
        this.f1944c = (TextView) this.f1943b.findViewById(C0168f.message);
        this.f1945d.setTitle(C0517Ha.class.getSimpleName());
        this.f1945d.packageName = this.f1942a.getPackageName();
        LayoutParams layoutParams = this.f1945d;
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C0171i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* renamed from: a */
    private static View m2489a(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof LayoutParams) && ((LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* renamed from: a */
    private void m2490a(View view, int i, int i2, boolean z, LayoutParams layoutParams) {
        int i3;
        int i4;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1942a.getResources().getDimensionPixelOffset(C0166d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1942a.getResources().getDimensionPixelOffset(C0166d.tooltip_precise_anchor_extra_offset);
            i4 = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            i4 = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1942a.getResources().getDimensionPixelOffset(z ? C0166d.tooltip_y_offset_touch : C0166d.tooltip_y_offset_non_touch);
        View a = m2489a(view);
        if (a == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        a.getWindowVisibleDisplayFrame(this.f1946e);
        Rect rect = this.f1946e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1942a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1946e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        a.getLocationOnScreen(this.f1948g);
        view.getLocationOnScreen(this.f1947f);
        int[] iArr = this.f1947f;
        int i5 = iArr[0];
        int[] iArr2 = this.f1948g;
        iArr[0] = i5 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i) - (a.getWidth() / 2);
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        this.f1943b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1943b.getMeasuredHeight();
        int[] iArr3 = this.f1947f;
        int i6 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
        int i7 = iArr3[1] + i4 + dimensionPixelOffset3;
        if (!z ? measuredHeight + i7 > this.f1946e.height() : i6 >= 0) {
            layoutParams.y = i6;
        } else {
            layoutParams.y = i7;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2649a() {
        if (mo2651b()) {
            ((WindowManager) this.f1942a.getSystemService("window")).removeView(this.f1943b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2650a(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (mo2651b()) {
            mo2649a();
        }
        this.f1944c.setText(charSequence);
        m2490a(view, i, i2, z, this.f1945d);
        ((WindowManager) this.f1942a.getSystemService("window")).addView(this.f1943b, this.f1945d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo2651b() {
        return this.f1943b.getParent() != null;
    }
}
