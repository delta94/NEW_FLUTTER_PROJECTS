package android.support.p030v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p030v7.app.AlertController.C0396a;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import p000a.p005b.p021d.p022a.C0163a;

/* renamed from: android.support.v7.app.l */
public class C0425l extends C0401B implements DialogInterface {

    /* renamed from: c */
    final AlertController f1458c = new AlertController(getContext(), this, getWindow());

    /* renamed from: android.support.v7.app.l$a */
    public static class C0426a {

        /* renamed from: a */
        private final C0396a f1459a;

        /* renamed from: b */
        private final int f1460b;

        public C0426a(Context context) {
            this(context, C0425l.m1930a(context, 0));
        }

        public C0426a(Context context, int i) {
            this.f1459a = new C0396a(new ContextThemeWrapper(context, C0425l.m1930a(context, i)));
            this.f1460b = i;
        }

        /* renamed from: a */
        public C0426a mo1913a(OnKeyListener onKeyListener) {
            this.f1459a.f1351u = onKeyListener;
            return this;
        }

        /* renamed from: a */
        public C0426a mo1914a(Drawable drawable) {
            this.f1459a.f1334d = drawable;
            return this;
        }

        /* renamed from: a */
        public C0426a mo1915a(View view) {
            this.f1459a.f1337g = view;
            return this;
        }

        /* renamed from: a */
        public C0426a mo1916a(ListAdapter listAdapter, OnClickListener onClickListener) {
            C0396a aVar = this.f1459a;
            aVar.f1353w = listAdapter;
            aVar.f1354x = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C0426a mo1917a(CharSequence charSequence) {
            this.f1459a.f1336f = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0425l mo1918a() {
            C0425l lVar = new C0425l(this.f1459a.f1331a, this.f1460b);
            this.f1459a.mo1823a(lVar.f1458c);
            lVar.setCancelable(this.f1459a.f1348r);
            if (this.f1459a.f1348r) {
                lVar.setCanceledOnTouchOutside(true);
            }
            lVar.setOnCancelListener(this.f1459a.f1349s);
            lVar.setOnDismissListener(this.f1459a.f1350t);
            OnKeyListener onKeyListener = this.f1459a.f1351u;
            if (onKeyListener != null) {
                lVar.setOnKeyListener(onKeyListener);
            }
            return lVar;
        }

        /* renamed from: b */
        public Context mo1919b() {
            return this.f1459a.f1331a;
        }
    }

    protected C0425l(Context context, int i) {
        super(context, m1930a(context, i));
    }

    /* renamed from: a */
    static int m1930a(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0163a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1458c.mo1810a();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f1458c.mo1815a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f1458c.mo1819b(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f1458c.mo1818b(charSequence);
    }
}
