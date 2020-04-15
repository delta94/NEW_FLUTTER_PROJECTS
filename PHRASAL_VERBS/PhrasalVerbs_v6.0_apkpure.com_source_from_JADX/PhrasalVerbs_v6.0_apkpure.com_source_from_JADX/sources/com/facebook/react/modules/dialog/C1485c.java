package com.facebook.react.modules.dialog;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.p029v4.app.C0272f;

/* renamed from: com.facebook.react.modules.dialog.c */
public class C1485c extends C0272f implements OnClickListener {

    /* renamed from: ha */
    private final C1481a f4588ha;

    public C1485c() {
        this.f4588ha = null;
    }

    @SuppressLint({"ValidFragment"})
    public C1485c(C1481a aVar, Bundle bundle) {
        this.f4588ha = aVar;
        mo1051m(bundle);
    }

    /* renamed from: n */
    public Dialog mo963n(Bundle bundle) {
        return C1483a.m5921a(mo1027d(), mo1042i(), this);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C1481a aVar = this.f4588ha;
        if (aVar != null) {
            aVar.onClick(dialogInterface, i);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C1481a aVar = this.f4588ha;
        if (aVar != null) {
            aVar.onDismiss(dialogInterface);
        }
    }
}
