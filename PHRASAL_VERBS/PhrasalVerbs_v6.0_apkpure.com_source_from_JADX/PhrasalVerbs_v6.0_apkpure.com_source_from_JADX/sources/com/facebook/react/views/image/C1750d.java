package com.facebook.react.views.image;

import android.graphics.Shader.TileMode;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import p032c.p033a.p059g.p068e.C0845t.C0847b;

/* renamed from: com.facebook.react.views.image.d */
public class C1750d {
    /* renamed from: a */
    public static TileMode m6733a() {
        return TileMode.CLAMP;
    }

    /* renamed from: a */
    public static C0847b m6734a(String str) {
        if ("contain".equals(str)) {
            return C0847b.f3023c;
        }
        if ("cover".equals(str)) {
            return C0847b.f3027g;
        }
        if ("stretch".equals(str)) {
            return C0847b.f3021a;
        }
        if ("center".equals(str)) {
            return C0847b.f3026f;
        }
        if ("repeat".equals(str)) {
            return C1756h.f5184a;
        }
        if (str == null) {
            return m6736b();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid resize mode: '");
        sb.append(str);
        sb.append("'");
        throw new JSApplicationIllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public static TileMode m6735b(String str) {
        if ("contain".equals(str) || "cover".equals(str) || "stretch".equals(str) || "center".equals(str)) {
            return TileMode.CLAMP;
        }
        if ("repeat".equals(str)) {
            return TileMode.REPEAT;
        }
        if (str == null) {
            return m6733a();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid resize mode: '");
        sb.append(str);
        sb.append("'");
        throw new JSApplicationIllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public static C0847b m6736b() {
        return C0847b.f3027g;
    }
}
