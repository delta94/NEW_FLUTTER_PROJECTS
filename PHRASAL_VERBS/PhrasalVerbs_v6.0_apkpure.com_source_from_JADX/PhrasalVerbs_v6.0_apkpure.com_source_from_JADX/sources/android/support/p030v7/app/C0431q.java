package android.support.p030v7.app;

import p000a.p005b.p021d.p022a.C0172j;

/* renamed from: android.support.v7.app.q */
class C0431q implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0438x f1466a;

    C0431q(C0438x xVar) {
        this.f1466a = xVar;
    }

    public void run() {
        C0438x xVar = this.f1466a;
        if ((xVar.f1491P & 1) != 0) {
            xVar.mo1984e(0);
        }
        C0438x xVar2 = this.f1466a;
        if ((xVar2.f1491P & 4096) != 0) {
            xVar2.mo1984e(C0172j.AppCompatTheme_tooltipForegroundColor);
        }
        C0438x xVar3 = this.f1466a;
        xVar3.f1490O = false;
        xVar3.f1491P = 0;
    }
}
