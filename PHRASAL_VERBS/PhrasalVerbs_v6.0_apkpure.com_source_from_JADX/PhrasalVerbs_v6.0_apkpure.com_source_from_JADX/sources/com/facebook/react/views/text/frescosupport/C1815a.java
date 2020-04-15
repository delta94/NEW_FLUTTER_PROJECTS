package com.facebook.react.views.text.frescosupport;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.p121a.C1595a;
import com.facebook.react.views.text.C1828p;
import com.facebook.react.views.text.C1838z;
import java.util.Locale;
import p032c.p033a.p059g.p065c.C0816e;

/* renamed from: com.facebook.react.views.text.frescosupport.a */
public class C1815a extends C1828p {

    /* renamed from: A */
    private float f5363A = Float.NaN;

    /* renamed from: B */
    private float f5364B = Float.NaN;

    /* renamed from: C */
    private int f5365C = 0;

    /* renamed from: w */
    private Uri f5366w;

    /* renamed from: x */
    private ReadableMap f5367x;

    /* renamed from: y */
    private final C0816e f5368y;

    /* renamed from: z */
    private final Object f5369z;

    public C1815a(C0816e eVar, Object obj) {
        this.f5368y = eVar;
        this.f5369z = obj;
    }

    /* renamed from: a */
    private static Uri m6917a(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return new Builder().scheme("res").path(String.valueOf(context.getResources().getIdentifier(str.toLowerCase(Locale.getDefault()).replace("-", "_"), "drawable", context.getPackageName()))).build();
    }

    /* renamed from: N */
    public C1838z mo6042N() {
        C1816b bVar = new C1816b(mo5602p().getResources(), (int) Math.ceil((double) this.f5364B), (int) Math.ceil((double) this.f5363A), this.f5365C, mo6371R(), mo6370Q(), mo6369P(), mo6368O());
        return bVar;
    }

    /* renamed from: O */
    public Object mo6368O() {
        return this.f5369z;
    }

    /* renamed from: P */
    public C0816e mo6369P() {
        return this.f5368y;
    }

    /* renamed from: Q */
    public ReadableMap mo6370Q() {
        return this.f5367x;
    }

    /* renamed from: R */
    public Uri mo6371R() {
        return this.f5366w;
    }

    /* renamed from: j */
    public boolean mo5596j() {
        return true;
    }

    @C1595a(name = "headers")
    public void setHeaders(ReadableMap readableMap) {
        this.f5367x = readableMap;
    }

    public void setHeight(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Number) {
            this.f5364B = (float) dynamic.asDouble();
            return;
        }
        throw new JSApplicationIllegalArgumentException("Inline images must not have percentage based height");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r1.getScheme() == null) goto L_0x0025;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0033  */
    @com.facebook.react.uimanager.p121a.C1595a(name = "src")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSource(com.facebook.react.bridge.ReadableArray r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x0016
            int r1 = r4.size()
            if (r1 != 0) goto L_0x000a
            goto L_0x0016
        L_0x000a:
            r1 = 0
            com.facebook.react.bridge.ReadableMap r4 = r4.getMap(r1)
            java.lang.String r1 = "uri"
            java.lang.String r4 = r4.getString(r1)
            goto L_0x0017
        L_0x0016:
            r4 = r0
        L_0x0017:
            if (r4 == 0) goto L_0x002f
            android.net.Uri r1 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x0025 }
            java.lang.String r2 = r1.getScheme()     // Catch:{ Exception -> 0x0024 }
            if (r2 != 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r0 = r1
        L_0x0025:
            if (r0 != 0) goto L_0x002f
            com.facebook.react.uimanager.N r0 = r3.mo5602p()
            android.net.Uri r0 = m6917a(r0, r4)
        L_0x002f:
            android.net.Uri r4 = r3.f5366w
            if (r0 == r4) goto L_0x0036
            r3.mo5622K()
        L_0x0036:
            r3.f5366w = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.frescosupport.C1815a.setSource(com.facebook.react.bridge.ReadableArray):void");
    }

    @C1595a(name = "tintColor")
    public void setTintColor(int i) {
        this.f5365C = i;
    }

    public void setWidth(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Number) {
            this.f5363A = (float) dynamic.asDouble();
            return;
        }
        throw new JSApplicationIllegalArgumentException("Inline images must not have percentage based width");
    }
}
