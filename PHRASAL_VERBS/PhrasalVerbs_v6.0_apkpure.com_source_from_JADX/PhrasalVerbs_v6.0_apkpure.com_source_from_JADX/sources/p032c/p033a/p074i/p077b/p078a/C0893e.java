package p032c.p033a.p074i.p077b.p078a;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Call.Factory;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Request.Builder;
import p032c.p033a.p074i.p081e.C0938a;
import p032c.p033a.p074i.p086j.C0988d;
import p032c.p033a.p074i.p090n.C1004B;
import p032c.p033a.p074i.p090n.C1053d;
import p032c.p033a.p074i.p090n.C1054da.C1055a;
import p032c.p033a.p074i.p090n.C1081n;
import p032c.p033a.p074i.p090n.C1084oa;

/* renamed from: c.a.i.b.a.e */
public class C0893e extends C1053d<C0894a> {

    /* renamed from: a */
    private final Factory f3141a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Executor f3142b;

    /* renamed from: c.a.i.b.a.e$a */
    public static class C0894a extends C1004B {

        /* renamed from: f */
        public long f3143f;

        /* renamed from: g */
        public long f3144g;

        /* renamed from: h */
        public long f3145h;

        public C0894a(C1081n<C0988d> nVar, C1084oa oaVar) {
            super(nVar, oaVar);
        }
    }

    public C0893e(Factory factory, Executor executor) {
        this.f3141a = factory;
        this.f3142b = executor;
    }

    public C0893e(OkHttpClient okHttpClient) {
        this(okHttpClient, okHttpClient.dispatcher().executorService());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3971a(Call call, Exception exc, C1055a aVar) {
        if (call.isCanceled()) {
            aVar.mo4304a();
        } else {
            aVar.mo4306a(exc);
        }
    }

    /* renamed from: a */
    public C0894a m3973a(C1081n<C0988d> nVar, C1084oa oaVar) {
        return new C0894a(nVar, oaVar);
    }

    /* renamed from: a */
    public Map<String, String> mo3967b(C0894a aVar, int i) {
        HashMap hashMap = new HashMap(4);
        hashMap.put("queue_time", Long.toString(aVar.f3144g - aVar.f3143f));
        hashMap.put("fetch_time", Long.toString(aVar.f3145h - aVar.f3144g));
        hashMap.put("total_time", Long.toString(aVar.f3145h - aVar.f3143f));
        hashMap.put("image_size", Integer.toString(i));
        return hashMap;
    }

    /* renamed from: a */
    public void mo3966a(C0894a aVar, C1055a aVar2) {
        aVar.f3143f = SystemClock.elapsedRealtime();
        try {
            Builder builder = new Builder().cacheControl(new CacheControl.Builder().noStore().build()).url(aVar.mo4260h().toString()).get();
            C0938a a = aVar.mo4254b().mo4322c().mo4356a();
            if (a != null) {
                builder.addHeader("Range", a.mo4037a());
            }
            mo3964a(aVar, aVar2, builder.build());
        } catch (Exception e) {
            aVar2.mo4306a(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3964a(C0894a aVar, C1055a aVar2, Request request) {
        Call newCall = this.f3141a.newCall(request);
        aVar.mo4254b().mo4319a(new C0891c(this, newCall));
        newCall.enqueue(new C0892d(this, aVar, aVar2));
    }

    /* renamed from: b */
    public void mo3965a(C0894a aVar, int i) {
        aVar.f3145h = SystemClock.elapsedRealtime();
    }
}
