package com.facebook.react.modules.fresco;

import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.modules.network.C1508a;
import com.facebook.react.modules.network.C1516i;
import com.facebook.react.modules.network.C1526r;
import java.util.HashSet;
import java.util.Set;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p059g.p060a.p061a.C0799c;
import p032c.p033a.p074i.p077b.p078a.C0889a;
import p032c.p033a.p074i.p082f.C0956l;
import p032c.p033a.p074i.p082f.C0956l.C0957a;
import p032c.p033a.p074i.p087k.C0994c;
import p032c.p033a.p074i.p090n.C1054da;
import p032c.p033a.p098m.p102d.p103a.C1176a;
import p032c.p033a.p098m.p104e.p105a.C1178a;

@C1176a(name = "FrescoModule", needsEagerInit = true)
public class FrescoModule extends ReactContextBaseJavaModule implements C1178a, LifecycleEventListener {
    public static final String NAME = "FrescoModule";
    private static boolean sHasBeenInitialized = false;
    private final boolean mClearOnDestroy;
    private C0956l mConfig;

    public FrescoModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, true, null);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z) {
        this(reactApplicationContext, z, null);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z, C0956l lVar) {
        super(reactApplicationContext);
        this.mClearOnDestroy = z;
        this.mConfig = lVar;
    }

    private static C0956l getDefaultConfig(ReactContext reactContext) {
        return getDefaultConfigBuilder(reactContext).mo4112a();
    }

    public static C0957a getDefaultConfigBuilder(ReactContext reactContext) {
        HashSet hashSet = new HashSet();
        hashSet.add(new C1488c());
        OkHttpClient a = C1526r.m6029a();
        ((C1508a) a.cookieJar()).mo5441a(new JavaNetCookieJar(new C1516i(reactContext)));
        C0957a a2 = C0889a.m3967a(reactContext.getApplicationContext(), a);
        a2.mo4109a((C1054da) new C1487b(a));
        a2.mo4111a(false);
        a2.mo4110a((Set<C0994c>) hashSet);
        return a2;
    }

    public static boolean hasBeenInitialized() {
        return sHasBeenInitialized;
    }

    public void clearSensitiveData() {
        C0799c.m3533a().mo4076a();
    }

    public String getName() {
        return NAME;
    }

    public void initialize() {
        super.initialize();
        getReactApplicationContext().addLifecycleEventListener(this);
        if (!hasBeenInitialized()) {
            if (this.mConfig == null) {
                this.mConfig = getDefaultConfig(getReactApplicationContext());
            }
            C0799c.m3535a(getReactApplicationContext().getApplicationContext(), this.mConfig);
            sHasBeenInitialized = true;
        } else if (this.mConfig != null) {
            C0727a.m3284d("ReactNative", "Fresco has already been initialized with a different config. The new Fresco configuration will be ignored!");
        }
        this.mConfig = null;
    }

    public void onHostDestroy() {
        if (hasBeenInitialized() && this.mClearOnDestroy) {
            C0799c.m3533a().mo4083c();
        }
    }

    public void onHostPause() {
    }

    public void onHostResume() {
    }
}
