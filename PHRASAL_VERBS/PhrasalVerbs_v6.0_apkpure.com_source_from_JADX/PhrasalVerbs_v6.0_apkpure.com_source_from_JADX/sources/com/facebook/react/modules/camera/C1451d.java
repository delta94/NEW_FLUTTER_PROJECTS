package com.facebook.react.modules.camera;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.facebook.react.modules.camera.d */
class C1451d implements FilenameFilter {

    /* renamed from: a */
    final /* synthetic */ C1445a f4502a;

    C1451d(C1445a aVar) {
        this.f4502a = aVar;
    }

    public boolean accept(File file, String str) {
        return str.startsWith("ReactNative_cropped_image_");
    }
}
