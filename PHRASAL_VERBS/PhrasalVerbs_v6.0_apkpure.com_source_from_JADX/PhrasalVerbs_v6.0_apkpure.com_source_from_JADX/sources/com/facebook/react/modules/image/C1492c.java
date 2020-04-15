package com.facebook.react.modules.image;

import android.net.Uri;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import p032c.p033a.p059g.p060a.p061a.C0799c;
import p032c.p033a.p074i.p082f.C0954j;

/* renamed from: com.facebook.react.modules.image.c */
class C1492c extends GuardedAsyncTask<Void, Void> {

    /* renamed from: a */
    final /* synthetic */ ReadableArray f4601a;

    /* renamed from: b */
    final /* synthetic */ Promise f4602b;

    /* renamed from: c */
    final /* synthetic */ ImageLoaderModule f4603c;

    C1492c(ImageLoaderModule imageLoaderModule, ReactContext reactContext, ReadableArray readableArray, Promise promise) {
        this.f4603c = imageLoaderModule;
        this.f4601a = readableArray;
        this.f4602b = promise;
        super(reactContext);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void doInBackgroundGuarded(Void... voidArr) {
        String str;
        WritableMap createMap = Arguments.createMap();
        C0954j a = C0799c.m3533a();
        for (int i = 0; i < this.f4601a.size(); i++) {
            String string = this.f4601a.getString(i);
            Uri parse = Uri.parse(string);
            if (a.mo4077a(parse)) {
                str = "memory";
            } else if (a.mo4082b(parse)) {
                str = "disk";
            }
            createMap.putString(string, str);
        }
        this.f4602b.resolve(createMap);
    }
}
