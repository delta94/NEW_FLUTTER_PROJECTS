package p032c.p033a.p074i.p079c;

import android.graphics.Bitmap;
import p032c.p033a.p038c.p046h.C0746d;

/* renamed from: c.a.i.c.g */
public class C0901g implements C0746d<Bitmap> {

    /* renamed from: a */
    private static C0901g f3156a;

    private C0901g() {
    }

    /* renamed from: a */
    public static C0901g m3990a() {
        if (f3156a == null) {
            f3156a = new C0901g();
        }
        return f3156a;
    }

    /* renamed from: a */
    public void mo3486a(Bitmap bitmap) {
        bitmap.recycle();
    }
}
