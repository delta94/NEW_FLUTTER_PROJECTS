package p000a.p005b.p021d.p028e;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: a.b.d.e.b */
public abstract class C0192b {

    /* renamed from: a */
    private Object f481a;

    /* renamed from: b */
    private boolean f482b;

    /* renamed from: a.b.d.e.b$a */
    public interface C0193a {
        /* renamed from: a */
        void mo714a(C0192b bVar);

        /* renamed from: a */
        boolean mo715a(C0192b bVar, Menu menu);

        /* renamed from: a */
        boolean mo716a(C0192b bVar, MenuItem menuItem);

        /* renamed from: b */
        boolean mo717b(C0192b bVar, Menu menu);
    }

    /* renamed from: a */
    public abstract void mo697a();

    /* renamed from: a */
    public abstract void mo698a(int i);

    /* renamed from: a */
    public abstract void mo699a(View view);

    /* renamed from: a */
    public abstract void mo700a(CharSequence charSequence);

    /* renamed from: a */
    public void mo701a(Object obj) {
        this.f481a = obj;
    }

    /* renamed from: a */
    public void mo702a(boolean z) {
        this.f482b = z;
    }

    /* renamed from: b */
    public abstract View mo703b();

    /* renamed from: b */
    public abstract void mo704b(int i);

    /* renamed from: b */
    public abstract void mo705b(CharSequence charSequence);

    /* renamed from: c */
    public abstract Menu mo706c();

    /* renamed from: d */
    public abstract MenuInflater mo707d();

    /* renamed from: e */
    public abstract CharSequence mo708e();

    /* renamed from: f */
    public Object mo709f() {
        return this.f481a;
    }

    /* renamed from: g */
    public abstract CharSequence mo710g();

    /* renamed from: h */
    public boolean mo711h() {
        return this.f482b;
    }

    /* renamed from: i */
    public abstract void mo712i();

    /* renamed from: j */
    public abstract boolean mo713j();
}
