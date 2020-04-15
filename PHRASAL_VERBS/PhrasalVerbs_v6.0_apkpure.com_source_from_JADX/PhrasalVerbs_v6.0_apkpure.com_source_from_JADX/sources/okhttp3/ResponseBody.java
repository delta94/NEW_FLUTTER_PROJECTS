package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import okhttp3.internal.Util;
import p133e.C2011g;
import p133e.C2014i;
import p133e.C2015j;

public abstract class ResponseBody implements Closeable {
    private Reader reader;

    static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final C2014i source;

        BomAwareReader(C2014i iVar, Charset charset2) {
            this.source = iVar;
            this.charset = charset2;
        }

        public void close() {
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
            } else {
                this.source.close();
            }
        }

        public int read(char[] cArr, int i, int i2) {
            if (!this.closed) {
                Reader reader = this.delegate;
                if (reader == null) {
                    Reader inputStreamReader = new InputStreamReader(this.source.mo7138l(), Util.bomAwareCharset(this.source, this.charset));
                    this.delegate = inputStreamReader;
                    reader = inputStreamReader;
                }
                return reader.read(cArr, i, i2);
            }
            throw new IOException("Stream closed");
        }
    }

    private Charset charset() {
        MediaType contentType = contentType();
        return contentType != null ? contentType.charset(Util.UTF_8) : Util.UTF_8;
    }

    public static ResponseBody create(final MediaType mediaType, final long j, final C2014i iVar) {
        if (iVar != null) {
            return new ResponseBody() {
                public long contentLength() {
                    return j;
                }

                public MediaType contentType() {
                    return MediaType.this;
                }

                public C2014i source() {
                    return iVar;
                }
            };
        }
        throw new NullPointerException("source == null");
    }

    public static ResponseBody create(MediaType mediaType, C2015j jVar) {
        C2011g gVar = new C2011g();
        gVar.mo7099a(jVar);
        return create(mediaType, (long) jVar.mo7048g(), gVar);
    }

    public static ResponseBody create(MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        if (mediaType != null) {
            charset = mediaType.charset();
            if (charset == null) {
                charset = Util.UTF_8;
                StringBuilder sb = new StringBuilder();
                sb.append(mediaType);
                sb.append("; charset=utf-8");
                mediaType = MediaType.parse(sb.toString());
            }
        }
        C2011g gVar = new C2011g();
        gVar.mo7103a(str, charset);
        return create(mediaType, gVar.size(), gVar);
    }

    public static ResponseBody create(MediaType mediaType, byte[] bArr) {
        C2011g gVar = new C2011g();
        gVar.write(bArr);
        return create(mediaType, (long) bArr.length, gVar);
    }

    public final InputStream byteStream() {
        return source().mo7138l();
    }

    /* JADX INFO: finally extract failed */
    public final byte[] bytes() {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            C2014i source = source();
            try {
                byte[] c = source.mo7117c();
                Util.closeQuietly((Closeable) source);
                if (contentLength == -1 || contentLength == ((long) c.length)) {
                    return c;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Content-Length (");
                sb.append(contentLength);
                sb.append(") and stream length (");
                sb.append(c.length);
                sb.append(") disagree");
                throw new IOException(sb.toString());
            } catch (Throwable th) {
                Util.closeQuietly((Closeable) source);
                throw th;
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot buffer entire body for content length: ");
            sb2.append(contentLength);
            throw new IOException(sb2.toString());
        }
    }

    public final Reader charStream() {
        Reader reader2 = this.reader;
        if (reader2 != null) {
            return reader2;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    public void close() {
        Util.closeQuietly((Closeable) source());
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract C2014i source();

    public final String string() {
        C2014i source = source();
        try {
            return source.mo7107a(Util.bomAwareCharset(source, charset()));
        } finally {
            Util.closeQuietly((Closeable) source);
        }
    }
}
