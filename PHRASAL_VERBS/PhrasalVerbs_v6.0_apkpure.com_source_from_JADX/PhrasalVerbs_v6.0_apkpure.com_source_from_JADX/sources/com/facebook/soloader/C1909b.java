package com.facebook.soloader;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.StrictMode.ThreadPolicy;
import android.util.Log;
import java.io.File;

/* renamed from: com.facebook.soloader.b */
public class C1909b extends C1928n {

    /* renamed from: a */
    private Context f5690a;

    /* renamed from: b */
    private int f5691b;

    /* renamed from: c */
    private C1910c f5692c;

    public C1909b(Context context, int i) {
        this.f5690a = context.getApplicationContext();
        if (this.f5690a == null) {
            Log.w("SoLoader", "context.getApplicationContext returned null, holding reference to original context.");
            this.f5690a = context;
        }
        this.f5691b = i;
        this.f5692c = new C1910c(new File(this.f5690a.getApplicationInfo().nativeLibraryDir), i);
    }

    /* renamed from: a */
    public int mo6799a(String str, int i, ThreadPolicy threadPolicy) {
        return this.f5692c.mo6799a(str, i, threadPolicy);
    }

    /* renamed from: a */
    public File mo6800a(String str) {
        return this.f5692c.mo6800a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6801a(int i) {
        this.f5692c.mo6801a(i);
    }

    /* renamed from: a */
    public boolean mo6802a() {
        try {
            File file = this.f5692c.f5693a;
            Context createPackageContext = this.f5690a.createPackageContext(this.f5690a.getPackageName(), 0);
            File file2 = new File(createPackageContext.getApplicationInfo().nativeLibraryDir);
            if (file.equals(file2)) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Native library directory updated from ");
            sb.append(file);
            sb.append(" to ");
            sb.append(file2);
            Log.d("SoLoader", sb.toString());
            this.f5691b |= 1;
            this.f5692c = new C1910c(file2, this.f5691b);
            this.f5692c.mo6801a(this.f5691b);
            this.f5690a = createPackageContext;
            return true;
        } catch (NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return this.f5692c.toString();
    }
}
