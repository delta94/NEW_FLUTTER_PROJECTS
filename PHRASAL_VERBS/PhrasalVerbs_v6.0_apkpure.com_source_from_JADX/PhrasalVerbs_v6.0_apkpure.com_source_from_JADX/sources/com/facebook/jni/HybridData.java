package com.facebook.jni;

import com.facebook.jni.C1300b.C1301a;
import com.facebook.soloader.SoLoader;
import p032c.p033a.p096l.p097a.C1137a;

@C1137a
public class HybridData {
    @C1137a
    private Destructor mDestructor = new Destructor(this);

    public static class Destructor extends C1301a {
        @C1137a
        private long mNativePointer;

        Destructor(Object obj) {
            super(obj);
        }

        static native void deleteNative(long j);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4795a() {
            deleteNative(this.mNativePointer);
            this.mNativePointer = 0;
        }
    }

    static {
        SoLoader.m7253a("fb");
    }

    /* renamed from: a */
    public synchronized void mo4794a() {
        this.mDestructor.mo4795a();
    }
}
