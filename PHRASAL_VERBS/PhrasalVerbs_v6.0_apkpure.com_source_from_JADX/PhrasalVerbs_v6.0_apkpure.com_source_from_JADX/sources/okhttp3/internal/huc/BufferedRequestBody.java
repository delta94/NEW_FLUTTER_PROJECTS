package okhttp3.internal.huc;

import okhttp3.Request;
import p133e.C2011g;
import p133e.C2013h;

final class BufferedRequestBody extends OutputStreamRequestBody {
    final C2011g buffer = new C2011g();
    long contentLength = -1;

    BufferedRequestBody(long j) {
        initOutputStream(this.buffer, j);
    }

    public long contentLength() {
        return this.contentLength;
    }

    public Request prepareToSendRequest(Request request) {
        String str = "Content-Length";
        if (request.header(str) != null) {
            return request;
        }
        outputStream().close();
        this.contentLength = this.buffer.size();
        return request.newBuilder().removeHeader("Transfer-Encoding").header(str, Long.toString(this.buffer.size())).build();
    }

    public void writeTo(C2013h hVar) {
        this.buffer.mo7098a(hVar.mo7097a(), 0, this.buffer.size());
    }
}
