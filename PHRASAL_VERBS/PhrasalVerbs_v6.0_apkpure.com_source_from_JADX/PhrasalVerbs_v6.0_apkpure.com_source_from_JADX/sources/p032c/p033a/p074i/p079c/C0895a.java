package p032c.p033a.p074i.p079c;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.facebook.imagepipeline.memory.C1273e;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import p032c.p033a.p038c.p046h.C0744b;
import p032c.p033a.p093j.C1129b;

@TargetApi(21)
/* renamed from: c.a.i.c.a */
public class C0895a extends C0900f {

    /* renamed from: a */
    private final C1273e f3146a;

    public C0895a(C1273e eVar) {
        this.f3146a = eVar;
    }

    /* renamed from: b */
    public C0744b<Bitmap> mo3969b(int i, int i2, Config config) {
        Bitmap bitmap = (Bitmap) this.f3146a.get(C1129b.m5027a(i, i2, config));
        Bitmaps.m5600a(bitmap, i, i2, config);
        return C0744b.m3335a(bitmap, this.f3146a);
    }
}
