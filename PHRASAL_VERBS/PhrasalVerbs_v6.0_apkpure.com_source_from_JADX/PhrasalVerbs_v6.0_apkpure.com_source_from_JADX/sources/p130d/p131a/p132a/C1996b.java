package p130d.p131a.p132a;

import java.util.Arrays;
import java.util.List;

/* renamed from: d.a.a.b */
public class C1996b {
    private C1996b() {
    }

    /* renamed from: a */
    private static <T extends Throwable> T m7600a(T t) {
        m7601a(t, C1996b.class.getName());
        return t;
    }

    /* renamed from: a */
    static <T extends Throwable> T m7601a(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        List subList = Arrays.asList(stackTrace).subList(i + 1, length);
        t.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
        return t;
    }

    /* renamed from: a */
    public static void m7602a(Object obj, String str) {
        if (obj == null) {
            m7603a(str);
            throw null;
        }
    }

    /* renamed from: a */
    private static void m7603a(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        StringBuilder sb = new StringBuilder();
        sb.append("Parameter specified as non-null is null: method ");
        sb.append(className);
        sb.append(".");
        sb.append(methodName);
        sb.append(", parameter ");
        sb.append(str);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(sb.toString());
        m7600a((T) illegalArgumentException);
        throw illegalArgumentException;
    }
}
