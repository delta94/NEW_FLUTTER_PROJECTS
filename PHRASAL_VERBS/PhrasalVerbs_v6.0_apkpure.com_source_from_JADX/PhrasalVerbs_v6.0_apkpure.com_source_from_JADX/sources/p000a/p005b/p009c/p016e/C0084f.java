package p000a.p005b.p009c.p016e;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.support.p029v4.util.C0327i;
import android.support.p029v4.util.C0337n;
import android.support.p029v4.util.C0338o;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000a.p005b.p009c.p010a.p011a.C0042c;
import p000a.p005b.p009c.p012b.C0065c;
import p000a.p005b.p009c.p012b.C0074k;
import p000a.p005b.p009c.p016e.C0092k.C0093a;

/* renamed from: a.b.c.e.f */
public class C0084f {

    /* renamed from: a */
    static final C0327i<String, Typeface> f181a = new C0327i<>(16);

    /* renamed from: b */
    private static final C0092k f182b = new C0092k("fonts", 10, 10000);

    /* renamed from: c */
    static final Object f183c = new Object();

    /* renamed from: d */
    static final C0338o<String, ArrayList<C0093a<C0087c>>> f184d = new C0338o<>();

    /* renamed from: e */
    private static final Comparator<byte[]> f185e = new C0083e();

    /* renamed from: a.b.c.e.f$a */
    public static class C0085a {

        /* renamed from: a */
        private final int f186a;

        /* renamed from: b */
        private final C0086b[] f187b;

        public C0085a(int i, C0086b[] bVarArr) {
            this.f186a = i;
            this.f187b = bVarArr;
        }

        /* renamed from: a */
        public C0086b[] mo277a() {
            return this.f187b;
        }

        /* renamed from: b */
        public int mo278b() {
            return this.f186a;
        }
    }

    /* renamed from: a.b.c.e.f$b */
    public static class C0086b {

        /* renamed from: a */
        private final Uri f188a;

        /* renamed from: b */
        private final int f189b;

        /* renamed from: c */
        private final int f190c;

        /* renamed from: d */
        private final boolean f191d;

        /* renamed from: e */
        private final int f192e;

        public C0086b(Uri uri, int i, int i2, boolean z, int i3) {
            C0337n.m1442a(uri);
            this.f188a = uri;
            this.f189b = i;
            this.f190c = i2;
            this.f191d = z;
            this.f192e = i3;
        }

        /* renamed from: a */
        public int mo279a() {
            return this.f192e;
        }

        /* renamed from: b */
        public int mo280b() {
            return this.f189b;
        }

        /* renamed from: c */
        public Uri mo281c() {
            return this.f188a;
        }

        /* renamed from: d */
        public int mo282d() {
            return this.f190c;
        }

        /* renamed from: e */
        public boolean mo283e() {
            return this.f191d;
        }
    }

    /* renamed from: a.b.c.e.f$c */
    private static final class C0087c {

        /* renamed from: a */
        final Typeface f193a;

        /* renamed from: b */
        final int f194b;

        C0087c(Typeface typeface, int i) {
            this.f193a = typeface;
            this.f194b = i;
        }
    }

    /* renamed from: a */
    public static C0085a m280a(Context context, CancellationSignal cancellationSignal, C0079a aVar) {
        ProviderInfo a = m282a(context.getPackageManager(), aVar, context.getResources());
        return a == null ? new C0085a(1, null) : new C0085a(0, m288a(context, aVar, a.authority, cancellationSignal));
    }

    /* renamed from: a */
    static C0087c m281a(Context context, C0079a aVar, int i) {
        try {
            C0085a a = m280a(context, (CancellationSignal) null, aVar);
            int i2 = -3;
            if (a.mo278b() == 0) {
                Typeface a2 = C0065c.m212a(context, null, a.mo277a(), i);
                if (a2 != null) {
                    i2 = 0;
                }
                return new C0087c(a2, i2);
            }
            if (a.mo278b() == 1) {
                i2 = -2;
            }
            return new C0087c(null, i2);
        } catch (NameNotFoundException unused) {
            return new C0087c(null, -1);
        }
    }

