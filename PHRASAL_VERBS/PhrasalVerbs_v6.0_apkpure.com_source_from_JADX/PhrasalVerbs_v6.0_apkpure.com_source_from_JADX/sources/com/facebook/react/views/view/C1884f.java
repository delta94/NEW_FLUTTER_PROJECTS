package com.facebook.react.views.view;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import p000a.p005b.p009c.p018g.C0156v;

/* renamed from: com.facebook.react.views.view.f */
public class C1884f {

    /* renamed from: a */
    private C1881e f5625a;

    /* renamed from: b */
    private View f5626b;

    public C1884f(View view) {
        this.f5626b = view;
    }

    /* renamed from: a */
    private C1881e m7158a() {
        Drawable drawable;
        View view;
        if (this.f5625a == null) {
            this.f5625a = new C1881e(this.f5626b.getContext());
            Drawable background = this.f5626b.getBackground();
            C0156v.m547a(this.f5626b, (Drawable) null);
            if (background == null) {
                view = this.f5626b;
                drawable = this.f5625a;
            } else {
                drawable = new LayerDrawable(new Drawable[]{this.f5625a, background});
                view = this.f5626b;
            }
            C0156v.m547a(view, drawable);
        }
        return this.f5625a;
    }

    /* renamed from: a */
    public void mo6686a(float f) {
        m7158a().mo6666a(f);
    }

    /* renamed from: a */
    public void mo6687a(float f, int i) {
        m7158a().mo6672b(f, i);
    }

    /* renamed from: a */
    public void mo6688a(int i) {
        if (i != 0 || this.f5625a != null) {
            m7158a().mo6673b(i);
        }
    }

    /* renamed from: a */
    public void mo6689a(int i, float f) {
        m7158a().mo6667a(i, f);
    }

    /* renamed from: a */
    public void mo6690a(int i, float f, float f2) {
        m7158a().mo6668a(i, f, f2);
    }

    /* renamed from: a */
    public void mo6691a(String str) {
        m7158a().mo6669a(str);
    }
}
