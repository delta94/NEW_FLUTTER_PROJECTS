package com.facebook.react.modules.timepicker;

import android.app.Dialog;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p029v4.app.C0272f;
import android.text.format.DateFormat;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: com.facebook.react.modules.timepicker.b */
public class C1558b extends C0272f {

    /* renamed from: ha */
    private OnTimeSetListener f4732ha;

    /* renamed from: ia */
    private OnDismissListener f4733ia;

    /* renamed from: a */
    static Dialog m6072a(Bundle bundle, Context context, OnTimeSetListener onTimeSetListener) {
        Bundle bundle2 = bundle;
        Calendar instance = Calendar.getInstance();
        int i = instance.get(11);
        int i2 = instance.get(12);
        boolean is24HourFormat = DateFormat.is24HourFormat(context);
        C1559c cVar = C1559c.DEFAULT;
        if (bundle2 != null) {
            String str = "mode";
            if (bundle.getString(str, null) != null) {
                cVar = C1559c.valueOf(bundle.getString(str).toUpperCase(Locale.US));
            }
        }
        if (bundle2 != null) {
            i = bundle.getInt("hour", instance.get(11));
            i2 = bundle.getInt("minute", instance.get(12));
            is24HourFormat = bundle.getBoolean("is24Hour", DateFormat.is24HourFormat(context));
        }
        if (VERSION.SDK_INT >= 21) {
            String str2 = "style";
            if (cVar == C1559c.CLOCK) {
                Context context2 = context;
                C1557a aVar = new C1557a(context2, context.getResources().getIdentifier("ClockTimePickerDialog", str2, context.getPackageName()), onTimeSetListener, i, i2, is24HourFormat);
                return aVar;
            } else if (cVar == C1559c.SPINNER) {
                Context context3 = context;
                C1557a aVar2 = new C1557a(context3, context.getResources().getIdentifier("SpinnerTimePickerDialog", str2, context.getPackageName()), onTimeSetListener, i, i2, is24HourFormat);
                return aVar2;
            }
        }
        C1557a aVar3 = new C1557a(context, onTimeSetListener, i, i2, is24HourFormat);
        return aVar3;
    }

    /* renamed from: a */
    public void mo5515a(OnTimeSetListener onTimeSetListener) {
        this.f4732ha = onTimeSetListener;
    }

    /* renamed from: a */
    public void mo5516a(OnDismissListener onDismissListener) {
        this.f4733ia = onDismissListener;
    }

    /* renamed from: n */
    public Dialog mo963n(Bundle bundle) {
        return m6072a(mo1042i(), mo1027d(), this.f4732ha);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        OnDismissListener onDismissListener = this.f4733ia;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}
