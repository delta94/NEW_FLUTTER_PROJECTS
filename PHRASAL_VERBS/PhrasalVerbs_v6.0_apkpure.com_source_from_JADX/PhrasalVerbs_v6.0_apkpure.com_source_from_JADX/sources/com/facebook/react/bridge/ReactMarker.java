package com.facebook.react.bridge;

import java.util.ArrayList;
import java.util.List;
import p032c.p033a.p096l.p097a.C1137a;

@C1137a
public class ReactMarker {
    private static final List<MarkerListener> sListeners = new ArrayList();

    public interface MarkerListener {
        void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i);
    }

    @C1137a
    public static void addListener(MarkerListener markerListener) {
        synchronized (sListeners) {
            if (!sListeners.contains(markerListener)) {
                sListeners.add(markerListener);
            }
        }
    }

    @C1137a
    public static void clearMarkerListeners() {
        synchronized (sListeners) {
            sListeners.clear();
        }
    }

    @C1137a
    public static void logMarker(ReactMarkerConstants reactMarkerConstants) {
        logMarker(reactMarkerConstants, (String) null, 0);
    }

    @C1137a
    public static void logMarker(ReactMarkerConstants reactMarkerConstants, int i) {
        logMarker(reactMarkerConstants, (String) null, i);
    }

    @C1137a
    public static void logMarker(ReactMarkerConstants reactMarkerConstants, String str) {
        logMarker(reactMarkerConstants, str, 0);
    }

    @C1137a
    public static void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i) {
        synchronized (sListeners) {
            for (MarkerListener logMarker : sListeners) {
                logMarker.logMarker(reactMarkerConstants, str, i);
            }
        }
    }

    @C1137a
    public static void logMarker(String str) {
        logMarker(str, (String) null);
    }

    @C1137a
    public static void logMarker(String str, int i) {
        logMarker(str, (String) null, i);
    }

    @C1137a
    public static void logMarker(String str, String str2) {
        logMarker(str, str2, 0);
    }

    @C1137a
    public static void logMarker(String str, String str2, int i) {
        logMarker(ReactMarkerConstants.valueOf(str), str2, i);
    }

    @C1137a
    public static void removeListener(MarkerListener markerListener) {
        synchronized (sListeners) {
            sListeners.remove(markerListener);
        }
    }
}
