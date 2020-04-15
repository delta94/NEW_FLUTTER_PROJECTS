package p032c.p033a.p074i.p091o;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import p032c.p033a.p035b.p036a.C0657d;
import p032c.p033a.p038c.p046h.C0744b;
import p032c.p033a.p074i.p079c.C0900f;

/* renamed from: c.a.i.o.a */
public abstract class C1112a implements C1119e {

    /* renamed from: a */
    public static final Config f3738a = Config.ARGB_8888;

    /* renamed from: b */
    private static void m4960b(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap.getConfig() == bitmap2.getConfig()) {
            Bitmaps.m5601a(bitmap, bitmap2);
        } else {
            new Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, null);
        }
    }

    /* renamed from: a */
    public C0657d mo4246a() {
        return null;
    }

    /* renamed from: a */
    public C0744b<Bitmap> mo4353a(Bitmap bitmap, C0900f fVar) {
        Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = f3738a;
        }
        C0744b b = fVar.mo3969b(width, height, config);
        try {
            mo4354a((Bitmap) b.mo3520n(), bitmap);
            return C0744b.m3333a(b);
        } finally {
            C0744b.m3336b(b);
        }
    }

    /* renamed from: a */
    public void mo4247a(Bitmap bitmap) {
    }

    /* renamed from: a */
    public void mo4354a(Bitmap bitmap, Bitmap bitmap2) {
        m4960b(bitmap, bitmap2);
        mo4247a(bitmap);
    }

    public String getName() {
        return "Unknown postprocessor";
    }
}
