package android.support.p030v7.widget;

/* renamed from: android.support.v7.widget.e */
class C0573e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ActionBarOverlayLayout f2226a;

    C0573e(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f2226a = actionBarOverlayLayout;
    }

    public void run() {
        this.f2226a.mo2473h();
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2226a;
        actionBarOverlayLayout.f1838x = actionBarOverlayLayout.f1819e.animate().translationY(0.0f).setListener(this.f2226a.f1839y);
    }
}
