package okhttp3.internal.cache2;

import java.nio.channels.FileChannel;
import p133e.C2011g;

final class FileOperator {
    private final FileChannel fileChannel;

    FileOperator(FileChannel fileChannel2) {
        this.fileChannel = fileChannel2;
    }

    public void read(long j, C2011g gVar, long j2) {
        if (j2 >= 0) {
            while (j2 > 0) {
                long transferTo = this.fileChannel.transferTo(j, j2, gVar);
                j += transferTo;
                j2 -= transferTo;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public void write(long j, C2011g gVar, long j2) {
        if (j2 < 0 || j2 > gVar.size()) {
            throw new IndexOutOfBoundsException();
        }
        long j3 = j;
        long j4 = j2;
        while (j4 > 0) {
            long transferFrom = this.fileChannel.transferFrom(gVar, j3, j4);
            j3 += transferFrom;
            j4 -= transferFrom;
        }
    }
}
