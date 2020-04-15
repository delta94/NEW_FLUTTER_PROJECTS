package p032c.p033a.p074i.p088l;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Rect;
import android.support.p029v4.util.C0336m;
import com.facebook.imagepipeline.memory.C1273e;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p046h.C0744b;
import p032c.p033a.p038c.p048j.C0751a;
import p032c.p033a.p038c.p048j.C0752b;
import p032c.p033a.p074i.p086j.C0988d;

@TargetApi(21)
/* renamed from: c.a.i.l.a */
public class C0995a implements C0999e {

    /* renamed from: a */
    private static final Class<?> f3461a = C0995a.class;

    /* renamed from: b */
    private static final byte[] f3462b = {-1, -39};

    /* renamed from: c */
    private final C1273e f3463c;

    /* renamed from: d */
    final C0336m<ByteBuffer> f3464d;

    public C0995a(C1273e eVar, int i, C0336m mVar) {
        this.f3463c = eVar;
        this.f3464d = mVar;
        for (int i2 = 0; i2 < i; i2++) {
            this.f3464d.mo1312a(ByteBuffer.allocate(16384));
        }
    }

    /* renamed from: a */
    private static Options m4470a(C0988d dVar, Config config) {
        Options options = new Options();
        options.inSampleSize = dVar.mo4222u();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(dVar.mo4220s(), null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            throw new IllegalArgumentException();
        }
        options.inJustDecodeBounds = false;
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inMutable = true;
        return options;
    }

    /* renamed from: a */
    public C0744b<Bitmap> mo4239a(C0988d dVar, Config config, Rect rect) {
        Options a = m4470a(dVar, config);
        boolean z = a.inPreferredConfig != Config.ARGB_8888;
        try {
            return mo4241a(dVar.mo4220s(), a, rect);
        } catch (RuntimeException e) {
            if (z) {
                return mo4239a(dVar, Config.ARGB_8888, rect);
            }
            throw e;
        }
    }

