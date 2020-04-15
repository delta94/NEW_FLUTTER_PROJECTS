package com.facebook.react.views.text;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.LruCache;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C1571G;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.react.views.text.A */
public class C1805A {

    /* renamed from: a */
    private static final TextPaint f5344a = new TextPaint(1);

    /* renamed from: b */
    private static final Object f5345b = new Object();

    /* renamed from: c */
    private static LruCache<String, Spannable> f5346c = new LruCache<>(100);

    /* renamed from: com.facebook.react.views.text.A$a */
    public static class C1806a {

        /* renamed from: a */
        protected int f5347a;

        /* renamed from: b */
        protected int f5348b;

        /* renamed from: c */
        protected C1825m f5349c;

        C1806a(int i, int i2, C1825m mVar) {
            this.f5347a = i;
            this.f5348b = i2;
            this.f5349c = mVar;
        }

        /* renamed from: a */
        public void mo6348a(SpannableStringBuilder spannableStringBuilder, int i) {
            spannableStringBuilder.setSpan(this.f5349c, this.f5347a, this.f5348b, ((i << 16) & 16711680) | ((this.f5347a == 0 ? 18 : 34) & -16711681));
        }
    }

    /* JADX WARNING: type inference failed for: r9v22, types: [android.text.BoringLayout] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bc A[ADDED_TO_REGION] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m6903a(com.facebook.react.bridge.ReactContext r9, com.facebook.react.bridge.ReadableNativeMap r10, com.facebook.react.bridge.ReadableNativeMap r11, float r12, com.facebook.yoga.YogaMeasureMode r13, float r14, com.facebook.yoga.YogaMeasureMode r15) {
        /*
            android.text.TextPaint r2 = f5344a
            android.text.Spannable r1 = m6904a(r9, r10)
            if (r1 == 0) goto L_0x00dc
            android.text.BoringLayout$Metrics r6 = android.text.BoringLayout.isBoring(r1, r2)
            if (r6 != 0) goto L_0x0013
            float r9 = android.text.Layout.getDesiredWidth(r1, r2)
            goto L_0x0015
        L_0x0013:
            r9 = 2143289344(0x7fc00000, float:NaN)
        L_0x0015:
            com.facebook.yoga.YogaMeasureMode r10 = com.facebook.yoga.YogaMeasureMode.UNDEFINED
            r14 = 0
            r15 = 0
            r8 = 1
            if (r13 == r10) goto L_0x0023
            int r10 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r10 >= 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r10 = 0
            goto L_0x0024
        L_0x0023:
            r10 = 1
        L_0x0024:
            r13 = 1065353216(0x3f800000, float:1.0)
            r0 = 23
            if (r6 != 0) goto L_0x0056
            if (r10 != 0) goto L_0x0036
            boolean r3 = com.facebook.yoga.C1943a.m7432a(r9)
            if (r3 != 0) goto L_0x0056
            int r3 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r3 > 0) goto L_0x0056
        L_0x0036:
            double r9 = (double) r9
            double r9 = java.lang.Math.ceil(r9)
            int r3 = (int) r9
            int r9 = android.os.Build.VERSION.SDK_INT
            if (r9 >= r0) goto L_0x004d
            android.text.StaticLayout r9 = new android.text.StaticLayout
            android.text.Layout$Alignment r4 = android.text.Layout.Alignment.ALIGN_NORMAL
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            r7 = 1
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x00a6
        L_0x004d:
            int r9 = r1.length()
            android.text.StaticLayout$Builder r9 = android.text.StaticLayout.Builder.obtain(r1, r14, r9, r2, r3)
            goto L_0x008c
        L_0x0056:
            if (r6 == 0) goto L_0x0071
            if (r10 != 0) goto L_0x0061
            int r9 = r6.width
            float r9 = (float) r9
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 > 0) goto L_0x0071
        L_0x0061:
            int r9 = r6.width
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            r7 = 1
            r0 = r1
            r1 = r2
            r2 = r9
            android.text.BoringLayout r9 = android.text.BoringLayout.make(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x00a6
        L_0x0071:
            int r9 = android.os.Build.VERSION.SDK_INT
            if (r9 >= r0) goto L_0x0083
            android.text.StaticLayout r9 = new android.text.StaticLayout
            int r3 = (int) r12
            android.text.Layout$Alignment r4 = android.text.Layout.Alignment.ALIGN_NORMAL
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            r7 = 1
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x00a6
        L_0x0083:
            int r9 = r1.length()
            int r10 = (int) r12
            android.text.StaticLayout$Builder r9 = android.text.StaticLayout.Builder.obtain(r1, r14, r9, r2, r10)
        L_0x008c:
            android.text.Layout$Alignment r10 = android.text.Layout.Alignment.ALIGN_NORMAL
            android.text.StaticLayout$Builder r9 = r9.setAlignment(r10)
            android.text.StaticLayout$Builder r9 = r9.setLineSpacing(r15, r13)
            android.text.StaticLayout$Builder r9 = r9.setIncludePad(r8)
            android.text.StaticLayout$Builder r9 = r9.setBreakStrategy(r8)
            android.text.StaticLayout$Builder r9 = r9.setHyphenationFrequency(r8)
            android.text.StaticLayout r9 = r9.build()
        L_0x00a6:
            java.lang.String r10 = "maximumNumberOfLines"
            boolean r12 = r11.hasKey(r10)
            r13 = -1
            if (r12 == 0) goto L_0x00b4
            int r10 = r11.getInt(r10)
            goto L_0x00b5
        L_0x00b4:
            r10 = -1
        L_0x00b5:
            int r11 = r9.getWidth()
            float r11 = (float) r11
            if (r10 == r13) goto L_0x00ca
            if (r10 == 0) goto L_0x00ca
            int r12 = r9.getLineCount()
            if (r10 >= r12) goto L_0x00ca
            int r10 = r10 - r8
            int r9 = r9.getLineBottom(r10)
            goto L_0x00ce
        L_0x00ca:
            int r9 = r9.getHeight()
        L_0x00ce:
            float r9 = (float) r9
            float r10 = com.facebook.react.uimanager.C1726w.m6670d(r11)
            float r9 = com.facebook.react.uimanager.C1726w.m6670d(r9)
            long r9 = com.facebook.yoga.C1944b.m7433a(r10, r9)
            return r9
        L_0x00dc:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Spannable element has not been prepared in onBeforeLayout"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.C1805A.m6903a(com.facebook.react.bridge.ReactContext, com.facebook.react.bridge.ReadableNativeMap, com.facebook.react.bridge.ReadableNativeMap, float, com.facebook.yoga.YogaMeasureMode, float, com.facebook.yoga.YogaMeasureMode):long");
    }

    /* renamed from: a */
    protected static Spannable m6904a(Context context, ReadableMap readableMap) {
        String obj = readableMap.toString();
        synchronized (f5345b) {
            Spannable spannable = (Spannable) f5346c.get(obj);
            if (spannable != null) {
                return spannable;
            }
            Spannable b = m6906b(context, readableMap);
            synchronized (f5345b) {
                f5346c.put(obj, b);
            }
            return b;
        }
    }

