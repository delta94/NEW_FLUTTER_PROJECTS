package com.facebook.soloader;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.text.TextUtils;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SoLoader {

    /* renamed from: a */
    static final boolean f5674a;

    /* renamed from: b */
    static C1926l f5675b;

    /* renamed from: c */
    private static final ReentrantReadWriteLock f5676c = new ReentrantReadWriteLock();

    /* renamed from: d */
    private static C1928n[] f5677d = null;

    /* renamed from: e */
    private static int f5678e = 0;

    /* renamed from: f */
    private static C1931q[] f5679f;

    /* renamed from: g */
    private static C1909b f5680g;

    /* renamed from: h */
    private static final HashSet<String> f5681h = new HashSet<>();

    /* renamed from: i */
    private static final Map<String, Object> f5682i = new HashMap();

    /* renamed from: j */
    private static final Set<String> f5683j = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: k */
    private static C1929o f5684k = null;

    /* renamed from: l */
    private static int f5685l;

    @C1911d
    @TargetApi(14)
    private static class Api14Utils {
        private Api14Utils() {
        }

        /* renamed from: a */
        public static String m7263a() {
            ClassLoader classLoader = SoLoader.class.getClassLoader();
            if (classLoader instanceof BaseDexClassLoader) {
                try {
                    return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
                } catch (Exception e) {
                    throw new RuntimeException("Cannot call getLdLibraryPath", e);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("ClassLoader ");
                sb.append(classLoader.getClass().getName());
                sb.append(" should be of type BaseDexClassLoader");
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    /* renamed from: com.facebook.soloader.SoLoader$a */
    public static final class C1906a extends UnsatisfiedLinkError {
        C1906a(Throwable th) {
            super("APK was built for a different platform");
            initCause(th);
        }
    }

    static {
        boolean z = false;
        try {
            if (VERSION.SDK_INT >= 18) {
                z = true;
            }
        } catch (NoClassDefFoundError | UnsatisfiedLinkError unused) {
        }
        f5674a = z;
    }

    /* renamed from: a */
    private static void m7247a() {
        f5676c.readLock().lock();
        try {
            if (f5677d == null) {
                throw new RuntimeException("SoLoader.init() not yet called");
            }
        } finally {
            f5676c.readLock().unlock();
        }
    }

    /* renamed from: a */
    public static void m7248a(Context context, int i) {
        m7249a(context, i, (C1926l) null);
    }

    /* renamed from: a */
    private static void m7249a(Context context, int i, C1926l lVar) {
        ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            m7251a(lVar);
            m7258b(context, i, lVar);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        }
    }

    /* renamed from: a */
    public static void m7250a(Context context, boolean z) {
        try {
            m7248a(context, z ? 1 : 0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static synchronized void m7251a(C1926l lVar) {
        synchronized (SoLoader.class) {
            if (lVar != null) {
                f5675b = lVar;
                return;
            }
            Runtime runtime = Runtime.getRuntime();
            Method b = m7257b();
            boolean z = b != null;
            String a = z ? Api14Utils.m7263a() : null;
            C1927m mVar = new C1927m(z, a, m7256b(a), runtime, b);
            f5675b = mVar;
        }
    }

    /* renamed from: a */
    static void m7252a(String str, int i, ThreadPolicy threadPolicy) {
        m7255a(str, null, null, i, threadPolicy);
    }

    /* renamed from: a */
    public static boolean m7253a(String str) {
        return m7254a(str, 0);
    }

    /* renamed from: a */
    public static boolean m7254a(String str, int i) {
        boolean z;
        f5676c.readLock().lock();
        try {
            if (f5677d == null) {
                if ("http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                    m7247a();
                } else {
                    synchronized (SoLoader.class) {
                        z = !f5681h.contains(str);
                        if (z) {
                            if (f5684k != null) {
                                f5684k.mo6814a(str);
                            } else {
                                System.loadLibrary(str);
                            }
                        }
                    }
                    f5676c.readLock().unlock();
                    return z;
                }
            }
            f5676c.readLock().unlock();
            String b = C1923j.m7302b(str);
            return m7255a(System.mapLibraryName(b != null ? b : str), str, b, i | 2, null);
        } catch (Throwable th) {
            f5676c.readLock().unlock();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        if (r2 != false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        r0 = com.facebook.soloader.SoLoader.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0049, code lost:
        if (f5681h.contains(r7) == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004b, code lost:
        if (r9 != null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004d, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0050, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0052, code lost:
        if (r2 != false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0054, code lost:
        r0 = "SoLoader";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r5 = new java.lang.StringBuilder();
        r5.append("About to load: ");
        r5.append(r7);
        android.util.Log.d(r0, r5.toString());
        m7259b(r7, r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006d, code lost:
        r10 = com.facebook.soloader.SoLoader.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        monitor-enter(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0070, code lost:
        r11 = "SoLoader";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append("Loaded: ");
        r0.append(r7);
        android.util.Log.d(r11, r0.toString());
        f5681h.add(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008b, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0090, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0091, code lost:
        r8 = r7.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0095, code lost:
        if (r8 == null) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00a4, code lost:
        throw new com.facebook.soloader.SoLoader.C1906a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00a5, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a6, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ac, code lost:
        throw new java.lang.RuntimeException(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00b4, code lost:
        if (android.text.TextUtils.isEmpty(r8) != false) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00bc, code lost:
        if (f5683j.contains(r8) == false) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00be, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00bf, code lost:
        if (r9 == null) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00c1, code lost:
        if (r1 != false) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00c5, code lost:
        if (f5674a == false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00c7, code lost:
        r9 = new java.lang.StringBuilder();
        r9.append("MergedSoMapping.invokeJniOnload[");
        r9.append(r8);
        r9.append("]");
        com.facebook.soloader.Api18TraceUtils.m7246a(r9.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00e0, code lost:
        r9 = "SoLoader";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        r10 = new java.lang.StringBuilder();
        r10.append("About to merge: ");
        r10.append(r8);
        r10.append(" / ");
        r10.append(r7);
        android.util.Log.d(r9, r10.toString());
        com.facebook.soloader.C1923j.m7301a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0102, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0103, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0106, code lost:
        if (f5674a != false) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0108, code lost:
        com.facebook.soloader.Api18TraceUtils.m7245a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x010b, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x010c, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x010f, code lost:
        return !r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m7255a(java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, android.os.StrictMode.ThreadPolicy r11) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r1 = 0
            if (r0 != 0) goto L_0x0010
            java.util.Set<java.lang.String> r0 = f5683j
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L_0x0010
            return r1
        L_0x0010:
            java.lang.Class<com.facebook.soloader.SoLoader> r0 = com.facebook.soloader.SoLoader.class
            monitor-enter(r0)
            java.util.HashSet<java.lang.String> r2 = f5681h     // Catch:{ all -> 0x0113 }
            boolean r2 = r2.contains(r7)     // Catch:{ all -> 0x0113 }
            r3 = 1
            if (r2 == 0) goto L_0x0022
            if (r9 != 0) goto L_0x0020
            monitor-exit(r0)     // Catch:{ all -> 0x0113 }
            return r1
        L_0x0020:
            r2 = 1
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            java.util.Map<java.lang.String, java.lang.Object> r4 = f5682i     // Catch:{ all -> 0x0113 }
            boolean r4 = r4.containsKey(r7)     // Catch:{ all -> 0x0113 }
            if (r4 == 0) goto L_0x0032
            java.util.Map<java.lang.String, java.lang.Object> r4 = f5682i     // Catch:{ all -> 0x0113 }
            java.lang.Object r4 = r4.get(r7)     // Catch:{ all -> 0x0113 }
            goto L_0x003c
        L_0x0032:
            java.lang.Object r4 = new java.lang.Object     // Catch:{ all -> 0x0113 }
            r4.<init>()     // Catch:{ all -> 0x0113 }
            java.util.Map<java.lang.String, java.lang.Object> r5 = f5682i     // Catch:{ all -> 0x0113 }
            r5.put(r7, r4)     // Catch:{ all -> 0x0113 }
        L_0x003c:
            monitor-exit(r0)     // Catch:{ all -> 0x0113 }
            monitor-enter(r4)
            if (r2 != 0) goto L_0x00b0
            java.lang.Class<com.facebook.soloader.SoLoader> r0 = com.facebook.soloader.SoLoader.class
            monitor-enter(r0)     // Catch:{ all -> 0x0110 }
            java.util.HashSet<java.lang.String> r5 = f5681h     // Catch:{ all -> 0x00ad }
            boolean r5 = r5.contains(r7)     // Catch:{ all -> 0x00ad }
            if (r5 == 0) goto L_0x0051
            if (r9 != 0) goto L_0x0050
            monitor-exit(r0)     // Catch:{ all -> 0x00ad }
            monitor-exit(r4)     // Catch:{ all -> 0x0110 }
            return r1
        L_0x0050:
            r2 = 1
        L_0x0051:
            monitor-exit(r0)     // Catch:{ all -> 0x00ad }
            if (r2 != 0) goto L_0x00b0
            java.lang.String r0 = "SoLoader"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a6, UnsatisfiedLinkError -> 0x0090 }
            r5.<init>()     // Catch:{ IOException -> 0x00a6, UnsatisfiedLinkError -> 0x0090 }
            java.lang.String r6 = "About to load: "
            r5.append(r6)     // Catch:{ IOException -> 0x00a6, UnsatisfiedLinkError -> 0x0090 }
            r5.append(r7)     // Catch:{ IOException -> 0x00a6, UnsatisfiedLinkError -> 0x0090 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x00a6, UnsatisfiedLinkError -> 0x0090 }
            android.util.Log.d(r0, r5)     // Catch:{ IOException -> 0x00a6, UnsatisfiedLinkError -> 0x0090 }
            m7259b(r7, r10, r11)     // Catch:{ IOException -> 0x00a6, UnsatisfiedLinkError -> 0x0090 }
            java.lang.Class<com.facebook.soloader.SoLoader> r10 = com.facebook.soloader.SoLoader.class
            monitor-enter(r10)     // Catch:{ all -> 0x0110 }
            java.lang.String r11 = "SoLoader"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008d }
            r0.<init>()     // Catch:{ all -> 0x008d }
            java.lang.String r5 = "Loaded: "
            r0.append(r5)     // Catch:{ all -> 0x008d }
            r0.append(r7)     // Catch:{ all -> 0x008d }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008d }
            android.util.Log.d(r11, r0)     // Catch:{ all -> 0x008d }
            java.util.HashSet<java.lang.String> r11 = f5681h     // Catch:{ all -> 0x008d }
            r11.add(r7)     // Catch:{ all -> 0x008d }
            monitor-exit(r10)     // Catch:{ all -> 0x008d }
            goto L_0x00b0
        L_0x008d:
            r7 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x008d }
            throw r7     // Catch:{ all -> 0x0110 }
        L_0x0090:
            r7 = move-exception
            java.lang.String r8 = r7.getMessage()     // Catch:{ all -> 0x0110 }
            if (r8 == 0) goto L_0x00a5
            java.lang.String r9 = "unexpected e_machine:"
            boolean r8 = r8.contains(r9)     // Catch:{ all -> 0x0110 }
            if (r8 == 0) goto L_0x00a5
            com.facebook.soloader.SoLoader$a r8 = new com.facebook.soloader.SoLoader$a     // Catch:{ all -> 0x0110 }
            r8.<init>(r7)     // Catch:{ all -> 0x0110 }
            throw r8     // Catch:{ all -> 0x0110 }
        L_0x00a5:
            throw r7     // Catch:{ all -> 0x0110 }
        L_0x00a6:
            r7 = move-exception
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch:{ all -> 0x0110 }
            r8.<init>(r7)     // Catch:{ all -> 0x0110 }
            throw r8     // Catch:{ all -> 0x0110 }
        L_0x00ad:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ad }
            throw r7     // Catch:{ all -> 0x0110 }
        L_0x00b0:
            boolean r10 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0110 }
            if (r10 != 0) goto L_0x00bf
            java.util.Set<java.lang.String> r10 = f5683j     // Catch:{ all -> 0x0110 }
            boolean r10 = r10.contains(r8)     // Catch:{ all -> 0x0110 }
            if (r10 == 0) goto L_0x00bf
            r1 = 1
        L_0x00bf:
            if (r9 == 0) goto L_0x010c
            if (r1 != 0) goto L_0x010c
            boolean r9 = f5674a     // Catch:{ all -> 0x0110 }
            if (r9 == 0) goto L_0x00e0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0110 }
            r9.<init>()     // Catch:{ all -> 0x0110 }
            java.lang.String r10 = "MergedSoMapping.invokeJniOnload["
            r9.append(r10)     // Catch:{ all -> 0x0110 }
            r9.append(r8)     // Catch:{ all -> 0x0110 }
            java.lang.String r10 = "]"
            r9.append(r10)     // Catch:{ all -> 0x0110 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0110 }
            com.facebook.soloader.Api18TraceUtils.m7246a(r9)     // Catch:{ all -> 0x0110 }
        L_0x00e0:
            java.lang.String r9 = "SoLoader"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0103 }
            r10.<init>()     // Catch:{ all -> 0x0103 }
            java.lang.String r11 = "About to merge: "
            r10.append(r11)     // Catch:{ all -> 0x0103 }
            r10.append(r8)     // Catch:{ all -> 0x0103 }
            java.lang.String r11 = " / "
            r10.append(r11)     // Catch:{ all -> 0x0103 }
            r10.append(r7)     // Catch:{ all -> 0x0103 }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x0103 }
            android.util.Log.d(r9, r7)     // Catch:{ all -> 0x0103 }
            com.facebook.soloader.C1923j.m7301a(r8)     // Catch:{ all -> 0x0103 }
            r7 = 0
            throw r7
        L_0x0103:
            r7 = move-exception
            boolean r8 = f5674a     // Catch:{ all -> 0x0110 }
            if (r8 == 0) goto L_0x010b
            com.facebook.soloader.Api18TraceUtils.m7245a()     // Catch:{ all -> 0x0110 }
        L_0x010b:
            throw r7     // Catch:{ all -> 0x0110 }
        L_0x010c:
            monitor-exit(r4)     // Catch:{ all -> 0x0110 }
            r7 = r2 ^ 1
            return r7
        L_0x0110:
            r7 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0110 }
            throw r7
        L_0x0113:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0113 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.m7255a(java.lang.String, java.lang.String, java.lang.String, int, android.os.StrictMode$ThreadPolicy):boolean");
    }

    /* renamed from: b */
    public static String m7256b(String str) {
        if (str == null) {
            return null;
        }
        String str2 = ":";
        String[] split = str.split(str2);
        ArrayList arrayList = new ArrayList(split.length);
        for (String str3 : split) {
            if (!str3.contains("!")) {
                arrayList.add(str3);
            }
        }
        return TextUtils.join(str2, arrayList);
    }

    /* renamed from: b */
    private static Method m7257b() {
        int i = VERSION.SDK_INT;
        if (i >= 23 && i <= 27) {
            try {
                Method declaredMethod = Runtime.class.getDeclaredMethod("nativeLoad", new Class[]{String.class, ClassLoader.class, String.class});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (NoSuchMethodException | SecurityException e) {
                Log.w("SoLoader", "Cannot get nativeLoad method", e);
            }
        }
        return null;
    }

    /* renamed from: b */
    private static void m7258b(Context context, int i, C1926l lVar) {
        int i2;
        String str = "init exiting";
        String str2 = "SoLoader";
        f5676c.writeLock().lock();
        try {
            if (f5677d == null) {
                Log.d(str2, "init start");
                f5685l = i;
                ArrayList arrayList = new ArrayList();
                String str3 = System.getenv("LD_LIBRARY_PATH");
                if (str3 == null) {
                    str3 = "/vendor/lib:/system/lib";
                }
                String[] split = str3.split(":");
                for (int i3 = 0; i3 < split.length; i3++) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("adding system library source: ");
                    sb.append(split[i3]);
                    Log.d(str2, sb.toString());
                    arrayList.add(new C1910c(new File(split[i3]), 2));
                }
                if (context != null) {
                    String str4 = "lib-main";
                    if ((i & 1) != 0) {
                        f5679f = null;
                        Log.d(str2, "adding exo package source: lib-main");
                        arrayList.add(0, new C1913f(context, str4));
                    } else {
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if ((applicationInfo.flags & 1) != 0 && (applicationInfo.flags & 128) == 0) {
                            i2 = 0;
                        } else {
                            f5680g = new C1909b(context, VERSION.SDK_INT <= 17 ? 1 : 0);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("adding application source: ");
                            sb2.append(f5680g.toString());
                            Log.d(str2, sb2.toString());
                            arrayList.add(0, f5680g);
                            i2 = 1;
                        }
                        if ((f5685l & 8) != 0) {
                            f5679f = null;
                        } else {
                            File file = new File(context.getApplicationInfo().sourceDir);
                            ArrayList arrayList2 = new ArrayList();
                            C1907a aVar = new C1907a(context, file, str4, i2);
                            arrayList2.add(aVar);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("adding backup source from : ");
                            sb3.append(aVar.toString());
                            Log.d(str2, sb3.toString());
                            if (VERSION.SDK_INT >= 21 && context.getApplicationInfo().splitSourceDirs != null) {
                                Log.d(str2, "adding backup sources from split apks");
                                String[] strArr = context.getApplicationInfo().splitSourceDirs;
                                int length = strArr.length;
                                int i4 = 0;
                                int i5 = 0;
                                while (i4 < length) {
                                    File file2 = new File(strArr[i4]);
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("lib-");
                                    int i6 = i5 + 1;
                                    sb4.append(i5);
                                    C1907a aVar2 = new C1907a(context, file2, sb4.toString(), i2);
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append("adding backup source: ");
                                    sb5.append(aVar2.toString());
                                    Log.d(str2, sb5.toString());
                                    arrayList2.add(aVar2);
                                    i4++;
                                    i5 = i6;
                                }
                            }
                            f5679f = (C1931q[]) arrayList2.toArray(new C1931q[arrayList2.size()]);
                            arrayList.addAll(0, arrayList2);
                        }
                    }
                }
                C1928n[] nVarArr = (C1928n[]) arrayList.toArray(new C1928n[arrayList.size()]);
                int c = m7260c();
                int length2 = nVarArr.length;
                while (true) {
                    int i7 = length2 - 1;
                    if (length2 <= 0) {
                        break;
                    }
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Preparing SO source: ");
                    sb6.append(nVarArr[i7]);
                    Log.d(str2, sb6.toString());
                    nVarArr[i7].mo6801a(c);
                    length2 = i7;
                }
                f5677d = nVarArr;
                f5678e++;
                StringBuilder sb7 = new StringBuilder();
                sb7.append("init finish: ");
                sb7.append(f5677d.length);
                sb7.append(" SO sources prepared");
                Log.d(str2, sb7.toString());
            }
        } finally {
            Log.d(str2, str);
            f5676c.writeLock().unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    private static void m7259b(String str, int i, ThreadPolicy threadPolicy) {
        boolean z;
        boolean z2;
        f5676c.readLock().lock();
        try {
            String str2 = "couldn't find DSO to load: ";
            String str3 = "SoLoader";
            if (f5677d != null) {
                f5676c.readLock().unlock();
                if (threadPolicy == null) {
                    threadPolicy = StrictMode.allowThreadDiskReads();
                    z = true;
                } else {
                    z = false;
                }
                if (f5674a) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SoLoader.loadLibrary[");
                    sb.append(str);
                    sb.append("]");
                    Api18TraceUtils.m7246a(sb.toString());
                }
                int i2 = 0;
                do {
                    try {
                        f5676c.readLock().lock();
                        int i3 = f5678e;
                        int i4 = 0;
                        while (true) {
                            if (i2 == 0) {
                                if (i4 >= f5677d.length) {
                                    break;
                                }
                                i2 = f5677d[i4].mo6799a(str, i, threadPolicy);
                                if (i2 == 3 && f5679f != null) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Trying backup SoSource for ");
                                    sb2.append(str);
                                    Log.d(str3, sb2.toString());
                                    C1931q[] qVarArr = f5679f;
                                    int length = qVarArr.length;
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 >= length) {
                                            break;
                                        }
                                        C1931q qVar = qVarArr[i5];
                                        qVar.mo6817b(str);
                                        int a = qVar.mo6799a(str, i, threadPolicy);
                                        if (a == 1) {
                                            i2 = a;
                                            break;
                                        }
                                        i5++;
                                    }
                                } else {
                                    i4++;
                                }
                            } else {
                                break;
                            }
                        }
                        f5676c.readLock().unlock();
                        if ((i & 2) == 2 && i2 == 0) {
                            f5676c.writeLock().lock();
                            if (f5680g != null && f5680g.mo6802a()) {
                                f5678e++;
                            }
                            z2 = f5678e != i3;
                            f5676c.writeLock().unlock();
                            continue;
                        } else {
                            z2 = false;
                            continue;
                        }
                    } catch (Throwable th) {
                        if (f5674a) {
                            Api18TraceUtils.m7245a();
                        }
                        if (z) {
                            StrictMode.setThreadPolicy(threadPolicy);
                        }
                        if (i2 == 0 || i2 == 3) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(str2);
                            sb3.append(str);
                            String sb4 = sb3.toString();
                            Log.e(str3, sb4);
                            throw new UnsatisfiedLinkError(sb4);
                        }
                        throw th;
                    }
                } while (z2);
                if (f5674a) {
                    Api18TraceUtils.m7245a();
                }
                if (z) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                if (i2 == 0 || i2 == 3) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(str2);
                    sb5.append(str);
                    String sb6 = sb5.toString();
                    Log.e(str3, sb6);
                    throw new UnsatisfiedLinkError(sb6);
                }
                return;
            }
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Could not load: ");
            sb7.append(str);
            sb7.append(" because no SO source exists");
            Log.e(str3, sb7.toString());
            StringBuilder sb8 = new StringBuilder();
            sb8.append(str2);
            sb8.append(str);
            throw new UnsatisfiedLinkError(sb8.toString());
        } catch (Throwable th2) {
            f5676c.readLock().unlock();
            throw th2;
        }
    }

    /* renamed from: c */
    private static int m7260c() {
        f5676c.writeLock().lock();
        try {
            return (f5685l & 2) != 0 ? 1 : 0;
        } finally {
            f5676c.writeLock().unlock();
        }
    }

    /* renamed from: c */
    public static File m7261c(String str) {
        m7247a();
        try {
            return m7262d(System.mapLibraryName(str));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    static File m7262d(String str) {
        f5676c.readLock().lock();
        int i = 0;
        while (i < f5677d.length) {
            try {
                File a = f5677d[i].mo6800a(str);
                if (a != null) {
                    return a;
                }
                i++;
            } finally {
                f5676c.readLock().unlock();
            }
        }
        f5676c.readLock().unlock();
        throw new FileNotFoundException(str);
    }
}
