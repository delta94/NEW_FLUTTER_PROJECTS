package com.facebook.react.modules.websocket;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.websocket.WebSocketModule.C1563a;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import p133e.C2015j;

/* renamed from: com.facebook.react.modules.websocket.a */
class C1564a extends WebSocketListener {

    /* renamed from: a */
    final /* synthetic */ int f4751a;

    /* renamed from: b */
    final /* synthetic */ WebSocketModule f4752b;

    C1564a(WebSocketModule webSocketModule, int i) {
        this.f4752b = webSocketModule;
        this.f4751a = i;
    }

    public void onClosed(WebSocket webSocket, int i, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", this.f4751a);
        createMap.putInt("code", i);
        createMap.putString("reason", str);
        this.f4752b.sendEvent("websocketClosed", createMap);
    }

    public void onClosing(WebSocket webSocket, int i, String str) {
        webSocket.close(i, str);
    }

    public void onFailure(WebSocket webSocket, Throwable th, Response response) {
        this.f4752b.notifyWebSocketFailed(this.f4751a, th.getMessage());
    }

    public void onMessage(WebSocket webSocket, C2015j jVar) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", this.f4751a);
        createMap.putString("type", "binary");
        C1563a aVar = (C1563a) this.f4752b.mContentHandlers.get(Integer.valueOf(this.f4751a));
        if (aVar != null) {
            aVar.mo5290a(jVar, createMap);
        } else {
            createMap.putString("data", jVar.mo7038a());
        }
        this.f4752b.sendEvent("websocketMessage", createMap);
    }

    public void onMessage(WebSocket webSocket, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", this.f4751a);
        createMap.putString("type", "text");
        C1563a aVar = (C1563a) this.f4752b.mContentHandlers.get(Integer.valueOf(this.f4751a));
        if (aVar != null) {
            aVar.mo5291a(str, createMap);
        } else {
            createMap.putString("data", str);
        }
        this.f4752b.sendEvent("websocketMessage", createMap);
    }

    public void onOpen(WebSocket webSocket, Response response) {
        this.f4752b.mWebSocketConnections.put(Integer.valueOf(this.f4751a), webSocket);
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", this.f4751a);
        this.f4752b.sendEvent("websocketOpen", createMap);
    }
}
