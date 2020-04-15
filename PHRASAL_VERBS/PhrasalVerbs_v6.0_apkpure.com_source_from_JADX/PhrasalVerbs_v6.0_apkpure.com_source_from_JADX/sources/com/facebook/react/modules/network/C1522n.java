package com.facebook.react.modules.network;

import android.util.Base64;
import com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter;
import com.facebook.react.modules.network.NetworkingModule.C1506b;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p133e.C2000D;
import p133e.C2019n;
import p133e.C2025t;

/* renamed from: com.facebook.react.modules.network.n */
class C1522n implements Callback {

    /* renamed from: a */
    final /* synthetic */ int f4654a;

    /* renamed from: b */
    final /* synthetic */ RCTDeviceEventEmitter f4655b;

    /* renamed from: c */
    final /* synthetic */ String f4656c;

    /* renamed from: d */
    final /* synthetic */ boolean f4657d;

    /* renamed from: e */
    final /* synthetic */ NetworkingModule f4658e;

    C1522n(NetworkingModule networkingModule, int i, RCTDeviceEventEmitter rCTDeviceEventEmitter, String str, boolean z) {
        this.f4658e = networkingModule;
        this.f4654a = i;
        this.f4655b = rCTDeviceEventEmitter;
        this.f4656c = str;
        this.f4657d = z;
    }

    public void onFailure(Call call, IOException iOException) {
        String str;
        if (!this.f4658e.mShuttingDown) {
            this.f4658e.removeRequest(this.f4654a);
            if (iOException.getMessage() != null) {
                str = iOException.getMessage();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Error while executing request: ");
                sb.append(iOException.getClass().getSimpleName());
                str = sb.toString();
            }
            C1503B.m5990a(this.f4655b, this.f4654a, str, (Throwable) iOException);
        }
    }

    public void onResponse(Call call, Response response) {
        if (!this.f4658e.mShuttingDown) {
            this.f4658e.removeRequest(this.f4654a);
            C1503B.m5985a(this.f4655b, this.f4654a, response.code(), NetworkingModule.translateHeaders(response.headers()), response.request().url().toString());
            try {
                ResponseBody body = response.body();
                if ("gzip".equalsIgnoreCase(response.header("Content-Encoding")) && body != null) {
                    C2019n nVar = new C2019n(body.source());
                    String header = response.header("Content-Type");
                    body = ResponseBody.create(header != null ? MediaType.parse(header) : null, -1, C2025t.m7756a((C2000D) nVar));
                }
                for (C1506b bVar : this.f4658e.mResponseHandlers) {
                    if (bVar.mo5297a(this.f4656c)) {
                        C1503B.m5987a(this.f4655b, this.f4654a, bVar.mo5296a(body));
                        C1503B.m5984a(this.f4655b, this.f4654a);
                        return;
                    }
                }
                String str = "text";
                if (this.f4657d) {
                    if (this.f4656c.equals(str)) {
                        this.f4658e.readWithProgress(this.f4655b, this.f4654a, body);
                        C1503B.m5984a(this.f4655b, this.f4654a);
                        return;
                    }
                }
                String str2 = "";
                if (this.f4656c.equals(str)) {
                    try {
                        str2 = body.string();
                    } catch (IOException e) {
                        if (!response.request().method().equalsIgnoreCase("HEAD")) {
                            C1503B.m5990a(this.f4655b, this.f4654a, e.getMessage(), (Throwable) e);
                        }
                    }
                } else if (this.f4656c.equals("base64")) {
                    str2 = Base64.encodeToString(body.bytes(), 2);
                }
                C1503B.m5988a(this.f4655b, this.f4654a, str2);
                C1503B.m5984a(this.f4655b, this.f4654a);
            } catch (IOException e2) {
                C1503B.m5990a(this.f4655b, this.f4654a, e2.getMessage(), (Throwable) e2);
            }
        }
    }
}
