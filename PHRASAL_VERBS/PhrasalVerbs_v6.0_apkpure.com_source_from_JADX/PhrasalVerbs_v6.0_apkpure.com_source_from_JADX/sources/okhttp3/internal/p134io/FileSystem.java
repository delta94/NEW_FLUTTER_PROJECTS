package okhttp3.internal.p134io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import p133e.C1999C;
import p133e.C2000D;
import p133e.C2025t;

/* renamed from: okhttp3.internal.io.FileSystem */
public interface FileSystem {
    public static final FileSystem SYSTEM = new FileSystem() {
        public C1999C appendingSink(File file) {
            try {
                return C2025t.m7749a(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C2025t.m7749a(file);
            }
        }

        public void delete(File file) {
            if (!file.delete() && file.exists()) {
                StringBuilder sb = new StringBuilder();
                sb.append("failed to delete ");
                sb.append(file);
                throw new IOException(sb.toString());
            }
        }

        public void deleteContents(File file) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                int i = 0;
                while (i < length) {
                    File file2 = listFiles[i];
                    if (file2.isDirectory()) {
                        deleteContents(file2);
                    }
                    if (file2.delete()) {
                        i++;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("failed to delete ");
                        sb.append(file2);
                        throw new IOException(sb.toString());
                    }
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("not a readable directory: ");
            sb2.append(file);
            throw new IOException(sb2.toString());
        }

        public boolean exists(File file) {
            return file.exists();
        }

        public void rename(File file, File file2) {
            delete(file2);
            if (!file.renameTo(file2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("failed to rename ");
                sb.append(file);
                sb.append(" to ");
                sb.append(file2);
                throw new IOException(sb.toString());
            }
        }

        public C1999C sink(File file) {
            try {
                return C2025t.m7758b(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C2025t.m7758b(file);
            }
        }

        public long size(File file) {
            return file.length();
        }

        public C2000D source(File file) {
            return C2025t.m7760c(file);
        }
    };

    C1999C appendingSink(File file);

    void delete(File file);

    void deleteContents(File file);

    boolean exists(File file);

    void rename(File file, File file2);

    C1999C sink(File file);

    long size(File file);

    C2000D source(File file);
}
