package android.support.p029v4.app;

import android.animation.Animator;
import android.app.Activity;
import android.arch.lifecycle.C0211d;
import android.arch.lifecycle.C0211d.C0212a;
import android.arch.lifecycle.C0215f;
import android.arch.lifecycle.C0217h;
import android.arch.lifecycle.C0223m;
import android.arch.lifecycle.C0231s;
import android.arch.lifecycle.C0232t;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.p029v4.util.C0324f;
import android.support.p029v4.util.C0338o;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import p000a.p005b.p009c.p018g.C0142h;

/* renamed from: android.support.v4.app.j */
public class C0276j implements ComponentCallbacks, OnCreateContextMenuListener, C0215f, C0232t {

    /* renamed from: a */
    private static final C0338o<String, Class<?>> f752a = new C0338o<>();

    /* renamed from: b */
    static final Object f753b = new Object();

    /* renamed from: A */
    int f754A;

    /* renamed from: B */
    String f755B;

    /* renamed from: C */
    boolean f756C;

    /* renamed from: D */
    boolean f757D;

    /* renamed from: E */
    boolean f758E;

    /* renamed from: F */
    boolean f759F;

    /* renamed from: G */
    boolean f760G;

    /* renamed from: H */
    boolean f761H = true;

    /* renamed from: I */
    boolean f762I;

    /* renamed from: J */
    ViewGroup f763J;

    /* renamed from: K */
    View f764K;

    /* renamed from: L */
    View f765L;

    /* renamed from: M */
    boolean f766M;

    /* renamed from: N */
    boolean f767N = true;

    /* renamed from: O */
    C0277a f768O;

    /* renamed from: P */
    boolean f769P;

    /* renamed from: Q */
    boolean f770Q;

    /* renamed from: R */
    float f771R;

    /* renamed from: S */
    LayoutInflater f772S;

    /* renamed from: T */
    boolean f773T;

    /* renamed from: U */
    C0217h f774U = new C0217h(this);

    /* renamed from: V */
    C0217h f775V;

    /* renamed from: W */
    C0215f f776W;

    /* renamed from: X */
    C0223m<C0215f> f777X = new C0223m<>();

    /* renamed from: c */
    int f778c = 0;

    /* renamed from: d */
    Bundle f779d;

    /* renamed from: e */
    SparseArray<Parcelable> f780e;

    /* renamed from: f */
    Boolean f781f;

    /* renamed from: g */
    int f782g = -1;

    /* renamed from: h */
    String f783h;

    /* renamed from: i */
    Bundle f784i;

    /* renamed from: j */
    C0276j f785j;

    /* renamed from: k */
    int f786k = -1;

    /* renamed from: l */
    int f787l;

    /* renamed from: m */
    boolean f788m;

    /* renamed from: n */
    boolean f789n;

    /* renamed from: o */
    boolean f790o;

    /* renamed from: p */
    boolean f791p;

    /* renamed from: q */
    boolean f792q;

    /* renamed from: r */
    boolean f793r;

    /* renamed from: s */
    int f794s;

    /* renamed from: t */
    C0297w f795t;

    /* renamed from: u */
    C0286o f796u;

    /* renamed from: v */
    C0297w f797v;

    /* renamed from: w */
    C0308x f798w;

    /* renamed from: x */
    C0231s f799x;

    /* renamed from: y */
    C0276j f800y;

    /* renamed from: z */
    int f801z;

    /* renamed from: android.support.v4.app.j$a */
    static class C0277a {

        /* renamed from: a */
        View f802a;

        /* renamed from: b */
        Animator f803b;

        /* renamed from: c */
        int f804c;

        /* renamed from: d */
        int f805d;

        /* renamed from: e */
        int f806e;

        /* renamed from: f */
        int f807f;

        /* renamed from: g */
        Object f808g = null;

        /* renamed from: h */
        Object f809h;

        /* renamed from: i */
        Object f810i;

        /* renamed from: j */
        Object f811j;

        /* renamed from: k */
        Object f812k;

        /* renamed from: l */
        Object f813l;

        /* renamed from: m */
        Boolean f814m;

        /* renamed from: n */
        Boolean f815n;

