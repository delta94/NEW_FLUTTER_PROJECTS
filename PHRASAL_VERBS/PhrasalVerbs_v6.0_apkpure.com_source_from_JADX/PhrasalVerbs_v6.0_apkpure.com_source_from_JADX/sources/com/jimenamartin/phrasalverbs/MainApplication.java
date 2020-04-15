package com.jimenamartin.phrasalverbs;

import android.app.Application;
import android.content.Context;
import com.facebook.soloader.SoLoader;
import p032c.p033a.p098m.C1150J;
import p032c.p033a.p098m.C1234u;

public class MainApplication extends Application implements C1234u {

    /* renamed from: a */
    private final C1150J f5847a = new C1947a(this, this);

    /* renamed from: a */
    public C1150J mo4601a() {
        return this.f5847a;
    }

    public void onCreate() {
        super.onCreate();
        SoLoader.m7250a((Context) this, false);
    }
}
