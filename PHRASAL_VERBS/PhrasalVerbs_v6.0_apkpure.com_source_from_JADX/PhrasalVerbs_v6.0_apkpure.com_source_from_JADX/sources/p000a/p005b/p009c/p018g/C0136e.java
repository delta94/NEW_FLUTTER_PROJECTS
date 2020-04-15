package p000a.p005b.p009c.p018g;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: a.b.c.g.e */
public abstract class C0136e {

    /* renamed from: a */
    private final Context f373a;

    /* renamed from: b */
    private C0137a f374b;

    /* renamed from: c */
    private C0138b f375c;

    /* renamed from: a.b.c.g.e$a */
    public interface C0137a {
    }

    /* renamed from: a.b.c.g.e$b */
    public interface C0138b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public C0136e(Context context) {
        this.f373a = context;
    }

    /* renamed from: a */
    public View mo489a(MenuItem menuItem) {
        return mo495c();
    }

    /* renamed from: a */
    public void mo490a(C0137a aVar) {
        this.f374b = aVar;
    }

    /* renamed from: a */
    public void mo491a(C0138b bVar) {
        if (!(this.f375c == null || bVar == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            sb.append(getClass().getSimpleName());
            sb.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", sb.toString());
        }
        this.f375c = bVar;
    }

    /* renamed from: a */
    public void mo492a(SubMenu subMenu) {
    }

    /* renamed from: a */
    public boolean mo493a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo494b() {
        return true;
    }

    /* renamed from: c */
    public abstract View mo495c();

    /* renamed from: d */
    public boolean mo496d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo497e() {
        return false;
    }

    /* renamed from: f */
    public void mo498f() {
        this.f375c = null;
        this.f374b = null;
    }
}
