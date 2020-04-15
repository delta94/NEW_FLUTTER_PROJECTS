package com.facebook.react.views.text;

import android.text.TextUtils.TruncateAt;
import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C1726w;
import com.facebook.react.uimanager.p121a.C1595a;
import com.facebook.react.uimanager.p121a.C1596b;
import com.facebook.react.views.text.C1818h;
import com.facebook.yoga.C1943a;

public abstract class ReactTextAnchorViewManager<T extends View, C extends C1818h> extends BaseViewManager<T, C> {
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};

    @C1596b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(C1832t tVar, int i, Integer num) {
        float f = Float.NaN;
        float intValue = num == null ? Float.NaN : (float) (num.intValue() & 16777215);
        if (num != null) {
            f = (float) (num.intValue() >>> 24);
        }
        tVar.mo6422a(SPACING_TYPES[i], intValue, f);
    }

    @C1596b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(C1832t tVar, int i, float f) {
        if (!C1943a.m7432a(f)) {
            f = C1726w.m6668b(f);
        }
        if (i == 0) {
            tVar.setBorderRadius(f);
        } else {
            tVar.mo6420a(f, i - 1);
        }
    }

    @C1595a(name = "borderStyle")
    public void setBorderStyle(C1832t tVar, String str) {
        tVar.setBorderStyle(str);
    }

    @C1596b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(C1832t tVar, int i, float f) {
        if (!C1943a.m7432a(f)) {
            f = C1726w.m6668b(f);
        }
        tVar.mo6421a(SPACING_TYPES[i], f);
    }

    @C1595a(defaultBoolean = false, name = "disabled")
    public void setDisabled(C1832t tVar, boolean z) {
        tVar.setEnabled(!z);
    }

    @C1595a(name = "ellipsizeMode")
    public void setEllipsizeMode(C1832t tVar, String str) {
        TruncateAt truncateAt;
        if (str == null || str.equals("tail")) {
            truncateAt = TruncateAt.END;
        } else if (str.equals("head")) {
            truncateAt = TruncateAt.START;
        } else if (str.equals("middle")) {
            truncateAt = TruncateAt.MIDDLE;
        } else if (str.equals("clip")) {
            truncateAt = null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid ellipsizeMode: ");
            sb.append(str);
            throw new JSApplicationIllegalArgumentException(sb.toString());
        }
        tVar.setEllipsizeLocation(truncateAt);
    }

    @C1595a(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(C1832t tVar, boolean z) {
        tVar.setIncludeFontPadding(z);
    }

    @C1595a(defaultInt = Integer.MAX_VALUE, name = "numberOfLines")
    public void setNumberOfLines(C1832t tVar, int i) {
        tVar.setNumberOfLines(i);
    }

    @C1595a(name = "selectable")
    public void setSelectable(C1832t tVar, boolean z) {
        tVar.setTextIsSelectable(z);
    }

    @C1595a(customType = "Color", name = "selectionColor")
    public void setSelectionColor(C1832t tVar, Integer num) {
        tVar.setHighlightColor(num == null ? C1812d.m6914b(tVar.getContext()) : num.intValue());
    }

    @C1595a(name = "textAlignVertical")
    public void setTextAlignVertical(C1832t tVar, String str) {
        int i;
        if (str == null || "auto".equals(str)) {
            i = 0;
        } else if ("top".equals(str)) {
            i = 48;
        } else if ("bottom".equals(str)) {
            i = 80;
        } else if ("center".equals(str)) {
            i = 16;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid textAlignVertical: ");
            sb.append(str);
            throw new JSApplicationIllegalArgumentException(sb.toString());
        }
        tVar.setGravityVertical(i);
    }
}
