package com.facebook.react.modules.debug;

import android.widget.Toast;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.modules.debug.C1479c.C1480a;
import com.facebook.react.modules.debug.p120a.C1477a;
import java.util.Locale;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "AnimationsDebugModule")
public class AnimationsDebugModule extends ReactContextBaseJavaModule {
    protected static final String NAME = "AnimationsDebugModule";
    private final C1477a mCatalystSettings;
    private C1479c mFrameCallback;

    public AnimationsDebugModule(ReactApplicationContext reactApplicationContext, C1477a aVar) {
        super(reactApplicationContext);
        this.mCatalystSettings = aVar;
    }

    public String getName() {
        return NAME;
    }

    public void onCatalystInstanceDestroy() {
        C1479c cVar = this.mFrameCallback;
        if (cVar != null) {
            cVar.mo5373j();
            this.mFrameCallback = null;
        }
    }

    @ReactMethod
    public void startRecordingFps() {
        C1477a aVar = this.mCatalystSettings;
        if (aVar != null && aVar.mo5361a()) {
            if (this.mFrameCallback == null) {
                this.mFrameCallback = new C1479c(getReactApplicationContext());
                this.mFrameCallback.mo5372i();
                return;
            }
            throw new JSApplicationCausedNativeException("Already recording FPS!");
        }
    }

    @ReactMethod
    public void stopRecordingFps(double d) {
        C1479c cVar = this.mFrameCallback;
        if (cVar != null) {
            cVar.mo5373j();
            C1480a b = this.mFrameCallback.mo5365b((long) d);
            if (b == null) {
                Toast.makeText(getReactApplicationContext(), "Unable to get FPS info", 1);
            } else {
                String format = String.format(Locale.US, "FPS: %.2f, %d frames (%d expected)", new Object[]{Double.valueOf(b.f4573e), Integer.valueOf(b.f4569a), Integer.valueOf(b.f4571c)});
                String format2 = String.format(Locale.US, "JS FPS: %.2f, %d frames (%d expected)", new Object[]{Double.valueOf(b.f4574f), Integer.valueOf(b.f4570b), Integer.valueOf(b.f4571c)});
                StringBuilder sb = new StringBuilder();
                sb.append(format);
                sb.append("\n");
                sb.append(format2);
                sb.append("\nTotal Time MS: ");
                sb.append(String.format(Locale.US, "%d", new Object[]{Integer.valueOf(b.f4575g)}));
                String sb2 = sb.toString();
                C0727a.m3266a("ReactNative", sb2);
                Toast.makeText(getReactApplicationContext(), sb2, 1).show();
            }
            this.mFrameCallback = null;
        }
    }
}
