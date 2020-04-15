package com.facebook.react.modules.storage;

import android.database.Cursor;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import java.util.HashSet;
import java.util.Iterator;
import p032c.p033a.p038c.p043e.C0727a;

/* renamed from: com.facebook.react.modules.storage.c */
class C1546c extends GuardedAsyncTask<Void, Void> {

    /* renamed from: a */
    final /* synthetic */ Callback f4706a;

    /* renamed from: b */
    final /* synthetic */ ReadableArray f4707b;

    /* renamed from: c */
    final /* synthetic */ AsyncStorageModule f4708c;

    C1546c(AsyncStorageModule asyncStorageModule, ReactContext reactContext, Callback callback, ReadableArray readableArray) {
        this.f4708c = asyncStorageModule;
        this.f4706a = callback;
        this.f4707b = readableArray;
        super(reactContext);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void doInBackgroundGuarded(Void... voidArr) {
        Callback callback;
        Object[] objArr;
        if (!this.f4708c.ensureDatabase()) {
            callback = this.f4706a;
            objArr = new Object[]{C1545b.m6053a(null), null};
        } else {
            String[] strArr = {"key", "value"};
            HashSet hashSet = new HashSet();
            WritableArray createArray = Arguments.createArray();
            int i = 0;
            while (i < this.f4707b.size()) {
                int min = Math.min(this.f4707b.size() - i, 999);
                int i2 = min;
                int i3 = i;
                Cursor query = this.f4708c.mReactDatabaseSupplier.mo5507d().query("catalystLocalStorage", strArr, C1544a.m6047a(min), C1544a.m6051a(this.f4707b, i, min), null, null, null);
                hashSet.clear();
                try {
                    if (query.getCount() != this.f4707b.size()) {
                        for (int i4 = i3; i4 < i3 + i2; i4++) {
                            hashSet.add(this.f4707b.getString(i4));
                        }
                    }
                    if (query.moveToFirst()) {
                        do {
                            WritableArray createArray2 = Arguments.createArray();
                            createArray2.pushString(query.getString(0));
                            createArray2.pushString(query.getString(1));
                            createArray.pushArray(createArray2);
                            hashSet.remove(query.getString(0));
                        } while (query.moveToNext());
                    }
                    query.close();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        WritableArray createArray3 = Arguments.createArray();
                        createArray3.pushString(str);
                        createArray3.pushNull();
                        createArray.pushArray(createArray3);
                    }
                    hashSet.clear();
                    i = i3 + 999;
                } catch (Exception e) {
                    C0727a.m3276b("ReactNative", e.getMessage(), (Throwable) e);
                    this.f4706a.invoke(C1545b.m6054a(null, e.getMessage()), null);
                    query.close();
                    return;
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            callback = this.f4706a;
            objArr = new Object[]{null, createArray};
        }
        callback.invoke(objArr);
    }
}
