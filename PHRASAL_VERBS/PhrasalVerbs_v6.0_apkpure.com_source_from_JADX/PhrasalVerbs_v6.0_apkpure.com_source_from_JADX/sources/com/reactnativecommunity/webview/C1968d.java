package com.reactnativecommunity.webview;

import android.widget.Toast;
import com.facebook.react.modules.core.C1463f;

/* renamed from: com.reactnativecommunity.webview.d */
class C1968d implements C1463f {

    /* renamed from: a */
    final /* synthetic */ RNCWebViewModule f5880a;

    C1968d(RNCWebViewModule rNCWebViewModule) {
        this.f5880a = rNCWebViewModule;
    }

    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 1) {
            return false;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            Toast.makeText(this.f5880a.getCurrentActivity().getApplicationContext(), "Cannot download files as permission was denied. Please provide permission to write to storage, in order to download files.", 1).show();
        } else if (this.f5880a.downloadRequest != null) {
            this.f5880a.downloadFile();
        }
        return true;
    }
}
