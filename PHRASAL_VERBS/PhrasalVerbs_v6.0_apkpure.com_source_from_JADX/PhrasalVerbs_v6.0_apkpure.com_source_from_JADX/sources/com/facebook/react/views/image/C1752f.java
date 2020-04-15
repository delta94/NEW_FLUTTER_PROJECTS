package com.facebook.react.views.image;

import android.graphics.drawable.Animatable;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.C1638f;
import p032c.p033a.p059g.p065c.C0818f;
import p032c.p033a.p074i.p086j.C0989e;

/* renamed from: com.facebook.react.views.image.f */
class C1752f extends C0818f<C0989e> {

    /* renamed from: b */
    final /* synthetic */ C1638f f5149b;

    /* renamed from: c */
    final /* synthetic */ C1753g f5150c;

    C1752f(C1753g gVar, C1638f fVar) {
        this.f5150c = gVar;
        this.f5149b = fVar;
    }

    /* renamed from: a */
    public void mo3588a(String str, C0989e eVar, Animatable animatable) {
        if (eVar != null) {
            C1638f fVar = this.f5149b;
            C1748b bVar = new C1748b(this.f5150c.getId(), 2, this.f5150c.f5168m.mo4558b(), eVar.mo4199n(), eVar.mo4198m());
            fVar.mo5886a((C1635c) bVar);
            this.f5149b.mo5886a((C1635c) new C1748b(this.f5150c.getId(), 3));
        }
    }

    /* renamed from: a */
    public void mo3589a(String str, Throwable th) {
        this.f5149b.mo5886a((C1635c) new C1748b(this.f5150c.getId(), 1, true, th.getMessage()));
    }

    /* renamed from: b */
    public void mo3590b(String str, Object obj) {
        this.f5149b.mo5886a((C1635c) new C1748b(this.f5150c.getId(), 4));
    }
}
