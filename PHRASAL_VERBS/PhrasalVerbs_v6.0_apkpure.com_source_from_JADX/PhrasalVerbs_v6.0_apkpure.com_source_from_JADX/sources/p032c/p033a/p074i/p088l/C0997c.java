package p032c.p033a.p074i.p088l;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.graphics.Rect;
import android.os.MemoryFile;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import p032c.p033a.p038c.p042d.C0707a;
import p032c.p033a.p038c.p042d.C0708b;
import p032c.p033a.p038c.p042d.C0726r;
import p032c.p033a.p038c.p045g.C0737g;
import p032c.p033a.p038c.p045g.C0740i;
import p032c.p033a.p038c.p046h.C0744b;
import p032c.p033a.p038c.p048j.C0751a;
import p032c.p033a.p074i.p086j.C0988d;

/* renamed from: c.a.i.l.c */
public class C0997c extends C0996b {

    /* renamed from: c */
    private static Method f3467c;

    /* renamed from: a */
    private static MemoryFile m4481a(C0744b<C0737g> bVar, int i, byte[] bArr) {
        Closeable closeable;
        InputStream inputStream;
        InputStream inputStream2 = null;
        MemoryFile memoryFile = new MemoryFile(null, (bArr == null ? 0 : bArr.length) + i);
        memoryFile.allowPurging(false);
        try {
            inputStream = new C0740i((C0737g) bVar.mo3520n());
            try {
                C0751a aVar = new C0751a(inputStream, i);
                try {
                    OutputStream outputStream = memoryFile.getOutputStream();
                    C0707a.m3221a(aVar, outputStream);
                    if (bArr != null) {
                        memoryFile.writeBytes(bArr, 0, i, bArr.length);
                    }
                    C0744b.m3336b(bVar);
                    C0708b.m3223a(inputStream);
                    C0708b.m3223a(aVar);
                    C0708b.m3222a(outputStream, true);
                    return memoryFile;
                } catch (Throwable th) {
                    th = th;
                    closeable = null;
                    inputStream2 = aVar;
                    C0744b.m3336b(bVar);
                    C0708b.m3223a(inputStream);
                    C0708b.m3223a(inputStream2);
                    C0708b.m3222a(closeable, true);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = null;
                C0744b.m3336b(bVar);
                C0708b.m3223a(inputStream);
                C0708b.m3223a(inputStream2);
                C0708b.m3222a(closeable, true);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable = null;
            inputStream = null;
            C0744b.m3336b(bVar);
            C0708b.m3223a(inputStream);
            C0708b.m3223a(inputStream2);
            C0708b.m3222a(closeable, true);
            throw th;
        }
    }

    /* renamed from: a */
    private FileDescriptor m4482a(MemoryFile memoryFile) {
        try {
            return (FileDescriptor) m4483a().invoke(memoryFile, new Object[0]);
        } catch (Exception e) {
            C0726r.m3253a(e);
            throw null;
        }
    }

    /* renamed from: a */
    private synchronized Method m4483a() {
        if (f3467c == null) {
            try {
                f3467c = MemoryFile.class.getDeclaredMethod("getFileDescriptor", new Class[0]);
            } catch (Exception e) {
                C0726r.m3253a(e);
                throw null;
            }
        }
        return f3467c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap mo4242a(C0744b<C0737g> bVar, int i, Options options) {
        return mo4245a(bVar, i, C0996b.m4475a(bVar, i) ? null : C0996b.f3465a, options);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap mo4245a(p032c.p033a.p038c.p046h.C0744b<p032c.p033a.p038c.p045g.C0737g> r2, int r3, byte[] r4, android.graphics.BitmapFactory.Options r5) {
        /*
            r1 = this;
            r0 = 0
            android.os.MemoryFile r2 = m4481a(r2, r3, r4)     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
            java.io.FileDescriptor r3 = r1.m4482a(r2)     // Catch:{ IOException -> 0x001e }
            c.a.c.l.b r4 = p032c.p033a.p038c.p050l.C0762c.f2652d     // Catch:{ IOException -> 0x001e }
            android.graphics.Bitmap r3 = r4.mo3544a(r3, r0, r5)     // Catch:{ IOException -> 0x001e }
            java.lang.String r4 = "BitmapFactory returned null"
            p032c.p033a.p038c.p042d.C0718j.m3241a(r3, r4)     // Catch:{ IOException -> 0x001e }
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch:{ IOException -> 0x001e }
            if (r2 == 0) goto L_0x001b
            r2.close()
        L_0x001b:
            return r3
        L_0x001c:
            r3 = move-exception
            goto L_0x0029
        L_0x001e:
            r3 = move-exception
            goto L_0x0025
        L_0x0020:
            r3 = move-exception
            r2 = r0
            goto L_0x0029
        L_0x0023:
            r3 = move-exception
            r2 = r0
        L_0x0025:
            p032c.p033a.p038c.p042d.C0726r.m3253a(r3)     // Catch:{ all -> 0x001c }
            throw r0
        L_0x0029:
            if (r2 == 0) goto L_0x002e
            r2.close()
        L_0x002e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p032c.p033a.p074i.p088l.C0997c.mo4245a(c.a.c.h.b, int, byte[], android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap mo4243a(C0744b<C0737g> bVar, Options options) {
        return mo4245a(bVar, ((C0737g) bVar.mo3520n()).size(), (byte[]) null, options);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ C0744b mo4244a(Bitmap bitmap) {
        return super.mo4244a(bitmap);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ C0744b mo4239a(C0988d dVar, Config config, Rect rect) {
        return super.mo4239a(dVar, config, rect);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ C0744b mo4240a(C0988d dVar, Config config, Rect rect, int i) {
        return super.mo4240a(dVar, config, rect, i);
    }
}
