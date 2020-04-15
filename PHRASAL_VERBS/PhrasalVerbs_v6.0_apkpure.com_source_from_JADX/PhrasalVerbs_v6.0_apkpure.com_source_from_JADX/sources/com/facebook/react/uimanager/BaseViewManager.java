package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.C1601c.C1602a;
import com.facebook.react.uimanager.C1691n;
import com.facebook.react.uimanager.C1699o.C1700a;
import com.facebook.react.uimanager.p121a.C1595a;
import com.facebook.react.uimanager.p124d.C1627a;
import p000a.p005b.p009c.p018g.C0156v;
import p032c.p033a.p098m.C1226m;

public abstract class BaseViewManager<T extends View, C extends C1691n> extends ViewManager<T, C> {
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = ((float) Math.sqrt(5.0d));
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    private static final String PROP_ACCESSIBILITY_COMPONENT_TYPE = "accessibilityComponentType";
    private static final String PROP_ACCESSIBILITY_HINT = "accessibilityHint";
    private static final String PROP_ACCESSIBILITY_LABEL = "accessibilityLabel";
    private static final String PROP_ACCESSIBILITY_LIVE_REGION = "accessibilityLiveRegion";
    private static final String PROP_ACCESSIBILITY_ROLE = "accessibilityRole";
    private static final String PROP_ACCESSIBILITY_STATES = "accessibilityStates";
    private static final String PROP_BACKGROUND_COLOR = "backgroundColor";
    private static final String PROP_ELEVATION = "elevation";
    private static final String PROP_IMPORTANT_FOR_ACCESSIBILITY = "importantForAccessibility";
    public static final String PROP_NATIVE_ID = "nativeID";
    private static final String PROP_RENDER_TO_HARDWARE_TEXTURE = "renderToHardwareTextureAndroid";
    private static final String PROP_ROTATION = "rotation";
    private static final String PROP_SCALE_X = "scaleX";
    private static final String PROP_SCALE_Y = "scaleY";
    public static final String PROP_TEST_ID = "testID";
    private static final String PROP_TRANSFORM = "transform";
    private static final String PROP_TRANSLATE_X = "translateX";
    private static final String PROP_TRANSLATE_Y = "translateY";
    private static final String PROP_Z_INDEX = "zIndex";
    private static C1700a sMatrixDecompositionContext = new C1700a();
    private static double[] sTransformDecompositionArray = new double[16];

