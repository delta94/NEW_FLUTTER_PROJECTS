package com.facebook.soloader;

import android.os.StrictMode.ThreadPolicy;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.soloader.c */
public class C1910c extends C1928n {

    /* renamed from: a */
    protected final File f5693a;

    /* renamed from: b */
    protected final int f5694b;

    public C1910c(File file, int i) {
        this.f5693a = file;
        this.f5694b = i;
    }

    /* renamed from: a */
    private void m7280a(File file, int i, ThreadPolicy threadPolicy) {
        String[] a = m7281a(file);
        StringBuilder sb = new StringBuilder();
        sb.append("Loading lib dependencies: ");
        sb.append(Arrays.toString(a));
        Log.d("SoLoader", sb.toString());
        for (String str : a) {
            if (!str.startsWith("/")) {
                SoLoader.m7252a(str, i | 1, threadPolicy);
            }
        }
    }

    /* renamed from: a */
    private static String[] m7281a(File file) {
        if (SoLoader.f5674a) {
            StringBuilder sb = new StringBuilder();
            sb.append("SoLoader.getElfDependencies[");
            sb.append(file.getName());
            sb.append("]");
            Api18TraceUtils.m7246a(sb.toString());
        }
        try {
            return C1924k.m7305a(file);
        } finally {
            if (SoLoader.f5674a) {
                Api18TraceUtils.m7245a();
            }
        }
    }

    /* renamed from: a */
    public int mo6799a(String str, int i, ThreadPolicy threadPolicy) {
        return mo6804a(str, i, this.f5693a, threadPolicy);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo6804a(String str, int i, File file, ThreadPolicy threadPolicy) {
        File file2 = new File(file, str);
        String str2 = "SoLoader";
        if (!file2.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" not found on ");
            sb.append(file.getCanonicalPath());
            Log.d(str2, sb.toString());
            return 0;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" found on ");
        sb2.append(file.getCanonicalPath());
        Log.d(str2, sb2.toString());
        if ((i & 1) == 0 || (this.f5694b & 2) == 0) {
            if ((this.f5694b & 1) != 0) {
                m7280a(file2, i, threadPolicy);
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Not resolving dependencies for ");
                sb3.append(str);
                Log.d(str2, sb3.toString());
            }
            try {
                SoLoader.f5675b.mo6813a(file2.getAbsolutePath(), i);
                return 1;
            } catch (UnsatisfiedLinkError e) {
                if (e.getMessage().contains("bad ELF magic")) {
                    Log.d(str2, "Corrupted lib file detected");
                    return 3;
                }
                throw e;
            }
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append(" loaded implicitly");
            Log.d(str2, sb4.toString());
            return 2;
        }
    }

    /* renamed from: a */
    public File mo6800a(String str) {
        File file = new File(this.f5693a, str);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public String toString() {
        String str;
        try {
            str = String.valueOf(this.f5693a.getCanonicalPath());
        } catch (IOException unused) {
            str = this.f5693a.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[root = ");
        sb.append(str);
        sb.append(" flags = ");
        sb.append(this.f5694b);
        sb.append(']');
        return sb.toString();
    }
}
