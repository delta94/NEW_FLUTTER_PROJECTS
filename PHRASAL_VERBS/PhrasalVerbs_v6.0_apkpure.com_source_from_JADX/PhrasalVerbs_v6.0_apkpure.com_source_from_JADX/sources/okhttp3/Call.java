package okhttp3;

import p133e.C2002F;

public interface Call extends Cloneable {

    public interface Factory {
        Call newCall(Request request);
    }

    void cancel();

    Call clone();

    void enqueue(Callback callback);

    Response execute();

    boolean isCanceled();

    boolean isExecuted();

    Request request();

    C2002F timeout();
}
