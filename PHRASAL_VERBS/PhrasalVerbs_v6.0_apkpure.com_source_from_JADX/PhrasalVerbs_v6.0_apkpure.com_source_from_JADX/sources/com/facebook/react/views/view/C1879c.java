package com.facebook.react.views.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.TypedValue;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;

/* renamed from: com.facebook.react.views.view.c */
public class C1879c {

    /* renamed from: a */
    private static final TypedValue f5584a = new TypedValue();

    @TargetApi(21)
    /* renamed from: a */
    public static Drawable m7127a(Context context, ReadableMap readableMap) {
        int i;
        String string = readableMap.getString("type");
        if ("ThemeAttrAndroid".equals(string)) {
            String string2 = readableMap.getString("attribute");
            SoftAssertions.assertNotNull(string2);
            int identifier = context.getResources().getIdentifier(string2, "attr", "android");
            String str = "Attribute ";
            if (identifier == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(string2);
                sb.append(" couldn't be found in the resource list");
                throw new JSApplicationIllegalArgumentException(sb.toString());
            } else if (context.getTheme().resolveAttribute(identifier, f5584a, true)) {
                return VERSION.SDK_INT >= 21 ? context.getResources().getDrawable(f5584a.resourceId, context.getTheme()) : context.getResources().getDrawable(f5584a.resourceId);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(string2);
                sb2.append(" couldn't be resolved into a drawable");
                throw new JSApplicationIllegalArgumentException(sb2.toString());
            }
        } else if (!"RippleAndroid".equals(string)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Invalid type for android drawable: ");
            sb3.append(string);
            throw new JSApplicationIllegalArgumentException(sb3.toString());
        } else if (VERSION.SDK_INT >= 21) {
            String str2 = "color";
            if (readableMap.hasKey(str2) && !readableMap.isNull(str2)) {
                i = readableMap.getInt(str2);
            } else if (context.getTheme().resolveAttribute(16843820, f5584a, true)) {
                i = context.getResources().getColor(f5584a.resourceId);
            } else {
                throw new JSApplicationIllegalArgumentException("Attribute colorControlHighlight couldn't be resolved into a drawable");
            }
            String str3 = "borderless";
            return new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{i}), null, (!readableMap.hasKey(str3) || readableMap.isNull(str3) || !readableMap.getBoolean(str3)) ? new ColorDrawable(-1) : null);
        } else {
            throw new JSApplicationIllegalArgumentException("Ripple drawable is not available on android API <21");
        }
    }
}
