package p000a.p005b.p021d.p028e;

import android.content.Context;
import android.support.p029v4.util.C0338o;
import android.support.p030v7.view.menu.C0489x;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import p000a.p005b.p009c.p013c.p014a.C0075a;
import p000a.p005b.p009c.p013c.p014a.C0076b;
import p000a.p005b.p021d.p028e.C0192b.C0193a;

/* renamed from: a.b.d.e.f */
public class C0197f extends ActionMode {

    /* renamed from: a */
    final Context f495a;

    /* renamed from: b */
    final C0192b f496b;

    /* renamed from: a.b.d.e.f$a */
    public static class C0198a implements C0193a {

        /* renamed from: a */
        final Callback f497a;

        /* renamed from: b */
        final Context f498b;

        /* renamed from: c */
        final ArrayList<C0197f> f499c = new ArrayList<>();

        /* renamed from: d */
        final C0338o<Menu, Menu> f500d = new C0338o<>();

        public C0198a(Context context, Callback callback) {
            this.f498b = context;
            this.f497a = callback;
        }

        /* renamed from: a */
        private Menu m731a(Menu menu) {
            Menu menu2 = (Menu) this.f500d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            Menu a = C0489x.m2333a(this.f498b, (C0075a) menu);
            this.f500d.put(menu, a);
            return a;
        }

        /* renamed from: a */
        public void mo714a(C0192b bVar) {
            this.f497a.onDestroyActionMode(mo747b(bVar));
        }

        /* renamed from: a */
        public boolean mo715a(C0192b bVar, Menu menu) {
            return this.f497a.onCreateActionMode(mo747b(bVar), m731a(menu));
        }

        /* renamed from: a */
        public boolean mo716a(C0192b bVar, MenuItem menuItem) {
            return this.f497a.onActionItemClicked(mo747b(bVar), C0489x.m2334a(this.f498b, (C0076b) menuItem));
        }

        /* renamed from: b */
        public ActionMode mo747b(C0192b bVar) {
            int size = this.f499c.size();
            for (int i = 0; i < size; i++) {
                C0197f fVar = (C0197f) this.f499c.get(i);
                if (fVar != null && fVar.f496b == bVar) {
                    return fVar;
                }
            }
            C0197f fVar2 = new C0197f(this.f498b, bVar);
            this.f499c.add(fVar2);
            return fVar2;
        }

        /* renamed from: b */
        public boolean mo717b(C0192b bVar, Menu menu) {
            return this.f497a.onPrepareActionMode(mo747b(bVar), m731a(menu));
        }
    }

    public C0197f(Context context, C0192b bVar) {
        this.f495a = context;
        this.f496b = bVar;
    }

    public void finish() {
        this.f496b.mo697a();
    }

    public View getCustomView() {
        return this.f496b.mo703b();
    }

    public Menu getMenu() {
        return C0489x.m2333a(this.f495a, (C0075a) this.f496b.mo706c());
    }

    public MenuInflater getMenuInflater() {
        return this.f496b.mo707d();
    }

    public CharSequence getSubtitle() {
        return this.f496b.mo708e();
    }

    public Object getTag() {
        return this.f496b.mo709f();
    }

    public CharSequence getTitle() {
        return this.f496b.mo710g();
    }

    public boolean getTitleOptionalHint() {
        return this.f496b.mo711h();
    }

    public void invalidate() {
        this.f496b.mo712i();
    }

    public boolean isTitleOptional() {
        return this.f496b.mo713j();
    }

    public void setCustomView(View view) {
        this.f496b.mo699a(view);
    }

    public void setSubtitle(int i) {
        this.f496b.mo698a(i);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f496b.mo700a(charSequence);
    }

    public void setTag(Object obj) {
        this.f496b.mo701a(obj);
    }

    public void setTitle(int i) {
        this.f496b.mo704b(i);
    }

    public void setTitle(CharSequence charSequence) {
        this.f496b.mo705b(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f496b.mo702a(z);
    }
}
