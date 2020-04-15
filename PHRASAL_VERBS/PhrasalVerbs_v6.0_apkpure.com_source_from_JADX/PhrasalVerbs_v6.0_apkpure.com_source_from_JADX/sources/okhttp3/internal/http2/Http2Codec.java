package okhttp3.internal.http2;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.Interceptor.Chain;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Response.Builder;
import okhttp3.ResponseBody;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import p133e.C1999C;
import p133e.C2000D;
import p133e.C2011g;
import p133e.C2015j;
import p133e.C2017l;
import p133e.C2025t;

public final class Http2Codec implements HttpCodec {
    private static final String CONNECTION = "connection";
    private static final String ENCODING = "encoding";
    private static final String HOST = "host";
    private static final List<String> HTTP_2_SKIPPED_REQUEST_HEADERS;
    private static final List<String> HTTP_2_SKIPPED_RESPONSE_HEADERS;
    private static final String KEEP_ALIVE = "keep-alive";
    private static final String PROXY_CONNECTION = "proxy-connection";

    /* renamed from: TE */
    private static final String f5982TE = "te";
    private static final String TRANSFER_ENCODING = "transfer-encoding";
    private static final String UPGRADE = "upgrade";
    private final Chain chain;
    private final Http2Connection connection;
    private final Protocol protocol;
    private Http2Stream stream;
    final StreamAllocation streamAllocation;

    class StreamFinishingSource extends C2017l {
        long bytesRead = 0;
        boolean completed = false;

        StreamFinishingSource(C2000D d) {
            super(d);
        }

        private void endOfInput(IOException iOException) {
            if (!this.completed) {
                this.completed = true;
                Http2Codec http2Codec = Http2Codec.this;
                http2Codec.streamAllocation.streamFinished(false, http2Codec, this.bytesRead, iOException);
            }
        }

        public void close() {
            super.close();
            endOfInput(null);
        }

        public long read(C2011g gVar, long j) {
            try {
                long read = delegate().read(gVar, j);
                if (read > 0) {
                    this.bytesRead += read;
                }
                return read;
            } catch (IOException e) {
                endOfInput(e);
                throw e;
            }
        }
    }

    static {
        String str = CONNECTION;
        String str2 = HOST;
        String str3 = KEEP_ALIVE;
        String str4 = PROXY_CONNECTION;
        String str5 = f5982TE;
        String str6 = TRANSFER_ENCODING;
        String str7 = ENCODING;
        HTTP_2_SKIPPED_REQUEST_HEADERS = Util.immutableList((T[]) new String[]{str, str2, str3, str4, str5, str6, str7, UPGRADE, Header.TARGET_METHOD_UTF8, Header.TARGET_PATH_UTF8, Header.TARGET_SCHEME_UTF8, Header.TARGET_AUTHORITY_UTF8});
        HTTP_2_SKIPPED_RESPONSE_HEADERS = Util.immutableList((T[]) new String[]{str, str2, str3, str4, str5, str6, str7, UPGRADE});
    }

    public Http2Codec(OkHttpClient okHttpClient, Chain chain2, StreamAllocation streamAllocation2, Http2Connection http2Connection) {
        this.chain = chain2;
        this.streamAllocation = streamAllocation2;
        this.connection = http2Connection;
        this.protocol = okHttpClient.protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE) ? Protocol.H2_PRIOR_KNOWLEDGE : Protocol.HTTP_2;
    }

    public static List<Header> http2HeadersList(Request request) {
        Headers headers = request.headers();
        ArrayList arrayList = new ArrayList(headers.size() + 4);
        arrayList.add(new Header(Header.TARGET_METHOD, request.method()));
        arrayList.add(new Header(Header.TARGET_PATH, RequestLine.requestPath(request.url())));
        String header = request.header("Host");
        if (header != null) {
            arrayList.add(new Header(Header.TARGET_AUTHORITY, header));
        }
        arrayList.add(new Header(Header.TARGET_SCHEME, request.url().scheme()));
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            C2015j c = C2015j.m7721c(headers.name(i).toLowerCase(Locale.US));
            if (!HTTP_2_SKIPPED_REQUEST_HEADERS.contains(c.mo7052j())) {
                arrayList.add(new Header(c, headers.value(i)));
            }
        }
        return arrayList;
    }

    public static Builder readHttp2HeadersList(Headers headers, Protocol protocol2) {
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        StatusLine statusLine = null;
        for (int i = 0; i < size; i++) {
            String name = headers.name(i);
            String value = headers.value(i);
            if (name.equals(Header.RESPONSE_STATUS_UTF8)) {
                StringBuilder sb = new StringBuilder();
                sb.append("HTTP/1.1 ");
                sb.append(value);
                statusLine = StatusLine.parse(sb.toString());
            } else if (!HTTP_2_SKIPPED_RESPONSE_HEADERS.contains(name)) {
                Internal.instance.addLenient(builder, name, value);
            }
        }
        if (statusLine != null) {
            return new Builder().protocol(protocol2).code(statusLine.code).message(statusLine.message).headers(builder.build());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    public void cancel() {
        Http2Stream http2Stream = this.stream;
        if (http2Stream != null) {
            http2Stream.closeLater(ErrorCode.CANCEL);
        }
    }

    public C1999C createRequestBody(Request request, long j) {
        return this.stream.getSink();
    }

    public void finishRequest() {
        this.stream.getSink().close();
    }

    public void flushRequest() {
        this.connection.flush();
    }

    public ResponseBody openResponseBody(Response response) {
        StreamAllocation streamAllocation2 = this.streamAllocation;
        streamAllocation2.eventListener.responseBodyStart(streamAllocation2.call);
        return new RealResponseBody(response.header("Content-Type"), HttpHeaders.contentLength(response), C2025t.m7756a((C2000D) new StreamFinishingSource(this.stream.getSource())));
    }

    public Builder readResponseHeaders(boolean z) {
        Builder readHttp2HeadersList = readHttp2HeadersList(this.stream.takeHeaders(), this.protocol);
        if (!z || Internal.instance.code(readHttp2HeadersList) != 100) {
            return readHttp2HeadersList;
        }
        return null;
    }

    public void writeRequestHeaders(Request request) {
        if (this.stream == null) {
            this.stream = this.connection.newStream(http2HeadersList(request), request.body() != null);
            this.stream.readTimeout().timeout((long) this.chain.readTimeoutMillis(), TimeUnit.MILLISECONDS);
            this.stream.writeTimeout().timeout((long) this.chain.writeTimeoutMillis(), TimeUnit.MILLISECONDS);
        }
    }
}
