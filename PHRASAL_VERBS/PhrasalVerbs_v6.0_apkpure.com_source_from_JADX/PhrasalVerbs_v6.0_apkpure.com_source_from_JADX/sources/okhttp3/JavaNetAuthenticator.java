package okhttp3;

import java.net.Authenticator;
import java.net.Authenticator.RequestorType;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.URL;
import java.util.List;
import okhttp3.internal.annotations.EverythingIsNonNull;

@EverythingIsNonNull
public final class JavaNetAuthenticator implements Authenticator {
    private InetAddress getConnectToInetAddress(Proxy proxy, HttpUrl httpUrl) {
        return (proxy == null || proxy.type() == Type.DIRECT) ? InetAddress.getByName(httpUrl.host()) : ((InetSocketAddress) proxy.address()).getAddress();
    }

    public Request authenticate(Route route, Response response) {
        RequestorType requestorType;
        URL url;
        String str;
        String str2;
        String str3;
        int i;
        InetAddress inetAddress;
        String str4;
        List challenges = response.challenges();
        Request request = response.request();
        HttpUrl url2 = request.url();
        boolean z = response.code() == 407;
        Proxy proxy = route.proxy();
        int size = challenges.size();
        for (int i2 = 0; i2 < size; i2++) {
            Challenge challenge = (Challenge) challenges.get(i2);
            if ("Basic".equalsIgnoreCase(challenge.scheme())) {
                if (z) {
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) proxy.address();
                    str4 = inetSocketAddress.getHostName();
                    inetAddress = getConnectToInetAddress(proxy, url2);
                    i = inetSocketAddress.getPort();
                    str3 = url2.scheme();
                    str2 = challenge.realm();
                    str = challenge.scheme();
                    url = url2.url();
                    requestorType = RequestorType.PROXY;
                } else {
                    str4 = url2.host();
                    inetAddress = getConnectToInetAddress(proxy, url2);
                    i = url2.port();
                    str3 = url2.scheme();
                    str2 = challenge.realm();
                    str = challenge.scheme();
                    url = url2.url();
                    requestorType = RequestorType.SERVER;
                }
                PasswordAuthentication requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(str4, inetAddress, i, str3, str2, str, url, requestorType);
                if (requestPasswordAuthentication != null) {
                    return request.newBuilder().header(z ? "Proxy-Authorization" : "Authorization", Credentials.basic(requestPasswordAuthentication.getUserName(), new String(requestPasswordAuthentication.getPassword()), challenge.charset())).build();
                }
            }
        }
        return null;
    }
}
