package com.facebook.react.fabric.jsi;

/* renamed from: com.facebook.react.fabric.jsi.a */
class C1422a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ EventBeatManager f4430a;

    C1422a(EventBeatManager eventBeatManager) {
        this.f4430a = eventBeatManager;
    }

    public void run() {
        this.f4430a.beat();
    }
}
