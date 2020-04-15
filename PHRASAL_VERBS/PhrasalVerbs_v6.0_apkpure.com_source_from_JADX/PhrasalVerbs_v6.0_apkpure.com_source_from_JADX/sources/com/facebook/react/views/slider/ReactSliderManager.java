package com.facebook.react.views.slider;

import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View.MeasureSpec;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.facebook.react.common.C1397f;
import com.facebook.react.uimanager.C1578N;
import com.facebook.react.uimanager.C1691n;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.p121a.C1595a;
import com.facebook.yoga.C1944b;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;
import java.util.Map;

public class ReactSliderManager extends SimpleViewManager<C1794a> {
    private static final OnSeekBarChangeListener ON_CHANGE_LISTENER = new C1796c();
    public static final String REACT_CLASS = "RCTSlider";
    private static final int STYLE = 16842875;

    /* renamed from: com.facebook.react.views.slider.ReactSliderManager$a */
    static class C1793a extends C1691n implements YogaMeasureFunction {

        /* renamed from: w */
        private int f5316w;

        /* renamed from: x */
        private int f5317x;

        /* renamed from: y */
        private boolean f5318y;

        private C1793a() {
            m6869N();
        }

        /* synthetic */ C1793a(C1796c cVar) {
            this();
        }

        /* renamed from: N */
        private void m6869N() {
            mo5633a((YogaMeasureFunction) this);
        }

        public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
            if (!this.f5318y) {
                C1794a aVar = new C1794a(mo5602p(), null, ReactSliderManager.STYLE);
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(-2, 0);
                aVar.measure(makeMeasureSpec, makeMeasureSpec);
                this.f5316w = aVar.getMeasuredWidth();
                this.f5317x = aVar.getMeasuredHeight();
                this.f5318y = true;
            }
            return C1944b.m7434a(this.f5316w, this.f5317x);
        }
    }

    /* access modifiers changed from: protected */
    public void addEventEmitters(C1578N n, C1794a aVar) {
        aVar.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }

    public C1691n createShadowNodeInstance() {
        return new C1793a(null);
    }

    /* access modifiers changed from: protected */
    public C1794a createViewInstance(C1578N n) {
        return new C1794a(n, null, STYLE);
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        return C1397f.m5735a("topSlidingComplete", C1397f.m5735a("registrationName", "onSlidingComplete"));
    }

    public String getName() {
        return REACT_CLASS;
    }

    public Class getShadowNodeClass() {
        return C1793a.class;
    }

    @C1595a(defaultBoolean = true, name = "enabled")
    public void setEnabled(C1794a aVar, boolean z) {
        aVar.setEnabled(z);
    }

    @C1595a(customType = "Color", name = "maximumTrackTintColor")
    public void setMaximumTrackTintColor(C1794a aVar, Integer num) {
        Drawable findDrawableByLayerId = ((LayerDrawable) aVar.getProgressDrawable().getCurrent()).findDrawableByLayerId(16908288);
        if (num == null) {
            findDrawableByLayerId.clearColorFilter();
        } else {
            findDrawableByLayerId.setColorFilter(num.intValue(), Mode.SRC_IN);
        }
    }

    @C1595a(defaultDouble = 1.0d, name = "maximumValue")
    public void setMaximumValue(C1794a aVar, double d) {
        aVar.setMaxValue(d);
    }

    @C1595a(customType = "Color", name = "minimumTrackTintColor")
    public void setMinimumTrackTintColor(C1794a aVar, Integer num) {
        Drawable findDrawableByLayerId = ((LayerDrawable) aVar.getProgressDrawable().getCurrent()).findDrawableByLayerId(16908301);
        if (num == null) {
            findDrawableByLayerId.clearColorFilter();
        } else {
            findDrawableByLayerId.setColorFilter(num.intValue(), Mode.SRC_IN);
        }
    }

    @C1595a(defaultDouble = 0.0d, name = "minimumValue")
    public void setMinimumValue(C1794a aVar, double d) {
        aVar.setMinValue(d);
    }

    @C1595a(defaultDouble = 0.0d, name = "step")
    public void setStep(C1794a aVar, double d) {
        aVar.setStep(d);
    }

    @C1595a(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(C1794a aVar, Integer num) {
        if (num == null) {
            aVar.getThumb().clearColorFilter();
        } else {
            aVar.getThumb().setColorFilter(num.intValue(), Mode.SRC_IN);
        }
    }

    @C1595a(defaultDouble = 0.0d, name = "value")
    public void setValue(C1794a aVar, double d) {
        aVar.setOnSeekBarChangeListener(null);
        aVar.setValue(d);
        aVar.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }
}
