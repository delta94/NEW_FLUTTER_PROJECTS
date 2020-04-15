package p032c.p033a.p098m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.uimanager.C1574J;
import com.facebook.react.uimanager.C1590W;
import com.facebook.react.uimanager.C1654h;
import com.facebook.react.uimanager.C1685k;
import com.facebook.react.uimanager.C1687l;
import com.facebook.react.uimanager.C1726w;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.common.C1624a;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;
import com.facebook.systrace.C1937a;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p094k.p095a.C1136a;

/* renamed from: c.a.m.P */
public class C1156P extends SizeMonitoringFrameLayout implements C1574J, C1624a {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C1145G f3849b;

    /* renamed from: c */
    private String f3850c;

    /* renamed from: d */
    private Bundle f3851d;

    /* renamed from: e */
    private String f3852e;

    /* renamed from: f */
    private C1157a f3853f;

    /* renamed from: g */
    private C1158b f3854g;

    /* renamed from: h */
    private int f3855h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f3856i;

    /* renamed from: j */
    private boolean f3857j;

    /* renamed from: k */
    private C1687l f3858k;

    /* renamed from: l */
    private final C1233t f3859l = new C1233t(this);

    /* renamed from: m */
    private boolean f3860m = false;

    /* renamed from: n */
    private int f3861n = MeasureSpec.makeMeasureSpec(0, 0);

    /* renamed from: o */
    private int f3862o = MeasureSpec.makeMeasureSpec(0, 0);

    /* renamed from: p */
    private int f3863p = 1;

    /* renamed from: c.a.m.P$a */
    private class C1157a implements OnGlobalLayoutListener {

        /* renamed from: a */
        private final Rect f3864a;

        /* renamed from: b */
        private final int f3865b;

        /* renamed from: c */
        private int f3866c = 0;

        /* renamed from: d */
        private int f3867d = 0;

        /* renamed from: e */
        private DisplayMetrics f3868e = new DisplayMetrics();

        /* renamed from: f */
        private DisplayMetrics f3869f = new DisplayMetrics();

        C1157a() {
            C1654h.m6474b(C1156P.this.getContext().getApplicationContext());
            this.f3864a = new Rect();
            this.f3865b = (int) C1726w.m6668b(60.0f);
        }

        /* renamed from: a */
        private void m5157a() {
            C1654h.m6469a(C1156P.this.getContext());
            if (!m5159a(this.f3868e, C1654h.m6471b()) || !m5159a(this.f3869f, C1654h.m6466a())) {
                this.f3868e.setTo(C1654h.m6471b());
                this.f3869f.setTo(C1654h.m6466a());
                m5162d();
            }
        }

        /* renamed from: a */
        private void m5158a(int i) {
            String str;
            double d;
            double d2;
            boolean z = true;
            if (i != 0) {
                if (i == 1) {
                    d = -90.0d;
                    str = "landscape-primary";
                } else if (i == 2) {
                    d2 = 180.0d;
                    str = "portrait-secondary";
                } else if (i == 3) {
                    d = 90.0d;
                    str = "landscape-secondary";
                } else {
                    return;
                }
                WritableMap createMap = Arguments.createMap();
                createMap.putString("name", str);
                createMap.putDouble("rotationDegrees", d);
                createMap.putBoolean("isLandscape", z);
                C1156P.this.mo4476a("namedOrientationDidChange", createMap);
            }
            d2 = 0.0d;
            str = "portrait-primary";
            d = d2;
            z = false;
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putString("name", str);
            createMap2.putDouble("rotationDegrees", d);
            createMap2.putBoolean("isLandscape", z);
            C1156P.this.mo4476a("namedOrientationDidChange", createMap2);
        }

