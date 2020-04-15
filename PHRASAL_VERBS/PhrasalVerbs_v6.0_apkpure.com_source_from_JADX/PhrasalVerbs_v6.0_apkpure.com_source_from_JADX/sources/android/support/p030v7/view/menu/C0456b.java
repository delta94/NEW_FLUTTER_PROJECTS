package android.support.p030v7.view.menu;

import android.content.Context;
import android.support.p030v7.view.menu.C0485v.C0486a;
import android.support.p030v7.view.menu.C0487w.C0488a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.b */
public abstract class C0456b implements C0485v {

    /* renamed from: a */
    protected Context f1631a;

    /* renamed from: b */
    protected Context f1632b;

    /* renamed from: c */
    protected C0468l f1633c;

    /* renamed from: d */
    protected LayoutInflater f1634d;

    /* renamed from: e */
    protected LayoutInflater f1635e;

    /* renamed from: f */
    private C0486a f1636f;

    /* renamed from: g */
    private int f1637g;

    /* renamed from: h */
    private int f1638h;

    /* renamed from: i */
    protected C0487w f1639i;

    /* renamed from: j */
    private int f1640j;

    public C0456b(Context context, int i, int i2) {
        this.f1631a = context;
        this.f1634d = LayoutInflater.from(context);
        this.f1637g = i;
        this.f1638h = i2;
    }

    /* renamed from: a */
    public C0488a mo2138a(ViewGroup viewGroup) {
        return (C0488a) this.f1634d.inflate(this.f1638h, viewGroup, false);
    }

    /* renamed from: a */
    public View mo2139a(C0474p pVar, View view, ViewGroup viewGroup) {
        C0488a a = view instanceof C0488a ? (C0488a) view : mo2138a(viewGroup);
        mo2142a(pVar, a);
        return (View) a;
    }

    /* renamed from: a */
    public void mo2140a(int i) {
        this.f1640j = i;
    }

    /* renamed from: a */
    public void mo2141a(Context context, C0468l lVar) {
        this.f1632b = context;
        this.f1635e = LayoutInflater.from(this.f1632b);
        this.f1633c = lVar;
    }

    /* renamed from: a */
    public void mo2043a(C0468l lVar, boolean z) {
        C0486a aVar = this.f1636f;
        if (aVar != null) {
            aVar.mo2000a(lVar, z);
        }
    }

    /* renamed from: a */
    public abstract void mo2142a(C0474p pVar, C0488a aVar);

    /* renamed from: a */
    public void mo2044a(C0486a aVar) {
        this.f1636f = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2143a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f1639i).addView(view, i);
    }

    /* renamed from: a */
    public void mo2047a(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f1639i;
        if (viewGroup != null) {
            C0468l lVar = this.f1633c;
            int i = 0;
            if (lVar != null) {
                lVar.mo2208b();
                ArrayList n = this.f1633c.mo2234n();
                int size = n.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0474p pVar = (C0474p) n.get(i3);
                    if (mo2144a(i2, pVar)) {
                        View childAt = viewGroup.getChildAt(i2);
                        C0474p itemData = childAt instanceof C0488a ? ((C0488a) childAt).getItemData() : null;
                        View a = mo2139a(pVar, childAt, viewGroup);
                        if (pVar != itemData) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            mo2143a(a, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo2146a(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public abstract boolean mo2144a(int i, C0474p pVar);

    /* renamed from: a */
    public boolean mo2049a(C0453D d) {
        C0486a aVar = this.f1636f;
        if (aVar != null) {
            return aVar.mo2001a(d);
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo2145a(C0468l lVar, C0474p pVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo2146a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: b */
    public C0486a mo2147b() {
        return this.f1636f;
    }

    /* renamed from: b */
    public C0487w mo2148b(ViewGroup viewGroup) {
        if (this.f1639i == null) {
            this.f1639i = (C0487w) this.f1634d.inflate(this.f1637g, viewGroup, false);
            this.f1639i.mo2090a(this.f1633c);
            mo2047a(true);
        }
        return this.f1639i;
    }

    /* renamed from: b */
    public boolean mo2149b(C0468l lVar, C0474p pVar) {
        return false;
    }
}
