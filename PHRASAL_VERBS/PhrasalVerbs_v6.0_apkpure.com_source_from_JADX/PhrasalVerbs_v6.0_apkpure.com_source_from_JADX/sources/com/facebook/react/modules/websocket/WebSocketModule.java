package com.facebook.react.modules.websocket;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter;
import com.facebook.react.modules.network.C1516i;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.WebSocket;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p098m.p102d.p103a.C1176a;
import p133e.C2015j;

@C1176a(hasConstants = false, name = "WebSocketModule")
public final class WebSocketModule extends ReactContextBaseJavaModule {
    public static final String NAME = "WebSocketModule";
    /* access modifiers changed from: private */
    public final Map<Integer, C1563a> mContentHandlers = new ConcurrentHashMap();
    private C1516i mCookieHandler;
    private ReactContext mReactContext;
    /* access modifiers changed from: private */
    public final Map<Integer, WebSocket> mWebSocketConnections = new ConcurrentHashMap();

    /* renamed from: com.facebook.react.modules.websocket.WebSocketModule$a */
    public interface C1563a {
        /* renamed from: a */
        void mo5290a(C2015j jVar, WritableMap writableMap);

        /* renamed from: a */
        void mo5291a(String str, WritableMap writableMap);
    }

    public WebSocketModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mReactContext = reactApplicationContext;
        this.mCookieHandler = new C1516i(reactApplicationContext);
    }

    private String getCookie(String str) {
        try {
            List list = (List) this.mCookieHandler.get(new URI(getDefaultOrigin(str)), new HashMap()).get("Cookie");
            if (list != null) {
                if (!list.isEmpty()) {
                    return (String) list.get(0);
                }
            }
            return null;
        } catch (IOException | URISyntaxException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to get cookie from ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d A[Catch:{ URISyntaxException -> 0x0097 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0089 A[Catch:{ URISyntaxException -> 0x0097 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getDefaultOrigin(java.lang.String r7) {
        /*
            java.lang.String r0 = ""
            java.net.URI r1 = new java.net.URI     // Catch:{ URISyntaxException -> 0x0097 }
            r1.<init>(r7)     // Catch:{ URISyntaxException -> 0x0097 }
            java.lang.String r2 = r1.getScheme()     // Catch:{ URISyntaxException -> 0x0097 }
            java.lang.String r3 = "wss"
            boolean r2 = r2.equals(r3)     // Catch:{ URISyntaxException -> 0x0097 }
            java.lang.String r3 = "https"
            if (r2 == 0) goto L_0x0025
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ URISyntaxException -> 0x0097 }
            r2.<init>()     // Catch:{ URISyntaxException -> 0x0097 }
            r2.append(r0)     // Catch:{ URISyntaxException -> 0x0097 }
            r2.append(r3)     // Catch:{ URISyntaxException -> 0x0097 }
        L_0x0020:
            java.lang.String r0 = r2.toString()     // Catch:{ URISyntaxException -> 0x0097 }
            goto L_0x0063
        L_0x0025:
            java.lang.String r2 = r1.getScheme()     // Catch:{ URISyntaxException -> 0x0097 }
            java.lang.String r4 = "ws"
            boolean r2 = r2.equals(r4)     // Catch:{ URISyntaxException -> 0x0097 }
            java.lang.String r4 = "http"
            if (r2 == 0) goto L_0x003f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ URISyntaxException -> 0x0097 }
            r2.<init>()     // Catch:{ URISyntaxException -> 0x0097 }
            r2.append(r0)     // Catch:{ URISyntaxException -> 0x0097 }
            r2.append(r4)     // Catch:{ URISyntaxException -> 0x0097 }
            goto L_0x0020
        L_0x003f:
            java.lang.String r2 = r1.getScheme()     // Catch:{ URISyntaxException -> 0x0097 }
            boolean r2 = r2.equals(r4)     // Catch:{ URISyntaxException -> 0x0097 }
            if (r2 != 0) goto L_0x0053
            java.lang.String r2 = r1.getScheme()     // Catch:{ URISyntaxException -> 0x0097 }
            boolean r2 = r2.equals(r3)     // Catch:{ URISyntaxException -> 0x0097 }
            if (r2 == 0) goto L_0x0063
        L_0x0053:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ URISyntaxException -> 0x0097 }
            r2.<init>()     // Catch:{ URISyntaxException -> 0x0097 }
            r2.append(r0)     // Catch:{ URISyntaxException -> 0x0097 }
            java.lang.String r0 = r1.getScheme()     // Catch:{ URISyntaxException -> 0x0097 }
            r2.append(r0)     // Catch:{ URISyntaxException -> 0x0097 }
            goto L_0x0020
        L_0x0063:
            int r2 = r1.getPort()     // Catch:{ URISyntaxException -> 0x0097 }
            r3 = -1
            r4 = 1
            r5 = 0
            r6 = 2
            if (r2 == r3) goto L_0x0089
            java.lang.String r2 = "%s://%s:%s"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ URISyntaxException -> 0x0097 }
            r3[r5] = r0     // Catch:{ URISyntaxException -> 0x0097 }
            java.lang.String r0 = r1.getHost()     // Catch:{ URISyntaxException -> 0x0097 }
            r3[r4] = r0     // Catch:{ URISyntaxException -> 0x0097 }
            int r0 = r1.getPort()     // Catch:{ URISyntaxException -> 0x0097 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ URISyntaxException -> 0x0097 }
            r3[r6] = r0     // Catch:{ URISyntaxException -> 0x0097 }
        L_0x0084:
            java.lang.String r7 = java.lang.String.format(r2, r3)     // Catch:{ URISyntaxException -> 0x0097 }
            goto L_0x0096
        L_0x0089:
            java.lang.String r2 = "%s://%s"
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ URISyntaxException -> 0x0097 }
            r3[r5] = r0     // Catch:{ URISyntaxException -> 0x0097 }
            java.lang.String r0 = r1.getHost()     // Catch:{ URISyntaxException -> 0x0097 }
            r3[r4] = r0     // Catch:{ URISyntaxException -> 0x0097 }
            goto L_0x0084
        L_0x0096:
            return r7
        L_0x0097:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to set "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = " as default origin header"
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.websocket.WebSocketModule.getDefaultOrigin(java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: private */
    public void notifyWebSocketFailed(int i, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", i);
        createMap.putString("message", str);
        sendEvent("websocketFailed", createMap);
    }

    /* access modifiers changed from: private */
    public void sendEvent(String str, WritableMap writableMap) {
        ((RCTDeviceEventEmitter) this.mReactContext.getJSModule(RCTDeviceEventEmitter.class)).emit(str, writableMap);
    }

    @ReactMethod
    public void close(int i, String str, int i2) {
        WebSocket webSocket = (WebSocket) this.mWebSocketConnections.get(Integer.valueOf(i2));
        if (webSocket != null) {
            try {
                webSocket.close(i, str);
                this.mWebSocketConnections.remove(Integer.valueOf(i2));
                this.mContentHandlers.remove(Integer.valueOf(i2));
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not close WebSocket connection for id ");
                sb.append(i2);
                C0727a.m3267a("ReactNative", sb.toString(), (Throwable) e);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e4  */
    @com.facebook.react.bridge.ReactMethod
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void connect(java.lang.String r7, com.facebook.react.bridge.ReadableArray r8, com.facebook.react.bridge.ReadableMap r9, int r10) {
        /*
            r6 = this;
            okhttp3.OkHttpClient$Builder r0 = new okhttp3.OkHttpClient$Builder
            r0.<init>()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            r2 = 10
            okhttp3.OkHttpClient$Builder r0 = r0.connectTimeout(r2, r1)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            okhttp3.OkHttpClient$Builder r0 = r0.writeTimeout(r2, r1)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MINUTES
            r2 = 0
            okhttp3.OkHttpClient$Builder r0 = r0.readTimeout(r2, r1)
            okhttp3.OkHttpClient r0 = r0.build()
            okhttp3.Request$Builder r1 = new okhttp3.Request$Builder
            r1.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            okhttp3.Request$Builder r1 = r1.tag(r2)
            okhttp3.Request$Builder r1 = r1.url(r7)
            java.lang.String r2 = r6.getCookie(r7)
            if (r2 == 0) goto L_0x003b
            java.lang.String r3 = "Cookie"
            r1.addHeader(r3, r2)
        L_0x003b:
            java.lang.String r2 = "origin"
            if (r9 == 0) goto L_0x00a2
            java.lang.String r3 = "headers"
            boolean r4 = r9.hasKey(r3)
            if (r4 == 0) goto L_0x00a2
            com.facebook.react.bridge.ReadableType r4 = r9.getType(r3)
            com.facebook.react.bridge.ReadableType r5 = com.facebook.react.bridge.ReadableType.Map
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00a2
            com.facebook.react.bridge.ReadableMap r9 = r9.getMap(r3)
            com.facebook.react.bridge.ReadableMapKeySetIterator r3 = r9.keySetIterator()
            boolean r4 = r9.hasKey(r2)
            if (r4 != 0) goto L_0x0068
            java.lang.String r7 = getDefaultOrigin(r7)
            r1.addHeader(r2, r7)
        L_0x0068:
            boolean r7 = r3.hasNextKey()
            if (r7 == 0) goto L_0x00a9
            java.lang.String r7 = r3.nextKey()
            com.facebook.react.bridge.ReadableType r2 = com.facebook.react.bridge.ReadableType.String
            com.facebook.react.bridge.ReadableType r4 = r9.getType(r7)
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0086
            java.lang.String r2 = r9.getString(r7)
            r1.addHeader(r7, r2)
            goto L_0x0068
        L_0x0086:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Ignoring: requested "
            r2.append(r4)
            r2.append(r7)
            java.lang.String r7 = ", value not a string"
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            java.lang.String r2 = "ReactNative"
            p032c.p033a.p038c.p043e.C0727a.m3284d(r2, r7)
            goto L_0x0068
        L_0x00a2:
            java.lang.String r7 = getDefaultOrigin(r7)
            r1.addHeader(r2, r7)
        L_0x00a9:
            if (r8 == 0) goto L_0x00fa
            int r7 = r8.size()
            if (r7 <= 0) goto L_0x00fa
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = ""
            r7.<init>(r9)
            r2 = 0
        L_0x00b9:
            int r3 = r8.size()
            if (r2 >= r3) goto L_0x00de
            java.lang.String r3 = r8.getString(r2)
            java.lang.String r3 = r3.trim()
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L_0x00db
            java.lang.String r4 = ","
            boolean r5 = r3.contains(r4)
            if (r5 != 0) goto L_0x00db
            r7.append(r3)
            r7.append(r4)
        L_0x00db:
            int r2 = r2 + 1
            goto L_0x00b9
        L_0x00de:
            int r8 = r7.length()
            if (r8 <= 0) goto L_0x00fa
            int r8 = r7.length()
            int r8 = r8 + -1
            int r2 = r7.length()
            r7.replace(r8, r2, r9)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "Sec-WebSocket-Protocol"
            r1.addHeader(r8, r7)
        L_0x00fa:
            okhttp3.Request r7 = r1.build()
            com.facebook.react.modules.websocket.a r8 = new com.facebook.react.modules.websocket.a
            r8.<init>(r6, r10)
            r0.newWebSocket(r7, r8)
            okhttp3.Dispatcher r7 = r0.dispatcher()
            java.util.concurrent.ExecutorService r7 = r7.executorService()
            r7.shutdown()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.websocket.WebSocketModule.connect(java.lang.String, com.facebook.react.bridge.ReadableArray, com.facebook.react.bridge.ReadableMap, int):void");
    }

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void ping(int i) {
        WebSocket webSocket = (WebSocket) this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            WritableMap createMap = Arguments.createMap();
            String str = "id";
            createMap.putInt(str, i);
            String str2 = "client is null";
            createMap.putString("message", str2);
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt(str, i);
            createMap2.putInt("code", 0);
            createMap2.putString("reason", str2);
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
            return;
        }
        try {
            webSocket.send(C2015j.f5937b);
        } catch (Exception e) {
            notifyWebSocketFailed(i, e.getMessage());
        }
    }

    @ReactMethod
    public void send(String str, int i) {
        WebSocket webSocket = (WebSocket) this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            WritableMap createMap = Arguments.createMap();
            String str2 = "id";
            createMap.putInt(str2, i);
            String str3 = "client is null";
            createMap.putString("message", str3);
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt(str2, i);
            createMap2.putInt("code", 0);
            createMap2.putString("reason", str3);
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
            return;
        }
        try {
            webSocket.send(str);
        } catch (Exception e) {
            notifyWebSocketFailed(i, e.getMessage());
        }
    }

    public void sendBinary(C2015j jVar, int i) {
        WebSocket webSocket = (WebSocket) this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            WritableMap createMap = Arguments.createMap();
            String str = "id";
            createMap.putInt(str, i);
            String str2 = "client is null";
            createMap.putString("message", str2);
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt(str, i);
            createMap2.putInt("code", 0);
            createMap2.putString("reason", str2);
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
            return;
        }
        try {
            webSocket.send(jVar);
        } catch (Exception e) {
            notifyWebSocketFailed(i, e.getMessage());
        }
    }

    @ReactMethod
    public void sendBinary(String str, int i) {
        WebSocket webSocket = (WebSocket) this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            WritableMap createMap = Arguments.createMap();
            String str2 = "id";
            createMap.putInt(str2, i);
            String str3 = "client is null";
            createMap.putString("message", str3);
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt(str2, i);
            createMap2.putInt("code", 0);
            createMap2.putString("reason", str3);
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
            return;
        }
        try {
            webSocket.send(C2015j.m7717a(str));
        } catch (Exception e) {
            notifyWebSocketFailed(i, e.getMessage());
        }
    }

    public void setContentHandler(int i, C1563a aVar) {
        if (aVar != null) {
            this.mContentHandlers.put(Integer.valueOf(i), aVar);
        } else {
            this.mContentHandlers.remove(Integer.valueOf(i));
        }
    }
}
