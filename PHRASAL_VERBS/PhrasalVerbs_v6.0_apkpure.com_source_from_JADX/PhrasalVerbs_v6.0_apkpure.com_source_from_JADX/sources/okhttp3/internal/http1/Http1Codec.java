package okhttp3.internal.http1;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.Headers.Builder;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import p133e.C1999C;
import p133e.C2000D;
import p133e.C2002F;
import p133e.C2011g;
import p133e.C2013h;
import p133e.C2014i;
import p133e.C2018m;
import p133e.C2025t;

public final class Http1Codec implements HttpCodec {
    private static final int HEADER_LIMIT = 262144;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    final OkHttpClient client;
    private long headerLimit = 262144;
    final C2013h sink;
    final C2014i source;
    int state = 0;
    final StreamAllocation streamAllocation;

    private abstract class AbstractSource implements C2000D {
        protected long bytesRead;
        protected boolean closed;
        protected final C2018m timeout;

        private AbstractSource() {
            this.timeout = new C2018m(Http1Codec.this.source.timeout());
            this.bytesRead = 0;
        }

        /* access modifiers changed from: protected */
        public final void endOfInput(boolean z, IOException iOException) {
            Http1Codec http1Codec = Http1Codec.this;
            int i = http1Codec.state;
            if (i != 6) {
                if (i == 5) {
                    http1Codec.detachTimeout(this.timeout);
                    Http1Codec http1Codec2 = Http1Codec.this;
                    http1Codec2.state = 6;
                    StreamAllocation streamAllocation = http1Codec2.streamAllocation;
                    if (streamAllocation != null) {
                        streamAllocation.streamFinished(!z, http1Codec2, this.bytesRead, iOException);
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("state: ");
                sb.append(Http1Codec.this.state);
                throw new IllegalStateException(sb.toString());
            }
        }

        public long read(C2011g gVar, long j) {
            try {
                long read = Http1Codec.this.source.read(gVar, j);
                if (read > 0) {
                    this.bytesRead += read;
                }
                return read;
            } catch (IOException e) {
                endOfInput(false, e);
                throw e;
            }
        }

        public C2002F timeout() {
            return this.timeout;
        }
    }

    private final class ChunkedSink implements C1999C {
        private boolean closed;
        private final C2018m timeout = new C2018m(Http1Codec.this.sink.timeout());

        ChunkedSink() {
        }

        public synchronized void close() {
            if (!this.closed) {
                this.closed = true;
                Http1Codec.this.sink.mo7100a("0\r\n\r\n");
                Http1Codec.this.detachTimeout(this.timeout);
                Http1Codec.this.state = 3;
            }
        }

        public synchronized void flush() {
            if (!this.closed) {
                Http1Codec.this.sink.flush();
            }
        }

        public C2002F timeout() {
            return this.timeout;
        }

        public void write(C2011g gVar, long j) {
            if (this.closed) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                Http1Codec.this.sink.mo7116c(j);
                String str = "\r\n";
                Http1Codec.this.sink.mo7100a(str);
                Http1Codec.this.sink.write(gVar, j);
                Http1Codec.this.sink.mo7100a(str);
            }
        }
    }

    private class ChunkedSource extends AbstractSource {
        private static final long NO_CHUNK_YET = -1;
        private long bytesRemainingInChunk = NO_CHUNK_YET;
        private boolean hasMoreChunks = true;
        private final HttpUrl url;

        ChunkedSource(HttpUrl httpUrl) {
            super();
            this.url = httpUrl;
        }

