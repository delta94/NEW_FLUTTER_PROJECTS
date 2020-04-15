package p032c.p033a.p098m;

import android.app.Activity;
import android.app.Application;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.C1414f;
import com.facebook.react.devsupport.p118a.C1407a;
import com.facebook.react.jscexecutor.C1435a;
import com.facebook.react.modules.core.C1460c;
import com.facebook.react.modules.systeminfo.C1554a;
import com.facebook.react.uimanager.C1589V;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p032c.p033a.p094k.p095a.C1136a;

/* renamed from: c.a.m.H */
public class C1148H {

    /* renamed from: a */
    private final List<C1151K> f3824a = new ArrayList();

    /* renamed from: b */
    private String f3825b;

    /* renamed from: c */
    private JSBundleLoader f3826c;

    /* renamed from: d */
    private String f3827d;

    /* renamed from: e */
    private NotThreadSafeBridgeIdleDebugListener f3828e;

    /* renamed from: f */
    private Application f3829f;

    /* renamed from: g */
    private boolean f3830g;

    /* renamed from: h */
    private LifecycleState f3831h;

    /* renamed from: i */
    private C1589V f3832i;

    /* renamed from: j */
    private NativeModuleCallExceptionHandler f3833j;

    /* renamed from: k */
    private Activity f3834k;

    /* renamed from: l */
    private C1460c f3835l;

    /* renamed from: m */
    private C1414f f3836m;

    /* renamed from: n */
    private boolean f3837n;

    /* renamed from: o */
    private C1407a f3838o;

    /* renamed from: p */
    private JavaScriptExecutorFactory f3839p;

    /* renamed from: q */
    private int f3840q = 1;

    /* renamed from: r */
    private int f3841r = -1;

    /* renamed from: s */
    private JSIModulePackage f3842s;

    /* renamed from: t */
    private Map<String, Object> f3843t;

    C1148H() {
    }

    /* renamed from: a */
    public C1145G mo4438a() {
        JSBundleLoader jSBundleLoader;
        C1136a.m5054a(this.f3829f, "Application property has not been set with this builder");
        boolean z = true;
        C1136a.m5056a((!this.f3830g && this.f3825b == null && this.f3826c == null) ? false : true, "JS Bundle File or Asset URL has to be provided when dev support is disabled");
        if (this.f3827d == null && this.f3825b == null && this.f3826c == null) {
            z = false;
        }
        C1136a.m5056a(z, "Either MainModulePath or JS Bundle File needs to be provided");
        if (this.f3832i == null) {
            this.f3832i = new C1589V();
        }
        String packageName = this.f3829f.getPackageName();
        String a = C1554a.m6070a();
        Application application = this.f3829f;
        Activity activity = this.f3834k;
        C1460c cVar = this.f3835l;
        JavaScriptExecutorFactory javaScriptExecutorFactory = this.f3839p;
        if (javaScriptExecutorFactory == null) {
            javaScriptExecutorFactory = new C1435a(packageName, a);
        }
        JavaScriptExecutorFactory javaScriptExecutorFactory2 = javaScriptExecutorFactory;
        if (this.f3826c == null) {
            String str = this.f3825b;
            if (str != null) {
                jSBundleLoader = JSBundleLoader.createAssetLoader(this.f3829f, str, false);
                JSBundleLoader jSBundleLoader2 = jSBundleLoader;
                String str2 = this.f3827d;
                List<C1151K> list = this.f3824a;
                boolean z2 = this.f3830g;
                NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener = this.f3828e;
                LifecycleState lifecycleState = this.f3831h;
                C1136a.m5054a(lifecycleState, "Initial lifecycle state was not set");
                C1145G g = new C1145G(application, activity, cVar, javaScriptExecutorFactory2, jSBundleLoader2, str2, list, z2, notThreadSafeBridgeIdleDebugListener, lifecycleState, this.f3832i, this.f3833j, this.f3836m, this.f3837n, this.f3838o, this.f3840q, this.f3841r, this.f3842s, this.f3843t);
                return g;
            }
        }
        jSBundleLoader = this.f3826c;
        JSBundleLoader jSBundleLoader22 = jSBundleLoader;
        String str22 = this.f3827d;
        List<C1151K> list2 = this.f3824a;
        boolean z22 = this.f3830g;
        NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener2 = this.f3828e;
        LifecycleState lifecycleState2 = this.f3831h;
        C1136a.m5054a(lifecycleState2, "Initial lifecycle state was not set");
        C1145G g2 = new C1145G(application, activity, cVar, javaScriptExecutorFactory2, jSBundleLoader22, str22, list2, z22, notThreadSafeBridgeIdleDebugListener2, lifecycleState2, this.f3832i, this.f3833j, this.f3836m, this.f3837n, this.f3838o, this.f3840q, this.f3841r, this.f3842s, this.f3843t);
        return g2;
    }

    /* renamed from: a */
    public C1148H mo4439a(Application application) {
        this.f3829f = application;
        return this;
    }

    /* renamed from: a */
    public C1148H mo4440a(C1151K k) {
        this.f3824a.add(k);
        return this;
    }

    /* renamed from: a */
    public C1148H mo4441a(JSBundleLoader jSBundleLoader) {
        this.f3826c = jSBundleLoader;
        this.f3825b = null;
        return this;
    }

    /* renamed from: a */
    public C1148H mo4442a(JSIModulePackage jSIModulePackage) {
        this.f3842s = jSIModulePackage;
        return this;
    }

    /* renamed from: a */
    public C1148H mo4443a(JavaScriptExecutorFactory javaScriptExecutorFactory) {
        this.f3839p = javaScriptExecutorFactory;
        return this;
    }

    /* renamed from: a */
    public C1148H mo4444a(LifecycleState lifecycleState) {
        this.f3831h = lifecycleState;
        return this;
    }

    /* renamed from: a */
    public C1148H mo4445a(C1414f fVar) {
        this.f3836m = fVar;
        return this;
    }

    /* renamed from: a */
    public C1148H mo4446a(C1589V v) {
        this.f3832i = v;
        return this;
    }

    /* renamed from: a */
    public C1148H mo4447a(String str) {
        String str2;
        if (str == null) {
            str2 = null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("assets://");
            sb.append(str);
            str2 = sb.toString();
        }
        this.f3825b = str2;
        this.f3826c = null;
        return this;
    }

    /* renamed from: a */
    public C1148H mo4448a(boolean z) {
        this.f3830g = z;
        return this;
    }

    /* renamed from: b */
    public C1148H mo4449b(String str) {
        if (str.startsWith("assets://")) {
            this.f3825b = str;
            this.f3826c = null;
            return this;
        }
        mo4441a(JSBundleLoader.createFileLoader(str));
        return this;
    }

    /* renamed from: c */
    public C1148H mo4450c(String str) {
        this.f3827d = str;
        return this;
    }
}
