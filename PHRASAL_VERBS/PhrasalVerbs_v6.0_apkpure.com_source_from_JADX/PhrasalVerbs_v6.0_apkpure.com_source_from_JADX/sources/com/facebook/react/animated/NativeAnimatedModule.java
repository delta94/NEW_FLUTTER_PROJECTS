package com.facebook.react.animated;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.core.C1458b.C1459a;
import com.facebook.react.modules.core.C1466i;
import com.facebook.react.modules.core.C1466i.C1467a;
import com.facebook.react.uimanager.C1632ea;
import com.facebook.react.uimanager.C1683j;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.ArrayList;
import p032c.p033a.p094k.p095a.C1136a;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "NativeAnimatedModule")
public class NativeAnimatedModule extends ReactContextBaseJavaModule implements LifecycleEventListener, C1632ea {
    public static final String NAME = "NativeAnimatedModule";
    /* access modifiers changed from: private */
    public final C1683j mAnimatedFrameCallback;
    private C1312H mNodesManager;
    private ArrayList<C1320a> mOperations = new ArrayList<>();
    private ArrayList<C1320a> mPreOperations = new ArrayList<>();
    /* access modifiers changed from: private */
    public final C1466i mReactChoreographer = C1466i.m5877a();

    /* renamed from: com.facebook.react.animated.NativeAnimatedModule$a */
    private interface C1320a {
        /* renamed from: a */
        void mo4803a(C1312H h);
    }

    public NativeAnimatedModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mAnimatedFrameCallback = new C1348v(this, reactApplicationContext);
    }

    private void clearFrameCallback() {
        C1466i iVar = this.mReactChoreographer;
        C1136a.m5053a(iVar);
        iVar.mo5344b(C1467a.NATIVE_ANIMATED_MODULE, this.mAnimatedFrameCallback);
    }

    private void enqueueFrameCallback() {
        C1466i iVar = this.mReactChoreographer;
        C1136a.m5053a(iVar);
        iVar.mo5342a(C1467a.NATIVE_ANIMATED_MODULE, (C1459a) this.mAnimatedFrameCallback);
    }

    /* access modifiers changed from: private */
    public C1312H getNodesManager() {
        if (this.mNodesManager == null) {
            this.mNodesManager = new C1312H((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class));
        }
        return this.mNodesManager;
    }

    @ReactMethod
    public void addAnimatedEventToView(int i, String str, ReadableMap readableMap) {
        this.mOperations.add(new C1349w(this, i, str, readableMap));
    }

    @ReactMethod
    public void connectAnimatedNodeToView(int i, int i2) {
        this.mOperations.add(new C1345s(this, i, i2));
    }

    @ReactMethod
    public void connectAnimatedNodes(int i, int i2) {
        this.mOperations.add(new C1343q(this, i, i2));
    }

    @ReactMethod
    public void createAnimatedNode(int i, ReadableMap readableMap) {
        this.mOperations.add(new C1305A(this, i, readableMap));
    }

    @ReactMethod
    public void disconnectAnimatedNodeFromView(int i, int i2) {
        this.mPreOperations.add(new C1346t(this, i, i2));
        this.mOperations.add(new C1347u(this, i, i2));
    }

    @ReactMethod
    public void disconnectAnimatedNodes(int i, int i2) {
        this.mOperations.add(new C1344r(this, i, i2));
    }

    @ReactMethod
    public void dropAnimatedNode(int i) {
        this.mOperations.add(new C1309E(this, i));
    }

    @ReactMethod
    public void extractAnimatedNodeOffset(int i) {
        this.mOperations.add(new C1340n(this, i));
    }

    @ReactMethod
    public void flattenAnimatedNodeOffset(int i) {
        this.mOperations.add(new C1339m(this, i));
    }

    public String getName() {
        return NAME;
    }

    public void initialize() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        UIManagerModule uIManagerModule = (UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class);
        reactApplicationContext.addLifecycleEventListener(this);
        uIManagerModule.addUIManagerListener(this);
    }

    public void onHostDestroy() {
    }

    public void onHostPause() {
        clearFrameCallback();
    }

    public void onHostResume() {
        enqueueFrameCallback();
    }

    @ReactMethod
    public void removeAnimatedEventFromView(int i, String str, int i2) {
        this.mOperations.add(new C1350x(this, i, str, i2));
    }

    @ReactMethod
    public void setAnimatedNodeOffset(int i, double d) {
        this.mOperations.add(new C1338l(this, i, d));
    }

    @ReactMethod
    public void setAnimatedNodeValue(int i, double d) {
        this.mOperations.add(new C1310F(this, i, d));
    }

    public void setNodesManager(C1312H h) {
        this.mNodesManager = h;
    }

    @ReactMethod
    public void startAnimatingNode(int i, int i2, ReadableMap readableMap, Callback callback) {
        ArrayList<C1320a> arrayList = this.mOperations;
        C1341o oVar = new C1341o(this, i, i2, readableMap, callback);
        arrayList.add(oVar);
    }

    @ReactMethod
    public void startListeningToAnimatedNodeValue(int i) {
        this.mOperations.add(new C1307C(this, i, new C1306B(this, i)));
    }

    @ReactMethod
    public void stopAnimation(int i) {
        this.mOperations.add(new C1342p(this, i));
    }

    @ReactMethod
    public void stopListeningToAnimatedNodeValue(int i) {
        this.mOperations.add(new C1308D(this, i));
    }

    public void willDispatchViewUpdates(UIManagerModule uIManagerModule) {
        if (!this.mOperations.isEmpty() || !this.mPreOperations.isEmpty()) {
            ArrayList<C1320a> arrayList = this.mPreOperations;
            ArrayList<C1320a> arrayList2 = this.mOperations;
            this.mPreOperations = new ArrayList<>();
            this.mOperations = new ArrayList<>();
            uIManagerModule.prependUIBlock(new C1351y(this, arrayList));
            uIManagerModule.addUIBlock(new C1352z(this, arrayList2));
        }
    }
}
