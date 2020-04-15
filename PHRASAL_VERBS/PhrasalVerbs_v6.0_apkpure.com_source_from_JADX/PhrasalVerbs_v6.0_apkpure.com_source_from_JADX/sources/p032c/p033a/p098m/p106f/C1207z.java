package p032c.p033a.p098m.p106f;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.datepicker.DatePickerDialogModule;
import javax.inject.Provider;

/* renamed from: c.a.m.f.z */
class C1207z implements Provider<NativeModule> {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f3960a;

    /* renamed from: b */
    final /* synthetic */ C1181B f3961b;

    C1207z(C1181B b, ReactApplicationContext reactApplicationContext) {
        this.f3961b = b;
        this.f3960a = reactApplicationContext;
    }

    public NativeModule get() {
        return new DatePickerDialogModule(this.f3960a);
    }
}
