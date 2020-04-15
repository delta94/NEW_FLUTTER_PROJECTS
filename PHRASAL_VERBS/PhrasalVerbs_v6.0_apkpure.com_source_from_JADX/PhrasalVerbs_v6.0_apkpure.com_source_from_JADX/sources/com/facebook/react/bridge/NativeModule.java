package com.facebook.react.bridge;

import p032c.p033a.p096l.p097a.C1137a;

@C1137a
public interface NativeModule {

    public interface NativeMethod {
        String getType();

        void invoke(JSInstance jSInstance, ReadableArray readableArray);
    }

    boolean canOverrideExistingModule();

    String getName();

    void initialize();

    void onCatalystInstanceDestroy();
}
