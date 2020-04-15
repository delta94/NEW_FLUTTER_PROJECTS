package android.support.p030v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import p000a.p005b.p021d.p022a.C0172j;
import p000a.p005b.p021d.p028e.C0192b;
import p000a.p005b.p021d.p028e.C0192b.C0193a;

/* renamed from: android.support.v7.app.a */
public abstract class C0411a {

    /* renamed from: android.support.v7.app.a$a */
    public static class C0412a extends MarginLayoutParams {

        /* renamed from: a */
        public int f1432a;

        public C0412a(int i, int i2) {
            super(i, i2);
            this.f1432a = 0;
            this.f1432a = 8388627;
        }

        public C0412a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1432a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0172j.ActionBarLayout);
            this.f1432a = obtainStyledAttributes.getInt(C0172j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C0412a(C0412a aVar) {
            super(aVar);
            this.f1432a = 0;
            this.f1432a = aVar.f1432a;
        }

        public C0412a(LayoutParams layoutParams) {
            super(layoutParams);
            this.f1432a = 0;
        }
    }

    /* renamed from: android.support.v7.app.a$b */
    public interface C0413b {
        void onMenuVisibilityChanged(boolean z);
    }

    @Deprecated
    /* renamed from: android.support.v7.app.a$c */
    public static abstract class C0414c {
        /* renamed from: a */
        public abstract CharSequence mo1896a();

        /* renamed from: b */
        public abstract View mo1897b();

        /* renamed from: c */
        public abstract Drawable mo1898c();

        /* renamed from: d */
        public abstract CharSequence mo1899d();

        /* renamed from: e */
        public abstract void mo1900e();
    }

    /* renamed from: a */
    public abstract C0192b mo1863a(C0193a aVar);

    /* renamed from: a */
    public abstract void mo1868a(Configuration configuration);

    /* renamed from: a */
    public abstract void mo1869a(CharSequence charSequence);

    /* renamed from: a */
    public abstract boolean mo1871a(int i, KeyEvent keyEvent);

    /* renamed from: a */
    public boolean mo1890a(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: b */
    public abstract void mo1873b(boolean z);

    /* renamed from: c */
    public abstract void mo1875c(boolean z);

    /* renamed from: d */
    public abstract void mo1877d(boolean z);

    /* renamed from: e */
    public boolean mo1891e() {
        return false;
    }

    /* renamed from: f */
    public abstract boolean mo1880f();

    /* renamed from: g */
    public abstract int mo1881g();

    /* renamed from: h */
    public abstract Context mo1883h();

    /* renamed from: i */
    public boolean mo1892i() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo1893j() {
    }

    /* renamed from: k */
    public boolean mo1894k() {
        return false;
    }
}
