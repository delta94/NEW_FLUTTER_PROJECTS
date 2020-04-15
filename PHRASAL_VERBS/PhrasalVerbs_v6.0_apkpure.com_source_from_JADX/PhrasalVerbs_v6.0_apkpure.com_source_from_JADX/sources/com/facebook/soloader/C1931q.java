package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.os.StrictMode.ThreadPolicy;
import android.util.Log;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.soloader.q */
public abstract class C1931q extends C1910c {

    /* renamed from: c */
    protected final Context f5723c;

    /* renamed from: d */
    protected String f5724d;

    /* renamed from: e */
    private String[] f5725e;

    /* renamed from: f */
    private final Map<String, Object> f5726f = new HashMap();

    /* renamed from: com.facebook.soloader.q$a */
    public static class C1932a {

        /* renamed from: a */
        public final String f5727a;

        /* renamed from: b */
        public final String f5728b;

        public C1932a(String str, String str2) {
            this.f5727a = str;
            this.f5728b = str2;
        }
    }

    /* renamed from: com.facebook.soloader.q$b */
    public static final class C1933b {

        /* renamed from: a */
        public final C1932a[] f5729a;

        public C1933b(C1932a[] aVarArr) {
            this.f5729a = aVarArr;
        }

        /* renamed from: a */
        static final C1933b m7332a(DataInput dataInput) {
            if (dataInput.readByte() == 1) {
                int readInt = dataInput.readInt();
                if (readInt >= 0) {
                    C1932a[] aVarArr = new C1932a[readInt];
                    for (int i = 0; i < readInt; i++) {
                        aVarArr[i] = new C1932a(dataInput.readUTF(), dataInput.readUTF());
                    }
                    return new C1933b(aVarArr);
                }
                throw new RuntimeException("illegal number of shared libraries");
            }
            throw new RuntimeException("wrong dso manifest version");
        }

