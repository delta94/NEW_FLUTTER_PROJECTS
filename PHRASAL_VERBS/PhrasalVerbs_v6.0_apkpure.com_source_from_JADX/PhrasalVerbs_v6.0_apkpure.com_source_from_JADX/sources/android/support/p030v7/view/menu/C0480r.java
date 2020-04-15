package android.support.p030v7.view.menu;

import android.content.Context;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;
import p000a.p005b.p009c.p013c.p014a.C0076b;
import p000a.p005b.p009c.p018g.C0136e.C0138b;

/* renamed from: android.support.v7.view.menu.r */
class C0480r extends C0475q {

    /* renamed from: android.support.v7.view.menu.r$a */
    class C0481a extends C0476a implements VisibilityListener {

        /* renamed from: f */
        C0138b f1768f;

        public C0481a(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        /* renamed from: a */
        public View mo489a(MenuItem menuItem) {
            return this.f1763d.onCreateActionView(menuItem);
        }

        /* renamed from: a */
        public void mo491a(C0138b bVar) {
            this.f1768f = bVar;
            this.f1763d.setVisibilityListener(bVar != null ? this : null);
        }

        /* renamed from: b */
        public boolean mo494b() {
            return this.f1763d.isVisible();
        }

        /* renamed from: e */
        public boolean mo497e() {
            return this.f1763d.overridesItemVisibility();
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C0138b bVar = this.f1768f;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }
    }

    C0480r(Context context, C0076b bVar) {
        super(context, bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0476a mo2305a(ActionProvider actionProvider) {
        return new C0481a(this.f1641b, actionProvider);
    }
}
