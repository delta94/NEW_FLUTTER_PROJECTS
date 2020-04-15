package com.facebook.react.modules.datepicker;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Context;
import android.os.Build.VERSION;

/* renamed from: com.facebook.react.modules.datepicker.d */
public class C1475d extends DatePickerDialog {
    public C1475d(Context context, int i, OnDateSetListener onDateSetListener, int i2, int i3, int i4) {
        super(context, i, onDateSetListener, i2, i3, i4);
    }

    public C1475d(Context context, OnDateSetListener onDateSetListener, int i, int i2, int i3) {
        super(context, onDateSetListener, i, i2, i3);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        if (VERSION.SDK_INT > 19) {
            super.onStop();
        }
    }
}
