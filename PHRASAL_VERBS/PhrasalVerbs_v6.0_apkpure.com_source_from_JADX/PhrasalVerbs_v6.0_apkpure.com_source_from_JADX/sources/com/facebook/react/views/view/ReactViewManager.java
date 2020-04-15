package com.facebook.react.views.view;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.C1397f;
import com.facebook.react.uimanager.C1578N;
import com.facebook.react.uimanager.C1726w;
import com.facebook.react.uimanager.C1727x;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.p121a.C1595a;
import com.facebook.react.uimanager.p121a.C1596b;
import com.facebook.yoga.C1943a;
import java.util.Locale;
import java.util.Map;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "RCTView")
public class ReactViewManager extends ViewGroupManager<C1886h> {
    private static final int CMD_HOTSPOT_UPDATE = 1;
    private static final int CMD_SET_PRESSED = 2;
    public static final String REACT_CLASS = "RCTView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3, 4, 5};

    public void addView(C1886h hVar, View view, int i) {
        if (hVar.getRemoveClippedSubviews()) {
            hVar.mo6696a(view, i);
        } else {
            hVar.addView(view, i);
        }
    }

    public C1886h createViewInstance(C1578N n) {
        return new C1886h(n);
    }

    public View getChildAt(C1886h hVar, int i) {
        return hVar.getRemoveClippedSubviews() ? hVar.mo6699b(i) : hVar.getChildAt(i);
    }

    public int getChildCount(C1886h hVar) {
        return hVar.getRemoveClippedSubviews() ? hVar.getAllChildrenCount() : hVar.getChildCount();
    }

    public Map<String, Integer> getCommandsMap() {
        return C1397f.m5736a("hotspotUpdate", Integer.valueOf(1), "setPressed", Integer.valueOf(2));
    }

    public String getName() {
        return REACT_CLASS;
    }

    public void receiveCommand(C1886h hVar, int i, ReadableArray readableArray) {
        if (i != 1) {
            if (i == 2) {
                if (readableArray == null || readableArray.size() != 1) {
                    throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'setPressed' command");
                }
                hVar.setPressed(readableArray.getBoolean(0));
            }
        } else if (readableArray == null || readableArray.size() != 2) {
            throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'updateHotspot' command");
        } else if (VERSION.SDK_INT >= 21) {
            hVar.drawableHotspotChanged(C1726w.m6665a(readableArray.getDouble(0)), C1726w.m6665a(readableArray.getDouble(1)));
        }
    }

    public void removeAllViews(C1886h hVar) {
        if (hVar.getRemoveClippedSubviews()) {
            hVar.mo6700c();
        } else {
            hVar.removeAllViews();
        }
    }

    public void removeViewAt(C1886h hVar, int i) {
        if (hVar.getRemoveClippedSubviews()) {
            View childAt = getChildAt(hVar, i);
            if (childAt.getParent() != null) {
                hVar.removeView(childAt);
            }
            hVar.mo6695a(childAt);
            return;
        }
        hVar.removeViewAt(i);
    }

    @C1595a(name = "accessible")
    public void setAccessible(C1886h hVar, boolean z) {
        hVar.setFocusable(z);
    }

    @C1595a(name = "backfaceVisibility")
    public void setBackfaceVisibility(C1886h hVar, String str) {
        hVar.setBackfaceVisibility(str);
    }

    @C1596b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor", "borderStartColor", "borderEndColor"})
    public void setBorderColor(C1886h hVar, int i, Integer num) {
        float f = Float.NaN;
        float intValue = num == null ? Float.NaN : (float) (num.intValue() & 16777215);
        if (num != null) {
            f = (float) (num.intValue() >>> 24);
        }
        hVar.mo6694a(SPACING_TYPES[i], intValue, f);
    }

