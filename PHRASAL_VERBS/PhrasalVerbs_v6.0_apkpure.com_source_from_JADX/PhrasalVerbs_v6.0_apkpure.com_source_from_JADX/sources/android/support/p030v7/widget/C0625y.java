package android.support.p030v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p000a.p005b.p021d.p022a.C0163a;

/* renamed from: android.support.v7.widget.y */
public class C0625y extends RatingBar {

    /* renamed from: a */
    private final C0621w f2406a;

    public C0625y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0163a.ratingBarStyle);
    }

    public C0625y(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2406a = new C0621w(this);
        this.f2406a.mo2408a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap a = this.f2406a.mo3269a();
        if (a != null) {
            setMeasuredDimension(View.resolveSizeAndState(a.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
