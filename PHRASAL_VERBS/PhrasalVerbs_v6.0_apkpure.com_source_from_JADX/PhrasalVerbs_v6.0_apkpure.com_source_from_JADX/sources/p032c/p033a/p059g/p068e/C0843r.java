package p032c.p033a.p059g.p068e;

import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;

/* renamed from: c.a.g.e.r */
public class C0843r extends C0842q {
    public C0843r(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
    }

    public void draw(Canvas canvas) {
        if (!mo3807a()) {
            super.draw(canvas);
            return;
        }
        mo3820c();
        mo3819b();
        canvas.clipPath(this.f2992e);
        super.draw(canvas);
    }
}
