package android.support.p029v4.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* renamed from: android.support.v4.app.h */
class C0274h extends C0284m {

    /* renamed from: a */
    final /* synthetic */ C0276j f750a;

    C0274h(C0276j jVar) {
        this.f750a = jVar;
    }

    /* renamed from: a */
    public C0276j mo967a(Context context, String str, Bundle bundle) {
        return this.f750a.f796u.mo967a(context, str, bundle);
    }

    /* renamed from: a */
    public View mo968a(int i) {
        View view = this.f750a.f764K;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment does not have a view");
    }

    /* renamed from: a */
    public boolean mo969a() {
        return this.f750a.f764K != null;
    }
}
