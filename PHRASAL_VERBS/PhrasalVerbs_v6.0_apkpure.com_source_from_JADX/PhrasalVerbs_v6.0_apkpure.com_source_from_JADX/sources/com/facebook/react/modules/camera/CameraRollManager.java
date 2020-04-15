package com.facebook.react.modules.camera;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.media.MediaMetadataRetriever;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.provider.MediaStore.Files;
import android.text.TextUtils;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URLConnection;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import p032c.p033a.p038c.p043e.C0727a;
import p032c.p033a.p098m.p102d.p103a.C1176a;

@C1176a(name = "CameraRollManager")
public class CameraRollManager extends ReactContextBaseJavaModule {
    private static final String ASSET_TYPE_ALL = "All";
    private static final String ASSET_TYPE_PHOTOS = "Photos";
    private static final String ASSET_TYPE_VIDEOS = "Videos";
    private static final String ERROR_UNABLE_TO_FILTER = "E_UNABLE_TO_FILTER";
    private static final String ERROR_UNABLE_TO_LOAD = "E_UNABLE_TO_LOAD";
    private static final String ERROR_UNABLE_TO_LOAD_PERMISSION = "E_UNABLE_TO_LOAD_PERMISSION";
    private static final String ERROR_UNABLE_TO_SAVE = "E_UNABLE_TO_SAVE";
    public static final String NAME = "CameraRollManager";
    /* access modifiers changed from: private */
    public static final String[] PROJECTION = {"_id", "mime_type", "bucket_display_name", "datetaken", "width", "height", "longitude", "latitude", "_data"};
    private static final String SELECTION_BUCKET = "bucket_display_name = ?";
    private static final String SELECTION_DATE_TAKEN = "datetaken < ?";

    /* renamed from: com.facebook.react.modules.camera.CameraRollManager$a */
    private static class C1443a extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a */
        private final Context f4476a;

        /* renamed from: b */
        private final int f4477b;

        /* renamed from: c */
        private final String f4478c;

        /* renamed from: d */
        private final String f4479d;

        /* renamed from: e */
        private final ReadableArray f4480e;

        /* renamed from: f */
        private final Promise f4481f;

        /* renamed from: g */
        private final String f4482g;

