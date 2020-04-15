package com.facebook.react.views.progressbar;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;

/* renamed from: com.facebook.react.views.progressbar.a */
class C1775a extends FrameLayout {

    /* renamed from: a */
    private Integer f5221a;

    /* renamed from: b */
    private boolean f5222b = true;

    /* renamed from: c */
    private boolean f5223c = true;

    /* renamed from: d */
    private double f5224d;

    /* renamed from: e */
    private ProgressBar f5225e;

    public C1775a(Context context) {
        super(context);
    }

    /* renamed from: a */
    private void m6793a(ProgressBar progressBar) {
        Drawable indeterminateDrawable = progressBar.isIndeterminate() ? progressBar.getIndeterminateDrawable() : progressBar.getProgressDrawable();
        if (indeterminateDrawable != null) {
            Integer num = this.f5221a;
            if (num != null) {
                indeterminateDrawable.setColorFilter(num.intValue(), Mode.SRC_IN);
            } else {
                indeterminateDrawable.clearColorFilter();
            }
        }
    }

    /* renamed from: a */
    public void mo6171a() {
        int i;
        ProgressBar progressBar;
        ProgressBar progressBar2 = this.f5225e;
        if (progressBar2 != null) {
            progressBar2.setIndeterminate(this.f5222b);
            m6793a(this.f5225e);
            this.f5225e.setProgress((int) (this.f5224d * 1000.0d));
            if (this.f5223c) {
                progressBar = this.f5225e;
                i = 0;
            } else {
                progressBar = this.f5225e;
                i = 8;
            }
            progressBar.setVisibility(i);
            return;
        }
        throw new JSApplicationIllegalArgumentException("setStyle() not called");
    }

    /* renamed from: a */
    public void mo6172a(double d) {
        this.f5224d = d;
    }

    /* renamed from: a */
    public void mo6173a(Integer num) {
        this.f5221a = num;
    }

    /* renamed from: a */
    public void mo6174a(String str) {
        this.f5225e = ReactProgressBarViewManager.createProgressBar(getContext(), ReactProgressBarViewManager.getStyleFromString(str));
        this.f5225e.setMax(1000);
        removeAllViews();
        addView(this.f5225e, new LayoutParams(-1, -1));
    }

    /* renamed from: a */
    public void mo6175a(boolean z) {
        this.f5223c = z;
    }

    /* renamed from: b */
    public void mo6176b(boolean z) {
        this.f5222b = z;
    }
}
