package okhttp3.internal.http;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.Headers.Builder;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import p133e.C2011g;
import p133e.C2015j;

public final class HttpHeaders {
    private static final C2015j QUOTED_STRING_DELIMITERS = C2015j.m7721c("\"\\");
    private static final C2015j TOKEN_DELIMITERS = C2015j.m7721c("\t ,=");

    private HttpHeaders() {
    }

    public static long contentLength(Headers headers) {
        return stringToLong(headers.get("Content-Length"));
    }

    public static long contentLength(Response response) {
        return contentLength(response.headers());
    }

    public static boolean hasBody(Response response) {
        if (response.request().method().equals("HEAD")) {
            return false;
        }
        int code = response.code();
        if (((code >= 100 && code < 200) || code == 204 || code == 304) && contentLength(response) == -1) {
            return "chunked".equalsIgnoreCase(response.header("Transfer-Encoding"));
        }
    }

    public static boolean hasVaryAll(Headers headers) {
        return varyFields(headers).contains("*");
    }

    public static boolean hasVaryAll(Response response) {
        return hasVaryAll(response.headers());
    }

    private static void parseChallengeHeader(List<Challenge> list, C2011g gVar) {
        String readToken;
        int skipAll;
        while (true) {
            String str = null;
            while (true) {
                if (str == null) {
                    skipWhitespaceAndCommas(gVar);
                    str = readToken(gVar);
                    if (str == null) {
                        return;
                    }
                }
                boolean skipWhitespaceAndCommas = skipWhitespaceAndCommas(gVar);
                readToken = readToken(gVar);
                if (readToken != null) {
                    skipAll = skipAll(gVar, 61);
                    boolean skipWhitespaceAndCommas2 = skipWhitespaceAndCommas(gVar);
                    if (skipWhitespaceAndCommas || (!skipWhitespaceAndCommas2 && !gVar.mo7119d())) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int skipAll2 = skipAll + skipAll(gVar, 61);
                        while (true) {
                            if (readToken == null) {
                                readToken = readToken(gVar);
                                if (skipWhitespaceAndCommas(gVar)) {
                                    continue;
                                    break;
                                }
                                skipAll2 = skipAll(gVar, 61);
                            }
                            if (skipAll2 == 0) {
                                continue;
                                break;
                            } else if (skipAll2 <= 1 && !skipWhitespaceAndCommas(gVar)) {
                                String readToken2 = (gVar.mo7119d() || gVar.mo7128h(0) != 34) ? readToken(gVar) : readQuotedString(gVar);
                                if (readToken2 == null || ((String) linkedHashMap.put(readToken, readToken2)) != null) {
                                    return;
                                }
                                if (skipWhitespaceAndCommas(gVar) || gVar.mo7119d()) {
                                    readToken = null;
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        list.add(new Challenge(str, (Map<String, String>) linkedHashMap));
                        str = readToken;
                    }
                } else if (gVar.mo7119d()) {
                    list.add(new Challenge(str, Collections.emptyMap()));
                    return;
                } else {
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(readToken);
            sb.append(repeat('=', skipAll));
            list.add(new Challenge(str, Collections.singletonMap(null, sb.toString())));
        }
    }

    public static List<Challenge> parseChallenges(Headers headers, String str) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < headers.size(); i++) {
            if (str.equalsIgnoreCase(headers.name(i))) {
                C2011g gVar = new C2011g();
                gVar.mo7100a(headers.value(i));
                parseChallengeHeader(arrayList, gVar);
            }
        }
        return arrayList;
    }

    public static int parseSeconds(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            i = (int) parseLong;
            return i;
        } catch (NumberFormatException unused) {
        }
    }

    private static String readQuotedString(C2011g gVar) {
        if (gVar.readByte() == 34) {
            C2011g gVar2 = new C2011g();
            while (true) {
                long b = gVar.mo7111b(QUOTED_STRING_DELIMITERS);
                if (b == -1) {
                    return null;
                }
                if (gVar.mo7128h(b) == 34) {
                    gVar2.write(gVar, b);
                    gVar.readByte();
                    return gVar2.mo7142p();
                } else if (gVar.size() == b + 1) {
                    return null;
                } else {
                    gVar2.write(gVar, b);
                    gVar.readByte();
                    gVar2.write(gVar, 1);
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    private static String readToken(C2011g gVar) {
        try {
            long b = gVar.mo7111b(TOKEN_DELIMITERS);
            if (b == -1) {
                b = gVar.size();
            }
            if (b != 0) {
                return gVar.mo7131i(b);
            }
            return null;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    public static void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        if (cookieJar != CookieJar.NO_COOKIES) {
            List parseAll = Cookie.parseAll(httpUrl, headers);
            if (!parseAll.isEmpty()) {
                cookieJar.saveFromResponse(httpUrl, parseAll);
            }
        }
    }

    private static String repeat(char c, int i) {
        char[] cArr = new char[i];
        Arrays.fill(cArr, c);
        return new String(cArr);
    }

    private static int skipAll(C2011g gVar, byte b) {
        int i = 0;
        while (!gVar.mo7119d() && gVar.mo7128h(0) == b) {
            i++;
            gVar.readByte();
        }
        return i;
    }

    public static int skipUntil(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static int skipWhitespace(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != 9) {
                break;
            }
            i++;
        }
        return i;
    }

    private static boolean skipWhitespaceAndCommas(C2011g gVar) {
        boolean z = false;
        while (!gVar.mo7119d()) {
            byte h = gVar.mo7128h(0);
            if (h != 44) {
                if (h != 32 && h != 9) {
                    break;
                }
                gVar.readByte();
            } else {
                gVar.readByte();
                z = true;
            }
        }
        return z;
    }

    private static long stringToLong(String str) {
        long j = -1;
        if (str == null) {
            return -1;
        }
        try {
            j = Long.parseLong(str);
        } catch (NumberFormatException unused) {
        }
        return j;
    }

    public static Set<String> varyFields(Headers headers) {
        Set emptySet = Collections.emptySet();
        int size = headers.size();
        Set set = emptySet;
        for (int i = 0; i < size; i++) {
            if ("Vary".equalsIgnoreCase(headers.name(i))) {
                String value = headers.value(i);
                if (set.isEmpty()) {
                    set = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                }
                for (String trim : value.split(",")) {
                    set.add(trim.trim());
                }
            }
        }
        return set;
    }

    private static Set<String> varyFields(Response response) {
        return varyFields(response.headers());
    }

    public static Headers varyHeaders(Headers headers, Headers headers2) {
        Set varyFields = varyFields(headers2);
        if (varyFields.isEmpty()) {
            return new Builder().build();
        }
        Builder builder = new Builder();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            String name = headers.name(i);
            if (varyFields.contains(name)) {
                builder.add(name, headers.value(i));
            }
        }
        return builder.build();
    }

    public static Headers varyHeaders(Response response) {
        return varyHeaders(response.networkResponse().request().headers(), response.headers());
    }

    public static boolean varyMatches(Response response, Headers headers, Request request) {
        for (String str : varyFields(response)) {
            if (!Util.equal(headers.values(str), request.headers(str))) {
                return false;
            }
        }
        return true;
    }
}
