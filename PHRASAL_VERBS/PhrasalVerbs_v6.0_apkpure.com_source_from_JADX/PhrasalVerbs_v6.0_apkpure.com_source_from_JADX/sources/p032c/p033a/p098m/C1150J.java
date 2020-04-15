package p032c.p033a.p098m;

import android.app.Application;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.C1414f;
import com.facebook.react.uimanager.C1589V;
import java.util.List;
import p032c.p033a.p094k.p095a.C1136a;

/* renamed from: c.a.m.J */
public abstract class C1150J {

    /* renamed from: a */
    private final Application f3844a;

    /* renamed from: b */
    private C1145G f3845b;

    protected C1150J(Application application) {
        this.f3844a = application;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1145G mo4453a() {
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_START);
        C1148H a = C1145G.m5058a();
        a.mo4439a(this.f3844a);
        a.mo4450c(mo4457e());
        a.mo4448a(mo4463k());
        a.mo4445a(mo4461i());
        a.mo4443a(mo4458f());
        a.mo4446a(mo4462j());
        a.mo4442a(mo4456d());
        a.mo4444a(LifecycleState.BEFORE_CREATE);
        for (C1151K a2 : mo4459g()) {
            a.mo4440a(a2);
        }
        String c = mo4455c();
        if (c != null) {
            a.mo4449b(c);
        } else {
            String b = mo4454b();
            C1136a.m5053a(b);
            a.mo4447a(b);
        }
        C1145G a3 = a.mo4438a();
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_END);
        return a3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo4454b() {
        return "index.android.bundle";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo4455c() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public JSIModulePackage mo4456d() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract String mo4457e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public JavaScriptExecutorFactory mo4458f() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract List<C1151K> mo4459g();

    /* renamed from: h */
    public C1145G mo4460h() {
        if (this.f3845b == null) {
            ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_START);
            this.f3845b = mo4453a();
            ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_END);
        }
        return this.f3845b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C1414f mo4461i() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C1589V mo4462j() {
        return new C1589V();
    }

    /* renamed from: k */
    public abstract boolean mo4463k();

    /* renamed from: l */
    public boolean mo4464l() {
        return this.f3845b != null;
    }
}