        private C1443a(ReactContext reactContext, int i, String str, String str2, ReadableArray readableArray, String str3, Promise promise) {
            super(reactContext);
            this.f4476a = reactContext;
            this.f4477b = i;
            this.f4478c = str;
            this.f4479d = str2;
            this.f4480e = readableArray;
            this.f4481f = promise;
            this.f4482g = str3;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            String str;
            Cursor query;
            StringBuilder sb = new StringBuilder("1");
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(this.f4478c)) {
                sb.append(" AND datetaken < ?");
                arrayList.add(this.f4478c);
            }
            if (!TextUtils.isEmpty(this.f4479d)) {
                sb.append(" AND bucket_display_name = ?");
                arrayList.add(this.f4479d);
            }
            String str2 = this.f4482g;
            String str3 = CameraRollManager.ASSET_TYPE_PHOTOS;
            if (str2.equals(str3)) {
                str = " AND media_type = 1";
            } else {
                String str4 = this.f4482g;
                String str5 = CameraRollManager.ASSET_TYPE_VIDEOS;
                if (str4.equals(str5)) {
                    str = " AND media_type = 3";
                } else {
                    String str6 = this.f4482g;
                    String str7 = CameraRollManager.ASSET_TYPE_ALL;
                    if (str6.equals(str7)) {
                        str = " AND media_type IN (3,1)";
                    } else {
                        Promise promise = this.f4481f;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid filter option: '");
                        sb2.append(this.f4482g);
                        sb2.append("'. Expected one of '");
                        sb2.append(str3);
                        sb2.append("', '");
                        sb2.append(str5);
                        sb2.append("' or '");
                        sb2.append(str7);
                        sb2.append("'.");
                        promise.reject(CameraRollManager.ERROR_UNABLE_TO_FILTER, sb2.toString());
                        return;
                    }
                }
            }
            sb.append(str);
            ReadableArray readableArray = this.f4480e;
            if (readableArray != null && readableArray.size() > 0) {
                sb.append(" AND mime_type IN (");
                for (int i = 0; i < this.f4480e.size(); i++) {
                    sb.append("?,");
                    arrayList.add(this.f4480e.getString(i));
                }
                sb.replace(sb.length() - 1, sb.length(), ")");
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            ContentResolver contentResolver = this.f4476a.getContentResolver();
            try {
                Uri contentUri = Files.getContentUri("external");
                String[] access$200 = CameraRollManager.PROJECTION;
                String sb3 = sb.toString();
                String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                StringBuilder sb4 = new StringBuilder();
                sb4.append("datetaken DESC, date_modified DESC LIMIT ");
                sb4.append(this.f4477b + 1);
                query = contentResolver.query(contentUri, access$200, sb3, strArr, sb4.toString());
                if (query == null) {
                    this.f4481f.reject(CameraRollManager.ERROR_UNABLE_TO_LOAD, "Could not get media");
                } else {
                    CameraRollManager.putEdges(contentResolver, query, writableNativeMap, this.f4477b);
                    CameraRollManager.putPageInfo(query, writableNativeMap, this.f4477b);
                    query.close();
                    this.f4481f.resolve(writableNativeMap);
                }
            } catch (SecurityException e) {
                this.f4481f.reject(CameraRollManager.ERROR_UNABLE_TO_LOAD_PERMISSION, "Could not get media: need READ_EXTERNAL_STORAGE permission", (Throwable) e);
            } catch (Throwable th) {
                query.close();
                this.f4481f.resolve(writableNativeMap);
                throw th;
            }
        }
    }

    /* renamed from: com.facebook.react.modules.camera.CameraRollManager$b */
    private static class C1444b extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a */
        private final Context f4483a;

        /* renamed from: b */
        private final Uri f4484b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final Promise f4485c;

        public C1444b(ReactContext reactContext, Uri uri, Promise promise) {
            super(reactContext);
            this.f4483a = reactContext;
            this.f4484b = uri;
            this.f4485c = promise;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            FileChannel fileChannel;
            FileChannel fileChannel2;
            String str;
            int i;
            String str2 = "Could not close output channel";
            String str3 = "Could not close input channel";
            String str4 = "ReactNative";
            File file = new File(this.f4484b.getPath());
            FileChannel fileChannel3 = null;
            try {
                File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
                externalStoragePublicDirectory.mkdirs();
                if (!externalStoragePublicDirectory.isDirectory()) {
                    this.f4485c.reject(CameraRollManager.ERROR_UNABLE_TO_LOAD, "External media storage directory not available");
                    return;
                }
                File file2 = new File(externalStoragePublicDirectory, file.getName());
                String name = file.getName();
                if (name.indexOf(46) >= 0) {
                    String substring = name.substring(0, name.lastIndexOf(46));
                    i = 0;
                    String str5 = substring;
                    str = name.substring(name.lastIndexOf(46));
                    name = str5;
                } else {
                    str = "";
                    i = 0;
                }
                while (!file2.createNewFile()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(name);
                    sb.append("_");
                    int i2 = i + 1;
                    sb.append(i);
                    sb.append(str);
                    file2 = new File(externalStoragePublicDirectory, sb.toString());
                    i = i2;
                }
                fileChannel2 = new FileInputStream(file).getChannel();
                try {
                    fileChannel = new FileOutputStream(file2).getChannel();
                } catch (IOException e) {
                    e = e;
                    fileChannel = null;
                    fileChannel3 = fileChannel2;
                    try {
                        this.f4485c.reject((Throwable) e);
                        try {
                            fileChannel3.close();
                        } catch (IOException e2) {
                            C0727a.m3267a(str4, str3, (Throwable) e2);
                        }
                        fileChannel.close();
                    } catch (Throwable th) {
                        th = th;
                        fileChannel2 = fileChannel3;
                        Throwable th2 = th;
                        if (fileChannel2 != null && fileChannel2.isOpen()) {
                            try {
                                fileChannel2.close();
                            } catch (IOException e3) {
                                C0727a.m3267a(str4, str3, (Throwable) e3);
                            }
                        }
                        if (fileChannel != null && fileChannel.isOpen()) {
                            try {
                                fileChannel.close();
                            } catch (IOException e4) {
                                C0727a.m3267a(str4, str2, (Throwable) e4);
                            }
                        }
                        throw th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileChannel = null;
                    Throwable th22 = th;
                    fileChannel2.close();
                    fileChannel.close();
                    throw th22;
                }
                try {
                    fileChannel.transferFrom(fileChannel2, 0, fileChannel2.size());
                    fileChannel2.close();
                    fileChannel.close();
                    MediaScannerConnection.scanFile(this.f4483a, new String[]{file2.getAbsolutePath()}, null, new C1449b(this));
                    if (fileChannel2 != null && fileChannel2.isOpen()) {
                        try {
                            fileChannel2.close();
                        } catch (IOException e5) {
                            C0727a.m3267a(str4, str3, (Throwable) e5);
                        }
                    }
                    if (fileChannel != null && fileChannel.isOpen()) {
                        try {
                            fileChannel.close();
                        } catch (IOException e6) {
                            C0727a.m3267a(str4, str2, (Throwable) e6);
                        }
                    }
                } catch (IOException e7) {
                    e = e7;
                    fileChannel3 = fileChannel2;
                    this.f4485c.reject((Throwable) e);
                    if (fileChannel3 != null && fileChannel3.isOpen()) {
                        fileChannel3.close();
                    }
                    if (fileChannel != null && fileChannel.isOpen()) {
                        fileChannel.close();
                    }
                } catch (Throwable th4) {
                    th = th4;
                    Throwable th222 = th;
                    fileChannel2.close();
                    fileChannel.close();
                    throw th222;
                }
            } catch (IOException e8) {
                e = e8;
                fileChannel = null;
                this.f4485c.reject((Throwable) e);
                fileChannel3.close();
                fileChannel.close();
            } catch (Throwable th5) {
                th = th5;
                fileChannel2 = null;
                fileChannel = null;
                Throwable th2222 = th;
                fileChannel2.close();
                fileChannel.close();
                throw th2222;
            }
        }
    }

    public CameraRollManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private static void putBasicNodeInfo(Cursor cursor, WritableMap writableMap, int i, int i2, int i3) {
        writableMap.putString("type", cursor.getString(i));
        writableMap.putString("group_name", cursor.getString(i2));
        double d = (double) cursor.getLong(i3);
        Double.isNaN(d);
        writableMap.putDouble("timestamp", d / 1000.0d);
    }

    /* access modifiers changed from: private */
    public static void putEdges(ContentResolver contentResolver, Cursor cursor, WritableMap writableMap, int i) {
        WritableNativeArray writableNativeArray;
        Cursor cursor2 = cursor;
        WritableNativeArray writableNativeArray2 = new WritableNativeArray();
        cursor.moveToFirst();
        int columnIndex = cursor2.getColumnIndex("_id");
        int columnIndex2 = cursor2.getColumnIndex("mime_type");
        int columnIndex3 = cursor2.getColumnIndex("bucket_display_name");
        int columnIndex4 = cursor2.getColumnIndex("datetaken");
        int columnIndex5 = cursor2.getColumnIndex("width");
        int columnIndex6 = cursor2.getColumnIndex("height");
        int columnIndex7 = cursor2.getColumnIndex("longitude");
        int columnIndex8 = cursor2.getColumnIndex("latitude");
        int columnIndex9 = cursor2.getColumnIndex("_data");
        int i2 = i;
        int i3 = 0;
        while (i3 < i2 && !cursor.isAfterLast()) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            WritableNativeMap writableNativeMap3 = writableNativeMap2;
            WritableNativeArray writableNativeArray3 = writableNativeArray2;
            WritableNativeMap writableNativeMap4 = writableNativeMap;
            int i4 = i3;
            int i5 = columnIndex;
            int i6 = columnIndex8;
            if (putImageInfo(contentResolver, cursor, writableNativeMap2, columnIndex, columnIndex5, columnIndex6, columnIndex9)) {
                WritableNativeMap writableNativeMap5 = writableNativeMap3;
                putBasicNodeInfo(cursor2, writableNativeMap5, columnIndex2, columnIndex3, columnIndex4);
                putLocationInfo(cursor2, writableNativeMap5, columnIndex7, i6);
                writableNativeMap4.putMap("node", writableNativeMap5);
                writableNativeArray = writableNativeArray3;
                writableNativeArray.pushMap(writableNativeMap4);
            } else {
                writableNativeArray = writableNativeArray3;
                i4--;
            }
            cursor.moveToNext();
            i3 = i4 + 1;
            i2 = i;
            writableNativeArray2 = writableNativeArray;
            columnIndex8 = i6;
            columnIndex = i5;
        }
        WritableMap writableMap2 = writableMap;
        writableMap2.putArray("edges", writableNativeArray2);
    }

    private static boolean putImageInfo(ContentResolver contentResolver, Cursor cursor, WritableMap writableMap, int i, int i2, int i3, int i4) {
        StringBuilder sb;
        String str;
        AssetFileDescriptor openAssetFileDescriptor;
        MediaMetadataRetriever mediaMetadataRetriever;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("file://");
        sb2.append(cursor.getString(i4));
        Uri parse = Uri.parse(sb2.toString());
        writableNativeMap.putString("uri", parse.toString());
        float f = (float) cursor.getInt(i2);
        float f2 = (float) cursor.getInt(i3);
        String guessContentTypeFromName = URLConnection.guessContentTypeFromName(parse.toString());
        String str2 = "r";
        String str3 = "ReactNative";
        if (guessContentTypeFromName != null && guessContentTypeFromName.startsWith("video")) {
            try {
                openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(parse, str2);
                mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(openAssetFileDescriptor.getFileDescriptor());
                if (f <= 0.0f || f2 <= 0.0f) {
                    try {
                        f = (float) Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                        f2 = (float) Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    } catch (NumberFormatException e) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Number format exception occurred while trying to fetch video metadata for ");
                        sb3.append(parse.toString());
                        C0727a.m3267a(str3, sb3.toString(), (Throwable) e);
                        mediaMetadataRetriever.release();
                        openAssetFileDescriptor.close();
                        return false;
                    }
                }
                writableNativeMap.putInt("playableDuration", Integer.parseInt(mediaMetadataRetriever.extractMetadata(9)) / 1000);
                mediaMetadataRetriever.release();
                openAssetFileDescriptor.close();
            } catch (Exception e2) {
                e = e2;
                sb = new StringBuilder();
                str = "Could not get video metadata for ";
            } catch (Throwable th) {
                mediaMetadataRetriever.release();
                openAssetFileDescriptor.close();
                throw th;
            }
        }
        if (f <= 0.0f || f2 <= 0.0f) {
            try {
                AssetFileDescriptor openAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(parse, str2);
                Options options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFileDescriptor(openAssetFileDescriptor2.getFileDescriptor(), null, options);
                f = (float) options.outWidth;
                f2 = (float) options.outHeight;
                openAssetFileDescriptor2.close();
            } catch (IOException e3) {
                e = e3;
                sb = new StringBuilder();
                str = "Could not get width/height for ";
                sb.append(str);
                sb.append(parse.toString());
                C0727a.m3267a(str3, sb.toString(), e);
                return false;
            }
        }
        writableNativeMap.putDouble("width", (double) f);
        writableNativeMap.putDouble("height", (double) f2);
        writableMap.putMap("image", writableNativeMap);
        return true;
    }

    private static void putLocationInfo(Cursor cursor, WritableMap writableMap, int i, int i2) {
        double d = cursor.getDouble(i);
        double d2 = cursor.getDouble(i2);
        if (d > 0.0d || d2 > 0.0d) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("longitude", d);
            writableNativeMap.putDouble("latitude", d2);
            writableMap.putMap("location", writableNativeMap);
        }
    }

    /* access modifiers changed from: private */
    public static void putPageInfo(Cursor cursor, WritableMap writableMap, int i) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putBoolean("has_next_page", i < cursor.getCount());
        if (i < cursor.getCount()) {
            cursor.moveToPosition(i - 1);
            writableNativeMap.putString("end_cursor", cursor.getString(cursor.getColumnIndex("datetaken")));
        }
        writableMap.putMap("page_info", writableNativeMap);
    }

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void getPhotos(ReadableMap readableMap, Promise promise) {
        int i = readableMap.getInt("first");
        String str = "after";
        String string = readableMap.hasKey(str) ? readableMap.getString(str) : null;
        String str2 = "groupName";
        String string2 = readableMap.hasKey(str2) ? readableMap.getString(str2) : null;
        String str3 = "assetType";
        String string3 = readableMap.hasKey(str3) ? readableMap.getString(str3) : ASSET_TYPE_PHOTOS;
        String str4 = "mimeTypes";
        ReadableArray array = readableMap.hasKey(str4) ? readableMap.getArray(str4) : null;
        if (!readableMap.hasKey("groupTypes")) {
            C1443a aVar = new C1443a(getReactApplicationContext(), i, string, string2, array, string3, promise);
            aVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return;
        }
        throw new JSApplicationIllegalArgumentException("groupTypes is not supported on Android");
    }

    @ReactMethod
    public void saveToCameraRoll(String str, String str2, Promise promise) {
        new C1444b(getReactApplicationContext(), Uri.parse(str), promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
