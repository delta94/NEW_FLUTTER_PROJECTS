package com.facebook.react.views.switchview;

import android.view.View.MeasureSpec;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.facebook.react.uimanager.C1578N;
import com.facebook.react.uimanager.C1691n;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.p121a.C1595a;
import com.facebook.yoga.C1944b;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;

public class ReactSwitchManager extends SimpleViewManager<C1802a> {
    private static final OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER = new C1804c();
    public static final String REACT_CLASS = "AndroidSwitch";

    /* renamed from: com.facebook.react.views.switchview.ReactSwitchManager$a */
    static class C1801a extends C1691n implements YogaMeasureFunction {

        /* renamed from: w */
        private int f5337w;

        /* renamed from: x */
        private int f5338x;

        /* renamed from: y */
        private boolean f5339y;

        private C1801a() {
            m6890N();
        }

        /* synthetic */ C1801a(C1804c cVar) {
            this();
        }

        /* renamed from: N */
        private void m6890N() {
            mo5633a((YogaMeasureFunction) this);
        }

        public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
            if (!this.f5339y) {
                C1802a aVar = new C1802a(mo5602p());
                aVar.setShowText(false);
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
                aVar.measure(makeMeasureSpec, makeMeasureSpec);
                this.f5337w = aVar.getMeasuredWidth();
                this.f5338x = aVar.getMeasuredHeight();
                this.f5339y = true;
            }
            return C1944b.m7434a(this.f5337w, this.f5338x);
        }
    }

    /* access modifiers changed from: protected */
    public void addEventEmitters(C1578N n, C1802a aVar) {
        aVar.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    public C1691n createShadowNodeInstance() {
        return new C1801a(null);
    }

    /* access modifiers changed from: protected */
    public C1802a createViewInstance(C1578N n) {
        C1802a aVar = new C1802a(n);
        aVar.setShowText(false);
        return aVar;
    }

    public String getName() {
        return REACT_CLASS;
    }

    public Class getShadowNodeClass() {
        return C1801a.class;
    }

    @C1595a(defaultBoolean = false, name = "disabled")
    public void setDisabled(C1802a aVar, boolean z) {
        aVar.setEnabled(!z);
    }

    @C1595a(defaultBoolean = true, name = "enabled")
    public void setEnabled(C1802a aVar, boolean z) {
        aVar.setEnabled(z);
    }

    @C1595a(name = "on")
    public void setOn(C1802a aVar, boolean z) {
        setValue(aVar, z);
    }

    @C1595a(customType = "Color", name = "thumbColor")
    public void setThumbColor(C1802a aVar, Integer num) {
        aVar.mo6341a(num);
    }

    @C1595a(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(C1802a aVar, Integer num) {
        setThumbColor(aVar, num);
    }

    @C1595a(customType = "Color", name = "trackColorForFalse")
    public void setTrackColorForFalse(C1802a aVar, Integer num) {
        aVar.mo6344c(num);
    }

    @C1595a(customType = "Color", name = "trackColorForTrue")
    public void setTrackColorForTrue(C1802a aVar, Integer num) {
        aVar.mo6345d(num);
    }

    @C1595a(customType = "Color", name = "trackTintColor")
    public void setTrackTintColor(C1802a aVar, Integer num) {
        aVar.mo6343b(num);
    }

    @C1595a(name = "value")
    public void setValue(C1802a aVar, boolean z) {
        aVar.setOnCheckedChangeListener(null);
        aVar.mo6342a(z);
        aVar.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }
}
