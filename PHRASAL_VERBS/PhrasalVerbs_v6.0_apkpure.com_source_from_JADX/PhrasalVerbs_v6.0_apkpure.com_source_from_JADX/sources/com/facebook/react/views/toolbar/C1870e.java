package com.facebook.react.views.toolbar;

import android.view.View.MeasureSpec;

/* renamed from: com.facebook.react.views.toolbar.e */
class C1870e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1871f f5562a;

    C1870e(C1871f fVar) {
        this.f5562a = fVar;
    }

    public void run() {
        C1871f fVar = this.f5562a;
        fVar.measure(MeasureSpec.makeMeasureSpec(fVar.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(this.f5562a.getHeight(), 1073741824));
        C1871f fVar2 = this.f5562a;
        fVar2.layout(fVar2.getLeft(), this.f5562a.getTop(), this.f5562a.getRight(), this.f5562a.getBottom());
    }
}
