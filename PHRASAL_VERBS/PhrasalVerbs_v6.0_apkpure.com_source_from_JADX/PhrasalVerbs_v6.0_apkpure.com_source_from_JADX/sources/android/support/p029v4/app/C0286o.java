package android.support.p029v4.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.support.p029v4.util.C0337n;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.o */
public abstract class C0286o<E> extends C0284m {

    /* renamed from: a */
    private final Activity f837a;

    /* renamed from: b */
    private final Context f838b;

    /* renamed from: c */
    private final Handler f839c;

    /* renamed from: d */
    private final int f840d;

    /* renamed from: e */
    final C0297w f841e;

    C0286o(Activity activity, Context context, Handler handler, int i) {
        this.f841e = new C0297w();
        this.f837a = activity;
        C0337n.m1443a(context, "context == null");
        this.f838b = context;
        C0337n.m1443a(handler, "handler == null");
        this.f839c = handler;
        this.f840d = i;
    }

    C0286o(C0281l lVar) {
        this(lVar, lVar, lVar.f822c, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo1106a(C0276j jVar);

    /* renamed from: a */
    public abstract void mo1107a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Activity mo1138b() {
        return this.f837a;
    }

    /* renamed from: b */
    public abstract boolean mo1108b(C0276j jVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Context mo1139c() {
        return this.f838b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C0297w mo1140d() {
        return this.f841e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public Handler mo1141e() {
        return this.f839c;
    }

    /* renamed from: f */
    public abstract LayoutInflater mo1109f();

    /* renamed from: g */
    public abstract int mo1110g();

    /* renamed from: h */
    public abstract boolean mo1111h();

    /* renamed from: i */
    public abstract void mo1112i();
}
