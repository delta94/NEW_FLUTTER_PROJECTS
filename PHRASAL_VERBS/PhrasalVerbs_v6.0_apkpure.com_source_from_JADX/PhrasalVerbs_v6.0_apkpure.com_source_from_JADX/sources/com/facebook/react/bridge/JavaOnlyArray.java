package com.facebook.react.bridge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaOnlyArray implements ReadableArray, WritableArray {
    private final List mBackingList;

    /* renamed from: com.facebook.react.bridge.JavaOnlyArray$1 */
    static /* synthetic */ class C13771 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType = new int[ReadableType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.facebook.react.bridge.ReadableType[] r0 = com.facebook.react.bridge.ReadableType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$facebook$react$bridge$ReadableType = r0
                int[] r0 = $SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Null     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x001f }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Boolean     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x002a }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Number     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = $SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.String     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = $SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Map     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = $SwitchMap$com$facebook$react$bridge$ReadableType     // Catch:{ NoSuchFieldError -> 0x004b }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Array     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.JavaOnlyArray.C13771.<clinit>():void");
        }
    }

    public JavaOnlyArray() {
        this.mBackingList = new ArrayList();
    }

    private JavaOnlyArray(List list) {
        this.mBackingList = new ArrayList(list);
    }

    private JavaOnlyArray(Object... objArr) {
        this.mBackingList = Arrays.asList(objArr);
    }

    public static JavaOnlyArray deepClone(ReadableArray readableArray) {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            switch (C13771.$SwitchMap$com$facebook$react$bridge$ReadableType[readableArray.getType(i).ordinal()]) {
                case 1:
                    javaOnlyArray.pushNull();
                    break;
                case 2:
                    javaOnlyArray.pushBoolean(readableArray.getBoolean(i));
                    break;
                case 3:
                    javaOnlyArray.pushDouble(readableArray.getDouble(i));
                    break;
                case 4:
                    javaOnlyArray.pushString(readableArray.getString(i));
                    break;
                case 5:
                    javaOnlyArray.pushMap(JavaOnlyMap.deepClone(readableArray.getMap(i)));
                    break;
                case 6:
                    javaOnlyArray.pushArray(deepClone(readableArray.getArray(i)));
                    break;
            }
        }
        return javaOnlyArray;
    }

    public static JavaOnlyArray from(List list) {
        return new JavaOnlyArray(list);
    }

    /* renamed from: of */
    public static JavaOnlyArray m5719of(Object... objArr) {
        return new JavaOnlyArray(objArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || JavaOnlyArray.class != obj.getClass()) {
            return false;
        }
        JavaOnlyArray javaOnlyArray = (JavaOnlyArray) obj;
        List list = this.mBackingList;
        return list == null ? javaOnlyArray.mBackingList == null : list.equals(javaOnlyArray.mBackingList);
    }

    public JavaOnlyArray getArray(int i) {
        return (JavaOnlyArray) this.mBackingList.get(i);
    }

    public boolean getBoolean(int i) {
        return ((Boolean) this.mBackingList.get(i)).booleanValue();
    }

    public double getDouble(int i) {
        return ((Number) this.mBackingList.get(i)).doubleValue();
    }

    public Dynamic getDynamic(int i) {
        return DynamicFromArray.create(this, i);
    }

    public int getInt(int i) {
        return ((Number) this.mBackingList.get(i)).intValue();
    }

    public JavaOnlyMap getMap(int i) {
        return (JavaOnlyMap) this.mBackingList.get(i);
    }

    public String getString(int i) {
        return (String) this.mBackingList.get(i);
    }

    public ReadableType getType(int i) {
        Object obj = this.mBackingList.get(i);
        if (obj == null) {
            return ReadableType.Null;
        }
        if (obj instanceof Boolean) {
            return ReadableType.Boolean;
        }
        if ((obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer)) {
            return ReadableType.Number;
        }
        if (obj instanceof String) {
            return ReadableType.String;
        }
        if (obj instanceof ReadableArray) {
            return ReadableType.Array;
        }
        if (obj instanceof ReadableMap) {
            return ReadableType.Map;
        }
        return null;
    }

    public int hashCode() {
        List list = this.mBackingList;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public boolean isNull(int i) {
        return this.mBackingList.get(i) == null;
    }

    public void pushArray(WritableArray writableArray) {
        this.mBackingList.add(writableArray);
    }

    public void pushBoolean(boolean z) {
        this.mBackingList.add(Boolean.valueOf(z));
    }

    public void pushDouble(double d) {
        this.mBackingList.add(Double.valueOf(d));
    }

    public void pushInt(int i) {
        this.mBackingList.add(Integer.valueOf(i));
    }

    public void pushMap(WritableMap writableMap) {
        this.mBackingList.add(writableMap);
    }

    public void pushNull() {
        this.mBackingList.add(null);
    }

    public void pushString(String str) {
        this.mBackingList.add(str);
    }

    public int size() {
        return this.mBackingList.size();
    }

    public ArrayList<Object> toArrayList() {
        return new ArrayList<>(this.mBackingList);
    }

    public String toString() {
        return this.mBackingList.toString();
    }
}
