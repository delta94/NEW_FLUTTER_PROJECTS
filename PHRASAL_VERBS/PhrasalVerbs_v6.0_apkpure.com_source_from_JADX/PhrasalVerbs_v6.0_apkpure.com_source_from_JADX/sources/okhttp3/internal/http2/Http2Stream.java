package okhttp3.internal.http2;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import okhttp3.Headers;
import okhttp3.internal.Util;
import p133e.C1999C;
import p133e.C2000D;
import p133e.C2002F;
import p133e.C2006c;
import p133e.C2011g;
import p133e.C2014i;

public final class Http2Stream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    long bytesLeftInWriteWindow;
    final Http2Connection connection;
    ErrorCode errorCode = null;
    private boolean hasResponseHeaders;
    /* access modifiers changed from: private */
    public Listener headersListener;
    /* access modifiers changed from: private */
    public final Deque<Headers> headersQueue = new ArrayDeque();

    /* renamed from: id */
    final int f5983id;
    final StreamTimeout readTimeout = new StreamTimeout();
    final FramingSink sink;
    private final FramingSource source;
    long unacknowledgedBytesRead = 0;
    final StreamTimeout writeTimeout = new StreamTimeout();

    final class FramingSink implements C1999C {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final long EMIT_BUFFER_SIZE = 16384;
        boolean closed;
        boolean finished;
        private final C2011g sendBuffer = new C2011g();

        FramingSink() {
        }

        /* JADX INFO: finally extract failed */
        private void emitFrame(boolean z) {
            long min;
            synchronized (Http2Stream.this) {
                Http2Stream.this.writeTimeout.enter();
                while (Http2Stream.this.bytesLeftInWriteWindow <= 0 && !this.finished && !this.closed && Http2Stream.this.errorCode == null) {
                    try {
                        Http2Stream.this.waitForIo();
                    } catch (Throwable th) {
                        Http2Stream.this.writeTimeout.exitAndThrowIfTimedOut();
                        throw th;
                    }
                }
                Http2Stream.this.writeTimeout.exitAndThrowIfTimedOut();
                Http2Stream.this.checkOutNotClosed();
                min = Math.min(Http2Stream.this.bytesLeftInWriteWindow, this.sendBuffer.size());
                Http2Stream.this.bytesLeftInWriteWindow -= min;
            }
            Http2Stream.this.writeTimeout.enter();
            try {
                Http2Stream.this.connection.writeData(Http2Stream.this.f5983id, (!z || min != this.sendBuffer.size()) ? $assertionsDisabled : true, this.sendBuffer, min);
            } finally {
                Http2Stream.this.writeTimeout.exitAndThrowIfTimedOut();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
            if (r8.sendBuffer.size() <= 0) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (r8.sendBuffer.size() <= 0) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
            emitFrame(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
            r0 = r8.this$0;
            r0.connection.writeData(r0.f5983id, true, null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
            r2 = r8.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r8.closed = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
            r8.this$0.connection.flush();
            r8.this$0.cancelStreamIfNecessary();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r8.this$0.sink.finished != false) goto L_0x003a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r8 = this;
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                monitor-enter(r0)
                boolean r1 = r8.closed     // Catch:{ all -> 0x0050 }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Stream$FramingSink r0 = r0.sink
                boolean r0 = r0.finished
                r1 = 1
                if (r0 != 0) goto L_0x003a
                e.g r0 = r8.sendBuffer
                long r2 = r0.size()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x002d
            L_0x001f:
                e.g r0 = r8.sendBuffer
                long r2 = r0.size()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x003a
                r8.emitFrame(r1)
                goto L_0x001f
            L_0x002d:
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Connection r2 = r0.connection
                int r3 = r0.f5983id
                r4 = 1
                r5 = 0
                r6 = 0
                r2.writeData(r3, r4, r5, r6)
            L_0x003a:
                okhttp3.internal.http2.Http2Stream r2 = okhttp3.internal.http2.Http2Stream.this
                monitor-enter(r2)
                r8.closed = r1     // Catch:{ all -> 0x004d }
                monitor-exit(r2)     // Catch:{ all -> 0x004d }
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Connection r0 = r0.connection
                r0.flush()
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                r0.cancelStreamIfNecessary()
                return
            L_0x004d:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x004d }
                throw r0
            L_0x0050:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                throw r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.FramingSink.close():void");
        }

        public void flush() {
            synchronized (Http2Stream.this) {
                Http2Stream.this.checkOutNotClosed();
            }
            while (this.sendBuffer.size() > 0) {
                emitFrame($assertionsDisabled);
                Http2Stream.this.connection.flush();
            }
        }

        public C2002F timeout() {
            return Http2Stream.this.writeTimeout;
        }

        public void write(C2011g gVar, long j) {
            this.sendBuffer.write(gVar, j);
            while (this.sendBuffer.size() >= EMIT_BUFFER_SIZE) {
                emitFrame($assertionsDisabled);
            }
        }
    }

    private final class FramingSource implements C2000D {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        boolean closed;
        boolean finished;
        private final long maxByteCount;
        private final C2011g readBuffer = new C2011g();
        private final C2011g receiveBuffer = new C2011g();

        FramingSource(long j) {
            this.maxByteCount = j;
        }

        private void updateConnectionFlowControl(long j) {
            Http2Stream.this.connection.updateConnectionFlowControl(j);
        }

        public void close() {
            long size;
            ArrayList<Headers> arrayList;
            Listener listener;
            synchronized (Http2Stream.this) {
                this.closed = true;
                size = this.readBuffer.size();
                this.readBuffer.mo7139m();
                arrayList = null;
                if (Http2Stream.this.headersQueue.isEmpty() || Http2Stream.this.headersListener == null) {
                    listener = null;
                } else {
                    arrayList = new ArrayList<>(Http2Stream.this.headersQueue);
                    Http2Stream.this.headersQueue.clear();
                    listener = Http2Stream.this.headersListener;
                }
                Http2Stream.this.notifyAll();
            }
            if (size > 0) {
                updateConnectionFlowControl(size);
            }
            Http2Stream.this.cancelStreamIfNecessary();
            if (listener != null) {
                for (Headers onHeaders : arrayList) {
                    listener.onHeaders(onHeaders);
                }
            }
        }

        public long read(C2011g gVar, long j) {
            ErrorCode errorCode;
            long j2;
            Listener listener;
            Headers headers;
            long j3 = j;
            if (j3 >= 0) {
                while (true) {
                    synchronized (Http2Stream.this) {
                        Http2Stream.this.readTimeout.enter();
                        try {
                            errorCode = Http2Stream.this.errorCode != null ? Http2Stream.this.errorCode : null;
                            if (!this.closed) {
                                if (Http2Stream.this.headersQueue.isEmpty() || Http2Stream.this.headersListener == null) {
                                    if (this.readBuffer.size() > 0) {
                                        j2 = this.readBuffer.read(gVar, Math.min(j3, this.readBuffer.size()));
                                        Http2Stream.this.unacknowledgedBytesRead += j2;
                                        if (errorCode == null && Http2Stream.this.unacknowledgedBytesRead >= ((long) (Http2Stream.this.connection.okHttpSettings.getInitialWindowSize() / 2))) {
                                            Http2Stream.this.connection.writeWindowUpdateLater(Http2Stream.this.f5983id, Http2Stream.this.unacknowledgedBytesRead);
                                            Http2Stream.this.unacknowledgedBytesRead = 0;
                                        }
                                    } else {
                                        C2011g gVar2 = gVar;
                                        if (this.finished || errorCode != null) {
                                            j2 = -1;
                                        } else {
                                            Http2Stream.this.waitForIo();
                                            Http2Stream.this.readTimeout.exitAndThrowIfTimedOut();
                                        }
                                    }
                                    headers = null;
                                    listener = null;
                                } else {
                                    headers = (Headers) Http2Stream.this.headersQueue.removeFirst();
                                    listener = Http2Stream.this.headersListener;
                                    C2011g gVar3 = gVar;
                                    j2 = -1;
                                }
                                if (headers != null && listener != null) {
                                    listener.onHeaders(headers);
                                }
                            } else {
                                throw new IOException("stream closed");
                            }
                        } finally {
                            Http2Stream.this.readTimeout.exitAndThrowIfTimedOut();
                        }
                    }
                }
                if (j2 != -1) {
                    updateConnectionFlowControl(j2);
                    return j2;
                } else if (errorCode == null) {
                    return -1;
                } else {
                    throw new StreamResetException(errorCode);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j3);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        /* access modifiers changed from: 0000 */
        public void receive(C2014i iVar, long j) {
            boolean z;
            boolean z2;
            boolean z3;
            while (j > 0) {
                synchronized (Http2Stream.this) {
                    z = this.finished;
                    z2 = true;
                    z3 = this.readBuffer.size() + j > this.maxByteCount;
                }
                if (z3) {
                    iVar.skip(j);
                    Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    iVar.skip(j);
                    return;
                } else {
                    long read = iVar.read(this.receiveBuffer, j);
                    if (read != -1) {
                        j -= read;
                        synchronized (Http2Stream.this) {
                            if (this.readBuffer.size() != 0) {
                                z2 = false;
                            }
                            this.readBuffer.mo7094a((C2000D) this.receiveBuffer);
                            if (z2) {
                                Http2Stream.this.notifyAll();
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        public C2002F timeout() {
            return Http2Stream.this.readTimeout;
        }
    }

    class StreamTimeout extends C2006c {
        StreamTimeout() {
        }

        public void exitAndThrowIfTimedOut() {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }

        /* access modifiers changed from: protected */
        public IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* access modifiers changed from: protected */
        public void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
        }
    }

    Http2Stream(int i, Http2Connection http2Connection, boolean z, boolean z2, Headers headers) {
        if (http2Connection != null) {
            this.f5983id = i;
            this.connection = http2Connection;
            this.bytesLeftInWriteWindow = (long) http2Connection.peerSettings.getInitialWindowSize();
            this.source = new FramingSource((long) http2Connection.okHttpSettings.getInitialWindowSize());
            this.sink = new FramingSink();
            this.source.finished = z2;
            this.sink.finished = z;
            if (headers != null) {
                this.headersQueue.add(headers);
            }
            if (isLocallyInitiated() && headers != null) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            } else if (!isLocallyInitiated() && headers == null) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            throw new NullPointerException("connection == null");
        }
    }

    private boolean closeInternal(ErrorCode errorCode2) {
        synchronized (this) {
            if (this.errorCode != null) {
                return false;
            }
            if (this.source.finished && this.sink.finished) {
                return false;
            }
            this.errorCode = errorCode2;
            notifyAll();
            this.connection.removeStream(this.f5983id);
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    public void addBytesToWriteWindow(long j) {
        this.bytesLeftInWriteWindow += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* access modifiers changed from: 0000 */
    public void cancelStreamIfNecessary() {
        boolean z;
        boolean isOpen;
        synchronized (this) {
            z = !this.source.finished && this.source.closed && (this.sink.finished || this.sink.closed);
            isOpen = isOpen();
        }
        if (z) {
            close(ErrorCode.CANCEL);
        } else if (!isOpen) {
            this.connection.removeStream(this.f5983id);
        }
    }

    /* access modifiers changed from: 0000 */
    public void checkOutNotClosed() {
        FramingSink framingSink = this.sink;
        if (framingSink.closed) {
            throw new IOException("stream closed");
        } else if (!framingSink.finished) {
            ErrorCode errorCode2 = this.errorCode;
            if (errorCode2 != null) {
                throw new StreamResetException(errorCode2);
            }
        } else {
            throw new IOException("stream finished");
        }
    }

    public void close(ErrorCode errorCode2) {
        if (closeInternal(errorCode2)) {
            this.connection.writeSynReset(this.f5983id, errorCode2);
        }
    }

    public void closeLater(ErrorCode errorCode2) {
        if (closeInternal(errorCode2)) {
            this.connection.writeSynResetLater(this.f5983id, errorCode2);
        }
    }

    public Http2Connection getConnection() {
        return this.connection;
    }

    public synchronized ErrorCode getErrorCode() {
        return this.errorCode;
    }

    public int getId() {
        return this.f5983id;
    }

    public C1999C getSink() {
        synchronized (this) {
            if (!this.hasResponseHeaders) {
                if (!isLocallyInitiated()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.sink;
    }

    public C2000D getSource() {
        return this.source;
    }

    public boolean isLocallyInitiated() {
        return this.connection.client == ((this.f5983id & 1) == 1);
    }

    public synchronized boolean isOpen() {
        if (this.errorCode != null) {
            return false;
        }
        return (!this.source.finished && !this.source.closed) || (!this.sink.finished && !this.sink.closed) || !this.hasResponseHeaders;
    }

    public C2002F readTimeout() {
        return this.readTimeout;
    }

    /* access modifiers changed from: 0000 */
    public void receiveData(C2014i iVar, int i) {
        this.source.receive(iVar, (long) i);
    }

    /* access modifiers changed from: 0000 */
    public void receiveFin() {
        boolean isOpen;
        synchronized (this) {
            this.source.finished = true;
            isOpen = isOpen();
            notifyAll();
        }
        if (!isOpen) {
            this.connection.removeStream(this.f5983id);
        }
    }

    /* access modifiers changed from: 0000 */
    public void receiveHeaders(List<Header> list) {
        boolean isOpen;
        synchronized (this) {
            this.hasResponseHeaders = true;
            this.headersQueue.add(Util.toHeaders(list));
            isOpen = isOpen();
            notifyAll();
        }
        if (!isOpen) {
            this.connection.removeStream(this.f5983id);
        }
    }

    /* access modifiers changed from: 0000 */
    public synchronized void receiveRstStream(ErrorCode errorCode2) {
        if (this.errorCode == null) {
            this.errorCode = errorCode2;
            notifyAll();
        }
    }

    public synchronized void setHeadersListener(Listener listener) {
        this.headersListener = listener;
        if (!this.headersQueue.isEmpty() && listener != null) {
            notifyAll();
        }
    }

    /* JADX INFO: finally extract failed */
    public synchronized Headers takeHeaders() {
        this.readTimeout.enter();
        while (this.headersQueue.isEmpty() && this.errorCode == null) {
            try {
                waitForIo();
            } catch (Throwable th) {
                this.readTimeout.exitAndThrowIfTimedOut();
                throw th;
            }
        }
        this.readTimeout.exitAndThrowIfTimedOut();
        if (!this.headersQueue.isEmpty()) {
        } else {
            throw new StreamResetException(this.errorCode);
        }
        return (Headers) this.headersQueue.removeFirst();
    }

    /* access modifiers changed from: 0000 */
    public void waitForIo() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public void writeHeaders(List<Header> list, boolean z) {
        boolean z2;
        boolean z3;
        if (list != null) {
            synchronized (this) {
                this.hasResponseHeaders = true;
                if (!z) {
                    this.sink.finished = true;
                    z2 = true;
                    z3 = true;
                } else {
                    z2 = false;
                    z3 = false;
                }
            }
            if (!z2) {
                synchronized (this.connection) {
                    z2 = this.connection.bytesLeftInWriteWindow == 0;
                }
            }
            this.connection.writeSynReply(this.f5983id, z3, list);
            if (z2) {
                this.connection.flush();
                return;
            }
            return;
        }
        throw new NullPointerException("headers == null");
    }

    public C2002F writeTimeout() {
        return this.writeTimeout;
    }
}
