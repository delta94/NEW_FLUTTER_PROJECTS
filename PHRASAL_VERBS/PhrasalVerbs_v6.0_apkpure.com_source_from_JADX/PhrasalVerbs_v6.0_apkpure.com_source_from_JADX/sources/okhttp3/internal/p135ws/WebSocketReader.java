package okhttp3.internal.p135ws;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import p133e.C2011g;
import p133e.C2011g.C2012a;
import p133e.C2014i;
import p133e.C2015j;

/* renamed from: okhttp3.internal.ws.WebSocketReader */
final class WebSocketReader {
    boolean closed;
    private final C2011g controlFrameBuffer = new C2011g();
    final FrameCallback frameCallback;
    long frameLength;
    final boolean isClient;
    boolean isControlFrame;
    boolean isFinalFrame;
    private final C2012a maskCursor;
    private final byte[] maskKey;
    private final C2011g messageFrameBuffer = new C2011g();
    int opcode;
    final C2014i source;

    /* renamed from: okhttp3.internal.ws.WebSocketReader$FrameCallback */
    public interface FrameCallback {
        void onReadClose(int i, String str);

        void onReadMessage(C2015j jVar);

        void onReadMessage(String str);

        void onReadPing(C2015j jVar);

        void onReadPong(C2015j jVar);
    }

    WebSocketReader(boolean z, C2014i iVar, FrameCallback frameCallback2) {
        if (iVar == null) {
            throw new NullPointerException("source == null");
        } else if (frameCallback2 != null) {
            this.isClient = z;
            this.source = iVar;
            this.frameCallback = frameCallback2;
            C2012a aVar = null;
            this.maskKey = z ? null : new byte[4];
            if (!z) {
                aVar = new C2012a();
            }
            this.maskCursor = aVar;
        } else {
            throw new NullPointerException("frameCallback == null");
        }
    }

    private void readControlFrame() {
        String str;
        long j = this.frameLength;
        if (j > 0) {
            this.source.mo7108a(this.controlFrameBuffer, j);
            if (!this.isClient) {
                this.controlFrameBuffer.mo7096a(this.maskCursor);
                this.maskCursor.mo7160h(0);
                WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                short s = 1005;
                long size = this.controlFrameBuffer.size();
                if (size != 1) {
                    if (size != 0) {
                        s = this.controlFrameBuffer.readShort();
                        str = this.controlFrameBuffer.mo7142p();
                        String closeCodeExceptionMessage = WebSocketProtocol.closeCodeExceptionMessage(s);
                        if (closeCodeExceptionMessage != null) {
                            throw new ProtocolException(closeCodeExceptionMessage);
                        }
                    } else {
                        str = "";
                    }
                    this.frameCallback.onReadClose(s, str);
                    this.closed = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                this.frameCallback.onReadPing(this.controlFrameBuffer.mo7141o());
                return;
            case 10:
                this.frameCallback.onReadPong(this.controlFrameBuffer.mo7141o());
                return;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown control opcode: ");
                sb.append(Integer.toHexString(this.opcode));
                throw new ProtocolException(sb.toString());
        }
    }

    /* JADX INFO: finally extract failed */
    private void readHeader() {
        if (!this.closed) {
            long timeoutNanos = this.source.timeout().timeoutNanos();
            this.source.timeout().clearTimeout();
            try {
                byte readByte = this.source.readByte() & 255;
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                this.opcode = readByte & 15;
                boolean z = true;
                this.isFinalFrame = (readByte & 128) != 0;
                this.isControlFrame = (readByte & 8) != 0;
                if (!this.isControlFrame || this.isFinalFrame) {
                    boolean z2 = (readByte & 64) != 0;
                    boolean z3 = (readByte & 32) != 0;
                    boolean z4 = (readByte & 16) != 0;
                    if (z2 || z3 || z4) {
                        throw new ProtocolException("Reserved flags are unsupported.");
                    }
                    byte readByte2 = this.source.readByte() & 255;
                    if ((readByte2 & 128) == 0) {
                        z = false;
                    }
                    boolean z5 = this.isClient;
                    if (z == z5) {
                        throw new ProtocolException(z5 ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
                    }
                    this.frameLength = (long) (readByte2 & Byte.MAX_VALUE);
                    long j = this.frameLength;
                    if (j == 126) {
                        this.frameLength = ((long) this.source.readShort()) & 65535;
                    } else if (j == 127) {
                        this.frameLength = this.source.readLong();
                        if (this.frameLength < 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Frame length 0x");
                            sb.append(Long.toHexString(this.frameLength));
                            sb.append(" > 0x7FFFFFFFFFFFFFFF");
                            throw new ProtocolException(sb.toString());
                        }
                    }
                    if (this.isControlFrame && this.frameLength > 125) {
                        throw new ProtocolException("Control frame must be less than 125B.");
                    } else if (z) {
                        this.source.readFully(this.maskKey);
                    }
                } else {
                    throw new ProtocolException("Control frames must be final.");
                }
            } catch (Throwable th) {
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                throw th;
            }
        } else {
            throw new IOException("closed");
        }
    }

    private void readMessage() {
        while (!this.closed) {
            long j = this.frameLength;
            if (j > 0) {
                this.source.mo7108a(this.messageFrameBuffer, j);
                if (!this.isClient) {
                    this.messageFrameBuffer.mo7096a(this.maskCursor);
                    this.maskCursor.mo7160h(this.messageFrameBuffer.size() - this.frameLength);
                    WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            }
            if (!this.isFinalFrame) {
                readUntilNonControlFrame();
                if (this.opcode != 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected continuation opcode. Got: ");
                    sb.append(Integer.toHexString(this.opcode));
                    throw new ProtocolException(sb.toString());
                }
            } else {
                return;
            }
        }
        throw new IOException("closed");
    }

    private void readMessageFrame() {
        int i = this.opcode;
        if (i == 1 || i == 2) {
            readMessage();
            if (i == 1) {
                this.frameCallback.onReadMessage(this.messageFrameBuffer.mo7142p());
            } else {
                this.frameCallback.onReadMessage(this.messageFrameBuffer.mo7141o());
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown opcode: ");
            sb.append(Integer.toHexString(i));
            throw new ProtocolException(sb.toString());
        }
    }

    private void readUntilNonControlFrame() {
        while (!this.closed) {
            readHeader();
            if (this.isControlFrame) {
                readControlFrame();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void processNextFrame() {
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }
}