    @C1596b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius", "borderTopStartRadius", "borderTopEndRadius", "borderBottomStartRadius", "borderBottomEndRadius"})
    public void setBorderRadius(C1886h hVar, int i, float f) {
        if (!C1943a.m7432a(f) && f < 0.0f) {
            f = Float.NaN;
        }
        if (!C1943a.m7432a(f)) {
            f = C1726w.m6668b(f);
        }
        if (i == 0) {
            hVar.setBorderRadius(f);
        } else {
            hVar.mo6692a(f, i - 1);
        }
    }

    @C1595a(name = "borderStyle")
    public void setBorderStyle(C1886h hVar, String str) {
        hVar.setBorderStyle(str);
    }

    @C1596b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth", "borderStartWidth", "borderEndWidth"})
    public void setBorderWidth(C1886h hVar, int i, float f) {
        if (!C1943a.m7432a(f) && f < 0.0f) {
            f = Float.NaN;
        }
        if (!C1943a.m7432a(f)) {
            f = C1726w.m6668b(f);
        }
        hVar.mo6693a(SPACING_TYPES[i], f);
    }

    @C1595a(name = "collapsable")
    public void setCollapsable(C1886h hVar, boolean z) {
    }

    @C1595a(name = "hitSlop")
    public void setHitSlop(C1886h hVar, ReadableMap readableMap) {
        if (readableMap == null) {
            hVar.setHitSlopRect(null);
            return;
        }
        String str = "left";
        int i = 0;
        int a = readableMap.hasKey(str) ? (int) C1726w.m6665a(readableMap.getDouble(str)) : 0;
        String str2 = "top";
        int a2 = readableMap.hasKey(str2) ? (int) C1726w.m6665a(readableMap.getDouble(str2)) : 0;
        String str3 = "right";
        int a3 = readableMap.hasKey(str3) ? (int) C1726w.m6665a(readableMap.getDouble(str3)) : 0;
        String str4 = "bottom";
        if (readableMap.hasKey(str4)) {
            i = (int) C1726w.m6665a(readableMap.getDouble(str4));
        }
        hVar.setHitSlopRect(new Rect(a, a2, a3, i));
    }

    @C1595a(name = "nativeBackgroundAndroid")
    public void setNativeBackground(C1886h hVar, ReadableMap readableMap) {
        hVar.setTranslucentBackgroundDrawable(readableMap == null ? null : C1879c.m7127a(hVar.getContext(), readableMap));
    }

    @C1595a(name = "nativeForegroundAndroid")
    @TargetApi(23)
    public void setNativeForeground(C1886h hVar, ReadableMap readableMap) {
        hVar.setForeground(readableMap == null ? null : C1879c.m7127a(hVar.getContext(), readableMap));
    }

    @C1595a(name = "needsOffscreenAlphaCompositing")
    public void setNeedsOffscreenAlphaCompositing(C1886h hVar, boolean z) {
        hVar.setNeedsOffscreenAlphaCompositing(z);
    }

    public void setOpacity(C1886h hVar, float f) {
        hVar.setOpacityIfPossible(f);
    }

    @C1595a(name = "overflow")
    public void setOverflow(C1886h hVar, String str) {
        hVar.setOverflow(str);
    }

    @C1595a(name = "pointerEvents")
    public void setPointerEvents(C1886h hVar, String str) {
        hVar.setPointerEvents(str == null ? C1727x.AUTO : C1727x.valueOf(str.toUpperCase(Locale.US).replace("-", "_")));
    }

    @C1595a(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(C1886h hVar, boolean z) {
        hVar.setRemoveClippedSubviews(z);
    }

    @C1595a(name = "hasTVPreferredFocus")
    public void setTVPreferredFocus(C1886h hVar, boolean z) {
        if (z) {
            hVar.setFocusable(true);
            hVar.setFocusableInTouchMode(true);
            hVar.requestFocus();
        }
    }

    public void setTransform(C1886h hVar, ReadableArray readableArray) {
        super.setTransform(hVar, readableArray);
        hVar.mo6701d();
    }
}
