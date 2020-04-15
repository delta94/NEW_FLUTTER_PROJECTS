package p032c.p033a.p074i.p077b.p078a;

import android.os.SystemClock;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p032c.p033a.p074i.p077b.p078a.C0893e.C0894a;
import p032c.p033a.p074i.p081e.C0938a;
import p032c.p033a.p074i.p090n.C1054da.C1055a;

/* renamed from: c.a.i.b.a.d */
class C0892d implements Callback {

    /* renamed from: a */
    final /* synthetic */ C0894a f3138a;

    /* renamed from: b */
    final /* synthetic */ C1055a f3139b;

    /* renamed from: c */
    final /* synthetic */ C0893e f3140c;

    C0892d(C0893e eVar, C0894a aVar, C1055a aVar2) {
        this.f3140c = eVar;
        this.f3138a = aVar;
        this.f3139b = aVar2;
    }

    public void onFailure(Call call, IOException iOException) {
        this.f3140c.m3971a(call, (Exception) iOException, this.f3139b);
    }

    public void onResponse(Call call, Response response) {
        this.f3138a.f3144g = SystemClock.elapsedRealtime();
        ResponseBody body = response.body();
        try {
            if (!response.isSuccessful()) {
                C0893e eVar = this.f3140c;
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected HTTP code ");
                sb.append(response);
                eVar.m3971a(call, (Exception) new IOException(sb.toString()), this.f3139b);
                body.close();
                return;
            }
            C0938a a = C0938a.m4126a(response.header("Content-Range"));
            if (!(a == null || (a.f3221b == 0 && a.f3222c == Integer.MAX_VALUE))) {
                this.f3138a.mo4253a(a);
                this.f3138a.mo4251a(8);
            }
            long contentLength = body.contentLength();
            if (contentLength < 0) {
                contentLength = 0;
            }
            this.f3139b.mo4305a(body.byteStream(), (int) contentLength);
            body.close();
        } catch (Exception e) {
            this.f3140c.m3971a(call, e, this.f3139b);
        } catch (Throwable th) {
            body.close();
            throw th;
        }
    }
}
