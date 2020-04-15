package p032c.p033a.p074i.p088l;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Rect;
import com.facebook.imagepipeline.memory.C1280l;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p045g.C0737g;
import p032c.p033a.p038c.p046h.C0744b;
import p032c.p033a.p074i.p086j.C0988d;

@TargetApi(19)
/* renamed from: c.a.i.l.d */
public class C0998d extends C0996b {

    /* renamed from: c */
    private final C1280l f3468c;

    public C0998d(C1280l lVar) {
        this.f3468c = lVar;
    }

    /* renamed from: a */
    private static void m4490a(byte[] bArr, int i) {
        bArr[i] = -1;
        bArr[i + 1] = -39;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap mo4242a(C0744b<C0737g> bVar, int i, Options options) {
        byte[] bArr = C0996b.m4475a(bVar, i) ? null : C0996b.f3465a;
        C0737g gVar = (C0737g) bVar.mo3520n();
        C0718j.m3243a(i <= gVar.size());
        int i2 = i + 2;
        C0744b a = this.f3468c.mo4752a(i2);
        try {
            byte[] bArr2 = (byte[]) a.mo3520n();
            gVar.mo3495a(0, bArr2, 0, i);
            if (bArr != null) {
                m4490a(bArr2, i);
                i = i2;
            }
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr2, 0, i, options);
            C0718j.m3241a(decodeByteArray, (Object) "BitmapFactory returned null");
            return decodeByteArray;
        } finally {
            C0744b.m3336b(a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap mo4243a(C0744b<C0737g> bVar, Options options) {
        C0737g gVar = (C0737g) bVar.mo3520n();
        int size = gVar.size();
        C0744b a = this.f3468c.mo4752a(size);
        try {
            byte[] bArr = (byte[]) a.mo3520n();
            gVar.mo3495a(0, bArr, 0, size);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, size, options);
            C0718j.m3241a(decodeByteArray, (Object) "BitmapFactory returned null");
            return decodeByteArray;
        } finally {
            C0744b.m3336b(a);
        }
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
