package com.facebook.react.modules.network;

import android.content.Context;
import android.net.Uri;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.C1400h;
import com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.JavaNetCookieJar;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p098m.p102d.p103a.C1176a;
import p133e.C2015j;

@C1176a(name = "Networking")
public final class NetworkingModule extends ReactContextBaseJavaModule {
    private static final int CHUNK_TIMEOUT_NS = 100000000;
    private static final String CONTENT_ENCODING_HEADER_NAME = "content-encoding";
    private static final String CONTENT_TYPE_HEADER_NAME = "content-type";
    private static final int MAX_CHUNK_SIZE_BETWEEN_FLUSHES = 8192;
    protected static final String NAME = "Networking";
    private static final String REQUEST_BODY_KEY_BASE64 = "base64";
    private static final String REQUEST_BODY_KEY_FORMDATA = "formData";
    private static final String REQUEST_BODY_KEY_STRING = "string";
    private static final String REQUEST_BODY_KEY_URI = "uri";
    private static final String TAG = "NetworkingModule";
    private static final String USER_AGENT_HEADER_NAME = "user-agent";
    /* access modifiers changed from: private */
    public final OkHttpClient mClient;
    private final C1516i mCookieHandler;
    private final C1508a mCookieJarContainer;
    private final String mDefaultUserAgent;
    private final List<C1505a> mRequestBodyHandlers;
    private final Set<Integer> mRequestIds;
    /* access modifiers changed from: private */
    public final List<C1506b> mResponseHandlers;
    /* access modifiers changed from: private */
    public boolean mShuttingDown;
    private final List<C1507c> mUriHandlers;

    /* renamed from: com.facebook.react.modules.network.NetworkingModule$a */
    public interface C1505a {
        /* renamed from: a */
        RequestBody mo5294a(ReadableMap readableMap, String str);

        /* renamed from: a */
        boolean mo5295a(ReadableMap readableMap);
    }

    /* renamed from: com.facebook.react.modules.network.NetworkingModule$b */
    public interface C1506b {
        /* renamed from: a */
        WritableMap mo5296a(ResponseBody responseBody);

        /* renamed from: a */
        boolean mo5297a(String str);
    }

    /* renamed from: com.facebook.react.modules.network.NetworkingModule$c */
    public interface C1507c {
        /* renamed from: a */
        WritableMap mo5292a(Uri uri);

