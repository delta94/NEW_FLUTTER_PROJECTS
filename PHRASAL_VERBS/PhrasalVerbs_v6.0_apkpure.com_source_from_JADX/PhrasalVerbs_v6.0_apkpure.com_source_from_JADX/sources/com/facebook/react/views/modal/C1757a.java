package com.facebook.react.views.modal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import p032c.p033a.p094k.p095a.C1136a;

/* renamed from: com.facebook.react.views.modal.a */
class C1757a {

    /* renamed from: a */
    private static final Point f5185a = new Point();

    /* renamed from: b */
    private static final Point f5186b = new Point();

    /* renamed from: c */
    private static final Point f5187c = new Point();

    /* renamed from: a */
    public static Point m6765a(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        C1136a.m5053a(windowManager);
        Display defaultDisplay = windowManager.getDefaultDisplay();
        defaultDisplay.getCurrentSizeRange(f5185a, f5186b);
        defaultDisplay.getSize(f5187c);
        int i = 0;
        boolean z = context.getTheme().obtainStyledAttributes(new int[]{16843277}).getBoolean(0, false);
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (z && identifier > 0) {
            i = (int) resources.getDimension(identifier);
        }
        Point point = f5187c;
        return point.x < point.y ? new Point(f5185a.x, f5186b.y + i) : new Point(f5186b.x, f5185a.y + i);
    }
}
