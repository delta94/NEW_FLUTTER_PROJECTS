package p133e;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* renamed from: e.t */
public final class C2025t {

    /* renamed from: a */
    static final Logger f5956a = Logger.getLogger(C2025t.class.getName());

    private C2025t() {
    }

    /* renamed from: a */
    public static C1999C m7748a() {
        return new C2023r();
    }

    /* renamed from: a */
    public static C1999C m7749a(File file) {
        if (file != null) {
            return m7750a((OutputStream) new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: a */
    public static C1999C m7750a(OutputStream outputStream) {
        return m7751a(outputStream, new C2002F());
    }

    /* renamed from: a */
    private static C1999C m7751a(OutputStream outputStream, C2002F f) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        } else if (f != null) {
            return new C2021p(f, outputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    /* renamed from: a */
    public static C1999C m7752a(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            C2006c c = m7761c(socket);
            return c.sink(m7751a(socket.getOutputStream(), (C2002F) c));
        } else {
            throw new IOException("socket's output stream == null");
        }
    }

    /* renamed from: a */
    public static C2000D m7753a(InputStream inputStream) {
        return m7754a(inputStream, new C2002F());
    }

    /* renamed from: a */
    private static C2000D m7754a(InputStream inputStream, C2002F f) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (f != null) {
            return new C2022q(f, inputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    /* renamed from: a */
    public static C2013h m7755a(C1999C c) {
        return new C2030w(c);
    }

    /* renamed from: a */
    public static C2014i m7756a(C2000D d) {
        return new C2032y(d);
    }

    /* renamed from: a */
    static boolean m7757a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* renamed from: b */
    public static C1999C m7758b(File file) {
        if (file != null) {
            return m7750a((OutputStream) new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: b */
    public static C2000D m7759b(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            C2006c c = m7761c(socket);
            return c.source(m7754a(socket.getInputStream(), (C2002F) c));
        } else {
            throw new IOException("socket's input stream == null");
        }
    }

    /* renamed from: c */
    public static C2000D m7760c(File file) {
        if (file != null) {
            return m7753a((InputStream) new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: c */
    private static C2006c m7761c(Socket socket) {
        return new C2024s(socket);
    }
}
