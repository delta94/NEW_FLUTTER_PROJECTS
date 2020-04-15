package com.facebook.react.modules.clipboard;

import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.ClipboardManager;
import android.content.Context;
import com.facebook.react.bridge.ContextBaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactMethod;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "Clipboard")
public class ClipboardModule extends ContextBaseJavaModule {
    public static final String NAME = "Clipboard";

    public ClipboardModule(Context context) {
        super(context);
    }

    private ClipboardManager getClipboardService() {
        Context context = getContext();
        getContext();
        return (ClipboardManager) context.getSystemService("clipboard");
    }

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void getString(Promise promise) {
        try {
            ClipboardManager clipboardService = getClipboardService();
            ClipData primaryClip = clipboardService.getPrimaryClip();
            String str = "";
            if (primaryClip != null && primaryClip.getItemCount() >= 1) {
                Item itemAt = clipboardService.getPrimaryClip().getItemAt(0);
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(itemAt.getText());
                promise.resolve(sb.toString());
                return;
            }
            promise.resolve(str);
        } catch (Exception e) {
            promise.reject((Throwable) e);
        }
    }

    @ReactMethod
    public void setString(String str) {
        getClipboardService().setPrimaryClip(ClipData.newPlainText(null, str));
    }
}
