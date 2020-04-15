package p032c.p033a.p074i.p090n;

import android.content.ContentResolver;
import android.media.ExifInterface;
import android.net.Uri;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p038c.p045g.C0737g;
import p032c.p033a.p038c.p045g.C0739h;
import p032c.p033a.p038c.p045g.C0740i;
import p032c.p033a.p038c.p046h.C0744b;
import p032c.p033a.p038c.p049k.C0758f;
import p032c.p033a.p073h.C0882b;
import p032c.p033a.p074i.p081e.C0942e;
import p032c.p033a.p074i.p086j.C0988d;
import p032c.p033a.p093j.C1129b;
import p032c.p033a.p093j.C1130c;

/* renamed from: c.a.i.n.O */
public class C1033O implements C1019Ha<C0988d> {

    /* renamed from: a */
    private final Executor f3551a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C0739h f3552b;

    /* renamed from: c */
    private final ContentResolver f3553c;

    public C1033O(Executor executor, C0739h hVar, ContentResolver contentResolver) {
        this.f3551a = executor;
        this.f3552b = hVar;
        this.f3553c = contentResolver;
    }

    /* renamed from: a */
    private int m4603a(ExifInterface exifInterface) {
        return C1130c.m5031a(Integer.parseInt(exifInterface.getAttribute("Orientation")));
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* renamed from: a */
    public C0988d m4605a(C0737g gVar, ExifInterface exifInterface) {
        Pair a = C1129b.m5030a((InputStream) new C0740i(gVar));
        int a2 = m4603a(exifInterface);
        int i = -1;
        int intValue = a != null ? ((Integer) a.first).intValue() : -1;
        if (a != null) {
            i = ((Integer) a.second).intValue();
        }
        C0744b a3 = C0744b.m3334a(gVar);
        try {
            C0988d dVar = new C0988d(a3);
            C0744b.m3336b(a3);
            dVar.mo4203a(C0882b.f3116a);
            dVar.mo4211f(a2);
            dVar.mo4213h(intValue);
            dVar.mo4210e(i);
            return dVar;
        } catch (Throwable th) {
            C0744b.m3336b(a3);
            throw th;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public ExifInterface mo4284a(Uri uri) {
        String a = C0758f.m3372a(this.f3553c, uri);
        try {
            if (mo4285a(a)) {
                return new ExifInterface(a);
            }
        } catch (IOException unused) {
        } catch (StackOverflowError unused2) {
            C0727a.m3258a(C1033O.class, "StackOverflowError in ExifInterface constructor");
        }
        return null;
    }

    /* renamed from: a */
    public void mo4248a(C1081n<C0988d> nVar, C1084oa oaVar) {
        C1081n<C0988d> nVar2 = nVar;
        C1031M m = new C1031M(this, nVar2, oaVar.mo4324e(), "LocalExifThumbnailProducer", oaVar.getId(), oaVar.mo4322c());
        oaVar.mo4319a(new C1032N(this, m));
        this.f3551a.execute(m);
    }

    /* renamed from: a */
    public boolean mo4270a(C0942e eVar) {
        return C1024Ia.m4560a(512, 512, eVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo4285a(String str) {
        boolean z = false;
        if (str == null) {
            return false;
        }
        File file = new File(str);
        if (file.exists() && file.canRead()) {
            z = true;
        }
        return z;
    }
}
