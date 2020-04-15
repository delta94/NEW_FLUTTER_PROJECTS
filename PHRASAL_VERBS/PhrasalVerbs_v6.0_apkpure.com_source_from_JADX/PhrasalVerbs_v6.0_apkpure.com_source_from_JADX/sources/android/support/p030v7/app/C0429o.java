package android.support.p030v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

/* renamed from: android.support.v7.app.o */
public abstract class C0429o {

    /* renamed from: a */
    private static int f1464a = -1;

    C0429o() {
    }

    /* renamed from: a */
    public static C0429o m1955a(Activity activity, C0428n nVar) {
        return new C0438x(activity, activity.getWindow(), nVar);
    }

    /* renamed from: a */
    public static C0429o m1956a(Dialog dialog, C0428n nVar) {
        return new C0438x(dialog.getContext(), dialog.getWindow(), nVar);
    }

    /* renamed from: b */
    public static int m1957b() {
        return f1464a;
    }

    /* renamed from: a */
    public abstract <T extends View> T mo1944a(int i);

    /* renamed from: a */
    public abstract void mo1945a(Configuration configuration);

    /* renamed from: a */
    public abstract void mo1946a(Bundle bundle);

    /* renamed from: a */
    public abstract void mo1947a(View view);

    /* renamed from: a */
    public abstract void mo1948a(View view, LayoutParams layoutParams);

    /* renamed from: a */
    public abstract void mo1949a(CharSequence charSequence);

    /* renamed from: a */
    public abstract boolean mo1950a();

    /* renamed from: b */
    public abstract void mo1951b(Bundle bundle);

    /* renamed from: b */
    public abstract void mo1952b(View view, LayoutParams layoutParams);

    /* renamed from: b */
    public abstract boolean mo1953b(int i);

    /* renamed from: c */
    public abstract MenuInflater mo1954c();

    /* renamed from: c */
    public abstract void mo1955c(int i);

    /* renamed from: c */
    public abstract void mo1956c(Bundle bundle);

    /* renamed from: d */
    public abstract C0411a mo1957d();

    /* renamed from: e */
    public abstract void mo1958e();

    /* renamed from: f */
    public abstract void mo1959f();

    /* renamed from: g */
    public abstract void mo1960g();

    /* renamed from: h */
    public abstract void mo1961h();

    /* renamed from: i */
    public abstract void mo1962i();

    /* renamed from: j */
    public abstract void mo1963j();
}
