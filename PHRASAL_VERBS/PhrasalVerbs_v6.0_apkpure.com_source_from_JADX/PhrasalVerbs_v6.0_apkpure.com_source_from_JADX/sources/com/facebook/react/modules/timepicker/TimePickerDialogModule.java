package com.facebook.react.modules.timepicker;

import android.app.TimePickerDialog.OnTimeSetListener;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.support.p029v4.app.C0272f;
import android.support.p029v4.app.C0281l;
import android.support.p029v4.app.C0287p;
import android.widget.TimePicker;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "TimePickerAndroid")
public class TimePickerDialogModule extends ReactContextBaseJavaModule {
    static final String ACTION_DISMISSED = "dismissedAction";
    static final String ACTION_TIME_SET = "timeSetAction";
    static final String ARG_HOUR = "hour";
    static final String ARG_IS24HOUR = "is24Hour";
    static final String ARG_MINUTE = "minute";
    static final String ARG_MODE = "mode";
    private static final String ERROR_NO_ACTIVITY = "E_NO_ACTIVITY";
    public static final String FRAGMENT_TAG = "TimePickerAndroid";

    /* renamed from: com.facebook.react.modules.timepicker.TimePickerDialogModule$a */
    private class C1556a implements OnTimeSetListener, OnDismissListener {

        /* renamed from: a */
        private final Promise f4729a;

        /* renamed from: b */
        private boolean f4730b = false;

        public C1556a(Promise promise) {
            this.f4729a = promise;
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (!this.f4730b && TimePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("action", TimePickerDialogModule.ACTION_DISMISSED);
                this.f4729a.resolve(writableNativeMap);
                this.f4730b = true;
            }
        }

        public void onTimeSet(TimePicker timePicker, int i, int i2) {
            if (!this.f4730b && TimePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("action", TimePickerDialogModule.ACTION_TIME_SET);
                writableNativeMap.putInt(TimePickerDialogModule.ARG_HOUR, i);
                writableNativeMap.putInt(TimePickerDialogModule.ARG_MINUTE, i2);
                this.f4729a.resolve(writableNativeMap);
                this.f4730b = true;
            }
        }
    }

    public TimePickerDialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private Bundle createFragmentArguments(ReadableMap readableMap) {
        Bundle bundle = new Bundle();
        String str = ARG_HOUR;
        if (readableMap.hasKey(str) && !readableMap.isNull(str)) {
            bundle.putInt(str, readableMap.getInt(str));
        }
        String str2 = ARG_MINUTE;
        if (readableMap.hasKey(str2) && !readableMap.isNull(str2)) {
            bundle.putInt(str2, readableMap.getInt(str2));
        }
        String str3 = ARG_IS24HOUR;
        if (readableMap.hasKey(str3) && !readableMap.isNull(str3)) {
            bundle.putBoolean(str3, readableMap.getBoolean(str3));
        }
        String str4 = ARG_MODE;
        if (readableMap.hasKey(str4) && !readableMap.isNull(str4)) {
            bundle.putString(str4, readableMap.getString(str4));
        }
        return bundle;
    }

    public String getName() {
        return FRAGMENT_TAG;
    }

    @ReactMethod
    public void open(ReadableMap readableMap, Promise promise) {
        C0281l lVar = (C0281l) getCurrentActivity();
        if (lVar == null) {
            promise.reject(ERROR_NO_ACTIVITY, "Tried to open a TimePicker dialog while not attached to an Activity");
            return;
        }
        C0287p e = lVar.mo1076e();
        String str = FRAGMENT_TAG;
        C0272f fVar = (C0272f) e.mo1143a(str);
        if (fVar != null) {
            fVar.mo956ba();
        }
        C1558b bVar = new C1558b();
        if (readableMap != null) {
            bVar.mo1051m(createFragmentArguments(readableMap));
        }
        C1556a aVar = new C1556a(promise);
        bVar.mo5516a((OnDismissListener) aVar);
        bVar.mo5515a((OnTimeSetListener) aVar);
        bVar.mo954a(e, str);
    }
}
