package com.facebook.react.modules.i18nmanager;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import java.util.Locale;
import p000a.p005b.p009c.p017f.C0098c;

/* renamed from: com.facebook.react.modules.i18nmanager.a */
public class C1489a {

    /* renamed from: a */
    private static C1489a f4595a;

    private C1489a() {
    }

    /* renamed from: a */
    public static C1489a m5938a() {
        if (f4595a == null) {
            f4595a = new C1489a();
        }
        return f4595a;
    }

    /* renamed from: a */
    private boolean m5939a(Context context, String str, boolean z) {
        return context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean(str, z);
    }

    /* renamed from: b */
    private void m5940b(Context context, String str, boolean z) {
        Editor edit = context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    /* renamed from: b */
    private boolean m5941b() {
        return C0098c.m315a(Locale.getDefault()) == 1;
    }

    /* renamed from: c */
    private boolean m5942c(Context context) {
        return m5939a(context, "RCTI18nUtil_allowRTL", true);
    }

    /* renamed from: d */
    private boolean m5943d(Context context) {
        return m5939a(context, "RCTI18nUtil_forceRTL", false);
    }

    /* renamed from: a */
    public void mo5391a(Context context, boolean z) {
        m5940b(context, "RCTI18nUtil_allowRTL", z);
    }

    /* renamed from: a */
    public boolean mo5392a(Context context) {
        return m5939a(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true);
    }

    /* renamed from: b */
    public void mo5393b(Context context, boolean z) {
        m5940b(context, "RCTI18nUtil_forceRTL", z);
    }

    /* renamed from: b */
    public boolean mo5394b(Context context) {
        boolean z = true;
        if (m5943d(context)) {
            return true;
        }
        if (!m5942c(context) || !m5941b()) {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    public void mo5395c(Context context, boolean z) {
        m5940b(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", z);
    }
}
