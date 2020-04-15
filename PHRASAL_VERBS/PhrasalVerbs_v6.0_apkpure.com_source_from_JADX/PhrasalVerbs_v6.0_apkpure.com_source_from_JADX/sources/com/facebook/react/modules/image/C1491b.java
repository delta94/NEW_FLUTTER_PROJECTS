package com.facebook.react.modules.image;

import com.facebook.react.bridge.Promise;
import p032c.p033a.p051d.C0767d;
import p032c.p033a.p051d.C0768e;

/* renamed from: com.facebook.react.modules.image.b */
class C1491b extends C0767d<Void> {

    /* renamed from: a */
    final /* synthetic */ int f4598a;

    /* renamed from: b */
    final /* synthetic */ Promise f4599b;

    /* renamed from: c */
    final /* synthetic */ ImageLoaderModule f4600c;

    C1491b(ImageLoaderModule imageLoaderModule, int i, Promise promise) {
        this.f4600c = imageLoaderModule;
        this.f4598a = i;
        this.f4599b = promise;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo3567e(C0768e<Void> eVar) {
        try {
            this.f4600c.removeRequest(this.f4598a);
            this.f4599b.reject("E_PREFETCH_FAILURE", eVar.mo3556c());
        } finally {
            eVar.close();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo3568f(C0768e<Void> eVar) {
        if (eVar.mo3555b()) {
            try {
                this.f4600c.removeRequest(this.f4598a);
                this.f4599b.resolve(Boolean.valueOf(true));
            } finally {
                eVar.close();
            }
        }
    }
}
