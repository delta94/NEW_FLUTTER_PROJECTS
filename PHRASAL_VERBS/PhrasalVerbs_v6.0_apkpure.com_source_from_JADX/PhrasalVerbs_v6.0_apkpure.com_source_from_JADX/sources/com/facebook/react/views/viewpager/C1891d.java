package com.facebook.react.views.viewpager;

import android.view.View.MeasureSpec;

/* renamed from: com.facebook.react.views.viewpager.d */
class C1891d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1892e f5650a;

    C1891d(C1892e eVar) {
        this.f5650a = eVar;
    }

    public void run() {
        C1892e eVar = this.f5650a;
        eVar.measure(MeasureSpec.makeMeasureSpec(eVar.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(this.f5650a.getHeight(), 1073741824));
        C1892e eVar2 = this.f5650a;
        eVar2.layout(eVar2.getLeft(), this.f5650a.getTop(), this.f5650a.getRight(), this.f5650a.getBottom());
    }
}
