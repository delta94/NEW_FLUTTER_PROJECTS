package p000a.p005b.p009c.p012b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import p000a.p005b.p009c.p010a.p011a.C0042c.C0044b;
import p000a.p005b.p009c.p010a.p011a.C0042c.C0045c;
import p000a.p005b.p009c.p016e.C0084f.C0086b;

/* renamed from: a.b.c.b.j */
class C0072j {

    /* renamed from: a.b.c.b.j$a */
    private interface C0073a<T> {
        /* renamed from: a */
        int mo234a(T t);

        /* renamed from: b */
        boolean mo236b(T t);
    }

    C0072j() {
    }

    /* renamed from: a */
    private C0045c m250a(C0044b bVar, int i) {
        return (C0045c) m251a(bVar.mo189a(), i, new C0071i(this));
    }

    /* renamed from: a */
    private static <T> T m251a(T[] tArr, int i, C0073a<T> aVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(aVar.mo234a(t2) - i2) * 2) + (aVar.mo236b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0086b mo239a(C0086b[] bVarArr, int i) {
        return (C0086b) m251a(bVarArr, i, new C0070h(this));
    }

    /* renamed from: a */
    public Typeface mo223a(Context context, C0044b bVar, Resources resources, int i) {
        C0045c a = m250a(bVar, i);
        if (a == null) {
            return null;
        }
        return C0065c.m211a(context, resources, a.mo191b(), a.mo190a(), i);
    }

    /* renamed from: a */
    public Typeface mo224a(Context context, Resources resources, int i, String str, int i2) {
        File a = C0074k.m259a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C0074k.m264a(a, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }

    /* renamed from: a */
    public Typeface mo222a(Context context, CancellationSignal cancellationSignal, C0086b[] bVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (bVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo239a(bVarArr, i).mo281c());
            try {
                Typeface a = mo240a(context, inputStream);
                C0074k.m263a((Closeable) inputStream);
                return a;
            } catch (IOException unused) {
                C0074k.m263a((Closeable) inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                C0074k.m263a((Closeable) inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            C0074k.m263a((Closeable) inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C0074k.m263a((Closeable) inputStream2);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo240a(Context context, InputStream inputStream) {
        File a = C0074k.m259a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C0074k.m265a(a, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }
}
