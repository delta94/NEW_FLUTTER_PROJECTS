package android.arch.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.arch.lifecycle.C0211d.C0212a;
import android.os.Bundle;

/* renamed from: android.arch.lifecycle.p */
public class C0226p extends Fragment {

    /* renamed from: a */
    private C0227a f602a;

    /* renamed from: android.arch.lifecycle.p$a */
    interface C0227a {
        /* renamed from: a */
        void mo830a();

        /* renamed from: b */
        void mo831b();

        void onCreate();
    }

    /* renamed from: a */
    public static void m836a(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        String str = "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag";
        if (fragmentManager.findFragmentByTag(str) == null) {
            fragmentManager.beginTransaction().add(new C0226p(), str).commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: a */
    private void m837a(C0212a aVar) {
        Activity activity = getActivity();
        if (activity instanceof C0219i) {
            ((C0219i) activity).mo817a().mo819b(aVar);
            return;
        }
        if (activity instanceof C0215f) {
            C0211d a = ((C0215f) activity).mo817a();
            if (a instanceof C0217h) {
                ((C0217h) a).mo819b(aVar);
            }
        }
    }

    /* renamed from: a */
    private void m838a(C0227a aVar) {
        if (aVar != null) {
            aVar.onCreate();
        }
    }

    /* renamed from: b */
    private void m839b(C0227a aVar) {
        if (aVar != null) {
            aVar.mo830a();
        }
    }

    /* renamed from: c */
    private void m840c(C0227a aVar) {
        if (aVar != null) {
            aVar.mo831b();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m838a(this.f602a);
        m837a(C0212a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        m837a(C0212a.ON_DESTROY);
        this.f602a = null;
    }

    public void onPause() {
        super.onPause();
        m837a(C0212a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        m839b(this.f602a);
        m837a(C0212a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        m840c(this.f602a);
        m837a(C0212a.ON_START);
    }

    public void onStop() {
        super.onStop();
        m837a(C0212a.ON_STOP);
    }
}
