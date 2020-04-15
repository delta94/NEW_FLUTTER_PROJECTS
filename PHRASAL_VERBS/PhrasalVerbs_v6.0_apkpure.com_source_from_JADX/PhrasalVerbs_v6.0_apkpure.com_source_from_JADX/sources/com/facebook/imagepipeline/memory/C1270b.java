package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import p032c.p033a.p038c.p046h.C0746d;

/* renamed from: com.facebook.imagepipeline.memory.b */
class C1270b implements C0746d<Bitmap> {

    /* renamed from: a */
    final /* synthetic */ C1271c f4156a;

    C1270b(C1271c cVar) {
        this.f4156a = cVar;
    }

    /* renamed from: a */
    public void mo3486a(Bitmap bitmap) {
        try {
            this.f4156a.mo4734a(bitmap);
        } finally {
            bitmap.recycle();
        }
    }
}