    /* renamed from: a */
    public static ProviderInfo m282a(PackageManager packageManager, C0079a aVar, Resources resources) {
        String d = aVar.mo267d();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(d, 0);
        if (resolveContentProvider == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No package found for authority: ");
            sb.append(d);
            throw new NameNotFoundException(sb.toString());
        } else if (resolveContentProvider.packageName.equals(aVar.mo268e())) {
            List a = m285a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a, f185e);
            List a2 = m284a(aVar, resources);
            for (int i = 0; i < a2.size(); i++) {
                ArrayList arrayList = new ArrayList((Collection) a2.get(i));
                Collections.sort(arrayList, f185e);
                if (m287a(a, (List<byte[]>) arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Found content provider ");
            sb2.append(d);
            sb2.append(", but package was not ");
            sb2.append(aVar.mo268e());
            throw new NameNotFoundException(sb2.toString());
        }
    }

    /* JADX INFO: used method not loaded: a.b.c.e.k.a(java.util.concurrent.Callable, a.b.c.e.k$a):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0078, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0089, code lost:
        f182b.mo291a((java.util.concurrent.Callable) r1, (p000a.p005b.p009c.p016e.C0092k.C0093a) new p000a.p005b.p009c.p016e.C0082d(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0093, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m283a(android.content.Context r2, p000a.p005b.p009c.p016e.C0079a r3, p000a.p005b.p009c.p010a.p011a.C0052h.C0053a r4, android.os.Handler r5, boolean r6, int r7, int r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.mo266c()
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            android.support.v4.util.i<java.lang.String, android.graphics.Typeface> r1 = f181a
            java.lang.Object r1 = r1.mo1366b(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0028
            if (r4 == 0) goto L_0x0027
            r4.mo203a(r1)
        L_0x0027:
            return r1
        L_0x0028:
            if (r6 == 0) goto L_0x0043
            r1 = -1
            if (r7 != r1) goto L_0x0043
            a.b.c.e.f$c r2 = m281a(r2, r3, r8)
            if (r4 == 0) goto L_0x0040
            int r3 = r2.f194b
            if (r3 != 0) goto L_0x003d
            android.graphics.Typeface r3 = r2.f193a
            r4.mo204a(r3, r5)
            goto L_0x0040
        L_0x003d:
            r4.mo202a(r3, r5)
        L_0x0040:
            android.graphics.Typeface r2 = r2.f193a
            return r2
        L_0x0043:
            a.b.c.e.b r1 = new a.b.c.e.b
            r1.<init>(r2, r3, r8, r0)
            r2 = 0
            if (r6 == 0) goto L_0x0056
            a.b.c.e.k r3 = f182b     // Catch:{ InterruptedException -> 0x0055 }
            java.lang.Object r3 = r3.mo288a(r1, r7)     // Catch:{ InterruptedException -> 0x0055 }
            a.b.c.e.f$c r3 = (p000a.p005b.p009c.p016e.C0084f.C0087c) r3     // Catch:{ InterruptedException -> 0x0055 }
            android.graphics.Typeface r2 = r3.f193a     // Catch:{ InterruptedException -> 0x0055 }
        L_0x0055:
            return r2
        L_0x0056:
            if (r4 != 0) goto L_0x005a
            r3 = r2
            goto L_0x005f
        L_0x005a:
            a.b.c.e.c r3 = new a.b.c.e.c
            r3.<init>(r4, r5)
        L_0x005f:
            java.lang.Object r4 = f183c
            monitor-enter(r4)
            android.support.v4.util.o<java.lang.String, java.util.ArrayList<a.b.c.e.k$a<a.b.c.e.f$c>>> r5 = f184d     // Catch:{ all -> 0x0094 }
            boolean r5 = r5.containsKey(r0)     // Catch:{ all -> 0x0094 }
            if (r5 == 0) goto L_0x0079
            if (r3 == 0) goto L_0x0077
            android.support.v4.util.o<java.lang.String, java.util.ArrayList<a.b.c.e.k$a<a.b.c.e.f$c>>> r5 = f184d     // Catch:{ all -> 0x0094 }
            java.lang.Object r5 = r5.get(r0)     // Catch:{ all -> 0x0094 }
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ all -> 0x0094 }
            r5.add(r3)     // Catch:{ all -> 0x0094 }
        L_0x0077:
            monitor-exit(r4)     // Catch:{ all -> 0x0094 }
            return r2
        L_0x0079:
            if (r3 == 0) goto L_0x0088
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0094 }
            r5.<init>()     // Catch:{ all -> 0x0094 }
            r5.add(r3)     // Catch:{ all -> 0x0094 }
            android.support.v4.util.o<java.lang.String, java.util.ArrayList<a.b.c.e.k$a<a.b.c.e.f$c>>> r3 = f184d     // Catch:{ all -> 0x0094 }
            r3.put(r0, r5)     // Catch:{ all -> 0x0094 }
        L_0x0088:
            monitor-exit(r4)     // Catch:{ all -> 0x0094 }
            a.b.c.e.k r3 = f182b
            a.b.c.e.d r4 = new a.b.c.e.d
            r4.<init>(r0)
            r3.mo291a(r1, r4)
            return r2
        L_0x0094:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0094 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p009c.p016e.C0084f.m283a(android.content.Context, a.b.c.e.a, a.b.c.a.a.h$a, android.os.Handler, boolean, int, int):android.graphics.Typeface");
    }

    /* renamed from: a */
    private static List<List<byte[]>> m284a(C0079a aVar, Resources resources) {
        return aVar.mo264a() != null ? aVar.mo264a() : C0042c.m131a(resources, aVar.mo265b());
    }

    /* renamed from: a */
    private static List<byte[]> m285a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map<Uri, ByteBuffer> m286a(Context context, C0086b[] bVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (C0086b bVar : bVarArr) {
            if (bVar.mo279a() == 0) {
                Uri c = bVar.mo281c();
                if (!hashMap.containsKey(c)) {
                    hashMap.put(c, C0074k.m261a(context, cancellationSignal, c));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    private static boolean m287a(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x013b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static p000a.p005b.p009c.p016e.C0084f.C0086b[] m288a(android.content.Context r19, p000a.p005b.p009c.p016e.C0079a r20, java.lang.String r21, android.os.CancellationSignal r22) {
        /*
            r0 = r21
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            java.lang.String r3 = "content"
            android.net.Uri$Builder r2 = r2.scheme(r3)
            android.net.Uri$Builder r2 = r2.authority(r0)
            android.net.Uri r2 = r2.build()
            android.net.Uri$Builder r4 = new android.net.Uri$Builder
            r4.<init>()
            android.net.Uri$Builder r3 = r4.scheme(r3)
            android.net.Uri$Builder r0 = r3.authority(r0)
            java.lang.String r3 = "file"
            android.net.Uri$Builder r0 = r0.appendPath(r3)
            android.net.Uri r0 = r0.build()
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0137 }
            r5 = 16
            java.lang.String r7 = "font_variation_settings"
            r9 = 2
            r10 = 7
            java.lang.String r11 = "result_code"
            java.lang.String r12 = "font_italic"
            java.lang.String r13 = "font_weight"
            java.lang.String r14 = "font_ttc_index"
            java.lang.String r15 = "file_id"
            java.lang.String r3 = "_id"
            r6 = 1
            r8 = 0
            if (r4 <= r5) goto L_0x007e
            android.content.ContentResolver r4 = r19.getContentResolver()     // Catch:{ all -> 0x0137 }
            java.lang.String[] r10 = new java.lang.String[r10]     // Catch:{ all -> 0x0137 }
            r10[r8] = r3     // Catch:{ all -> 0x0137 }
            r10[r6] = r15     // Catch:{ all -> 0x0137 }
            r10[r9] = r14     // Catch:{ all -> 0x0137 }
            r5 = 3
            r10[r5] = r7     // Catch:{ all -> 0x0137 }
            r5 = 4
            r10[r5] = r13     // Catch:{ all -> 0x0137 }
            r5 = 5
            r10[r5] = r12     // Catch:{ all -> 0x0137 }
            r5 = 6
            r10[r5] = r11     // Catch:{ all -> 0x0137 }
            java.lang.String r7 = "query = ?"
            java.lang.String[] r9 = new java.lang.String[r6]     // Catch:{ all -> 0x0137 }
            java.lang.String r5 = r20.mo269f()     // Catch:{ all -> 0x0137 }
            r9[r8] = r5     // Catch:{ all -> 0x0137 }
            r16 = 0
            r5 = r2
            r18 = r1
            r1 = 1
            r6 = r10
            r10 = 0
            r8 = r9
            r9 = r16
            r1 = 0
            r10 = r22
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0137 }
            goto L_0x00ab
        L_0x007e:
            r18 = r1
            r1 = 0
            android.content.ContentResolver r4 = r19.getContentResolver()     // Catch:{ all -> 0x0137 }
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch:{ all -> 0x0137 }
            r6[r1] = r3     // Catch:{ all -> 0x0137 }
            r5 = 1
            r6[r5] = r15     // Catch:{ all -> 0x0137 }
            r6[r9] = r14     // Catch:{ all -> 0x0137 }
            r5 = 3
            r6[r5] = r7     // Catch:{ all -> 0x0137 }
            r5 = 4
            r6[r5] = r13     // Catch:{ all -> 0x0137 }
            r5 = 5
            r6[r5] = r12     // Catch:{ all -> 0x0137 }
            r5 = 6
            r6[r5] = r11     // Catch:{ all -> 0x0137 }
            java.lang.String r7 = "query = ?"
            r5 = 1
            java.lang.String[] r8 = new java.lang.String[r5]     // Catch:{ all -> 0x0137 }
            java.lang.String r5 = r20.mo269f()     // Catch:{ all -> 0x0137 }
            r8[r1] = r5     // Catch:{ all -> 0x0137 }
            r9 = 0
            r5 = r2
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0137 }
        L_0x00ab:
            if (r4 == 0) goto L_0x0127
            int r5 = r4.getCount()     // Catch:{ all -> 0x0125 }
            if (r5 <= 0) goto L_0x0127
            int r5 = r4.getColumnIndex(r11)     // Catch:{ all -> 0x0125 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0125 }
            r6.<init>()     // Catch:{ all -> 0x0125 }
            int r3 = r4.getColumnIndex(r3)     // Catch:{ all -> 0x0125 }
            int r7 = r4.getColumnIndex(r15)     // Catch:{ all -> 0x0125 }
            int r8 = r4.getColumnIndex(r14)     // Catch:{ all -> 0x0125 }
            int r9 = r4.getColumnIndex(r13)     // Catch:{ all -> 0x0125 }
            int r10 = r4.getColumnIndex(r12)     // Catch:{ all -> 0x0125 }
        L_0x00d0:
            boolean r11 = r4.moveToNext()     // Catch:{ all -> 0x0125 }
            if (r11 == 0) goto L_0x0129
            r11 = -1
            if (r5 == r11) goto L_0x00e0
            int r12 = r4.getInt(r5)     // Catch:{ all -> 0x0125 }
            r18 = r12
            goto L_0x00e2
        L_0x00e0:
            r18 = 0
        L_0x00e2:
            if (r8 == r11) goto L_0x00ea
            int r12 = r4.getInt(r8)     // Catch:{ all -> 0x0125 }
            r15 = r12
            goto L_0x00eb
        L_0x00ea:
            r15 = 0
        L_0x00eb:
            if (r7 != r11) goto L_0x00f6
            long r12 = r4.getLong(r3)     // Catch:{ all -> 0x0125 }
            android.net.Uri r12 = android.content.ContentUris.withAppendedId(r2, r12)     // Catch:{ all -> 0x0125 }
            goto L_0x00fe
        L_0x00f6:
            long r12 = r4.getLong(r7)     // Catch:{ all -> 0x0125 }
            android.net.Uri r12 = android.content.ContentUris.withAppendedId(r0, r12)     // Catch:{ all -> 0x0125 }
        L_0x00fe:
            r14 = r12
            if (r9 == r11) goto L_0x0108
            int r12 = r4.getInt(r9)     // Catch:{ all -> 0x0125 }
            r16 = r12
            goto L_0x010c
        L_0x0108:
            r12 = 400(0x190, float:5.6E-43)
            r16 = 400(0x190, float:5.6E-43)
        L_0x010c:
            if (r10 == r11) goto L_0x0118
            int r11 = r4.getInt(r10)     // Catch:{ all -> 0x0125 }
            r12 = 1
            if (r11 != r12) goto L_0x0119
            r17 = 1
            goto L_0x011b
        L_0x0118:
            r12 = 1
        L_0x0119:
            r17 = 0
        L_0x011b:
            a.b.c.e.f$b r11 = new a.b.c.e.f$b     // Catch:{ all -> 0x0125 }
            r13 = r11
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0125 }
            r6.add(r11)     // Catch:{ all -> 0x0125 }
            goto L_0x00d0
        L_0x0125:
            r0 = move-exception
            goto L_0x0139
        L_0x0127:
            r6 = r18
        L_0x0129:
            if (r4 == 0) goto L_0x012e
            r4.close()
        L_0x012e:
            a.b.c.e.f$b[] r0 = new p000a.p005b.p009c.p016e.C0084f.C0086b[r1]
            java.lang.Object[] r0 = r6.toArray(r0)
            a.b.c.e.f$b[] r0 = (p000a.p005b.p009c.p016e.C0084f.C0086b[]) r0
            return r0
        L_0x0137:
            r0 = move-exception
            r4 = 0
        L_0x0139:
            if (r4 == 0) goto L_0x013e
            r4.close()
        L_0x013e:
            throw r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p009c.p016e.C0084f.m288a(android.content.Context, a.b.c.e.a, java.lang.String, android.os.CancellationSignal):a.b.c.e.f$b[]");
    }
}
