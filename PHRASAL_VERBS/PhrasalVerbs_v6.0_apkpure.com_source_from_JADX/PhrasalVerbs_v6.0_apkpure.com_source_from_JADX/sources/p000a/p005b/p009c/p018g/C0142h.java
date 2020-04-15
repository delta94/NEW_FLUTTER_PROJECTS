package p000a.p005b.p009c.p018g;

import android.os.Build.VERSION;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import java.lang.reflect.Field;

/* renamed from: a.b.c.g.h */
public final class C0142h {

    /* renamed from: a */
    private static Field f380a;

    /* renamed from: b */
    private static boolean f381b;

    /* renamed from: a */
    public static void m483a(LayoutInflater layoutInflater, Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (VERSION.SDK_INT < 21) {
            Factory factory = layoutInflater.getFactory();
            if (factory instanceof Factory2) {
                m484b(layoutInflater, (Factory2) factory);
            } else {
                m484b(layoutInflater, factory2);
            }
        }
    }

    /* renamed from: b */
    private static void m484b(LayoutInflater layoutInflater, Factory2 factory2) {
        String str = "; inflation may have unexpected results.";
        String str2 = "LayoutInflaterCompatHC";
        if (!f381b) {
            try {
                f380a = LayoutInflater.class.getDeclaredField("mFactory2");
                f380a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("forceSetFactory2 Could not find field 'mFactory2' on class ");
                sb.append(LayoutInflater.class.getName());
                sb.append(str);
                Log.e(str2, sb.toString(), e);
            }
            f381b = true;
        }
        Field field = f380a;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("forceSetFactory2 could not set the Factory2 on LayoutInflater ");
                sb2.append(layoutInflater);
                sb2.append(str);
                Log.e(str2, sb2.toString(), e2);
            }
        }
    }
}