        /* renamed from: a */
        public final void mo6818a(DataOutput dataOutput) {
            dataOutput.writeByte(1);
            dataOutput.writeInt(this.f5729a.length);
            int i = 0;
            while (true) {
                C1932a[] aVarArr = this.f5729a;
                if (i < aVarArr.length) {
                    dataOutput.writeUTF(aVarArr[i].f5727a);
                    dataOutput.writeUTF(this.f5729a[i].f5728b);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: com.facebook.soloader.q$c */
    protected static final class C1934c implements Closeable {

        /* renamed from: a */
        public final C1932a f5730a;

        /* renamed from: b */
        public final InputStream f5731b;

        public C1934c(C1932a aVar, InputStream inputStream) {
            this.f5730a = aVar;
            this.f5731b = inputStream;
        }

        public void close() {
            this.f5731b.close();
        }
    }

    /* renamed from: com.facebook.soloader.q$d */
    protected static abstract class C1935d implements Closeable {
        protected C1935d() {
        }

        public void close() {
        }

        /* renamed from: m */
        public abstract boolean mo6807m();

        /* renamed from: n */
        public abstract C1934c mo6808n();
    }

    /* renamed from: com.facebook.soloader.q$e */
    protected static abstract class C1936e implements Closeable {
        protected C1936e() {
        }

        public void close() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public abstract C1933b mo6805m();

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public abstract C1935d mo6806n();
    }

    protected C1931q(Context context, String str) {
        super(m7318a(context, str), 1);
        this.f5723c = context;
    }

    /* renamed from: a */
    public static File m7318a(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getApplicationInfo().dataDir);
        sb.append("/");
        sb.append(str);
        return new File(sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048 A[Catch:{ Throwable -> 0x003a, all -> 0x0037, Throwable -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f A[Catch:{ Throwable -> 0x003a, all -> 0x0037, Throwable -> 0x00dc }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m7319a(byte r12, com.facebook.soloader.C1931q.C1933b r13, com.facebook.soloader.C1931q.C1935d r14) {
        /*
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "regenerating DSO store "
            r0.append(r1)
            java.lang.Class r1 = r11.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "fb-UnpackingSoSource"
            android.util.Log.v(r1, r0)
            java.io.File r0 = new java.io.File
            java.io.File r2 = r11.f5693a
            java.lang.String r3 = "dso_manifest"
            r0.<init>(r2, r3)
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile
            java.lang.String r3 = "rw"
            r2.<init>(r0, r3)
            r0 = 1
            r3 = 0
            if (r12 != r0) goto L_0x0044
            com.facebook.soloader.q$b r12 = com.facebook.soloader.C1931q.C1933b.m7332a(r2)     // Catch:{ Exception -> 0x003e }
            goto L_0x0045
        L_0x0037:
            r12 = move-exception
            goto L_0x00d3
        L_0x003a:
            r12 = move-exception
            r3 = r12
            goto L_0x00d2
        L_0x003e:
            r12 = move-exception
            java.lang.String r4 = "error reading existing DSO manifest"
            android.util.Log.i(r1, r4, r12)     // Catch:{ Throwable -> 0x003a }
        L_0x0044:
            r12 = r3
        L_0x0045:
            r4 = 0
            if (r12 != 0) goto L_0x004f
            com.facebook.soloader.q$b r12 = new com.facebook.soloader.q$b     // Catch:{ Throwable -> 0x003a }
            com.facebook.soloader.q$a[] r5 = new com.facebook.soloader.C1931q.C1932a[r4]     // Catch:{ Throwable -> 0x003a }
            r12.<init>(r5)     // Catch:{ Throwable -> 0x003a }
        L_0x004f:
            com.facebook.soloader.q$a[] r13 = r13.f5729a     // Catch:{ Throwable -> 0x003a }
            r11.m7322a(r13)     // Catch:{ Throwable -> 0x003a }
            r13 = 32768(0x8000, float:4.5918E-41)
            byte[] r13 = new byte[r13]     // Catch:{ Throwable -> 0x003a }
        L_0x0059:
            boolean r5 = r14.mo6807m()     // Catch:{ Throwable -> 0x003a }
            if (r5 == 0) goto L_0x00b2
            com.facebook.soloader.q$c r5 = r14.mo6808n()     // Catch:{ Throwable -> 0x003a }
            r6 = 1
            r7 = 0
        L_0x0065:
            if (r6 == 0) goto L_0x0095
            com.facebook.soloader.q$a[] r8 = r12.f5729a     // Catch:{ Throwable -> 0x0093, all -> 0x0090 }
            int r8 = r8.length     // Catch:{ Throwable -> 0x0093, all -> 0x0090 }
            if (r7 >= r8) goto L_0x0095
            com.facebook.soloader.q$a[] r8 = r12.f5729a     // Catch:{ Throwable -> 0x0093, all -> 0x0090 }
            r8 = r8[r7]     // Catch:{ Throwable -> 0x0093, all -> 0x0090 }
            java.lang.String r8 = r8.f5727a     // Catch:{ Throwable -> 0x0093, all -> 0x0090 }
            com.facebook.soloader.q$a r9 = r5.f5730a     // Catch:{ Throwable -> 0x0093, all -> 0x0090 }
            java.lang.String r9 = r9.f5727a     // Catch:{ Throwable -> 0x0093, all -> 0x0090 }
            boolean r8 = r8.equals(r9)     // Catch:{ Throwable -> 0x0093, all -> 0x0090 }
            if (r8 == 0) goto L_0x008d
            com.facebook.soloader.q$a[] r8 = r12.f5729a     // Catch:{ Throwable -> 0x0093, all -> 0x0090 }
            r8 = r8[r7]     // Catch:{ Throwable -> 0x0093, all -> 0x0090 }
            java.lang.String r8 = r8.f5728b     // Catch:{ Throwable -> 0x0093, all -> 0x0090 }
            com.facebook.soloader.q$a r9 = r5.f5730a     // Catch:{ Throwable -> 0x0093, all -> 0x0090 }
            java.lang.String r9 = r9.f5728b     // Catch:{ Throwable -> 0x0093, all -> 0x0090 }
            boolean r8 = r8.equals(r9)     // Catch:{ Throwable -> 0x0093, all -> 0x0090 }
            if (r8 == 0) goto L_0x008d
            r6 = 0
        L_0x008d:
            int r7 = r7 + 1
            goto L_0x0065
        L_0x0090:
            r12 = move-exception
            r13 = r3
            goto L_0x00a0
        L_0x0093:
            r12 = move-exception
            goto L_0x009b
        L_0x0095:
            if (r6 == 0) goto L_0x00ac
            r11.m7320a(r5, r13)     // Catch:{ Throwable -> 0x0093, all -> 0x0090 }
            goto L_0x00ac
        L_0x009b:
            throw r12     // Catch:{ all -> 0x009c }
        L_0x009c:
            r13 = move-exception
            r10 = r13
            r13 = r12
            r12 = r10
        L_0x00a0:
            if (r5 == 0) goto L_0x00ab
            if (r13 == 0) goto L_0x00a8
            r5.close()     // Catch:{ Throwable -> 0x00ab }
            goto L_0x00ab
        L_0x00a8:
            r5.close()     // Catch:{ Throwable -> 0x003a }
        L_0x00ab:
            throw r12     // Catch:{ Throwable -> 0x003a }
        L_0x00ac:
            if (r5 == 0) goto L_0x0059
            r5.close()     // Catch:{ Throwable -> 0x003a }
            goto L_0x0059
        L_0x00b2:
            r2.close()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Finished regenerating DSO store "
            r12.append(r13)
            java.lang.Class r13 = r11.getClass()
            java.lang.String r13 = r13.getName()
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            android.util.Log.v(r1, r12)
            return
        L_0x00d2:
            throw r3     // Catch:{ all -> 0x0037 }
        L_0x00d3:
            if (r3 == 0) goto L_0x00d9
            r2.close()     // Catch:{ Throwable -> 0x00dc }
            goto L_0x00dc
        L_0x00d9:
            r2.close()
        L_0x00dc:
            throw r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C1931q.m7319a(byte, com.facebook.soloader.q$b, com.facebook.soloader.q$d):void");
    }

    /* renamed from: a */
    private void m7320a(C1934c cVar, byte[] bArr) {
        RandomAccessFile randomAccessFile;
        String str = "rw";
        StringBuilder sb = new StringBuilder();
        sb.append("extracting DSO ");
        sb.append(cVar.f5730a.f5727a);
        String str2 = "fb-UnpackingSoSource";
        Log.i(str2, sb.toString());
        if (this.f5693a.setWritable(true, true)) {
            File file = new File(this.f5693a, cVar.f5730a.f5727a);
            try {
                randomAccessFile = new RandomAccessFile(file, str);
            } catch (IOException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("error overwriting ");
                sb2.append(file);
                sb2.append(" trying to delete and start over");
                Log.w(str2, sb2.toString(), e);
                SysUtil.m7267a(file);
                randomAccessFile = new RandomAccessFile(file, str);
            }
            try {
                int available = cVar.f5731b.available();
                if (available > 1) {
                    SysUtil.m7268a(randomAccessFile.getFD(), (long) available);
                }
                SysUtil.m7265a(randomAccessFile, cVar.f5731b, Integer.MAX_VALUE, bArr);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                if (file.setExecutable(true, false)) {
                    randomAccessFile.close();
                    return;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("cannot make file executable: ");
                sb3.append(file);
                throw new IOException(sb3.toString());
            } catch (IOException e2) {
                SysUtil.m7267a(file);
                throw e2;
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("cannot make directory writable for us: ");
            sb4.append(this.f5693a);
            throw new IOException(sb4.toString());
        }
    }

    /* renamed from: a */
    private void m7322a(C1932a[] aVarArr) {
        String[] list = this.f5693a.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals("dso_state") && !str.equals("dso_lock") && !str.equals("dso_deps") && !str.equals("dso_manifest")) {
                    boolean z = false;
                    int i = 0;
                    while (!z && i < aVarArr.length) {
                        if (aVarArr[i].f5727a.equals(str)) {
                            z = true;
                        }
                        i++;
                    }
                    if (!z) {
                        File file = new File(this.f5693a, str);
                        StringBuilder sb = new StringBuilder();
                        sb.append("deleting unaccounted-for file ");
                        sb.append(file);
                        Log.v("fb-UnpackingSoSource", sb.toString());
                        SysUtil.m7267a(file);
                    }
                }
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("unable to list directory ");
        sb2.append(this.f5693a);
        throw new IOException(sb2.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f0, code lost:
        r13 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00f1, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00fb, code lost:
        if (r14 != null) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f0 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:32:0x008d] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00fb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m7323a(com.facebook.soloader.C1922i r13, int r14, byte[] r15) {
        /*
            r12 = this;
            java.lang.String r0 = "fb-UnpackingSoSource"
            java.io.File r6 = new java.io.File
            java.io.File r1 = r12.f5693a
            java.lang.String r2 = "dso_state"
            r6.<init>(r1, r2)
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile
            java.lang.String r2 = "rw"
            r1.<init>(r6, r2)
            r8 = 1
            r3 = 0
            r4 = 0
            byte r5 = r1.readByte()     // Catch:{ EOFException -> 0x0036, Throwable -> 0x003a }
            if (r5 == r8) goto L_0x0047
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0036, Throwable -> 0x003a }
            r5.<init>()     // Catch:{ EOFException -> 0x0036, Throwable -> 0x003a }
            java.lang.String r7 = "dso store "
            r5.append(r7)     // Catch:{ EOFException -> 0x0036, Throwable -> 0x003a }
            java.io.File r7 = r12.f5693a     // Catch:{ EOFException -> 0x0036, Throwable -> 0x003a }
            r5.append(r7)     // Catch:{ EOFException -> 0x0036, Throwable -> 0x003a }
            java.lang.String r7 = " regeneration interrupted: wiping clean"
            r5.append(r7)     // Catch:{ EOFException -> 0x0036, Throwable -> 0x003a }
            java.lang.String r5 = r5.toString()     // Catch:{ EOFException -> 0x0036, Throwable -> 0x003a }
            android.util.Log.v(r0, r5)     // Catch:{ EOFException -> 0x0036, Throwable -> 0x003a }
        L_0x0036:
            r5 = 0
            goto L_0x0047
        L_0x0038:
            r13 = move-exception
            goto L_0x003d
        L_0x003a:
            r13 = move-exception
            r3 = r13
            throw r3     // Catch:{ all -> 0x0038 }
        L_0x003d:
            if (r3 == 0) goto L_0x0043
            r1.close()     // Catch:{ Throwable -> 0x0046 }
            goto L_0x0046
        L_0x0043:
            r1.close()
        L_0x0046:
            throw r13
        L_0x0047:
            r1.close()
            java.io.File r7 = new java.io.File
            java.io.File r1 = r12.f5693a
            java.lang.String r9 = "dso_deps"
            r7.<init>(r1, r9)
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile
            r1.<init>(r7, r2)
            long r9 = r1.length()     // Catch:{ Throwable -> 0x0107 }
            int r2 = (int) r9     // Catch:{ Throwable -> 0x0107 }
            byte[] r2 = new byte[r2]     // Catch:{ Throwable -> 0x0107 }
            int r9 = r1.read(r2)     // Catch:{ Throwable -> 0x0107 }
            int r10 = r2.length     // Catch:{ Throwable -> 0x0107 }
            if (r9 == r10) goto L_0x006c
            java.lang.String r5 = "short read of so store deps file: marking unclean"
            android.util.Log.v(r0, r5)     // Catch:{ Throwable -> 0x0107 }
            r5 = 0
        L_0x006c:
            boolean r2 = java.util.Arrays.equals(r2, r15)     // Catch:{ Throwable -> 0x0107 }
            if (r2 != 0) goto L_0x0078
            java.lang.String r2 = "deps mismatch on deps store: regenerating"
            android.util.Log.v(r0, r2)     // Catch:{ Throwable -> 0x0107 }
            r5 = 0
        L_0x0078:
            if (r5 == 0) goto L_0x0081
            r2 = r14 & 2
            if (r2 == 0) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            r5 = r3
            goto L_0x00a3
        L_0x0081:
            java.lang.String r2 = "so store dirty: regenerating"
            android.util.Log.v(r0, r2)     // Catch:{ Throwable -> 0x0107 }
            m7324b(r6, r4)     // Catch:{ Throwable -> 0x0107 }
            com.facebook.soloader.q$e r0 = r12.mo6797b()     // Catch:{ Throwable -> 0x0107 }
            com.facebook.soloader.q$b r2 = r0.mo6805m()     // Catch:{ Throwable -> 0x00f3, all -> 0x00f0 }
            com.facebook.soloader.q$d r9 = r0.mo6806n()     // Catch:{ Throwable -> 0x00f3, all -> 0x00f0 }
            r12.m7319a(r5, r2, r9)     // Catch:{ Throwable -> 0x00de, all -> 0x00db }
            if (r9 == 0) goto L_0x009d
            r9.close()     // Catch:{ Throwable -> 0x00f3, all -> 0x00f0 }
        L_0x009d:
            if (r0 == 0) goto L_0x00a2
            r0.close()     // Catch:{ Throwable -> 0x0107 }
        L_0x00a2:
            r5 = r2
        L_0x00a3:
            r1.close()
            if (r5 != 0) goto L_0x00a9
            return r4
        L_0x00a9:
            com.facebook.soloader.p r0 = new com.facebook.soloader.p
            r1 = r0
            r2 = r12
            r3 = r7
            r4 = r15
            r7 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r13 = r14 & 1
            if (r13 == 0) goto L_0x00d7
            java.lang.Thread r13 = new java.lang.Thread
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "SoSync:"
            r14.append(r15)
            java.io.File r15 = r12.f5693a
            java.lang.String r15 = r15.getName()
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r0, r14)
            r13.start()
            goto L_0x00da
        L_0x00d7:
            r0.run()
        L_0x00da:
            return r8
        L_0x00db:
            r13 = move-exception
            r14 = r3
            goto L_0x00e4
        L_0x00de:
            r13 = move-exception
            throw r13     // Catch:{ all -> 0x00e0 }
        L_0x00e0:
            r14 = move-exception
            r11 = r14
            r14 = r13
            r13 = r11
        L_0x00e4:
            if (r9 == 0) goto L_0x00ef
            if (r14 == 0) goto L_0x00ec
            r9.close()     // Catch:{ Throwable -> 0x00ef, all -> 0x00f0 }
            goto L_0x00ef
        L_0x00ec:
            r9.close()     // Catch:{ Throwable -> 0x00f3, all -> 0x00f0 }
        L_0x00ef:
            throw r13     // Catch:{ Throwable -> 0x00f3, all -> 0x00f0 }
        L_0x00f0:
            r13 = move-exception
            r14 = r3
            goto L_0x00f9
        L_0x00f3:
            r13 = move-exception
            throw r13     // Catch:{ all -> 0x00f5 }
        L_0x00f5:
            r14 = move-exception
            r11 = r14
            r14 = r13
            r13 = r11
        L_0x00f9:
            if (r0 == 0) goto L_0x0104
            if (r14 == 0) goto L_0x0101
            r0.close()     // Catch:{ Throwable -> 0x0104 }
            goto L_0x0104
        L_0x0101:
            r0.close()     // Catch:{ Throwable -> 0x0107 }
        L_0x0104:
            throw r13     // Catch:{ Throwable -> 0x0107 }
        L_0x0105:
            r13 = move-exception
            goto L_0x010a
        L_0x0107:
            r13 = move-exception
            r3 = r13
            throw r3     // Catch:{ all -> 0x0105 }
        L_0x010a:
            if (r3 == 0) goto L_0x0110
            r1.close()     // Catch:{ Throwable -> 0x0113 }
            goto L_0x0113
        L_0x0110:
            r1.close()
        L_0x0113:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C1931q.m7323a(com.facebook.soloader.i, int, byte[]):boolean");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r3 != null) goto L_0x0028;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m7324b(java.io.File r3, byte r4) {
        /*
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "rw"
            r0.<init>(r3, r1)
            r1 = 0
            r3 = 0
            r0.seek(r1)     // Catch:{ Throwable -> 0x0024 }
            r0.write(r4)     // Catch:{ Throwable -> 0x0024 }
            long r1 = r0.getFilePointer()     // Catch:{ Throwable -> 0x0024 }
            r0.setLength(r1)     // Catch:{ Throwable -> 0x0024 }
            java.io.FileDescriptor r4 = r0.getFD()     // Catch:{ Throwable -> 0x0024 }
            r4.sync()     // Catch:{ Throwable -> 0x0024 }
            r0.close()
            return
        L_0x0022:
            r4 = move-exception
            goto L_0x0026
        L_0x0024:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0022 }
        L_0x0026:
            if (r3 == 0) goto L_0x002c
            r0.close()     // Catch:{ Throwable -> 0x002f }
            goto L_0x002f
        L_0x002c:
            r0.close()
        L_0x002f:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C1931q.m7324b(java.io.File, byte):void");
    }

    /* renamed from: c */
    private Object m7325c(String str) {
        Object obj;
        synchronized (this.f5726f) {
            obj = this.f5726f.get(str);
            if (obj == null) {
                obj = new Object();
                this.f5726f.put(str, obj);
            }
        }
        return obj;
    }

    /* renamed from: a */
    public int mo6799a(String str, int i, ThreadPolicy threadPolicy) {
        int a;
        synchronized (m7325c(str)) {
            a = mo6804a(str, i, this.f5693a, threadPolicy);
        }
        return a;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6801a(int i) {
        String str = "releasing dso store lock for ";
        String str2 = " (syncer thread started)";
        String str3 = "not releasing dso store lock for ";
        String str4 = "fb-UnpackingSoSource";
        SysUtil.m7271c(this.f5693a);
        C1922i a = C1922i.m7300a(new File(this.f5693a, "dso_lock"));
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("locked dso store ");
            sb.append(this.f5693a);
            Log.v(str4, sb.toString());
            if (m7323a(a, i, mo6796a())) {
                a = null;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("dso store is up-to-date: ");
                sb2.append(this.f5693a);
                Log.i(str4, sb2.toString());
            }
            if (a != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(this.f5693a);
                Log.v(str4, sb3.toString());
                a.close();
                return;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str3);
            sb4.append(this.f5693a);
            sb4.append(str2);
            Log.v(str4, sb4.toString());
        } catch (Throwable th) {
            if (a != null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(this.f5693a);
                Log.v(str4, sb5.toString());
                a.close();
            } else {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str3);
                sb6.append(this.f5693a);
                sb6.append(str2);
                Log.v(str4, sb6.toString());
            }
            throw th;
        }
    }

    /* renamed from: a */
    public void mo6816a(String[] strArr) {
        this.f5725e = strArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public byte[] mo6796a() {
        Throwable th;
        Parcel obtain = Parcel.obtain();
        C1936e b = mo6797b();
        try {
            C1932a[] aVarArr = b.mo6805m().f5729a;
            obtain.writeByte(1);
            obtain.writeInt(aVarArr.length);
            for (int i = 0; i < aVarArr.length; i++) {
                obtain.writeString(aVarArr[i].f5727a);
                obtain.writeString(aVarArr[i].f5728b);
            }
            if (b != null) {
                b.close();
            }
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            return marshall;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C1936e mo6797b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public synchronized void mo6817b(String str) {
        synchronized (m7325c(str)) {
            this.f5724d = str;
            mo6801a(2);
        }
    }
}
