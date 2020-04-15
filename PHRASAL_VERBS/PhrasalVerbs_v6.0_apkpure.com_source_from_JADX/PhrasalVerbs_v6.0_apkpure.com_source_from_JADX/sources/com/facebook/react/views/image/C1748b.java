package com.facebook.react.views.image;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.image.b */
public class C1748b extends C1635c<C1748b> {

    /* renamed from: f */
    private final int f5139f;

    /* renamed from: g */
    private final String f5140g;

    /* renamed from: h */
    private final int f5141h;

    /* renamed from: i */
    private final int f5142i;

    /* renamed from: j */
    private final String f5143j;

    public C1748b(int i, int i2) {
        this(i, i2, null);
    }

    public C1748b(int i, int i2, String str) {
        this(i, i2, str, 0, 0, null);
    }

    public C1748b(int i, int i2, String str, int i3, int i4) {
        this(i, i2, str, i3, i4, null);
    }

    public C1748b(int i, int i2, String str, int i3, int i4, String str2) {
        super(i);
        this.f5139f = i2;
        this.f5140g = str;
        this.f5141h = i3;
        this.f5142i = i4;
        this.f5143j = str2;
    }

    public C1748b(int i, int i2, boolean z, String str) {
        this(i, i2, null, 0, 0, str);
    }

    /* renamed from: b */
    public static String m6729b(int i) {
        if (i == 1) {
            return "topError";
        }
        if (i == 2) {
            return "topLoad";
        }
        if (i == 3) {
            return "topLoadEnd";
        }
        if (i == 4) {
            return "topLoadStart";
        }
        if (i == 5) {
            return "topProgress";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid image event: ");
        sb.append(Integer.toString(i));
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public void mo5868a(RCTEventEmitter rCTEventEmitter) {
        WritableMap writableMap;
        if (this.f5140g == null) {
            int i = this.f5139f;
            if (!(i == 2 || i == 1)) {
                writableMap = null;
                rCTEventEmitter.receiveEvent(mo5877g(), mo5869d(), writableMap);
            }
        }
        writableMap = Arguments.createMap();
        String str = this.f5140g;
        if (str != null) {
            writableMap.putString("uri", str);
        }
        int i2 = this.f5139f;
        if (i2 == 2) {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("width", (double) this.f5141h);
            createMap.putDouble("height", (double) this.f5142i);
            String str2 = this.f5140g;
            if (str2 != null) {
                createMap.putString("url", str2);
            }
            writableMap.putMap("source", createMap);
        } else if (i2 == 1) {
            writableMap.putString("error", this.f5143j);
        }
        rCTEventEmitter.receiveEvent(mo5877g(), mo5869d(), writableMap);
    }

    /* renamed from: c */
    public short mo5874c() {
        return (short) this.f5139f;
    }

    /* renamed from: d */
    public String mo5869d() {
        return m6729b(this.f5139f);
    }
}
