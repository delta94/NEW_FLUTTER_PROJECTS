package android.support.p030v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p030v7.widget.C0529O.C0530a;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: android.support.v7.widget.FitWindowsFrameLayout */
public class FitWindowsFrameLayout extends FrameLayout implements C0529O {

    /* renamed from: a */
    private C0530a f1916a;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        C0530a aVar = this.f1916a;
        if (aVar != null) {
            aVar.mo1966a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(C0530a aVar) {
        this.f1916a = aVar;
    }
}
