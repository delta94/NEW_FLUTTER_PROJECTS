package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.view.MotionEvent;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.C1397f;
import com.facebook.react.uimanager.C1726w;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.C1635c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p032c.p033a.p098m.C1156P;
import p032c.p033a.p098m.p102d.p103a.C1176a;
import p032c.p115b.p116a.C1241b;
import p032c.p115b.p116a.C1242c;
import p032c.p115b.p116a.C1249j;
import p032c.p115b.p116a.C1250k;
import p032c.p115b.p116a.C1251l;
import p032c.p115b.p116a.C1252m;
import p032c.p115b.p116a.C1254o;
import p032c.p115b.p116a.C1259s;
import p032c.p115b.p116a.C1261u;

@C1176a(name = "RNGestureHandlerModule")
public class RNGestureHandlerModule extends ReactContextBaseJavaModule {
    private static final String KEY_DIRECTION = "direction";
    private static final String KEY_ENABLED = "enabled";
    private static final String KEY_HIT_SLOP = "hitSlop";
    private static final String KEY_HIT_SLOP_BOTTOM = "bottom";
    private static final String KEY_HIT_SLOP_HEIGHT = "height";
    private static final String KEY_HIT_SLOP_HORIZONTAL = "horizontal";
    private static final String KEY_HIT_SLOP_LEFT = "left";
    private static final String KEY_HIT_SLOP_RIGHT = "right";
    private static final String KEY_HIT_SLOP_TOP = "top";
    private static final String KEY_HIT_SLOP_VERTICAL = "vertical";
    private static final String KEY_HIT_SLOP_WIDTH = "width";
    private static final String KEY_LONG_PRESS_MAX_DIST = "maxDist";
    private static final String KEY_LONG_PRESS_MIN_DURATION_MS = "minDurationMs";
    private static final String KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION = "disallowInterruption";
    private static final String KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START = "shouldActivateOnStart";
    private static final String KEY_NUMBER_OF_POINTERS = "numberOfPointers";
    private static final String KEY_PAN_ACTIVE_OFFSET_X_END = "activeOffsetXEnd";
    private static final String KEY_PAN_ACTIVE_OFFSET_X_START = "activeOffsetXStart";
    private static final String KEY_PAN_ACTIVE_OFFSET_Y_END = "activeOffsetYEnd";
    private static final String KEY_PAN_ACTIVE_OFFSET_Y_START = "activeOffsetYStart";
    private static final String KEY_PAN_AVG_TOUCHES = "avgTouches";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_X_END = "failOffsetXEnd";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_X_START = "failOffsetXStart";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_Y_END = "failOffsetYEnd";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_Y_START = "failOffsetYStart";
    private static final String KEY_PAN_MAX_POINTERS = "maxPointers";
    private static final String KEY_PAN_MIN_DIST = "minDist";
    private static final String KEY_PAN_MIN_POINTERS = "minPointers";
    private static final String KEY_PAN_MIN_VELOCITY = "minVelocity";
    private static final String KEY_PAN_MIN_VELOCITY_X = "minVelocityX";
    private static final String KEY_PAN_MIN_VELOCITY_Y = "minVelocityY";
    private static final String KEY_SHOULD_CANCEL_WHEN_OUTSIDE = "shouldCancelWhenOutside";
    private static final String KEY_TAP_MAX_DELAY_MS = "maxDelayMs";
    private static final String KEY_TAP_MAX_DELTA_X = "maxDeltaX";
    private static final String KEY_TAP_MAX_DELTA_Y = "maxDeltaY";
    private static final String KEY_TAP_MAX_DIST = "maxDist";
    private static final String KEY_TAP_MAX_DURATION_MS = "maxDurationMs";
    private static final String KEY_TAP_MIN_POINTERS = "minPointers";
    private static final String KEY_TAP_NUMBER_OF_TAPS = "numberOfTaps";
    public static final String MODULE_NAME = "RNGestureHandlerModule";
    /* access modifiers changed from: private */
    public List<Integer> mEnqueuedRootViewInit = new ArrayList();
    private C1251l mEventListener = new C1984e(this);
    private C1973b[] mHandlerFactories = {new C1975d(null), new C1979h(null), new C1974c(null), new C1976e(null), new C1977f(null), new C1978g(null), new C1972a(null)};
    private C1983d mInteractionManager = new C1983d();
    private final C1987h mRegistry = new C1987h();
    private List<C1989j> mRoots = new ArrayList();

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$a */
    private static class C1972a extends C1973b<C1241b> {
        private C1972a() {
            super(null);
        }

