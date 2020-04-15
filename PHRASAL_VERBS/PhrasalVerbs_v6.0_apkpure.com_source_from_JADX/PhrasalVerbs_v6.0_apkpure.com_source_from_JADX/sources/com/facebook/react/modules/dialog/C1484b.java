package com.facebook.react.modules.dialog;

import android.os.Bundle;
import com.facebook.react.bridge.Callback;

/* renamed from: com.facebook.react.modules.dialog.b */
class C1484b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1482b f4584a;

    /* renamed from: b */
    final /* synthetic */ Bundle f4585b;

    /* renamed from: c */
    final /* synthetic */ Callback f4586c;

    /* renamed from: d */
    final /* synthetic */ DialogModule f4587d;

    C1484b(DialogModule dialogModule, C1482b bVar, Bundle bundle, Callback callback) {
        this.f4587d = dialogModule;
        this.f4584a = bVar;
        this.f4585b = bundle;
        this.f4586c = callback;
    }

    public void run() {
        this.f4584a.mo5379a(this.f4587d.mIsInForeground, this.f4585b, this.f4586c);
    }
}
