package p000a.p005b.p009c.p018g.p019a;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: a.b.c.g.a.c */
public class C0127c {
    /* renamed from: a */
    public static void m452a(AccessibilityRecord accessibilityRecord, int i) {
        if (VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollX(i);
        }
    }

    /* renamed from: b */
    public static void m453b(AccessibilityRecord accessibilityRecord, int i) {
        if (VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }
}
