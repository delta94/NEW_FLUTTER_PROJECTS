package com.facebook.react.modules.datepicker;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.support.p029v4.app.C0272f;

@SuppressLint({"ValidFragment"})
/* renamed from: com.facebook.react.modules.datepicker.b */
public class C1473b extends C0272f {

    /* renamed from: ha */
    private OnDateSetListener f4543ha;

    /* renamed from: ia */
    private OnDismissListener f4544ia;

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ff  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.app.Dialog m5891a(android.os.Bundle r13, android.content.Context r14, android.app.DatePickerDialog.OnDateSetListener r15) {
        /*
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            if (r13 == 0) goto L_0x0015
            java.lang.String r1 = "date"
            boolean r2 = r13.containsKey(r1)
            if (r2 == 0) goto L_0x0015
            long r1 = r13.getLong(r1)
            r0.setTimeInMillis(r1)
        L_0x0015:
            r1 = 1
            int r6 = r0.get(r1)
            r8 = 2
            int r7 = r0.get(r8)
            r2 = 5
            int r9 = r0.get(r2)
            com.facebook.react.modules.datepicker.c r2 = com.facebook.react.modules.datepicker.C1474c.DEFAULT
            r3 = 0
            if (r13 == 0) goto L_0x003f
            java.lang.String r4 = "mode"
            java.lang.String r5 = r13.getString(r4, r3)
            if (r5 == 0) goto L_0x003f
            java.lang.String r2 = r13.getString(r4)
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r2 = r2.toUpperCase(r4)
            com.facebook.react.modules.datepicker.c r2 = com.facebook.react.modules.datepicker.C1474c.valueOf(r2)
        L_0x003f:
            r10 = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            r11 = 0
            if (r2 < r4) goto L_0x0098
            int[] r2 = com.facebook.react.modules.datepicker.C1472a.f4542a
            int r4 = r10.ordinal()
            r2 = r2[r4]
            java.lang.String r4 = "style"
            if (r2 == r1) goto L_0x0080
            if (r2 == r8) goto L_0x0068
            r1 = 3
            if (r2 == r1) goto L_0x005b
            r1 = r3
            goto L_0x00c7
        L_0x005b:
            com.facebook.react.modules.datepicker.d r1 = new com.facebook.react.modules.datepicker.d
            r2 = r1
            r3 = r14
            r4 = r15
            r5 = r6
            r6 = r7
            r7 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x00c7
        L_0x0068:
            com.facebook.react.modules.datepicker.d r1 = new com.facebook.react.modules.datepicker.d
            android.content.res.Resources r2 = r14.getResources()
            java.lang.String r3 = r14.getPackageName()
            java.lang.String r5 = "SpinnerDatePickerDialog"
            int r4 = r2.getIdentifier(r5, r4, r3)
            r2 = r1
            r3 = r14
            r5 = r15
            r8 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L_0x00c7
        L_0x0080:
            com.facebook.react.modules.datepicker.d r1 = new com.facebook.react.modules.datepicker.d
            android.content.res.Resources r2 = r14.getResources()
            java.lang.String r3 = r14.getPackageName()
            java.lang.String r5 = "CalendarDatePickerDialog"
            int r4 = r2.getIdentifier(r5, r4, r3)
            r2 = r1
            r3 = r14
            r5 = r15
            r8 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L_0x00c7
        L_0x0098:
            com.facebook.react.modules.datepicker.d r12 = new com.facebook.react.modules.datepicker.d
            r2 = r12
            r3 = r14
            r4 = r15
            r5 = r6
            r6 = r7
            r7 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            int[] r14 = com.facebook.react.modules.datepicker.C1472a.f4542a
            int r15 = r10.ordinal()
            r14 = r14[r15]
            if (r14 == r1) goto L_0x00b8
            if (r14 == r8) goto L_0x00b0
            goto L_0x00c6
        L_0x00b0:
            android.widget.DatePicker r14 = r12.getDatePicker()
            r14.setCalendarViewShown(r11)
            goto L_0x00c6
        L_0x00b8:
            android.widget.DatePicker r14 = r12.getDatePicker()
            r14.setCalendarViewShown(r1)
            android.widget.DatePicker r14 = r12.getDatePicker()
            r14.setSpinnersShown(r11)
        L_0x00c6:
            r1 = r12
        L_0x00c7:
            android.widget.DatePicker r14 = r1.getDatePicker()
            r15 = 14
            r2 = 13
            r3 = 12
            r4 = 11
            if (r13 == 0) goto L_0x00f5
            java.lang.String r5 = "minDate"
            boolean r6 = r13.containsKey(r5)
            if (r6 == 0) goto L_0x00f5
            long r5 = r13.getLong(r5)
            r0.setTimeInMillis(r5)
            r0.set(r4, r11)
            r0.set(r3, r11)
            r0.set(r2, r11)
            r0.set(r15, r11)
            long r5 = r0.getTimeInMillis()
            goto L_0x00fa
        L_0x00f5:
            r5 = -2208988800001(0xfffffdfdae01dbff, double:NaN)
        L_0x00fa:
            r14.setMinDate(r5)
            if (r13 == 0) goto L_0x0127
            java.lang.String r5 = "maxDate"
            boolean r6 = r13.containsKey(r5)
            if (r6 == 0) goto L_0x0127
            long r5 = r13.getLong(r5)
            r0.setTimeInMillis(r5)
            r13 = 23
            r0.set(r4, r13)
            r13 = 59
            r0.set(r3, r13)
            r0.set(r2, r13)
            r13 = 999(0x3e7, float:1.4E-42)
            r0.set(r15, r13)
            long r2 = r0.getTimeInMillis()
            r14.setMaxDate(r2)
        L_0x0127:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.datepicker.C1473b.m5891a(android.os.Bundle, android.content.Context, android.app.DatePickerDialog$OnDateSetListener):android.app.Dialog");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5353a(OnDateSetListener onDateSetListener) {
        this.f4543ha = onDateSetListener;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5354a(OnDismissListener onDismissListener) {
        this.f4544ia = onDismissListener;
    }

    /* renamed from: n */
    public Dialog mo963n(Bundle bundle) {
        return m5891a(mo1042i(), mo1027d(), this.f4543ha);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        OnDismissListener onDismissListener = this.f4544ia;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}
