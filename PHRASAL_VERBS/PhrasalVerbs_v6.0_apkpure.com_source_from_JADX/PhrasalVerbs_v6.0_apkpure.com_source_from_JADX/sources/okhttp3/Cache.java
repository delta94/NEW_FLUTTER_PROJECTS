package okhttp3;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.Headers.Builder;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.cache.DiskLruCache.Editor;
import okhttp3.internal.cache.DiskLruCache.Snapshot;
import okhttp3.internal.cache.InternalCache;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.p134io.FileSystem;
import okhttp3.internal.platform.Platform;
import p133e.C1999C;
import p133e.C2000D;
import p133e.C2011g;
import p133e.C2013h;
import p133e.C2014i;
import p133e.C2015j;
import p133e.C2016k;
import p133e.C2017l;
import p133e.C2025t;

public final class Cache implements Closeable, Flushable {
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    final DiskLruCache cache;
    private int hitCount;
    final InternalCache internalCache;
    private int networkCount;
    private int requestCount;
    int writeAbortCount;
    int writeSuccessCount;

    private final class CacheRequestImpl implements CacheRequest {
        private C1999C body;
        private C1999C cacheOut;
        boolean done;
        private final Editor editor;

        CacheRequestImpl(final Editor editor2) {
            this.editor = editor2;
            this.cacheOut = editor2.newSink(1);
            this.body = new C2016k(this.cacheOut, Cache.this) {
                public void close() {
                    synchronized (Cache.this) {
                        if (!CacheRequestImpl.this.done) {
                            CacheRequestImpl.this.done = true;
                            Cache.this.writeSuccessCount++;
                            super.close();
                            editor2.commit();
                        }
                    }
                }
            };
        }

