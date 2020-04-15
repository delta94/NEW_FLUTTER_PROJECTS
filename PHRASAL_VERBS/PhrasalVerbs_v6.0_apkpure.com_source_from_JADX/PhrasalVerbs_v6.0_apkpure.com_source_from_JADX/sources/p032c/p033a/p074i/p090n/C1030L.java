package p032c.p033a.p074i.p090n;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p038c.p045g.C0739h;
import p032c.p033a.p038c.p049k.C0758f;
import p032c.p033a.p074i.p081e.C0942e;
import p032c.p033a.p074i.p086j.C0988d;
import p032c.p033a.p074i.p091o.C1114c;
import p032c.p033a.p093j.C1130c;

/* renamed from: c.a.i.n.L */
public class C1030L extends C1036S implements C1019Ha<C0988d> {

    /* renamed from: c */
    private static final Class<?> f3541c = C1030L.class;

    /* renamed from: d */
    private static final String[] f3542d;

    /* renamed from: e */
    private static final String[] f3543e;

    /* renamed from: f */
    private static final Rect f3544f = new Rect(0, 0, 512, 384);

    /* renamed from: g */
    private static final Rect f3545g = new Rect(0, 0, 96, 96);

    /* renamed from: h */
    private final ContentResolver f3546h;

    static {
        String str = "_data";
        f3542d = new String[]{"_id", str};
        f3543e = new String[]{str};
    }

    public C1030L(Executor executor, C0739h hVar, ContentResolver contentResolver) {
        super(executor, hVar);
        this.f3546h = contentResolver;
    }

    /* renamed from: a */
    private static int m4588a(String str) {
        if (str == null) {
            return -1;
        }
        return (int) new File(str).length();
    }

    /* renamed from: a */
    private C0988d m4589a(Uri uri, C0942e eVar) {
        Cursor query = this.f3546h.query(uri, f3542d, null, null, null);
        if (query == null) {
            return null;
        }
        try {
            if (query.getCount() == 0) {
                return null;
            }
            query.moveToFirst();
            String string = query.getString(query.getColumnIndex("_data"));
            if (eVar != null) {
                C0988d a = m4590a(eVar, query.getInt(query.getColumnIndex("_id")));
                if (a != null) {
                    a.mo4211f(m4592b(string));
                    query.close();
                    return a;
                }
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0056  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p032c.p033a.p074i.p086j.C0988d m4590a(p032c.p033a.p074i.p081e.C0942e r5, int r6) {
        /*
            r4 = this;
            int r5 = m4591b(r5)
            r0 = 0
            if (r5 != 0) goto L_0x0008
            return r0
        L_0x0008:
            android.content.ContentResolver r1 = r4.f3546h     // Catch:{ all -> 0x0052 }
            long r2 = (long) r6     // Catch:{ all -> 0x0052 }
            java.lang.String[] r6 = f3543e     // Catch:{ all -> 0x0052 }
            android.database.Cursor r5 = android.provider.MediaStore.Images.Thumbnails.queryMiniThumbnail(r1, r2, r5, r6)     // Catch:{ all -> 0x0052 }
            if (r5 != 0) goto L_0x0019
            if (r5 == 0) goto L_0x0018
            r5.close()
        L_0x0018:
            return r0
        L_0x0019:
            r5.moveToFirst()     // Catch:{ all -> 0x0050 }
            int r6 = r5.getCount()     // Catch:{ all -> 0x0050 }
            if (r6 <= 0) goto L_0x004a
            java.lang.String r6 = "_data"
            int r6 = r5.getColumnIndex(r6)     // Catch:{ all -> 0x0050 }
            java.lang.String r6 = r5.getString(r6)     // Catch:{ all -> 0x0050 }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0050 }
            r1.<init>(r6)     // Catch:{ all -> 0x0050 }
            boolean r1 = r1.exists()     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x004a
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ all -> 0x0050 }
            r0.<init>(r6)     // Catch:{ all -> 0x0050 }
            int r6 = m4588a(r6)     // Catch:{ all -> 0x0050 }
            c.a.i.j.d r6 = r4.mo4288b(r0, r6)     // Catch:{ all -> 0x0050 }
            if (r5 == 0) goto L_0x0049
            r5.close()
        L_0x0049:
            return r6
        L_0x004a:
            if (r5 == 0) goto L_0x004f
            r5.close()
        L_0x004f:
            return r0
        L_0x0050:
            r6 = move-exception
            goto L_0x0054
        L_0x0052:
            r6 = move-exception
            r5 = r0
        L_0x0054:
            if (r5 == 0) goto L_0x0059
            r5.close()
        L_0x0059:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p032c.p033a.p074i.p090n.C1030L.m4590a(c.a.i.e.e, int):c.a.i.j.d");
    }

    /* renamed from: b */
    private static int m4591b(C0942e eVar) {
        if (C1024Ia.m4560a(f3545g.width(), f3545g.height(), eVar)) {
            return 3;
        }
        return C1024Ia.m4560a(f3544f.width(), f3544f.height(), eVar) ? 1 : 0;
    }

    /* renamed from: b */
    private static int m4592b(String str) {
        if (str != null) {
            try {
                return C1130c.m5031a(new ExifInterface(str).getAttributeInt("Orientation", 1));
            } catch (IOException e) {
                C0727a.m3265a(f3541c, (Throwable) e, "Unable to retrieve thumbnail rotation for %s", str);
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0988d mo4276a(C1114c cVar) {
        Uri o = cVar.mo4372o();
        if (C0758f.m3376d(o)) {
            C0988d a = m4589a(o, cVar.mo4369l());
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo4277a() {
        return "LocalContentUriThumbnailFetchProducer";
    }

    /* renamed from: a */
    public boolean mo4270a(C0942e eVar) {
        return C1024Ia.m4560a(f3544f.width(), f3544f.height(), eVar);
    }
}
