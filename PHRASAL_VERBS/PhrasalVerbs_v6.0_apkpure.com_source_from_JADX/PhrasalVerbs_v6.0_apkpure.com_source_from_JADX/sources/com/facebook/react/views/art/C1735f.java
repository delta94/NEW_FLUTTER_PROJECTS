package com.facebook.react.views.art;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.p121a.C1595a;

/* renamed from: com.facebook.react.views.art.f */
public class C1735f extends C1731b {

    /* renamed from: H */
    private ReadableMap f5124H;

    /* renamed from: I */
    private int f5125I = 0;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0071 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6687a(android.graphics.Paint r8) {
        /*
            r7 = this;
            int r0 = r7.f5125I
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0011
            if (r0 == r2) goto L_0x000e
            if (r0 == r1) goto L_0x000b
            goto L_0x0016
        L_0x000b:
            android.graphics.Paint$Align r0 = android.graphics.Paint.Align.CENTER
            goto L_0x0013
        L_0x000e:
            android.graphics.Paint$Align r0 = android.graphics.Paint.Align.RIGHT
            goto L_0x0013
        L_0x0011:
            android.graphics.Paint$Align r0 = android.graphics.Paint.Align.LEFT
        L_0x0013:
            r8.setTextAlign(r0)
        L_0x0016:
            com.facebook.react.bridge.ReadableMap r0 = r7.f5124H
            if (r0 == 0) goto L_0x008a
            java.lang.String r3 = "font"
            boolean r0 = r0.hasKey(r3)
            if (r0 == 0) goto L_0x008a
            com.facebook.react.bridge.ReadableMap r0 = r7.f5124H
            com.facebook.react.bridge.ReadableMap r0 = r0.getMap(r3)
            if (r0 == 0) goto L_0x008a
            r3 = 1094713344(0x41400000, float:12.0)
            java.lang.String r4 = "fontSize"
            boolean r5 = r0.hasKey(r4)
            if (r5 == 0) goto L_0x0039
            double r3 = r0.getDouble(r4)
            float r3 = (float) r3
        L_0x0039:
            float r4 = r7.f5130z
            float r3 = r3 * r4
            r8.setTextSize(r3)
            java.lang.String r3 = "fontWeight"
            boolean r4 = r0.hasKey(r3)
            r5 = 0
            if (r4 == 0) goto L_0x0057
            java.lang.String r3 = r0.getString(r3)
            java.lang.String r4 = "bold"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0057
            r3 = 1
            goto L_0x0058
        L_0x0057:
            r3 = 0
        L_0x0058:
            java.lang.String r4 = "fontStyle"
            boolean r6 = r0.hasKey(r4)
            if (r6 == 0) goto L_0x006e
            java.lang.String r4 = r0.getString(r4)
            java.lang.String r6 = "italic"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x006e
            r4 = 1
            goto L_0x006f
        L_0x006e:
            r4 = 0
        L_0x006f:
            if (r3 == 0) goto L_0x0075
            if (r4 == 0) goto L_0x0075
            r1 = 3
            goto L_0x007d
        L_0x0075:
            if (r3 == 0) goto L_0x0079
            r1 = 1
            goto L_0x007d
        L_0x0079:
            if (r4 == 0) goto L_0x007c
            goto L_0x007d
        L_0x007c:
            r1 = 0
        L_0x007d:
            java.lang.String r2 = "fontFamily"
            java.lang.String r0 = r0.getString(r2)
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r1)
            r8.setTypeface(r0)
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.art.C1735f.m6687a(android.graphics.Paint):void");
    }

    /* renamed from: a */
    public void mo6023a(Canvas canvas, Paint paint, float f) {
        ReadableMap readableMap = this.f5124H;
        if (readableMap != null) {
            float f2 = f * this.f5128x;
            if (f2 > 0.01f) {
                String str = "lines";
                if (readableMap.hasKey(str)) {
                    ReadableArray array = this.f5124H.getArray(str);
                    if (!(array == null || array.size() == 0)) {
                        mo6044b(canvas);
                        String[] strArr = new String[array.size()];
                        for (int i = 0; i < strArr.length; i++) {
                            strArr[i] = array.getString(i);
                        }
                        String join = TextUtils.join("\n", strArr);
                        if (mo6026b(paint, f2)) {
                            m6687a(paint);
                            Path path = this.f5115A;
                            if (path == null) {
                                canvas.drawText(join, 0.0f, -paint.ascent(), paint);
                            } else {
                                canvas.drawTextOnPath(join, path, 0.0f, 0.0f, paint);
                            }
                        }
                        if (mo6025a(paint, f2)) {
                            m6687a(paint);
                            Path path2 = this.f5115A;
                            if (path2 == null) {
                                canvas.drawText(join, 0.0f, -paint.ascent(), paint);
                            } else {
                                canvas.drawTextOnPath(join, path2, 0.0f, 0.0f, paint);
                            }
                        }
                        mo6043a(canvas);
                        mo5577b();
                    }
                }
            }
        }
    }

    @C1595a(defaultInt = 0, name = "alignment")
    public void setAlignment(int i) {
        this.f5125I = i;
    }

    @C1595a(name = "frame")
    public void setFrame(ReadableMap readableMap) {
        this.f5124H = readableMap;
    }
}
