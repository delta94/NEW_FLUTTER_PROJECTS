package p032c.p033a.p098m;

import android.view.KeyEvent;
import android.view.View;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.C1397f;
import com.facebook.react.common.C1397f.C1398a;
import java.util.Map;

/* renamed from: c.a.m.t */
public class C1233t {

    /* renamed from: a */
    private static final Map<Integer, String> f3994a;

    /* renamed from: b */
    private int f3995b = -1;

    /* renamed from: c */
    private final C1156P f3996c;

    static {
        C1398a a = C1397f.m5734a();
        String str = "select";
        a.mo5183a(Integer.valueOf(23), str);
        a.mo5183a(Integer.valueOf(66), str);
        a.mo5183a(Integer.valueOf(62), str);
        a.mo5183a(Integer.valueOf(85), "playPause");
        a.mo5183a(Integer.valueOf(89), "rewind");
        a.mo5183a(Integer.valueOf(90), "fastForward");
        a.mo5183a(Integer.valueOf(19), "up");
        a.mo5183a(Integer.valueOf(22), "right");
        a.mo5183a(Integer.valueOf(20), "down");
        a.mo5183a(Integer.valueOf(21), "left");
        f3994a = a.mo5184a();
    }

    C1233t(C1156P p) {
        this.f3996c = p;
    }

    /* renamed from: a */
    private void m5263a(String str, int i) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("eventType", str);
        if (i != -1) {
            writableNativeMap.putInt("tag", i);
        }
        this.f3996c.mo4476a("onHWKeyEvent", (WritableMap) writableNativeMap);
    }

    /* renamed from: a */
    public void mo4598a() {
        int i = this.f3995b;
        if (i != -1) {
            m5263a("blur", i);
        }
        this.f3995b = -1;
    }

    /* renamed from: a */
    public void mo4599a(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 1 && f3994a.containsKey(Integer.valueOf(keyCode))) {
            m5263a((String) f3994a.get(Integer.valueOf(keyCode)), this.f3995b);
        }
    }

    /* renamed from: a */
    public void mo4600a(View view) {
        if (this.f3995b != view.getId()) {
            int i = this.f3995b;
            if (i != -1) {
                m5263a("blur", i);
            }
            this.f3995b = view.getId();
            m5263a("focus", view.getId());
        }
    }
}
