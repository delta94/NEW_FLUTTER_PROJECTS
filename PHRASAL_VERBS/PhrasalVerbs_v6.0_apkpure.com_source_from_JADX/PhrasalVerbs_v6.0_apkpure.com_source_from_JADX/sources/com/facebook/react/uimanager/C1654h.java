package com.facebook.react.uimanager;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.react.bridge.WritableNativeMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import p032c.p033a.p094k.p095a.C1136a;

/* renamed from: com.facebook.react.uimanager.h */
public class C1654h {

    /* renamed from: a */
    private static DisplayMetrics f4940a;

    /* renamed from: b */
    private static DisplayMetrics f4941b;

    /* renamed from: a */
    public static DisplayMetrics m6466a() {
        return f4941b;
    }

    /* renamed from: a */
    public static Map<String, Map<String, Object>> m6467a(double d) {
        C1136a.m5054a(Boolean.valueOf((f4940a == null && f4941b == null) ? false : true), "DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
        HashMap hashMap = new HashMap();
        hashMap.put("windowPhysicalPixels", m6468a(f4940a, d));
        hashMap.put("screenPhysicalPixels", m6468a(f4941b, d));
        return hashMap;
    }

    /* renamed from: a */
    private static Map<String, Object> m6468a(DisplayMetrics displayMetrics, double d) {
        HashMap hashMap = new HashMap();
        hashMap.put("width", Integer.valueOf(displayMetrics.widthPixels));
        hashMap.put("height", Integer.valueOf(displayMetrics.heightPixels));
        hashMap.put("scale", Float.valueOf(displayMetrics.density));
        hashMap.put("fontScale", Double.valueOf(d));
        hashMap.put("densityDpi", Integer.valueOf(displayMetrics.densityDpi));
        return hashMap;
    }

    /* renamed from: a */
    public static void m6469a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        m6475b(displayMetrics);
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        displayMetrics2.setTo(displayMetrics);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        C1136a.m5054a(windowManager, "WindowManager is null!");
        Display defaultDisplay = windowManager.getDefaultDisplay();
        if (VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealMetrics(displayMetrics2);
        } else {
            try {
                Method method = Display.class.getMethod("getRawHeight", new Class[0]);
                displayMetrics2.widthPixels = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                displayMetrics2.heightPixels = ((Integer) method.invoke(defaultDisplay, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                throw new RuntimeException("Error getting real dimensions for API level < 17", e);
            }
        }
        m6470a(displayMetrics2);
    }

    /* renamed from: a */
    public static void m6470a(DisplayMetrics displayMetrics) {
        f4941b = displayMetrics;
    }

    @Deprecated
    /* renamed from: b */
    public static DisplayMetrics m6471b() {
        return f4940a;
    }

    /* renamed from: b */
    public static WritableNativeMap m6472b(double d) {
        C1136a.m5054a(Boolean.valueOf((f4940a == null && f4941b == null) ? false : true), "DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap("windowPhysicalPixels", m6473b(f4940a, d));
        writableNativeMap.putMap("screenPhysicalPixels", m6473b(f4941b, d));
        return writableNativeMap;
    }

    /* renamed from: b */
    private static WritableNativeMap m6473b(DisplayMetrics displayMetrics, double d) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("width", displayMetrics.widthPixels);
        writableNativeMap.putInt("height", displayMetrics.heightPixels);
        writableNativeMap.putDouble("scale", (double) displayMetrics.density);
        writableNativeMap.putDouble("fontScale", d);
        writableNativeMap.putDouble("densityDpi", (double) displayMetrics.densityDpi);
        return writableNativeMap;
    }

    /* renamed from: b */
    public static void m6474b(Context context) {
        if (m6466a() == null) {
            m6469a(context);
        }
    }

    /* renamed from: b */
    public static void m6475b(DisplayMetrics displayMetrics) {
        f4940a = displayMetrics;
    }
}
