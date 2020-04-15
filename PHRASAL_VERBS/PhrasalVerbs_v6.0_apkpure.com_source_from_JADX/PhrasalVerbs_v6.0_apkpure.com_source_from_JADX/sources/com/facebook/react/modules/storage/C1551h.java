package com.facebook.react.modules.storage;

import android.database.Cursor;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableArray;
import p032c.p033a.p038c.p043e.C0727a;

/* renamed from: com.facebook.react.modules.storage.h */
class C1551h extends GuardedAsyncTask<Void, Void> {

    /* renamed from: a */
    final /* synthetic */ Callback f4720a;

    /* renamed from: b */
    final /* synthetic */ AsyncStorageModule f4721b;

    C1551h(AsyncStorageModule asyncStorageModule, ReactContext reactContext, Callback callback) {
        this.f4721b = asyncStorageModule;
        this.f4720a = callback;
        super(reactContext);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void doInBackgroundGuarded(Void... voidArr) {
        if (!this.f4721b.ensureDatabase()) {
            this.f4720a.invoke(C1545b.m6053a(null), null);
            return;
        }
        WritableArray createArray = Arguments.createArray();
        Cursor query = this.f4721b.mReactDatabaseSupplier.mo5507d().query("catalystLocalStorage", new String[]{"key"}, null, null, null, null, null);
        try {
            if (query.moveToFirst()) {
                do {
                    createArray.pushString(query.getString(0));
                } while (query.moveToNext());
            }
            query.close();
            this.f4720a.invoke(null, createArray);
        } catch (Exception e) {
            C0727a.m3276b("ReactNative", e.getMessage(), (Throwable) e);
            this.f4720a.invoke(C1545b.m6054a(null, e.getMessage()), null);
            query.close();
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }
}
