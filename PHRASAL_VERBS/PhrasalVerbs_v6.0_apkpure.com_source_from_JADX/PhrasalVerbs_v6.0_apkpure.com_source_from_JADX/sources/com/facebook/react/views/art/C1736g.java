package com.facebook.react.views.art;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.C1570F;
import com.facebook.react.uimanager.C1654h;
import com.facebook.react.uimanager.p121a.C1595a;

/* renamed from: com.facebook.react.views.art.g */
public abstract class C1736g extends C1570F {

    /* renamed from: v */
    private static final float[] f5126v = new float[9];

    /* renamed from: w */
    private static final float[] f5127w = new float[9];

    /* renamed from: x */
    protected float f5128x = 1.0f;

    /* renamed from: y */
    private Matrix f5129y = new Matrix();

    /* renamed from: z */
    protected final float f5130z = C1654h.m6471b().density;

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public void mo6042N() {
        float[] fArr = f5127w;
        float[] fArr2 = f5126v;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[2];
        float f = fArr2[4];
        float f2 = this.f5130z;
        fArr[2] = f * f2;
        fArr[3] = fArr2[1];
        fArr[4] = fArr2[3];
        fArr[5] = fArr2[5] * f2;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
        if (this.f5129y == null) {
            this.f5129y = new Matrix();
        }
        this.f5129y.setValues(f5127w);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6043a(Canvas canvas) {
        canvas.restore();
    }

    /* renamed from: a */
    public abstract void mo6023a(Canvas canvas, Paint paint, float f);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo6044b(Canvas canvas) {
        canvas.save();
        Matrix matrix = this.f5129y;
        if (matrix != null) {
            canvas.concat(matrix);
        }
    }

    /* renamed from: j */
    public boolean mo5596j() {
        return true;
    }

    @C1595a(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(float f) {
        this.f5128x = f;
        mo5622K();
    }

    @C1595a(name = "transform")
    public void setTransform(ReadableArray readableArray) {
        if (readableArray != null) {
            int a = C1737h.m6694a(readableArray, f5126v);
            if (a == 6) {
                mo6042N();
            } else if (a != -1) {
                throw new JSApplicationIllegalArgumentException("Transform matrices must be of size 6");
            }
        } else {
            this.f5129y = null;
        }
        mo5622K();
    }
}
