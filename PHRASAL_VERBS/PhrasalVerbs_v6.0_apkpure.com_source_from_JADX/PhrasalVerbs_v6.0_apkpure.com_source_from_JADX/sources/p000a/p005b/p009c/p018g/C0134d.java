package p000a.p005b.p009c.p018g;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import p000a.p005b.p009c.p018g.p019a.C0123a;
import p000a.p005b.p009c.p018g.p019a.C0126b;

/* renamed from: a.b.c.g.d */
public class C0134d {

    /* renamed from: a */
    private static final AccessibilityDelegate f370a = new AccessibilityDelegate();

    /* renamed from: b */
    private final AccessibilityDelegate f371b = new C0135a(this);

    /* renamed from: a.b.c.g.d$a */
    private static final class C0135a extends AccessibilityDelegate {

        /* renamed from: a */
        private final C0134d f372a;

        C0135a(C0134d dVar) {
            this.f372a = dVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f372a.mo476a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C0126b a = this.f372a.mo473a(view);
            if (a != null) {
                return (AccessibilityNodeProvider) a.mo466a();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f372a.mo378b(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            this.f372a.mo376a(view, C0123a.m404a(accessibilityNodeInfo));
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f372a.mo478c(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f372a.mo477a(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f372a.mo377a(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.f372a.mo475a(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f372a.mo479d(view, accessibilityEvent);
        }
    }

    /* renamed from: a */
    public C0126b mo473a(View view) {
        if (VERSION.SDK_INT >= 16) {
            AccessibilityNodeProvider accessibilityNodeProvider = f370a.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return new C0126b(accessibilityNodeProvider);
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public AccessibilityDelegate mo474a() {
        return this.f371b;
    }

    /* renamed from: a */
    public void mo475a(View view, int i) {
        f370a.sendAccessibilityEvent(view, i);
    }

    /* renamed from: a */
    public void mo376a(View view, C0123a aVar) {
        f370a.onInitializeAccessibilityNodeInfo(view, aVar.mo464t());
    }

    /* renamed from: a */
    public boolean mo377a(View view, int i, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            return f370a.performAccessibilityAction(view, i, bundle);
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo476a(View view, AccessibilityEvent accessibilityEvent) {
        return f370a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public boolean mo477a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f370a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: b */
    public void mo378b(View view, AccessibilityEvent accessibilityEvent) {
        f370a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: c */
    public void mo478c(View view, AccessibilityEvent accessibilityEvent) {
        f370a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo479d(View view, AccessibilityEvent accessibilityEvent) {
        f370a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
