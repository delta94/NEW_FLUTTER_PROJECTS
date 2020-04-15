package com.facebook.react.modules.storage;

import android.database.sqlite.SQLiteStatement;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import p032c.p033a.p038c.p043e.C0727a;

/* renamed from: com.facebook.react.modules.storage.d */
class C1547d extends GuardedAsyncTask<Void, Void> {

    /* renamed from: a */
    final /* synthetic */ Callback f4709a;

    /* renamed from: b */
    final /* synthetic */ ReadableArray f4710b;

    /* renamed from: c */
    final /* synthetic */ AsyncStorageModule f4711c;

    C1547d(AsyncStorageModule asyncStorageModule, ReactContext reactContext, Callback callback, ReadableArray readableArray) {
        this.f4711c = asyncStorageModule;
        this.f4709a = callback;
        this.f4710b = readableArray;
        super(reactContext);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void doInBackgroundGuarded(Void... voidArr) {
        Callback callback;
        Object[] objArr;
        String str = "ReactNative";
        WritableMap writableMap = null;
        if (!this.f4711c.ensureDatabase()) {
            this.f4709a.invoke(C1545b.m6053a(null));
            return;
        }
        SQLiteStatement compileStatement = this.f4711c.mReactDatabaseSupplier.mo5507d().compileStatement("INSERT OR REPLACE INTO catalystLocalStorage VALUES (?, ?);");
        try {
            this.f4711c.mReactDatabaseSupplier.mo5507d().beginTransaction();
            int i = 0;
            while (i < this.f4710b.size()) {
                if (this.f4710b.getArray(i).size() != 2) {
                    WritableMap c = C1545b.m6056c(null);
                    try {
                        this.f4711c.mReactDatabaseSupplier.mo5507d().endTransaction();
                    } catch (Exception e) {
                        C0727a.m3276b(str, e.getMessage(), (Throwable) e);
                        if (c == null) {
                            C1545b.m6054a(null, e.getMessage());
                        }
                    }
                    return;
                } else if (this.f4710b.getArray(i).getString(0) == null) {
                    WritableMap b = C1545b.m6055b(null);
                    try {
                        this.f4711c.mReactDatabaseSupplier.mo5507d().endTransaction();
                    } catch (Exception e2) {
                        C0727a.m3276b(str, e2.getMessage(), (Throwable) e2);
                        if (b == null) {
                            C1545b.m6054a(null, e2.getMessage());
                        }
                    }
                    return;
                } else if (this.f4710b.getArray(i).getString(1) == null) {
                    WritableMap c2 = C1545b.m6056c(null);
                    try {
                    } catch (Exception e3) {
                        C0727a.m3276b(str, e3.getMessage(), (Throwable) e3);
                        if (c2 == null) {
                            C1545b.m6054a(null, e3.getMessage());
                        }
                    }
                    return;
                } else {
                    compileStatement.clearBindings();
                    compileStatement.bindString(1, this.f4710b.getArray(i).getString(0));
                    compileStatement.bindString(2, this.f4710b.getArray(i).getString(1));
                    compileStatement.execute();
                    i++;
                }
            }
            this.f4711c.mReactDatabaseSupplier.mo5507d().setTransactionSuccessful();
            try {
                this.f4711c.mReactDatabaseSupplier.mo5507d().endTransaction();
            } catch (Exception e4) {
                C0727a.m3276b(str, e4.getMessage(), (Throwable) e4);
                writableMap = C1545b.m6054a(null, e4.getMessage());
            }
        } catch (Exception e5) {
            C0727a.m3276b(str, e5.getMessage(), (Throwable) e5);
            WritableMap a = C1545b.m6054a(null, e5.getMessage());
            try {
            } catch (Exception e6) {
                C0727a.m3276b(str, e6.getMessage(), (Throwable) e6);
                if (a == null) {
                    writableMap = C1545b.m6054a(null, e6.getMessage());
                }
            }
            writableMap = a;
        } finally {
            try {
                this.f4711c.mReactDatabaseSupplier.mo5507d().endTransaction();
            } catch (Exception e7) {
                C0727a.m3276b(str, e7.getMessage(), (Throwable) e7);
                C1545b.m6054a(null, e7.getMessage());
            }
        }
        if (writableMap != null) {
            callback = this.f4709a;
            objArr = new Object[]{writableMap};
        } else {
            callback = this.f4709a;
            objArr = new Object[0];
        }
        callback.invoke(objArr);
    }
}