        /* renamed from: o */
        C0258W f816o;

        /* renamed from: p */
        C0258W f817p;

        /* renamed from: q */
        boolean f818q;

        /* renamed from: r */
        C0279c f819r;

        /* renamed from: s */
        boolean f820s;

        C0277a() {
            Object obj = C0276j.f753b;
            this.f809h = obj;
            this.f810i = null;
            this.f811j = obj;
            this.f812k = null;
            this.f813l = obj;
            this.f816o = null;
            this.f817p = null;
        }
    }

    /* renamed from: android.support.v4.app.j$b */
    public static class C0278b extends RuntimeException {
        public C0278b(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: android.support.v4.app.j$c */
    interface C0279c {
        /* renamed from: a */
        void mo1069a();

        /* renamed from: b */
        void mo1070b();
    }

    /* renamed from: a */
    public static C0276j m1015a(Context context, String str, Bundle bundle) {
        String str2 = " empty constructor that is public";
        String str3 = ": make sure class name exists, is public, and has an";
        String str4 = "Unable to instantiate fragment ";
        try {
            Class cls = (Class) f752a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f752a.put(str, cls);
            }
            C0276j jVar = (C0276j) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(jVar.getClass().getClassLoader());
                jVar.mo1051m(bundle);
            }
            return jVar;
        } catch (ClassNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(str4);
            sb.append(str);
            sb.append(str3);
            sb.append(str2);
            throw new C0278b(sb.toString(), e);
        } catch (InstantiationException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str4);
            sb2.append(str);
            sb2.append(str3);
            sb2.append(str2);
            throw new C0278b(sb2.toString(), e2);
        } catch (IllegalAccessException e3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str4);
            sb3.append(str);
            sb3.append(str3);
            sb3.append(str2);
            throw new C0278b(sb3.toString(), e3);
        } catch (NoSuchMethodException e4) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str4);
            sb4.append(str);
            sb4.append(": could not find Fragment constructor");
            throw new C0278b(sb4.toString(), e4);
        } catch (InvocationTargetException e5) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str4);
            sb5.append(str);
            sb5.append(": calling Fragment constructor caused an exception");
            throw new C0278b(sb5.toString(), e5);
        }
    }

    /* renamed from: a */
    static boolean m1016a(Context context, String str) {
        try {
            Class cls = (Class) f752a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f752a.put(str, cls);
            }
            return C0276j.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: ba */
    private C0277a mo956ba() {
        if (this.f768O == null) {
            this.f768O = new C0277a();
        }
        return this.f768O;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: A */
    public void mo970A() {
        this.f782g = -1;
        this.f783h = null;
        this.f788m = false;
        this.f789n = false;
        this.f790o = false;
        this.f791p = false;
        this.f792q = false;
        this.f794s = 0;
        this.f795t = null;
        this.f797v = null;
        this.f796u = null;
        this.f801z = 0;
        this.f754A = 0;
        this.f755B = null;
        this.f756C = false;
        this.f757D = false;
        this.f759F = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B */
    public void mo971B() {
        if (this.f796u != null) {
            this.f797v = new C0297w();
            this.f797v.mo1186a(this.f796u, (C0284m) new C0274h(this), this);
            return;
        }
        throw new IllegalStateException("Fragment has not been attached yet.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: C */
    public boolean mo972C() {
        C0277a aVar = this.f768O;
        if (aVar == null) {
            return false;
        }
        return aVar.f820s;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: D */
    public final boolean mo973D() {
        return this.f794s > 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: E */
    public boolean mo974E() {
        C0277a aVar = this.f768O;
        if (aVar == null) {
            return false;
        }
        return aVar.f818q;
    }

    /* renamed from: F */
    public final boolean mo975F() {
        return this.f778c >= 4;
    }

    /* renamed from: G */
    public final boolean mo976G() {
        C0297w wVar = this.f795t;
        if (wVar == null) {
            return false;
        }
        return wVar.mo1147c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: H */
    public void mo977H() {
        C0297w wVar = this.f797v;
        if (wVar != null) {
            wVar.mo1240r();
        }
    }

    /* renamed from: I */
    public void mo978I() {
        boolean z = true;
        this.f762I = true;
        C0281l d = mo1027d();
        if (d == null || !d.isChangingConfigurations()) {
            z = false;
        }
        C0231s sVar = this.f799x;
        if (sVar != null && !z) {
            sVar.mo838a();
        }
    }

    /* renamed from: J */
    public void mo979J() {
    }

    /* renamed from: K */
    public void mo948K() {
        this.f762I = true;
    }

    /* renamed from: L */
    public void mo949L() {
        this.f762I = true;
    }

    /* renamed from: M */
    public void mo980M() {
        this.f762I = true;
    }

    /* renamed from: N */
    public void mo981N() {
        this.f762I = true;
    }

    /* renamed from: O */
    public void mo950O() {
        this.f762I = true;
    }

    /* renamed from: P */
    public void mo951P() {
        this.f762I = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Q */
    public C0287p mo982Q() {
        return this.f797v;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: R */
    public void mo983R() {
        this.f774U.mo819b(C0212a.ON_DESTROY);
        C0297w wVar = this.f797v;
        if (wVar != null) {
            wVar.mo1216g();
        }
        this.f778c = 0;
        this.f762I = false;
        this.f773T = false;
        mo978I();
        if (this.f762I) {
            this.f797v = null;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onDestroy()");
        throw new C0259X(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: S */
    public void mo984S() {
        if (this.f764K != null) {
            this.f775V.mo819b(C0212a.ON_DESTROY);
        }
        C0297w wVar = this.f797v;
        if (wVar != null) {
            wVar.mo1219h();
        }
        this.f778c = 1;
        this.f762I = false;
        mo948K();
        if (this.f762I) {
            C0254S.m944a(this).mo872a();
            this.f793r = false;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onDestroyView()");
        throw new C0259X(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: T */
    public void mo985T() {
        this.f762I = false;
        mo949L();
        this.f772S = null;
        if (this.f762I) {
            C0297w wVar = this.f797v;
            if (wVar == null) {
                return;
            }
            if (this.f759F) {
                wVar.mo1216g();
                this.f797v = null;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Child FragmentManager of ");
            sb.append(this);
            sb.append(" was not ");
            sb.append(" destroyed and this fragment is not retaining instance");
            throw new IllegalStateException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Fragment ");
        sb2.append(this);
        sb2.append(" did not call through to super.onDetach()");
        throw new C0259X(sb2.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: U */
    public void mo986U() {
        onLowMemory();
        C0297w wVar = this.f797v;
        if (wVar != null) {
            wVar.mo1222i();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: V */
    public void mo987V() {
        if (this.f764K != null) {
            this.f775V.mo819b(C0212a.ON_PAUSE);
        }
        this.f774U.mo819b(C0212a.ON_PAUSE);
        C0297w wVar = this.f797v;
        if (wVar != null) {
            wVar.mo1224j();
        }
        this.f778c = 3;
        this.f762I = false;
        mo980M();
        if (!this.f762I) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onPause()");
            throw new C0259X(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: W */
    public void mo988W() {
        C0297w wVar = this.f797v;
        if (wVar != null) {
            wVar.mo1240r();
            this.f797v.mo1235o();
        }
        this.f778c = 4;
        this.f762I = false;
        mo981N();
        if (this.f762I) {
            C0297w wVar2 = this.f797v;
            if (wVar2 != null) {
                wVar2.mo1226k();
                this.f797v.mo1235o();
            }
            this.f774U.mo819b(C0212a.ON_RESUME);
            if (this.f764K != null) {
                this.f775V.mo819b(C0212a.ON_RESUME);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onResume()");
        throw new C0259X(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: X */
    public void mo989X() {
        C0297w wVar = this.f797v;
        if (wVar != null) {
            wVar.mo1240r();
            this.f797v.mo1235o();
        }
        this.f778c = 3;
        this.f762I = false;
        mo950O();
        if (this.f762I) {
            C0297w wVar2 = this.f797v;
            if (wVar2 != null) {
                wVar2.mo1229l();
            }
            this.f774U.mo819b(C0212a.ON_START);
            if (this.f764K != null) {
                this.f775V.mo819b(C0212a.ON_START);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onStart()");
        throw new C0259X(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Y */
    public void mo990Y() {
        if (this.f764K != null) {
            this.f775V.mo819b(C0212a.ON_STOP);
        }
        this.f774U.mo819b(C0212a.ON_STOP);
        C0297w wVar = this.f797v;
        if (wVar != null) {
            wVar.mo1230m();
        }
        this.f778c = 2;
        this.f762I = false;
        mo951P();
        if (!this.f762I) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onStop()");
            throw new C0259X(sb.toString());
        }
    }

    /* renamed from: Z */
    public final Context mo991Z() {
        Context k = mo1046k();
        if (k != null) {
            return k;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to a context.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public C0211d mo817a() {
        return this.f774U;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0276j mo992a(String str) {
        if (str.equals(this.f783h)) {
            return this;
        }
        C0297w wVar = this.f797v;
        if (wVar != null) {
            return wVar.mo1194b(str);
        }
        return null;
    }

    @Deprecated
    /* renamed from: a */
    public LayoutInflater mo993a(Bundle bundle) {
        C0286o oVar = this.f796u;
        if (oVar != null) {
            LayoutInflater f = oVar.mo1109f();
            mo1044j();
            C0297w wVar = this.f797v;
            wVar.mo1238p();
            C0142h.m483a(f, wVar);
            return f;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    /* renamed from: a */
    public View mo994a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    /* renamed from: a */
    public Animation mo995a(int i, boolean z, int i2) {
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo996a(int i) {
        if (this.f768O != null || i != 0) {
            mo956ba().f805d = i;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo997a(int i, int i2) {
        if (this.f768O != null || i != 0 || i2 != 0) {
            mo956ba();
            C0277a aVar = this.f768O;
            aVar.f806e = i;
            aVar.f807f = i2;
        }
    }

    /* renamed from: a */
    public void mo998a(int i, int i2, Intent intent) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo999a(int i, C0276j jVar) {
        String str;
        StringBuilder sb;
        this.f782g = i;
        if (jVar != null) {
            sb = new StringBuilder();
            sb.append(jVar.f783h);
            str = ":";
        } else {
            sb = new StringBuilder();
            str = "android:fragment:";
        }
        sb.append(str);
        sb.append(this.f782g);
        this.f783h = sb.toString();
    }

    /* renamed from: a */
    public void mo1000a(int i, String[] strArr, int[] iArr) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1001a(Animator animator) {
        mo956ba().f803b = animator;
    }

    @Deprecated
    /* renamed from: a */
    public void mo1002a(Activity activity) {
        this.f762I = true;
    }

    @Deprecated
    /* renamed from: a */
    public void mo1003a(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f762I = true;
    }

    /* renamed from: a */
    public void mo953a(Context context) {
        this.f762I = true;
        C0286o oVar = this.f796u;
        Activity b = oVar == null ? null : oVar.mo1138b();
        if (b != null) {
            this.f762I = false;
            mo1002a(b);
        }
    }

    /* renamed from: a */
    public void mo1004a(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f762I = true;
        C0286o oVar = this.f796u;
        Activity b = oVar == null ? null : oVar.mo1138b();
        if (b != null) {
            this.f762I = false;
            mo1003a(b, attributeSet, bundle);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1005a(Configuration configuration) {
        onConfigurationChanged(configuration);
        C0297w wVar = this.f797v;
        if (wVar != null) {
            wVar.mo1175a(configuration);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1006a(C0279c cVar) {
        mo956ba();
        C0279c cVar2 = this.f768O.f819r;
        if (cVar != cVar2) {
            if (cVar == null || cVar2 == null) {
                C0277a aVar = this.f768O;
                if (aVar.f818q) {
                    aVar.f819r = cVar;
                }
                if (cVar != null) {
                    cVar.mo1069a();
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Trying to set a replacement startPostponedEnterTransition on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public void mo1007a(C0276j jVar) {
    }

    /* renamed from: a */
    public void mo1008a(Menu menu) {
    }

    /* renamed from: a */
    public void mo1009a(Menu menu, MenuInflater menuInflater) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1010a(View view) {
        mo956ba().f802a = view;
    }

    /* renamed from: a */
    public void mo1011a(View view, Bundle bundle) {
    }

    /* renamed from: a */
    public void mo1012a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f801z));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f754A));
        printWriter.print(" mTag=");
        printWriter.println(this.f755B);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f778c);
        printWriter.print(" mIndex=");
        printWriter.print(this.f782g);
        printWriter.print(" mWho=");
        printWriter.print(this.f783h);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f794s);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f788m);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f789n);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f790o);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f791p);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f756C);
        printWriter.print(" mDetached=");
        printWriter.print(this.f757D);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f761H);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f760G);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f758E);
        printWriter.print(" mRetaining=");
        printWriter.print(this.f759F);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f767N);
        if (this.f795t != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f795t);
        }
        if (this.f796u != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f796u);
        }
        if (this.f800y != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f800y);
        }
        if (this.f784i != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f784i);
        }
        if (this.f779d != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f779d);
        }
        if (this.f780e != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f780e);
        }
        if (this.f785j != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.f785j);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f787l);
        }
        if (mo1058q() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(mo1058q());
        }
        if (this.f763J != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f763J);
        }
        if (this.f764K != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f764K);
        }
        if (this.f765L != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.f764K);
        }
        if (mo1037g() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(mo1037g());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(mo1067y());
        }
        if (mo1046k() != null) {
            C0254S.m944a(this).mo873a(str, fileDescriptor, printWriter, strArr);
        }
        if (this.f797v != null) {
            printWriter.print(str);
            StringBuilder sb = new StringBuilder();
            sb.append("Child ");
            sb.append(this.f797v);
            sb.append(":");
            printWriter.println(sb.toString());
            C0297w wVar = this.f797v;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("  ");
            wVar.mo1145a(sb2.toString(), fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: a */
    public void mo1013a(boolean z) {
    }

    /* renamed from: a */
    public boolean mo1014a(MenuItem menuItem) {
        return false;
    }

    /* renamed from: aa */
    public void mo1015aa() {
        C0297w wVar = this.f795t;
        if (wVar == null || wVar.f884s == null) {
            mo956ba().f818q = false;
        } else if (Looper.myLooper() != this.f795t.f884s.mo1141e().getLooper()) {
            this.f795t.f884s.mo1141e().postAtFrontOfQueue(new C0273g(this));
        } else {
            mo1017b();
        }
    }

    /* renamed from: b */
    public Animator mo1016b(int i, boolean z, int i2) {
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1017b() {
        C0277a aVar = this.f768O;
        C0279c cVar = null;
        if (aVar != null) {
            aVar.f818q = false;
            C0279c cVar2 = aVar.f819r;
            aVar.f819r = null;
            cVar = cVar2;
        }
        if (cVar != null) {
            cVar.mo1070b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1018b(int i) {
        mo956ba().f804c = i;
    }

    /* renamed from: b */
    public void mo955b(Bundle bundle) {
        this.f762I = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1019b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C0297w wVar = this.f797v;
        if (wVar != null) {
            wVar.mo1240r();
        }
        this.f793r = true;
        this.f776W = new C0275i(this);
        this.f775V = null;
        this.f764K = mo994a(layoutInflater, viewGroup, bundle);
        if (this.f764K != null) {
            this.f776W.mo817a();
            this.f777X.mo799a(this.f776W);
        } else if (this.f775V == null) {
            this.f776W = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* renamed from: b */
    public void mo1020b(Menu menu) {
    }

    /* renamed from: b */
    public void mo1021b(boolean z) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo1022b(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f756C) {
            return false;
        }
        if (this.f760G && this.f761H) {
            mo1009a(menu, menuInflater);
            z = true;
        }
        C0297w wVar = this.f797v;
        return wVar != null ? z | wVar.mo1190a(menu, menuInflater) : z;
    }

    /* renamed from: b */
    public boolean mo1023b(MenuItem menuItem) {
        return false;
    }

    /* renamed from: c */
    public C0231s mo840c() {
        if (mo1046k() != null) {
            if (this.f799x == null) {
                this.f799x = new C0231s();
            }
            return this.f799x;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* renamed from: c */
    public void mo957c(Bundle bundle) {
        this.f762I = true;
        mo1047k(bundle);
        C0297w wVar = this.f797v;
        if (wVar != null && !wVar.mo1206c(1)) {
            this.f797v.mo1213f();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo1024c(Menu menu) {
        if (!this.f756C) {
            if (this.f760G && this.f761H) {
                mo1008a(menu);
            }
            C0297w wVar = this.f797v;
            if (wVar != null) {
                wVar.mo1188a(menu);
            }
        }
    }

    /* renamed from: c */
    public void mo1025c(boolean z) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo1026c(MenuItem menuItem) {
        if (!this.f756C) {
            if (mo1014a(menuItem)) {
                return true;
            }
            C0297w wVar = this.f797v;
            if (wVar != null && wVar.mo1191a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final C0281l mo1027d() {
        C0286o oVar = this.f796u;
        if (oVar == null) {
            return null;
        }
        return (C0281l) oVar.mo1138b();
    }

    /* renamed from: d */
    public LayoutInflater mo959d(Bundle bundle) {
        return mo993a(bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo1028d(boolean z) {
        mo1021b(z);
        C0297w wVar = this.f797v;
        if (wVar != null) {
            wVar.mo1189a(z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo1029d(Menu menu) {
        boolean z = false;
        if (this.f756C) {
            return false;
        }
        if (this.f760G && this.f761H) {
            mo1020b(menu);
            z = true;
        }
        C0297w wVar = this.f797v;
        return wVar != null ? z | wVar.mo1201b(menu) : z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo1030d(MenuItem menuItem) {
        if (!this.f756C) {
            if (this.f760G && this.f761H && mo1023b(menuItem)) {
                return true;
            }
            C0297w wVar = this.f797v;
            if (wVar != null && wVar.mo1202b(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public void mo960e(Bundle bundle) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo1031e(boolean z) {
        mo1025c(z);
        C0297w wVar = this.f797v;
        if (wVar != null) {
            wVar.mo1200b(z);
        }
    }

    /* renamed from: e */
    public boolean mo1032e() {
        C0277a aVar = this.f768O;
        if (aVar != null) {
            Boolean bool = aVar.f815n;
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f */
    public void mo1034f(Bundle bundle) {
        this.f762I = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo1035f(boolean z) {
        mo956ba().f820s = z;
    }

    /* renamed from: f */
    public boolean mo1036f() {
        C0277a aVar = this.f768O;
        if (aVar != null) {
            Boolean bool = aVar.f814m;
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public View mo1037g() {
        C0277a aVar = this.f768O;
        if (aVar == null) {
            return null;
        }
        return aVar.f802a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo1038g(Bundle bundle) {
        C0297w wVar = this.f797v;
        if (wVar != null) {
            wVar.mo1240r();
        }
        this.f778c = 2;
        this.f762I = false;
        mo955b(bundle);
        if (this.f762I) {
            C0297w wVar2 = this.f797v;
            if (wVar2 != null) {
                wVar2.mo1210e();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onActivityCreated()");
        throw new C0259X(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public Animator mo1039h() {
        C0277a aVar = this.f768O;
        if (aVar == null) {
            return null;
        }
        return aVar.f803b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo1040h(Bundle bundle) {
        C0297w wVar = this.f797v;
        if (wVar != null) {
            wVar.mo1240r();
        }
        this.f778c = 1;
        this.f762I = false;
        mo957c(bundle);
        this.f773T = true;
        if (this.f762I) {
            this.f774U.mo819b(C0212a.ON_CREATE);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onCreate()");
        throw new C0259X(sb.toString());
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public final Bundle mo1042i() {
        return this.f784i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public LayoutInflater mo1043i(Bundle bundle) {
        this.f772S = mo959d(bundle);
        return this.f772S;
    }

    /* renamed from: j */
    public final C0287p mo1044j() {
        if (this.f797v == null) {
            mo971B();
            int i = this.f778c;
            if (i >= 4) {
                this.f797v.mo1226k();
            } else if (i >= 3) {
                this.f797v.mo1229l();
            } else if (i >= 2) {
                this.f797v.mo1210e();
            } else if (i >= 1) {
                this.f797v.mo1213f();
            }
        }
        return this.f797v;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo1045j(Bundle bundle) {
        mo960e(bundle);
        C0297w wVar = this.f797v;
        if (wVar != null) {
            Parcelable u = wVar.mo1244u();
            if (u != null) {
                bundle.putParcelable("android:support:fragments", u);
            }
        }
    }

    /* renamed from: k */
    public Context mo1046k() {
        C0286o oVar = this.f796u;
        if (oVar == null) {
            return null;
        }
        return oVar.mo1139c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo1047k(Bundle bundle) {
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (parcelable != null) {
                if (this.f797v == null) {
                    mo971B();
                }
                this.f797v.mo1177a(parcelable, this.f798w);
                this.f798w = null;
                this.f797v.mo1213f();
            }
        }
    }

    /* renamed from: l */
    public Object mo1048l() {
        C0277a aVar = this.f768O;
        if (aVar == null) {
            return null;
        }
        return aVar.f808g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final void mo1049l(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f780e;
        if (sparseArray != null) {
            this.f765L.restoreHierarchyState(sparseArray);
            this.f780e = null;
        }
        this.f762I = false;
        mo1034f(bundle);
        if (!this.f762I) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onViewStateRestored()");
            throw new C0259X(sb.toString());
        } else if (this.f764K != null) {
            this.f775V.mo819b(C0212a.ON_CREATE);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public C0258W mo1050m() {
        C0277a aVar = this.f768O;
        if (aVar == null) {
            return null;
        }
        return aVar.f816o;
    }

    /* renamed from: m */
    public void mo1051m(Bundle bundle) {
        if (this.f782g < 0 || !mo976G()) {
            this.f784i = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already active and state has been saved");
    }

    /* renamed from: n */
    public Object mo1052n() {
        C0277a aVar = this.f768O;
        if (aVar == null) {
            return null;
        }
        return aVar.f810i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public C0258W mo1053o() {
        C0277a aVar = this.f768O;
        if (aVar == null) {
            return null;
        }
        return aVar.f817p;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f762I = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        mo1027d().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.f762I = true;
    }

    /* renamed from: p */
    public final C0287p mo1057p() {
        return this.f795t;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public int mo1058q() {
        C0277a aVar = this.f768O;
        if (aVar == null) {
            return 0;
        }
        return aVar.f805d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public int mo1059r() {
        C0277a aVar = this.f768O;
        if (aVar == null) {
            return 0;
        }
        return aVar.f806e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public int mo1060s() {
        C0277a aVar = this.f768O;
        if (aVar == null) {
            return 0;
        }
        return aVar.f807f;
    }

    /* renamed from: t */
    public Object mo1061t() {
        C0277a aVar = this.f768O;
        if (aVar == null) {
            return null;
        }
        Object obj = aVar.f811j;
        if (obj == f753b) {
            obj = mo1052n();
        }
        return obj;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        C0324f.m1400a(this, sb);
        if (this.f782g >= 0) {
            sb.append(" #");
            sb.append(this.f782g);
        }
        if (this.f801z != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f801z));
        }
        if (this.f755B != null) {
            sb.append(" ");
            sb.append(this.f755B);
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u */
    public final Resources mo1063u() {
        return mo991Z().getResources();
    }

    /* renamed from: v */
    public Object mo1064v() {
        C0277a aVar = this.f768O;
        if (aVar == null) {
            return null;
        }
        Object obj = aVar.f809h;
        if (obj == f753b) {
            obj = mo1048l();
        }
        return obj;
    }

    /* renamed from: w */
    public Object mo1065w() {
        C0277a aVar = this.f768O;
        if (aVar == null) {
            return null;
        }
        return aVar.f812k;
    }

    /* renamed from: x */
    public Object mo1066x() {
        C0277a aVar = this.f768O;
        if (aVar == null) {
            return null;
        }
        Object obj = aVar.f813l;
        if (obj == f753b) {
            obj = mo1065w();
        }
        return obj;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public int mo1067y() {
        C0277a aVar = this.f768O;
        if (aVar == null) {
            return 0;
        }
        return aVar.f804c;
    }

    /* renamed from: z */
    public View mo1068z() {
        return this.f764K;
    }
}
