package com.facebook.react.views.toolbar;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.p030v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C1726w;
import p032c.p033a.p059g.p060a.p061a.C0799c;
import p032c.p033a.p059g.p060a.p061a.C0802f;
import p032c.p033a.p059g.p065c.C0818f;
import p032c.p033a.p059g.p065c.C0819g;
import p032c.p033a.p059g.p068e.C0845t.C0847b;
import p032c.p033a.p059g.p069f.C0862a;
import p032c.p033a.p059g.p069f.C0863b;
import p032c.p033a.p059g.p071h.C0870a;
import p032c.p033a.p059g.p072i.C0876b;
import p032c.p033a.p059g.p072i.C0879e;
import p032c.p033a.p074i.p086j.C0989e;

/* renamed from: com.facebook.react.views.toolbar.f */
public class C1871f extends Toolbar {

    /* renamed from: P */
    private final C0876b f5563P;

    /* renamed from: Q */
    private final C0876b f5564Q;

    /* renamed from: R */
    private final C0876b f5565R;

    /* renamed from: S */
    private final C0879e<C0862a> f5566S = new C0879e<>();

    /* renamed from: T */
    private C1873b f5567T;

    /* renamed from: U */
    private C1873b f5568U;

    /* renamed from: V */
    private C1873b f5569V;

    /* renamed from: W */
    private final Runnable f5570W = new C1870e(this);

    /* renamed from: com.facebook.react.views.toolbar.f$a */
    private class C1872a extends C1873b {

        /* renamed from: e */
        private final MenuItem f5571e;

        C1872a(MenuItem menuItem, C0876b bVar) {
            super(bVar);
            this.f5571e = menuItem;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo6626a(Drawable drawable) {
            this.f5571e.setIcon(drawable);
            C1871f.this.requestLayout();
        }
    }

    /* renamed from: com.facebook.react.views.toolbar.f$b */
    private abstract class C1873b extends C0818f<C0989e> {

        /* renamed from: b */
        private final C0876b f5573b;

        /* renamed from: c */
        private C1874c f5574c;

        public C1873b(C0876b bVar) {
            this.f5573b = bVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo6626a(Drawable drawable);

        /* renamed from: a */
        public void mo6636a(C1874c cVar) {
            this.f5574c = cVar;
        }

        /* renamed from: a */
        public void mo3588a(String str, C0989e eVar, Animatable animatable) {
            super.mo3588a(str, eVar, animatable);
            C0989e eVar2 = this.f5574c;
            if (eVar2 == null) {
                eVar2 = eVar;
            }
            mo6626a((Drawable) new C1865a(this.f5573b.mo3909c(), eVar2));
        }
    }

    /* renamed from: com.facebook.react.views.toolbar.f$c */
    private static class C1874c implements C0989e {

        /* renamed from: a */
        private int f5576a;

        /* renamed from: b */
        private int f5577b;

        public C1874c(int i, int i2) {
            this.f5576a = i;
            this.f5577b = i2;
        }

        /* renamed from: m */
        public int mo4198m() {
            return this.f5577b;
        }

        /* renamed from: n */
        public int mo4199n() {
            return this.f5576a;
        }
    }

    public C1871f(Context context) {
        super(context);
        this.f5563P = C0876b.m3910a(m7115t(), context);
        this.f5564Q = C0876b.m3910a(m7115t(), context);
        this.f5565R = C0876b.m3910a(m7115t(), context);
        this.f5567T = new C1867b(this, this.f5563P);
        this.f5568U = new C1868c(this, this.f5564Q);
        this.f5569V = new C1869d(this, this.f5565R);
    }

    /* renamed from: a */
    private Drawable m7109a(String str) {
        if (m7113b(str) != 0) {
            return getResources().getDrawable(m7113b(str));
        }
        return null;
    }

    /* renamed from: a */
    private C1874c m7110a(ReadableMap readableMap) {
        String str = "width";
        if (readableMap.hasKey(str)) {
            String str2 = "height";
            if (readableMap.hasKey(str2)) {
                return new C1874c(Math.round(C1726w.m6668b((float) readableMap.getInt(str))), Math.round(C1726w.m6668b((float) readableMap.getInt(str2))));
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m7111a(MenuItem menuItem, ReadableMap readableMap) {
        C0876b a = C0876b.m3910a(m7115t(), getContext());
        C1872a aVar = new C1872a(menuItem, a);
        aVar.mo6636a(m7110a(readableMap));
        m7112a(readableMap, aVar, a);
        this.f5566S.mo3939a(a);
    }

    /* renamed from: a */
    private void m7112a(ReadableMap readableMap, C1873b bVar, C0876b bVar2) {
        String string = readableMap != null ? readableMap.getString("uri") : null;
        if (string == null) {
            bVar.mo6636a((C1874c) null);
            bVar.mo6626a((Drawable) null);
        } else if (string.startsWith("http://") || string.startsWith("https://") || string.startsWith("file://")) {
            bVar.mo6636a(m7110a(readableMap));
            C0802f a = C0799c.m3538c().m3572a(Uri.parse(string));
            a.mo3698a((C0819g<? super INFO>) bVar);
            C0802f fVar = a;
            fVar.mo3699a(bVar2.mo3903a());
            bVar2.mo3905a((C0870a) fVar.build());
            bVar2.mo3909c().setVisible(true, true);
        } else {
            bVar.mo6626a(m7109a(string));
        }
    }

    /* renamed from: b */
    private int m7113b(String str) {
        return getResources().getIdentifier(str, "drawable", getContext().getPackageName());
    }

    /* renamed from: s */
    private void m7114s() {
        this.f5563P.mo3910d();
        this.f5564Q.mo3910d();
        this.f5565R.mo3910d();
        this.f5566S.mo3940b();
    }

    /* renamed from: t */
    private C0862a m7115t() {
        C0863b bVar = new C0863b(getResources());
        bVar.mo3863a(C0847b.f3023c);
        bVar.mo3862a(0);
        return bVar.mo3861a();
    }

    /* renamed from: u */
    private void m7116u() {
        this.f5563P.mo3911e();
        this.f5564Q.mo3911e();
        this.f5565R.mo3911e();
        this.f5566S.mo3941c();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m7114s();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m7116u();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        m7114s();
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        m7116u();
    }

    public void requestLayout() {
        super.requestLayout();
        post(this.f5570W);
    }

    /* access modifiers changed from: 0000 */
    public void setActions(ReadableArray readableArray) {
        Menu menu = getMenu();
        menu.clear();
        this.f5566S.mo3937a();
        if (readableArray != null) {
            for (int i = 0; i < readableArray.size(); i++) {
                ReadableMap map = readableArray.getMap(i);
                MenuItem add = menu.add(0, 0, i, map.getString("title"));
                String str = "icon";
                if (map.hasKey(str)) {
                    m7111a(add, map.getMap(str));
                }
                String str2 = "show";
                int i2 = map.hasKey(str2) ? map.getInt(str2) : 0;
                String str3 = "showWithText";
                if (map.hasKey(str3) && map.getBoolean(str3)) {
                    i2 |= 4;
                }
                add.setShowAsAction(i2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void setLogoSource(ReadableMap readableMap) {
        m7112a(readableMap, this.f5567T, this.f5563P);
    }

    /* access modifiers changed from: 0000 */
    public void setNavIconSource(ReadableMap readableMap) {
        m7112a(readableMap, this.f5568U, this.f5564Q);
    }

    /* access modifiers changed from: 0000 */
    public void setOverflowIconSource(ReadableMap readableMap) {
        m7112a(readableMap, this.f5569V, this.f5565R);
    }
}
