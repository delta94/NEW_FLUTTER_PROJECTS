package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.uimanager.C1569E;
import com.facebook.yoga.YogaMeasureMode;
import java.util.Map;
import p032c.p033a.p098m.p107g.C1209a;
import p032c.p033a.p098m.p107g.C1212d;

public abstract class ViewManager<T extends View, C extends C1569E> extends BaseJavaModule {
    /* access modifiers changed from: protected */
    public void addEventEmitters(C1578N n, T t) {
    }

    public C createShadowNodeInstance() {
        throw new RuntimeException("ViewManager subclasses must implement createShadowNodeInstance()");
    }

    public C createShadowNodeInstance(ReactApplicationContext reactApplicationContext) {
        return createShadowNodeInstance();
    }

    public final T createView(C1578N n, C1209a aVar) {
        T createViewInstance = createViewInstance(n);
        addEventEmitters(n, createViewInstance);
        if (createViewInstance instanceof C1212d) {
            ((C1212d) createViewInstance).setOnInterceptTouchEventListener(aVar);
        }
        return createViewInstance;
    }

    /* access modifiers changed from: protected */
    public abstract T createViewInstance(C1578N n);

    public Map<String, Integer> getCommandsMap() {
        return null;
    }

    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedViewConstants() {
        return null;
    }

    public abstract String getName();

    public Map<String, String> getNativeProps() {
        return C1693na.m6548a(getClass(), getShadowNodeClass());
    }

    public abstract Class<? extends C> getShadowNodeClass();

    public long measure(ReactContext reactContext, ReadableNativeMap readableNativeMap, ReadableNativeMap readableNativeMap2, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(T t) {
    }

    public void onDropViewInstance(T t) {
    }

    public void receiveCommand(T t, int i, ReadableArray readableArray) {
    }

    public abstract void updateExtraData(T t, Object obj);

    public Object updateLocalData(T t, C1571G g, C1571G g2) {
        return null;
    }

    public final void updateProperties(T t, C1571G g) {
        C1693na.m6551a(this, t, g);
        onAfterUpdateTransaction(t);
    }
}
