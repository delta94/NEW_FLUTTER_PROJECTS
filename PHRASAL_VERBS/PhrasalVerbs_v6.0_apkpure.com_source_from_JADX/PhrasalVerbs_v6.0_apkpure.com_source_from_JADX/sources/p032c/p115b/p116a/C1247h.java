package p032c.p115b.p116a;

import android.view.MotionEvent;

/* renamed from: c.b.a.h */
public class C1247h {
    /* renamed from: a */
    public static float m5357a(MotionEvent motionEvent, boolean z) {
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        int actionIndex = motionEvent.getActionMasked() == 6 ? motionEvent.getActionIndex() : -1;
        if (z) {
            float f = 0.0f;
            int pointerCount = motionEvent.getPointerCount();
            int i = 0;
            for (int i2 = 0; i2 < pointerCount; i2++) {
                if (i2 != actionIndex) {
                    f += motionEvent.getX(i2) + rawX;
                    i++;
                }
            }
            return f / ((float) i);
        }
        int pointerCount2 = motionEvent.getPointerCount() - 1;
        if (pointerCount2 == actionIndex) {
            pointerCount2--;
        }
        return motionEvent.getX(pointerCount2) + rawX;
    }

    /* renamed from: b */
    public static float m5358b(MotionEvent motionEvent, boolean z) {
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        int actionIndex = motionEvent.getActionMasked() == 6 ? motionEvent.getActionIndex() : -1;
        if (z) {
            float f = 0.0f;
            int pointerCount = motionEvent.getPointerCount();
            int i = 0;
            for (int i2 = 0; i2 < pointerCount; i2++) {
                if (i2 != actionIndex) {
                    f += motionEvent.getY(i2) + rawY;
                    i++;
                }
            }
            return f / ((float) i);
        }
        int pointerCount2 = motionEvent.getPointerCount() - 1;
        if (pointerCount2 == actionIndex) {
            pointerCount2--;
        }
        return motionEvent.getY(pointerCount2) + rawY;
    }
}
