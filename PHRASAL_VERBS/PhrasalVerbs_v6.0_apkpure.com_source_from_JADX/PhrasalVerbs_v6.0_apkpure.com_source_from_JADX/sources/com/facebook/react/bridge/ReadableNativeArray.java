package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import java.util.ArrayList;
import java.util.Arrays;
import p032c.p033a.p094k.p095a.C1136a;
import p032c.p033a.p096l.p097a.C1137a;
import p032c.p033a.p098m.p100b.C1170a;

@C1137a
public class ReadableNativeArray extends NativeArray implements ReadableArray {
    private static int jniPassCounter = 0;
    private Object[] mLocalArray;
    private ReadableType[] mLocalTypeArray;

    /* renamed from: com.facebook.react.bridge.ReadableNativeArray$1 */
    static /* synthetic */ class C13831 {
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
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.ReadableNativeArray.C13831.<clinit>():void");
        }
    }

    static {
        ReactBridge.staticInit();
    }

    protected ReadableNativeArray(HybridData hybridData) {
        super(hybridData);
    }

    private native ReadableNativeArray getArrayNative(int i);

    private native boolean getBooleanNative(int i);

    private native double getDoubleNative(int i);

    private native int getIntNative(int i);

    public static int getJNIPassCounter() {
        return jniPassCounter;
    }

    private Object[] getLocalArray() {
        Object[] objArr = this.mLocalArray;
        if (objArr != null) {
            return objArr;
        }
        synchronized (this) {
            if (this.mLocalArray == null) {
                jniPassCounter++;
                Object[] importArray = importArray();
                C1136a.m5053a(importArray);
                this.mLocalArray = importArray;
            }
        }
        return this.mLocalArray;
    }

    private ReadableType[] getLocalTypeArray() {
        ReadableType[] readableTypeArr = this.mLocalTypeArray;
        if (readableTypeArr != null) {
            return readableTypeArr;
        }
        synchronized (this) {
            if (this.mLocalTypeArray == null) {
                jniPassCounter++;
                Object[] importTypeArray = importTypeArray();
                C1136a.m5053a(importTypeArray);
                Object[] objArr = importTypeArray;
                this.mLocalTypeArray = (ReadableType[]) Arrays.copyOf(objArr, objArr.length, ReadableType[].class);
            }
        }
        return this.mLocalTypeArray;
    }

    private native ReadableNativeMap getMapNative(int i);

    private native String getStringNative(int i);

    private native ReadableType getTypeNative(int i);

    private native Object[] importArray();

    private native Object[] importTypeArray();

    private native boolean isNullNative(int i);

    public static void setUseNativeAccessor(boolean z) {
        C1170a.f3889b = z;
    }

    private native int sizeNative();

    public ReadableNativeArray getArray(int i) {
        if (!C1170a.f3889b) {
            return (ReadableNativeArray) getLocalArray()[i];
        }
        jniPassCounter++;
        return getArrayNative(i);
    }

    public boolean getBoolean(int i) {
        if (!C1170a.f3889b) {
            return ((Boolean) getLocalArray()[i]).booleanValue();
        }
        jniPassCounter++;
        return getBooleanNative(i);
    }

    public double getDouble(int i) {
        if (!C1170a.f3889b) {
            return ((Double) getLocalArray()[i]).doubleValue();
        }
        jniPassCounter++;
        return getDoubleNative(i);
    }

    public Dynamic getDynamic(int i) {
        return DynamicFromArray.create(this, i);
    }

    public int getInt(int i) {
        if (!C1170a.f3889b) {
            return ((Double) getLocalArray()[i]).intValue();
        }
        jniPassCounter++;
        return getIntNative(i);
    }

    public ReadableNativeMap getMap(int i) {
        if (!C1170a.f3889b) {
            return (ReadableNativeMap) getLocalArray()[i];
        }
        jniPassCounter++;
        return getMapNative(i);
    }

    public String getString(int i) {
        if (!C1170a.f3889b) {
            return (String) getLocalArray()[i];
        }
        jniPassCounter++;
        return getStringNative(i);
    }

    public ReadableType getType(int i) {
        if (!C1170a.f3889b) {
            return getLocalTypeArray()[i];
        }
        jniPassCounter++;
        return getTypeNative(i);
    }

    public boolean isNull(int i) {
        boolean z = true;
        if (C1170a.f3889b) {
            jniPassCounter++;
            return isNullNative(i);
        }
        if (getLocalArray()[i] != null) {
            z = false;
        }
        return z;
    }

    public int size() {
        if (!C1170a.f3889b) {
            return getLocalArray().length;
        }
        jniPassCounter++;
        return sizeNative();
    }

    public ArrayList<Object> toArrayList() {
        Object obj;
        ArrayList<Object> arrayList = new ArrayList<>();
        for (int i = 0; i < size(); i++) {
            switch (C13831.$SwitchMap$com$facebook$react$bridge$ReadableType[getType(i).ordinal()]) {
                case 1:
                    obj = null;
                    break;
                case 2:
                    obj = Boolean.valueOf(getBoolean(i));
                    break;
                case 3:
                    obj = Double.valueOf(getDouble(i));
                    break;
                case 4:
                    obj = getString(i);
                    break;
                case 5:
                    obj = getMap(i).toHashMap();
                    break;
                case 6:
                    obj = getArray(i).toArrayList();
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Could not convert object at index: ");
                    sb.append(i);
                    sb.append(".");
                    throw new IllegalArgumentException(sb.toString());
            }
            arrayList.add(obj);
        }
        return arrayList;
    }
}