    /* renamed from: a */
    private static void m6905a(Context context, ReadableArray readableArray, SpannableStringBuilder spannableStringBuilder, List<C1806a> list) {
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            ReadableMap map = readableArray.getMap(i);
            int length = spannableStringBuilder.length();
            C1836x xVar = new C1836x(new C1571G(map.getMap("textAttributes")));
            spannableStringBuilder.append(C1808C.m6909a(map.getString("string"), xVar.f5458p));
            int length2 = spannableStringBuilder.length();
            if (length2 >= length) {
                if (xVar.f5445c) {
                    list.add(new C1806a(length, length2, new C1823k(xVar.f5447e)));
                }
                if (xVar.f5448f) {
                    list.add(new C1806a(length, length2, new C1817g(xVar.f5449g)));
                }
                if (VERSION.SDK_INT >= 21 && !Float.isNaN(xVar.f5444b)) {
                    list.add(new C1806a(length, length2, new C1809a(xVar.f5444b)));
                }
                list.add(new C1806a(length, length2, new C1814f(xVar.f5451i)));
                if (!(xVar.f5466x == -1 && xVar.f5467y == -1 && xVar.f5468z == null)) {
                    list.add(new C1806a(length, length2, new C1811c(xVar.f5466x, xVar.f5467y, xVar.f5468z, context.getAssets())));
                }
                if (xVar.f5463u) {
                    list.add(new C1806a(length, length2, new C1833u()));
                }
                if (xVar.f5464v) {
                    list.add(new C1806a(length, length2, new C1826n()));
                }
                if (!(xVar.f5459q == 0.0f && xVar.f5460r == 0.0f)) {
                    list.add(new C1806a(length, length2, new C1835w(xVar.f5459q, xVar.f5460r, xVar.f5461s, xVar.f5462t)));
                }
                if (!Float.isNaN(xVar.mo6448b())) {
                    list.add(new C1806a(length, length2, new C1810b(xVar.mo6448b())));
                }
                list.add(new C1806a(length, length2, new C1827o(map.getInt("reactTag"))));
            }
        }
    }

    /* renamed from: b */
    private static Spannable m6906b(Context context, ReadableMap readableMap) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList<C1806a> arrayList = new ArrayList<>();
        m6905a(context, readableMap.getArray("fragments"), spannableStringBuilder, arrayList);
        int i = 0;
        for (C1806a a : arrayList) {
            a.mo6348a(spannableStringBuilder, i);
            i++;
        }
        return spannableStringBuilder;
    }
}
