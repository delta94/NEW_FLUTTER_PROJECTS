package okhttp3.internal.huc;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import p133e.C2002F;
import p133e.C2013h;

abstract class OutputStreamRequestBody extends RequestBody {
    boolean closed;
    private long expectedContentLength;
    private OutputStream outputStream;
    private C2002F timeout;

    OutputStreamRequestBody() {
    }

    public long contentLength() {
        return this.expectedContentLength;
    }

    public final MediaType contentType() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void initOutputStream(final C2013h hVar, final long j) {
        this.timeout = hVar.timeout();
        this.expectedContentLength = j;
        this.outputStream = new OutputStream() {
            private long bytesReceived;

            public void close() {
                OutputStreamRequestBody.this.closed = true;
                long j = j;
                if (j == -1 || this.bytesReceived >= j) {
                    hVar.close();
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("expected ");
                sb.append(j);
                sb.append(" bytes but received ");
                sb.append(this.bytesReceived);
                throw new ProtocolException(sb.toString());
            }

            public void flush() {
                if (!OutputStreamRequestBody.this.closed) {
                    hVar.flush();
                }
            }

            public void write(int i) {
                write(new byte[]{(byte) i}, 0, 1);
            }

            public void write(byte[] bArr, int i, int i2) {
                if (!OutputStreamRequestBody.this.closed) {
                    long j = j;
                    if (j == -1 || this.bytesReceived + ((long) i2) <= j) {
                        this.bytesReceived += (long) i2;
                        try {
                            hVar.write(bArr, i, i2);
                        } catch (InterruptedIOException e) {
                            throw new SocketTimeoutException(e.getMessage());
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("expected ");
                        sb.append(j);
                        sb.append(" bytes but received ");
                        sb.append(this.bytesReceived);
                        sb.append(i2);
                        throw new ProtocolException(sb.toString());
                    }
                } else {
                    throw new IOException("closed");
                }
            }
        };
    }

    public final boolean isClosed() {
        return this.closed;
    }

    public final OutputStream outputStream() {
        return this.outputStream;
    }

    public Request prepareToSendRequest(Request request) {
        return request;
    }

    public final C2002F timeout() {
        return this.timeout;
    }
}
