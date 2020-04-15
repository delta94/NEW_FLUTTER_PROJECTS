package com.facebook.react.views.picker;

import android.view.View.MeasureSpec;

/* renamed from: com.facebook.react.views.picker.b */
class C1772b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1773c f5214a;

    C1772b(C1773c cVar) {
        this.f5214a = cVar;
    }

    public void run() {
        C1773c cVar = this.f5214a;
        cVar.measure(MeasureSpec.makeMeasureSpec(cVar.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(this.f5214a.getHeight(), 1073741824));
        C1773c cVar2 = this.f5214a;
        cVar2.layout(cVar2.getLeft(), this.f5214a.getTop(), this.f5214a.getRight(), this.f5214a.getBottom());
    }
}
