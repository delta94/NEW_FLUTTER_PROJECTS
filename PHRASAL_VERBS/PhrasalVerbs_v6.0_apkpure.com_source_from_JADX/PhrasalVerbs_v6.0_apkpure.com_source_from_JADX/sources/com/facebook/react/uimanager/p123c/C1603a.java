package com.facebook.react.uimanager.p123c;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.BaseInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.C1397f;
import com.facebook.react.uimanager.C1685k;
import java.util.Map;

/* renamed from: com.facebook.react.uimanager.c.a */
abstract class C1603a {

    /* renamed from: a */
    private static final Map<C1607e, BaseInterpolator> f4835a = C1397f.m5738a(C1607e.LINEAR, new LinearInterpolator(), C1607e.EASE_IN, new AccelerateInterpolator(), C1607e.EASE_OUT, new DecelerateInterpolator(), C1607e.EASE_IN_EASE_OUT, new AccelerateDecelerateInterpolator());

    /* renamed from: b */
    private Interpolator f4836b;

    /* renamed from: c */
    private int f4837c;

    /* renamed from: d */
    protected C1604b f4838d;

    /* renamed from: e */
    protected int f4839e;

    C1603a() {
    }

    /* renamed from: a */
    private static Interpolator m6348a(C1607e eVar, ReadableMap readableMap) {
        Interpolator rVar = eVar.equals(C1607e.SPRING) ? new C1621r(C1621r.m6375a(readableMap)) : (Interpolator) f4835a.get(eVar);
        if (rVar != null) {
            return rVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Missing interpolator for type : ");
        sb.append(eVar);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final Animation mo5830a(View view, int i, int i2, int i3, int i4) {
        if (!mo5832a()) {
            return null;
        }
        Animation b = mo5833b(view, i, i2, i3, i4);
        if (b != null) {
            b.setDuration((long) (this.f4839e * 1));
            b.setStartOffset((long) (this.f4837c * 1));
            b.setInterpolator(this.f4836b);
        }
        return b;
    }

    /* renamed from: a */
    public void mo5831a(ReadableMap readableMap, int i) {
        String str = "property";
        this.f4838d = readableMap.hasKey(str) ? C1604b.m6354a(readableMap.getString(str)) : null;
        String str2 = "duration";
        if (readableMap.hasKey(str2)) {
            i = readableMap.getInt(str2);
        }
        this.f4839e = i;
        String str3 = "delay";
        this.f4837c = readableMap.hasKey(str3) ? readableMap.getInt(str3) : 0;
        String str4 = "type";
        if (readableMap.hasKey(str4)) {
            this.f4836b = m6348a(C1607e.m6358a(readableMap.getString(str4)), readableMap);
            if (!mo5832a()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid layout animation : ");
                sb.append(readableMap);
                throw new C1685k(sb.toString());
            }
            return;
        }
        throw new IllegalArgumentException("Missing interpolation type.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo5832a();

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract Animation mo5833b(View view, int i, int i2, int i3, int i4);

    /* renamed from: b */
    public void mo5834b() {
        this.f4838d = null;
        this.f4839e = 0;
        this.f4837c = 0;
        this.f4836b = null;
    }
}
