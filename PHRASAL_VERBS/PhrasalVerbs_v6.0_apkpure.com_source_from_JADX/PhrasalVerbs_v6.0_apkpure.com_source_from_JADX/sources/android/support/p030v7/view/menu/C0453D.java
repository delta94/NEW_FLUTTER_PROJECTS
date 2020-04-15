package android.support.p030v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p030v7.view.menu.C0468l.C0469a;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.D */
public class C0453D extends C0468l implements SubMenu {

    /* renamed from: B */
    private C0468l f1586B;

    /* renamed from: C */
    private C0474p f1587C;

    public C0453D(Context context, C0468l lVar, C0474p pVar) {
        super(context);
        this.f1586B = lVar;
        this.f1587C = pVar;
    }

    /* renamed from: a */
    public void mo2060a(C0469a aVar) {
        this.f1586B.mo2060a(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo2061a(C0468l lVar, MenuItem menuItem) {
        return super.mo2061a(lVar, menuItem) || this.f1586B.mo2061a(lVar, menuItem);
    }

    /* renamed from: a */
    public boolean mo2062a(C0474p pVar) {
        return this.f1586B.mo2062a(pVar);
    }

    /* renamed from: b */
    public boolean mo2063b(C0474p pVar) {
        return this.f1586B.mo2063b(pVar);
    }

    /* renamed from: d */
    public String mo2064d() {
        C0474p pVar = this.f1587C;
        int itemId = pVar != null ? pVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.mo2064d());
        sb.append(":");
        sb.append(itemId);
        return sb.toString();
    }

    public MenuItem getItem() {
        return this.f1587C;
    }

    /* renamed from: m */
    public C0468l mo2066m() {
        return this.f1586B.mo2066m();
    }

    /* renamed from: o */
    public boolean mo2067o() {
        return this.f1586B.mo2067o();
    }

    /* renamed from: p */
    public boolean mo2068p() {
        return this.f1586B.mo2068p();
    }

    /* renamed from: q */
    public boolean mo2069q() {
        return this.f1586B.mo2069q();
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f1586B.setGroupDividerEnabled(z);
    }

    public SubMenu setHeaderIcon(int i) {
        super.mo2219d(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        super.mo2184a(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        super.mo2222e(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        super.mo2186a(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        super.mo2185a(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f1587C.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f1587C.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f1586B.setQwertyMode(z);
    }

    /* renamed from: t */
    public Menu mo2079t() {
        return this.f1586B;
    }
}
