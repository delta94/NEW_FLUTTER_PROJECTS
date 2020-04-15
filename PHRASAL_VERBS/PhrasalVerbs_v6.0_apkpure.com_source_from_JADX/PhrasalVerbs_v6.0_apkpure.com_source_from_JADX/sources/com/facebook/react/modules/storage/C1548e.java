package com.facebook.react.modules.storage;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import p032c.p033a.p038c.p043e.C0727a;

/* renamed from: com.facebook.react.modules.storage.e */
class C1548e extends GuardedAsyncTask<Void, Void> {

    /* renamed from: a */
    final /* synthetic */ Callback f4712a;

    /* renamed from: b */
    final /* synthetic */ ReadableArray f4713b;

    /* renamed from: c */
    final /* synthetic */ AsyncStorageModule f4714c;

    C1548e(AsyncStorageModule asyncStorageModule, ReactContext reactContext, Callback callback, ReadableArray readableArray) {
        this.f4714c = asyncStorageModule;
        this.f4712a = callback;
        this.f4713b = readableArray;
        super(reactContext);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void doInBackgroundGuarded(Void... voidArr) {
        Callback callback;
        Object[] objArr;
        String str = "ReactNative";
        WritableMap writableMap = null;
        if (!this.f4714c.ensureDatabase()) {
            this.f4712a.invoke(C1545b.m6053a(null));
            return;
        }
        try {
            this.f4714c.mReactDatabaseSupplier.mo5507d().beginTransaction();
            for (int i = 0; i < this.f4713b.size(); i += 999) {
                int min = Math.min(this.f4713b.size() - i, 999);
                this.f4714c.mReactDatabaseSupplier.mo5507d().delete("catalystLocalStorage", C1544a.m6047a(min), C1544a.m6051a(this.f4713b, i, min));
            }
            this.f4714c.mReactDatabaseSupplier.mo5507d().setTransactionSuccessful();
            try {
            } catch (Exception e) {
                C0727a.m3276b(str, e.getMessage(), (Throwable) e);
                writableMap = C1545b.m6054a(null, e.getMessage());
            }
        } catch (Exception e2) {
            C0727a.m3276b(str, e2.getMessage(), (Throwable) e2);
            WritableMap a = C1545b.m6054a(null, e2.getMessage());
            try {
            } catch (Exception e3) {
                C0727a.m3276b(str, e3.getMessage(), (Throwable) e3);
                if (a == null) {
                    writableMap = C1545b.m6054a(null, e3.getMessage());
                }
            }
            writableMap = a;
        } finally {
            try {
                this.f4714c.mReactDatabaseSupplier.mo5507d().endTransaction();
            } catch (Exception e4) {
                C0727a.m3276b(str, e4.getMessage(), (Throwable) e4);
                C1545b.m6054a(null, e4.getMessage());
            }
        }
        if (writableMap != null) {
            callback = this.f4712a;
            objArr = new Object[]{writableMap};
        } else {
            callback = this.f4712a;
            objArr = new Object[0];
        }
        callback.invoke(objArr);
    }
}
