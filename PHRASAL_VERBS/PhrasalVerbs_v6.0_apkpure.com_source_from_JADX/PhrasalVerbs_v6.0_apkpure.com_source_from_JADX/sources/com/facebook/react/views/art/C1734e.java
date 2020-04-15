package com.facebook.react.views.art;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import com.facebook.react.uimanager.C1569E;
import com.facebook.react.uimanager.C1655ha;
import com.facebook.react.uimanager.C1691n;
import com.facebook.react.uimanager.p121a.C1595a;
import p032c.p033a.p038c.p043e.C0727a;

/* renamed from: com.facebook.react.views.art.e */
public class C1734e extends C1691n implements SurfaceTextureListener {

    /* renamed from: w */
    private Surface f5122w;

    /* renamed from: x */
    private Integer f5123x;

    /* renamed from: N */
    private void m6682N() {
        Surface surface = this.f5122w;
        if (surface == null || !surface.isValid()) {
            m6683e(this);
            return;
        }
        try {
            Canvas lockCanvas = this.f5122w.lockCanvas(null);
            lockCanvas.drawColor(0, Mode.CLEAR);
            if (this.f5123x != null) {
                lockCanvas.drawColor(this.f5123x.intValue());
            }
            Paint paint = new Paint();
            for (int i = 0; i < mo5589e(); i++) {
                C1736g gVar = (C1736g) mo5590e(i);
                gVar.mo6023a(lockCanvas, paint, 1.0f);
                gVar.mo5577b();
            }
            if (this.f5122w != null) {
                this.f5122w.unlockCanvasAndPost(lockCanvas);
            }
        } catch (IllegalArgumentException | IllegalStateException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(e.getClass().getSimpleName());
            sb.append(" in Surface.unlockCanvasAndPost");
            C0727a.m3275b("ReactNative", sb.toString());
        }
    }

    /* renamed from: e */
    private void m6683e(C1569E e) {
        for (int i = 0; i < e.mo5589e(); i++) {
            C1569E e2 = e.mo5590e(i);
            e2.mo5577b();
            m6683e(e2);
        }
    }

    /* renamed from: a */
    public void mo5628a(C1655ha haVar) {
        super.mo5628a(haVar);
        m6682N();
        haVar.mo5919a(mo5592g(), (Object) this);
    }

    /* renamed from: j */
    public boolean mo5596j() {
        return false;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f5122w = new Surface(surfaceTexture);
        m6682N();
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        surfaceTexture.release();
        this.f5122w = null;
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @C1595a(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(Integer num) {
        this.f5123x = num;
        mo5622K();
    }

    /* renamed from: w */
    public boolean mo5609w() {
        return true;
    }
}