    private static void resetTransformProperty(View view) {
        view.setTranslationX(C1726w.m6668b(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        view.setTranslationY(C1726w.m6668b(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        view.setRotation(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        view.setRotationX(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        view.setRotationY(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setCameraDistance(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    }

    private static void setTransformProperty(View view, ReadableArray readableArray) {
        C1581Q.m6271a(readableArray, sTransformDecompositionArray);
        C1699o.m6566a(sTransformDecompositionArray, sMatrixDecompositionContext);
        view.setTranslationX(C1726w.m6668b((float) sMatrixDecompositionContext.f5054d[0]));
        view.setTranslationY(C1726w.m6668b((float) sMatrixDecompositionContext.f5054d[1]));
        view.setRotation((float) sMatrixDecompositionContext.f5055e[2]);
        view.setRotationX((float) sMatrixDecompositionContext.f5055e[0]);
        view.setRotationY((float) sMatrixDecompositionContext.f5055e[1]);
        view.setScaleX((float) sMatrixDecompositionContext.f5052b[0]);
        view.setScaleY((float) sMatrixDecompositionContext.f5052b[1]);
        double[] dArr = sMatrixDecompositionContext.f5051a;
        if (dArr.length > 2) {
            float f = (float) dArr[2];
            if (f == CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                f = 7.8125E-4f;
            }
            float f2 = -1.0f / f;
            float f3 = C1654h.m6466a().density;
            view.setCameraDistance(f3 * f3 * f2 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
    }

    private void updateViewAccessibility(T t) {
        C1601c.m6345a(t);
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(T t) {
        super.onAfterUpdateTransaction(t);
        updateViewAccessibility(t);
    }

    @C1595a(name = "accessibilityComponentType")
    public void setAccessibilityComponentType(T t, String str) {
        C1652g.m6465a((View) t, str);
    }

    @C1595a(name = "accessibilityHint")
    public void setAccessibilityHint(T t, String str) {
        t.setTag(C1226m.accessibility_hint, str);
    }

    @C1595a(name = "accessibilityLabel")
    public void setAccessibilityLabel(T t, String str) {
        t.setContentDescription(str);
    }

    @C1595a(name = "accessibilityLiveRegion")
    public void setAccessibilityLiveRegion(T t, String str) {
        int i;
        if (str == null || str.equals("none")) {
            i = 0;
        } else if (str.equals("polite")) {
            i = 1;
        } else if (str.equals("assertive")) {
            i = 2;
        } else {
            return;
        }
        C0156v.m558c(t, i);
    }

    @C1595a(name = "accessibilityRole")
    public void setAccessibilityRole(T t, String str) {
        if (str != null) {
            t.setTag(C1226m.accessibility_role, C1602a.m6346a(str));
        }
    }

    @C1595a(customType = "Color", defaultInt = 0, name = "backgroundColor")
    public void setBackgroundColor(T t, int i) {
        t.setBackgroundColor(i);
    }

    @C1595a(name = "elevation")
    public void setElevation(T t, float f) {
        C0156v.m540a((View) t, C1726w.m6668b(f));
    }

    @C1595a(name = "importantForAccessibility")
    public void setImportantForAccessibility(T t, String str) {
        int i;
        if (str == null || str.equals("auto")) {
            i = 0;
        } else if (str.equals("yes")) {
            i = 1;
        } else if (str.equals("no")) {
            i = 2;
        } else if (str.equals("no-hide-descendants")) {
            i = 4;
        } else {
            return;
        }
        C0156v.m560d(t, i);
    }

    @C1595a(name = "nativeID")
    public void setNativeId(T t, String str) {
        t.setTag(C1226m.view_tag_native_id, str);
        C1627a.m6382a(t);
    }

    @C1595a(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(T t, float f) {
        t.setAlpha(f);
    }

    @C1595a(name = "renderToHardwareTextureAndroid")
    public void setRenderToHardwareTexture(T t, boolean z) {
        t.setLayerType(z ? 2 : 0, null);
    }

    @C1595a(name = "rotation")
    @Deprecated
    public void setRotation(T t, float f) {
        t.setRotation(f);
    }

    @C1595a(defaultFloat = 1.0f, name = "scaleX")
    @Deprecated
    public void setScaleX(T t, float f) {
        t.setScaleX(f);
    }

    @C1595a(defaultFloat = 1.0f, name = "scaleY")
    @Deprecated
    public void setScaleY(T t, float f) {
        t.setScaleY(f);
    }

    @C1595a(name = "testID")
    public void setTestId(T t, String str) {
        t.setTag(C1226m.react_test_id, str);
        t.setTag(str);
    }

    @C1595a(name = "transform")
    public void setTransform(T t, ReadableArray readableArray) {
        if (readableArray == null) {
            resetTransformProperty(t);
        } else {
            setTransformProperty(t, readableArray);
        }
    }

    @C1595a(defaultFloat = 0.0f, name = "translateX")
    @Deprecated
    public void setTranslateX(T t, float f) {
        t.setTranslationX(C1726w.m6668b(f));
    }

    @C1595a(defaultFloat = 0.0f, name = "translateY")
    @Deprecated
    public void setTranslateY(T t, float f) {
        t.setTranslationY(C1726w.m6668b(f));
    }

    @C1595a(name = "accessibilityStates")
    public void setViewStates(T t, ReadableArray readableArray) {
        t.setSelected(false);
        t.setEnabled(true);
        if (readableArray != null) {
            for (int i = 0; i < readableArray.size(); i++) {
                String string = readableArray.getString(i);
                if (string.equals("selected")) {
                    t.setSelected(true);
                } else if (string.equals("disabled")) {
                    t.setEnabled(false);
                }
            }
        }
    }

    @C1595a(name = "zIndex")
    public void setZIndex(T t, float f) {
        ViewGroupManager.setViewZIndex(t, Math.round(f));
        ViewParent parent = t.getParent();
        if (parent != null && (parent instanceof C1573I)) {
            ((C1573I) parent).mo5680b();
        }
    }
}
