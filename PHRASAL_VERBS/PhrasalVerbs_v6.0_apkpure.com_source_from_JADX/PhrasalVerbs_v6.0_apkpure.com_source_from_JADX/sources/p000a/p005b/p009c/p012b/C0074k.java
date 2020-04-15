package p000a.p005b.p009c.p012b;

import android.content.Context;
import android.content.res.Resources;
import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;

/* renamed from: a.b.c.b.k */
public class C0074k {
    /* renamed from: a */
    public static File m259a(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(".font");
        sb.append(Process.myPid());
        String str = "-";
        sb.append(str);
        sb.append(Process.myTid());
        sb.append(str);
        String sb2 = sb.toString();
        int i = 0;
        while (i < 100) {
            File cacheDir = context.getCacheDir();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(i);
            File file = new File(cacheDir, sb3.toString());
            try {
                if (file.createNewFile()) {
                    return file;
                }
                i++;
            } catch (IOException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static ByteBuffer m260a(Context context, Resources resources, int i) {
        File a = m259a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!m264a(a, resources, i)) {
                return null;
            }
            ByteBuffer a2 = m262a(a);
            a.delete();
            return a2;
        } finally {
            a.delete();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        r9 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0049, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0053, code lost:
        if (r10 != null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0048 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:7:0x0013] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0053  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer m261a(android.content.Context r8, android.os.CancellationSignal r9, android.net.Uri r10) {
        /*
            android.content.ContentResolver r8 = r8.getContentResolver()
            r0 = 0
            java.lang.String r1 = "r"
            android.os.ParcelFileDescriptor r8 = r8.openFileDescriptor(r10, r1, r9)     // Catch:{ IOException -> 0x005d }
            if (r8 != 0) goto L_0x0013
            if (r8 == 0) goto L_0x0012
            r8.close()     // Catch:{ IOException -> 0x005d }
        L_0x0012:
            return r0
        L_0x0013:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x004b, all -> 0x0048 }
            java.io.FileDescriptor r10 = r8.getFileDescriptor()     // Catch:{ Throwable -> 0x004b, all -> 0x0048 }
            r9.<init>(r10)     // Catch:{ Throwable -> 0x004b, all -> 0x0048 }
            java.nio.channels.FileChannel r1 = r9.getChannel()     // Catch:{ Throwable -> 0x0038, all -> 0x0035 }
            long r5 = r1.size()     // Catch:{ Throwable -> 0x0038, all -> 0x0035 }
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ Throwable -> 0x0038, all -> 0x0035 }
            r3 = 0
            java.nio.MappedByteBuffer r10 = r1.map(r2, r3, r5)     // Catch:{ Throwable -> 0x0038, all -> 0x0035 }
            r9.close()     // Catch:{ Throwable -> 0x004b, all -> 0x0048 }
            if (r8 == 0) goto L_0x0034
            r8.close()     // Catch:{ IOException -> 0x005d }
        L_0x0034:
            return r10
        L_0x0035:
            r10 = move-exception
            r1 = r0
            goto L_0x003e
        L_0x0038:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x003a }
        L_0x003a:
            r1 = move-exception
            r7 = r1
            r1 = r10
            r10 = r7
        L_0x003e:
            if (r1 == 0) goto L_0x0044
            r9.close()     // Catch:{ Throwable -> 0x0047, all -> 0x0048 }
            goto L_0x0047
        L_0x0044:
            r9.close()     // Catch:{ Throwable -> 0x004b, all -> 0x0048 }
        L_0x0047:
            throw r10     // Catch:{ Throwable -> 0x004b, all -> 0x0048 }
        L_0x0048:
            r9 = move-exception
            r10 = r0
            goto L_0x0051
        L_0x004b:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x004d }
        L_0x004d:
            r10 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x0051:
            if (r8 == 0) goto L_0x005c
            if (r10 == 0) goto L_0x0059
            r8.close()     // Catch:{ Throwable -> 0x005c }
            goto L_0x005c
        L_0x0059:
            r8.close()     // Catch:{ IOException -> 0x005d }
        L_0x005c:
            throw r9     // Catch:{ IOException -> 0x005d }
        L_0x005d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p009c.p012b.C0074k.m261a(android.content.Context, android.os.CancellationSignal, android.net.Uri):java.nio.ByteBuffer");
    }

    /* renamed from: a */
    private static ByteBuffer m262a(File file) {
        Throwable th;
        Throwable th2;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(MapMode.READ_ONLY, 0, channel.size());
                fileInputStream.close();
                return map;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                th2 = r9;
                th = th4;
            }
            if (th2 != null) {
                try {
                    fileInputStream.close();
                } catch (Throwable unused) {
                }
            } else {
                fileInputStream.close();
            }
            throw th;
            throw th;
        } catch (IOException unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m263a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m264a(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean a = m265a(file, inputStream);
                m263a((Closeable) inputStream);
                return a;
            } catch (Throwable th) {
                th = th;
                m263a((Closeable) inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            m263a((Closeable) inputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static boolean m265a(File file, InputStream inputStream) {
        ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream2.write(bArr, 0, read);
                    } else {
                        m263a((Closeable) fileOutputStream2);
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        return true;
                    }
                }
            } catch (IOException e) {
                e = e;
                fileOutputStream = fileOutputStream2;
                String str = "TypefaceCompatUtil";
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error copying resource contents to temp file: ");
                    sb.append(e.getMessage());
                    Log.e(str, sb.toString());
                    m263a((Closeable) fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    m263a((Closeable) fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                m263a((Closeable) fileOutputStream);
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            String str2 = "TypefaceCompatUtil";
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error copying resource contents to temp file: ");
            sb2.append(e.getMessage());
            Log.e(str2, sb2.toString());
            m263a((Closeable) fileOutputStream);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        }
    }
}
