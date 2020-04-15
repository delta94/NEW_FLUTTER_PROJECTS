package com.facebook.react.modules.image;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import p032c.p033a.p038c.p046h.C0744b;
import p032c.p033a.p051d.C0767d;
import p032c.p033a.p051d.C0768e;
import p032c.p033a.p074i.p086j.C0986b;

/* renamed from: com.facebook.react.modules.image.a */
class C1490a extends C0767d<C0744b<C0986b>> {

    /* renamed from: a */
    final /* synthetic */ Promise f4596a;

    /* renamed from: b */
    final /* synthetic */ ImageLoaderModule f4597b;

    C1490a(ImageLoaderModule imageLoaderModule, Promise promise) {
        this.f4597b = imageLoaderModule;
        this.f4596a = promise;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo3567e(C0768e<C0744b<C0986b>> eVar) {
        this.f4596a.reject("E_GET_SIZE_FAILURE", eVar.mo3556c());
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo3568f(C0768e<C0744b<C0986b>> eVar) {
        if (eVar.mo3555b()) {
            C0744b bVar = (C0744b) eVar.getResult();
            String str = "E_GET_SIZE_FAILURE";
            if (bVar != null) {
                try {
                    C0986b bVar2 = (C0986b) bVar.mo3520n();
                    WritableMap createMap = Arguments.createMap();
                    createMap.putInt("width", bVar2.mo4199n());
                    createMap.putInt("height", bVar2.mo4198m());
                    this.f4596a.resolve(createMap);
                } catch (Exception e) {
                    this.f4596a.reject(str, (Throwable) e);
                } catch (Throwable th) {
                    C0744b.m3336b(bVar);
                    throw th;
                }
                C0744b.m3336b(bVar);
            } else {
                this.f4596a.reject(str);
            }
        }
    }
}
