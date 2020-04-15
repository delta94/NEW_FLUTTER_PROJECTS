package com.facebook.react.uimanager;

import java.util.Arrays;
import java.util.HashSet;

/* renamed from: com.facebook.react.uimanager.ra */
public class C1718ra {

    /* renamed from: a */
    public static final int[] f5079a = {8, 4, 5, 1, 3, 0, 2};

    /* renamed from: b */
    public static final int[] f5080b = {8, 7, 6, 4, 5, 1, 3, 0, 2};

    /* renamed from: c */
    public static final int[] f5081c = {4, 5, 1, 3};

    /* renamed from: d */
    private static final HashSet<String> f5082d = new HashSet<>(Arrays.asList(new String[]{"alignSelf", "alignItems", "collapsable", "flex", "flexBasis", "flexDirection", "flexGrow", "flexShrink", "flexWrap", "justifyContent", "alignContent", "display", "position", "right", "top", "bottom", "left", "start", "end", "width", "height", "minWidth", "maxWidth", "minHeight", "maxHeight", "margin", "marginVertical", "marginHorizontal", "marginLeft", "marginRight", "marginTop", "marginBottom", "marginStart", "marginEnd", "padding", "paddingVertical", "paddingHorizontal", "paddingLeft", "paddingRight", "paddingTop", "paddingBottom", "paddingStart", "paddingEnd"}));

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m6611a(com.facebook.react.bridge.ReadableMap r18, java.lang.String r19) {
        /*
            r0 = r18
            r1 = r19
            java.util.HashSet<java.lang.String> r2 = f5082d
            boolean r2 = r2.contains(r1)
            r3 = 1
            if (r2 == 0) goto L_0x000e
            return r3
        L_0x000e:
            java.lang.String r2 = "pointerEvents"
            boolean r2 = r2.equals(r1)
            r4 = 0
            if (r2 == 0) goto L_0x002e
            java.lang.String r0 = r18.getString(r19)
            java.lang.String r1 = "auto"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x002d
            java.lang.String r1 = "box-none"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r3 = 0
        L_0x002d:
            return r3
        L_0x002e:
            int r5 = r19.hashCode()
            java.lang.String r6 = "borderLeftColor"
            java.lang.String r7 = "borderBottomColor"
            java.lang.String r8 = "borderTopColor"
            java.lang.String r9 = "borderRightColor"
            java.lang.String r10 = "overflow"
            java.lang.String r11 = "borderLeftWidth"
            java.lang.String r12 = "opacity"
            java.lang.String r13 = "borderBottomWidth"
            java.lang.String r14 = "borderTopWidth"
            java.lang.String r15 = "borderRightWidth"
            java.lang.String r2 = "borderWidth"
            switch(r5) {
                case -1989576717: goto L_0x00ac;
                case -1971292586: goto L_0x00a3;
                case -1470826662: goto L_0x009b;
                case -1452542531: goto L_0x0092;
                case -1308858324: goto L_0x008a;
                case -1290574193: goto L_0x0081;
                case -1267206133: goto L_0x0079;
                case -242276144: goto L_0x0071;
                case -223992013: goto L_0x0069;
                case 529642498: goto L_0x0060;
                case 741115130: goto L_0x0058;
                case 1349188574: goto L_0x004d;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x00b4
        L_0x004d:
            java.lang.String r5 = "borderRadius"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x00b4
            r1 = 1
            goto L_0x00b5
        L_0x0058:
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00b4
            r1 = 6
            goto L_0x00b5
        L_0x0060:
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x00b4
            r1 = 11
            goto L_0x00b5
        L_0x0069:
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x00b4
            r1 = 7
            goto L_0x00b5
        L_0x0071:
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00b4
            r1 = 2
            goto L_0x00b5
        L_0x0079:
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x00b4
            r1 = 0
            goto L_0x00b5
        L_0x0081:
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x00b4
            r1 = 10
            goto L_0x00b5
        L_0x008a:
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x00b4
            r1 = 5
            goto L_0x00b5
        L_0x0092:
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto L_0x00b4
            r1 = 8
            goto L_0x00b5
        L_0x009b:
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x00b4
            r1 = 4
            goto L_0x00b5
        L_0x00a3:
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L_0x00b4
            r1 = 9
            goto L_0x00b5
        L_0x00ac:
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x00b4
            r1 = 3
            goto L_0x00b5
        L_0x00b4:
            r1 = -1
        L_0x00b5:
            r16 = 0
            switch(r1) {
                case 0: goto L_0x016e;
                case 1: goto L_0x0149;
                case 2: goto L_0x0140;
                case 3: goto L_0x0137;
                case 4: goto L_0x012e;
                case 5: goto L_0x0125;
                case 6: goto L_0x0114;
                case 7: goto L_0x0103;
                case 8: goto L_0x00f2;
                case 9: goto L_0x00e1;
                case 10: goto L_0x00d0;
                case 11: goto L_0x00bb;
                default: goto L_0x00ba;
            }
        L_0x00ba:
            return r4
        L_0x00bb:
            boolean r1 = r0.isNull(r10)
            if (r1 != 0) goto L_0x00cf
            java.lang.String r0 = r0.getString(r10)
            java.lang.String r1 = "visible"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00ce
            goto L_0x00cf
        L_0x00ce:
            r3 = 0
        L_0x00cf:
            return r3
        L_0x00d0:
            boolean r1 = r0.isNull(r13)
            if (r1 != 0) goto L_0x00e0
            double r0 = r0.getDouble(r13)
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x00df
            goto L_0x00e0
        L_0x00df:
            r3 = 0
        L_0x00e0:
            return r3
        L_0x00e1:
            boolean r1 = r0.isNull(r15)
            if (r1 != 0) goto L_0x00f1
            double r0 = r0.getDouble(r15)
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x00f0
            goto L_0x00f1
        L_0x00f0:
            r3 = 0
        L_0x00f1:
            return r3
        L_0x00f2:
            boolean r1 = r0.isNull(r14)
            if (r1 != 0) goto L_0x0102
            double r0 = r0.getDouble(r14)
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x0101
            goto L_0x0102
        L_0x0101:
            r3 = 0
        L_0x0102:
            return r3
        L_0x0103:
            boolean r1 = r0.isNull(r11)
            if (r1 != 0) goto L_0x0113
            double r0 = r0.getDouble(r11)
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x0112
            goto L_0x0113
        L_0x0112:
            r3 = 0
        L_0x0113:
            return r3
        L_0x0114:
            boolean r1 = r0.isNull(r2)
            if (r1 != 0) goto L_0x0124
            double r0 = r0.getDouble(r2)
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x0123
            goto L_0x0124
        L_0x0123:
            r3 = 0
        L_0x0124:
            return r3
        L_0x0125:
            int r0 = r0.getInt(r7)
            if (r0 != 0) goto L_0x012c
            goto L_0x012d
        L_0x012c:
            r3 = 0
        L_0x012d:
            return r3
        L_0x012e:
            int r0 = r0.getInt(r8)
            if (r0 != 0) goto L_0x0135
            goto L_0x0136
        L_0x0135:
            r3 = 0
        L_0x0136:
            return r3
        L_0x0137:
            int r0 = r0.getInt(r9)
            if (r0 != 0) goto L_0x013e
            goto L_0x013f
        L_0x013e:
            r3 = 0
        L_0x013f:
            return r3
        L_0x0140:
            int r0 = r0.getInt(r6)
            if (r0 != 0) goto L_0x0147
            goto L_0x0148
        L_0x0147:
            r3 = 0
        L_0x0148:
            return r3
        L_0x0149:
            java.lang.String r1 = "backgroundColor"
            boolean r5 = r0.hasKey(r1)
            if (r5 == 0) goto L_0x0158
            int r1 = r0.getInt(r1)
            if (r1 == 0) goto L_0x0158
            return r4
        L_0x0158:
            boolean r1 = r0.hasKey(r2)
            if (r1 == 0) goto L_0x016d
            boolean r1 = r0.isNull(r2)
            if (r1 != 0) goto L_0x016d
            double r0 = r0.getDouble(r2)
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 == 0) goto L_0x016d
            return r4
        L_0x016d:
            return r3
        L_0x016e:
            boolean r1 = r0.isNull(r12)
            if (r1 != 0) goto L_0x0180
            double r0 = r0.getDouble(r12)
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x017f
            goto L_0x0180
        L_0x017f:
            r3 = 0
        L_0x0180:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.C1718ra.m6611a(com.facebook.react.bridge.ReadableMap, java.lang.String):boolean");
    }
}