        /* JADX INFO: used method not loaded: okhttp3.internal.Util.closeQuietly(java.io.Closeable):null, types can be incorrect */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r4.editor.abort();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r4.cacheOut);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void abort() {
            /*
                r4 = this;
                okhttp3.Cache r0 = okhttp3.Cache.this
                monitor-enter(r0)
                boolean r1 = r4.done     // Catch:{ all -> 0x001f }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x001f }
                return
            L_0x0009:
                r1 = 1
                r4.done = r1     // Catch:{ all -> 0x001f }
                okhttp3.Cache r2 = okhttp3.Cache.this     // Catch:{ all -> 0x001f }
                int r3 = r2.writeAbortCount     // Catch:{ all -> 0x001f }
                int r3 = r3 + r1
                r2.writeAbortCount = r3     // Catch:{ all -> 0x001f }
                monitor-exit(r0)     // Catch:{ all -> 0x001f }
                e.C r0 = r4.cacheOut
                okhttp3.internal.Util.closeQuietly(r0)
                okhttp3.internal.cache.DiskLruCache$Editor r0 = r4.editor     // Catch:{ IOException -> 0x001e }
                r0.abort()     // Catch:{ IOException -> 0x001e }
            L_0x001e:
                return
            L_0x001f:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x001f }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cache.CacheRequestImpl.abort():void");
        }

        public C1999C body() {
            return this.body;
        }
    }

    private static class CacheResponseBody extends ResponseBody {
        private final C2014i bodySource;
        private final String contentLength;
        private final String contentType;
        final Snapshot snapshot;

        CacheResponseBody(final Snapshot snapshot2, String str, String str2) {
            this.snapshot = snapshot2;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = C2025t.m7756a((C2000D) new C2017l(snapshot2.getSource(1)) {
                public void close() {
                    snapshot2.close();
                    super.close();
                }
            });
        }

        public long contentLength() {
            try {
                if (this.contentLength != null) {
                    return Long.parseLong(this.contentLength);
                }
                return -1;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        public MediaType contentType() {
            String str = this.contentType;
            if (str != null) {
                return MediaType.parse(str);
            }
            return null;
        }

        public C2014i source() {
            return this.bodySource;
        }
    }

    private static final class Entry {
        private static final String RECEIVED_MILLIS;
        private static final String SENT_MILLIS;
        private final int code;
        private final Handshake handshake;
        private final String message;
        private final Protocol protocol;
        private final long receivedResponseMillis;
        private final String requestMethod;
        private final Headers responseHeaders;
        private final long sentRequestMillis;
        private final String url;
        private final Headers varyHeaders;

        static {
            StringBuilder sb = new StringBuilder();
            sb.append(Platform.get().getPrefix());
            sb.append("-Sent-Millis");
            SENT_MILLIS = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Platform.get().getPrefix());
            sb2.append("-Received-Millis");
            RECEIVED_MILLIS = sb2.toString();
        }

        Entry(C2000D d) {
            try {
                C2014i a = C2025t.m7756a(d);
                this.url = a.mo7127g();
                this.requestMethod = a.mo7127g();
                Builder builder = new Builder();
                int readInt = Cache.readInt(a);
                for (int i = 0; i < readInt; i++) {
                    builder.addLenient(a.mo7127g());
                }
                this.varyHeaders = builder.build();
                StatusLine parse = StatusLine.parse(a.mo7127g());
                this.protocol = parse.protocol;
                this.code = parse.code;
                this.message = parse.message;
                Builder builder2 = new Builder();
                int readInt2 = Cache.readInt(a);
                for (int i2 = 0; i2 < readInt2; i2++) {
                    builder2.addLenient(a.mo7127g());
                }
                String str = builder2.get(SENT_MILLIS);
                String str2 = builder2.get(RECEIVED_MILLIS);
                builder2.removeAll(SENT_MILLIS);
                builder2.removeAll(RECEIVED_MILLIS);
                long j = 0;
                this.sentRequestMillis = str != null ? Long.parseLong(str) : 0;
                if (str2 != null) {
                    j = Long.parseLong(str2);
                }
                this.receivedResponseMillis = j;
                this.responseHeaders = builder2.build();
                if (isHttps()) {
                    String g = a.mo7127g();
                    if (g.length() <= 0) {
                        this.handshake = Handshake.get(!a.mo7119d() ? TlsVersion.forJavaName(a.mo7127g()) : TlsVersion.SSL_3_0, CipherSuite.forJavaName(a.mo7127g()), readCertificateList(a), readCertificateList(a));
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("expected \"\" but was \"");
                        sb.append(g);
                        sb.append("\"");
                        throw new IOException(sb.toString());
                    }
                } else {
                    this.handshake = null;
                }
            } finally {
                d.close();
            }
        }

        Entry(Response response) {
            this.url = response.request().url().toString();
            this.varyHeaders = HttpHeaders.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }

        private boolean isHttps() {
            return this.url.startsWith("https://");
        }

        private List<Certificate> readCertificateList(C2014i iVar) {
            int readInt = Cache.readInt(iVar);
            if (readInt == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i < readInt; i++) {
                    String g = iVar.mo7127g();
                    C2011g gVar = new C2011g();
                    gVar.mo7099a(C2015j.m7717a(g));
                    arrayList.add(instance.generateCertificate(gVar.mo7138l()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        private void writeCertList(C2013h hVar, List<Certificate> list) {
            try {
                hVar.mo7126g((long) list.size()).writeByte(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    hVar.mo7100a(C2015j.m7719a(((Certificate) list.get(i)).getEncoded()).mo7038a()).writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public boolean matches(Request request, Response response) {
            return this.url.equals(request.url().toString()) && this.requestMethod.equals(request.method()) && HttpHeaders.varyMatches(response, this.varyHeaders, request);
        }

        public Response response(Snapshot snapshot) {
            String str = this.responseHeaders.get("Content-Type");
            String str2 = this.responseHeaders.get("Content-Length");
            return new Response.Builder().request(new Request.Builder().url(this.url).method(this.requestMethod, null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        public void writeTo(Editor editor) {
            String str;
            C2013h a = C2025t.m7755a(editor.newSink(0));
            a.mo7100a(this.url).writeByte(10);
            a.mo7100a(this.requestMethod).writeByte(10);
            a.mo7126g((long) this.varyHeaders.size()).writeByte(10);
            int size = this.varyHeaders.size();
            int i = 0;
            while (true) {
                str = ": ";
                if (i >= size) {
                    break;
                }
                a.mo7100a(this.varyHeaders.name(i)).mo7100a(str).mo7100a(this.varyHeaders.value(i)).writeByte(10);
                i++;
            }
            a.mo7100a(new StatusLine(this.protocol, this.code, this.message).toString()).writeByte(10);
            a.mo7126g((long) (this.responseHeaders.size() + 2)).writeByte(10);
            int size2 = this.responseHeaders.size();
            for (int i2 = 0; i2 < size2; i2++) {
                a.mo7100a(this.responseHeaders.name(i2)).mo7100a(str).mo7100a(this.responseHeaders.value(i2)).writeByte(10);
            }
            a.mo7100a(SENT_MILLIS).mo7100a(str).mo7126g(this.sentRequestMillis).writeByte(10);
            a.mo7100a(RECEIVED_MILLIS).mo7100a(str).mo7126g(this.receivedResponseMillis).writeByte(10);
            if (isHttps()) {
                a.writeByte(10);
                a.mo7100a(this.handshake.cipherSuite().javaName()).writeByte(10);
                writeCertList(a, this.handshake.peerCertificates());
                writeCertList(a, this.handshake.localCertificates());
                a.mo7100a(this.handshake.tlsVersion().javaName()).writeByte(10);
            }
            a.close();
        }
    }

    public Cache(File file, long j) {
        this(file, j, FileSystem.SYSTEM);
    }

    Cache(File file, long j, FileSystem fileSystem) {
        this.internalCache = new InternalCache() {
            public Response get(Request request) {
                return Cache.this.get(request);
            }

            public CacheRequest put(Response response) {
                return Cache.this.put(response);
            }

            public void remove(Request request) {
                Cache.this.remove(request);
            }

            public void trackConditionalCacheHit() {
                Cache.this.trackConditionalCacheHit();
            }

            public void trackResponse(CacheStrategy cacheStrategy) {
                Cache.this.trackResponse(cacheStrategy);
            }

            public void update(Response response, Response response2) {
                Cache.this.update(response, response2);
            }
        };
        this.cache = DiskLruCache.create(fileSystem, file, VERSION, 2, j);
    }

    private void abortQuietly(Editor editor) {
        if (editor != null) {
            try {
                editor.abort();
            } catch (IOException unused) {
            }
        }
    }

    public static String key(HttpUrl httpUrl) {
        return C2015j.m7721c(httpUrl.toString()).mo7044d().mo7042b();
    }

    static int readInt(C2014i iVar) {
        try {
            long f = iVar.mo7124f();
            String g = iVar.mo7127g();
            if (f >= 0 && f <= 2147483647L && g.isEmpty()) {
                return (int) f;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("expected an int but was \"");
            sb.append(f);
            sb.append(g);
            sb.append("\"");
            throw new IOException(sb.toString());
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }

    public void close() {
        this.cache.close();
    }

    public void delete() {
        this.cache.delete();
    }

    public File directory() {
        return this.cache.getDirectory();
    }

    public void evictAll() {
        this.cache.evictAll();
    }

    public void flush() {
        this.cache.flush();
    }

    /* access modifiers changed from: 0000 */
    public Response get(Request request) {
        try {
            Snapshot snapshot = this.cache.get(key(request.url()));
            if (snapshot == null) {
                return null;
            }
            try {
                Entry entry = new Entry(snapshot.getSource(0));
                Response response = entry.response(snapshot);
                if (entry.matches(request, response)) {
                    return response;
                }
                Util.closeQuietly((Closeable) response.body());
                return null;
            } catch (IOException unused) {
                Util.closeQuietly((Closeable) snapshot);
                return null;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    public synchronized int hitCount() {
        return this.hitCount;
    }

    public void initialize() {
        this.cache.initialize();
    }

    public boolean isClosed() {
        return this.cache.isClosed();
    }

    public long maxSize() {
        return this.cache.getMaxSize();
    }

    public synchronized int networkCount() {
        return this.networkCount;
    }

    /* access modifiers changed from: 0000 */
    public CacheRequest put(Response response) {
        Editor editor;
        String method = response.request().method();
        if (HttpMethod.invalidatesCache(response.request().method())) {
            try {
                remove(response.request());
            } catch (IOException unused) {
            }
            return null;
        } else if (!method.equals("GET") || HttpHeaders.hasVaryAll(response)) {
            return null;
        } else {
            Entry entry = new Entry(response);
            try {
                editor = this.cache.edit(key(response.request().url()));
                if (editor == null) {
                    return null;
                }
                try {
                    entry.writeTo(editor);
                    return new CacheRequestImpl(editor);
                } catch (IOException unused2) {
                    abortQuietly(editor);
                    return null;
                }
            } catch (IOException unused3) {
                editor = null;
                abortQuietly(editor);
                return null;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void remove(Request request) {
        this.cache.remove(key(request.url()));
    }

    public synchronized int requestCount() {
        return this.requestCount;
    }

    public long size() {
        return this.cache.size();
    }

    /* access modifiers changed from: 0000 */
    public synchronized void trackConditionalCacheHit() {
        this.hitCount++;
    }

    /* access modifiers changed from: 0000 */
    public synchronized void trackResponse(CacheStrategy cacheStrategy) {
        this.requestCount++;
        if (cacheStrategy.networkRequest != null) {
            this.networkCount++;
        } else if (cacheStrategy.cacheResponse != null) {
            this.hitCount++;
        }
    }

    /* access modifiers changed from: 0000 */
    public void update(Response response, Response response2) {
        Editor editor;
        Entry entry = new Entry(response2);
        try {
            editor = ((CacheResponseBody) response.body()).snapshot.edit();
            if (editor != null) {
                try {
                    entry.writeTo(editor);
                    editor.commit();
                } catch (IOException unused) {
                }
            }
        } catch (IOException unused2) {
            editor = null;
            abortQuietly(editor);
        }
    }

    public Iterator<String> urls() {
        return new Iterator<String>() {
            boolean canRemove;
            final Iterator<Snapshot> delegate = Cache.this.cache.snapshots();
            String nextUrl;

            public boolean hasNext() {
                if (this.nextUrl != null) {
                    return true;
                }
                this.canRemove = false;
                while (this.delegate.hasNext()) {
                    Snapshot snapshot = (Snapshot) this.delegate.next();
                    try {
                        this.nextUrl = C2025t.m7756a(snapshot.getSource(0)).mo7127g();
                        return true;
                    } catch (IOException unused) {
                    } finally {
                        snapshot.close();
                    }
                }
                return false;
            }

            public String next() {
                if (hasNext()) {
                    String str = this.nextUrl;
                    this.nextUrl = null;
                    this.canRemove = true;
                    return str;
                }
                throw new NoSuchElementException();
            }

            public void remove() {
                if (this.canRemove) {
                    this.delegate.remove();
                    return;
                }
                throw new IllegalStateException("remove() before next()");
            }
        };
    }

    public synchronized int writeAbortCount() {
        return this.writeAbortCount;
    }

    public synchronized int writeSuccessCount() {
        return this.writeSuccessCount;
    }
}
