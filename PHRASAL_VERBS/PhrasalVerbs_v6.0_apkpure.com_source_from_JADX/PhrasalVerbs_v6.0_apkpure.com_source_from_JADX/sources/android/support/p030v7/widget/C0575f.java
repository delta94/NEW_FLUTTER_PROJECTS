package android.support.p030v7.widget;

/* renamed from: android.support.v7.widget.f */
class C0575f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ActionBarOverlayLayout f2228a;

    C0575f(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f2228a = actionBarOverlayLayout;
    }

    public void run() {
        this.f2228a.mo2473h();
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2228a;
        actionBarOverlayLayout.f1838x = actionBarOverlayLayout.f1819e.animate().translationY((float) (-this.f2228a.f1819e.getHeight())).setListener(this.f2228a.f1839y);
    }
}
