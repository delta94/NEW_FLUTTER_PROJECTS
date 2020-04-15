package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;

/* renamed from: com.facebook.soloader.i */
public final class C1922i implements Closeable {

    /* renamed from: a */
    private final FileOutputStream f5710a;

    /* renamed from: b */
    private final FileLock f5711b;

    private C1922i(File file) {
        this.f5710a = new FileOutputStream(file);
        try {
            FileLock lock = this.f5710a.getChannel().lock();
            if (lock == null) {
            }
            this.f5711b = lock;
        } finally {
            this.f5710a.close();
        }
    }

    /* renamed from: a */
    public static C1922i m7300a(File file) {
        return new C1922i(file);
    }

    public void close() {
        try {
            if (this.f5711b != null) {
                this.f5711b.release();
            }
        } finally {
            this.f5710a.close();
        }
    }
}
