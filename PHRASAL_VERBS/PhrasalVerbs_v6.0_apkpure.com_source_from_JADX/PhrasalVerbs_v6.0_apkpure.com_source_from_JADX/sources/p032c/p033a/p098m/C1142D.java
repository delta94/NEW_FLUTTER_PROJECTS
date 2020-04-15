package p032c.p033a.p098m;

import android.os.Process;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;

/* renamed from: c.a.m.D */
class C1142D implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1145G f3793a;

    C1142D(C1145G g) {
        this.f3793a = g;
    }

    public void run() {
        Process.setThreadPriority(0);
        ReactMarker.logMarker(ReactMarkerConstants.CHANGE_THREAD_PRIORITY, "js_default");
    }
}