        /* renamed from: a */
        private boolean m5159a(DisplayMetrics displayMetrics, DisplayMetrics displayMetrics2) {
            if (VERSION.SDK_INT >= 17) {
                return displayMetrics.equals(displayMetrics2);
            }
            return displayMetrics.widthPixels == displayMetrics2.widthPixels && displayMetrics.heightPixels == displayMetrics2.heightPixels && displayMetrics.density == displayMetrics2.density && displayMetrics.densityDpi == displayMetrics2.densityDpi && displayMetrics.scaledDensity == displayMetrics2.scaledDensity && displayMetrics.xdpi == displayMetrics2.xdpi && displayMetrics.ydpi == displayMetrics2.ydpi;
        }

        /* renamed from: b */
        private void m5160b() {
            int rotation = ((WindowManager) C1156P.this.getContext().getSystemService("window")).getDefaultDisplay().getRotation();
            if (this.f3867d != rotation) {
                this.f3867d = rotation;
                m5158a(rotation);
            }
        }

        /* renamed from: c */
        private void m5161c() {
            C1156P.this.getRootView().getWindowVisibleDisplayFrame(this.f3864a);
            int i = C1654h.m6471b().heightPixels - this.f3864a.bottom;
            if (this.f3866c != i && i > this.f3865b) {
                this.f3866c = i;
                WritableMap createMap = Arguments.createMap();
                WritableMap createMap2 = Arguments.createMap();
                createMap2.putDouble("screenY", (double) C1726w.m6666a((float) this.f3864a.bottom));
                createMap2.putDouble("screenX", (double) C1726w.m6666a((float) this.f3864a.left));
                createMap2.putDouble("width", (double) C1726w.m6666a((float) this.f3864a.width()));
                createMap2.putDouble("height", (double) C1726w.m6666a((float) this.f3866c));
                createMap.putMap("endCoordinates", createMap2);
                C1156P.this.mo4476a("keyboardDidShow", createMap);
            } else if (this.f3866c != 0 && i <= this.f3865b) {
                this.f3866c = 0;
                C1156P.this.mo4476a("keyboardDidHide", (WritableMap) null);
            }
        }

        /* renamed from: d */
        private void m5162d() {
            ((DeviceInfoModule) C1156P.this.f3849b.mo4426c().getNativeModule(DeviceInfoModule.class)).emitUpdateDimensionsEvent();
        }

        public void onGlobalLayout() {
            if (C1156P.this.f3849b != null && C1156P.this.f3856i && C1156P.this.f3849b.mo4426c() != null) {
                m5161c();
                m5160b();
                m5157a();
            }
        }
    }

    /* renamed from: c.a.m.P$b */
    public interface C1158b {
        /* renamed from: a */
        void mo4506a(C1156P p);
    }

    public C1156P(Context context) {
        super(context);
        m5147f();
    }

    /* renamed from: a */
    private void m5142a(int i, int i2) {
        C1145G g = this.f3849b;
        if (g == null) {
            C0727a.m3284d("ReactNative", "Unable to update root layout specs for uninitialized ReactInstanceManager");
            return;
        }
        ReactContext c = g.mo4426c();
        if (c != null) {
            C1590W.m6338a(c, getUIManagerType()).updateRootLayoutSpecs(getRootViewTag(), i, i2);
        }
    }

    /* renamed from: b */
    private void m5143b(MotionEvent motionEvent) {
        C1145G g = this.f3849b;
        String str = "ReactNative";
        if (g == null || !this.f3856i || g.mo4426c() == null) {
            C0727a.m3284d(str, "Unable to dispatch touch to JS as the catalyst instance has not been attached");
        } else if (this.f3858k == null) {
            C0727a.m3284d(str, "Unable to dispatch touch to JS before the dispatcher is available");
        } else {
            this.f3858k.mo5946a(motionEvent, ((UIManagerModule) this.f3849b.mo4426c().getNativeModule(UIManagerModule.class)).getEventDispatcher());
        }
    }

    /* renamed from: d */
    private void mo7015d() {
        C1937a.m7339a(0, "attachToReactInstanceManager");
        try {
            if (!this.f3856i) {
                this.f3856i = true;
                C1145G g = this.f3849b;
                C1136a.m5053a(g);
                g.mo4422a(this);
                getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
                C1937a.m7338a(0);
            }
        } finally {
            C1937a.m7338a(0);
        }
    }

