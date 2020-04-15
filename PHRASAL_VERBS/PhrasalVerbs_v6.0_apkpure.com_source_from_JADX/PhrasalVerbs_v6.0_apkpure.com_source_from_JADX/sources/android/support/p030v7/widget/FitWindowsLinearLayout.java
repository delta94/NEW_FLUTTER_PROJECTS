package android.support.p030v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p030v7.widget.C0529O.C0530a;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: android.support.v7.widget.FitWindowsLinearLayout */
public class FitWindowsLinearLayout extends LinearLayout implements C0529O {

    /* renamed from: a */
    private C0530a f1917a;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        C0530a aVar = this.f1917a;
        if (aVar != null) {
            aVar.mo1966a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(C0530a aVar) {
        this.f1917a = aVar;
    }
}
