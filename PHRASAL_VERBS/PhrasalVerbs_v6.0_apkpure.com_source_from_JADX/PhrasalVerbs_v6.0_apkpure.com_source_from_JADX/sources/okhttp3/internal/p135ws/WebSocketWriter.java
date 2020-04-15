package okhttp3.internal.p135ws;

import java.io.IOException;
import java.util.Random;
import p133e.C1999C;
import p133e.C2002F;
import p133e.C2011g;
import p133e.C2011g.C2012a;
import p133e.C2013h;
import p133e.C2015j;

/* renamed from: okhttp3.internal.ws.WebSocketWriter */
final class WebSocketWriter {
    boolean activeWriter;
    final C2011g buffer = new C2011g();
    final FrameSink frameSink = new FrameSink();
    final boolean isClient;
    private final C2012a maskCursor;
    private final byte[] maskKey;
    final Random random;
    final C2013h sink;
    final C2011g sinkBuffer;
    boolean writerClosed;

    /* renamed from: okhttp3.internal.ws.WebSocketWriter$FrameSink */
    final class FrameSink implements C1999C {
        boolean closed;
        long contentLength;
        int formatOpcode;
        boolean isFirstFrame;

        FrameSink() {
        }

        public void close() {
            if (!this.closed) {
                WebSocketWriter webSocketWriter = WebSocketWriter.this;
                webSocketWriter.writeMessageFrame(this.formatOpcode, webSocketWriter.buffer.size(), this.isFirstFrame, true);
                this.closed = true;
                WebSocketWriter.this.activeWriter = false;
                return;
            }
            throw new IOException("closed");
        }

        public void flush() {
            if (!this.closed) {
                WebSocketWriter webSocketWriter = WebSocketWriter.this;
                webSocketWriter.writeMessageFrame(this.formatOpcode, webSocketWriter.buffer.size(), this.isFirstFrame, false);
                this.isFirstFrame = false;
                return;
            }
            throw new IOException("closed");
        }

        public C2002F timeout() {
            return WebSocketWriter.this.sink.timeout();
        }

        public void write(C2011g gVar, long j) {
            if (!this.closed) {
                WebSocketWriter.this.buffer.write(gVar, j);
                boolean z = this.isFirstFrame && this.contentLength != -1 && WebSocketWriter.this.buffer.size() > this.contentLength - 8192;
                long n = WebSocketWriter.this.buffer.mo7140n();
                if (n > 0 && !z) {
                    WebSocketWriter.this.writeMessageFrame(this.formatOpcode, n, this.isFirstFrame, false);
                    this.isFirstFrame = false;
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }
    }

    WebSocketWriter(boolean z, C2013h hVar, Random random2) {
        if (hVar == null) {
            throw new NullPointerException("sink == null");
        } else if (random2 != null) {
            this.isClient = z;
            this.sink = hVar;
            this.sinkBuffer = hVar.mo7097a();
            this.random = random2;
            C2012a aVar = null;
            this.maskKey = z ? new byte[4] : null;
            if (z) {
                aVar = new C2012a();
            }
            this.maskCursor = aVar;
        } else {
            throw new NullPointerException("random == null");
        }
    }

    private void writeControlFrame(int i, C2015j jVar) {
        if (!this.writerClosed) {
            int g = jVar.mo7048g();
            if (((long) g) <= 125) {
                this.sinkBuffer.writeByte(i | 128);
                if (this.isClient) {
                    this.sinkBuffer.writeByte(g | 128);
                    this.random.nextBytes(this.maskKey);
                    this.sinkBuffer.write(this.maskKey);
                    if (g > 0) {
                        long size = this.sinkBuffer.size();
                        this.sinkBuffer.mo7099a(jVar);
                        this.sinkBuffer.mo7096a(this.maskCursor);
                        this.maskCursor.mo7160h(size);
                        WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                        this.maskCursor.close();
                    }
                } else {
                    this.sinkBuffer.writeByte(g);
                    this.sinkBuffer.mo7099a(jVar);
                }
                this.sink.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        throw new IOException("closed");
    }

    /* access modifiers changed from: 0000 */
    public C1999C newMessageSink(int i, long j) {
        if (!this.activeWriter) {
            this.activeWriter = true;
            FrameSink frameSink2 = this.frameSink;
            frameSink2.formatOpcode = i;
            frameSink2.contentLength = j;
            frameSink2.isFirstFrame = true;
            frameSink2.closed = false;
            return frameSink2;
        }
        throw new IllegalStateException("Another message writer is active. Did you call close()?");
    }

    /* access modifiers changed from: 0000 */
    public void writeClose(int i, C2015j jVar) {
        C2015j jVar2 = C2015j.f5937b;
        if (!(i == 0 && jVar == null)) {
            if (i != 0) {
                WebSocketProtocol.validateCloseCode(i);
            }
            C2011g gVar = new C2011g();
            gVar.writeShort(i);
            if (jVar != null) {
                gVar.mo7099a(jVar);
            }
            jVar2 = gVar.mo7141o();
        }
        try {
            writeControlFrame(8, jVar2);
        } finally {
            this.writerClosed = true;
        }
    }

    /* access modifiers changed from: 0000 */
    public void writeMessageFrame(int i, long j, boolean z, boolean z2) {
        if (!this.writerClosed) {
            int i2 = 0;
            if (!z) {
                i = 0;
            }
            if (z2) {
                i |= 128;
            }
            this.sinkBuffer.writeByte(i);
            if (this.isClient) {
                i2 = 128;
            }
            if (j <= 125) {
                this.sinkBuffer.writeByte(((int) j) | i2);
            } else if (j <= 65535) {
                this.sinkBuffer.writeByte(i2 | 126);
                this.sinkBuffer.writeShort((int) j);
            } else {
                this.sinkBuffer.writeByte(i2 | 127);
                this.sinkBuffer.mo7137k(j);
            }
            if (this.isClient) {
                this.random.nextBytes(this.maskKey);
                this.sinkBuffer.write(this.maskKey);
                if (j > 0) {
                    long size = this.sinkBuffer.size();
                    this.sinkBuffer.write(this.buffer, j);
                    this.sinkBuffer.mo7096a(this.maskCursor);
                    this.maskCursor.mo7160h(size);
                    WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            } else {
                this.sinkBuffer.write(this.buffer, j);
            }
            this.sink.mo7112b();
            return;
        }
        throw new IOException("closed");
    }

    /* access modifiers changed from: 0000 */
    public void writePing(C2015j jVar) {
        writeControlFrame(9, jVar);
    }

    /* access modifiers changed from: 0000 */
    public void writePong(C2015j jVar) {
        writeControlFrame(10, jVar);
    }
}
