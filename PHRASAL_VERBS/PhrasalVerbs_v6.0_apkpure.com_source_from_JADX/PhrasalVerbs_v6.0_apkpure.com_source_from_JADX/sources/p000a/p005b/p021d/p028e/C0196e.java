package p000a.p005b.p021d.p028e;

import android.content.Context;
import android.support.p030v7.view.menu.C0468l;
import android.support.p030v7.view.menu.C0468l.C0469a;
import android.support.p030v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;
import p000a.p005b.p021d.p028e.C0192b.C0193a;

/* renamed from: a.b.d.e.e */
public class C0196e extends C0192b implements C0469a {

    /* renamed from: c */
    private Context f488c;

    /* renamed from: d */
    private ActionBarContextView f489d;

    /* renamed from: e */
    private C0193a f490e;

    /* renamed from: f */
    private WeakReference<View> f491f;

    /* renamed from: g */
    private boolean f492g;

    /* renamed from: h */
    private boolean f493h;

    /* renamed from: i */
    private C0468l f494i;

    public C0196e(Context context, ActionBarContextView actionBarContextView, C0193a aVar, boolean z) {
        this.f488c = context;
        this.f489d = actionBarContextView;
        this.f490e = aVar;
        C0468l lVar = new C0468l(actionBarContextView.getContext());
        lVar.mo2212c(1);
        this.f494i = lVar;
        this.f494i.mo2060a((C0469a) this);
        this.f493h = z;
    }

    /* renamed from: a */
    public void mo697a() {
        if (!this.f492g) {
            this.f492g = true;
            this.f489d.sendAccessibilityEvent(32);
            this.f490e.mo714a(this);
        }
    }

    /* renamed from: a */
    public void mo698a(int i) {
        mo700a((CharSequence) this.f488c.getString(i));
    }

    /* renamed from: a */
    public void mo728a(C0468l lVar) {
        mo712i();
        this.f489d.mo2435d();
    }

    /* renamed from: a */
    public void mo699a(View view) {
        this.f489d.setCustomView(view);
        this.f491f = view != null ? new WeakReference<>(view) : null;
    }

    /* renamed from: a */
    public void mo700a(CharSequence charSequence) {
        this.f489d.setSubtitle(charSequence);
    }

    /* renamed from: a */
    public void mo702a(boolean z) {
        super.mo702a(z);
        this.f489d.setTitleOptional(z);
    }

    /* renamed from: a */
    public boolean mo729a(C0468l lVar, MenuItem menuItem) {
        return this.f490e.mo716a((C0192b) this, menuItem);
    }

    /* renamed from: b */
    public View mo703b() {
        WeakReference<View> weakReference = this.f491f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: b */
    public void mo704b(int i) {
        mo705b((CharSequence) this.f488c.getString(i));
    }

    /* renamed from: b */
    public void mo705b(CharSequence charSequence) {
        this.f489d.setTitle(charSequence);
    }

    /* renamed from: c */
    public Menu mo706c() {
        return this.f494i;
    }

    /* renamed from: d */
    public MenuInflater mo707d() {
        return new C0199g(this.f489d.getContext());
    }

    /* renamed from: e */
    public CharSequence mo708e() {
        return this.f489d.getSubtitle();
    }

    /* renamed from: g */
    public CharSequence mo710g() {
        return this.f489d.getTitle();
    }

    /* renamed from: i */
    public void mo712i() {
        this.f490e.mo717b(this, this.f494i);
    }

    /* renamed from: j */
    public boolean mo713j() {
        return this.f489d.mo2433b();
    }
}
