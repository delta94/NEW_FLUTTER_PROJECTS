package com.facebook.react.modules.storage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.facebook.react.modules.storage.a */
public class C1544a {
    /* renamed from: a */
    static String m6047a(int i) {
        String[] strArr = new String[i];
        Arrays.fill(strArr, "?");
        StringBuilder sb = new StringBuilder();
        sb.append("key IN (");
        sb.append(TextUtils.join(", ", strArr));
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public static String m6048a(SQLiteDatabase sQLiteDatabase, String str) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("catalystLocalStorage", new String[]{"value"}, "key=?", new String[]{str}, null, null, null);
        try {
            if (!query.moveToFirst()) {
                return null;
            }
            String string = query.getString(0);
            query.close();
            return string;
        } finally {
            query.close();
        }
    }

    /* renamed from: a */
    private static void m6049a(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            JSONObject optJSONObject = jSONObject2.optJSONObject(str);
            JSONObject optJSONObject2 = jSONObject.optJSONObject(str);
            if (optJSONObject == null || optJSONObject2 == null) {
                jSONObject.put(str, jSONObject2.get(str));
            } else {
                m6049a(optJSONObject2, optJSONObject);
                jSONObject.put(str, optJSONObject2);
            }
        }
    }

    /* renamed from: a */
    static boolean m6050a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        String a = m6048a(sQLiteDatabase, str);
        if (a != null) {
            JSONObject jSONObject = new JSONObject(a);
            m6049a(jSONObject, new JSONObject(str2));
            str2 = jSONObject.toString();
        }
        return m6052b(sQLiteDatabase, str, str2);
    }

    /* renamed from: a */
    static String[] m6051a(ReadableArray readableArray, int i, int i2) {
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = readableArray.getString(i + i3);
        }
        return strArr;
    }

    /* renamed from: b */
    static boolean m6052b(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", str);
        contentValues.put("value", str2);
        return -1 != sQLiteDatabase.insertWithOnConflict("catalystLocalStorage", null, contentValues, 5);
    }
}
