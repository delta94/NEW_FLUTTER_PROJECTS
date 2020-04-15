package p032c.p033a.p059g.p068e;

import android.annotation.SuppressLint;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: c.a.g.e.f */
public class C0830f {

    /* renamed from: a */
    private int f2921a = -1;

    /* renamed from: b */
    private boolean f2922b = false;

    /* renamed from: c */
    private ColorFilter f2923c = null;

    /* renamed from: d */
    private int f2924d = -1;

    /* renamed from: e */
    private int f2925e = -1;

    /* renamed from: a */
    public void mo3763a(int i) {
        this.f2921a = i;
    }

    /* renamed from: a */
    public void mo3764a(ColorFilter colorFilter) {
        this.f2923c = colorFilter;
        this.f2922b = true;
    }

    @SuppressLint({"Range"})
    /* renamed from: a */
    public void mo3765a(Drawable drawable) {
        if (drawable != null) {
            int i = this.f2921a;
            if (i != -1) {
                drawable.setAlpha(i);
            }
            if (this.f2922b) {
                drawable.setColorFilter(this.f2923c);
            }
            int i2 = this.f2924d;
            boolean z = true;
            if (i2 != -1) {
                drawable.setDither(i2 != 0);
            }
            int i3 = this.f2925e;
            if (i3 != -1) {
                if (i3 == 0) {
                    z = false;
                }
                drawable.setFilterBitmap(z);
            }
        }
    }

    /* renamed from: a */
    public void mo3766a(boolean z) {
        this.f2924d = z ? 1 : 0;
    }

    /* renamed from: b */
    public void mo3767b(boolean z) {
        this.f2925e = z ? 1 : 0;
    }
}
