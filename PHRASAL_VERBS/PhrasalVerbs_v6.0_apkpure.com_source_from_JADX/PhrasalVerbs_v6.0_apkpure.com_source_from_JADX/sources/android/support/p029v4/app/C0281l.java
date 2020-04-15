package android.support.p029v4.app;

import android.arch.lifecycle.C0211d;
import android.arch.lifecycle.C0211d.C0213b;
import android.arch.lifecycle.C0231s;
import android.arch.lifecycle.C0232t;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.p029v4.app.C0263a.C0264a;
import android.support.p029v4.app.C0263a.C0265b;
import android.support.p029v4.app.C0263a.C0266c;
import android.support.p029v4.util.C0339p;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.l */
public class C0281l extends C0260Y implements C0232t, C0264a, C0266c {

    /* renamed from: c */
    final Handler f822c = new C0280k(this);

    /* renamed from: d */
    final C0285n f823d = C0285n.m1148a((C0286o<?>) new C0282a<Object>());

    /* renamed from: e */
    private C0231s f824e;

    /* renamed from: f */
    boolean f825f;

    /* renamed from: g */
    boolean f826g;

    /* renamed from: h */
    boolean f827h = true;

    /* renamed from: i */
    boolean f828i;

    /* renamed from: j */
    boolean f829j;

    /* renamed from: k */
    int f830k;

    /* renamed from: l */
    C0339p<String> f831l;

    /* renamed from: android.support.v4.app.l$a */
    class C0282a extends C0286o<C0281l> {
        public C0282a() {
            super(C0281l.this);
        }

        /* renamed from: a */
        public View mo968a(int i) {
            return C0281l.this.findViewById(i);
        }

        /* renamed from: a */
        public void mo1106a(C0276j jVar) {
            C0281l.this.mo1073a(jVar);
        }

