package com.facebook.react.modules.permissions;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;

/* renamed from: com.facebook.react.modules.permissions.a */
class C1535a implements Callback {

    /* renamed from: a */
    final /* synthetic */ Promise f4680a;

    /* renamed from: b */
    final /* synthetic */ String f4681b;

    /* renamed from: c */
    final /* synthetic */ PermissionsModule f4682c;

    C1535a(PermissionsModule permissionsModule, Promise promise, String str) {
        this.f4682c = permissionsModule;
        this.f4680a = promise;
        this.f4681b = str;
    }

    public void invoke(Object... objArr) {
        Promise promise;
        String str;
        int[] iArr = objArr[0];
        if (iArr.length > 0 && iArr[0] == 0) {
            promise = this.f4680a;
            str = "granted";
        } else if (objArr[1].shouldShowRequestPermissionRationale(this.f4681b)) {
            promise = this.f4680a;
            str = "denied";
        } else {
            promise = this.f4680a;
            str = "never_ask_again";
        }
        promise.resolve(str);
    }
}
