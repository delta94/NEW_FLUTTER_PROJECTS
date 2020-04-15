package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import p032c.p033a.p038c.p042d.C0718j;
import p032c.p033a.p038c.p045g.C0733c;

@TargetApi(21)
/* renamed from: com.facebook.imagepipeline.memory.e */
public class C1273e extends C1266a<Bitmap> {
    public C1273e(C0733c cVar, C1294w wVar, C1295x xVar) {
        super(cVar, wVar, xVar);
        mo4718a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap m5490a(int i) {
        double d = (double) i;
        Double.isNaN(d);
        return Bitmap.createBitmap(1, (int) Math.ceil(d / 2.0d), Config.RGB_565);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4719b(Bitmap bitmap) {
        C0718j.m3240a(bitmap);
        bitmap.recycle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo4722c(Bitmap bitmap) {
        C0718j.m3240a(bitmap);
        return bitmap.getAllocationByteCount();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo4726d(Bitmap bitmap) {
        C0718j.m3240a(bitmap);
        return !bitmap.isRecycled() && bitmap.isMutable();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo4725d(int i) {
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo4727e(int i) {
        return i;
    }
}
