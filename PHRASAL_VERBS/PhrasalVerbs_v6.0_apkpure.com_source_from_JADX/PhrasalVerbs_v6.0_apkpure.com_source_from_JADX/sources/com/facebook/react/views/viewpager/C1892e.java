package com.facebook.react.views.viewpager;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.C1638f;
import com.facebook.react.uimanager.events.C1643i;
import java.util.ArrayList;
import java.util.List;
import p000a.p005b.p009c.p018g.C0101C;
import p000a.p005b.p009c.p018g.C0101C.C0107f;
import p000a.p005b.p009c.p018g.C0152r;
import p032c.p033a.p038c.p043e.C0727a;

/* renamed from: com.facebook.react.views.viewpager.e */
public class C1892e extends C0101C {
    /* access modifiers changed from: private */

    /* renamed from: la */
    public final C1638f f5651la;
    /* access modifiers changed from: private */

    /* renamed from: ma */
    public boolean f5652ma;

    /* renamed from: na */
    private boolean f5653na = true;

    /* renamed from: oa */
    private final Runnable f5654oa = new C1891d(this);

    /* renamed from: com.facebook.react.views.viewpager.e$a */
    private class C1893a extends C0152r {

        /* renamed from: c */
        private final List<View> f5655c;

        /* renamed from: d */
        private boolean f5656d;

        private C1893a() {
            this.f5655c = new ArrayList();
            this.f5656d = false;
        }

        /* synthetic */ C1893a(C1892e eVar, C1891d dVar) {
            this();
        }

        /* renamed from: a */
        public int mo536a() {
            return this.f5655c.size();
        }

        /* renamed from: a */
        public int mo537a(Object obj) {
            if (this.f5656d || !this.f5655c.contains(obj)) {
                return -2;
            }
            return this.f5655c.indexOf(obj);
        }

        /* renamed from: a */
        public Object mo538a(ViewGroup viewGroup, int i) {
            View view = (View) this.f5655c.get(i);
            viewGroup.addView(view, 0, C1892e.this.generateDefaultLayoutParams());
            return view;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo6746a(View view, int i) {
            this.f5655c.add(i, view);
            mo546b();
            C1892e.this.setOffscreenPageLimit(this.f5655c.size());
        }

        /* renamed from: a */
        public void mo544a(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo6747a(List<View> list) {
            this.f5655c.clear();
            this.f5655c.addAll(list);
            mo546b();
            this.f5656d = false;
        }

        /* renamed from: a */
        public boolean mo545a(View view, Object obj) {
            return view == obj;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public View mo6748b(int i) {
            return (View) this.f5655c.get(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo6749c(int i) {
            this.f5655c.remove(i);
            mo546b();
            C1892e.this.setOffscreenPageLimit(this.f5655c.size());
        }
    }

    /* renamed from: com.facebook.react.views.viewpager.e$b */
    private class C1894b implements C0107f {
        private C1894b() {
        }

        /* synthetic */ C1894b(C1892e eVar, C1891d dVar) {
            this();
        }

        /* renamed from: a */
        public void mo380a(int i) {
            String str;
            if (i == 0) {
                str = "idle";
            } else if (i == 1) {
                str = "dragging";
            } else if (i == 2) {
                str = "settling";
            } else {
                throw new IllegalStateException("Unsupported pageScrollState");
            }
            C1892e.this.f5651la.mo5886a((C1635c) new C1889b(C1892e.this.getId(), str));
        }

        /* renamed from: a */
        public void mo381a(int i, float f, int i2) {
            C1892e.this.f5651la.mo5886a((C1635c) new C1888a(C1892e.this.getId(), i, f));
        }

        /* renamed from: b */
        public void mo382b(int i) {
            if (!C1892e.this.f5652ma) {
                C1892e.this.f5651la.mo5886a((C1635c) new C1890c(C1892e.this.getId(), i));
            }
        }
    }

    public C1892e(ReactContext reactContext) {
        super(reactContext);
        this.f5651la = ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher();
        this.f5652ma = false;
        setOnPageChangeListener(new C1894b(this, null));
        setAdapter(new C1893a(this, null));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6739a(View view, int i) {
        getAdapter().mo6746a(view, i);
    }

    /* renamed from: b */
    public void mo6740b(int i, boolean z) {
        this.f5652ma = true;
        mo324a(i, z);
        this.f5652ma = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public View mo6741d(int i) {
        return getAdapter().mo6748b(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo6742e(int i) {
        getAdapter().mo6749c(i);
    }

    public C1893a getAdapter() {
        return (C1893a) super.getAdapter();
    }

    /* access modifiers changed from: 0000 */
    public int getViewCountInAdapter() {
        return getAdapter().mo536a();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestLayout();
        post(this.f5654oa);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f5653na) {
            return false;
        }
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                C1643i.m6445a(this, motionEvent);
                return true;
            }
        } catch (IllegalArgumentException e) {
            C0727a.m3276b("ReactNative", "Error intercepting touch event.", (Throwable) e);
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f5653na) {
            return false;
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            C0727a.m3276b("ReactNative", "Error handling touch event.", (Throwable) e);
            return false;
        }
    }

    public void setScrollEnabled(boolean z) {
        this.f5653na = z;
    }

    public void setViews(List<View> list) {
        getAdapter().mo6747a(list);
    }
}
