package com.facebook.react.views.scroll;

import android.util.DisplayMetrics;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
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
import p000a.p005b.p009c.p018g.C0156v;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "AndroidHorizontalScrollView")
public class ReactHorizontalScrollViewManager extends ViewGroupManager<C1781e> implements C1785a<C1781e> {
    public static final String REACT_CLASS = "AndroidHorizontalScrollView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private C1777a mFpsListener;

    public ReactHorizontalScrollViewManager() {
        this(null);
    }

    public ReactHorizontalScrollViewManager(C1777a aVar) {
        this.mFpsListener = null;
        this.mFpsListener = aVar;
    }

    public C1781e createViewInstance(C1578N n) {
        return new C1781e(n, this.mFpsListener);
    }

    public void flashScrollIndicators(C1781e eVar) {
        eVar.mo6239b();
    }

    public String getName() {
        return REACT_CLASS;
    }

    public void receiveCommand(C1781e eVar, int i, ReadableArray readableArray) {
        C1784h.m6848a(this, eVar, i, readableArray);
    }

    public void scrollTo(C1781e eVar, C1786b bVar) {
        if (bVar.f5294c) {
            eVar.smoothScrollTo(bVar.f5292a, bVar.f5293b);
        } else {
            eVar.scrollTo(bVar.f5292a, bVar.f5293b);
        }
    }

    public void scrollToEnd(C1781e eVar, C1787c cVar) {
        int width = eVar.getChildAt(0).getWidth() + eVar.getPaddingRight();
        if (cVar.f5295a) {
            eVar.smoothScrollTo(width, eVar.getScrollY());
        } else {
            eVar.scrollTo(width, eVar.getScrollY());
        }
    }

    @C1596b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(C1781e eVar, int i, Integer num) {
        float f = Float.NaN;
        float intValue = num == null ? Float.NaN : (float) (num.intValue() & 16777215);
        if (num != null) {
            f = (float) (num.intValue() >>> 24);
        }
        eVar.mo6238a(SPACING_TYPES[i], intValue, f);
    }

    @C1596b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(C1781e eVar, int i, float f) {
        if (!C1943a.m7432a(f)) {
            f = C1726w.m6668b(f);
        }
        if (i == 0) {
            eVar.setBorderRadius(f);
        } else {
            eVar.mo6236a(f, i - 1);
        }
    }

    @C1595a(name = "borderStyle")
    public void setBorderStyle(C1781e eVar, String str) {
        eVar.setBorderStyle(str);
    }

    @C1596b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(C1781e eVar, int i, float f) {
        if (!C1943a.m7432a(f)) {
            f = C1726w.m6668b(f);
        }
        eVar.mo6237a(SPACING_TYPES[i], f);
    }

    @C1595a(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(C1781e eVar, int i) {
        eVar.setEndFillColor(i);
    }

    @C1595a(name = "decelerationRate")
    public void setDecelerationRate(C1781e eVar, float f) {
        eVar.setDecelerationRate(f);
    }

    @C1595a(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(C1781e eVar, boolean z) {
        C0156v.m551a((View) eVar, z);
    }

    @C1595a(name = "overScrollMode")
    public void setOverScrollMode(C1781e eVar, String str) {
        eVar.setOverScrollMode(C1788i.m6849a(str));
    }

    @C1595a(name = "overflow")
    public void setOverflow(C1781e eVar, String str) {
        eVar.setOverflow(str);
    }

    @C1595a(name = "pagingEnabled")
    public void setPagingEnabled(C1781e eVar, boolean z) {
        eVar.setPagingEnabled(z);
    }

    @C1595a(name = "persistentScrollbar")
    public void setPersistentScrollbar(C1781e eVar, boolean z) {
        eVar.setScrollbarFadingEnabled(!z);
    }

    @C1595a(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(C1781e eVar, boolean z) {
        eVar.setRemoveClippedSubviews(z);
    }

    @C1595a(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(C1781e eVar, boolean z) {
        eVar.setScrollEnabled(z);
    }

    @C1595a(name = "scrollPerfTag")
    public void setScrollPerfTag(C1781e eVar, String str) {
        eVar.setScrollPerfTag(str);
    }

    @C1595a(name = "sendMomentumEvents")
    public void setSendMomentumEvents(C1781e eVar, boolean z) {
        eVar.setSendMomentumEvents(z);
    }

    @C1595a(name = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(C1781e eVar, boolean z) {
        eVar.setHorizontalScrollBarEnabled(z);
    }

    @C1595a(name = "snapToEnd")
    public void setSnapToEnd(C1781e eVar, boolean z) {
        eVar.setSnapToEnd(z);
    }

    @C1595a(name = "snapToInterval")
    public void setSnapToInterval(C1781e eVar, float f) {
        eVar.setSnapInterval((int) (f * C1654h.m6466a().density));
    }

    @C1595a(name = "snapToOffsets")
    public void setSnapToOffsets(C1781e eVar, ReadableArray readableArray) {
        DisplayMetrics a = C1654h.m6466a();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            double d = readableArray.getDouble(i);
            double d2 = (double) a.density;
            Double.isNaN(d2);
            arrayList.add(Integer.valueOf((int) (d * d2)));
        }
        eVar.setSnapOffsets(arrayList);
    }

    @C1595a(name = "snapToStart")
    public void setSnapToStart(C1781e eVar, boolean z) {
        eVar.setSnapToStart(z);
    }
}
