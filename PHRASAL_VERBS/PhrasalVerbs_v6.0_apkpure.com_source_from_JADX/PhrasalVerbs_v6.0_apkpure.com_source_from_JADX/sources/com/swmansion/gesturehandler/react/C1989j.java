package com.swmansion.gesturehandler.react;

import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import p032c.p033a.p098m.C1156P;
import p032c.p115b.p116a.C1242c;
import p032c.p115b.p116a.C1245f;

/* renamed from: com.swmansion.gesturehandler.react.j */
public class C1989j {

    /* renamed from: a */
    private final ReactContext f5902a;

    /* renamed from: b */
    private final C1245f f5903b;

    /* renamed from: c */
    private final C1242c f5904c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1156P f5905d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f5906e = false;

    /* renamed from: f */
    private boolean f5907f = false;

    /* renamed from: com.swmansion.gesturehandler.react.j$a */
    private class C1990a extends C1242c {
        private C1990a() {
        }

        /* synthetic */ C1990a(C1989j jVar, C1988i iVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo4606c(MotionEvent motionEvent) {
            if (mo4640k() == 0) {
                mo4623b();
                C1989j.this.f5906e = false;
            }
            if (motionEvent.getActionMasked() == 1) {
                mo4631d();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: p */
        public void mo4609p() {
            C1989j.this.f5906e = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setAction(3);
            C1989j.this.f5905d.mo4473a(obtain);
        }
    }

    public C1989j(ReactContext reactContext, ViewGroup viewGroup) {
        UiThreadUtil.assertOnUiThread();
        int id = viewGroup.getId();
        if (id >= 1) {
            RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) reactContext.getNativeModule(RNGestureHandlerModule.class);
            C1987h registry = rNGestureHandlerModule.getRegistry();
            this.f5905d = m7577a(viewGroup);
            StringBuilder sb = new StringBuilder();
            sb.append("[GESTURE HANDLER] Initialize gesture handler for root view ");
            sb.append(this.f5905d);
            Log.i("ReactNative", sb.toString());
            this.f5902a = reactContext;
            this.f5903b = new C1245f(viewGroup, registry, new C1994n());
            this.f5903b.mo4654a(0.1f);
            this.f5904c = new C1990a(this, null);
            this.f5904c.mo4616a(-id);
            registry.mo7023a(this.f5904c);
            registry.mo7024a(this.f5904c.mo4641l(), id);
            rNGestureHandlerModule.registerRootHelper(this);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Expect view tag to be set for ");
        sb2.append(viewGroup);
        throw new IllegalStateException(sb2.toString());
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=android.view.ViewGroup, code=android.view.ViewParent, for r3v0, types: [android.view.ViewParent, java.lang.Object, android.view.ViewGroup] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p032c.p033a.p098m.C1156P m7577a(android.view.ViewParent r3) {
        /*
            com.facebook.react.bridge.UiThreadUtil.assertOnUiThread()
            r0 = r3
        L_0x0004:
            if (r0 == 0) goto L_0x000f
            boolean r1 = r0 instanceof p032c.p033a.p098m.C1156P
            if (r1 != 0) goto L_0x000f
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0004
        L_0x000f:
            if (r0 == 0) goto L_0x0014
            c.a.m.P r0 = (p032c.p033a.p098m.C1156P) r0
            return r0
        L_0x0014:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "View "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " has not been mounted under ReactRootView"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.react.C1989j.m7577a(android.view.ViewGroup):c.a.m.P");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m7581c() {
        C1242c cVar = this.f5904c;
        if (cVar != null && cVar.mo4640k() == 2) {
            this.f5904c.mo4615a();
            this.f5904c.mo4631d();
        }
    }

    /* renamed from: a */
    public C1156P mo7028a() {
        return this.f5905d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7029a(int i, boolean z) {
        if (z) {
            UiThreadUtil.runOnUiThread(new C1988i(this));
        }
    }

    /* renamed from: a */
    public void mo7030a(boolean z) {
        if (this.f5903b != null && !this.f5907f) {
            m7581c();
        }
    }

    /* renamed from: a */
    public boolean mo7031a(MotionEvent motionEvent) {
        this.f5907f = true;
        this.f5903b.mo4657b(motionEvent);
        this.f5907f = false;
        return this.f5906e;
    }

    /* renamed from: b */
    public void mo7032b() {
        StringBuilder sb = new StringBuilder();
        sb.append("[GESTURE HANDLER] Tearing down gesture handler registered for root view ");
        sb.append(this.f5905d);
        Log.i("ReactNative", sb.toString());
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) this.f5902a.getNativeModule(RNGestureHandlerModule.class);
        rNGestureHandlerModule.getRegistry().mo7022a(this.f5904c.mo4641l());
        rNGestureHandlerModule.unregisterRootHelper(this);
    }
}
