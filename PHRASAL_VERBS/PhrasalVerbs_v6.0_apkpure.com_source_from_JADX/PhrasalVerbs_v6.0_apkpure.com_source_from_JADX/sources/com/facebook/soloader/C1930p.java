package com.facebook.soloader;

import android.util.Log;
import com.facebook.soloader.C1931q.C1933b;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.facebook.soloader.p */
class C1930p implements Runnable {

    /* renamed from: a */
    final /* synthetic */ File f5717a;

    /* renamed from: b */
    final /* synthetic */ byte[] f5718b;

    /* renamed from: c */
    final /* synthetic */ C1933b f5719c;

    /* renamed from: d */
    final /* synthetic */ File f5720d;

    /* renamed from: e */
    final /* synthetic */ C1922i f5721e;

    /* renamed from: f */
    final /* synthetic */ C1931q f5722f;

    C1930p(C1931q qVar, File file, byte[] bArr, C1933b bVar, File file2, C1922i iVar) {
        this.f5722f = qVar;
        this.f5717a = file;
        this.f5718b = bArr;
        this.f5719c = bVar;
        this.f5720d = file2;
        this.f5721e = iVar;
    }

    public void run() {
        RandomAccessFile randomAccessFile;
        Throwable th;
        RandomAccessFile randomAccessFile2;
        Throwable th2;
        String str = " (from syncer thread)";
        String str2 = "rw";
        String str3 = "releasing dso store lock for ";
        String str4 = "fb-UnpackingSoSource";
        try {
            Log.v(str4, "starting syncer worker");
            randomAccessFile = new RandomAccessFile(this.f5717a, str2);
            randomAccessFile.write(this.f5718b);
            randomAccessFile.setLength(randomAccessFile.getFilePointer());
            randomAccessFile.close();
            randomAccessFile2 = new RandomAccessFile(new File(this.f5722f.f5693a, "dso_manifest"), str2);
            this.f5719c.mo6818a((DataOutput) randomAccessFile2);
            randomAccessFile2.close();
            SysUtil.m7270b(this.f5722f.f5693a);
            C1931q.m7324b(this.f5720d, 1);
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(this.f5722f.f5693a);
                sb.append(str);
                Log.v(str4, sb.toString());
                this.f5721e.close();
                return;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            throw th;
            throw th;
        } catch (Throwable th3) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(this.f5722f.f5693a);
            sb2.append(str);
            Log.v(str4, sb2.toString());
            this.f5721e.close();
            throw th3;
        }
    }
}
