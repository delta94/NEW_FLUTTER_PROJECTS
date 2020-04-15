package com.facebook.react.uimanager.p123c;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;

/* renamed from: com.facebook.react.uimanager.c.h */
public class C1610h {

    /* renamed from: a */
    private final C1603a f4856a = new C1614l();

    /* renamed from: b */
    private final C1603a f4857b = new C1617o();

    /* renamed from: c */
    private final C1603a f4858c = new C1615m();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final SparseArray<C1616n> f4859d = new SparseArray<>(0);

    /* renamed from: e */
    private boolean f4860e;

    /* renamed from: b */
    private void m6360b(View view) {
        view.setClickable(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m6360b(viewGroup.getChildAt(i));
            }
        }
    }

    /* renamed from: a */
    public void mo5842a() {
        this.f4856a.mo5834b();
        this.f4857b.mo5834b();
        this.f4858c.mo5834b();
        this.f4860e = false;
    }

    /* renamed from: a */
    public void mo5843a(View view, int i, int i2, int i3, int i4) {
        UiThreadUtil.assertOnUiThread();
        int id = view.getId();
        C1616n nVar = (C1616n) this.f4859d.get(id);
        if (nVar != null) {
            nVar.mo5848a(i, i2, i3, i4);
            return;
        }
        Animation a = ((view.getWidth() == 0 || view.getHeight() == 0) ? this.f4856a : this.f4857b).mo5830a(view, i, i2, i3, i4);
        if (a instanceof C1616n) {
            a.setAnimationListener(new C1608f(this, id));
        } else {
            view.layout(i, i2, i3 + i, i4 + i2);
        }
        if (a != null) {
            view.startAnimation(a);
        }
    }

    /* renamed from: a */
    public void mo5844a(View view, C1611i iVar) {
        UiThreadUtil.assertOnUiThread();
        Animation a = this.f4858c.mo5830a(view, view.getLeft(), view.getTop(), view.getWidth(), view.getHeight());
        if (a != null) {
            m6360b(view);
            a.setAnimationListener(new C1609g(this, iVar));
            view.startAnimation(a);
            return;
        }
        iVar.mo5847a();
    }

    /* renamed from: a */
    public void mo5845a(ReadableMap readableMap) {
        if (readableMap == null) {
            mo5842a();
            return;
        }
        int i = 0;
        this.f4860e = false;
        String str = "duration";
        if (readableMap.hasKey(str)) {
            i = readableMap.getInt(str);
        }
        if (readableMap.hasKey(C1613k.m6367a(C1613k.CREATE))) {
            this.f4856a.mo5831a(readableMap.getMap(C1613k.m6367a(C1613k.CREATE)), i);
            this.f4860e = true;
        }
        if (readableMap.hasKey(C1613k.m6367a(C1613k.UPDATE))) {
            this.f4857b.mo5831a(readableMap.getMap(C1613k.m6367a(C1613k.UPDATE)), i);
            this.f4860e = true;
        }
        if (readableMap.hasKey(C1613k.m6367a(C1613k.DELETE))) {
            this.f4858c.mo5831a(readableMap.getMap(C1613k.m6367a(C1613k.DELETE)), i);
            this.f4860e = true;
        }
    }

    /* renamed from: a */
    public boolean mo5846a(View view) {
        return (this.f4860e && view.getParent() != null) || this.f4859d.get(view.getId()) != null;
    }
}
