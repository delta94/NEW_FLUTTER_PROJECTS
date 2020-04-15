package com.facebook.react.uimanager.common;

import android.content.Context;
import android.widget.FrameLayout;

public class SizeMonitoringFrameLayout extends FrameLayout {

    /* renamed from: a */
    private C1623a f4881a;

    /* renamed from: com.facebook.react.uimanager.common.SizeMonitoringFrameLayout$a */
    public interface C1623a {
        /* renamed from: a */
        void mo5818a(int i, int i2, int i3, int i4);
    }

    public SizeMonitoringFrameLayout(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C1623a aVar = this.f4881a;
        if (aVar != null) {
            aVar.mo5818a(i, i2, i3, i4);
        }
    }

    public void setOnSizeChangedListener(C1623a aVar) {
        this.f4881a = aVar;
    }
}
