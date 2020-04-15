package com.facebook.react.views.toolbar;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.C1397f;
import com.facebook.react.uimanager.C1578N;
import com.facebook.react.uimanager.C1726w;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.events.C1638f;
import com.facebook.react.uimanager.p121a.C1595a;
import java.util.Map;
import p000a.p005b.p009c.p018g.C0156v;

public class ReactToolbarManager extends ViewGroupManager<C1871f> {
    private static final int COMMAND_DISMISS_POPUP_MENUS = 1;
    private static final String REACT_CLASS = "ToolbarAndroid";

    private static int[] getDefaultColors(Context context) {
        TypedArray typedArray;
        TypedArray typedArray2;
        TypedArray typedArray3;
        TypedArray obtainStyledAttributes;
        Theme theme = context.getTheme();
        TypedArray typedArray4 = null;
        try {
            typedArray3 = theme.obtainStyledAttributes(new int[]{getIdentifier(context, "toolbarStyle")});
            try {
                obtainStyledAttributes = theme.obtainStyledAttributes(typedArray3.getResourceId(0, 0), new int[]{getIdentifier(context, "titleTextAppearance"), getIdentifier(context, "subtitleTextAppearance")});
            } catch (Throwable th) {
                th = th;
                typedArray = null;
                typedArray2 = null;
                recycleQuietly(typedArray3);
                recycleQuietly(typedArray4);
                recycleQuietly(typedArray2);
                recycleQuietly(typedArray);
                throw th;
            }
            try {
                int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
                typedArray2 = theme.obtainStyledAttributes(resourceId, new int[]{16842904});
                try {
                    typedArray4 = theme.obtainStyledAttributes(resourceId2, new int[]{16842904});
                    int[] iArr = {typedArray2.getColor(0, -16777216), typedArray4.getColor(0, -16777216)};
                    recycleQuietly(typedArray3);
                    recycleQuietly(obtainStyledAttributes);
                    recycleQuietly(typedArray2);
                    recycleQuietly(typedArray4);
                    return iArr;
                } catch (Throwable th2) {
                    th = th2;
                    TypedArray typedArray5 = typedArray4;
                    typedArray4 = obtainStyledAttributes;
                    typedArray = typedArray5;
                    recycleQuietly(typedArray3);
                    recycleQuietly(typedArray4);
                    recycleQuietly(typedArray2);
                    recycleQuietly(typedArray);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                typedArray2 = null;
                typedArray4 = obtainStyledAttributes;
                typedArray = null;
                recycleQuietly(typedArray3);
                recycleQuietly(typedArray4);
                recycleQuietly(typedArray2);
                recycleQuietly(typedArray);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            typedArray = null;
            typedArray3 = null;
            typedArray2 = null;
            recycleQuietly(typedArray3);
            recycleQuietly(typedArray4);
            recycleQuietly(typedArray2);
            recycleQuietly(typedArray);
            throw th;
        }
    }

    private int[] getDefaultContentInsets(Context context) {
        TypedArray typedArray;
        Theme theme = context.getTheme();
        TypedArray typedArray2 = null;
        try {
            typedArray = theme.obtainStyledAttributes(new int[]{getIdentifier(context, "toolbarStyle")});
            try {
                typedArray2 = theme.obtainStyledAttributes(typedArray.getResourceId(0, 0), new int[]{getIdentifier(context, "contentInsetStart"), getIdentifier(context, "contentInsetEnd")});
                int[] iArr = {typedArray2.getDimensionPixelSize(0, 0), typedArray2.getDimensionPixelSize(1, 0)};
                recycleQuietly(typedArray);
                recycleQuietly(typedArray2);
                return iArr;
            } catch (Throwable th) {
                th = th;
                recycleQuietly(typedArray);
                recycleQuietly(typedArray2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            typedArray = null;
            recycleQuietly(typedArray);
            recycleQuietly(typedArray2);
            throw th;
        }
    }

    private static int getIdentifier(Context context, String str) {
        return context.getResources().getIdentifier(str, "attr", context.getPackageName());
    }

    private static void recycleQuietly(TypedArray typedArray) {
        if (typedArray != null) {
            typedArray.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public void addEventEmitters(C1578N n, C1871f fVar) {
        C1638f eventDispatcher = ((UIManagerModule) n.getNativeModule(UIManagerModule.class)).getEventDispatcher();
        fVar.setNavigationOnClickListener(new C1875g(this, eventDispatcher, fVar));
        fVar.setOnMenuItemClickListener(new C1876h(this, eventDispatcher, fVar));
    }

    /* access modifiers changed from: protected */
    public C1871f createViewInstance(C1578N n) {
        return new C1871f(n);
    }

    public Map<String, Integer> getCommandsMap() {
        return C1397f.m5735a("dismissPopupMenus", Integer.valueOf(1));
    }

    public Map<String, Object> getExportedViewConstants() {
        return C1397f.m5735a("ShowAsAction", C1397f.m5737a("never", Integer.valueOf(0), "always", Integer.valueOf(2), "ifRoom", Integer.valueOf(1)));
    }

    public String getName() {
        return REACT_CLASS;
    }

    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    public void receiveCommand(C1871f fVar, int i, ReadableArray readableArray) {
        if (i == 1) {
            fVar.mo2839d();
        } else {
            throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", new Object[]{Integer.valueOf(i), ReactToolbarManager.class.getSimpleName()}));
        }
    }

    @C1595a(name = "nativeActions")
    public void setActions(C1871f fVar, ReadableArray readableArray) {
        fVar.setActions(readableArray);
    }

    @C1595a(defaultFloat = Float.NaN, name = "contentInsetEnd")
    public void setContentInsetEnd(C1871f fVar, float f) {
        fVar.mo2832a(fVar.getContentInsetStart(), Float.isNaN(f) ? getDefaultContentInsets(fVar.getContext())[1] : Math.round(C1726w.m6668b(f)));
    }

    @C1595a(defaultFloat = Float.NaN, name = "contentInsetStart")
    public void setContentInsetStart(C1871f fVar, float f) {
        fVar.mo2832a(Float.isNaN(f) ? getDefaultContentInsets(fVar.getContext())[0] : Math.round(C1726w.m6668b(f)), fVar.getContentInsetEnd());
    }

    @C1595a(name = "logo")
    public void setLogo(C1871f fVar, ReadableMap readableMap) {
        fVar.setLogoSource(readableMap);
    }

    @C1595a(name = "navIcon")
    public void setNavIcon(C1871f fVar, ReadableMap readableMap) {
        fVar.setNavIconSource(readableMap);
    }

    @C1595a(name = "overflowIcon")
    public void setOverflowIcon(C1871f fVar, ReadableMap readableMap) {
        fVar.setOverflowIconSource(readableMap);
    }

    @C1595a(name = "rtl")
    public void setRtl(C1871f fVar, boolean z) {
        C0156v.m561e(fVar, z ? 1 : 0);
    }

    @C1595a(name = "subtitle")
    public void setSubtitle(C1871f fVar, String str) {
        fVar.setSubtitle((CharSequence) str);
    }

    @C1595a(customType = "Color", name = "subtitleColor")
    public void setSubtitleColor(C1871f fVar, Integer num) {
        fVar.setSubtitleTextColor(num != null ? num.intValue() : getDefaultColors(fVar.getContext())[1]);
    }

    @C1595a(name = "title")
    public void setTitle(C1871f fVar, String str) {
        fVar.setTitle((CharSequence) str);
    }

    @C1595a(customType = "Color", name = "titleColor")
    public void setTitleColor(C1871f fVar, Integer num) {
        fVar.setTitleTextColor(num != null ? num.intValue() : getDefaultColors(fVar.getContext())[0]);
    }
}
