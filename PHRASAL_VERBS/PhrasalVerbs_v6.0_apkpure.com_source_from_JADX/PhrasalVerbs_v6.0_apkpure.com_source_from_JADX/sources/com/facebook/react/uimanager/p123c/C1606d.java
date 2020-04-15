package com.facebook.react.uimanager.p123c;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import com.facebook.react.uimanager.C1685k;

/* renamed from: com.facebook.react.uimanager.c.d */
abstract class C1606d extends C1603a {
    C1606d() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5832a() {
        return this.f4839e > 0 && this.f4838d != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Animation mo5833b(View view, int i, int i2, int i3, int i4) {
        C1604b bVar = this.f4838d;
        if (bVar != null) {
            int i5 = C1605c.f4845a[bVar.ordinal()];
            float f = 0.0f;
            if (i5 == 1) {
                float alpha = mo5835c() ? view.getAlpha() : 0.0f;
                if (!mo5835c()) {
                    f = view.getAlpha();
                }
                return new C1618p(view, alpha, f);
            } else if (i5 == 2) {
                float f2 = mo5835c() ? 1.0f : 0.0f;
                float f3 = mo5835c() ? 0.0f : 1.0f;
                ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
                return scaleAnimation;
            } else if (i5 == 3) {
                ScaleAnimation scaleAnimation2 = new ScaleAnimation(mo5835c() ? 1.0f : 0.0f, mo5835c() ? 0.0f : 1.0f, 1.0f, 1.0f, 1, 0.5f, 1, 0.0f);
                return scaleAnimation2;
            } else if (i5 == 4) {
                ScaleAnimation scaleAnimation3 = new ScaleAnimation(1.0f, 1.0f, mo5835c() ? 1.0f : 0.0f, mo5835c() ? 0.0f : 1.0f, 1, 0.0f, 1, 0.5f);
                return scaleAnimation3;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Missing animation for property : ");
                sb.append(this.f4838d);
                throw new C1685k(sb.toString());
            }
        } else {
            throw new C1685k("Missing animated property from animation config");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract boolean mo5835c();
}
