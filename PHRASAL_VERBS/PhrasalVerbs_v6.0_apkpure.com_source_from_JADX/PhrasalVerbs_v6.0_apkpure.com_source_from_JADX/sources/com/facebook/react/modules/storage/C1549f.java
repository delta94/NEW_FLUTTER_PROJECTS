package com.facebook.react.modules.storage;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import p032c.p033a.p038c.p043e.C0727a;

/* renamed from: com.facebook.react.modules.storage.f */
class C1549f extends GuardedAsyncTask<Void, Void> {

    /* renamed from: a */
    final /* synthetic */ Callback f4715a;

    /* renamed from: b */
    final /* synthetic */ ReadableArray f4716b;

    /* renamed from: c */
    final /* synthetic */ AsyncStorageModule f4717c;

    C1549f(AsyncStorageModule asyncStorageModule, ReactContext reactContext, Callback callback, ReadableArray readableArray) {
        this.f4717c = asyncStorageModule;
        this.f4715a = callback;
        this.f4716b = readableArray;
        super(reactContext);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void doInBackgroundGuarded(Void... voidArr) {
        Callback callback;
        Object[] objArr;
        String str = "ReactNative";
        WritableMap writableMap = null;
        if (!this.f4717c.ensureDatabase()) {
            this.f4715a.invoke(C1545b.m6053a(null));
            return;
        }
        try {
            this.f4717c.mReactDatabaseSupplier.mo5507d().beginTransaction();
            int i = 0;
            while (i < this.f4716b.size()) {
                if (this.f4716b.getArray(i).size() != 2) {
                    WritableMap c = C1545b.m6056c(null);
                    try {
                        this.f4717c.mReactDatabaseSupplier.mo5507d().endTransaction();
                    } catch (Exception e) {
                        C0727a.m3276b(str, e.getMessage(), (Throwable) e);
                        if (c == null) {
                            C1545b.m6054a(null, e.getMessage());
                        }
                    }
                    return;
                } else if (this.f4716b.getArray(i).getString(0) == null) {
                    WritableMap b = C1545b.m6055b(null);
                    try {
                        this.f4717c.mReactDatabaseSupplier.mo5507d().endTransaction();
                    } catch (Exception e2) {
                        C0727a.m3276b(str, e2.getMessage(), (Throwable) e2);
                        if (b == null) {
                            C1545b.m6054a(null, e2.getMessage());
                        }
                    }
                    return;
                } else if (this.f4716b.getArray(i).getString(1) == null) {
                    WritableMap c2 = C1545b.m6056c(null);
                    try {
                        this.f4717c.mReactDatabaseSupplier.mo5507d().endTransaction();
                    } catch (Exception e3) {
                        C0727a.m3276b(str, e3.getMessage(), (Throwable) e3);
                        if (c2 == null) {
                            C1545b.m6054a(null, e3.getMessage());
                        }
                    }
                    return;
                } else if (!C1544a.m6050a(this.f4717c.mReactDatabaseSupplier.mo5507d(), this.f4716b.getArray(i).getString(0), this.f4716b.getArray(i).getString(1))) {
                    WritableMap a = C1545b.m6053a(null);
                    try {
                    } catch (Exception e4) {
                        C0727a.m3276b(str, e4.getMessage(), (Throwable) e4);
                        if (a == null) {
                            C1545b.m6054a(null, e4.getMessage());
                        }
                    }
                    return;
                } else {
                    i++;
                }
            }
            this.f4717c.mReactDatabaseSupplier.mo5507d().setTransactionSuccessful();
            try {
                this.f4717c.mReactDatabaseSupplier.mo5507d().endTransaction();
            } catch (Exception e5) {
                C0727a.m3276b(str, e5.getMessage(), (Throwable) e5);
                writableMap = C1545b.m6054a(null, e5.getMessage());
            }
        } catch (Exception e6) {
            C0727a.m3276b(str, e6.getMessage(), (Throwable) e6);
            WritableMap a2 = C1545b.m6054a(null, e6.getMessage());
            try {
            } catch (Exception e7) {
                C0727a.m3276b(str, e7.getMessage(), (Throwable) e7);
                if (a2 == null) {
                    writableMap = C1545b.m6054a(null, e7.getMessage());
                }
            }
            writableMap = a2;
        } finally {
            try {
                this.f4717c.mReactDatabaseSupplier.mo5507d().endTransaction();
            } catch (Exception e8) {
                C0727a.m3276b(str, e8.getMessage(), (Throwable) e8);
                C1545b.m6054a(null, e8.getMessage());
            }
        }
        if (writableMap != null) {
            callback = this.f4715a;
            objArr = new Object[]{writableMap};
        } else {
            callback = this.f4715a;
            objArr = new Object[0];
        }
        callback.invoke(objArr);
    }
}
