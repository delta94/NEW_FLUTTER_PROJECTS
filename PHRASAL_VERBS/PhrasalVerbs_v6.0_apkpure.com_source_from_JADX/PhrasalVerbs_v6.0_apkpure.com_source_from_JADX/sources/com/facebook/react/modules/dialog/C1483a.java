package com.facebook.react.modules.dialog;

import android.annotation.SuppressLint;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;

/* renamed from: com.facebook.react.modules.dialog.a */
public class C1483a extends DialogFragment implements OnClickListener {

    /* renamed from: a */
    private final C1481a f4583a;

    public C1483a() {
        this.f4583a = null;
    }

    @SuppressLint({"ValidFragment"})
    public C1483a(C1481a aVar, Bundle bundle) {
        this.f4583a = aVar;
        setArguments(bundle);
    }

    /* renamed from: a */
    public static Dialog m5921a(Context context, Bundle bundle, OnClickListener onClickListener) {
        Builder title = new Builder(context).setTitle(bundle.getString("title"));
        String str = "button_positive";
        if (bundle.containsKey(str)) {
            title.setPositiveButton(bundle.getString(str), onClickListener);
        }
        String str2 = "button_negative";
        if (bundle.containsKey(str2)) {
            title.setNegativeButton(bundle.getString(str2), onClickListener);
        }
        String str3 = "button_neutral";
        if (bundle.containsKey(str3)) {
            title.setNeutralButton(bundle.getString(str3), onClickListener);
        }
        String str4 = "message";
        if (bundle.containsKey(str4)) {
            title.setMessage(bundle.getString(str4));
        }
        String str5 = "items";
        if (bundle.containsKey(str5)) {
            title.setItems(bundle.getCharSequenceArray(str5), onClickListener);
        }
        return title.create();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C1481a aVar = this.f4583a;
        if (aVar != null) {
            aVar.onClick(dialogInterface, i);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        return m5921a(getActivity(), getArguments(), this);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C1481a aVar = this.f4583a;
        if (aVar != null) {
            aVar.onDismiss(dialogInterface);
        }
    }
}
