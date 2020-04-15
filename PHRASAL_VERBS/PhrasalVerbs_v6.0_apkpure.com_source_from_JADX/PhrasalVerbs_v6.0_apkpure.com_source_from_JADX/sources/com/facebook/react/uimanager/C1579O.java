package com.facebook.react.uimanager;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.UiThreadUtil;
import p032c.p033a.p098m.p107g.C1211c;

/* renamed from: com.facebook.react.uimanager.O */
public class C1579O {

    /* renamed from: a */
    private static final float[] f4786a = new float[2];

    /* renamed from: b */
    private static final PointF f4787b = new PointF();

    /* renamed from: c */
    private static final float[] f4788c = new float[2];

    /* renamed from: d */
    private static final Matrix f4789d = new Matrix();

    /* renamed from: a */
    public static int m6263a(float f, float f2, ViewGroup viewGroup) {
        return m6264a(f, f2, viewGroup, f4786a, (int[]) null);
    }

    /* renamed from: a */
    public static int m6264a(float f, float f2, ViewGroup viewGroup, float[] fArr, int[] iArr) {
        UiThreadUtil.assertOnUiThread();
        int id = viewGroup.getId();
        fArr[0] = f;
        fArr[1] = f2;
        View a = m6268a(fArr, viewGroup);
        if (a == null) {
            return id;
        }
        View a2 = m6266a(a);
        if (a2 == null) {
            return id;
        }
        if (iArr != null) {
            iArr[0] = a2.getId();
        }
        return m6265a(a2, fArr[0], fArr[1]);
    }

    /* renamed from: a */
    private static int m6265a(View view, float f, float f2) {
        return view instanceof C1565A ? ((C1565A) view).mo5539a(f, f2) : view.getId();
    }

    /* renamed from: a */
    private static View m6266a(View view) {
        while (view != null && view.getId() <= 0) {
            view = (View) view.getParent();
        }
        return view;
    }

    /* renamed from: a */
    private static View m6267a(float[] fArr, View view) {
        C1727x pointerEvents = view instanceof C1567C ? ((C1567C) view).getPointerEvents() : C1727x.AUTO;
        if (!view.isEnabled()) {
            if (pointerEvents == C1727x.AUTO) {
                pointerEvents = C1727x.BOX_NONE;
            } else if (pointerEvents == C1727x.BOX_ONLY) {
                pointerEvents = C1727x.NONE;
            }
        }
        if (pointerEvents == C1727x.NONE) {
            return null;
        }
        if (pointerEvents == C1727x.BOX_ONLY) {
            return view;
        }
        if (pointerEvents == C1727x.BOX_NONE) {
            if (view instanceof ViewGroup) {
                View a = m6268a(fArr, (ViewGroup) view);
                if (a != view) {
                    return a;
                }
                if (!(view instanceof C1565A) || ((C1565A) view).mo5539a(fArr[0], fArr[1]) == view.getId()) {
                    return null;
                }
                return view;
            }
            return null;
        } else if (pointerEvents == C1727x.AUTO) {
            return ((!(view instanceof C1566B) || !((C1566B) view).mo5540b(fArr[0], fArr[1])) && (view instanceof ViewGroup)) ? m6268a(fArr, (ViewGroup) view) : view;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown pointer event type: ");
            sb.append(pointerEvents.toString());
            throw new JSApplicationIllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    private static View m6268a(float[] fArr, ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        C1573I i = viewGroup instanceof C1573I ? (C1573I) viewGroup : null;
        int i2 = childCount - 1;
        while (i2 >= 0) {
            View childAt = viewGroup.getChildAt(i != null ? i.mo5679a(i2) : i2);
            PointF pointF = f4787b;
            if (m6269a(fArr[0], fArr[1], viewGroup, childAt, pointF)) {
                float f = fArr[0];
                float f2 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                View a = m6267a(fArr, childAt);
                if (a != null) {
                    return a;
                }
                fArr[0] = f;
                fArr[1] = f2;
            }
            i2--;
        }
        return viewGroup;
    }

    /* renamed from: a */
    private static boolean m6269a(float f, float f2, ViewGroup viewGroup, View view, PointF pointF) {
        float scrollX = (f + ((float) viewGroup.getScrollX())) - ((float) view.getLeft());
        float scrollY = (f2 + ((float) viewGroup.getScrollY())) - ((float) view.getTop());
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr = f4788c;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            Matrix matrix2 = f4789d;
            matrix.invert(matrix2);
            matrix2.mapPoints(fArr);
            scrollX = fArr[0];
            scrollY = fArr[1];
        }
        if (view instanceof C1211c) {
            C1211c cVar = (C1211c) view;
            if (cVar.getHitSlopRect() != null) {
                Rect hitSlopRect = cVar.getHitSlopRect();
                if (scrollX < ((float) (-hitSlopRect.left)) || scrollX >= ((float) ((view.getRight() - view.getLeft()) + hitSlopRect.right)) || scrollY < ((float) (-hitSlopRect.top)) || scrollY >= ((float) ((view.getBottom() - view.getTop()) + hitSlopRect.bottom))) {
                    return false;
                }
                pointF.set(scrollX, scrollY);
                return true;
            }
        }
        if (scrollX < 0.0f || scrollX >= ((float) (view.getRight() - view.getLeft())) || scrollY < 0.0f || scrollY >= ((float) (view.getBottom() - view.getTop()))) {
            return false;
        }
        pointF.set(scrollX, scrollY);
        return true;
    }
}
