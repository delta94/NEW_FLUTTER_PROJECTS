package p000a.p005b.p021d.p023b.p024a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p030v7.widget.C0600o;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
import p000a.p005b.p009c.p010a.C0039a;
import p000a.p005b.p009c.p010a.p011a.C0040a;

/* renamed from: a.b.d.b.a.a */
public final class C0173a {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f406a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<C0174a>> f407b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f408c = new Object();

    /* renamed from: a.b.d.b.a.a$a */
    private static class C0174a {

        /* renamed from: a */
        final ColorStateList f409a;

        /* renamed from: b */
        final Configuration f410b;

        C0174a(ColorStateList colorStateList, Configuration configuration) {
            this.f409a = colorStateList;
            this.f410b = configuration;
        }
    }

    /* renamed from: a */
    public static ColorStateList m594a(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList c = m598c(context, i);
        if (c != null) {
            return c;
        }
        ColorStateList d = m599d(context, i);
        if (d == null) {
            return C0039a.m109b(context, i);
        }
        m596a(context, i, d);
        return d;
    }

    /* renamed from: a */
    private static TypedValue m595a() {
        TypedValue typedValue = (TypedValue) f406a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f406a.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: a */
    private static void m596a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f408c) {
            SparseArray sparseArray = (SparseArray) f407b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                f407b.put(context, sparseArray);
            }
            sparseArray.append(i, new C0174a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* renamed from: b */
    public static Drawable m597b(Context context, int i) {
        return C0600o.m2852a().mo3142a(context, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        return null;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m598c(android.content.Context r4, int r5) {
        /*
            java.lang.Object r0 = f408c
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<a.b.d.b.a.a$a>> r1 = f407b     // Catch:{ all -> 0x0035 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0035 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0032
            int r2 = r1.size()     // Catch:{ all -> 0x0035 }
            if (r2 <= 0) goto L_0x0032
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0035 }
            a.b.d.b.a.a$a r2 = (p000a.p005b.p021d.p023b.p024a.C0173a.C0174a) r2     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0032
            android.content.res.Configuration r3 = r2.f410b     // Catch:{ all -> 0x0035 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0035 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0035 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x002f
            android.content.res.ColorStateList r4 = r2.f409a     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r4
        L_0x002f:
            r1.remove(r5)     // Catch:{ all -> 0x0035 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            r4 = 0
            return r4
        L_0x0035:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p021d.p023b.p024a.C0173a.m598c(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* renamed from: d */
    private static ColorStateList m599d(Context context, int i) {
        if (m600e(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C0040a.m113a(resources, resources.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* renamed from: e */
    private static boolean m600e(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue a = m595a();
        resources.getValue(i, a, true);
        int i2 = a.type;
        return i2 >= 28 && i2 <= 31;
    }
}