        /* renamed from: a */
        boolean mo5293a(Uri uri, String str);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, null, C1526r.m6030a((Context) reactApplicationContext), null);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, String str) {
        this(reactApplicationContext, str, C1526r.m6030a((Context) reactApplicationContext), null);
    }

    NetworkingModule(ReactApplicationContext reactApplicationContext, String str, OkHttpClient okHttpClient) {
        this(reactApplicationContext, str, okHttpClient, null);
    }

    NetworkingModule(ReactApplicationContext reactApplicationContext, String str, OkHttpClient okHttpClient, List<C1519k> list) {
        super(reactApplicationContext);
        this.mRequestBodyHandlers = new ArrayList();
        this.mUriHandlers = new ArrayList();
        this.mResponseHandlers = new ArrayList();
        if (list != null) {
            Builder newBuilder = okHttpClient.newBuilder();
            for (C1519k create : list) {
                newBuilder.addNetworkInterceptor(create.create());
            }
            okHttpClient = newBuilder.build();
        }
        this.mClient = okHttpClient;
        this.mCookieHandler = new C1516i(reactApplicationContext);
        this.mCookieJarContainer = (C1508a) this.mClient.cookieJar();
        this.mShuttingDown = false;
        this.mDefaultUserAgent = str;
        this.mRequestIds = new HashSet();
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, List<C1519k> list) {
        this(reactApplicationContext, null, C1526r.m6030a((Context) reactApplicationContext), list);
    }

    private synchronized void addRequest(int i) {
        this.mRequestIds.add(Integer.valueOf(i));
    }

    private synchronized void cancelAllRequests() {
        for (Integer intValue : this.mRequestIds) {
            cancelRequest(intValue.intValue());
        }
        this.mRequestIds.clear();
    }

    private void cancelRequest(int i) {
        new C1524p(this, getReactApplicationContext(), i).execute(new Void[0]);
    }

    private MultipartBody.Builder constructMultipartBody(ReadableArray readableArray, String str, int i) {
        String str2;
        MediaType mediaType;
        RequestBody a;
        RCTDeviceEventEmitter eventEmitter = getEventEmitter();
        MultipartBody.Builder builder = new MultipartBody.Builder();
        builder.setType(MediaType.parse(str));
        int size = readableArray.size();
        int i2 = 0;
        while (i2 < size) {
            ReadableMap map = readableArray.getMap(i2);
            Headers extractHeaders = extractHeaders(map.getArray("headers"), null);
            if (extractHeaders == null) {
                str2 = "Missing or invalid header format for FormData part.";
            } else {
                String str3 = CONTENT_TYPE_HEADER_NAME;
                String str4 = extractHeaders.get(str3);
                if (str4 != null) {
                    mediaType = MediaType.parse(str4);
                    extractHeaders = extractHeaders.newBuilder().removeAll(str3).build();
                } else {
                    mediaType = null;
                }
                String str5 = REQUEST_BODY_KEY_STRING;
                if (map.hasKey(str5)) {
                    a = RequestBody.create(mediaType, map.getString(str5));
                } else {
                    String str6 = REQUEST_BODY_KEY_URI;
                    if (!map.hasKey(str6)) {
                        C1503B.m5990a(eventEmitter, i, "Unrecognized FormData part.", (Throwable) null);
                        i2++;
                    } else if (mediaType == null) {
                        str2 = "Binary FormData part needs a content-type header.";
                    } else {
                        String string = map.getString(str6);
                        InputStream a2 = C1502A.m5979a((Context) getReactApplicationContext(), string);
                        if (a2 == null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Could not retrieve file for uri ");
                            sb.append(string);
                            str2 = sb.toString();
                        } else {
                            a = C1502A.m5981a(mediaType, a2);
                        }
                    }
                }
                builder.addPart(extractHeaders, a);
                i2++;
            }
            C1503B.m5990a(eventEmitter, i, str2, (Throwable) null);
            return null;
        }
        return builder;
    }

    private Headers extractHeaders(ReadableArray readableArray, ReadableMap readableMap) {
        if (readableArray == null) {
            return null;
        }
        Headers.Builder builder = new Headers.Builder();
        int size = readableArray.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            ReadableArray array = readableArray.getArray(i);
            if (array != null && array.size() == 2) {
                String a = C1518j.m6021a(array.getString(0));
                String b = C1518j.m6022b(array.getString(1));
                if (!(a == null || b == null)) {
                    builder.add(a, b);
                    i++;
                }
            }
            return null;
        }
        String str = USER_AGENT_HEADER_NAME;
        if (builder.get(str) == null) {
            String str2 = this.mDefaultUserAgent;
            if (str2 != null) {
                builder.add(str, str2);
            }
        }
        if (readableMap != null && readableMap.hasKey(REQUEST_BODY_KEY_STRING)) {
            z = true;
        }
        if (!z) {
            builder.removeAll(CONTENT_ENCODING_HEADER_NAME);
        }
        return builder.build();
    }

    private RCTDeviceEventEmitter getEventEmitter() {
        return (RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(RCTDeviceEventEmitter.class);
    }

    /* access modifiers changed from: private */
    public void readWithProgress(RCTDeviceEventEmitter rCTDeviceEventEmitter, int i, ResponseBody responseBody) {
        long j;
        long j2 = -1;
        try {
            C1531w wVar = (C1531w) responseBody;
            j = wVar.mo5470m();
            try {
                j2 = wVar.contentLength();
            } catch (ClassCastException unused) {
            }
        } catch (ClassCastException unused2) {
            j = -1;
        }
        C1532x xVar = new C1532x(responseBody.contentType() == null ? C1400h.f4396a : responseBody.contentType().charset(C1400h.f4396a));
        InputStream byteStream = responseBody.byteStream();
        try {
            byte[] bArr = new byte[MAX_CHUNK_SIZE_BETWEEN_FLUSHES];
            while (true) {
                int read = byteStream.read(bArr);
                if (read != -1) {
                    C1503B.m5989a(rCTDeviceEventEmitter, i, xVar.mo5472a(bArr, read), j, j2);
                } else {
                    return;
                }
            }
        } finally {
            byteStream.close();
        }
    }

    /* access modifiers changed from: private */
    public synchronized void removeRequest(int i) {
        this.mRequestIds.remove(Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    public static boolean shouldDispatch(long j, long j2) {
        return j2 + 100000000 < j;
    }

    /* access modifiers changed from: private */
    public static WritableMap translateHeaders(Headers headers) {
        String str;
        WritableMap createMap = Arguments.createMap();
        for (int i = 0; i < headers.size(); i++) {
            String name = headers.name(i);
            if (createMap.hasKey(name)) {
                StringBuilder sb = new StringBuilder();
                sb.append(createMap.getString(name));
                sb.append(", ");
                sb.append(headers.value(i));
                str = sb.toString();
            } else {
                str = headers.value(i);
            }
            createMap.putString(name, str);
        }
        return createMap;
    }

    private RequestBody wrapRequestBodyWithProgressEmitter(RequestBody requestBody, RCTDeviceEventEmitter rCTDeviceEventEmitter, int i) {
        if (requestBody == null) {
            return null;
        }
        return C1502A.m5977a(requestBody, (C1527s) new C1523o(this, rCTDeviceEventEmitter, i));
    }

    @ReactMethod
    public void abortRequest(int i) {
        cancelRequest(i);
        removeRequest(i);
    }

    public void addRequestBodyHandler(C1505a aVar) {
        this.mRequestBodyHandlers.add(aVar);
    }

    public void addResponseHandler(C1506b bVar) {
        this.mResponseHandlers.add(bVar);
    }

    public void addUriHandler(C1507c cVar) {
        this.mUriHandlers.add(cVar);
    }

    @ReactMethod
    public void clearCookies(Callback callback) {
        this.mCookieHandler.mo5453a(callback);
    }

    public String getName() {
        return NAME;
    }

    public void initialize() {
        this.mCookieJarContainer.mo5441a(new JavaNetCookieJar(this.mCookieHandler));
    }

    public void onCatalystInstanceDestroy() {
        this.mShuttingDown = true;
        cancelAllRequests();
        this.mCookieHandler.mo5454b();
        this.mCookieJarContainer.mo5440a();
        this.mRequestBodyHandlers.clear();
        this.mResponseHandlers.clear();
        this.mUriHandlers.clear();
    }

    public void removeRequestBodyHandler(C1505a aVar) {
        this.mRequestBodyHandlers.remove(aVar);
    }

    public void removeResponseHandler(C1506b bVar) {
        this.mResponseHandlers.remove(bVar);
    }

    public void removeUriHandler(C1507c cVar) {
        this.mUriHandlers.remove(cVar);
    }

    @ReactMethod
    public void sendRequest(String str, String str2, int i, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z, int i2, boolean z2) {
        try {
            sendRequestInternal(str, str2, i, readableArray, readableMap, str3, z, i2, z2);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to send url request: ");
            sb.append(str2);
            C0727a.m3267a(TAG, sb.toString(), th);
            C1503B.m5990a(getEventEmitter(), i, th.getMessage(), th);
        }
    }

    public void sendRequestInternal(String str, String str2, int i, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z, int i2, boolean z2) {
        C1505a aVar;
        RequestBody requestBody;
        RCTDeviceEventEmitter eventEmitter = getEventEmitter();
        try {
            Uri parse = Uri.parse(str2);
            for (C1507c cVar : this.mUriHandlers) {
                if (cVar.mo5293a(parse, str3)) {
                    C1503B.m5987a(eventEmitter, i, cVar.mo5292a(parse));
                    C1503B.m5984a(eventEmitter, i);
                    return;
                }
            }
            try {
                Request.Builder url = new Request.Builder().url(str2);
                if (i != 0) {
                    url.tag(Integer.valueOf(i));
                }
                Builder newBuilder = this.mClient.newBuilder();
                if (!z2) {
                    newBuilder.cookieJar(CookieJar.NO_COOKIES);
                }
                if (z) {
                    newBuilder.addNetworkInterceptor(new C1521m(this, str3, eventEmitter, i));
                }
                if (i2 != this.mClient.connectTimeoutMillis()) {
                    newBuilder.connectTimeout((long) i2, TimeUnit.MILLISECONDS);
                }
                OkHttpClient build = newBuilder.build();
                Headers extractHeaders = extractHeaders(readableArray, readableMap);
                if (extractHeaders == null) {
                    C1503B.m5990a(eventEmitter, i, "Unrecognized headers format", (Throwable) null);
                    return;
                }
                String str4 = extractHeaders.get(CONTENT_TYPE_HEADER_NAME);
                String str5 = extractHeaders.get(CONTENT_ENCODING_HEADER_NAME);
                url.headers(extractHeaders);
                if (readableMap != null) {
                    Iterator it = this.mRequestBodyHandlers.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        aVar = (C1505a) it.next();
                        if (aVar.mo5295a(readableMap)) {
                            break;
                        }
                    }
                }
                aVar = null;
                if (readableMap != null && !str.toLowerCase().equals("get") && !str.toLowerCase().equals("head")) {
                    if (aVar != null) {
                        requestBody = aVar.mo5294a(readableMap, str4);
                    } else {
                        String str6 = REQUEST_BODY_KEY_STRING;
                        String str7 = "Payload is set but no content-type header specified";
                        if (!readableMap.hasKey(str6)) {
                            String str8 = REQUEST_BODY_KEY_BASE64;
                            if (!readableMap.hasKey(str8)) {
                                String str9 = REQUEST_BODY_KEY_URI;
                                if (!readableMap.hasKey(str9)) {
                                    String str10 = REQUEST_BODY_KEY_FORMDATA;
                                    if (readableMap.hasKey(str10)) {
                                        if (str4 == null) {
                                            str4 = "multipart/form-data";
                                        }
                                        MultipartBody.Builder constructMultipartBody = constructMultipartBody(readableMap.getArray(str10), str4, i);
                                        if (constructMultipartBody != null) {
                                            requestBody = constructMultipartBody.build();
                                        } else {
                                            return;
                                        }
                                    }
                                } else if (str4 == null) {
                                    C1503B.m5990a(eventEmitter, i, str7, (Throwable) null);
                                    return;
                                } else {
                                    String string = readableMap.getString(str9);
                                    InputStream a = C1502A.m5979a((Context) getReactApplicationContext(), string);
                                    if (a == null) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("Could not retrieve file for uri ");
                                        sb.append(string);
                                        C1503B.m5990a(eventEmitter, i, sb.toString(), (Throwable) null);
                                        return;
                                    }
                                    requestBody = C1502A.m5981a(MediaType.parse(str4), a);
                                }
                            } else if (str4 == null) {
                                C1503B.m5990a(eventEmitter, i, str7, (Throwable) null);
                                return;
                            } else {
                                requestBody = RequestBody.create(MediaType.parse(str4), C2015j.m7717a(readableMap.getString(str8)));
                            }
                        } else if (str4 == null) {
                            C1503B.m5990a(eventEmitter, i, str7, (Throwable) null);
                            return;
                        } else {
                            String string2 = readableMap.getString(str6);
                            MediaType parse2 = MediaType.parse(str4);
                            if (C1502A.m5983b(str5)) {
                                requestBody = C1502A.m5982a(parse2, string2);
                                if (requestBody == null) {
                                    C1503B.m5990a(eventEmitter, i, "Failed to gzip request body", (Throwable) null);
                                    return;
                                }
                            } else {
                                requestBody = RequestBody.create(parse2, string2.getBytes(parse2 == null ? C1400h.f4396a : parse2.charset(C1400h.f4396a)));
                            }
                        }
                    }
                    url.method(str, wrapRequestBodyWithProgressEmitter(requestBody, eventEmitter, i));
                    addRequest(i);
                    Call newCall = build.newCall(url.build());
                    C1522n nVar = new C1522n(this, i, eventEmitter, str3, z);
                    newCall.enqueue(nVar);
                }
                requestBody = C1502A.m5980a(str);
                url.method(str, wrapRequestBodyWithProgressEmitter(requestBody, eventEmitter, i));
                addRequest(i);
                Call newCall2 = build.newCall(url.build());
                C1522n nVar2 = new C1522n(this, i, eventEmitter, str3, z);
                newCall2.enqueue(nVar2);
            } catch (Exception e) {
                C1503B.m5990a(eventEmitter, i, e.getMessage(), (Throwable) null);
            }
        } catch (IOException e2) {
            C1503B.m5990a(eventEmitter, i, e2.getMessage(), (Throwable) e2);
        }
    }
}
