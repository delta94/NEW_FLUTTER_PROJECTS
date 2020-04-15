package okhttp3.internal.http;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import p133e.C2014i;

public final class RealResponseBody extends ResponseBody {
    private final long contentLength;
    private final String contentTypeString;
    private final C2014i source;

    public RealResponseBody(String str, long j, C2014i iVar) {
        this.contentTypeString = str;
        this.contentLength = j;
        this.source = iVar;
    }

    public long contentLength() {
        return this.contentLength;
    }

    public MediaType contentType() {
        String str = this.contentTypeString;
        if (str != null) {
            return MediaType.parse(str);
        }
        return null;
    }

    public C2014i source() {
        return this.source;
    }
}
