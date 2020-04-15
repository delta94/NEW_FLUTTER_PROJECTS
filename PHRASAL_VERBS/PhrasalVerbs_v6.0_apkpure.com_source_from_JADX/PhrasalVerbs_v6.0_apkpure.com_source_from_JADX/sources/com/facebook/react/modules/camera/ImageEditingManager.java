package com.facebook.react.modules.camera;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p094k.p095a.C1136a;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "ImageEditingManager")
public class ImageEditingManager extends ReactContextBaseJavaModule {
    private static final int COMPRESS_QUALITY = 90;
    @SuppressLint({"InlinedApi"})
    private static final String[] EXIF_ATTRIBUTES = {"FNumber", "DateTime", "DateTimeDigitized", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "ImageLength", "ImageWidth", "ISOSpeedRatings", "Make", "Model", "Orientation", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal", "WhiteBalance"};
    private static final List<String> LOCAL_URI_PREFIXES = Arrays.asList(new String[]{"file://", "content://"});
    protected static final String NAME = "ImageEditingManager";
    private static final String TEMP_FILE_PREFIX = "ReactNative_cropped_image_";

    /* renamed from: com.facebook.react.modules.camera.ImageEditingManager$a */
    private static class C1445a extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a */
        private final Context f4486a;

        private C1445a(ReactContext reactContext) {
            super(reactContext);
            this.f4486a = reactContext;
        }

        /* renamed from: a */
        private void m5849a(File file) {
            File[] listFiles = file.listFiles(new C1451d(this));
            if (listFiles != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            m5849a(this.f4486a.getCacheDir());
            File externalCacheDir = this.f4486a.getExternalCacheDir();
            if (externalCacheDir != null) {
                m5849a(externalCacheDir);
            }
        }
    }

    /* renamed from: com.facebook.react.modules.camera.ImageEditingManager$b */
    private static class C1446b extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a */
        final Context f4487a;

        /* renamed from: b */
        final String f4488b;

        /* renamed from: c */
        final int f4489c;

        /* renamed from: d */
        final int f4490d;

        /* renamed from: e */
        final int f4491e;

        /* renamed from: f */
        final int f4492f;

        /* renamed from: g */
        int f4493g;

        /* renamed from: h */
        int f4494h;

        /* renamed from: i */
        final Callback f4495i;

        /* renamed from: j */
        final Callback f4496j;

        private C1446b(ReactContext reactContext, String str, int i, int i2, int i3, int i4, Callback callback, Callback callback2) {
            super(reactContext);
            this.f4493g = 0;
            this.f4494h = 0;
            if (i < 0 || i2 < 0 || i3 <= 0 || i4 <= 0) {
                throw new JSApplicationIllegalArgumentException(String.format("Invalid crop rectangle: [%d, %d, %d, %d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}));
            }
            this.f4487a = reactContext;
            this.f4488b = str;
            this.f4489c = i;
            this.f4490d = i2;
            this.f4491e = i3;
            this.f4492f = i4;
            this.f4495i = callback;
            this.f4496j = callback2;
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        private Bitmap m5851a(int i, int i2, Options options) {
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            int i3 = i;
            int i4 = i2;
            Options options2 = options;
            C1136a.m5053a(options);
            Options options3 = new Options();
            options3.inJustDecodeBounds = true;
            InputStream a = m5853a();
            try {
                BitmapFactory.decodeStream(a, null, options3);
                if (a != null) {
                    a.close();
                }
                int i5 = this.f4491e;
                float f6 = (float) i5;
                int i6 = this.f4492f;
                float f7 = (float) i3;
                float f8 = (float) i4;
                float f9 = f7 / f8;
                if (f6 / ((float) i6) > f9) {
                    f4 = ((float) i6) * f9;
                    f3 = (float) i6;
                    f = ((float) this.f4489c) + ((((float) i5) - f4) / 2.0f);
                    f5 = (float) this.f4490d;
                    f2 = f8 / ((float) i6);
                } else {
                    f4 = (float) i5;
                    float f10 = ((float) i5) / f9;
                    f = (float) this.f4489c;
                    float f11 = (((float) i6) - f10) / 2.0f;
                    float f12 = f7 / ((float) i5);
                    f3 = f10;
                    f2 = f12;
                    f5 = f11 + ((float) this.f4490d);
                }
                options2.inSampleSize = ImageEditingManager.getDecodeSampleSize(this.f4491e, this.f4492f, i3, i4);
                options3.inJustDecodeBounds = false;
                InputStream a2 = m5853a();
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(a2, null, options2);
                    if (decodeStream != null) {
                        if (a2 != null) {
                            a2.close();
                        }
                        int floor = (int) Math.floor((double) (f / ((float) options2.inSampleSize)));
                        int floor2 = (int) Math.floor((double) (f5 / ((float) options2.inSampleSize)));
                        int floor3 = (int) Math.floor((double) (f4 / ((float) options2.inSampleSize)));
                        int floor4 = (int) Math.floor((double) (f3 / ((float) options2.inSampleSize)));
                        float f13 = f2 * ((float) options2.inSampleSize);
                        Matrix matrix = new Matrix();
                        matrix.setScale(f13, f13);
                        return Bitmap.createBitmap(decodeStream, floor, floor2, floor3, floor4, matrix, true);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Cannot decode bitmap: ");
                    sb.append(this.f4488b);
                    throw new IOException(sb.toString());
                } catch (Throwable th) {
                    if (a2 != null) {
                        a2.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                Throwable th3 = th2;
                if (a != null) {
                    a.close();
                }
                throw th3;
            }
        }

        /* renamed from: a */
        private Bitmap m5852a(Options options) {
            InputStream a = m5853a();
            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(a, false);
            try {
                return newInstance.decodeRegion(new Rect(this.f4489c, this.f4490d, this.f4489c + this.f4491e, this.f4490d + this.f4492f), options);
            } finally {
                if (a != null) {
                    a.close();
                }
                newInstance.recycle();
            }
        }

        /* renamed from: a */
        private InputStream m5853a() {
            InputStream openInputStream = ImageEditingManager.isLocalUri(this.f4488b) ? this.f4487a.getContentResolver().openInputStream(Uri.parse(this.f4488b)) : new URL(this.f4488b).openConnection().getInputStream();
            if (openInputStream != null) {
                return openInputStream;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot open bitmap: ");
            sb.append(this.f4488b);
            throw new IOException(sb.toString());
        }

        /* renamed from: a */
        public void mo5304a(int i, int i2) {
            if (i <= 0 || i2 <= 0) {
                throw new JSApplicationIllegalArgumentException(String.format("Invalid target size: [%d, %d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            this.f4493g = i;
            this.f4494h = i2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            try {
                Options options = new Options();
                Bitmap a = this.f4493g > 0 && this.f4494h > 0 ? m5851a(this.f4493g, this.f4494h, options) : m5852a(options);
                String str = options.outMimeType;
                if (str == null || str.isEmpty()) {
                    throw new IOException("Could not determine MIME type");
                }
                File access$300 = ImageEditingManager.createTempFile(this.f4487a, str);
                ImageEditingManager.writeCompressedBitmapToFile(a, str, access$300);
                if (str.equals("image/jpeg")) {
                    ImageEditingManager.copyExif(this.f4487a, Uri.parse(this.f4488b), access$300);
                }
                this.f4495i.invoke(Uri.fromFile(access$300).toString());
            } catch (Exception e) {
                this.f4496j.invoke(e.getMessage());
            }
        }
    }

    public ImageEditingManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        new C1445a(getReactApplicationContext()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* access modifiers changed from: private */
    public static void copyExif(Context context, Uri uri, File file) {
        String[] strArr;
        File fileFromUri = getFileFromUri(context, uri);
        if (fileFromUri == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Couldn't get real path for uri: ");
            sb.append(uri);
            C0727a.m3284d("ReactNative", sb.toString());
            return;
        }
        ExifInterface exifInterface = new ExifInterface(fileFromUri.getAbsolutePath());
        ExifInterface exifInterface2 = new ExifInterface(file.getAbsolutePath());
        for (String str : EXIF_ATTRIBUTES) {
            String attribute = exifInterface.getAttribute(str);
            if (attribute != null) {
                exifInterface2.setAttribute(str, attribute);
            }
        }
        exifInterface2.saveAttributes();
    }

    /* access modifiers changed from: private */
    public static File createTempFile(Context context, String str) {
        File externalCacheDir = context.getExternalCacheDir();
        File cacheDir = context.getCacheDir();
        if (externalCacheDir == null && cacheDir == null) {
            throw new IOException("No cache directory available");
        }
        if (externalCacheDir == null || (cacheDir != null && externalCacheDir.getFreeSpace() <= cacheDir.getFreeSpace())) {
            externalCacheDir = cacheDir;
        }
        return File.createTempFile(TEMP_FILE_PREFIX, getFileExtensionForType(str), externalCacheDir);
    }

    private static CompressFormat getCompressFormatForType(String str) {
        return "image/png".equals(str) ? CompressFormat.PNG : "image/webp".equals(str) ? CompressFormat.WEBP : CompressFormat.JPEG;
    }

    /* access modifiers changed from: private */
    public static int getDecodeSampleSize(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i2 > i3 || i > i4) {
            int i6 = i2 / 2;
            int i7 = i / 2;
            while (i7 / i5 >= i3 && i6 / i5 >= i4) {
                i5 *= 2;
            }
        }
        return i5;
    }

    private static String getFileExtensionForType(String str) {
        return "image/png".equals(str) ? ".png" : "image/webp".equals(str) ? ".webp" : ".jpg";
    }

    private static File getFileFromUri(Context context, Uri uri) {
        if (uri.getScheme().equals("file")) {
            return new File(uri.getPath());
        }
        if (uri.getScheme().equals("content")) {
            Cursor query = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(0);
                        if (!TextUtils.isEmpty(string)) {
                            return new File(string);
                        }
                    }
                    query.close();
                } finally {
                    query.close();
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static boolean isLocalUri(String str) {
        for (String startsWith : LOCAL_URI_PREFIXES) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static void writeCompressedBitmapToFile(Bitmap bitmap, String str, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(getCompressFormatForType(str), 90, fileOutputStream);
        } finally {
            fileOutputStream.close();
        }
    }

    @ReactMethod
    public void cropImage(String str, ReadableMap readableMap, Callback callback, Callback callback2) {
        ReadableMap readableMap2 = readableMap;
        String str2 = "offset";
        ReadableMap readableMap3 = null;
        ReadableMap map = readableMap2.hasKey(str2) ? readableMap2.getMap(str2) : null;
        String str3 = "size";
        if (readableMap2.hasKey(str3)) {
            readableMap3 = readableMap2.getMap(str3);
        }
        if (!(map == null || readableMap3 == null)) {
            String str4 = "x";
            if (map.hasKey(str4)) {
                String str5 = "y";
                if (map.hasKey(str5)) {
                    String str6 = "width";
                    if (readableMap3.hasKey(str6)) {
                        String str7 = "height";
                        if (readableMap3.hasKey(str7)) {
                            if (str == null || str.isEmpty()) {
                                throw new JSApplicationIllegalArgumentException("Please specify a URI");
                            }
                            C1446b bVar = new C1446b(getReactApplicationContext(), str, (int) map.getDouble(str4), (int) map.getDouble(str5), (int) readableMap3.getDouble(str6), (int) readableMap3.getDouble(str7), callback, callback2);
                            String str8 = "displaySize";
                            if (readableMap2.hasKey(str8)) {
                                ReadableMap map2 = readableMap2.getMap(str8);
                                bVar.mo5304a((int) map2.getDouble(str6), (int) map2.getDouble(str7));
                            }
                            bVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                            return;
                        }
                    }
                }
            }
        }
        throw new JSApplicationIllegalArgumentException("Please specify offset and size");
    }

    public Map<String, Object> getConstants() {
        return Collections.emptyMap();
    }

    public String getName() {
        return NAME;
    }

    public void onCatalystInstanceDestroy() {
        new C1445a(getReactApplicationContext()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
