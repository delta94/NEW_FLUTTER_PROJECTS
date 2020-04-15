package p032c.p033a.p093j;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.support.p029v4.util.C0336m;
import android.util.Pair;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p032c.p033a.p038c.p042d.C0718j;

/* renamed from: c.a.j.b */
public final class C1129b {

    /* renamed from: a */
    private static final C0336m<ByteBuffer> f3781a = new C0336m<>(12);

    /* renamed from: a */
    public static int m5027a(int i, int i2, Config config) {
        return i * i2 * m5028a(config);
    }

    /* renamed from: a */
    public static int m5028a(Config config) {
        int i = C1128a.f3780a[config.ordinal()];
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3 || i == 4) {
            return 2;
        }
        throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static int m5029a(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        if (VERSION.SDK_INT > 19) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
            }
        }
        return VERSION.SDK_INT >= 12 ? bitmap.getByteCount() : bitmap.getRowBytes() * bitmap.getHeight();
    }

    /* renamed from: a */
    public static Pair<Integer, Integer> m5030a(InputStream inputStream) {
        C0718j.m3240a(inputStream);
        ByteBuffer byteBuffer = (ByteBuffer) f3781a.mo1311a();
        if (byteBuffer == null) {
            byteBuffer = ByteBuffer.allocate(16384);
        }
        Options options = new Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = byteBuffer.array();
            Pair<Integer, Integer> pair = null;
            BitmapFactory.decodeStream(inputStream, null, options);
            if (options.outWidth != -1) {
                if (options.outHeight != -1) {
                    pair = new Pair<>(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
                }
            }
            return pair;
        } finally {
            f3781a.mo1312a(byteBuffer);
        }
    }
}
