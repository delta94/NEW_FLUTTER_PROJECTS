package p032c.p033a.p074i.p088l;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.graphics.Rect;
import android.os.Build.VERSION;
import com.facebook.imagepipeline.memory.C1271c;
import com.facebook.imagepipeline.memory.C1272d;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import java.util.Locale;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p042d.C0726r;
import p032c.p033a.p038c.p045g.C0737g;
import p032c.p033a.p038c.p046h.C0744b;
import p032c.p033a.p074i.p081e.C0944g;
import p032c.p033a.p074i.p086j.C0988d;
import p032c.p033a.p093j.C1129b;

/* renamed from: c.a.i.l.b */
abstract class C0996b implements C0999e {

    /* renamed from: a */
    protected static final byte[] f3465a = {-1, -39};

    /* renamed from: b */
    private final C1271c f3466b = C1272d.m5487a();

    C0996b() {
    }

    /* renamed from: a */
    private static Options m4474a(int i, Config config) {
        Options options = new Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        if (VERSION.SDK_INT >= 11) {
            options.inMutable = true;
        }
        return options;
    }

    /* renamed from: a */
    protected static boolean m4475a(C0744b<C0737g> bVar, int i) {
        C0737g gVar = (C0737g) bVar.mo3520n();
        return i >= 2 && gVar.mo3494a(i + -2) == -1 && gVar.mo3494a(i - 1) == -39;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract Bitmap mo4242a(C0744b<C0737g> bVar, int i, Options options);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract Bitmap mo4243a(C0744b<C0737g> bVar, Options options);

    /* renamed from: a */
    public C0744b<Bitmap> mo4244a(Bitmap bitmap) {
        try {
            Bitmaps.m5599a(bitmap);
            if (this.f3466b.mo4736b(bitmap)) {
                return C0744b.m3335a(bitmap, this.f3466b.mo4738d());
            }
            int a = C1129b.m5029a(bitmap);
            bitmap.recycle();
            throw new C0944g(String.format(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", new Object[]{Integer.valueOf(a), Integer.valueOf(this.f3466b.mo4733a()), Long.valueOf(this.f3466b.mo4739e()), Integer.valueOf(this.f3466b.mo4735b()), Integer.valueOf(this.f3466b.mo4737c())}));
        } catch (Exception e) {
            bitmap.recycle();
            C0726r.m3253a(e);
            throw null;
        }
    }

    /* renamed from: a */
    public C0744b<Bitmap> mo4239a(C0988d dVar, Config config, Rect rect) {
        Options a = m4474a(dVar.mo4222u(), config);
        C0744b n = dVar.mo4215n();
        C0718j.m3240a(n);
        try {
            return mo4244a(mo4243a(n, a));
        } finally {
            C0744b.m3336b(n);
        }
    }

    /* renamed from: a */
    public C0744b<Bitmap> mo4240a(C0988d dVar, Config config, Rect rect, int i) {
        Options a = m4474a(dVar.mo4222u(), config);
        C0744b n = dVar.mo4215n();
        C0718j.m3240a(n);
        try {
            return mo4244a(mo4242a(n, i, a));
        } finally {
            C0744b.m3336b(n);
        }
    }
}
