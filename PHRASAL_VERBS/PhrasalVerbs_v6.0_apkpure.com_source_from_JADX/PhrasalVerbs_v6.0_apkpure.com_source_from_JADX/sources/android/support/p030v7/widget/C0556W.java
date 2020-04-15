package android.support.p030v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p030v7.view.menu.C0467k;
import android.support.p030v7.view.menu.C0468l;
import android.support.p030v7.view.menu.C0474p;
import android.support.p030v7.view.menu.ListMenuItemView;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.widget.W */
public class C0556W extends C0548U implements C0554V {

    /* renamed from: K */
    private static Method f2173K;

    /* renamed from: L */
    private C0554V f2174L;

    /* renamed from: android.support.v7.widget.W$a */
    public static class C0557a extends C0526N {

        /* renamed from: o */
        final int f2175o;

        /* renamed from: p */
        final int f2176p;

        /* renamed from: q */
        private C0554V f2177q;

        /* renamed from: r */
        private MenuItem f2178r;

        public C0557a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f2175o = 22;
                this.f2176p = 21;
                return;
            }
            this.f2175o = 21;
            this.f2176p = 22;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ int mo2694a(int i, int i2, int i3, int i4, int i5) {
            return super.mo2694a(i, i2, i3, i4, i5);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo2695a(MotionEvent motionEvent, int i) {
            return super.mo2695a(motionEvent, i);
        }

        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            if (this.f2177q != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                }
                C0467k kVar = (C0467k) adapter;
                C0474p pVar = null;
                if (motionEvent.getAction() != 10) {
                    int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                    if (pointToPosition != -1) {
                        int i2 = pointToPosition - i;
                        if (i2 >= 0 && i2 < kVar.getCount()) {
                            pVar = kVar.getItem(i2);
                        }
                    }
                }
                MenuItem menuItem = this.f2178r;
                if (menuItem != pVar) {
                    C0468l b = kVar.mo2176b();
                    if (menuItem != null) {
                        this.f2177q.mo2160b(b, menuItem);
                    }
                    this.f2178r = pVar;
                    if (pVar != null) {
                        this.f2177q.mo2159a(b, pVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f2175o) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f2176p) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((C0467k) getAdapter()).mo2176b().mo2195a(false);
                return true;
            }
        }

        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(C0554V v) {
            this.f2177q = v;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            f2173K = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0556W(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0526N mo2911a(Context context, boolean z) {
        C0557a aVar = new C0557a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }

    /* renamed from: a */
    public void mo2159a(C0468l lVar, MenuItem menuItem) {
        C0554V v = this.f2174L;
        if (v != null) {
            v.mo2159a(lVar, menuItem);
        }
    }

    /* renamed from: a */
    public void mo2956a(C0554V v) {
        this.f2174L = v;
    }

    /* renamed from: a */
    public void mo2957a(Object obj) {
        if (VERSION.SDK_INT >= 23) {
            this.f2139J.setEnterTransition((Transition) obj);
        }
    }

    /* renamed from: b */
    public void mo2160b(C0468l lVar, MenuItem menuItem) {
        C0554V v = this.f2174L;
        if (v != null) {
            v.mo2160b(lVar, menuItem);
        }
    }

    /* renamed from: b */
    public void mo2958b(Object obj) {
        if (VERSION.SDK_INT >= 23) {
            this.f2139J.setExitTransition((Transition) obj);
        }
    }

    /* renamed from: c */
    public void mo2959c(boolean z) {
        Method method = f2173K;
        if (method != null) {
            try {
                method.invoke(this.f2139J, new Object[]{Boolean.valueOf(z)});
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }
}
