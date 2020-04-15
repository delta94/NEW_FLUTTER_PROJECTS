package com.facebook.react.fabric.jsi;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.events.C1633a;
import p032c.p033a.p096l.p097a.C1137a;

@SuppressLint({"MissingNativeLoadLibrary"})
public class EventBeatManager implements C1633a {

    /* renamed from: a */
    private final ReactApplicationContext f4429a;
    @C1137a
    private final HybridData mHybridData;

    static {
        C1423b.m5817a();
    }

    /* renamed from: b */
    private void m5815b() {
        if (this.f4429a.isOnJSQueueThread()) {
            beat();
        } else {
            this.f4429a.runOnJSQueueThread(new C1422a(this));
        }
    }

    /* access modifiers changed from: private */
    public native void beat();

    private static native HybridData initHybrid(long j);

    /* renamed from: a */
    public void mo5249a() {
        m5815b();
    }
}
