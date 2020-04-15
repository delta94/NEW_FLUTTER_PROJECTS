package p000a.p005b.p009c.p010a.p011a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p005b.p006a.C0016c;

/* renamed from: a.b.c.a.a.d */
final class C0047d {

    /* renamed from: a.b.c.a.a.d$a */
    static final class C0048a {

        /* renamed from: a */
        final int[] f136a;

        /* renamed from: b */
        final float[] f137b;

        C0048a(int i, int i2) {
            this.f136a = new int[]{i, i2};
            this.f137b = new float[]{0.0f, 1.0f};
        }

        C0048a(int i, int i2, int i3) {
            this.f136a = new int[]{i, i2, i3};
            this.f137b = new float[]{0.0f, 0.5f, 1.0f};
        }

        C0048a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f136a = new int[size];
            this.f137b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f136a[i] = ((Integer) list.get(i)).intValue();
                this.f137b[i] = ((Float) list2.get(i)).floatValue();
            }
        }
    }

    /* renamed from: a */
    private static C0048a m147a(C0048a aVar, int i, int i2, boolean z, int i3) {
        return aVar != null ? aVar : z ? new C0048a(i, i3, i2) : new C0048a(i, i2);
    }

    /* renamed from: a */
    private static TileMode m148a(int i) {
        return i != 1 ? i != 2 ? TileMode.CLAMP : TileMode.MIRROR : TileMode.REPEAT;
    }

    /* renamed from: a */
    static Shader m149a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            Theme theme2 = theme;
            TypedArray a = C0054i.m165a(resources, theme2, attributeSet, C0016c.GradientColor);
            float a2 = C0054i.m162a(a, xmlPullParser2, "startX", C0016c.GradientColor_android_startX, 0.0f);
            float a3 = C0054i.m162a(a, xmlPullParser2, "startY", C0016c.GradientColor_android_startY, 0.0f);
            float a4 = C0054i.m162a(a, xmlPullParser2, "endX", C0016c.GradientColor_android_endX, 0.0f);
            float a5 = C0054i.m162a(a, xmlPullParser2, "endY", C0016c.GradientColor_android_endY, 0.0f);
            float a6 = C0054i.m162a(a, xmlPullParser2, "centerX", C0016c.GradientColor_android_centerX, 0.0f);
            float a7 = C0054i.m162a(a, xmlPullParser2, "centerY", C0016c.GradientColor_android_centerY, 0.0f);
            int b = C0054i.m169b(a, xmlPullParser2, "type", C0016c.GradientColor_android_type, 0);
            int a8 = C0054i.m163a(a, xmlPullParser2, "startColor", C0016c.GradientColor_android_startColor, 0);
            String str = "centerColor";
            boolean a9 = C0054i.m168a(xmlPullParser2, str);
            int a10 = C0054i.m163a(a, xmlPullParser2, str, C0016c.GradientColor_android_centerColor, 0);
            int a11 = C0054i.m163a(a, xmlPullParser2, "endColor", C0016c.GradientColor_android_endColor, 0);
            int b2 = C0054i.m169b(a, xmlPullParser2, "tileMode", C0016c.GradientColor_android_tileMode, 0);
            float f = a6;
            float a12 = C0054i.m162a(a, xmlPullParser2, "gradientRadius", C0016c.GradientColor_android_gradientRadius, 0.0f);
            a.recycle();
            C0048a a13 = m147a(m150b(resources, xmlPullParser, attributeSet, theme), a8, a11, a9, a10);
            if (b == 1) {
                float f2 = f;
                if (a12 > 0.0f) {
                    int[] iArr = a13.f136a;
                    RadialGradient radialGradient = new RadialGradient(f2, a7, a12, iArr, a13.f137b, m148a(b2));
                    return radialGradient;
                }
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            } else if (b != 2) {
                LinearGradient linearGradient = new LinearGradient(a2, a3, a4, a5, a13.f136a, a13.f137b, m148a(b2));
                return linearGradient;
            } else {
                return new SweepGradient(f, a7, a13.f136a, a13.f137b);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(xmlPullParser.getPositionDescription());
            sb.append(": invalid gradient color tag ");
            sb.append(name);
            throw new XmlPullParserException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0089, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.toString());
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p000a.p005b.p009c.p010a.p011a.C0047d.C0048a m150b(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L_0x0012:
            int r3 = r9.next()
            if (r3 == r1) goto L_0x008a
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L_0x0021
            r6 = 3
            if (r3 == r6) goto L_0x008a
        L_0x0021:
            r6 = 2
            if (r3 == r6) goto L_0x0025
            goto L_0x0012
        L_0x0025:
            if (r5 > r0) goto L_0x0012
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0034
            goto L_0x0012
        L_0x0034:
            int[] r3 = p000a.p005b.p006a.C0016c.GradientColorItem
            android.content.res.TypedArray r3 = p000a.p005b.p009c.p010a.p011a.C0054i.m165a(r8, r11, r10, r3)
            int r5 = p000a.p005b.p006a.C0016c.GradientColorItem_android_color
            boolean r5 = r3.hasValue(r5)
            int r6 = p000a.p005b.p006a.C0016c.GradientColorItem_android_offset
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L_0x006a
            if (r6 == 0) goto L_0x006a
            int r5 = p000a.p005b.p006a.C0016c.GradientColorItem_android_color
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = p000a.p005b.p006a.C0016c.GradientColorItem_android_offset
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L_0x0012
        L_0x006a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' "
            r10.append(r9)
            java.lang.String r9 = "attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L_0x008a:
            int r8 = r4.size()
            if (r8 <= 0) goto L_0x0096
            a.b.c.a.a.d$a r8 = new a.b.c.a.a.d$a
            r8.<init>(r4, r2)
            return r8
        L_0x0096:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p009c.p010a.p011a.C0047d.m150b(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):a.b.c.a.a.d$a");
    }
}
