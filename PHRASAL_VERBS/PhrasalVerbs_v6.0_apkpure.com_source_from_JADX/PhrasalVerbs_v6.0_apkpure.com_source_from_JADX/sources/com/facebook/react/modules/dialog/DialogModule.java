package com.facebook.react.modules.dialog;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.support.p029v4.app.C0281l;
import android.support.p029v4.app.C0287p;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.C1397f;
import java.util.Map;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "DialogManagerAndroid")
public class DialogModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    static final String ACTION_BUTTON_CLICKED = "buttonClicked";
    static final String ACTION_DISMISSED = "dismissed";
    static final Map<String, Object> CONSTANTS = C1397f.m5739a(ACTION_BUTTON_CLICKED, ACTION_BUTTON_CLICKED, ACTION_DISMISSED, ACTION_DISMISSED, KEY_BUTTON_POSITIVE, Integer.valueOf(-1), KEY_BUTTON_NEGATIVE, Integer.valueOf(-2), KEY_BUTTON_NEUTRAL, Integer.valueOf(-3));
    static final String FRAGMENT_TAG = "com.facebook.catalyst.react.dialog.DialogModule";
    static final String KEY_BUTTON_NEGATIVE = "buttonNegative";
    static final String KEY_BUTTON_NEUTRAL = "buttonNeutral";
    static final String KEY_BUTTON_POSITIVE = "buttonPositive";
    static final String KEY_CANCELABLE = "cancelable";
    static final String KEY_ITEMS = "items";
    static final String KEY_MESSAGE = "message";
    static final String KEY_TITLE = "title";
    public static final String NAME = "DialogManagerAndroid";
    /* access modifiers changed from: private */
    public boolean mIsInForeground;

    /* renamed from: com.facebook.react.modules.dialog.DialogModule$a */
    class C1481a implements OnClickListener, OnDismissListener {

        /* renamed from: a */
        private final Callback f4576a;

        /* renamed from: b */
        private boolean f4577b = false;

        public C1481a(Callback callback) {
            this.f4576a = callback;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (!this.f4577b && DialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                this.f4576a.invoke(DialogModule.ACTION_BUTTON_CLICKED, Integer.valueOf(i));
                this.f4577b = true;
            }
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (!this.f4577b && DialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                this.f4576a.invoke(DialogModule.ACTION_DISMISSED);
                this.f4577b = true;
            }
        }
    }

    /* renamed from: com.facebook.react.modules.dialog.DialogModule$b */
    private class C1482b {

        /* renamed from: a */
        private final FragmentManager f4579a;

        /* renamed from: b */
        private final C0287p f4580b;

        /* renamed from: c */
        private Object f4581c;

        public C1482b(FragmentManager fragmentManager) {
            this.f4579a = fragmentManager;
            this.f4580b = null;
        }

        public C1482b(C0287p pVar) {
            this.f4579a = null;
            this.f4580b = pVar;
        }

        /* renamed from: b */
        private void m5917b() {
            boolean c = m5918c();
            String str = DialogModule.FRAGMENT_TAG;
            if (c) {
                C1485c cVar = (C1485c) this.f4580b.mo1143a(str);
                if (cVar != null && cVar.mo975F()) {
                    cVar.mo956ba();
                    return;
                }
                return;
            }
            C1483a aVar = (C1483a) this.f4579a.findFragmentByTag(str);
            if (aVar != null && aVar.isResumed()) {
                aVar.dismiss();
            }
        }

        /* renamed from: c */
        private boolean m5918c() {
            return this.f4580b != null;
        }

        /* renamed from: a */
        public void mo5378a() {
            UiThreadUtil.assertOnUiThread();
            if (this.f4581c != null) {
                boolean c = m5918c();
                String str = DialogModule.FRAGMENT_TAG;
                if (c) {
                    ((C1485c) this.f4581c).mo954a(this.f4580b, str);
                } else {
                    ((C1483a) this.f4581c).show(this.f4579a, str);
                }
                this.f4581c = null;
            }
        }

        /* JADX WARNING: type inference failed for: r6v2, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r6v3, types: [android.app.DialogFragment, com.facebook.react.modules.dialog.a] */
        /* JADX WARNING: type inference failed for: r6v4, types: [android.support.v4.app.f, com.facebook.react.modules.dialog.c] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r6v3, types: [android.app.DialogFragment, com.facebook.react.modules.dialog.a]
          assigns: [com.facebook.react.modules.dialog.a, com.facebook.react.modules.dialog.c]
          uses: [android.app.DialogFragment, java.lang.Object, android.support.v4.app.f]
          mth insns count: 33
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo5379a(boolean r4, android.os.Bundle r5, com.facebook.react.bridge.Callback r6) {
            /*
                r3 = this;
                com.facebook.react.bridge.UiThreadUtil.assertOnUiThread()
                r3.m5917b()
                if (r6 == 0) goto L_0x0010
                com.facebook.react.modules.dialog.DialogModule$a r0 = new com.facebook.react.modules.dialog.DialogModule$a
                com.facebook.react.modules.dialog.DialogModule r1 = com.facebook.react.modules.dialog.DialogModule.this
                r0.<init>(r6)
                goto L_0x0011
            L_0x0010:
                r0 = 0
            L_0x0011:
                boolean r6 = r3.m5918c()
                java.lang.String r1 = "com.facebook.catalyst.react.dialog.DialogModule"
                java.lang.String r2 = "cancelable"
                if (r6 == 0) goto L_0x003d
                com.facebook.react.modules.dialog.c r6 = new com.facebook.react.modules.dialog.c
                r6.<init>(r0, r5)
                if (r4 == 0) goto L_0x0057
                android.support.v4.app.p r4 = r3.f4580b
                boolean r4 = r4.mo1147c()
                if (r4 != 0) goto L_0x0057
                boolean r4 = r5.containsKey(r2)
                if (r4 == 0) goto L_0x0037
                boolean r4 = r5.getBoolean(r2)
                r6.mo962h(r4)
            L_0x0037:
                android.support.v4.app.p r4 = r3.f4580b
                r6.mo954a(r4, r1)
                goto L_0x0059
            L_0x003d:
                com.facebook.react.modules.dialog.a r6 = new com.facebook.react.modules.dialog.a
                r6.<init>(r0, r5)
                if (r4 == 0) goto L_0x0057
                boolean r4 = r5.containsKey(r2)
                if (r4 == 0) goto L_0x0051
                boolean r4 = r5.getBoolean(r2)
                r6.setCancelable(r4)
            L_0x0051:
                android.app.FragmentManager r4 = r3.f4579a
                r6.show(r4, r1)
                goto L_0x0059
            L_0x0057:
                r3.f4581c = r6
            L_0x0059:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.dialog.DialogModule.C1482b.mo5379a(boolean, android.os.Bundle, com.facebook.react.bridge.Callback):void");
        }
    }

    public DialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private C1482b getFragmentManagerHelper() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return null;
        }
        return currentActivity instanceof C0281l ? new C1482b(((C0281l) currentActivity).mo1076e()) : new C1482b(currentActivity.getFragmentManager());
    }

    public Map<String, Object> getConstants() {
        return CONSTANTS;
    }

    public String getName() {
        return NAME;
    }

    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    public void onHostDestroy() {
    }

    public void onHostPause() {
        this.mIsInForeground = false;
    }

    public void onHostResume() {
        this.mIsInForeground = true;
        C1482b fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper != null) {
            fragmentManagerHelper.mo5378a();
        } else {
            C0727a.m3278c(DialogModule.class, "onHostResume called but no FragmentManager found");
        }
    }

    @ReactMethod
    public void showAlert(ReadableMap readableMap, Callback callback, Callback callback2) {
        C1482b fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper == null) {
            callback.invoke("Tried to show an alert while not attached to an Activity");
            return;
        }
        Bundle bundle = new Bundle();
        String str = KEY_TITLE;
        if (readableMap.hasKey(str)) {
            bundle.putString(str, readableMap.getString(str));
        }
        String str2 = KEY_MESSAGE;
        if (readableMap.hasKey(str2)) {
            bundle.putString(str2, readableMap.getString(str2));
        }
        String str3 = KEY_BUTTON_POSITIVE;
        if (readableMap.hasKey(str3)) {
            bundle.putString("button_positive", readableMap.getString(str3));
        }
        String str4 = KEY_BUTTON_NEGATIVE;
        if (readableMap.hasKey(str4)) {
            bundle.putString("button_negative", readableMap.getString(str4));
        }
        String str5 = KEY_BUTTON_NEUTRAL;
        if (readableMap.hasKey(str5)) {
            bundle.putString("button_neutral", readableMap.getString(str5));
        }
        String str6 = KEY_ITEMS;
        if (readableMap.hasKey(str6)) {
            ReadableArray array = readableMap.getArray(str6);
            CharSequence[] charSequenceArr = new CharSequence[array.size()];
            for (int i = 0; i < array.size(); i++) {
                charSequenceArr[i] = array.getString(i);
            }
            bundle.putCharSequenceArray(str6, charSequenceArr);
        }
        String str7 = KEY_CANCELABLE;
        if (readableMap.hasKey(str7)) {
            bundle.putBoolean(str7, readableMap.getBoolean(str7));
        }
        UiThreadUtil.runOnUiThread(new C1484b(this, fragmentManagerHelper, bundle, callback2));
    }
}