        /* synthetic */ C1972a(C1984e eVar) {
            this();
        }

        /* renamed from: a */
        public C1241b m7488a(Context context) {
            return new C1241b();
        }

        /* renamed from: a */
        public String mo6998a() {
            return "FlingGestureHandler";
        }

        /* renamed from: a */
        public void mo7001a(C1241b bVar, ReadableMap readableMap) {
            super.mo7001a(bVar, readableMap);
            String str = RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS;
            if (readableMap.hasKey(str)) {
                bVar.mo4608e(readableMap.getInt(str));
            }
            String str2 = RNGestureHandlerModule.KEY_DIRECTION;
            if (readableMap.hasKey(str2)) {
                bVar.mo4607d(readableMap.getInt(str2));
            }
        }

        /* renamed from: a */
        public void mo7002a(C1241b bVar, WritableMap writableMap) {
            super.mo7002a(bVar, writableMap);
            writableMap.putDouble("x", (double) C1726w.m6666a(bVar.mo4637h()));
            writableMap.putDouble("y", (double) C1726w.m6666a(bVar.mo4638i()));
            writableMap.putDouble("absoluteX", (double) C1726w.m6666a(bVar.mo4635f()));
            writableMap.putDouble("absoluteY", (double) C1726w.m6666a(bVar.mo4636g()));
        }

        /* renamed from: b */
        public Class<C1241b> mo7003b() {
            return C1241b.class;
        }
    }

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$b */
    private static abstract class C1973b<T extends C1242c> implements C1982c<T> {
        private C1973b() {
        }

        /* synthetic */ C1973b(C1984e eVar) {
            this();
        }

        /* renamed from: a */
        public abstract T mo6997a(Context context);

        /* renamed from: a */
        public abstract String mo6998a();

        /* renamed from: a */
        public void mo7001a(T t, ReadableMap readableMap) {
            String str = RNGestureHandlerModule.KEY_SHOULD_CANCEL_WHEN_OUTSIDE;
            if (readableMap.hasKey(str)) {
                t.mo4622b(readableMap.getBoolean(str));
            }
            String str2 = RNGestureHandlerModule.KEY_ENABLED;
            if (readableMap.hasKey(str2)) {
                t.mo4614a(readableMap.getBoolean(str2));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP)) {
                RNGestureHandlerModule.handleHitSlopProperty(t, readableMap);
            }
        }

        /* renamed from: a */
        public void mo7002a(T t, WritableMap writableMap) {
            writableMap.putDouble(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS, (double) t.mo4639j());
        }