        /* renamed from: a */
        public void mo1107a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            C0281l.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        /* renamed from: a */
        public boolean mo969a() {
            Window window = C0281l.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        /* renamed from: b */
        public boolean mo1108b(C0276j jVar) {
            return !C0281l.this.isFinishing();
        }

        /* renamed from: f */
        public LayoutInflater mo1109f() {
            return C0281l.this.getLayoutInflater().cloneInContext(C0281l.this);
        }

        /* renamed from: g */
        public int mo1110g() {
            Window window = C0281l.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        /* renamed from: h */
        public boolean mo1111h() {
            return C0281l.this.getWindow() != null;
        }

        /* renamed from: i */
        public void mo1112i() {
            C0281l.this.mo1079h();
        }
    }

    /* renamed from: android.support.v4.app.l$b */
    static final class C0283b {

        /* renamed from: a */
        Object f833a;

        /* renamed from: b */
        C0231s f834b;

        /* renamed from: c */
        C0308x f835c;

        C0283b() {
        }
    }

    /* renamed from: a */
    static void m1124a(int i) {
        if ((i & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    /* renamed from: a */
    private static boolean m1125a(C0287p pVar, C0213b bVar) {
        boolean z = false;
        for (C0276j jVar : pVar.mo1146b()) {
            if (jVar != null) {
                if (jVar.mo817a().mo813a().mo816a(C0213b.STARTED)) {
                    jVar.f774U.mo818a(bVar);
                    z = true;
                }
                C0287p Q = jVar.mo982Q();
                if (Q != null) {
                    z |= m1125a(Q, bVar);
                }
            }
        }
        return z;
    }

    /* renamed from: i */
    private void mo1929i() {
        do {
        } while (m1125a(mo1076e(), C0213b.CREATED));
    }

    /* renamed from: a */
    public C0211d mo817a() {
        return super.mo817a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final View mo1072a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f823d.mo1114a(view, str, context, attributeSet);
    }

    /* renamed from: a */
    public void mo1073a(C0276j jVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo1074a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    /* renamed from: c */
    public C0231s mo840c() {
        if (getApplication() != null) {
            if (this.f824e == null) {
                C0283b bVar = (C0283b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.f824e = bVar.f834b;
                }
                if (this.f824e == null) {
                    this.f824e = new C0231s();
                }
            }
            return this.f824e;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("  ");
        String sb2 = sb.toString();
        printWriter.print(sb2);
        printWriter.print("mCreated=");
        printWriter.print(this.f825f);
        printWriter.print(" mResumed=");
        printWriter.print(this.f826g);
        printWriter.print(" mStopped=");
        printWriter.print(this.f827h);
        if (getApplication() != null) {
            C0254S.m944a(this).mo873a(sb2, fileDescriptor, printWriter, strArr);
        }
        this.f823d.mo1134j().mo1145a(str, fileDescriptor, printWriter, strArr);
    }

    /* renamed from: e */
    public C0287p mo1076e() {
        return this.f823d.mo1134j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo1077f() {
        this.f823d.mo1130f();
    }

    /* renamed from: g */
    public Object mo1078g() {
        return null;
    }

    @Deprecated
    /* renamed from: h */
    public void mo1079h() {
        invalidateOptionsMenu();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f823d.mo1135k();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String str = (String) this.f831l.mo1453b(i4);
            this.f831l.mo1458d(i4);
            String str2 = "FragmentActivity";
            if (str == null) {
                Log.w(str2, "Activity result delivered for unknown Fragment.");
                return;
            }
            C0276j a = this.f823d.mo1113a(str);
            if (a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Activity result no fragment exists for who: ");
                sb.append(str);
                Log.w(str2, sb.toString());
            } else {
                a.mo998a(i & 65535, i2, intent);
            }
            return;
        }
        C0265b a2 = C0263a.m968a();
        if (a2 == null || !a2.onActivityResult(this, i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        C0287p j = this.f823d.mo1134j();
        boolean c = j.mo1147c();
        if (!c || VERSION.SDK_INT > 25) {
            if (c || !j.mo1148d()) {
                super.onBackPressed();
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f823d.mo1135k();
        this.f823d.mo1116a(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C0308x xVar = null;
        this.f823d.mo1118a((C0276j) null);
        super.onCreate(bundle);
        C0283b bVar = (C0283b) getLastNonConfigurationInstance();
        if (bVar != null) {
            C0231s sVar = bVar.f834b;
            if (sVar != null && this.f824e == null) {
                this.f824e = sVar;
            }
        }
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            C0285n nVar = this.f823d;
            if (bVar != null) {
                xVar = bVar.f835c;
            }
            nVar.mo1117a(parcelable, xVar);
            String str = "android:support:next_request_index";
            if (bundle.containsKey(str)) {
                this.f830k = bundle.getInt(str);
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f831l = new C0339p<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.f831l.mo1456c(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.f831l == null) {
            this.f831l = new C0339p<>();
            this.f830k = 0;
        }
        this.f823d.mo1123b();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return i == 0 ? super.onCreatePanelMenu(i, menu) | this.f823d.mo1121a(menu, getMenuInflater()) : super.onCreatePanelMenu(i, menu);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a = mo1072a(view, str, context, attributeSet);
        return a == null ? super.onCreateView(view, str, context, attributeSet) : a;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View a = mo1072a(null, str, context, attributeSet);
        return a == null ? super.onCreateView(str, context, attributeSet) : a;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f824e != null && !isChangingConfigurations()) {
            this.f824e.mo838a();
        }
        this.f823d.mo1127c();
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f823d.mo1128d();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f823d.mo1126b(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.f823d.mo1122a(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.f823d.mo1120a(z);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f823d.mo1135k();
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f823d.mo1119a(menu);
        }
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f826g = false;
        if (this.f822c.hasMessages(2)) {
            this.f822c.removeMessages(2);
            mo1077f();
        }
        this.f823d.mo1129e();
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.f823d.mo1124b(z);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        this.f822c.removeMessages(2);
        mo1077f();
        this.f823d.mo1133i();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return (i != 0 || menu == null) ? super.onPreparePanel(i, view, menu) : mo1074a(view, menu) | this.f823d.mo1125b(menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f823d.mo1135k();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String str = (String) this.f831l.mo1453b(i3);
            this.f831l.mo1458d(i3);
            String str2 = "FragmentActivity";
            if (str == null) {
                Log.w(str2, "Activity result delivered for unknown Fragment.");
                return;
            }
            C0276j a = this.f823d.mo1113a(str);
            if (a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Activity result no fragment exists for who: ");
                sb.append(str);
                Log.w(str2, sb.toString());
            } else {
                a.mo1000a(i & 65535, strArr, iArr);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f822c.sendEmptyMessage(2);
        this.f826g = true;
        this.f823d.mo1133i();
    }

    public final Object onRetainNonConfigurationInstance() {
        Object g = mo1078g();
        C0308x l = this.f823d.mo1136l();
        if (l == null && this.f824e == null && g == null) {
            return null;
        }
        C0283b bVar = new C0283b();
        bVar.f833a = g;
        bVar.f834b = this.f824e;
        bVar.f835c = l;
        return bVar;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo1929i();
        Parcelable m = this.f823d.mo1137m();
        if (m != null) {
            bundle.putParcelable("android:support:fragments", m);
        }
        if (this.f831l.mo1452b() > 0) {
            bundle.putInt("android:support:next_request_index", this.f830k);
            int[] iArr = new int[this.f831l.mo1452b()];
            String[] strArr = new String[this.f831l.mo1452b()];
            for (int i = 0; i < this.f831l.mo1452b(); i++) {
                iArr[i] = this.f831l.mo1455c(i);
                strArr[i] = (String) this.f831l.mo1459e(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f827h = false;
        if (!this.f825f) {
            this.f825f = true;
            this.f823d.mo1115a();
        }
        this.f823d.mo1135k();
        this.f823d.mo1133i();
        this.f823d.mo1131g();
    }

    public void onStateNotSaved() {
        this.f823d.mo1135k();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f827h = true;
        mo1929i();
        this.f823d.mo1132h();
    }

    public void startActivityForResult(Intent intent, int i) {
        if (!this.f829j && i != -1) {
            m1124a(i);
        }
        super.startActivityForResult(intent, i);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!this.f829j && i != -1) {
            m1124a(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (!this.f828i && i != -1) {
            m1124a(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!this.f828i && i != -1) {
            m1124a(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
