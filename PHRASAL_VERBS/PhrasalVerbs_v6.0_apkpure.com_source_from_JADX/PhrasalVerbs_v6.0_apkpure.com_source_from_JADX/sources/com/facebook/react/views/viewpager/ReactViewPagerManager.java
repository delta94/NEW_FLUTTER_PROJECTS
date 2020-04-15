package com.facebook.react.views.viewpager;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.C1397f;
import com.facebook.react.uimanager.C1578N;
import com.facebook.react.uimanager.C1726w;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.p121a.C1595a;
import java.util.Map;
import p032c.p033a.p094k.p095a.C1136a;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "AndroidViewPager")
public class ReactViewPagerManager extends ViewGroupManager<C1892e> {
    public static final int COMMAND_SET_PAGE = 1;
    public static final int COMMAND_SET_PAGE_WITHOUT_ANIMATION = 2;
    public static final String REACT_CLASS = "AndroidViewPager";

    public void addView(C1892e eVar, View view, int i) {
        eVar.mo6739a(view, i);
    }

    /* access modifiers changed from: protected */
    public C1892e createViewInstance(C1578N n) {
        return new C1892e(n);
    }

    public View getChildAt(C1892e eVar, int i) {
        return eVar.mo6741d(i);
    }

    public int getChildCount(C1892e eVar) {
        return eVar.getViewCountInAdapter();
    }

    public Map<String, Integer> getCommandsMap() {
        return C1397f.m5736a("setPage", Integer.valueOf(1), "setPageWithoutAnimation", Integer.valueOf(2));
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        String str = "registrationName";
        return C1397f.m5737a("topPageScroll", C1397f.m5735a(str, "onPageScroll"), "topPageScrollStateChanged", C1397f.m5735a(str, "onPageScrollStateChanged"), "topPageSelected", C1397f.m5735a(str, "onPageSelected"));
    }

    public String getName() {
        return REACT_CLASS;
    }

    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    public void receiveCommand(C1892e eVar, int i, ReadableArray readableArray) {
        C1136a.m5053a(eVar);
        C1136a.m5053a(readableArray);
        if (i == 1) {
            eVar.mo6740b(readableArray.getInt(0), true);
        } else if (i == 2) {
            eVar.mo6740b(readableArray.getInt(0), false);
        } else {
            throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", new Object[]{Integer.valueOf(i), ReactViewPagerManager.class.getSimpleName()}));
        }
    }

    public void removeViewAt(C1892e eVar, int i) {
        eVar.mo6742e(i);
    }

    @C1595a(defaultFloat = 0.0f, name = "pageMargin")
    public void setPageMargin(C1892e eVar, float f) {
        eVar.setPageMargin((int) C1726w.m6668b(f));
    }

    @C1595a(defaultBoolean = false, name = "peekEnabled")
    public void setPeekEnabled(C1892e eVar, boolean z) {
        eVar.setClipToPadding(!z);
    }

    @C1595a(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(C1892e eVar, boolean z) {
        eVar.setScrollEnabled(z);
    }
}
