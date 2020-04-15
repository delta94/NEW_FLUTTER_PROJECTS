package com.facebook.react.uimanager.p123c;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: com.facebook.react.uimanager.c.o */
class C1617o extends C1603a {
    C1617o() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5832a() {
        return this.f4839e > 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Animation mo5833b(View view, int i, int i2, int i3, int i4) {
        boolean z = false;
        boolean z2 = (view.getX() == ((float) i) && view.getY() == ((float) i2)) ? false : true;
        if (!(view.getWidth() == i3 && view.getHeight() == i4)) {
            z = true;
        }
        if (!z2 && !z) {
            return null;
        }
        C1620q qVar = new C1620q(view, i, i2, i3, i4);
        return qVar;
    }
}
