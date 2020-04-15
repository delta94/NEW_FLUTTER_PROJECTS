package com.facebook.react.views.text;

import com.facebook.yoga.YogaMeasureFunction;

/* renamed from: com.facebook.react.views.text.q */
class C1829q implements YogaMeasureFunction {

    /* renamed from: a */
    final /* synthetic */ C1830r f5412a;

    C1829q(C1830r rVar) {
        this.f5412a = rVar;
    }

    /* JADX WARNING: type inference failed for: r12v12, types: [android.text.BoringLayout] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x014d  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long measure(com.facebook.yoga.YogaNode r10, float r11, com.facebook.yoga.YogaMeasureMode r12, float r13, com.facebook.yoga.YogaMeasureMode r14) {
        /*
            r9 = this;
            android.text.TextPaint r2 = com.facebook.react.views.text.C1830r.f5413S
            com.facebook.react.views.text.r r10 = r9.f5412a
            com.facebook.react.views.text.y r10 = r10.f5398w
            int r10 = r10.mo6470b()
            float r10 = (float) r10
            r2.setTextSize(r10)
            com.facebook.react.views.text.r r10 = r9.f5412a
            android.text.Spannable r10 = r10.f5414T
            java.lang.String r13 = "Spannable element has not been prepared in onBeforeLayout"
            p032c.p033a.p094k.p095a.C1136a.m5054a(r10, r13)
            android.text.Spanned r10 = (android.text.Spanned) r10
            android.text.BoringLayout$Metrics r6 = android.text.BoringLayout.isBoring(r10, r2)
            if (r6 != 0) goto L_0x0028
            float r13 = android.text.Layout.getDesiredWidth(r10, r2)
            goto L_0x002a
        L_0x0028:
            r13 = 2143289344(0x7fc00000, float:NaN)
        L_0x002a:
            com.facebook.yoga.YogaMeasureMode r14 = com.facebook.yoga.YogaMeasureMode.UNDEFINED
            r0 = 0
            r1 = 0
            r8 = 1
            if (r12 == r14) goto L_0x0038
            int r12 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r12 >= 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r12 = 0
            goto L_0x0039
        L_0x0038:
            r12 = 1
        L_0x0039:
            android.text.Layout$Alignment r14 = android.text.Layout.Alignment.ALIGN_NORMAL
            com.facebook.react.views.text.r r3 = r9.f5412a
            int r3 = r3.m6945O()
            if (r3 == r8) goto L_0x0051
            r4 = 3
            if (r3 == r4) goto L_0x004e
            r4 = 5
            if (r3 == r4) goto L_0x004b
        L_0x0049:
            r4 = r14
            goto L_0x0054
        L_0x004b:
            android.text.Layout$Alignment r14 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x0049
        L_0x004e:
            android.text.Layout$Alignment r14 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x0049
        L_0x0051:
            android.text.Layout$Alignment r14 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x0049
        L_0x0054:
            r14 = 1065353216(0x3f800000, float:1.0)
            r3 = 23
            if (r6 != 0) goto L_0x00b3
            if (r12 != 0) goto L_0x0066
            boolean r5 = com.facebook.yoga.C1943a.m7432a(r13)
            if (r5 != 0) goto L_0x00b3
            int r5 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r5 > 0) goto L_0x00b3
        L_0x0066:
            double r11 = (double) r13
            double r11 = java.lang.Math.ceil(r11)
            int r11 = (int) r11
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 >= r3) goto L_0x0081
            android.text.StaticLayout r12 = new android.text.StaticLayout
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            com.facebook.react.views.text.r r13 = r9.f5412a
            boolean r7 = r13.f5392M
            r0 = r12
            r1 = r10
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x010e
        L_0x0081:
            int r12 = r10.length()
            android.text.StaticLayout$Builder r11 = android.text.StaticLayout.Builder.obtain(r10, r0, r12, r2, r11)
            android.text.StaticLayout$Builder r11 = r11.setAlignment(r4)
            android.text.StaticLayout$Builder r11 = r11.setLineSpacing(r1, r14)
            com.facebook.react.views.text.r r12 = r9.f5412a
            boolean r12 = r12.f5392M
            android.text.StaticLayout$Builder r11 = r11.setIncludePad(r12)
            com.facebook.react.views.text.r r12 = r9.f5412a
            int r12 = r12.f5383D
            android.text.StaticLayout$Builder r11 = r11.setBreakStrategy(r12)
            android.text.StaticLayout$Builder r11 = r11.setHyphenationFrequency(r8)
            int r12 = android.os.Build.VERSION.SDK_INT
            r13 = 26
            if (r12 < r13) goto L_0x010a
            com.facebook.react.views.text.r r12 = r9.f5412a
            int r12 = r12.f5384E
            r11.setJustificationMode(r12)
            goto L_0x010a
        L_0x00b3:
            if (r6 == 0) goto L_0x00d1
            if (r12 != 0) goto L_0x00be
            int r12 = r6.width
            float r12 = (float) r12
            int r12 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r12 > 0) goto L_0x00d1
        L_0x00be:
            int r11 = r6.width
            r12 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            com.facebook.react.views.text.r r13 = r9.f5412a
            boolean r7 = r13.f5392M
            r0 = r10
            r1 = r2
            r2 = r11
            r3 = r4
            r4 = r12
            android.text.BoringLayout r12 = android.text.BoringLayout.make(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x010e
        L_0x00d1:
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 >= r3) goto L_0x00e5
            android.text.StaticLayout r12 = new android.text.StaticLayout
            int r3 = (int) r11
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            com.facebook.react.views.text.r r11 = r9.f5412a
            boolean r7 = r11.f5392M
            r0 = r12
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x010e
        L_0x00e5:
            int r12 = r10.length()
            int r11 = (int) r11
            android.text.StaticLayout$Builder r11 = android.text.StaticLayout.Builder.obtain(r10, r0, r12, r2, r11)
            android.text.StaticLayout$Builder r11 = r11.setAlignment(r4)
            android.text.StaticLayout$Builder r11 = r11.setLineSpacing(r1, r14)
            com.facebook.react.views.text.r r12 = r9.f5412a
            boolean r12 = r12.f5392M
            android.text.StaticLayout$Builder r11 = r11.setIncludePad(r12)
            com.facebook.react.views.text.r r12 = r9.f5412a
            int r12 = r12.f5383D
            android.text.StaticLayout$Builder r11 = r11.setBreakStrategy(r12)
            android.text.StaticLayout$Builder r11 = r11.setHyphenationFrequency(r8)
        L_0x010a:
            android.text.StaticLayout r12 = r11.build()
        L_0x010e:
            com.facebook.react.views.text.r r11 = r9.f5412a
            boolean r11 = r11.f5415U
            if (r11 == 0) goto L_0x0146
            android.text.TextPaint r11 = com.facebook.react.views.text.C1830r.f5413S
            com.facebook.react.views.text.r r13 = r9.f5412a
            com.facebook.react.uimanager.N r13 = r13.mo5602p()
            com.facebook.react.bridge.WritableArray r10 = com.facebook.react.views.text.C1813e.m6916a(r10, r12, r11, r13)
            com.facebook.react.bridge.WritableMap r11 = com.facebook.react.bridge.Arguments.createMap()
            java.lang.String r13 = "lines"
            r11.putArray(r13, r10)
            com.facebook.react.views.text.r r10 = r9.f5412a
            com.facebook.react.uimanager.N r10 = r10.mo5602p()
            java.lang.Class<com.facebook.react.uimanager.events.RCTEventEmitter> r13 = com.facebook.react.uimanager.events.RCTEventEmitter.class
            com.facebook.react.bridge.JavaScriptModule r10 = r10.getJSModule(r13)
            com.facebook.react.uimanager.events.RCTEventEmitter r10 = (com.facebook.react.uimanager.events.RCTEventEmitter) r10
            com.facebook.react.views.text.r r13 = r9.f5412a
            int r13 = r13.mo5592g()
            java.lang.String r14 = "topTextLayout"
            r10.receiveEvent(r13, r14, r11)
        L_0x0146:
            com.facebook.react.views.text.r r10 = r9.f5412a
            int r10 = r10.f5381B
            r11 = -1
            if (r10 == r11) goto L_0x0165
            int r11 = r12.getLineCount()
            if (r10 >= r11) goto L_0x0165
            int r10 = r12.getWidth()
            com.facebook.react.views.text.r r11 = r9.f5412a
            int r11 = r11.f5381B
            int r11 = r11 - r8
            int r11 = r12.getLineBottom(r11)
        L_0x0160:
            long r10 = com.facebook.yoga.C1944b.m7434a(r10, r11)
            return r10
        L_0x0165:
            int r10 = r12.getWidth()
            int r11 = r12.getHeight()
            goto L_0x0160
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.C1829q.measure(com.facebook.yoga.YogaNode, float, com.facebook.yoga.YogaMeasureMode, float, com.facebook.yoga.YogaMeasureMode):long");
    }
}