    /* renamed from: e */
    private void mo7017e() {
        C1145G g = this.f3849b;
        if (g == null) {
            C0727a.m3284d("ReactNative", "Unable to enable layout calculation for uninitialized ReactInstanceManager");
            return;
        }
        ReactContext c = g.mo4426c();
        if (c != null) {
            ((UIManagerModule) c.getCatalystInstance().getNativeModule(UIManagerModule.class)).getUIImplementation().mo5730b(getRootViewTag());
        }
    }

    /* renamed from: f */
    private void m5147f() {
        setClipChildren(false);
    }

    /* renamed from: g */
    private void m5148g() {
        getViewTreeObserver().removeOnGlobalLayoutListener(getCustomGlobalLayoutListener());
    }

    private C1157a getCustomGlobalLayoutListener() {
        if (this.f3853f == null) {
            this.f3853f = new C1157a();
        }
        return this.f3853f;
    }

    /* renamed from: a */
    public void mo4472a() {
        this.f3858k = new C1687l(this);
        C1158b bVar = this.f3854g;
        if (bVar != null) {
            bVar.mo4506a(this);
        }
    }

    /* renamed from: a */
    public void mo4473a(MotionEvent motionEvent) {
        C1145G g = this.f3849b;
        String str = "ReactNative";
        if (g == null || !this.f3856i || g.mo4426c() == null) {
            C0727a.m3284d(str, "Unable to dispatch touch to JS as the catalyst instance has not been attached");
        } else if (this.f3858k == null) {
            C0727a.m3284d(str, "Unable to dispatch touch to JS before the dispatcher is available");
        } else {
            this.f3858k.mo5947b(motionEvent, ((UIManagerModule) this.f3849b.mo4426c().getNativeModule(UIManagerModule.class)).getEventDispatcher());
        }
    }

    /* renamed from: a */
    public void mo4474a(C1145G g, String str, Bundle bundle) {
        mo4475a(g, str, bundle, null);
    }

