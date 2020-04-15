package com.facebook.react.views.progressbar;

import android.content.Context;
import android.widget.ProgressBar;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C1578N;
import com.facebook.react.uimanager.p121a.C1595a;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "AndroidProgressBar")
public class ReactProgressBarViewManager extends BaseViewManager<C1775a, C1776b> {
    static final String DEFAULT_STYLE = "Normal";
    static final String PROP_ANIMATING = "animating";
    static final String PROP_INDETERMINATE = "indeterminate";
    static final String PROP_PROGRESS = "progress";
    static final String PROP_STYLE = "styleAttr";
    public static final String REACT_CLASS = "AndroidProgressBar";
    private static Object sProgressBarCtorLock = new Object();

    public static ProgressBar createProgressBar(Context context, int i) {
        ProgressBar progressBar;
        synchronized (sProgressBarCtorLock) {
            progressBar = new ProgressBar(context, null, i);
        }
        return progressBar;
    }

    static int getStyleFromString(String str) {
        if (str == null) {
            throw new JSApplicationIllegalArgumentException("ProgressBar needs to have a style, null received");
        } else if (str.equals("Horizontal")) {
            return 16842872;
        } else {
            if (str.equals("Small")) {
                return 16842873;
            }
            if (str.equals("Large")) {
                return 16842874;
            }
            if (str.equals("Inverse")) {
                return 16843399;
            }
            if (str.equals("SmallInverse")) {
                return 16843400;
            }
            if (str.equals("LargeInverse")) {
                return 16843401;
            }
            if (str.equals(DEFAULT_STYLE)) {
                return 16842871;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown ProgressBar style: ");
            sb.append(str);
            throw new JSApplicationIllegalArgumentException(sb.toString());
        }
    }

    public C1776b createShadowNodeInstance() {
        return new C1776b();
    }

    /* access modifiers changed from: protected */
    public C1775a createViewInstance(C1578N n) {
        return new C1775a(n);
    }

    public String getName() {
        return REACT_CLASS;
    }

    public Class<C1776b> getShadowNodeClass() {
        return C1776b.class;
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(C1775a aVar) {
        aVar.mo6171a();
    }

    @C1595a(name = "animating")
    public void setAnimating(C1775a aVar, boolean z) {
        aVar.mo6175a(z);
    }

    @C1595a(customType = "Color", name = "color")
    public void setColor(C1775a aVar, Integer num) {
        aVar.mo6173a(num);
    }

    @C1595a(name = "indeterminate")
    public void setIndeterminate(C1775a aVar, boolean z) {
        aVar.mo6176b(z);
    }

    @C1595a(name = "progress")
    public void setProgress(C1775a aVar, double d) {
        aVar.mo6172a(d);
    }

    @C1595a(name = "styleAttr")
    public void setStyle(C1775a aVar, String str) {
        aVar.mo6174a(str);
    }

    public void updateExtraData(C1775a aVar, Object obj) {
    }
}
