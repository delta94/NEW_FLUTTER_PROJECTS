package p032c.p033a.p074i.p090n;

import android.net.Uri;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p032c.p033a.p038c.p049k.C0758f;
import p032c.p033a.p074i.p086j.C0988d;
import p032c.p033a.p074i.p090n.C1054da.C1055a;

/* renamed from: c.a.i.n.E */
public class C1010E extends C1053d<C1004B> {

    /* renamed from: a */
    private int f3496a;

    /* renamed from: b */
    private final ExecutorService f3497b;

    public C1010E(int i) {
        this(Executors.newFixedThreadPool(3));
        this.f3496a = i;
    }

    C1010E(ExecutorService executorService) {
        this.f3497b = executorService;
    }

    /* renamed from: a */
    private static String m4521a(String str, Object... objArr) {
        return String.format(Locale.getDefault(), str, objArr);
    }

    /* renamed from: a */
    static HttpURLConnection m4522a(Uri uri) {
        return (HttpURLConnection) C0758f.m3383k(uri).openConnection();
    }

    /* renamed from: a */
    private HttpURLConnection m4523a(Uri uri, int i) {
        Object[] objArr;
        String str;
        HttpURLConnection a = m4522a(uri);
        a.setConnectTimeout(this.f3496a);
        int responseCode = a.getResponseCode();
        if (m4525b(responseCode)) {
            return a;
        }
        if (m4524a(responseCode)) {
            String headerField = a.getHeaderField("Location");
            a.disconnect();
            Uri parse = headerField == null ? null : Uri.parse(headerField);
            String scheme = uri.getScheme();
            if (i > 0 && parse != null && !parse.getScheme().equals(scheme)) {
                return m4523a(parse, i - 1);
            }
            if (i == 0) {
                objArr = new Object[]{uri.toString()};
                str = "URL %s follows too many redirects";
            } else {
                objArr = new Object[]{uri.toString(), Integer.valueOf(responseCode)};
                str = "URL %s returned %d without a valid redirect";
            }
            throw new IOException(m4521a(str, objArr));
        }
        a.disconnect();
        throw new IOException(String.format("Image URL %s returned HTTP code %d", new Object[]{uri.toString(), Integer.valueOf(responseCode)}));
    }

    /* renamed from: a */
    private static boolean m4524a(int i) {
        if (!(i == 307 || i == 308)) {
            switch (i) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m4525b(int i) {
        return i >= 200 && i < 300;
    }

    /* renamed from: a */
    public C1004B mo3961a(C1081n<C0988d> nVar, C1084oa oaVar) {
        return new C1004B(nVar, oaVar);
    }

    /* renamed from: a */
    public void mo3966a(C1004B b, C1055a aVar) {
        b.mo4254b().mo4319a(new C1008D(this, this.f3497b.submit(new C1006C(this, b, aVar)), aVar));
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0039 A[SYNTHETIC, Splitter:B:26:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0040  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4264b(p032c.p033a.p074i.p090n.C1004B r3, p032c.p033a.p074i.p090n.C1054da.C1055a r4) {
        /*
            r2 = this;
            r0 = 0
            android.net.Uri r3 = r3.mo4260h()     // Catch:{ IOException -> 0x0024, all -> 0x0021 }
            r1 = 5
            java.net.HttpURLConnection r3 = r2.m4523a(r3, r1)     // Catch:{ IOException -> 0x0024, all -> 0x0021 }
            if (r3 == 0) goto L_0x0017
            java.io.InputStream r0 = r3.getInputStream()     // Catch:{ IOException -> 0x0015 }
            r1 = -1
            r4.mo4305a(r0, r1)     // Catch:{ IOException -> 0x0015 }
            goto L_0x0017
        L_0x0015:
            r1 = move-exception
            goto L_0x0026
        L_0x0017:
            if (r0 == 0) goto L_0x001e
            r0.close()     // Catch:{ IOException -> 0x001d }
            goto L_0x001e
        L_0x001d:
        L_0x001e:
            if (r3 == 0) goto L_0x0035
            goto L_0x0032
        L_0x0021:
            r4 = move-exception
            r3 = r0
            goto L_0x0037
        L_0x0024:
            r1 = move-exception
            r3 = r0
        L_0x0026:
            r4.mo4306a(r1)     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0030
            r0.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0030
        L_0x002f:
        L_0x0030:
            if (r3 == 0) goto L_0x0035
        L_0x0032:
            r3.disconnect()
        L_0x0035:
            return
        L_0x0036:
            r4 = move-exception
        L_0x0037:
            if (r0 == 0) goto L_0x003e
            r0.close()     // Catch:{ IOException -> 0x003d }
            goto L_0x003e
        L_0x003d:
        L_0x003e:
            if (r3 == 0) goto L_0x0043
            r3.disconnect()
        L_0x0043:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p032c.p033a.p074i.p090n.C1010E.mo4264b(c.a.i.n.B, c.a.i.n.da$a):void");
    }
}
