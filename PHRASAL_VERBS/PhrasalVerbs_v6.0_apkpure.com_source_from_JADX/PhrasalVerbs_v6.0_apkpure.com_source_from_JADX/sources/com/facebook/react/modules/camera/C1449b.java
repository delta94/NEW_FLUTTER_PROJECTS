package com.facebook.react.modules.camera;

import android.media.MediaScannerConnection.OnScanCompletedListener;
import android.net.Uri;

/* renamed from: com.facebook.react.modules.camera.b */
class C1449b implements OnScanCompletedListener {

    /* renamed from: a */
    final /* synthetic */ C1444b f4501a;

    C1449b(C1444b bVar) {
        this.f4501a = bVar;
    }

    public void onScanCompleted(String str, Uri uri) {
        if (uri != null) {
            this.f4501a.f4485c.resolve(uri.toString());
        } else {
            this.f4501a.f4485c.reject("E_UNABLE_TO_SAVE", "Could not add image to gallery");
        }
    }
}
