package p032c.p033a.p059g.p069f;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import p032c.p033a.p059g.p068e.C0833i;
import p032c.p033a.p059g.p068e.C0860w;
import p032c.p033a.p059g.p068e.C0861x;

/* renamed from: c.a.g.f.c */
public class C0864c extends C0833i implements C0860w {

    /* renamed from: e */
    Drawable f3066e = null;

    /* renamed from: f */
    private C0861x f3067f;

    public C0864c(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: a */
    public void mo3845a(C0861x xVar) {
        this.f3067f = xVar;
    }

    /* renamed from: d */
    public void mo3882d(Drawable drawable) {
        this.f3066e = drawable;
        invalidateSelf();
    }

    @SuppressLint({"WrongCall"})
    public void draw(Canvas canvas) {
        if (isVisible()) {
            C0861x xVar = this.f3067f;
            if (xVar != null) {
                xVar.onDraw();
            }
            super.draw(canvas);
            Drawable drawable = this.f3066e;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.f3066e.draw(canvas);
            }
        }
    }

    public int getIntrinsicHeight() {
        return -1;
    }

    public int getIntrinsicWidth() {
        return -1;
    }

    public boolean setVisible(boolean z, boolean z2) {
        C0861x xVar = this.f3067f;
        if (xVar != null) {
            xVar.mo3846a(z);
        }
        return super.setVisible(z, z2);
    }
}
