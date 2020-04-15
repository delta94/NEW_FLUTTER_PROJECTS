package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.C1931q.C1932a;
import com.facebook.soloader.C1931q.C1933b;
import java.io.File;
import java.io.FileInputStream;

/* renamed from: com.facebook.soloader.f */
public final class C1913f extends C1931q {

    /* renamed from: com.facebook.soloader.f$a */
    private final class C1914a extends C1936e {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C1916b[] f5695a;

        /* renamed from: b */
        final /* synthetic */ C1913f f5696b;

        /* renamed from: com.facebook.soloader.f$a$a */
        private final class C1915a extends C1935d {

            /* renamed from: a */
            private int f5697a;

            private C1915a() {
            }

            /* renamed from: m */
            public boolean mo6807m() {
                return this.f5697a < C1914a.this.f5695a.length;
            }

            /* renamed from: n */
            public C1934c mo6808n() {
                C1916b[] a = C1914a.this.f5695a;
                int i = this.f5697a;
                this.f5697a = i + 1;
                C1916b bVar = a[i];
                FileInputStream fileInputStream = new FileInputStream(bVar.f5699c);
                try {
                    return new C1934c(bVar, fileInputStream);
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            r11.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e6, code lost:
            r10.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ff, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0100, code lost:
            r17 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
            r10.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x010f, code lost:
            r10.close();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00ff A[ExcHandler: all (th java.lang.Throwable), Splitter:B:7:0x0063] */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x010b A[SYNTHETIC, Splitter:B:56:0x010b] */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x010f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        C1914a(com.facebook.soloader.C1913f r19, com.facebook.soloader.C1931q r20) {
            /*
                r18 = this;
                r1 = r18
                r0 = r19
                r1.f5696b = r0
                r18.<init>()
                android.content.Context r0 = r0.f5723c
                java.io.File r2 = new java.io.File
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "/data/local/tmp/exopackage/"
                r3.append(r4)
                java.lang.String r0 = r0.getPackageName()
                r3.append(r0)
                java.lang.String r0 = "/native-libs/"
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r2.<init>(r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
                r3.<init>()
                java.lang.String[] r4 = com.facebook.soloader.SysUtil.m7269a()
                int r5 = r4.length
                r6 = 0
                r7 = 0
            L_0x003b:
                if (r7 >= r5) goto L_0x0113
                r8 = r4[r7]
                java.io.File r9 = new java.io.File
                r9.<init>(r2, r8)
                boolean r10 = r9.isDirectory()
                if (r10 != 0) goto L_0x004c
                goto L_0x00e9
            L_0x004c:
                r3.add(r8)
                java.io.File r8 = new java.io.File
                java.lang.String r10 = "metadata.txt"
                r8.<init>(r9, r10)
                boolean r10 = r8.isFile()
                if (r10 != 0) goto L_0x005e
                goto L_0x00e9
            L_0x005e:
                java.io.FileReader r10 = new java.io.FileReader
                r10.<init>(r8)
                java.io.BufferedReader r11 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0103, all -> 0x00ff }
                r11.<init>(r10)     // Catch:{ Throwable -> 0x0103, all -> 0x00ff }
            L_0x0068:
                java.lang.String r12 = r11.readLine()     // Catch:{ Throwable -> 0x00f1, all -> 0x00ee }
                if (r12 == 0) goto L_0x00e3
                int r13 = r12.length()     // Catch:{ Throwable -> 0x00f1, all -> 0x00ee }
                if (r13 != 0) goto L_0x0075
                goto L_0x0068
            L_0x0075:
                r13 = 32
                int r13 = r12.indexOf(r13)     // Catch:{ Throwable -> 0x00f1, all -> 0x00ee }
                r14 = -1
                if (r13 == r14) goto L_0x00c7
                java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00f1, all -> 0x00ee }
                r14.<init>()     // Catch:{ Throwable -> 0x00f1, all -> 0x00ee }
                java.lang.String r15 = r12.substring(r6, r13)     // Catch:{ Throwable -> 0x00f1, all -> 0x00ee }
                r14.append(r15)     // Catch:{ Throwable -> 0x00f1, all -> 0x00ee }
                java.lang.String r15 = ".so"
                r14.append(r15)     // Catch:{ Throwable -> 0x00f1, all -> 0x00ee }
                java.lang.String r14 = r14.toString()     // Catch:{ Throwable -> 0x00f1, all -> 0x00ee }
                int r15 = r0.size()     // Catch:{ Throwable -> 0x00f1, all -> 0x00ee }
            L_0x0097:
                if (r6 >= r15) goto L_0x00ae
                java.lang.Object r16 = r0.get(r6)     // Catch:{ Throwable -> 0x00f1, all -> 0x00ee }
                r8 = r16
                com.facebook.soloader.f$b r8 = (com.facebook.soloader.C1913f.C1916b) r8     // Catch:{ Throwable -> 0x00f1, all -> 0x00ee }
                java.lang.String r8 = r8.f5727a     // Catch:{ Throwable -> 0x00f1, all -> 0x00ee }
                boolean r8 = r8.equals(r14)     // Catch:{ Throwable -> 0x00f1, all -> 0x00ee }
                if (r8 == 0) goto L_0x00ab
                r6 = 1
                goto L_0x00af
            L_0x00ab:
                int r6 = r6 + 1
                goto L_0x0097
            L_0x00ae:
                r6 = 0
            L_0x00af:
                if (r6 == 0) goto L_0x00b3
            L_0x00b1:
                r6 = 0
                goto L_0x0068
            L_0x00b3:
                int r13 = r13 + 1
                java.lang.String r6 = r12.substring(r13)     // Catch:{ Throwable -> 0x00f1, all -> 0x00ee }
                com.facebook.soloader.f$b r8 = new com.facebook.soloader.f$b     // Catch:{ Throwable -> 0x00f1, all -> 0x00ee }
                java.io.File r12 = new java.io.File     // Catch:{ Throwable -> 0x00f1, all -> 0x00ee }
                r12.<init>(r9, r6)     // Catch:{ Throwable -> 0x00f1, all -> 0x00ee }
                r8.<init>(r14, r6, r12)     // Catch:{ Throwable -> 0x00f1, all -> 0x00ee }
                r0.add(r8)     // Catch:{ Throwable -> 0x00f1, all -> 0x00ee }
                goto L_0x00b1
            L_0x00c7:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ Throwable -> 0x00f1, all -> 0x00ee }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00f1, all -> 0x00ee }
                r2.<init>()     // Catch:{ Throwable -> 0x00f1, all -> 0x00ee }
                java.lang.String r3 = "illegal line in exopackage metadata: ["
                r2.append(r3)     // Catch:{ Throwable -> 0x00f1, all -> 0x00ee }
                r2.append(r12)     // Catch:{ Throwable -> 0x00f1, all -> 0x00ee }
                java.lang.String r3 = "]"
                r2.append(r3)     // Catch:{ Throwable -> 0x00f1, all -> 0x00ee }
                java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x00f1, all -> 0x00ee }
                r0.<init>(r2)     // Catch:{ Throwable -> 0x00f1, all -> 0x00ee }
                throw r0     // Catch:{ Throwable -> 0x00f1, all -> 0x00ee }
            L_0x00e3:
                r11.close()     // Catch:{ Throwable -> 0x0103, all -> 0x00ff }
                r10.close()
            L_0x00e9:
                int r7 = r7 + 1
                r6 = 0
                goto L_0x003b
            L_0x00ee:
                r0 = move-exception
                r8 = 0
                goto L_0x00f5
            L_0x00f1:
                r0 = move-exception
                r8 = r0
                throw r8     // Catch:{ all -> 0x00f4 }
            L_0x00f4:
                r0 = move-exception
            L_0x00f5:
                if (r8 == 0) goto L_0x00fb
                r11.close()     // Catch:{ Throwable -> 0x00fe, all -> 0x00ff }
                goto L_0x00fe
            L_0x00fb:
                r11.close()     // Catch:{ Throwable -> 0x0103, all -> 0x00ff }
            L_0x00fe:
                throw r0     // Catch:{ Throwable -> 0x0103, all -> 0x00ff }
            L_0x00ff:
                r0 = move-exception
                r17 = 0
                goto L_0x0109
            L_0x0103:
                r0 = move-exception
                r8 = r0
                throw r8     // Catch:{ all -> 0x0106 }
            L_0x0106:
                r0 = move-exception
                r17 = r8
            L_0x0109:
                if (r17 == 0) goto L_0x010f
                r10.close()     // Catch:{ Throwable -> 0x0112 }
                goto L_0x0112
            L_0x010f:
                r10.close()
            L_0x0112:
                throw r0
            L_0x0113:
                int r2 = r3.size()
                java.lang.String[] r2 = new java.lang.String[r2]
                java.lang.Object[] r2 = r3.toArray(r2)
                java.lang.String[] r2 = (java.lang.String[]) r2
                r3 = r20
                r3.mo6816a(r2)
                int r2 = r0.size()
                com.facebook.soloader.f$b[] r2 = new com.facebook.soloader.C1913f.C1916b[r2]
                java.lang.Object[] r0 = r0.toArray(r2)
                com.facebook.soloader.f$b[] r0 = (com.facebook.soloader.C1913f.C1916b[]) r0
                r1.f5695a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C1913f.C1914a.<init>(com.facebook.soloader.f, com.facebook.soloader.q):void");
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public C1933b mo6805m() {
            return new C1933b(this.f5695a);
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public C1935d mo6806n() {
            return new C1915a();
        }
    }

    /* renamed from: com.facebook.soloader.f$b */
    private static final class C1916b extends C1932a {

        /* renamed from: c */
        final File f5699c;

        C1916b(String str, String str2, File file) {
            super(str, str2);
            this.f5699c = file;
        }
    }

    public C1913f(Context context, String str) {
        super(context, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1936e mo6797b() {
        return new C1914a(this, this);
    }
}
