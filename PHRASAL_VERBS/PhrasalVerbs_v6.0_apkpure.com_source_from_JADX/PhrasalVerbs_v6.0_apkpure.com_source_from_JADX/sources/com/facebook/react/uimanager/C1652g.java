package com.facebook.react.uimanager;

import android.view.View;
import android.view.View.AccessibilityDelegate;

/* renamed from: com.facebook.react.uimanager.g */
class C1652g {

    /* renamed from: a */
    private static final AccessibilityDelegate f4936a = new C1626d();

    /* renamed from: b */
    private static final AccessibilityDelegate f4937b = new C1631e();

    /* renamed from: c */
    private static final AccessibilityDelegate f4938c = new C1650f();

    /* renamed from: a */
    public static void m6464a(View view, int i) {
        view.sendAccessibilityEvent(i);
    }

    /* renamed from: a */
    public static void m6465a(View view, String str) {
        AccessibilityDelegate accessibilityDelegate;
        if (str == null) {
            view.setAccessibilityDelegate(null);
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1377687758) {
            if (hashCode != -1320494052) {
                if (hashCode == -714126251 && str.equals("radiobutton_checked")) {
                    c = 1;
                }
            } else if (str.equals("radiobutton_unchecked")) {
                c = 2;
            }
        } else if (str.equals("button")) {
            c = 0;
        }
        if (c == 0) {
            accessibilityDelegate = f4936a;
        } else if (c == 1) {
            accessibilityDelegate = f4937b;
        } else if (c != 2) {
            view.setAccessibilityDelegate(null);
        } else {
            accessibilityDelegate = f4938c;
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }
}
