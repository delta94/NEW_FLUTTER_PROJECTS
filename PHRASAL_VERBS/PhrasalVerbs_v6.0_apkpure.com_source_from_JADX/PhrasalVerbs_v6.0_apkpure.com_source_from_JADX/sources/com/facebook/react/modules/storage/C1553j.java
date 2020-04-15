package com.facebook.react.modules.storage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.facebook.react.modules.storage.j */
public class C1553j extends SQLiteOpenHelper {

    /* renamed from: a */
    private static C1553j f4724a;

    /* renamed from: b */
    private Context f4725b;

    /* renamed from: c */
    private SQLiteDatabase f4726c;

    /* renamed from: d */
    private long f4727d = 6291456;

    private C1553j(Context context) {
        super(context, "RKStorage", null, 1);
        this.f4725b = context;
    }

    /* renamed from: a */
    public static C1553j m6063a(Context context) {
        if (f4724a == null) {
            f4724a = new C1553j(context.getApplicationContext());
        }
        return f4724a;
    }

    /* renamed from: e */
    private synchronized void m6064e() {
        if (this.f4726c != null && this.f4726c.isOpen()) {
            this.f4726c.close();
            this.f4726c = null;
        }
    }

    /* renamed from: f */
    private synchronized boolean m6065f() {
        m6064e();
        return this.f4725b.deleteDatabase("RKStorage");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo5504a() {
        mo5507d().delete("catalystLocalStorage", null, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        throw new java.lang.RuntimeException("Clearing and deleting database RKStorage failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (m6065f() != false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        p032c.p033a.p038c.p043e.C0727a.m3266a("ReactNative", "Deleted Local Database RKStorage");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0012 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo5505b() {
        /*
            r2 = this;
            monitor-enter(r2)
            r2.mo5504a()     // Catch:{ Exception -> 0x0012 }
            r2.m6064e()     // Catch:{ Exception -> 0x0012 }
            java.lang.String r0 = "ReactNative"
            java.lang.String r1 = "Cleaned RKStorage"
            p032c.p033a.p038c.p043e.C0727a.m3266a(r0, r1)     // Catch:{ Exception -> 0x0012 }
            monitor-exit(r2)
            return
        L_0x0010:
            r0 = move-exception
            goto L_0x0029
        L_0x0012:
            boolean r0 = r2.m6065f()     // Catch:{ all -> 0x0010 }
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "ReactNative"
            java.lang.String r1 = "Deleted Local Database RKStorage"
            p032c.p033a.p038c.p043e.C0727a.m3266a(r0, r1)     // Catch:{ all -> 0x0010 }
            monitor-exit(r2)
            return
        L_0x0021:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0010 }
            java.lang.String r1 = "Clearing and deleting database RKStorage failed"
            r0.<init>(r1)     // Catch:{ all -> 0x0010 }
            throw r0     // Catch:{ all -> 0x0010 }
        L_0x0029:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.storage.C1553j.mo5505b():void");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:15|16|17|18|19|20|34|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x002f, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0028 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo5506c() {
        /*
            r5 = this;
            monitor-enter(r5)
            android.database.sqlite.SQLiteDatabase r0 = r5.f4726c     // Catch:{ all -> 0x0040 }
            r1 = 1
            if (r0 == 0) goto L_0x0010
            android.database.sqlite.SQLiteDatabase r0 = r5.f4726c     // Catch:{ all -> 0x0040 }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0010
            monitor-exit(r5)
            return r1
        L_0x0010:
            r0 = 0
            r2 = 0
        L_0x0012:
            r3 = 2
            if (r2 >= r3) goto L_0x0032
            if (r2 <= 0) goto L_0x001a
            r5.m6065f()     // Catch:{ SQLiteException -> 0x0021 }
        L_0x001a:
            android.database.sqlite.SQLiteDatabase r3 = r5.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0021 }
            r5.f4726c = r3     // Catch:{ SQLiteException -> 0x0021 }
            goto L_0x0032
        L_0x0021:
            r0 = move-exception
            r3 = 30
            java.lang.Thread.sleep(r3)     // Catch:{ InterruptedException -> 0x0028 }
            goto L_0x002f
        L_0x0028:
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0040 }
            r3.interrupt()     // Catch:{ all -> 0x0040 }
        L_0x002f:
            int r2 = r2 + 1
            goto L_0x0012
        L_0x0032:
            android.database.sqlite.SQLiteDatabase r2 = r5.f4726c     // Catch:{ all -> 0x0040 }
            if (r2 == 0) goto L_0x003f
            android.database.sqlite.SQLiteDatabase r0 = r5.f4726c     // Catch:{ all -> 0x0040 }
            long r2 = r5.f4727d     // Catch:{ all -> 0x0040 }
            r0.setMaximumSize(r2)     // Catch:{ all -> 0x0040 }
            monitor-exit(r5)
            return r1
        L_0x003f:
            throw r0     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.storage.C1553j.mo5506c():boolean");
    }

    /* renamed from: d */
    public synchronized SQLiteDatabase mo5507d() {
        mo5506c();
        return this.f4726c;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE catalystLocalStorage (key TEXT PRIMARY KEY, value TEXT NOT NULL)");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i != i2) {
            m6065f();
            onCreate(sQLiteDatabase);
        }
    }
}
