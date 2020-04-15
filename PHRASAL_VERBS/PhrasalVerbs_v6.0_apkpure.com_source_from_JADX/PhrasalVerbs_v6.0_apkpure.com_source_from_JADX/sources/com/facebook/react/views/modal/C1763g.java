package com.facebook.react.views.modal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C1574J;
import com.facebook.react.uimanager.C1687l;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.C1638f;
import com.facebook.react.views.view.C1886h;
import java.util.ArrayList;
import p032c.p033a.p094k.p095a.C1136a;
import p032c.p033a.p098m.C1228o;
import p032c.p033a.p098m.p112j.p113a.C1218a;

/* renamed from: com.facebook.react.views.modal.g */
public class C1763g extends ViewGroup implements LifecycleEventListener {

    /* renamed from: a */
    private C1764a f5199a;

    /* renamed from: b */
    private Dialog f5200b;

    /* renamed from: c */
    private boolean f5201c;

    /* renamed from: d */
    private String f5202d;

    /* renamed from: e */
    private boolean f5203e;

    /* renamed from: f */
    private boolean f5204f;

    /* renamed from: g */
    private OnShowListener f5205g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C1765b f5206h;

    /* renamed from: com.facebook.react.views.modal.g$a */
    static class C1764a extends C1886h implements C1574J {

        /* renamed from: s */
        private final C1687l f5207s = new C1687l(this);

        public C1764a(Context context) {
            super(context);
        }

        /* renamed from: e */
        private C1638f m6775e() {
            return ((UIManagerModule) m6776f().getNativeModule(UIManagerModule.class)).getEventDispatcher();
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public ReactContext m6776f() {
            return (ReactContext) getContext();
        }

        /* renamed from: a */
        public void mo4473a(MotionEvent motionEvent) {
            this.f5207s.mo5947b(motionEvent, m6775e());
        }

        /* renamed from: a */
        public void mo4477a(Throwable th) {
            m6776f().handleException(new RuntimeException(th));
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            this.f5207s.mo5946a(motionEvent, m6775e());
            return super.onInterceptTouchEvent(motionEvent);
        }

        /* access modifiers changed from: protected */
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            if (getChildCount() > 0) {
                int id = getChildAt(0).getId();
                ReactContext f = m6776f();
                C1762f fVar = new C1762f(this, f, id, i, i2);
                f.runOnNativeModulesQueueThread(fVar);
            }
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            this.f5207s.mo5946a(motionEvent, m6775e());
            super.onTouchEvent(motionEvent);
            return true;
        }

        public void requestDisallowInterceptTouchEvent(boolean z) {
        }
    }

    /* renamed from: com.facebook.react.views.modal.g$b */
    public interface C1765b {
        /* renamed from: a */
        void mo6117a(DialogInterface dialogInterface);
    }

    public C1763g(Context context) {
        super(context);
        ((ReactContext) context).addLifecycleEventListener(this);
        this.f5199a = new C1764a(context);
    }

    /* renamed from: c */
    private void m6770c() {
        Dialog dialog = this.f5200b;
        if (dialog != null) {
            if (dialog.isShowing()) {
                Activity activity = (Activity) C1218a.m5219a(this.f5200b.getContext(), Activity.class);
                if (activity == null || !activity.isFinishing()) {
                    this.f5200b.dismiss();
                }
            }
            this.f5200b = null;
            ((ViewGroup) this.f5199a.getParent()).removeViewAt(0);
        }
    }

    /* renamed from: d */
    private void m6771d() {
        C1136a.m5054a(this.f5200b, "mDialog must exist when we call updateProperties");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            if ((currentActivity.getWindow().getAttributes().flags & 1024) != 0) {
                this.f5200b.getWindow().addFlags(1024);
            } else {
                this.f5200b.getWindow().clearFlags(1024);
            }
        }
        if (this.f5201c) {
            this.f5200b.getWindow().clearFlags(2);
            return;
        }
        this.f5200b.getWindow().setDimAmount(0.5f);
        this.f5200b.getWindow().setFlags(2, 2);
    }

    private View getContentView() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(this.f5199a);
        frameLayout.setFitsSystemWindows(true);
        return frameLayout;
    }

    private Activity getCurrentActivity() {
        return ((ReactContext) getContext()).getCurrentActivity();
    }

    /* renamed from: a */
    public void mo6120a() {
        ((ReactContext) getContext()).removeLifecycleEventListener(this);
        m6770c();
    }

    public void addChildrenForAccessibility(ArrayList<View> arrayList) {
    }

    public void addView(View view, int i) {
        this.f5199a.addView(view, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6123b() {
        if (this.f5200b != null) {
            if (this.f5204f) {
                m6770c();
            } else {
                m6771d();
                return;
            }
        }
        this.f5204f = false;
        int i = C1228o.Theme_FullScreenDialog;
        if (this.f5202d.equals("fade")) {
            i = C1228o.Theme_FullScreenDialogAnimatedFade;
        } else if (this.f5202d.equals("slide")) {
            i = C1228o.Theme_FullScreenDialogAnimatedSlide;
        }
        Activity currentActivity = getCurrentActivity();
        this.f5200b = new Dialog(currentActivity == 0 ? getContext() : currentActivity, i);
        this.f5200b.setContentView(getContentView());
        m6771d();
        this.f5200b.setOnShowListener(this.f5205g);
        this.f5200b.setOnKeyListener(new C1761e(this));
        this.f5200b.getWindow().setSoftInputMode(16);
        if (this.f5203e) {
            this.f5200b.getWindow().addFlags(16777216);
        }
        if (currentActivity != 0 && !currentActivity.isFinishing()) {
            this.f5200b.show();
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @TargetApi(23)
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        this.f5199a.dispatchProvideStructure(viewStructure);
    }

    public View getChildAt(int i) {
        return this.f5199a.getChildAt(i);
    }

    public int getChildCount() {
        return this.f5199a.getChildCount();
    }

    public Dialog getDialog() {
        return this.f5200b;
    }

    public void onHostDestroy() {
        mo6120a();
    }

    public void onHostPause() {
    }

    public void onHostResume() {
        mo6123b();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void removeView(View view) {
        this.f5199a.removeView(view);
    }

    public void removeViewAt(int i) {
        this.f5199a.removeView(getChildAt(i));
    }

    /* access modifiers changed from: protected */
    public void setAnimationType(String str) {
        this.f5202d = str;
        this.f5204f = true;
    }

    /* access modifiers changed from: protected */
    public void setHardwareAccelerated(boolean z) {
        this.f5203e = z;
        this.f5204f = true;
    }

    /* access modifiers changed from: protected */
    public void setOnRequestCloseListener(C1765b bVar) {
        this.f5206h = bVar;
    }

    /* access modifiers changed from: protected */
    public void setOnShowListener(OnShowListener onShowListener) {
        this.f5205g = onShowListener;
    }

    /* access modifiers changed from: protected */
    public void setTransparent(boolean z) {
        this.f5201c = z;
    }
}
