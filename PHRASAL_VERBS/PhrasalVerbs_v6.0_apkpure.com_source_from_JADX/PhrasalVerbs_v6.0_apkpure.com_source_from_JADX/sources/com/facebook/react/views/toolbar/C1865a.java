package com.facebook.react.views.toolbar;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import p032c.p033a.p059g.p068e.C0833i;
import p032c.p033a.p074i.p086j.C0989e;

/* renamed from: com.facebook.react.views.toolbar.a */
public class C1865a extends C0833i implements Callback {

    /* renamed from: e */
    private final C0989e f5557e;

    public C1865a(Drawable drawable, C0989e eVar) {
        super(drawable);
        this.f5557e = eVar;
    }

    public int getIntrinsicHeight() {
        return this.f5557e.mo4198m();
    }

    public int getIntrinsicWidth() {
        return this.f5557e.mo4199n();
    }
}
