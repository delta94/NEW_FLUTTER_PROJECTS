package p032c.p033a.p093j;

import android.util.Pair;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: c.a.j.g */
public class C1135g {
    /* renamed from: a */
    public static int m5042a(InputStream inputStream) {
        return ((((byte) inputStream.read()) << 8) & 65280) | (((byte) inputStream.read()) & 255);
    }

    /* renamed from: a */
    private static String m5043a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append((char) b);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static boolean m5044a(byte[] bArr, String str) {
        if (bArr.length != str.length()) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (str.charAt(i) != bArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static Pair<Integer, Integer> m5045b(InputStream inputStream) {
        byte[] bArr = new byte[4];
        try {
            inputStream.read(bArr);
            if (!m5044a(bArr, "RIFF")) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return null;
            }
            m5047d(inputStream);
            inputStream.read(bArr);
            if (!m5044a(bArr, "WEBP")) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                return null;
            }
            inputStream.read(bArr);
            String a = m5043a(bArr);
            if ("VP8 ".equals(a)) {
                Pair<Integer, Integer> f = m5049f(inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
                return f;
            } else if ("VP8L".equals(a)) {
                Pair<Integer, Integer> g = m5050g(inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                return g;
            } else if ("VP8X".equals(a)) {
                Pair<Integer, Integer> h = m5051h(inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                return h;
            } else {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                return null;
            }
        } catch (IOException e7) {
            e7.printStackTrace();
            if (inputStream != null) {
                inputStream.close();
            }
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
            }
        }
    }

    /* renamed from: c */
    private static byte m5046c(InputStream inputStream) {
        return (byte) (inputStream.read() & 255);
    }

    /* renamed from: d */
    private static int m5047d(InputStream inputStream) {
        return ((((byte) inputStream.read()) << 24) & -16777216) | ((((byte) inputStream.read()) << 16) & 16711680) | ((((byte) inputStream.read()) << 8) & 65280) | (((byte) inputStream.read()) & 255);
    }

    /* renamed from: e */
    private static short m5048e(InputStream inputStream) {
        return (short) (inputStream.read() & 255);
    }

    /* renamed from: f */
    private static Pair<Integer, Integer> m5049f(InputStream inputStream) {
        inputStream.skip(7);
        short e = m5048e(inputStream);
        short e2 = m5048e(inputStream);
        short e3 = m5048e(inputStream);
        if (e == 157 && e2 == 1 && e3 == 42) {
            return new Pair<>(Integer.valueOf(m5042a(inputStream)), Integer.valueOf(m5042a(inputStream)));
        }
        return null;
    }

    /* renamed from: g */
    private static Pair<Integer, Integer> m5050g(InputStream inputStream) {
        m5047d(inputStream);
        if (m5046c(inputStream) != 47) {
            return null;
        }
        byte read = ((byte) inputStream.read()) & 255;
        return new Pair<>(Integer.valueOf(((((byte) inputStream.read()) & 255) | ((read & 63) << 8)) + 1), Integer.valueOf(((((((byte) inputStream.read()) & 255) & 15) << 10) | ((((byte) inputStream.read()) & 255) << 2) | ((read & 192) >> 6)) + 1));
    }

    /* renamed from: h */
    private static Pair<Integer, Integer> m5051h(InputStream inputStream) {
        inputStream.skip(8);
        return new Pair<>(Integer.valueOf(m5052i(inputStream) + 1), Integer.valueOf(m5052i(inputStream) + 1));
    }

    /* renamed from: i */
    private static int m5052i(InputStream inputStream) {
        byte c = m5046c(inputStream);
        return ((m5046c(inputStream) << 16) & 16711680) | ((m5046c(inputStream) << 8) & 65280) | (c & 255);
    }
}
