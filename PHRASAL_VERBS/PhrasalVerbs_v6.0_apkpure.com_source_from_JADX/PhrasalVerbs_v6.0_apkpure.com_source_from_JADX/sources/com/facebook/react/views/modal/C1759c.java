package com.facebook.react.views.modal;

import android.content.DialogInterface;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.C1638f;
import com.facebook.react.views.modal.C1763g.C1765b;

/* renamed from: com.facebook.react.views.modal.c */
class C1759c implements C1765b {

    /* renamed from: a */
    final /* synthetic */ C1638f f5188a;

    /* renamed from: b */
    final /* synthetic */ C1763g f5189b;

    /* renamed from: c */
    final /* synthetic */ ReactModalHostManager f5190c;

    C1759c(ReactModalHostManager reactModalHostManager, C1638f fVar, C1763g gVar) {
        this.f5190c = reactModalHostManager;
        this.f5188a = fVar;
        this.f5189b = gVar;
    }

    /* renamed from: a */
    public void mo6117a(DialogInterface dialogInterface) {
        this.f5188a.mo5886a((C1635c) new C1766h(this.f5189b.getId()));
    }
}
