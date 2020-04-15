package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import p133e.C2011g;
import p133e.C2013h;

final class Http2Writer implements Closeable {
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final C2011g hpackBuffer = new C2011g();
    final Writer hpackWriter = new Writer(this.hpackBuffer);
    private int maxFrameSize = 16384;
    private final C2013h sink;

    Http2Writer(C2013h hVar, boolean z) {
        this.sink = hVar;
        this.client = z;
    }

    private void writeContinuationFrames(int i, long j) {
        while (j > 0) {
            int min = (int) Math.min((long) this.maxFrameSize, j);
            long j2 = (long) min;
            j -= j2;
            frameHeader(i, min, 9, j == 0 ? (byte) 4 : 0);
            this.sink.write(this.hpackBuffer, j2);
        }
    }

    private static void writeMedium(C2013h hVar, int i) {
        hVar.writeByte((i >>> 16) & 255);
        hVar.writeByte((i >>> 8) & 255);
        hVar.writeByte(i & 255);
    }

    public synchronized void applyAndAckSettings(Settings settings) {
        if (!this.closed) {
            this.maxFrameSize = settings.getMaxFrameSize(this.maxFrameSize);
            if (settings.getHeaderTableSize() != -1) {
                this.hpackWriter.setHeaderTableSizeSetting(settings.getHeaderTableSize());
            }
            frameHeader(0, 0, 4, 1);
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void close() {
        this.closed = true;
        this.sink.close();
    }

    public synchronized void connectionPreface() {
        if (this.closed) {
            throw new IOException("closed");
        } else if (this.client) {
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(Util.format(">> CONNECTION %s", Http2.CONNECTION_PREFACE.mo7042b()));
            }
            this.sink.write(Http2.CONNECTION_PREFACE.mo7051i());
            this.sink.flush();
        }
    }

    public synchronized void data(boolean z, int i, C2011g gVar, int i2) {
        if (!this.closed) {
            byte b = 0;
            if (z) {
                b = (byte) 1;
            }
            dataFrame(i, b, gVar, i2);
        } else {
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: 0000 */
    public void dataFrame(int i, byte b, C2011g gVar, int i2) {
        frameHeader(i, i2, 0, b);
        if (i2 > 0) {
            this.sink.write(gVar, (long) i2);
        }
    }

    public synchronized void flush() {
        if (!this.closed) {
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public void frameHeader(int i, int i2, byte b, byte b2) {
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(Http2.frameLog(false, i, i2, b, b2));
        }
        int i3 = this.maxFrameSize;
        if (i2 > i3) {
            Http2.illegalArgument("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            throw null;
        } else if ((Integer.MIN_VALUE & i) == 0) {
            writeMedium(this.sink, i2);
            this.sink.writeByte(b & 255);
            this.sink.writeByte(b2 & 255);
            this.sink.writeInt(i & Integer.MAX_VALUE);
        } else {
            Http2.illegalArgument("reserved bit set: %s", Integer.valueOf(i));
            throw null;
        }
    }

    public synchronized void goAway(int i, ErrorCode errorCode, byte[] bArr) {
        if (this.closed) {
            throw new IOException("closed");
        } else if (errorCode.httpCode != -1) {
            frameHeader(0, bArr.length + 8, 7, 0);
            this.sink.writeInt(i);
            this.sink.writeInt(errorCode.httpCode);
            if (bArr.length > 0) {
                this.sink.write(bArr);
            }
            this.sink.flush();
        } else {
            Http2.illegalArgument("errorCode.httpCode == -1", new Object[0]);
            throw null;
        }
    }

    public synchronized void headers(int i, List<Header> list) {
        if (!this.closed) {
            headers(false, i, list);
        } else {
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: 0000 */
    public void headers(boolean z, int i, List<Header> list) {
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long size = this.hpackBuffer.size();
            int min = (int) Math.min((long) this.maxFrameSize, size);
            long j = (long) min;
            byte b = size == j ? (byte) 4 : 0;
            if (z) {
                b = (byte) (b | 1);
            }
            frameHeader(i, min, 1, b);
            this.sink.write(this.hpackBuffer, j);
            if (size > j) {
                writeContinuationFrames(i, size - j);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    public int maxDataLength() {
        return this.maxFrameSize;
    }

    public synchronized void ping(boolean z, int i, int i2) {
        if (!this.closed) {
            frameHeader(0, 8, 6, z ? (byte) 1 : 0);
            this.sink.writeInt(i);
            this.sink.writeInt(i2);
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void pushPromise(int i, int i2, List<Header> list) {
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long size = this.hpackBuffer.size();
            int min = (int) Math.min((long) (this.maxFrameSize - 4), size);
            long j = (long) min;
            frameHeader(i, min + 4, 5, size == j ? (byte) 4 : 0);
            this.sink.writeInt(i2 & Integer.MAX_VALUE);
            this.sink.write(this.hpackBuffer, j);
            if (size > j) {
                writeContinuationFrames(i, size - j);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void rstStream(int i, ErrorCode errorCode) {
        if (this.closed) {
            throw new IOException("closed");
        } else if (errorCode.httpCode != -1) {
            frameHeader(i, 4, 3, 0);
            this.sink.writeInt(errorCode.httpCode);
            this.sink.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public synchronized void settings(Settings settings) {
        if (!this.closed) {
            int i = 0;
            frameHeader(0, settings.size() * 6, 4, 0);
            while (i < 10) {
                if (settings.isSet(i)) {
                    int i2 = i == 4 ? 3 : i == 7 ? 4 : i;
                    this.sink.writeShort(i2);
                    this.sink.writeInt(settings.get(i));
                }
                i++;
            }
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void synReply(boolean z, int i, List<Header> list) {
        if (!this.closed) {
            headers(z, i, list);
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void synStream(boolean z, int i, int i2, List<Header> list) {
        if (!this.closed) {
            headers(z, i, list);
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void windowUpdate(int i, long j) {
        if (this.closed) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            Http2.illegalArgument("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            throw null;
        } else {
            frameHeader(i, 4, 8, 0);
            this.sink.writeInt((int) j);
            this.sink.flush();
        }
    }
}
