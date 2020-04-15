package com.facebook.react.modules.network;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.facebook.react.modules.network.C */
public class C1504C extends SSLSocketFactory {

    /* renamed from: a */
    private SSLSocketFactory f4627a;

    public C1504C() {
        SSLContext instance = SSLContext.getInstance("TLS");
        instance.init(null, null, null);
        this.f4627a = instance.getSocketFactory();
    }

    /* renamed from: a */
    private Socket m5992a(Socket socket) {
        if (socket != null && (socket instanceof SSLSocket)) {
            ((SSLSocket) socket).setEnabledProtocols(new String[]{"TLSv1", "TLSv1.1", "TLSv1.2"});
        }
        return socket;
    }

    public Socket createSocket(String str, int i) {
        Socket createSocket = this.f4627a.createSocket(str, i);
        m5992a(createSocket);
        return createSocket;
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = this.f4627a.createSocket(str, i, inetAddress, i2);
        m5992a(createSocket);
        return createSocket;
    }

    public Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = this.f4627a.createSocket(inetAddress, i);
        m5992a(createSocket);
        return createSocket;
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = this.f4627a.createSocket(inetAddress, i, inetAddress2, i2);
        m5992a(createSocket);
        return createSocket;
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = this.f4627a.createSocket(socket, str, i, z);
        m5992a(createSocket);
        return createSocket;
    }

    public String[] getDefaultCipherSuites() {
        return this.f4627a.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.f4627a.getSupportedCipherSuites();
    }
}
