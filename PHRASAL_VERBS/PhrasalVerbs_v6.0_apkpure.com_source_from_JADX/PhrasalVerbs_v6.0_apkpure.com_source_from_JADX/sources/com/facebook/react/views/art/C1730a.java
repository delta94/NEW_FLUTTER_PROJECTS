package com.facebook.react.views.art;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Region.Op;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.p121a.C1595a;

/* renamed from: com.facebook.react.views.art.a */
public class C1730a extends C1736g {

    /* renamed from: A */
    protected RectF f5114A;

    /* renamed from: a */
    private static RectF m6674a(float[] fArr) {
        if (fArr.length == 4) {
            return new RectF(fArr[0], fArr[1], fArr[0] + fArr[2], fArr[1] + fArr[3]);
        }
        throw new JSApplicationIllegalArgumentException("Clipping should be array of length 4 (e.g. [x, y, width, height])");
    }

    /* renamed from: a */
    public void mo6023a(Canvas canvas, Paint paint, float f) {
        float f2 = f * this.f5128x;
        if (f2 > 0.01f) {
            mo6044b(canvas);
            RectF rectF = this.f5114A;
            if (rectF != null) {
                float f3 = rectF.left;
                float f4 = this.f5130z;
                canvas.clipRect(f3 * f4, rectF.top * f4, rectF.right * f4, rectF.bottom * f4, Op.REPLACE);
            }
            for (int i = 0; i < mo5589e(); i++) {
                C1736g gVar = (C1736g) mo5590e(i);
                gVar.mo6023a(canvas, paint, f2);
                gVar.mo5577b();
            }
            mo6043a(canvas);
        }
    }

    /* renamed from: j */
    public boolean mo5596j() {
        return true;
    }

    @C1595a(name = "clipping")
    public void setClipping(ReadableArray readableArray) {
        float[] a = C1737h.m6695a(readableArray);
        if (a != null) {
            this.f5114A = m6674a(a);
            mo5622K();
        }
    }
}
