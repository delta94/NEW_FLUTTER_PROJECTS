package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.facebook.soloader.m */
class C1927m implements C1926l {

    /* renamed from: a */
    final /* synthetic */ boolean f5712a;

    /* renamed from: b */
    final /* synthetic */ String f5713b;

    /* renamed from: c */
    final /* synthetic */ String f5714c;

    /* renamed from: d */
    final /* synthetic */ Runtime f5715d;

    /* renamed from: e */
    final /* synthetic */ Method f5716e;

    C1927m(boolean z, String str, String str2, Runtime runtime, Method method) {
        this.f5712a = z;
        this.f5713b = str;
        this.f5714c = str2;
        this.f5715d = runtime;
        this.f5716e = method;
    }

    /* renamed from: a */
    private String m7312a(String str) {
        FileInputStream fileInputStream;
        Throwable th;
        try {
            File file = new File(str);
            MessageDigest instance = MessageDigest.getInstance("MD5");
            fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    instance.update(bArr, 0, read);
                } else {
                    String format = String.format("%32x", new Object[]{new BigInteger(1, instance.digest())});
                    fileInputStream.close();
                    return format;
                }
            }
        } catch (IOException e) {
            return e.toString();
        } catch (SecurityException e2) {
            return e2.toString();
        } catch (NoSuchAlgorithmException e3) {
            return e3.toString();
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append("Error when loading lib: ");
        r0.append(r1);
        r0.append(" lib hash: ");
        r0.append(m7312a(r9));
        r0.append(" search path is ");
        r0.append(r10);
        android.util.Log.e("SoLoader", r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6813a(java.lang.String r9, int r10) {
        /*
            r8 = this;
            boolean r0 = r8.f5712a
            if (r0 == 0) goto L_0x00bb
            r0 = 4
            r10 = r10 & r0
            r1 = 1
            r2 = 0
            if (r10 != r0) goto L_0x000c
            r10 = 1
            goto L_0x000d
        L_0x000c:
            r10 = 0
        L_0x000d:
            if (r10 == 0) goto L_0x0012
            java.lang.String r10 = r8.f5713b
            goto L_0x0014
        L_0x0012:
            java.lang.String r10 = r8.f5714c
        L_0x0014:
            r0 = 0
            java.lang.Runtime r3 = r8.f5715d     // Catch:{ IllegalAccessException -> 0x0076, IllegalArgumentException -> 0x0074, InvocationTargetException -> 0x0072 }
            monitor-enter(r3)     // Catch:{ IllegalAccessException -> 0x0076, IllegalArgumentException -> 0x0074, InvocationTargetException -> 0x0072 }
            java.lang.reflect.Method r4 = r8.f5716e     // Catch:{ all -> 0x006d }
            java.lang.Runtime r5 = r8.f5715d     // Catch:{ all -> 0x006d }
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x006d }
            r6[r2] = r9     // Catch:{ all -> 0x006d }
            java.lang.Class<com.facebook.soloader.SoLoader> r2 = com.facebook.soloader.SoLoader.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ all -> 0x006d }
            r6[r1] = r2     // Catch:{ all -> 0x006d }
            r1 = 2
            r6[r1] = r10     // Catch:{ all -> 0x006d }
            java.lang.Object r1 = r4.invoke(r5, r6)     // Catch:{ all -> 0x006d }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x006d }
            if (r1 != 0) goto L_0x0067
            monitor-exit(r3)     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x00be
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Error when loading lib: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = " lib hash: "
            r0.append(r1)
            java.lang.String r9 = r8.m7312a(r9)
            r0.append(r9)
            java.lang.String r9 = " search path is "
            r0.append(r9)
            r0.append(r10)
            java.lang.String r9 = r0.toString()
            java.lang.String r10 = "SoLoader"
            android.util.Log.e(r10, r9)
            goto L_0x00be
        L_0x0062:
            r0 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
            goto L_0x006e
        L_0x0067:
            java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError     // Catch:{ all -> 0x0062 }
            r0.<init>(r1)     // Catch:{ all -> 0x0062 }
            throw r0     // Catch:{ all -> 0x0062 }
        L_0x006d:
            r1 = move-exception
        L_0x006e:
            monitor-exit(r3)     // Catch:{ all -> 0x006d }
            throw r1     // Catch:{ IllegalAccessException -> 0x0076, IllegalArgumentException -> 0x0074, InvocationTargetException -> 0x0072 }
        L_0x0070:
            r1 = move-exception
            goto L_0x008e
        L_0x0072:
            r1 = move-exception
            goto L_0x0077
        L_0x0074:
            r1 = move-exception
            goto L_0x0077
        L_0x0076:
            r1 = move-exception
        L_0x0077:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0070 }
            r2.<init>()     // Catch:{ all -> 0x0070 }
            java.lang.String r3 = "Error: Cannot load "
            r2.append(r3)     // Catch:{ all -> 0x0070 }
            r2.append(r9)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0070 }
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0070 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0070 }
            throw r2     // Catch:{ all -> 0x0070 }
        L_0x008e:
            if (r0 == 0) goto L_0x00ba
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error when loading lib: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " lib hash: "
            r2.append(r0)
            java.lang.String r9 = r8.m7312a(r9)
            r2.append(r9)
            java.lang.String r9 = " search path is "
            r2.append(r9)
            r2.append(r10)
            java.lang.String r9 = r2.toString()
            java.lang.String r10 = "SoLoader"
            android.util.Log.e(r10, r9)
        L_0x00ba:
            throw r1
        L_0x00bb:
            java.lang.System.load(r9)
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C1927m.mo6813a(java.lang.String, int):void");
    }
}
