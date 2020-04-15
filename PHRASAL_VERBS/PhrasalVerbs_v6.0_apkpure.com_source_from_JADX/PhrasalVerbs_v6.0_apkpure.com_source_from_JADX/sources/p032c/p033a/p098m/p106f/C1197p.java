package p032c.p033a.p098m.p106f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.timepicker.TimePickerDialogModule;
import javax.inject.Provider;

/* renamed from: c.a.m.f.p */
class C1197p implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f3940a;

    /* renamed from: b */
    final /* synthetic */ C1181B f3941b;

    C1197p(C1181B b, ReactApplicationContext reactApplicationContext) {
        this.f3941b = b;
        this.f3940a = reactApplicationContext;
    }

    public NativeModule get() {
        return new TimePickerDialogModule(this.f3940a);
    }
}
