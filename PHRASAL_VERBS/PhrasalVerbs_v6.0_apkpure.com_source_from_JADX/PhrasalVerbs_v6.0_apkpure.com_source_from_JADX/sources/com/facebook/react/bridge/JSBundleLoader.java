package com.facebook.react.bridge;

import android.content.Context;
import com.facebook.react.common.C1393b;

public abstract class JSBundleLoader {
    public static JSBundleLoader createAssetLoader(final Context context, final String str, final boolean z) {
        return new JSBundleLoader() {
            public String loadScript(JSBundleLoaderDelegate jSBundleLoaderDelegate) {
                jSBundleLoaderDelegate.loadScriptFromAssets(context.getAssets(), str, z);
                return str;
            }
        };
    }

    public static JSBundleLoader createCachedBundleFromNetworkLoader(final String str, final String str2) {
        return new JSBundleLoader() {
            public String loadScript(JSBundleLoaderDelegate jSBundleLoaderDelegate) {
                try {
                    jSBundleLoaderDelegate.loadScriptFromFile(str2, str, false);
                    return str;
                } catch (Exception e) {
                    throw C1393b.m5726a(e.getMessage(), e);
                }
            }
        };
    }

    public static JSBundleLoader createDeltaFromNetworkLoader(final String str, final NativeDeltaClient nativeDeltaClient) {
        return new JSBundleLoader() {
            public String loadScript(JSBundleLoaderDelegate jSBundleLoaderDelegate) {
                try {
                    jSBundleLoaderDelegate.loadScriptFromDeltaBundle(str, nativeDeltaClient, false);
                    return str;
                } catch (Exception e) {
                    throw C1393b.m5726a(e.getMessage(), e);
                }
            }
        };
    }

    public static JSBundleLoader createFileLoader(String str) {
        return createFileLoader(str, str, false);
    }

    public static JSBundleLoader createFileLoader(final String str, final String str2, final boolean z) {
        return new JSBundleLoader() {
            public String loadScript(JSBundleLoaderDelegate jSBundleLoaderDelegate) {
                jSBundleLoaderDelegate.loadScriptFromFile(str, str2, z);
                return str;
            }
        };
    }

    public static JSBundleLoader createRemoteDebuggerBundleLoader(final String str, final String str2) {
        return new JSBundleLoader() {
            public String loadScript(JSBundleLoaderDelegate jSBundleLoaderDelegate) {
                jSBundleLoaderDelegate.setSourceURLs(str2, str);
                return str2;
            }
        };
    }

    public abstract String loadScript(JSBundleLoaderDelegate jSBundleLoaderDelegate);
}