        private void readChunkSize() {
            if (this.bytesRemainingInChunk != NO_CHUNK_YET) {
                Http1Codec.this.source.mo7127g();
            }
            try {
                this.bytesRemainingInChunk = Http1Codec.this.source.mo7136k();
                String trim = Http1Codec.this.source.mo7127g().trim();
                if (this.bytesRemainingInChunk < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("expected chunk size and optional extensions but was \"");
                    sb.append(this.bytesRemainingInChunk);
                    sb.append(trim);
                    sb.append("\"");
                    throw new ProtocolException(sb.toString());
                } else if (this.bytesRemainingInChunk == 0) {
                    this.hasMoreChunks = false;
                    HttpHeaders.receiveHeaders(Http1Codec.this.client.cookieJar(), this.url, Http1Codec.this.readHeaders());
                    endOfInput(true, null);
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        public void close() {
            if (!this.closed) {
                if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    endOfInput(false, null);
                }
                this.closed = true;
            }
        }

        public long read(C2011g gVar, long j) {
            if (j < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (this.closed) {
                throw new IllegalStateException("closed");
            } else if (!this.hasMoreChunks) {
                return NO_CHUNK_YET;
            } else {
                long j2 = this.bytesRemainingInChunk;
                if (j2 == 0 || j2 == NO_CHUNK_YET) {
                    readChunkSize();
                    if (!this.hasMoreChunks) {
                        return NO_CHUNK_YET;
                    }
                }
                long read = super.read(gVar, Math.min(j, this.bytesRemainingInChunk));
                if (read != NO_CHUNK_YET) {
                    this.bytesRemainingInChunk -= read;
                    return read;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                endOfInput(false, protocolException);
                throw protocolException;
            }
        }
    }

    private final class FixedLengthSink implements C1999C {
        private long bytesRemaining;
        private boolean closed;
        private final C2018m timeout = new C2018m(Http1Codec.this.sink.timeout());

        FixedLengthSink(long j) {
            this.bytesRemaining = j;
        }

        public void close() {
            if (!this.closed) {
                this.closed = true;
                if (this.bytesRemaining <= 0) {
                    Http1Codec.this.detachTimeout(this.timeout);
                    Http1Codec.this.state = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }

        public void flush() {
            if (!this.closed) {
                Http1Codec.this.sink.flush();
            }
        }

        public C2002F timeout() {
            return this.timeout;
        }

        public void write(C2011g gVar, long j) {
            if (!this.closed) {
                Util.checkOffsetAndCount(gVar.size(), 0, j);
                if (j <= this.bytesRemaining) {
                    Http1Codec.this.sink.write(gVar, j);
                    this.bytesRemaining -= j;
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("expected ");
                sb.append(this.bytesRemaining);
                sb.append(" bytes but received ");
                sb.append(j);
                throw new ProtocolException(sb.toString());
            }
            throw new IllegalStateException("closed");
        }
    }

    private class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;

        FixedLengthSource(long j) {
            super();
            this.bytesRemaining = j;
            if (this.bytesRemaining == 0) {
                endOfInput(true, null);
            }
        }

        public void close() {
            if (!this.closed) {
                if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    endOfInput(false, null);
                }
                this.closed = true;
            }
        }

        public long read(C2011g gVar, long j) {
            if (j < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (!this.closed) {
                long j2 = this.bytesRemaining;
                if (j2 == 0) {
                    return -1;
                }
                long read = super.read(gVar, Math.min(j2, j));
                if (read != -1) {
                    this.bytesRemaining -= read;
                    if (this.bytesRemaining == 0) {
                        endOfInput(true, null);
                    }
                    return read;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                endOfInput(false, protocolException);
                throw protocolException;
            } else {
                throw new IllegalStateException("closed");
            }
        }
    }

    private class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;

        UnknownLengthSource() {
            super();
        }

        public void close() {
            if (!this.closed) {
                if (!this.inputExhausted) {
                    endOfInput(false, null);
                }
                this.closed = true;
            }
        }

        public long read(C2011g gVar, long j) {
            if (j < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (this.closed) {
                throw new IllegalStateException("closed");
            } else if (this.inputExhausted) {
                return -1;
            } else {
                long read = super.read(gVar, j);
                if (read != -1) {
                    return read;
                }
                this.inputExhausted = true;
                endOfInput(true, null);
                return -1;
            }
        }
    }

    public Http1Codec(OkHttpClient okHttpClient, StreamAllocation streamAllocation2, C2014i iVar, C2013h hVar) {
        this.client = okHttpClient;
        this.streamAllocation = streamAllocation2;
        this.source = iVar;
        this.sink = hVar;
    }

    private String readHeaderLine() {
        String b = this.source.mo7114b(this.headerLimit);
        this.headerLimit -= (long) b.length();
        return b;
    }

    public void cancel() {
        RealConnection connection = this.streamAllocation.connection();
        if (connection != null) {
            connection.cancel();
        }
    }

    public C1999C createRequestBody(Request request, long j) {
        if ("chunked".equalsIgnoreCase(request.header("Transfer-Encoding"))) {
            return newChunkedSink();
        }
        if (j != -1) {
            return newFixedLengthSink(j);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    /* access modifiers changed from: 0000 */
    public void detachTimeout(C2018m mVar) {
        C2002F a = mVar.mo7169a();
        mVar.mo7170a(C2002F.NONE);
        a.clearDeadline();
        a.clearTimeout();
    }

    public void finishRequest() {
        this.sink.flush();
    }

    public void flushRequest() {
        this.sink.flush();
    }

    public boolean isClosed() {
        return this.state == 6;
    }

    public C1999C newChunkedSink() {
        if (this.state == 1) {
            this.state = 2;
            return new ChunkedSink();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.state);
        throw new IllegalStateException(sb.toString());
    }

    public C2000D newChunkedSource(HttpUrl httpUrl) {
        if (this.state == 4) {
            this.state = 5;
            return new ChunkedSource(httpUrl);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.state);
        throw new IllegalStateException(sb.toString());
    }

    public C1999C newFixedLengthSink(long j) {
        if (this.state == 1) {
            this.state = 2;
            return new FixedLengthSink(j);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.state);
        throw new IllegalStateException(sb.toString());
    }

    public C2000D newFixedLengthSource(long j) {
        if (this.state == 4) {
            this.state = 5;
            return new FixedLengthSource(j);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.state);
        throw new IllegalStateException(sb.toString());
    }

    public C2000D newUnknownLengthSource() {
        if (this.state == 4) {
            StreamAllocation streamAllocation2 = this.streamAllocation;
            if (streamAllocation2 != null) {
                this.state = 5;
                streamAllocation2.noNewStreams();
                return new UnknownLengthSource();
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.state);
        throw new IllegalStateException(sb.toString());
    }

    public ResponseBody openResponseBody(Response response) {
        StreamAllocation streamAllocation2 = this.streamAllocation;
        streamAllocation2.eventListener.responseBodyStart(streamAllocation2.call);
        String header = response.header("Content-Type");
        if (!HttpHeaders.hasBody(response)) {
            return new RealResponseBody(header, 0, C2025t.m7756a(newFixedLengthSource(0)));
        }
        if ("chunked".equalsIgnoreCase(response.header("Transfer-Encoding"))) {
            return new RealResponseBody(header, -1, C2025t.m7756a(newChunkedSource(response.request().url())));
        }
        long contentLength = HttpHeaders.contentLength(response);
        return contentLength != -1 ? new RealResponseBody(header, contentLength, C2025t.m7756a(newFixedLengthSource(contentLength))) : new RealResponseBody(header, -1, C2025t.m7756a(newUnknownLengthSource()));
    }

    public Headers readHeaders() {
        Builder builder = new Builder();
        while (true) {
            String readHeaderLine = readHeaderLine();
            if (readHeaderLine.length() == 0) {
                return builder.build();
            }
            Internal.instance.addLenient(builder, readHeaderLine);
        }
    }

    public Response.Builder readResponseHeaders(boolean z) {
        int i = this.state;
        if (i == 1 || i == 3) {
            try {
                StatusLine parse = StatusLine.parse(readHeaderLine());
                Response.Builder headers = new Response.Builder().protocol(parse.protocol).code(parse.code).message(parse.message).headers(readHeaders());
                if (z && parse.code == 100) {
                    return null;
                }
                if (parse.code == 100) {
                    this.state = 3;
                    return headers;
                }
                this.state = 4;
                return headers;
            } catch (EOFException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected end of stream on ");
                sb.append(this.streamAllocation);
                IOException iOException = new IOException(sb.toString());
                iOException.initCause(e);
                throw iOException;
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("state: ");
            sb2.append(this.state);
            throw new IllegalStateException(sb2.toString());
        }
    }

    public void writeRequest(Headers headers, String str) {
        if (this.state == 0) {
            String str2 = "\r\n";
            this.sink.mo7100a(str).mo7100a(str2);
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                this.sink.mo7100a(headers.name(i)).mo7100a(": ").mo7100a(headers.value(i)).mo7100a(str2);
            }
            this.sink.mo7100a(str2);
            this.state = 1;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.state);
        throw new IllegalStateException(sb.toString());
    }

    public void writeRequestHeaders(Request request) {
        writeRequest(request.headers(), RequestLine.get(request, this.streamAllocation.connection().route().proxy().type()));
    }
}
