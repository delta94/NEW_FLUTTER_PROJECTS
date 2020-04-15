package com.swmansion.gesturehandler.react;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.uimanager.C1578N;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.p121a.C1595a;

public class RNGestureHandlerButtonViewManager extends ViewGroupManager<C1971a> {

    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a */
    static class C1971a extends ViewGroup {

        /* renamed from: a */
        static TypedValue f5881a = new TypedValue();

        /* renamed from: b */
        static C1971a f5882b;

        /* renamed from: c */
        int f5883c = 0;

        /* renamed from: d */
        Integer f5884d;

        /* renamed from: e */
        boolean f5885e = false;

        /* renamed from: f */
        boolean f5886f = false;

        /* renamed from: g */
        float f5887g = 0.0f;

        /* renamed from: h */
        boolean f5888h = false;

        public C1971a(Context context) {
            super(context);
            setClickable(true);
            setFocusable(true);
            this.f5888h = true;
        }

        /* renamed from: a */
        private Drawable m7479a() {
            int i = VERSION.SDK_INT;
            getContext().getTheme().resolveAttribute(getResources().getIdentifier((!this.f5886f || i < 21) ? "selectableItemBackground" : "selectableItemBackgroundBorderless", "attr", "android"), f5881a, true);
            return i >= 21 ? getResources().getDrawable(f5881a.resourceId, getContext().getTheme()) : getResources().getDrawable(f5881a.resourceId);
        }

        /* renamed from: a */
        private Drawable m7480a(Drawable drawable) {
            Integer num = this.f5884d;
            if (num != null && drawable != null && VERSION.SDK_INT >= 21 && (drawable instanceof RippleDrawable)) {
                ((RippleDrawable) drawable).setColor(new ColorStateList(new int[][]{new int[]{16842910}}, new int[]{num.intValue()}));
            }
            return drawable;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m7482b() {
            if (this.f5888h) {
                this.f5888h = false;
                if (this.f5883c == 0) {
                    setBackground(null);
                }
                if (VERSION.SDK_INT >= 23) {
                    setForeground(null);
                }
                if (this.f5885e && VERSION.SDK_INT >= 23) {
                    Drawable a = m7479a();
                    m7480a(a);
                    setForeground(a);
                    int i = this.f5883c;
                    if (i != 0) {
                        setBackgroundColor(i);
                    }
                } else if (this.f5883c == 0 && this.f5884d == null) {
                    setBackground(m7479a());
                } else {
                    PaintDrawable paintDrawable = new PaintDrawable(this.f5883c);
                    Drawable a2 = m7479a();
                    float f = this.f5887g;
                    if (f != 0.0f) {
                        paintDrawable.setCornerRadius(f);
                        if (VERSION.SDK_INT >= 21 && (a2 instanceof RippleDrawable)) {
                            PaintDrawable paintDrawable2 = new PaintDrawable(-1);
                            paintDrawable2.setCornerRadius(this.f5887g);
                            ((RippleDrawable) a2).setDrawableByLayerId(16908334, paintDrawable2);
                        }
                    }
                    m7480a(a2);
                    setBackground(new LayerDrawable(new Drawable[]{paintDrawable, a2}));
                }
            }
        }

        /* renamed from: a */
        public void mo6978a(float f) {
            this.f5887g = f * getResources().getDisplayMetrics().density;
            this.f5888h = true;
        }

        /* renamed from: a */
        public void mo6979a(Integer num) {
            this.f5884d = num;
            this.f5888h = true;
        }

        /* renamed from: a */
        public void mo6980a(boolean z) {
            this.f5886f = z;
        }

        /* renamed from: b */
        public void mo6981b(boolean z) {
            this.f5885e = z;
            this.f5888h = true;
        }

        public void dispatchDrawableHotspotChanged(float f, float f2) {
        }

        public void drawableHotspotChanged(float f, float f2) {
            C1971a aVar = f5882b;
            if (aVar == null || aVar == this) {
                super.drawableHotspotChanged(f, f2);
            }
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (super.onInterceptTouchEvent(motionEvent)) {
                return true;
            }
            onTouchEvent(motionEvent);
            return isPressed();
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        public void setBackgroundColor(int i) {
            this.f5883c = i;
            this.f5888h = true;
        }

        public void setPressed(boolean z) {
            if (z && f5882b == null) {
                f5882b = this;
            }
            if (!z || f5882b == this) {
                super.setPressed(z);
            }
            if (!z && f5882b == this) {
                f5882b = null;
            }
        }
    }

    public C1971a createViewInstance(C1578N n) {
        return new C1971a(n);
    }

    public String getName() {
        return "RNGestureHandlerButton";
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(C1971a aVar) {
        aVar.m7482b();
    }

    @C1595a(name = "borderRadius")
    public void setBorderRadius(C1971a aVar, float f) {
        aVar.mo6978a(f);
    }

    @C1595a(name = "borderless")
    public void setBorderless(C1971a aVar, boolean z) {
        aVar.mo6980a(z);
    }

    @C1595a(name = "enabled")
    public void setEnabled(C1971a aVar, boolean z) {
        aVar.setEnabled(z);
    }

    @C1595a(name = "foreground")
    @TargetApi(23)
    public void setForeground(C1971a aVar, boolean z) {
        aVar.mo6981b(z);
    }

    @C1595a(name = "rippleColor")
    public void setRippleColor(C1971a aVar, Integer num) {
        aVar.mo6979a(num);
    }
}
