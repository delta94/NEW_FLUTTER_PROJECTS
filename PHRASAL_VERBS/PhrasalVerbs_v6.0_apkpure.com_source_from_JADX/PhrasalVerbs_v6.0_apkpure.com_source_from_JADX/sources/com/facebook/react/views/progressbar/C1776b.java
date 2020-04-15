package com.facebook.react.views.progressbar;

import android.util.SparseIntArray;
import android.view.View.MeasureSpec;
import android.widget.ProgressBar;
import com.facebook.react.uimanager.C1691n;
import com.facebook.react.uimanager.p121a.C1595a;
import com.facebook.yoga.C1944b;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.facebook.react.views.progressbar.b */
public class C1776b extends C1691n implements YogaMeasureFunction {

    /* renamed from: w */
    private String f5226w = "Normal";

    /* renamed from: x */
    private final SparseIntArray f5227x = new SparseIntArray();

    /* renamed from: y */
    private final SparseIntArray f5228y = new SparseIntArray();

    /* renamed from: z */
    private final Set<Integer> f5229z = new HashSet();

    public C1776b() {
        m6800O();
    }

    /* renamed from: O */
    private void m6800O() {
        mo5633a((YogaMeasureFunction) this);
    }

    /* renamed from: N */
    public String mo6042N() {
        return this.f5226w;
    }

    public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        int styleFromString = ReactProgressBarViewManager.getStyleFromString(mo6042N());
        if (!this.f5229z.contains(Integer.valueOf(styleFromString))) {
            ProgressBar createProgressBar = ReactProgressBarViewManager.createProgressBar(mo5602p(), styleFromString);
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(-2, 0);
            createProgressBar.measure(makeMeasureSpec, makeMeasureSpec);
            this.f5227x.put(styleFromString, createProgressBar.getMeasuredHeight());
            this.f5228y.put(styleFromString, createProgressBar.getMeasuredWidth());
            this.f5229z.add(Integer.valueOf(styleFromString));
        }
        return C1944b.m7434a(this.f5228y.get(styleFromString), this.f5227x.get(styleFromString));
    }

    @C1595a(name = "styleAttr")
    public void setStyle(String str) {
        if (str == null) {
            str = "Normal";
        }
        this.f5226w = str;
    }
}
