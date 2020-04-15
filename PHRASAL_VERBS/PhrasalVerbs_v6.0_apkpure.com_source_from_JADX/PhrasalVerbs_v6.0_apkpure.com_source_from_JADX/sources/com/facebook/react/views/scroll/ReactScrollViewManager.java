package com.facebook.react.views.scroll;

import android.util.DisplayMetrics;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.C1397f;
import com.facebook.react.common.C1397f.C1398a;
import com.facebook.react.uimanager.C1578N;
import com.facebook.react.uimanager.C1654h;
import com.facebook.react.uimanager.C1726w;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.p121a.C1595a;
import com.facebook.react.uimanager.p121a.C1596b;
import com.facebook.react.views.scroll.C1784h.C1785a;
import com.facebook.react.views.scroll.C1784h.C1786b;
import com.facebook.react.views.scroll.C1784h.C1787c;
import com.facebook.yoga.C1943a;
import java.util.ArrayList;
import java.util.Map;
import p000a.p005b.p009c.p018g.C0156v;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "RCTScrollView")
public class ReactScrollViewManager extends ViewGroupManager<C1783g> implements C1785a<C1783g> {
    public static final String REACT_CLASS = "RCTScrollView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private C1777a mFpsListener;

    public ReactScrollViewManager() {
        this(null);
    }

    public ReactScrollViewManager(C1777a aVar) {
        this.mFpsListener = null;
        this.mFpsListener = aVar;
    }

    public static Map<String, Object> createExportedCustomDirectEventTypeConstants() {
        C1398a a = C1397f.m5734a();
        String str = "registrationName";
        a.mo5183a(C1791l.m6865a(C1791l.SCROLL), C1397f.m5735a(str, "onScroll"));
        a.mo5183a(C1791l.m6865a(C1791l.BEGIN_DRAG), C1397f.m5735a(str, "onScrollBeginDrag"));
        a.mo5183a(C1791l.m6865a(C1791l.END_DRAG), C1397f.m5735a(str, "onScrollEndDrag"));
        a.mo5183a(C1791l.m6865a(C1791l.MOMENTUM_BEGIN), C1397f.m5735a(str, "onMomentumScrollBegin"));
        a.mo5183a(C1791l.m6865a(C1791l.MOMENTUM_END), C1397f.m5735a(str, "onMomentumScrollEnd"));
        return a.mo5184a();
    }

    public C1783g createViewInstance(C1578N n) {
        return new C1783g(n, this.mFpsListener);
    }

    public void flashScrollIndicators(C1783g gVar) {
        gVar.mo6270b();
    }

    public Map<String, Integer> getCommandsMap() {
        return C1784h.m6847a();
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return createExportedCustomDirectEventTypeConstants();
    }

    public String getName() {
        return REACT_CLASS;
    }

    public void receiveCommand(C1783g gVar, int i, ReadableArray readableArray) {
        C1784h.m6848a(this, gVar, i, readableArray);
    }

    public void scrollTo(C1783g gVar, C1786b bVar) {
        if (bVar.f5294c) {
            gVar.smoothScrollTo(bVar.f5292a, bVar.f5293b);
        } else {
            gVar.scrollTo(bVar.f5292a, bVar.f5293b);
        }
    }

    public void scrollToEnd(C1783g gVar, C1787c cVar) {
        int height = gVar.getChildAt(0).getHeight() + gVar.getPaddingBottom();
        if (cVar.f5295a) {
            gVar.smoothScrollTo(gVar.getScrollX(), height);
        } else {
            gVar.scrollTo(gVar.getScrollX(), height);
        }
    }

    @C1596b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(C1783g gVar, int i, Integer num) {
        float f = Float.NaN;
        float intValue = num == null ? Float.NaN : (float) (num.intValue() & 16777215);
        if (num != null) {
            f = (float) (num.intValue() >>> 24);
        }
        gVar.mo6269a(SPACING_TYPES[i], intValue, f);
    }

    @C1596b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(C1783g gVar, int i, float f) {
        if (!C1943a.m7432a(f)) {
            f = C1726w.m6668b(f);
        }
        if (i == 0) {
            gVar.setBorderRadius(f);
        } else {
            gVar.mo6267a(f, i - 1);
        }
    }

    @C1595a(name = "borderStyle")
    public void setBorderStyle(C1783g gVar, String str) {
        gVar.setBorderStyle(str);
    }

    @C1596b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(C1783g gVar, int i, float f) {
        if (!C1943a.m7432a(f)) {
            f = C1726w.m6668b(f);
        }
        gVar.mo6268a(SPACING_TYPES[i], f);
    }

    @C1595a(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(C1783g gVar, int i) {
        gVar.setEndFillColor(i);
    }

    @C1595a(name = "decelerationRate")
    public void setDecelerationRate(C1783g gVar, float f) {
        gVar.setDecelerationRate(f);
    }

    @C1595a(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(C1783g gVar, boolean z) {
        C0156v.m551a((View) gVar, z);
    }

    @C1595a(name = "overScrollMode")
    public void setOverScrollMode(C1783g gVar, String str) {
        gVar.setOverScrollMode(C1788i.m6849a(str));
    }

    @C1595a(name = "overflow")
    public void setOverflow(C1783g gVar, String str) {
        gVar.setOverflow(str);
    }

    @C1595a(name = "pagingEnabled")
    public void setPagingEnabled(C1783g gVar, boolean z) {
        gVar.setPagingEnabled(z);
    }

    @C1595a(name = "persistentScrollbar")
    public void setPersistentScrollbar(C1783g gVar, boolean z) {
        gVar.setScrollbarFadingEnabled(!z);
    }

    @C1595a(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(C1783g gVar, boolean z) {
        gVar.setRemoveClippedSubviews(z);
    }

    @C1595a(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(C1783g gVar, boolean z) {
        gVar.setScrollEnabled(z);
    }

    @C1595a(name = "scrollPerfTag")
    public void setScrollPerfTag(C1783g gVar, String str) {
        gVar.setScrollPerfTag(str);
    }

    @C1595a(name = "sendMomentumEvents")
    public void setSendMomentumEvents(C1783g gVar, boolean z) {
        gVar.setSendMomentumEvents(z);
    }

    @C1595a(name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(C1783g gVar, boolean z) {
        gVar.setVerticalScrollBarEnabled(z);
    }

    @C1595a(name = "snapToEnd")
    public void setSnapToEnd(C1783g gVar, boolean z) {
        gVar.setSnapToEnd(z);
    }

    @C1595a(name = "snapToInterval")
    public void setSnapToInterval(C1783g gVar, float f) {
        gVar.setSnapInterval((int) (f * C1654h.m6466a().density));
    }

    @C1595a(name = "snapToOffsets")
    public void setSnapToOffsets(C1783g gVar, ReadableArray readableArray) {
        DisplayMetrics a = C1654h.m6466a();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            double d = readableArray.getDouble(i);
            double d2 = (double) a.density;
            Double.isNaN(d2);
            arrayList.add(Integer.valueOf((int) (d * d2)));
        }
        gVar.setSnapOffsets(arrayList);
    }

    @C1595a(name = "snapToStart")
    public void setSnapToStart(C1783g gVar, boolean z) {
        gVar.setSnapToStart(z);
    }
}
