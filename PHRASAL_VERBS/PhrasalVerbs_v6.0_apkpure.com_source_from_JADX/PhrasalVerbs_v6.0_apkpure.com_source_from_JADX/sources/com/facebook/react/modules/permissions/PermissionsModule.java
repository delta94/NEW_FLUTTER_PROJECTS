package com.facebook.react.modules.permissions;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import android.util.SparseArray;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.C1462e;
import com.facebook.react.modules.core.C1463f;
import java.util.ArrayList;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "PermissionsAndroid")
public class PermissionsModule extends ReactContextBaseJavaModule implements C1463f {
    private static final String ERROR_INVALID_ACTIVITY = "E_INVALID_ACTIVITY";
    public static final String NAME = "PermissionsAndroid";
    private final String DENIED = "denied";
    private final String GRANTED = "granted";
    private final String NEVER_ASK_AGAIN = "never_ask_again";
    private final SparseArray<Callback> mCallbacks = new SparseArray<>();
    private int mRequestCode = 0;

    public PermissionsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private C1462e getPermissionAwareActivity() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        } else if (currentActivity instanceof C1462e) {
            return (C1462e) currentActivity;
        } else {
            throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
        }
    }

    @ReactMethod
    public void checkPermission(String str, Promise promise) {
        Context baseContext = getReactApplicationContext().getBaseContext();
        boolean z = true;
        if (VERSION.SDK_INT >= 23 ? baseContext.checkSelfPermission(str) != 0 : baseContext.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
            z = false;
        }
        promise.resolve(Boolean.valueOf(z));
    }

    public String getName() {
        return NAME;
    }

    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        ((Callback) this.mCallbacks.get(i)).invoke(iArr, getPermissionAwareActivity());
        this.mCallbacks.remove(i);
        return this.mCallbacks.size() == 0;
    }

    @ReactMethod
    public void requestMultiplePermissions(ReadableArray readableArray, Promise promise) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        ArrayList arrayList = new ArrayList();
        Context baseContext = getReactApplicationContext().getBaseContext();
        int i = 0;
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            String string = readableArray.getString(i2);
            String str = "granted";
            if (VERSION.SDK_INT < 23) {
                if (baseContext.checkPermission(string, Process.myPid(), Process.myUid()) != 0) {
                    str = "denied";
                }
            } else if (baseContext.checkSelfPermission(string) != 0) {
                arrayList.add(string);
            }
            writableNativeMap.putString(string, str);
            i++;
        }
        if (readableArray.size() == i) {
            promise.resolve(writableNativeMap);
            return;
        }
        try {
            C1462e permissionAwareActivity = getPermissionAwareActivity();
            this.mCallbacks.put(this.mRequestCode, new C1536b(this, arrayList, writableNativeMap, promise));
            permissionAwareActivity.mo4573a((String[]) arrayList.toArray(new String[0]), this.mRequestCode, this);
            this.mRequestCode++;
        } catch (IllegalStateException e) {
            promise.reject(ERROR_INVALID_ACTIVITY, (Throwable) e);
        }
    }

    @ReactMethod
    public void requestPermission(String str, Promise promise) {
        Context baseContext = getReactApplicationContext().getBaseContext();
        String str2 = "granted";
        if (VERSION.SDK_INT < 23) {
            if (baseContext.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
                str2 = "denied";
            }
            promise.resolve(str2);
        } else if (baseContext.checkSelfPermission(str) == 0) {
            promise.resolve(str2);
        } else {
            try {
                C1462e permissionAwareActivity = getPermissionAwareActivity();
                this.mCallbacks.put(this.mRequestCode, new C1535a(this, promise, str));
                permissionAwareActivity.mo4573a(new String[]{str}, this.mRequestCode, this);
                this.mRequestCode++;
            } catch (IllegalStateException e) {
                promise.reject(ERROR_INVALID_ACTIVITY, (Throwable) e);
            }
        }
    }

    @ReactMethod
    public void shouldShowRequestPermissionRationale(String str, Promise promise) {
        if (VERSION.SDK_INT < 23) {
            promise.resolve(Boolean.valueOf(false));
            return;
        }
        try {
            promise.resolve(Boolean.valueOf(getPermissionAwareActivity().shouldShowRequestPermissionRationale(str)));
        } catch (IllegalStateException e) {
            promise.reject(ERROR_INVALID_ACTIVITY, (Throwable) e);
        }
    }
}
