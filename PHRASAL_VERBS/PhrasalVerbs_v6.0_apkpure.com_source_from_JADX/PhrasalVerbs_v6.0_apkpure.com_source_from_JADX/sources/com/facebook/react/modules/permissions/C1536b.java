package com.facebook.react.modules.permissions;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.C1462e;
import java.util.ArrayList;

/* renamed from: com.facebook.react.modules.permissions.b */
class C1536b implements Callback {

    /* renamed from: a */
    final /* synthetic */ ArrayList f4683a;

    /* renamed from: b */
    final /* synthetic */ WritableMap f4684b;

    /* renamed from: c */
    final /* synthetic */ Promise f4685c;

    /* renamed from: d */
    final /* synthetic */ PermissionsModule f4686d;

    C1536b(PermissionsModule permissionsModule, ArrayList arrayList, WritableMap writableMap, Promise promise) {
        this.f4686d = permissionsModule;
        this.f4683a = arrayList;
        this.f4684b = writableMap;
        this.f4685c = promise;
    }

    public void invoke(Object... objArr) {
        String str;
        WritableMap writableMap;
        int[] iArr = objArr[0];
        C1462e eVar = objArr[1];
        for (int i = 0; i < this.f4683a.size(); i++) {
            String str2 = (String) this.f4683a.get(i);
            if (iArr.length > 0 && iArr[i] == 0) {
                writableMap = this.f4684b;
                str = "granted";
            } else if (eVar.shouldShowRequestPermissionRationale(str2)) {
                writableMap = this.f4684b;
                str = "denied";
            } else {
                writableMap = this.f4684b;
                str = "never_ask_again";
            }
            writableMap.putString(str2, str);
        }
        this.f4685c.resolve(this.f4684b);
    }
}
