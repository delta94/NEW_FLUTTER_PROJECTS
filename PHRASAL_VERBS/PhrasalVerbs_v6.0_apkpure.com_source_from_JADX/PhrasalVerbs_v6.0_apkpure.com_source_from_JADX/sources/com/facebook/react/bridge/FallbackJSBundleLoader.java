package com.facebook.react.bridge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import p032c.p033a.p038c.p043e.C0727a;

public final class FallbackJSBundleLoader extends JSBundleLoader {
    static final String RECOVERABLE = "facebook::react::Recoverable";
    static final String TAG = "FallbackJSBundleLoader";
    private Stack<JSBundleLoader> mLoaders = new Stack<>();
    private final ArrayList<Exception> mRecoveredErrors = new ArrayList<>();

    public FallbackJSBundleLoader(List<JSBundleLoader> list) {
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            this.mLoaders.push(listIterator.previous());
        }
    }

    private JSBundleLoader getDelegateLoader() {
        if (!this.mLoaders.empty()) {
            return (JSBundleLoader) this.mLoaders.peek();
        }
        Throwable runtimeException = new RuntimeException("No fallback options available");
        Iterator it = this.mRecoveredErrors.iterator();
        Throwable th = runtimeException;
        while (it.hasNext()) {
            th.initCause((Exception) it.next());
            while (th.getCause() != null) {
                th = th.getCause();
            }
        }
        throw runtimeException;
    }

    public String loadScript(JSBundleLoaderDelegate jSBundleLoaderDelegate) {
        while (true) {
            try {
                return getDelegateLoader().loadScript(jSBundleLoaderDelegate);
            } catch (Exception e) {
                if (e.getMessage() == null || !e.getMessage().startsWith(RECOVERABLE)) {
                    throw e;
                }
                this.mLoaders.pop();
                this.mRecoveredErrors.add(e);
                C0727a.m3282c(TAG, "Falling back from recoverable error", (Throwable) e);
            }
        }
        throw e;
    }
}
