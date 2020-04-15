package com.facebook.react.modules.datepicker;

import android.app.DatePickerDialog.OnDateSetListener;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.support.p029v4.app.C0272f;
import android.support.p029v4.app.C0281l;
import android.support.p029v4.app.C0287p;
import android.widget.DatePicker;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "DatePickerAndroid")
public class DatePickerDialogModule extends ReactContextBaseJavaModule {
    static final String ACTION_DATE_SET = "dateSetAction";
    static final String ACTION_DISMISSED = "dismissedAction";
    static final String ARG_DATE = "date";
    static final String ARG_MAXDATE = "maxDate";
    static final String ARG_MINDATE = "minDate";
    static final String ARG_MODE = "mode";
    private static final String ERROR_NO_ACTIVITY = "E_NO_ACTIVITY";
    public static final String FRAGMENT_TAG = "DatePickerAndroid";

    /* renamed from: com.facebook.react.modules.datepicker.DatePickerDialogModule$a */
    private class C1471a implements OnDateSetListener, OnDismissListener {

        /* renamed from: a */
        private final Promise f4539a;

        /* renamed from: b */
        private boolean f4540b = false;

        public C1471a(Promise promise) {
            this.f4539a = promise;
        }

        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            if (!this.f4540b && DatePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("action", DatePickerDialogModule.ACTION_DATE_SET);
                writableNativeMap.putInt("year", i);
                writableNativeMap.putInt("month", i2);
                writableNativeMap.putInt("day", i3);
                this.f4539a.resolve(writableNativeMap);
                this.f4540b = true;
            }
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (!this.f4540b && DatePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("action", DatePickerDialogModule.ACTION_DISMISSED);
                this.f4539a.resolve(writableNativeMap);
                this.f4540b = true;
            }
        }
    }

    public DatePickerDialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private Bundle createFragmentArguments(ReadableMap readableMap) {
        Bundle bundle = new Bundle();
        String str = ARG_DATE;
        if (readableMap.hasKey(str) && !readableMap.isNull(str)) {
            bundle.putLong(str, (long) readableMap.getDouble(str));
        }
        String str2 = ARG_MINDATE;
        if (readableMap.hasKey(str2) && !readableMap.isNull(str2)) {
            bundle.putLong(str2, (long) readableMap.getDouble(str2));
        }
        String str3 = ARG_MAXDATE;
        if (readableMap.hasKey(str3) && !readableMap.isNull(str3)) {
            bundle.putLong(str3, (long) readableMap.getDouble(str3));
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
            promise.reject(ERROR_NO_ACTIVITY, "Tried to open a DatePicker dialog while not attached to an Activity");
            return;
        }
        C0287p e = lVar.mo1076e();
        String str = FRAGMENT_TAG;
        C0272f fVar = (C0272f) e.mo1143a(str);
        if (fVar != null) {
            fVar.mo956ba();
        }
        C1473b bVar = new C1473b();
        if (readableMap != null) {
            bVar.mo1051m(createFragmentArguments(readableMap));
        }
        C1471a aVar = new C1471a(promise);
        bVar.mo5354a((OnDismissListener) aVar);
        bVar.mo5353a((OnDateSetListener) aVar);
        bVar.mo954a(e, str);
    }
}
