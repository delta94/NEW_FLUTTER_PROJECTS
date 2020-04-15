package com.facebook.react.modules.network;

import android.content.Context;
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.zip.GZIPOutputStream;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import p032c.p033a.p038c.p043e.C0727a;
import p133e.C2015j;

/* renamed from: com.facebook.react.modules.network.A */
class C1502A {
    /* renamed from: a */
    public static C1529u m5977a(RequestBody requestBody, C1527s sVar) {
        return new C1529u(requestBody, sVar);
    }

    /* renamed from: a */
    private static InputStream m5978a(Context context, Uri uri) {
        FileOutputStream fileOutputStream;
        File createTempFile = File.createTempFile("RequestBodyUtil", "temp", context.getApplicationContext().getCacheDir());
        createTempFile.deleteOnExit();
        InputStream openStream = new URL(uri.toString()).openStream();
        try {
            ReadableByteChannel newChannel = Channels.newChannel(openStream);
            try {
                fileOutputStream = new FileOutputStream(createTempFile);
                fileOutputStream.getChannel().transferFrom(newChannel, 0, Long.MAX_VALUE);
                FileInputStream fileInputStream = new FileInputStream(createTempFile);
                fileOutputStream.close();
                newChannel.close();
                return fileInputStream;
            } catch (Throwable th) {
                newChannel.close();
                throw th;
            }
        } finally {
            openStream.close();
        }
    }

    /* renamed from: a */
    public static InputStream m5979a(Context context, String str) {
        try {
            Uri parse = Uri.parse(str);
            return parse.getScheme().startsWith("http") ? m5978a(context, parse) : context.getContentResolver().openInputStream(parse);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not retrieve file for contentUri ");
            sb.append(str);
            C0727a.m3267a("ReactNative", sb.toString(), (Throwable) e);
            return null;
        }
    }

    /* renamed from: a */
    public static RequestBody m5980a(String str) {
        if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH")) {
            return RequestBody.create((MediaType) null, C2015j.f5937b);
        }
        return null;
    }

    /* renamed from: a */
    public static RequestBody m5981a(MediaType mediaType, InputStream inputStream) {
        return new C1534z(mediaType, inputStream);
    }

    /* renamed from: a */
    public static RequestBody m5982a(MediaType mediaType, String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes());
            gZIPOutputStream.close();
            return RequestBody.create(mediaType, byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m5983b(String str) {
        return "gzip".equalsIgnoreCase(str);
    }
}
