package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

/* renamed from: com.facebook.soloader.k */
public final class C1924k {

    /* renamed from: com.facebook.soloader.k$a */
    private static class C1925a extends RuntimeException {
        C1925a(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    private static long m7303a(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        m7304a(fileChannel, byteBuffer, 8, j);
        return byteBuffer.getLong();
    }

    /* renamed from: a */
    private static void m7304a(FileChannel fileChannel, ByteBuffer byteBuffer, int i, long j) {
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0) {
            int read = fileChannel.read(byteBuffer, j);
            if (read == -1) {
                break;
            }
            j += (long) read;
        }
        if (byteBuffer.remaining() <= 0) {
            byteBuffer.position(0);
            return;
        }
        throw new C1925a("ELF file truncated");
    }

    /* renamed from: a */
    public static String[] m7305a(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return m7306a(fileInputStream.getChannel());
        } finally {
            fileInputStream.close();
        }
    }

    /* renamed from: a */
    public static String[] m7306a(FileChannel fileChannel) {
        long j;
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        FileChannel fileChannel2 = fileChannel;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (m7309d(fileChannel2, allocate, 0) == 1179403647) {
            boolean z2 = true;
            if (m7310e(fileChannel2, allocate, 4) != 1) {
                z2 = false;
            }
            if (m7310e(fileChannel2, allocate, 5) == 2) {
                allocate.order(ByteOrder.BIG_ENDIAN);
            }
            long d = z2 ? m7309d(fileChannel2, allocate, 28) : m7303a(fileChannel2, allocate, 32);
            long c = z2 ? (long) m7308c(fileChannel2, allocate, 44) : (long) m7308c(fileChannel2, allocate, 56);
            int c2 = m7308c(fileChannel2, allocate, z2 ? 42 : 54);
            if (c == 65535) {
                long d2 = z2 ? m7309d(fileChannel2, allocate, 32) : m7303a(fileChannel2, allocate, 40);
                c = m7309d(fileChannel2, allocate, z2 ? d2 + 28 : d2 + 44);
            }
            long j7 = d;
            long j8 = 0;
            while (true) {
                if (j8 >= c) {
                    j = 0;
                    break;
                } else if (m7309d(fileChannel2, allocate, j7 + 0) == 2) {
                    j = z2 ? m7309d(fileChannel2, allocate, j7 + 4) : m7303a(fileChannel2, allocate, j7 + 8);
                } else {
                    j7 += (long) c2;
                    j8++;
                }
            }
            long j9 = 0;
            if (j != 0) {
                long j10 = j;
                long j11 = 0;
                int i = 0;
                while (true) {
                    if (z2) {
                        z = z2;
                        j2 = m7309d(fileChannel2, allocate, j10 + j9);
                    } else {
                        z = z2;
                        j2 = m7303a(fileChannel2, allocate, j10 + j9);
                    }
                    String str = "malformed DT_NEEDED section";
                    if (j2 == 1) {
                        j3 = j;
                        if (i != Integer.MAX_VALUE) {
                            i++;
                        } else {
                            throw new C1925a(str);
                        }
                    } else {
                        j3 = j;
                        if (j2 == 5) {
                            j11 = z ? m7309d(fileChannel2, allocate, j10 + 4) : m7303a(fileChannel2, allocate, j10 + 8);
                        }
                    }
                    long j12 = 16;
                    j10 += z ? 8 : 16;
                    j9 = 0;
                    if (j2 != 0) {
                        z2 = z;
                        j = j3;
                    } else if (j11 != 0) {
                        int i2 = 0;
                        while (true) {
                            if (((long) i2) >= c) {
                                j4 = 0;
                                break;
                            }
                            if (m7309d(fileChannel2, allocate, d + j9) == 1) {
                                long d3 = z ? m7309d(fileChannel2, allocate, d + 8) : m7303a(fileChannel2, allocate, d + j12);
                                if (z) {
                                    j5 = c;
                                    j6 = m7309d(fileChannel2, allocate, d + 20);
                                } else {
                                    j5 = c;
                                    j6 = m7303a(fileChannel2, allocate, d + 40);
                                }
                                if (d3 <= j11 && j11 < j6 + d3) {
                                    j4 = (z ? m7309d(fileChannel2, allocate, d + 4) : m7303a(fileChannel2, allocate, d + 8)) + (j11 - d3);
                                }
                            } else {
                                j5 = c;
                            }
                            d += (long) c2;
                            i2++;
                            c = j5;
                            j12 = 16;
                            j9 = 0;
                        }
                        long j13 = 0;
                        if (j4 != 0) {
                            String[] strArr = new String[i];
                            int i3 = 0;
                            while (true) {
                                long d4 = z ? m7309d(fileChannel2, allocate, j3 + j13) : m7303a(fileChannel2, allocate, j3 + j13);
                                if (d4 == 1) {
                                    strArr[i3] = m7307b(fileChannel2, allocate, (z ? m7309d(fileChannel2, allocate, j3 + 4) : m7303a(fileChannel2, allocate, j3 + 8)) + j4);
                                    if (i3 != Integer.MAX_VALUE) {
                                        i3++;
                                    } else {
                                        throw new C1925a(str);
                                    }
                                }
                                j3 += z ? 8 : 16;
                                if (d4 != 0) {
                                    j13 = 0;
                                } else if (i3 == strArr.length) {
                                    return strArr;
                                } else {
                                    throw new C1925a(str);
                                }
                            }
                        } else {
                            throw new C1925a("did not find file offset of DT_STRTAB table");
                        }
                    } else {
                        throw new C1925a("Dynamic section string-table not found");
                    }
                }
            } else {
                throw new C1925a("ELF file does not contain dynamic linking information");
            }
        } else {
            throw new C1925a("file is not ELF");
        }
    }

    /* renamed from: b */
    private static String m7307b(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j2 = 1 + j;
            short e = m7310e(fileChannel, byteBuffer, j);
            if (e == 0) {
                return sb.toString();
            }
            sb.append((char) e);
            j = j2;
        }
    }

    /* renamed from: c */
    private static int m7308c(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        m7304a(fileChannel, byteBuffer, 2, j);
        return byteBuffer.getShort() & 65535;
    }

    /* renamed from: d */
    private static long m7309d(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        m7304a(fileChannel, byteBuffer, 4, j);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    /* renamed from: e */
    private static short m7310e(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        m7304a(fileChannel, byteBuffer, 1, j);
        return (short) (byteBuffer.get() & 255);
    }
}
