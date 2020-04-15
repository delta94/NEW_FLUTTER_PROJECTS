package com.facebook.react.modules.core;

import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import com.facebook.react.bridge.UiThreadUtil;

/* renamed from: com.facebook.react.modules.core.b */
public class C1458b {

    /* renamed from: a */
    private static C1458b f4514a;

    /* renamed from: b */
    private Choreographer f4515b = m5867b();

    /* renamed from: com.facebook.react.modules.core.b$a */
    public static abstract class C1459a {

        /* renamed from: a */
        private FrameCallback f4516a;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public FrameCallback mo5336a() {
            if (this.f4516a == null) {
                this.f4516a = new C1457a(this);
            }
            return this.f4516a;
        }

        /* renamed from: a */
        public abstract void mo5332a(long j);
    }

    private C1458b() {
    }

    /* renamed from: a */
    public static C1458b m5865a() {
        UiThreadUtil.assertOnUiThread();
        if (f4514a == null) {
            f4514a = new C1458b();
        }
        return f4514a;
    }

    /* renamed from: a */
    private void m5866a(FrameCallback frameCallback) {
        this.f4515b.postFrameCallback(frameCallback);
    }

    /* renamed from: b */
    private Choreographer m5867b() {
        return Choreographer.getInstance();
    }

    /* renamed from: b */
    private void m5868b(FrameCallback frameCallback) {
        this.f4515b.removeFrameCallback(frameCallback);
    }

    /* renamed from: a */
    public void mo5334a(C1459a aVar) {
        m5866a(aVar.mo5336a());
    }

    /* renamed from: b */
    public void mo5335b(C1459a aVar) {
        m5868b(aVar.mo5336a());
    }
}