    /* renamed from: a */
    public C0744b<Bitmap> mo4240a(C0988d dVar, Config config, Rect rect, int i) {
        boolean c = dVar.mo4207c(i);
        Options a = m4470a(dVar, config);
        InputStream s = dVar.mo4220s();
        C0718j.m3240a(s);
        if (dVar.mo4223v() > i) {
            s = new C0751a(s, i);
        }
        InputStream bVar = !c ? new C0752b(s, f3462b) : s;
        boolean z = a.inPreferredConfig != Config.ARGB_8888;
        try {
            return mo4241a(bVar, a, rect);
        } catch (RuntimeException e) {
            if (z) {
                return mo4239a(dVar, Config.ARGB_8888, rect);
            }
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        p032c.p033a.p038c.p043e.C0727a.m3264a(f3461a, "Could not decode region %s, decoding full bitmap instead.", r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0060, code lost:
        if (r0 != null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r0.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0069, code lost:
        r0.recycle();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0054 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00b7 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0069 A[Catch:{ IllegalArgumentException -> 0x0099, RuntimeException -> 0x0092, all -> 0x0090, IOException -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070 A[Catch:{ IllegalArgumentException -> 0x0099, RuntimeException -> 0x0092, all -> 0x0090, IOException -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0082  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p032c.p033a.p038c.p046h.C0744b<android.graphics.Bitmap> mo4241a(java.io.InputStream r9, android.graphics.BitmapFactory.Options r10, android.graphics.Rect r11) {
        /*
            r8 = this;
            p032c.p033a.p038c.p042d.C0718j.m3240a(r9)
            int r0 = r10.outWidth
            int r1 = r10.outHeight
            if (r11 == 0) goto L_0x0011
            int r0 = r11.width()
            int r1 = r11.height()
        L_0x0011:
            android.graphics.Bitmap$Config r2 = r10.inPreferredConfig
            int r2 = p032c.p033a.p093j.C1129b.m5027a(r0, r1, r2)
            com.facebook.imagepipeline.memory.e r3 = r8.f3463c
            java.lang.Object r2 = r3.get(r2)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto L_0x00be
            r10.inBitmap = r2
            android.support.v4.util.m<java.nio.ByteBuffer> r3 = r8.f3464d
            java.lang.Object r3 = r3.mo1311a()
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            if (r3 != 0) goto L_0x0033
            r3 = 16384(0x4000, float:2.2959E-41)
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r3)
        L_0x0033:
            byte[] r4 = r3.array()     // Catch:{ IllegalArgumentException -> 0x0099, RuntimeException -> 0x0092 }
            r10.inTempStorage = r4     // Catch:{ IllegalArgumentException -> 0x0099, RuntimeException -> 0x0092 }
            r4 = 0
            if (r11 == 0) goto L_0x006d
            r5 = 1
            android.graphics.Bitmap$Config r6 = r10.inPreferredConfig     // Catch:{ IOException -> 0x0053, all -> 0x0050 }
            r2.reconfigure(r0, r1, r6)     // Catch:{ IOException -> 0x0053, all -> 0x0050 }
            android.graphics.BitmapRegionDecoder r0 = android.graphics.BitmapRegionDecoder.newInstance(r9, r5)     // Catch:{ IOException -> 0x0053, all -> 0x0050 }
            android.graphics.Bitmap r11 = r0.decodeRegion(r11, r10)     // Catch:{ IOException -> 0x0054 }
            if (r0 == 0) goto L_0x006e
            r0.recycle()     // Catch:{ IllegalArgumentException -> 0x0099, RuntimeException -> 0x0092 }
            goto L_0x006e
        L_0x0050:
            r10 = move-exception
            r0 = r4
            goto L_0x0067
        L_0x0053:
            r0 = r4
        L_0x0054:
            java.lang.Class<?> r1 = f3461a     // Catch:{ all -> 0x0066 }
            java.lang.String r6 = "Could not decode region %s, decoding full bitmap instead."
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0066 }
            r7 = 0
            r5[r7] = r11     // Catch:{ all -> 0x0066 }
            p032c.p033a.p038c.p043e.C0727a.m3264a(r1, r6, r5)     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x006d
            r0.recycle()     // Catch:{ IllegalArgumentException -> 0x0099, RuntimeException -> 0x0092 }
            goto L_0x006d
        L_0x0066:
            r10 = move-exception
        L_0x0067:
            if (r0 == 0) goto L_0x006c
            r0.recycle()     // Catch:{ IllegalArgumentException -> 0x0099, RuntimeException -> 0x0092 }
        L_0x006c:
            throw r10     // Catch:{ IllegalArgumentException -> 0x0099, RuntimeException -> 0x0092 }
        L_0x006d:
            r11 = r4
        L_0x006e:
            if (r11 != 0) goto L_0x0074
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeStream(r9, r4, r10)     // Catch:{ IllegalArgumentException -> 0x0099, RuntimeException -> 0x0092 }
        L_0x0074:
            android.support.v4.util.m<java.nio.ByteBuffer> r9 = r8.f3464d
            r9.mo1312a(r3)
            if (r2 != r11) goto L_0x0082
            com.facebook.imagepipeline.memory.e r9 = r8.f3463c
            c.a.c.h.b r9 = p032c.p033a.p038c.p046h.C0744b.m3335a(r11, r9)
            return r9
        L_0x0082:
            com.facebook.imagepipeline.memory.e r9 = r8.f3463c
            r9.mo3486a(r2)
            r11.recycle()
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        L_0x0090:
            r9 = move-exception
            goto L_0x00b8
        L_0x0092:
            r9 = move-exception
            com.facebook.imagepipeline.memory.e r10 = r8.f3463c     // Catch:{ all -> 0x0090 }
            r10.mo3486a(r2)     // Catch:{ all -> 0x0090 }
            throw r9     // Catch:{ all -> 0x0090 }
        L_0x0099:
            r10 = move-exception
            com.facebook.imagepipeline.memory.e r11 = r8.f3463c     // Catch:{ all -> 0x0090 }
            r11.mo3486a(r2)     // Catch:{ all -> 0x0090 }
            r9.reset()     // Catch:{ IOException -> 0x00b7 }
            android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeStream(r9)     // Catch:{ IOException -> 0x00b7 }
            if (r9 == 0) goto L_0x00b6
            c.a.i.c.g r11 = p032c.p033a.p074i.p079c.C0901g.m3990a()     // Catch:{ IOException -> 0x00b7 }
            c.a.c.h.b r9 = p032c.p033a.p038c.p046h.C0744b.m3335a(r9, r11)     // Catch:{ IOException -> 0x00b7 }
            android.support.v4.util.m<java.nio.ByteBuffer> r10 = r8.f3464d
            r10.mo1312a(r3)
            return r9
        L_0x00b6:
            throw r10     // Catch:{ IOException -> 0x00b7 }
        L_0x00b7:
            throw r10     // Catch:{ all -> 0x0090 }
        L_0x00b8:
            android.support.v4.util.m<java.nio.ByteBuffer> r10 = r8.f3464d
            r10.mo1312a(r3)
            throw r9
        L_0x00be:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r10 = "BitmapPool.get returned null"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p032c.p033a.p074i.p088l.C0995a.mo4241a(java.io.InputStream, android.graphics.BitmapFactory$Options, android.graphics.Rect):c.a.c.h.b");
    }
}
