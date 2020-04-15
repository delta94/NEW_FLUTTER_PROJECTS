package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.util.Log;
import java.io.File;
import java.util.zip.ZipEntry;

/* renamed from: com.facebook.soloader.a */
public class C1907a extends C1918h {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final int f5686i;

    /* renamed from: com.facebook.soloader.a$a */
    protected class C1908a extends C1920b {

        /* renamed from: e */
        private File f5687e;

        /* renamed from: f */
        private final int f5688f;

        C1908a(C1918h hVar) {
            super(hVar);
            this.f5687e = new File(C1907a.this.f5723c.getApplicationInfo().nativeLibraryDir);
            this.f5688f = C1907a.this.f5686i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo6798a(ZipEntry zipEntry, String str) {
            String str2;
            Object[] objArr;
            String str3;
            String name = zipEntry.getName();
            boolean z = true;
            if (str.equals(C1907a.this.f5724d)) {
                C1907a.this.f5724d = null;
                objArr = new Object[]{str};
                str3 = "allowing consideration of corrupted lib %s";
            } else {
                if ((this.f5688f & 1) == 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("allowing consideration of ");
                    sb.append(name);
                    sb.append(": self-extraction preferred");
                    str2 = sb.toString();
                } else {
                    File file = new File(this.f5687e, str);
                    if (!file.isFile()) {
                        objArr = new Object[]{name, str};
                        str3 = "allowing considering of %s: %s not in system lib dir";
                    } else {
                        long length = file.length();
                        long size = zipEntry.getSize();
                        if (length != size) {
                            str2 = String.format("allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK", new Object[]{file, Long.valueOf(length), Long.valueOf(size)});
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("not allowing consideration of ");
                            sb2.append(name);
                            sb2.append(": deferring to libdir");
                            str2 = sb2.toString();
                            z = false;
                        }
                    }
                }
                Log.d("ApkSoSource", str2);
                return z;
            }
            str2 = String.format(str3, objArr);
            Log.d("ApkSoSource", str2);
            return z;
        }
    }

    public C1907a(Context context, File file, String str, int i) {
        super(context, str, file, "^lib/([^/]+)/([^/]+\\.so)$");
        this.f5686i = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public byte[] mo6796a() {
        File canonicalFile = this.f5700g.getCanonicalFile();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeByte(2);
            obtain.writeString(canonicalFile.getPath());
            obtain.writeLong(canonicalFile.lastModified());
            obtain.writeInt(SysUtil.m7264a(this.f5723c));
            if ((this.f5686i & 1) == 0) {
                obtain.writeByte(0);
                return obtain.marshall();
            }
            String str = this.f5723c.getApplicationInfo().nativeLibraryDir;
            if (str == null) {
                obtain.writeByte(1);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                return marshall;
            }
            File canonicalFile2 = new File(str).getCanonicalFile();
            if (!canonicalFile2.exists()) {
                obtain.writeByte(1);
                byte[] marshall2 = obtain.marshall();
                obtain.recycle();
                return marshall2;
            }
            obtain.writeByte(2);
            obtain.writeString(canonicalFile2.getPath());
            obtain.writeLong(canonicalFile2.lastModified());
            byte[] marshall3 = obtain.marshall();
            obtain.recycle();
            return marshall3;
        } finally {
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1936e mo6797b() {
        return new C1908a(this);
    }
}
