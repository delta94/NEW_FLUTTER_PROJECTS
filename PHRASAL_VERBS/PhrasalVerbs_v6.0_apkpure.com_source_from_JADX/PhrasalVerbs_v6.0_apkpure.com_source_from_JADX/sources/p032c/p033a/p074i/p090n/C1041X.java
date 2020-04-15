package p032c.p033a.p074i.p090n;

import android.content.ContentResolver;
import java.util.concurrent.Executor;
import p032c.p033a.p038c.p046h.C0744b;
import p032c.p033a.p074i.p086j.C0986b;
import p032c.p033a.p074i.p091o.C1114c;

/* renamed from: c.a.i.n.X */
public class C1041X implements C1082na<C0744b<C0986b>> {

    /* renamed from: a */
    private final Executor f3569a;

    /* renamed from: b */
    private final ContentResolver f3570b;

    public C1041X(Executor executor, ContentResolver contentResolver) {
        this.f3569a = executor;
        this.f3570b = contentResolver;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m4639b(C1114c cVar) {
        return (cVar.mo4364h() > 96 || cVar.mo4363g() > 96) ? 1 : 3;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0058 A[SYNTHETIC, Splitter:B:14:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String m4640c(p032c.p033a.p074i.p091o.C1114c r12) {
        /*
            r11 = this;
            android.net.Uri r0 = r12.mo4372o()
            boolean r1 = p032c.p033a.p038c.p049k.C0758f.m3379g(r0)
            if (r1 == 0) goto L_0x0013
            java.io.File r12 = r12.mo4371n()
            java.lang.String r12 = r12.getPath()
            return r12
        L_0x0013:
            boolean r12 = p032c.p033a.p038c.p049k.C0758f.m3378f(r0)
            r1 = 0
            if (r12 == 0) goto L_0x0078
            int r12 = android.os.Build.VERSION.SDK_INT
            r2 = 19
            r3 = 0
            r4 = 1
            if (r12 < r2) goto L_0x0046
            java.lang.String r12 = r0.getAuthority()
            java.lang.String r2 = "com.android.providers.media.documents"
            boolean r12 = r2.equals(r12)
            if (r12 == 0) goto L_0x0046
            java.lang.String r12 = android.provider.DocumentsContract.getDocumentId(r0)
            android.net.Uri r0 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            java.lang.String[] r2 = new java.lang.String[r4]
            java.lang.String r5 = ":"
            java.lang.String[] r12 = r12.split(r5)
            r12 = r12[r4]
            r2[r3] = r12
            java.lang.String r12 = "_id=?"
            r8 = r12
            r6 = r0
            r9 = r2
            goto L_0x0049
        L_0x0046:
            r6 = r0
            r8 = r1
            r9 = r8
        L_0x0049:
            android.content.ContentResolver r5 = r11.f3570b
            java.lang.String[] r7 = new java.lang.String[r4]
            java.lang.String r12 = "_data"
            r7[r3] = r12
            r10 = 0
            android.database.Cursor r0 = r5.query(r6, r7, r8, r9, r10)
            if (r0 == 0) goto L_0x0073
            boolean r2 = r0.moveToFirst()     // Catch:{ all -> 0x006c }
            if (r2 == 0) goto L_0x0073
            int r12 = r0.getColumnIndexOrThrow(r12)     // Catch:{ all -> 0x006c }
            java.lang.String r12 = r0.getString(r12)     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x006b
            r0.close()
        L_0x006b:
            return r12
        L_0x006c:
            r12 = move-exception
            if (r0 == 0) goto L_0x0072
            r0.close()
        L_0x0072:
            throw r12
        L_0x0073:
            if (r0 == 0) goto L_0x0078
            r0.close()
        L_0x0078:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p032c.p033a.p074i.p090n.C1041X.m4640c(c.a.i.o.c):java.lang.String");
    }

    /* renamed from: a */
    public void mo4248a(C1081n<C0744b<C0986b>> nVar, C1084oa oaVar) {
        C1091qa e = oaVar.mo4324e();
        String id = oaVar.getId();
        C1081n<C0744b<C0986b>> nVar2 = nVar;
        C1091qa qaVar = e;
        C1039V v = new C1039V(this, nVar2, qaVar, "VideoThumbnailProducer", id, e, id, oaVar.mo4322c());
        oaVar.mo4319a(new C1040W(this, v));
        this.f3569a.execute(v);
    }
}
