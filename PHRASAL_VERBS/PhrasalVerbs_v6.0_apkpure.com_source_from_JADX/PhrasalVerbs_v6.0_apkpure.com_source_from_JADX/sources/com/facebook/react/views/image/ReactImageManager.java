package com.facebook.react.views.image;

import android.graphics.PorterDuff.Mode;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.C1397f;
import com.facebook.react.uimanager.C1578N;
import com.facebook.react.uimanager.C1726w;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.p121a.C1595a;
import com.facebook.react.uimanager.p121a.C1596b;
import com.facebook.yoga.C1943a;
import java.util.Map;
import p032c.p033a.p059g.p060a.p061a.C0799c;
import p032c.p033a.p059g.p065c.C0816e;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "RCTImageView")
public class ReactImageManager extends SimpleViewManager<C1753g> {
    public static final String REACT_CLASS = "RCTImageView";
    private final Object mCallerContext;
    private C0816e mDraweeControllerBuilder;
    private C1747a mGlobalImageLoadListener;

    public ReactImageManager() {
        this.mDraweeControllerBuilder = null;
        this.mCallerContext = null;
    }

    public ReactImageManager(C0816e eVar, C1747a aVar, Object obj) {
        this.mDraweeControllerBuilder = eVar;
        this.mGlobalImageLoadListener = aVar;
        this.mCallerContext = obj;
    }

    public ReactImageManager(C0816e eVar, Object obj) {
        this(eVar, null, obj);
    }

    public C1753g createViewInstance(C1578N n) {
        return new C1753g(n, getDraweeControllerBuilder(), this.mGlobalImageLoadListener, getCallerContext());
    }

    public Object getCallerContext() {
        return this.mCallerContext;
    }

    public C0816e getDraweeControllerBuilder() {
        if (this.mDraweeControllerBuilder == null) {
            this.mDraweeControllerBuilder = C0799c.m3538c();
        }
        return this.mDraweeControllerBuilder;
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        String str = "registrationName";
        return C1397f.m5738a(C1748b.m6729b(4), C1397f.m5735a(str, "onLoadStart"), C1748b.m6729b(2), C1397f.m5735a(str, "onLoad"), C1748b.m6729b(1), C1397f.m5735a(str, "onError"), C1748b.m6729b(3), C1397f.m5735a(str, "onLoadEnd"));
    }

    public String getName() {
        return REACT_CLASS;
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(C1753g gVar) {
        super.onAfterUpdateTransaction(gVar);
        gVar.mo6090i();
    }

    @C1595a(name = "blurRadius")
    public void setBlurRadius(C1753g gVar, float f) {
        gVar.setBlurRadius(f);
    }

    @C1595a(customType = "Color", name = "borderColor")
    public void setBorderColor(C1753g gVar, Integer num) {
        gVar.setBorderColor(num == null ? 0 : num.intValue());
    }

    @C1596b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(C1753g gVar, int i, float f) {
        if (!C1943a.m7432a(f)) {
            f = C1726w.m6668b(f);
        }
        if (i == 0) {
            gVar.setBorderRadius(f);
        } else {
            gVar.mo6088a(f, i - 1);
        }
    }

    @C1595a(name = "borderWidth")
    public void setBorderWidth(C1753g gVar, float f) {
        gVar.setBorderWidth(f);
    }

    @C1595a(name = "defaultSrc")
    public void setDefaultSource(C1753g gVar, String str) {
        gVar.setDefaultSource(str);
    }

    @C1595a(name = "fadeDuration")
    public void setFadeDuration(C1753g gVar, int i) {
        gVar.setFadeDuration(i);
    }

    @C1595a(name = "headers")
    public void setHeaders(C1753g gVar, ReadableMap readableMap) {
        gVar.setHeaders(readableMap);
    }

    @C1595a(name = "shouldNotifyLoadEvents")
    public void setLoadHandlersRegistered(C1753g gVar, boolean z) {
        gVar.setShouldNotifyLoadEvents(z);
    }

    @C1595a(name = "loadingIndicatorSrc")
    public void setLoadingIndicatorSource(C1753g gVar, String str) {
        gVar.setLoadingIndicatorSource(str);
    }

    @C1595a(customType = "Color", name = "overlayColor")
    public void setOverlayColor(C1753g gVar, Integer num) {
        gVar.setOverlayColor(num == null ? 0 : num.intValue());
    }

    @C1595a(name = "progressiveRenderingEnabled")
    public void setProgressiveRenderingEnabled(C1753g gVar, boolean z) {
        gVar.setProgressiveRenderingEnabled(z);
    }

    @C1595a(name = "resizeMethod")
    public void setResizeMethod(C1753g gVar, String str) {
        C1749c cVar;
        if (str == null || "auto".equals(str)) {
            cVar = C1749c.AUTO;
        } else if ("resize".equals(str)) {
            cVar = C1749c.RESIZE;
        } else if ("scale".equals(str)) {
            cVar = C1749c.SCALE;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid resize method: '");
            sb.append(str);
            sb.append("'");
            throw new JSApplicationIllegalArgumentException(sb.toString());
        }
        gVar.setResizeMethod(cVar);
    }

    @C1595a(name = "resizeMode")
    public void setResizeMode(C1753g gVar, String str) {
        gVar.setScaleType(C1750d.m6734a(str));
        gVar.setTileMode(C1750d.m6735b(str));
    }

    @C1595a(name = "src")
    public void setSource(C1753g gVar, ReadableArray readableArray) {
        gVar.setSource(readableArray);
    }

    @C1595a(customType = "Color", name = "tintColor")
    public void setTintColor(C1753g gVar, Integer num) {
        if (num == null) {
            gVar.clearColorFilter();
        } else {
            gVar.setColorFilter(num.intValue(), Mode.SRC_IN);
        }
    }
}