    /* renamed from: a */
    public void mo4475a(C1145G g, String str, Bundle bundle, String str2) {
        C1937a.m7339a(0, "startReactApplication");
        try {
            UiThreadUtil.assertOnUiThread();
            C1136a.m5056a(this.f3849b == null, "This root view has already been attached to a catalyst instance manager");
            this.f3849b = g;
            this.f3850c = str;
            this.f3851d = bundle;
            this.f3852e = str2;
            if (!this.f3849b.mo4430f()) {
                this.f3849b.mo4423b();
            }
            mo7015d();
        } finally {
            C1937a.m7338a(0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4476a(String str, WritableMap writableMap) {
        C1145G g = this.f3849b;
        if (g != null) {
            ((RCTDeviceEventEmitter) g.mo4426c().getJSModule(RCTDeviceEventEmitter.class)).emit(str, writableMap);
        }
    }

    /* renamed from: a */
    public void mo4477a(Throwable th) {
        C1145G g = this.f3849b;
        if (g == null || g.mo4426c() == null) {
            throw new RuntimeException(th);
        }
        this.f3849b.mo4426c().handleException(new C1685k(th.getMessage(), this, th));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4478b() {
        C1937a.m7339a(0, "ReactRootView.runApplication");
        try {
            if (this.f3849b != null) {
                if (this.f3856i) {
                    ReactContext c = this.f3849b.mo4426c();
                    if (c == null) {
                        C1937a.m7338a(0);
                        return;
                    }
                    CatalystInstance catalystInstance = c.getCatalystInstance();
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putDouble("rootTag", (double) getRootViewTag());
                    Bundle appProperties = getAppProperties();
                    if (appProperties != null) {
                        writableNativeMap.putMap("initialProps", Arguments.fromBundle(appProperties));
                    }
                    if (getUIManagerType() == 2) {
                        writableNativeMap.putBoolean("fabric", true);
                    }
                    this.f3857j = true;
                    ((AppRegistry) catalystInstance.getJSModule(AppRegistry.class)).runApplication(getJSModuleName(), writableNativeMap);
                    C1937a.m7338a(0);
                }
            }
        } finally {
            C1937a.m7338a(0);
        }
    }

    /* renamed from: c */
    public void mo4479c() {
        C1145G g = this.f3849b;
        if (g != null && this.f3856i) {
            g.mo4425b(this);
            this.f3849b = null;
            this.f3856i = false;
        }
        this.f3857j = false;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (StackOverflowError e) {
            mo4477a((Throwable) e);
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C1145G g = this.f3849b;
        if (g == null || !this.f3856i || g.mo4426c() == null) {
            C0727a.m3284d("ReactNative", "Unable to handle key event as the catalyst instance has not been attached");
        } else {
            this.f3859l.mo4599a(keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        super.finalize();
        C1136a.m5056a(!this.f3856i, "The application this ReactRootView was rendering was not unmounted before the ReactRootView was garbage collected. This usually means that your application is leaking large amounts of memory. To solve this, make sure to call ReactRootView#unmountReactApplication in the onDestroy() of your hosting Activity or in the onDestroyView() of your hosting Fragment.");
    }

    public Bundle getAppProperties() {
        return this.f3851d;
    }

    public int getHeightMeasureSpec() {
        return (this.f3860m || getLayoutParams() == null || getLayoutParams().height <= 0) ? this.f3862o : MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824);
    }

    public String getInitialUITemplate() {
        return this.f3852e;
    }

    /* access modifiers changed from: 0000 */
    public String getJSModuleName() {
        String str = this.f3850c;
        C1136a.m5053a(str);
        return str;
    }

    public C1145G getReactInstanceManager() {
        return this.f3849b;
    }

    public int getRootViewTag() {
        return this.f3855h;
    }

    public int getUIManagerType() {
        return this.f3863p;
    }

    public int getWidthMeasureSpec() {
        return (this.f3860m || getLayoutParams() == null || getLayoutParams().width <= 0) ? this.f3861n : MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3856i) {
            m5148g();
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f3856i) {
            m5148g();
        }
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        C1145G g = this.f3849b;
        if (g == null || !this.f3856i || g.mo4426c() == null) {
            C0727a.m3284d("ReactNative", "Unable to handle focus changed event as the catalyst instance has not been attached");
        } else {
            this.f3859l.mo4598a();
        }
        super.onFocusChanged(z, i, rect);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m5143b(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049 A[Catch:{ all -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058 A[Catch:{ all -> 0x0099 }, LOOP:1: B:18:0x0052->B:20:0x0058, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0080 A[Catch:{ all -> 0x0099 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            r0 = 0
            java.lang.String r2 = "ReactRootView.onMeasure"
            com.facebook.systrace.C1937a.m7339a(r0, r2)
            r8.f3861n = r9     // Catch:{ all -> 0x0099 }
            r8.f3862o = r10     // Catch:{ all -> 0x0099 }
            int r2 = android.view.View.MeasureSpec.getMode(r9)     // Catch:{ all -> 0x0099 }
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 0
            if (r2 == r3) goto L_0x001c
            if (r2 != 0) goto L_0x0017
            goto L_0x001c
        L_0x0017:
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x0099 }
            goto L_0x0043
        L_0x001c:
            r9 = 0
            r2 = 0
        L_0x001e:
            int r5 = r8.getChildCount()     // Catch:{ all -> 0x0099 }
            if (r9 >= r5) goto L_0x0042
            android.view.View r5 = r8.getChildAt(r9)     // Catch:{ all -> 0x0099 }
            int r6 = r5.getLeft()     // Catch:{ all -> 0x0099 }
            int r7 = r5.getMeasuredWidth()     // Catch:{ all -> 0x0099 }
            int r6 = r6 + r7
            int r7 = r5.getPaddingLeft()     // Catch:{ all -> 0x0099 }
            int r6 = r6 + r7
            int r5 = r5.getPaddingRight()     // Catch:{ all -> 0x0099 }
            int r6 = r6 + r5
            int r2 = java.lang.Math.max(r2, r6)     // Catch:{ all -> 0x0099 }
            int r9 = r9 + 1
            goto L_0x001e
        L_0x0042:
            r9 = r2
        L_0x0043:
            int r2 = android.view.View.MeasureSpec.getMode(r10)     // Catch:{ all -> 0x0099 }
            if (r2 == r3) goto L_0x0051
            if (r2 != 0) goto L_0x004c
            goto L_0x0051
        L_0x004c:
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x0099 }
            goto L_0x0076
        L_0x0051:
            r10 = 0
        L_0x0052:
            int r2 = r8.getChildCount()     // Catch:{ all -> 0x0099 }
            if (r4 >= r2) goto L_0x0076
            android.view.View r2 = r8.getChildAt(r4)     // Catch:{ all -> 0x0099 }
            int r3 = r2.getTop()     // Catch:{ all -> 0x0099 }
            int r5 = r2.getMeasuredHeight()     // Catch:{ all -> 0x0099 }
            int r3 = r3 + r5
            int r5 = r2.getPaddingTop()     // Catch:{ all -> 0x0099 }
            int r3 = r3 + r5
            int r2 = r2.getPaddingBottom()     // Catch:{ all -> 0x0099 }
            int r3 = r3 + r2
            int r10 = java.lang.Math.max(r10, r3)     // Catch:{ all -> 0x0099 }
            int r4 = r4 + 1
            goto L_0x0052
        L_0x0076:
            r8.setMeasuredDimension(r9, r10)     // Catch:{ all -> 0x0099 }
            r9 = 1
            r8.f3860m = r9     // Catch:{ all -> 0x0099 }
            c.a.m.G r9 = r8.f3849b     // Catch:{ all -> 0x0099 }
            if (r9 == 0) goto L_0x008b
            boolean r9 = r8.f3856i     // Catch:{ all -> 0x0099 }
            if (r9 != 0) goto L_0x008b
            r8.mo7015d()     // Catch:{ all -> 0x0099 }
            r8.mo7017e()     // Catch:{ all -> 0x0099 }
            goto L_0x0095
        L_0x008b:
            r8.mo7017e()     // Catch:{ all -> 0x0099 }
            int r9 = r8.f3861n     // Catch:{ all -> 0x0099 }
            int r10 = r8.f3862o     // Catch:{ all -> 0x0099 }
            r8.m5142a(r9, r10)     // Catch:{ all -> 0x0099 }
        L_0x0095:
            com.facebook.systrace.C1937a.m7338a(r0)
            return
        L_0x0099:
            r9 = move-exception
            com.facebook.systrace.C1937a.m7338a(r0)
            throw r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p032c.p033a.p098m.C1156P.onMeasure(int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        m5143b(motionEvent);
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (this.f3857j) {
            this.f3857j = false;
            String str = this.f3850c;
            if (str != null) {
                ReactMarker.logMarker(ReactMarkerConstants.CONTENT_APPEARED, str, this.f3855h);
            }
        }
    }

    public void requestChildFocus(View view, View view2) {
        C1145G g = this.f3849b;
        if (g == null || !this.f3856i || g.mo4426c() == null) {
            C0727a.m3284d("ReactNative", "Unable to handle child focus changed event as the catalyst instance has not been attached");
        } else {
            this.f3859l.mo4600a(view2);
        }
        super.requestChildFocus(view, view2);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setAppProperties(Bundle bundle) {
        UiThreadUtil.assertOnUiThread();
        this.f3851d = bundle;
        if (getRootViewTag() != 0) {
            mo4478b();
        }
    }

    public void setEventListener(C1158b bVar) {
        this.f3854g = bVar;
    }

    public void setIsFabric(boolean z) {
        this.f3863p = z ? 2 : 1;
    }

    public void setRootViewTag(int i) {
        this.f3855h = i;
    }
}
