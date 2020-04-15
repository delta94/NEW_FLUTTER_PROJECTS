package android.support.p030v7.view.menu;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.os.IBinder;
import android.support.p030v7.app.C0425l;
import android.support.p030v7.app.C0425l.C0426a;
import android.support.p030v7.view.menu.C0485v.C0486a;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import p000a.p005b.p021d.p022a.C0169g;

/* renamed from: android.support.v7.view.menu.m */
class C0471m implements OnKeyListener, OnClickListener, OnDismissListener, C0486a {

    /* renamed from: a */
    private C0468l f1726a;

    /* renamed from: b */
    private C0425l f1727b;

    /* renamed from: c */
    C0465j f1728c;

    /* renamed from: d */
    private C0486a f1729d;

    public C0471m(C0468l lVar) {
        this.f1726a = lVar;
    }

    /* renamed from: a */
    public void mo2245a() {
        C0425l lVar = this.f1727b;
        if (lVar != null) {
            lVar.dismiss();
        }
    }

    /* renamed from: a */
    public void mo2246a(IBinder iBinder) {
        C0468l lVar = this.f1726a;
        C0426a aVar = new C0426a(lVar.mo2221e());
        this.f1728c = new C0465j(aVar.mo1919b(), C0169g.abc_list_menu_item_layout);
        this.f1728c.mo2044a((C0486a) this);
        this.f1726a.mo2191a((C0485v) this.f1728c);
        aVar.mo1916a(this.f1728c.mo2166b(), this);
        View i = lVar.mo2229i();
        if (i != null) {
            aVar.mo1915a(i);
        } else {
            aVar.mo1914a(lVar.mo2225g());
            aVar.mo1917a(lVar.mo2227h());
        }
        aVar.mo1913a((OnKeyListener) this);
        this.f1727b = aVar.mo1918a();
        this.f1727b.setOnDismissListener(this);
        LayoutParams attributes = this.f1727b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1727b.show();
    }

    /* renamed from: a */
    public void mo2000a(C0468l lVar, boolean z) {
        if (z || lVar == this.f1726a) {
            mo2245a();
        }
        C0486a aVar = this.f1729d;
        if (aVar != null) {
            aVar.mo2000a(lVar, z);
        }
    }

    /* renamed from: a */
    public boolean mo2001a(C0468l lVar) {
        C0486a aVar = this.f1729d;
        if (aVar != null) {
            return aVar.mo2001a(lVar);
        }
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1726a.mo2196a((MenuItem) (C0474p) this.f1728c.mo2166b().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f1728c.mo2043a(this.f1726a, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window = this.f1727b.getWindow();
                if (window != null) {
                    View decorView = window.getDecorView();
                    if (decorView != null) {
                        DispatcherState keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null) {
                            keyDispatcherState.startTracking(keyEvent, this);
                            return true;
                        }
                    }
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                Window window2 = this.f1727b.getWindow();
                if (window2 != null) {
                    View decorView2 = window2.getDecorView();
                    if (decorView2 != null) {
                        DispatcherState keyDispatcherState2 = decorView2.getKeyDispatcherState();
                        if (keyDispatcherState2 != null && keyDispatcherState2.isTracking(keyEvent)) {
                            this.f1726a.mo2195a(true);
                            dialogInterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return this.f1726a.performShortcut(i, keyEvent, 0);
    }
}
