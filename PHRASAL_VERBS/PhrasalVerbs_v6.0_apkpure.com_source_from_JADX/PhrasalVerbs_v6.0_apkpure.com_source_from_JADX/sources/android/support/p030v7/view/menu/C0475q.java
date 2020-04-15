package android.support.p030v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p000a.p005b.p009c.p013c.p014a.C0076b;
import p000a.p005b.p009c.p018g.C0136e;
import p000a.p005b.p021d.p028e.C0194c;

/* renamed from: android.support.v7.view.menu.q */
public class C0475q extends C0457c<C0076b> implements MenuItem {

    /* renamed from: e */
    private Method f1762e;

    /* renamed from: android.support.v7.view.menu.q$a */
    class C0476a extends C0136e {

        /* renamed from: d */
        final ActionProvider f1763d;

        public C0476a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f1763d = actionProvider;
        }

        /* renamed from: a */
        public void mo492a(SubMenu subMenu) {
            this.f1763d.onPrepareSubMenu(C0475q.this.mo2151a(subMenu));
        }

        /* renamed from: a */
        public boolean mo493a() {
            return this.f1763d.hasSubMenu();
        }

        /* renamed from: c */
        public View mo495c() {
            return this.f1763d.onCreateActionView();
        }

        /* renamed from: d */
        public boolean mo496d() {
            return this.f1763d.onPerformDefaultAction();
        }
    }

    /* renamed from: android.support.v7.view.menu.q$b */
    static class C0477b extends FrameLayout implements C0194c {

        /* renamed from: a */
        final CollapsibleActionView f1765a;

        C0477b(View view) {
            super(view.getContext());
            this.f1765a = (CollapsibleActionView) view;
            addView(view);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public View mo2361a() {
            return (View) this.f1765a;
        }

        public void onActionViewCollapsed() {
            this.f1765a.onActionViewCollapsed();
        }

        public void onActionViewExpanded() {
            this.f1765a.onActionViewExpanded();
        }
    }

    /* renamed from: android.support.v7.view.menu.q$c */
    private class C0478c extends C0458d<OnActionExpandListener> implements OnActionExpandListener {
        C0478c(OnActionExpandListener onActionExpandListener) {
            super(onActionExpandListener);
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return ((OnActionExpandListener) this.f1644a).onMenuItemActionCollapse(C0475q.this.mo2150a(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return ((OnActionExpandListener) this.f1644a).onMenuItemActionExpand(C0475q.this.mo2150a(menuItem));
        }
    }

    /* renamed from: android.support.v7.view.menu.q$d */
    private class C0479d extends C0458d<OnMenuItemClickListener> implements OnMenuItemClickListener {
        C0479d(OnMenuItemClickListener onMenuItemClickListener) {
            super(onMenuItemClickListener);
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return ((OnMenuItemClickListener) this.f1644a).onMenuItemClick(C0475q.this.mo2150a(menuItem));
        }
    }

    C0475q(Context context, C0076b bVar) {
        super(context, bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0476a mo2305a(ActionProvider actionProvider) {
        return new C0476a(this.f1641b, actionProvider);
    }

    /* renamed from: a */
    public void mo2306a(boolean z) {
        try {
            if (this.f1762e == null) {
                this.f1762e = ((C0076b) this.f1644a).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f1762e.invoke(this.f1644a, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    public boolean collapseActionView() {
        return ((C0076b) this.f1644a).collapseActionView();
    }

    public boolean expandActionView() {
        return ((C0076b) this.f1644a).expandActionView();
    }

    public ActionProvider getActionProvider() {
        C0136e a = ((C0076b) this.f1644a).mo242a();
        if (a instanceof C0476a) {
            return ((C0476a) a).f1763d;
        }
        return null;
    }

    public View getActionView() {
        View actionView = ((C0076b) this.f1644a).getActionView();
        return actionView instanceof C0477b ? ((C0477b) actionView).mo2361a() : actionView;
    }

    public int getAlphabeticModifiers() {
        return ((C0076b) this.f1644a).getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return ((C0076b) this.f1644a).getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return ((C0076b) this.f1644a).getContentDescription();
    }

    public int getGroupId() {
        return ((C0076b) this.f1644a).getGroupId();
    }

    public Drawable getIcon() {
        return ((C0076b) this.f1644a).getIcon();
    }

    public ColorStateList getIconTintList() {
        return ((C0076b) this.f1644a).getIconTintList();
    }

    public Mode getIconTintMode() {
        return ((C0076b) this.f1644a).getIconTintMode();
    }

    public Intent getIntent() {
        return ((C0076b) this.f1644a).getIntent();
    }

    public int getItemId() {
        return ((C0076b) this.f1644a).getItemId();
    }

    public ContextMenuInfo getMenuInfo() {
        return ((C0076b) this.f1644a).getMenuInfo();
    }

    public int getNumericModifiers() {
        return ((C0076b) this.f1644a).getNumericModifiers();
    }

    public char getNumericShortcut() {
        return ((C0076b) this.f1644a).getNumericShortcut();
    }

    public int getOrder() {
        return ((C0076b) this.f1644a).getOrder();
    }

    public SubMenu getSubMenu() {
        return mo2151a(((C0076b) this.f1644a).getSubMenu());
    }

    public CharSequence getTitle() {
        return ((C0076b) this.f1644a).getTitle();
    }

    public CharSequence getTitleCondensed() {
        return ((C0076b) this.f1644a).getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return ((C0076b) this.f1644a).getTooltipText();
    }

    public boolean hasSubMenu() {
        return ((C0076b) this.f1644a).hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return ((C0076b) this.f1644a).isActionViewExpanded();
    }

    public boolean isCheckable() {
        return ((C0076b) this.f1644a).isCheckable();
    }

    public boolean isChecked() {
        return ((C0076b) this.f1644a).isChecked();
    }

    public boolean isEnabled() {
        return ((C0076b) this.f1644a).isEnabled();
    }

    public boolean isVisible() {
        return ((C0076b) this.f1644a).isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((C0076b) this.f1644a).mo241a(actionProvider != null ? mo2305a(actionProvider) : null);
        return this;
    }

    public MenuItem setActionView(int i) {
        ((C0076b) this.f1644a).setActionView(i);
        View actionView = ((C0076b) this.f1644a).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((C0076b) this.f1644a).setActionView((View) new C0477b(actionView));
        }
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0477b(view);
        }
        ((C0076b) this.f1644a).setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        ((C0076b) this.f1644a).setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        ((C0076b) this.f1644a).setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        ((C0076b) this.f1644a).setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        ((C0076b) this.f1644a).setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        ((C0076b) this.f1644a).setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        ((C0076b) this.f1644a).setEnabled(z);
        return this;
    }

    public MenuItem setIcon(int i) {
        ((C0076b) this.f1644a).setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        ((C0076b) this.f1644a).setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        ((C0076b) this.f1644a).setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(Mode mode) {
        ((C0076b) this.f1644a).setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        ((C0076b) this.f1644a).setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        ((C0076b) this.f1644a).setNumericShortcut(c);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        ((C0076b) this.f1644a).setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        ((C0076b) this.f1644a).setOnActionExpandListener(onActionExpandListener != null ? new C0478c(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        ((C0076b) this.f1644a).setOnMenuItemClickListener(onMenuItemClickListener != null ? new C0479d(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        ((C0076b) this.f1644a).setShortcut(c, c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        ((C0076b) this.f1644a).setShortcut(c, c2, i, i2);
        return this;
    }

    public void setShowAsAction(int i) {
        ((C0076b) this.f1644a).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        ((C0076b) this.f1644a).setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        ((C0076b) this.f1644a).setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        ((C0076b) this.f1644a).setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((C0076b) this.f1644a).setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        ((C0076b) this.f1644a).setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return ((C0076b) this.f1644a).setVisible(z);
    }
}
