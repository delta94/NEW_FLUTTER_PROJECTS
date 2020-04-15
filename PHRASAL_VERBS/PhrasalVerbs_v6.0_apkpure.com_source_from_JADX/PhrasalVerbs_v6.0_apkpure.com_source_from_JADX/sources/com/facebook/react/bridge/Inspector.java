package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p096l.p097a.C1137a;

@C1137a
public class Inspector {
    private final HybridData mHybridData;

    @C1137a
    public static class LocalConnection {
        private final HybridData mHybridData;

        private LocalConnection(HybridData hybridData) {
            this.mHybridData = hybridData;
        }

        public native void disconnect();

        public native void sendMessage(String str);
    }

    @C1137a
    public static class Page {
        private final int mId;
        private final String mTitle;
        private final String mVM;

        @C1137a
        private Page(int i, String str, String str2) {
            this.mId = i;
            this.mTitle = str;
            this.mVM = str2;
        }

        public int getId() {
            return this.mId;
        }

        public String getTitle() {
            return this.mTitle;
        }

        public String getVM() {
            return this.mVM;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Page{mId=");
            sb.append(this.mId);
            sb.append(", mTitle='");
            sb.append(this.mTitle);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

    @C1137a
    public interface RemoteConnection {
        @C1137a
        void onDisconnect();

        @C1137a
        void onMessage(String str);
    }

    static {
        ReactBridge.staticInit();
    }

    private Inspector(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public static LocalConnection connect(int i, RemoteConnection remoteConnection) {
        try {
            return instance().connectNative(i, remoteConnection);
        } catch (UnsatisfiedLinkError e) {
            C0727a.m3267a("ReactNative", "Inspector doesn't work in open source yet", (Throwable) e);
            throw new RuntimeException(e);
        }
    }

    private native LocalConnection connectNative(int i, RemoteConnection remoteConnection);

    public static List<Page> getPages() {
        try {
            return Arrays.asList(instance().getPagesNative());
        } catch (UnsatisfiedLinkError e) {
            C0727a.m3267a("ReactNative", "Inspector doesn't work in open source yet", (Throwable) e);
            return Collections.emptyList();
        }
    }

    private native Page[] getPagesNative();

    private static native Inspector instance();
}
