package okhttp3;

import p133e.C2015j;

public interface WebSocket {

    public interface Factory {
        WebSocket newWebSocket(Request request, WebSocketListener webSocketListener);
    }

    void cancel();

    boolean close(int i, String str);

    long queueSize();

    Request request();

    boolean send(C2015j jVar);

    boolean send(String str);
}