        /* renamed from: b */
        public abstract Class<T> mo7003b();
    }

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$c */
    private static class C1974c extends C1973b<C1249j> {
        private C1974c() {
            super(null);
        }

        /* synthetic */ C1974c(C1984e eVar) {
            this();
        }

        /* renamed from: a */
        public C1249j m7501a(Context context) {
            return new C1249j(context);
        }

        /* renamed from: a */
        public String mo6998a() {
            return "LongPressGestureHandler";
        }

        /* renamed from: a */
        public void mo7001a(C1249j jVar, ReadableMap readableMap) {
            super.mo7001a(jVar, readableMap);
            String str = RNGestureHandlerModule.KEY_LONG_PRESS_MIN_DURATION_MS;
            if (readableMap.hasKey(str)) {
                jVar.mo4661a((long) readableMap.getInt(str));
            }
            String str2 = "maxDist";
            if (readableMap.hasKey(str2)) {
                jVar.mo4660a(C1726w.m6665a(readableMap.getDouble(str2)));
            }
        }

        /* renamed from: a */
        public void mo7002a(C1249j jVar, WritableMap writableMap) {
            super.mo7002a(jVar, writableMap);
            writableMap.putDouble("x", (double) C1726w.m6666a(jVar.mo4637h()));
            writableMap.putDouble("y", (double) C1726w.m6666a(jVar.mo4638i()));
            writableMap.putDouble("absoluteX", (double) C1726w.m6666a(jVar.mo4635f()));
            writableMap.putDouble("absoluteY", (double) C1726w.m6666a(jVar.mo4636g()));
        }

        /* renamed from: b */
        public Class<C1249j> mo7003b() {
            return C1249j.class;
        }
    }

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$d */
    private static class C1975d extends C1973b<C1250k> {
        private C1975d() {
            super(null);
        }

        /* synthetic */ C1975d(C1984e eVar) {
            this();
        }

        /* renamed from: a */
        public C1250k m7509a(Context context) {
            return new C1250k();
        }

        /* renamed from: a */
        public String mo6998a() {
            return "NativeViewGestureHandler";
        }

        /* renamed from: a */
        public void mo7001a(C1250k kVar, ReadableMap readableMap) {
            super.mo7001a(kVar, readableMap);
            String str = RNGestureHandlerModule.KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START;
            if (readableMap.hasKey(str)) {
                kVar.mo4663d(readableMap.getBoolean(str));
            }
            String str2 = RNGestureHandlerModule.KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION;
            if (readableMap.hasKey(str2)) {
                kVar.mo4662c(readableMap.getBoolean(str2));
            }
        }

        /* renamed from: a */
        public void mo7002a(C1250k kVar, WritableMap writableMap) {
            super.mo7002a(kVar, writableMap);
            writableMap.putBoolean("pointerInside", kVar.mo4644o());
        }

        /* renamed from: b */
        public Class<C1250k> mo7003b() {
            return C1250k.class;
        }
    }

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$e */
    private static class C1976e extends C1973b<C1252m> {
        private C1976e() {
            super(null);
        }

        /* synthetic */ C1976e(C1984e eVar) {
            this();
        }

        /* renamed from: a */
        public C1252m m7517a(Context context) {
            return new C1252m(context);
        }

        /* renamed from: a */
        public String mo6998a() {
            return "PanGestureHandler";
        }

        /* JADX WARNING: Removed duplicated region for block: B:42:0x0104  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0113  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0122  */
        /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo7001a(p032c.p115b.p116a.C1252m r5, com.facebook.react.bridge.ReadableMap r6) {
            /*
                r4 = this;
                super.mo7001a(r5, r6)
                java.lang.String r0 = "activeOffsetXStart"
                boolean r1 = r6.hasKey(r0)
                r2 = 1
                if (r1 == 0) goto L_0x0019
                double r0 = r6.getDouble(r0)
                float r0 = com.facebook.react.uimanager.C1726w.m6665a(r0)
                r5.mo4666b(r0)
                r0 = 1
                goto L_0x001a
            L_0x0019:
                r0 = 0
            L_0x001a:
                java.lang.String r1 = "activeOffsetXEnd"
                boolean r3 = r6.hasKey(r1)
                if (r3 == 0) goto L_0x002e
                double r0 = r6.getDouble(r1)
                float r0 = com.facebook.react.uimanager.C1726w.m6665a(r0)
                r5.mo4660a(r0)
                r0 = 1
            L_0x002e:
                java.lang.String r1 = "failOffsetXStart"
                boolean r3 = r6.hasKey(r1)
                if (r3 == 0) goto L_0x0042
                double r0 = r6.getDouble(r1)
                float r0 = com.facebook.react.uimanager.C1726w.m6665a(r0)
                r5.mo4671f(r0)
                r0 = 1
            L_0x0042:
                java.lang.String r1 = "failOffsetXEnd"
                boolean r3 = r6.hasKey(r1)
                if (r3 == 0) goto L_0x0056
                double r0 = r6.getDouble(r1)
                float r0 = com.facebook.react.uimanager.C1726w.m6665a(r0)
                r5.mo4670e(r0)
                r0 = 1
            L_0x0056:
                java.lang.String r1 = "activeOffsetYStart"
                boolean r3 = r6.hasKey(r1)
                if (r3 == 0) goto L_0x006a
                double r0 = r6.getDouble(r1)
                float r0 = com.facebook.react.uimanager.C1726w.m6665a(r0)
                r5.mo4669d(r0)
                r0 = 1
            L_0x006a:
                java.lang.String r1 = "activeOffsetYEnd"
                boolean r3 = r6.hasKey(r1)
                if (r3 == 0) goto L_0x007e
                double r0 = r6.getDouble(r1)
                float r0 = com.facebook.react.uimanager.C1726w.m6665a(r0)
                r5.mo4667c(r0)
                r0 = 1
            L_0x007e:
                java.lang.String r1 = "failOffsetYStart"
                boolean r3 = r6.hasKey(r1)
                if (r3 == 0) goto L_0x0092
                double r0 = r6.getDouble(r1)
                float r0 = com.facebook.react.uimanager.C1726w.m6665a(r0)
                r5.mo4673h(r0)
                r0 = 1
            L_0x0092:
                java.lang.String r1 = "failOffsetYEnd"
                boolean r3 = r6.hasKey(r1)
                if (r3 == 0) goto L_0x00a6
                double r0 = r6.getDouble(r1)
                float r0 = com.facebook.react.uimanager.C1726w.m6665a(r0)
                r5.mo4672g(r0)
                r0 = 1
            L_0x00a6:
                java.lang.String r1 = "minVelocity"
                boolean r3 = r6.hasKey(r1)
                if (r3 == 0) goto L_0x00ba
                double r0 = r6.getDouble(r1)
                float r0 = com.facebook.react.uimanager.C1726w.m6665a(r0)
                r5.mo4675j(r0)
                r0 = 1
            L_0x00ba:
                java.lang.String r1 = "minVelocityX"
                boolean r3 = r6.hasKey(r1)
                if (r3 == 0) goto L_0x00ce
                double r0 = r6.getDouble(r1)
                float r0 = com.facebook.react.uimanager.C1726w.m6665a(r0)
                r5.mo4676k(r0)
                r0 = 1
            L_0x00ce:
                java.lang.String r1 = "minVelocityY"
                boolean r3 = r6.hasKey(r1)
                if (r3 == 0) goto L_0x00e2
                double r0 = r6.getDouble(r1)
                float r0 = com.facebook.react.uimanager.C1726w.m6665a(r0)
                r5.mo4677l(r0)
                r0 = 1
            L_0x00e2:
                java.lang.String r1 = "minDist"
                boolean r2 = r6.hasKey(r1)
                if (r2 == 0) goto L_0x00f6
                double r0 = r6.getDouble(r1)
                float r0 = com.facebook.react.uimanager.C1726w.m6665a(r0)
            L_0x00f2:
                r5.mo4674i(r0)
                goto L_0x00fc
            L_0x00f6:
                if (r0 == 0) goto L_0x00fc
                r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
                goto L_0x00f2
            L_0x00fc:
                java.lang.String r0 = "minPointers"
                boolean r1 = r6.hasKey(r0)
                if (r1 == 0) goto L_0x010b
                int r0 = r6.getInt(r0)
                r5.mo4608e(r0)
            L_0x010b:
                java.lang.String r0 = "maxPointers"
                boolean r1 = r6.hasKey(r0)
                if (r1 == 0) goto L_0x011a
                int r0 = r6.getInt(r0)
                r5.mo4607d(r0)
            L_0x011a:
                java.lang.String r0 = "avgTouches"
                boolean r0 = r6.hasKey(r0)
                if (r0 == 0) goto L_0x012b
                java.lang.String r0 = "avgTouches"
                boolean r6 = r6.getBoolean(r0)
                r5.mo4668c(r6)
            L_0x012b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.react.RNGestureHandlerModule.C1976e.mo7001a(c.b.a.m, com.facebook.react.bridge.ReadableMap):void");
        }

        /* renamed from: a */
        public void mo7002a(C1252m mVar, WritableMap writableMap) {
            super.mo7002a(mVar, writableMap);
            writableMap.putDouble("x", (double) C1726w.m6666a(mVar.mo4637h()));
            writableMap.putDouble("y", (double) C1726w.m6666a(mVar.mo4638i()));
            writableMap.putDouble("absoluteX", (double) C1726w.m6666a(mVar.mo4635f()));
            writableMap.putDouble("absoluteY", (double) C1726w.m6666a(mVar.mo4636g()));
            writableMap.putDouble("translationX", (double) C1726w.m6666a(mVar.mo4678t()));
            writableMap.putDouble("translationY", (double) C1726w.m6666a(mVar.mo4679u()));
            writableMap.putDouble("velocityX", (double) C1726w.m6666a(mVar.mo4680v()));
            writableMap.putDouble("velocityY", (double) C1726w.m6666a(mVar.mo4681w()));
        }

        /* renamed from: b */
        public Class<C1252m> mo7003b() {
            return C1252m.class;
        }
    }

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$f */
    private static class C1977f extends C1973b<C1254o> {
        private C1977f() {
            super(null);
        }

        /* synthetic */ C1977f(C1984e eVar) {
            this();
        }

        /* renamed from: a */
        public C1254o m7525a(Context context) {
            return new C1254o();
        }

        /* renamed from: a */
        public String mo6998a() {
            return "PinchGestureHandler";
        }

        /* renamed from: a */
        public void mo7002a(C1254o oVar, WritableMap writableMap) {
            super.mo7002a(oVar, writableMap);
            writableMap.putDouble("scale", oVar.mo4686v());
            writableMap.putDouble("focalX", (double) C1726w.m6666a(oVar.mo4678t()));
            writableMap.putDouble("focalY", (double) C1726w.m6666a(oVar.mo4685u()));
            writableMap.putDouble("velocity", oVar.mo4687w());
        }

        /* renamed from: b */
        public Class<C1254o> mo7003b() {
            return C1254o.class;
        }
    }

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$g */
    private static class C1978g extends C1973b<C1259s> {
        private C1978g() {
            super(null);
        }

        /* synthetic */ C1978g(C1984e eVar) {
            this();
        }

        /* renamed from: a */
        public C1259s m7531a(Context context) {
            return new C1259s();
        }

        /* renamed from: a */
        public String mo6998a() {
            return "RotationGestureHandler";
        }

        /* renamed from: a */
        public void mo7002a(C1259s sVar, WritableMap writableMap) {
            super.mo7002a(sVar, writableMap);
            writableMap.putDouble("rotation", sVar.mo4697v());
            writableMap.putDouble("anchorX", (double) C1726w.m6666a(sVar.mo4678t()));
            writableMap.putDouble("anchorY", (double) C1726w.m6666a(sVar.mo4696u()));
            writableMap.putDouble("velocity", sVar.mo4698w());
        }

        /* renamed from: b */
        public Class<C1259s> mo7003b() {
            return C1259s.class;
        }
    }

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$h */
    private static class C1979h extends C1973b<C1261u> {
        private C1979h() {
            super(null);
        }

        /* synthetic */ C1979h(C1984e eVar) {
            this();
        }

        /* renamed from: a */
        public C1261u m7537a(Context context) {
            return new C1261u();
        }

        /* renamed from: a */
        public String mo6998a() {
            return "TapGestureHandler";
        }

        /* renamed from: a */
        public void mo7001a(C1261u uVar, ReadableMap readableMap) {
            super.mo7001a(uVar, readableMap);
            String str = RNGestureHandlerModule.KEY_TAP_NUMBER_OF_TAPS;
            if (readableMap.hasKey(str)) {
                uVar.mo4608e(readableMap.getInt(str));
            }
            String str2 = RNGestureHandlerModule.KEY_TAP_MAX_DURATION_MS;
            if (readableMap.hasKey(str2)) {
                uVar.mo4702b((long) readableMap.getInt(str2));
            }
            String str3 = RNGestureHandlerModule.KEY_TAP_MAX_DELAY_MS;
            if (readableMap.hasKey(str3)) {
                uVar.mo4700a((long) readableMap.getInt(str3));
            }
            String str4 = RNGestureHandlerModule.KEY_TAP_MAX_DELTA_X;
            if (readableMap.hasKey(str4)) {
                uVar.mo4701b(C1726w.m6665a(readableMap.getDouble(str4)));
            }
            String str5 = RNGestureHandlerModule.KEY_TAP_MAX_DELTA_Y;
            if (readableMap.hasKey(str5)) {
                uVar.mo4703c(C1726w.m6665a(readableMap.getDouble(str5)));
            }
            String str6 = "maxDist";
            if (readableMap.hasKey(str6)) {
                uVar.mo4660a(C1726w.m6665a(readableMap.getDouble(str6)));
            }
            String str7 = "minPointers";
            if (readableMap.hasKey(str7)) {
                uVar.mo4607d(readableMap.getInt(str7));
            }
        }

        /* renamed from: a */
        public void mo7002a(C1261u uVar, WritableMap writableMap) {
            super.mo7002a(uVar, writableMap);
            writableMap.putDouble("x", (double) C1726w.m6666a(uVar.mo4637h()));
            writableMap.putDouble("y", (double) C1726w.m6666a(uVar.mo4638i()));
            writableMap.putDouble("absoluteX", (double) C1726w.m6666a(uVar.mo4635f()));
            writableMap.putDouble("absoluteY", (double) C1726w.m6666a(uVar.mo4636g()));
        }

        /* renamed from: b */
        public Class<C1261u> mo7003b() {
            return C1261u.class;
        }
    }

    public RNGestureHandlerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private C1973b findFactoryForHandler(C1242c cVar) {
        int i = 0;
        while (true) {
            C1973b[] bVarArr = this.mHandlerFactories;
            if (i >= bVarArr.length) {
                return null;
            }
            C1973b bVar = bVarArr[i];
            if (bVar.mo7003b().equals(cVar.getClass())) {
                return bVar;
            }
            i++;
        }
    }

    private C1989j findRootHelperForViewAncestor(int i) {
        int resolveRootTagFromReactTag = ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).resolveRootTagFromReactTag(i);
        if (resolveRootTagFromReactTag < 1) {
            return null;
        }
        synchronized (this.mRoots) {
            for (int i2 = 0; i2 < this.mRoots.size(); i2++) {
                C1989j jVar = (C1989j) this.mRoots.get(i2);
                if (jVar.mo7028a().getRootViewTag() == resolveRootTagFromReactTag) {
                    return jVar;
                }
            }
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static void handleHitSlopProperty(C1242c cVar, ReadableMap readableMap) {
        float f;
        float f2;
        float f3;
        float f4;
        String str = KEY_HIT_SLOP;
        if (readableMap.getType(str) == ReadableType.Number) {
            float a = C1726w.m6665a(readableMap.getDouble(str));
            cVar.mo4611a(a, a, a, a, Float.NaN, Float.NaN);
            return;
        }
        ReadableMap map = readableMap.getMap(str);
        String str2 = KEY_HIT_SLOP_HORIZONTAL;
        if (map.hasKey(str2)) {
            f2 = C1726w.m6665a(map.getDouble(str2));
            f = f2;
        } else {
            f2 = Float.NaN;
            f = Float.NaN;
        }
        String str3 = KEY_HIT_SLOP_VERTICAL;
        if (map.hasKey(str3)) {
            f4 = C1726w.m6665a(map.getDouble(str3));
            f3 = f4;
        } else {
            f4 = Float.NaN;
            f3 = Float.NaN;
        }
        String str4 = KEY_HIT_SLOP_LEFT;
        if (map.hasKey(str4)) {
            f2 = C1726w.m6665a(map.getDouble(str4));
        }
        float f5 = f2;
        String str5 = KEY_HIT_SLOP_TOP;
        if (map.hasKey(str5)) {
            f3 = C1726w.m6665a(map.getDouble(str5));
        }
        float f6 = f3;
        String str6 = KEY_HIT_SLOP_RIGHT;
        if (map.hasKey(str6)) {
            f = C1726w.m6665a(map.getDouble(str6));
        }
        float f7 = f;
        String str7 = KEY_HIT_SLOP_BOTTOM;
        if (map.hasKey(str7)) {
            f4 = C1726w.m6665a(map.getDouble(str7));
        }
        float f8 = f4;
        String str8 = KEY_HIT_SLOP_WIDTH;
        float a2 = map.hasKey(str8) ? C1726w.m6665a(map.getDouble(str8)) : Float.NaN;
        String str9 = KEY_HIT_SLOP_HEIGHT;
        cVar.mo4611a(f5, f6, f7, f8, a2, map.hasKey(str9) ? C1726w.m6665a(map.getDouble(str9)) : Float.NaN);
    }

    /* access modifiers changed from: private */
    public void onStateChange(C1242c cVar, int i, int i2) {
        if (cVar.mo4641l() >= 0) {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).getEventDispatcher().mo5886a((C1635c) C1992l.m7590a(cVar, i, i2, findFactoryForHandler(cVar)));
        }
    }

    /* access modifiers changed from: private */
    public void onTouchEvent(C1242c cVar, MotionEvent motionEvent) {
        if (cVar.mo4641l() >= 0 && cVar.mo4640k() == 4) {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).getEventDispatcher().mo5886a((C1635c) C1981b.m7547a(cVar, findFactoryForHandler(cVar)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        r5 = r4.mEnqueuedRootViewInit;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (r4.mEnqueuedRootViewInit.contains(java.lang.Integer.valueOf(r1)) == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
        r4.mEnqueuedRootViewInit.add(java.lang.Integer.valueOf(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
        r0.addUIBlock(new com.swmansion.gesturehandler.react.C1985f(r4, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void tryInitializeHandlerForReactRootView(int r5) {
        /*
            r4 = this;
            com.facebook.react.bridge.ReactApplicationContext r0 = r4.getReactApplicationContext()
            java.lang.Class<com.facebook.react.uimanager.UIManagerModule> r1 = com.facebook.react.uimanager.UIManagerModule.class
            com.facebook.react.bridge.NativeModule r0 = r0.getNativeModule(r1)
            com.facebook.react.uimanager.UIManagerModule r0 = (com.facebook.react.uimanager.UIManagerModule) r0
            int r1 = r0.resolveRootTagFromReactTag(r5)
            r2 = 1
            if (r1 < r2) goto L_0x0061
            java.util.List<com.swmansion.gesturehandler.react.j> r2 = r4.mRoots
            monitor-enter(r2)
            r5 = 0
        L_0x0017:
            java.util.List<com.swmansion.gesturehandler.react.j> r3 = r4.mRoots     // Catch:{ all -> 0x005e }
            int r3 = r3.size()     // Catch:{ all -> 0x005e }
            if (r5 >= r3) goto L_0x0036
            java.util.List<com.swmansion.gesturehandler.react.j> r3 = r4.mRoots     // Catch:{ all -> 0x005e }
            java.lang.Object r3 = r3.get(r5)     // Catch:{ all -> 0x005e }
            com.swmansion.gesturehandler.react.j r3 = (com.swmansion.gesturehandler.react.C1989j) r3     // Catch:{ all -> 0x005e }
            c.a.m.P r3 = r3.mo7028a()     // Catch:{ all -> 0x005e }
            int r3 = r3.getRootViewTag()     // Catch:{ all -> 0x005e }
            if (r3 != r1) goto L_0x0033
            monitor-exit(r2)     // Catch:{ all -> 0x005e }
            return
        L_0x0033:
            int r5 = r5 + 1
            goto L_0x0017
        L_0x0036:
            monitor-exit(r2)     // Catch:{ all -> 0x005e }
            java.util.List<java.lang.Integer> r5 = r4.mEnqueuedRootViewInit
            monitor-enter(r5)
            java.util.List<java.lang.Integer> r2 = r4.mEnqueuedRootViewInit     // Catch:{ all -> 0x005b }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x005b }
            boolean r2 = r2.contains(r3)     // Catch:{ all -> 0x005b }
            if (r2 == 0) goto L_0x0048
            monitor-exit(r5)     // Catch:{ all -> 0x005b }
            return
        L_0x0048:
            java.util.List<java.lang.Integer> r2 = r4.mEnqueuedRootViewInit     // Catch:{ all -> 0x005b }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x005b }
            r2.add(r3)     // Catch:{ all -> 0x005b }
            monitor-exit(r5)     // Catch:{ all -> 0x005b }
            com.swmansion.gesturehandler.react.f r5 = new com.swmansion.gesturehandler.react.f
            r5.<init>(r4, r1)
            r0.addUIBlock(r5)
            return
        L_0x005b:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x005b }
            throw r0
        L_0x005e:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x005e }
            throw r5
        L_0x0061:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r0 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could find root view for a given ancestor with tag "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.react.RNGestureHandlerModule.tryInitializeHandlerForReactRootView(int):void");
    }

    @ReactMethod
    public void attachGestureHandler(int i, int i2) {
        tryInitializeHandlerForReactRootView(i2);
        if (!this.mRegistry.mo7024a(i, i2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Handler with tag ");
            sb.append(i);
            sb.append(" does not exists");
            throw new JSApplicationIllegalArgumentException(sb.toString());
        }
    }

    @ReactMethod
    public void createGestureHandler(String str, int i, ReadableMap readableMap) {
        int i2 = 0;
        while (true) {
            C1973b[] bVarArr = this.mHandlerFactories;
            if (i2 < bVarArr.length) {
                C1973b bVar = bVarArr[i2];
                if (bVar.mo6998a().equals(str)) {
                    C1242c a = bVar.mo6997a(getReactApplicationContext());
                    a.mo4616a(i);
                    a.mo4613a(this.mEventListener);
                    this.mRegistry.mo7023a(a);
                    this.mInteractionManager.mo7020a(a, readableMap);
                    bVar.mo7001a(a, readableMap);
                    return;
                }
                i2++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid handler name ");
                sb.append(str);
                throw new JSApplicationIllegalArgumentException(sb.toString());
            }
        }
    }

    @ReactMethod
    public void dropGestureHandler(int i) {
        this.mInteractionManager.mo7019a(i);
        this.mRegistry.mo7022a(i);
    }

    public Map getConstants() {
        Integer valueOf = Integer.valueOf(0);
        Integer valueOf2 = Integer.valueOf(2);
        Integer valueOf3 = Integer.valueOf(4);
        Integer valueOf4 = Integer.valueOf(3);
        Integer valueOf5 = Integer.valueOf(1);
        Integer num = valueOf2;
        Integer num2 = valueOf3;
        Integer num3 = valueOf5;
        Map a = C1397f.m5740a("UNDETERMINED", valueOf, "BEGAN", num, "ACTIVE", num2, "CANCELLED", valueOf4, "FAILED", num3, "END", Integer.valueOf(5));
        Integer num4 = valueOf5;
        Integer num5 = valueOf2;
        Integer num6 = valueOf3;
        return C1397f.m5736a("State", a, "Direction", C1397f.m5738a("RIGHT", num4, "LEFT", num5, "UP", num6, "DOWN", Integer.valueOf(8)));
    }

    public String getName() {
        return MODULE_NAME;
    }

    public C1987h getRegistry() {
        return this.mRegistry;
    }

    @ReactMethod
    public void handleClearJSResponder() {
    }

    @ReactMethod
    public void handleSetJSResponder(int i, boolean z) {
        if (this.mRegistry != null) {
            C1989j findRootHelperForViewAncestor = findRootHelperForViewAncestor(i);
            if (findRootHelperForViewAncestor != null) {
                findRootHelperForViewAncestor.mo7029a(i, z);
            }
        }
    }

    public void onCatalystInstanceDestroy() {
        this.mRegistry.mo7021a();
        this.mInteractionManager.mo7018a();
        synchronized (this.mRoots) {
            while (!this.mRoots.isEmpty()) {
                int size = this.mRoots.size();
                C1989j jVar = (C1989j) this.mRoots.get(0);
                C1156P a = jVar.mo7028a();
                if (a instanceof C1980a) {
                    ((C1980a) a).mo7017e();
                } else {
                    jVar.mo7032b();
                }
                if (this.mRoots.size() >= size) {
                    throw new IllegalStateException("Expected root helper to get unregistered while tearing down");
                }
            }
        }
        super.onCatalystInstanceDestroy();
    }

    public void registerRootHelper(C1989j jVar) {
        synchronized (this.mRoots) {
            if (!this.mRoots.contains(jVar)) {
                this.mRoots.add(jVar);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Root helper");
                sb.append(jVar);
                sb.append(" already registered");
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    public void unregisterRootHelper(C1989j jVar) {
        synchronized (this.mRoots) {
            this.mRoots.remove(jVar);
        }
    }

    @ReactMethod
    public void updateGestureHandler(int i, ReadableMap readableMap) {
        C1242c b = this.mRegistry.mo7025b(i);
        if (b != null) {
            C1973b findFactoryForHandler = findFactoryForHandler(b);
            if (findFactoryForHandler != null) {
                this.mInteractionManager.mo7019a(i);
                this.mInteractionManager.mo7020a(b, readableMap);
                findFactoryForHandler.mo7001a(b, readableMap);
            }
        }
    }
}
