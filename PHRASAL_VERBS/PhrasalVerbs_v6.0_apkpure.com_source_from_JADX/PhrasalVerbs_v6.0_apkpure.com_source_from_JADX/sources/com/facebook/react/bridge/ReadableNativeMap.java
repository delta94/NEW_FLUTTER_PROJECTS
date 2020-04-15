package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import java.util.HashMap;
import p032c.p033a.p094k.p095a.C1136a;
import p032c.p033a.p096l.p097a.C1137a;
import p032c.p033a.p098m.p100b.C1170a;

@C1137a
public class ReadableNativeMap extends NativeMap implements ReadableMap {
    private static int mJniCallCounter;
    private String[] mKeys;
    private HashMap<String, Object> mLocalMap;
    private HashMap<String, ReadableType> mLocalTypeMap;

    /* renamed from: com.facebook.react.bridge.ReadableNativeMap$1 */
    static /* synthetic */ class C13841 {
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
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.ReadableNativeMap.C13841.<clinit>():void");
        }
    }

    @C1137a
    private static class ReadableNativeMapKeySetIterator implements ReadableMapKeySetIterator {
        @C1137a
        private final HybridData mHybridData;
        @C1137a
        private final ReadableNativeMap mMap;

        public ReadableNativeMapKeySetIterator(ReadableNativeMap readableNativeMap) {
            this.mMap = readableNativeMap;
            this.mHybridData = initHybrid(readableNativeMap);
        }

        private static native HybridData initHybrid(ReadableNativeMap readableNativeMap);

        public native boolean hasNextKey();

        public native String nextKey();
    }

    static {
        ReactBridge.staticInit();
    }

    protected ReadableNativeMap(HybridData hybridData) {
        super(hybridData);
    }

    private void checkInstance(String str, Object obj, Class cls) {
        if (obj != null && !cls.isInstance(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Value for ");
            sb.append(str);
            sb.append(" cannot be cast from ");
            sb.append(obj.getClass().getSimpleName());
            sb.append(" to ");
            sb.append(cls.getSimpleName());
            throw new ClassCastException(sb.toString());
        }
    }

    private native ReadableNativeArray getArrayNative(String str);

    private native boolean getBooleanNative(String str);

    private native double getDoubleNative(String str);

    private native int getIntNative(String str);

    public static int getJNIPassCounter() {
        return mJniCallCounter;
    }

    private HashMap<String, Object> getLocalMap() {
        HashMap<String, Object> hashMap = this.mLocalMap;
        if (hashMap != null) {
            return hashMap;
        }
        synchronized (this) {
            if (this.mKeys == null) {
                String[] importKeys = importKeys();
                C1136a.m5053a(importKeys);
                this.mKeys = importKeys;
                mJniCallCounter++;
            }
            if (this.mLocalMap == null) {
                Object[] importValues = importValues();
                C1136a.m5053a(importValues);
                Object[] objArr = importValues;
                mJniCallCounter++;
                int length = this.mKeys.length;
                this.mLocalMap = new HashMap<>(length);
                for (int i = 0; i < length; i++) {
                    this.mLocalMap.put(this.mKeys[i], objArr[i]);
                }
            }
        }
        return this.mLocalMap;
    }

    private HashMap<String, ReadableType> getLocalTypeMap() {
        HashMap<String, ReadableType> hashMap = this.mLocalTypeMap;
        if (hashMap != null) {
            return hashMap;
        }
        synchronized (this) {
            if (this.mKeys == null) {
                String[] importKeys = importKeys();
                C1136a.m5053a(importKeys);
                this.mKeys = importKeys;
                mJniCallCounter++;
            }
            if (this.mLocalTypeMap == null) {
                Object[] importTypes = importTypes();
                C1136a.m5053a(importTypes);
                Object[] objArr = importTypes;
                mJniCallCounter++;
                int length = this.mKeys.length;
                this.mLocalTypeMap = new HashMap<>(length);
                for (int i = 0; i < length; i++) {
                    this.mLocalTypeMap.put(this.mKeys[i], (ReadableType) objArr[i]);
                }
            }
        }
        return this.mLocalTypeMap;
    }

    private native ReadableNativeMap getMapNative(String str);

    private Object getNullableValue(String str) {
        if (hasKey(str)) {
            return getLocalMap().get(str);
        }
        throw new NoSuchKeyException(str);
    }

    private <T> T getNullableValue(String str, Class<T> cls) {
        T nullableValue = getNullableValue(str);
        checkInstance(str, nullableValue, cls);
        return nullableValue;
    }

    private native String getStringNative(String str);

    private native ReadableType getTypeNative(String str);

    private Object getValue(String str) {
        if (!hasKey(str) || isNull(str)) {
            throw new NoSuchKeyException(str);
        }
        Object obj = getLocalMap().get(str);
        C1136a.m5053a(obj);
        return obj;
    }

    private <T> T getValue(String str, Class<T> cls) {
        T value = getValue(str);
        checkInstance(str, value, cls);
        return value;
    }

    private native boolean hasKeyNative(String str);

    private native String[] importKeys();

    private native Object[] importTypes();

    private native Object[] importValues();

    private native boolean isNullNative(String str);

    public static void setUseNativeAccessor(boolean z) {
        C1170a.f3890c = z;
    }

    public ReadableArray getArray(String str) {
        if (!C1170a.f3890c) {
            return (ReadableArray) getNullableValue(str, ReadableArray.class);
        }
        mJniCallCounter++;
        return getArrayNative(str);
    }

    public boolean getBoolean(String str) {
        if (!C1170a.f3890c) {
            return ((Boolean) getValue(str, Boolean.class)).booleanValue();
        }
        mJniCallCounter++;
        return getBooleanNative(str);
    }

    public double getDouble(String str) {
        if (!C1170a.f3890c) {
            return ((Double) getValue(str, Double.class)).doubleValue();
        }
        mJniCallCounter++;
        return getDoubleNative(str);
    }

    public Dynamic getDynamic(String str) {
        return DynamicFromMap.create(this, str);
    }

    public int getInt(String str) {
        if (!C1170a.f3890c) {
            return ((Double) getValue(str, Double.class)).intValue();
        }
        mJniCallCounter++;
        return getIntNative(str);
    }

    public ReadableNativeMap getMap(String str) {
        if (!C1170a.f3890c) {
            return (ReadableNativeMap) getNullableValue(str, ReadableNativeMap.class);
        }
        mJniCallCounter++;
        return getMapNative(str);
    }

    public String getString(String str) {
        if (!C1170a.f3890c) {
            return (String) getNullableValue(str, String.class);
        }
        mJniCallCounter++;
        return getStringNative(str);
    }

    public ReadableType getType(String str) {
        if (C1170a.f3890c) {
            mJniCallCounter++;
            return getTypeNative(str);
        } else if (getLocalTypeMap().containsKey(str)) {
            Object obj = getLocalTypeMap().get(str);
            C1136a.m5053a(obj);
            return (ReadableType) obj;
        } else {
            throw new NoSuchKeyException(str);
        }
    }

    public boolean hasKey(String str) {
        if (!C1170a.f3890c) {
            return getLocalMap().containsKey(str);
        }
        mJniCallCounter++;
        return hasKeyNative(str);
    }

    public boolean isNull(String str) {
        boolean z = true;
        if (C1170a.f3890c) {
            mJniCallCounter++;
            return isNullNative(str);
        } else if (getLocalMap().containsKey(str)) {
            if (getLocalMap().get(str) != null) {
                z = false;
            }
            return z;
        } else {
            throw new NoSuchKeyException(str);
        }
    }

    public ReadableMapKeySetIterator keySetIterator() {
        return new ReadableNativeMapKeySetIterator(this);
    }

    public HashMap<String, Object> toHashMap() {
        Object obj;
        Object obj2;
        String str = ".";
        String str2 = "Could not convert object with key: ";
        if (C1170a.f3890c) {
            ReadableMapKeySetIterator keySetIterator = keySetIterator();
            HashMap<String, Object> hashMap = new HashMap<>();
            while (keySetIterator.hasNextKey()) {
                mJniCallCounter++;
                String nextKey = keySetIterator.nextKey();
                mJniCallCounter++;
                switch (C13841.$SwitchMap$com$facebook$react$bridge$ReadableType[getType(nextKey).ordinal()]) {
                    case 1:
                        obj2 = null;
                        break;
                    case 2:
                        obj2 = Boolean.valueOf(getBoolean(nextKey));
                        break;
                    case 3:
                        obj2 = Double.valueOf(getDouble(nextKey));
                        break;
                    case 4:
                        obj2 = getString(nextKey);
                        break;
                    case 5:
                        ReadableNativeMap map = getMap(nextKey);
                        C1136a.m5053a(map);
                        obj2 = map.toHashMap();
                        break;
                    case 6:
                        ReadableArray array = getArray(nextKey);
                        C1136a.m5053a(array);
                        obj2 = array.toArrayList();
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        sb.append(nextKey);
                        sb.append(str);
                        throw new IllegalArgumentException(sb.toString());
                }
                hashMap.put(nextKey, obj2);
            }
            return hashMap;
        }
        HashMap<String, Object> hashMap2 = new HashMap<>(getLocalMap());
        for (String str3 : hashMap2.keySet()) {
            switch (C13841.$SwitchMap$com$facebook$react$bridge$ReadableType[getType(str3).ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    break;
                case 5:
                    ReadableNativeMap map2 = getMap(str3);
                    C1136a.m5053a(map2);
                    obj = map2.toHashMap();
                    break;
                case 6:
                    ReadableArray array2 = getArray(str3);
                    C1136a.m5053a(array2);
                    obj = array2.toArrayList();
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(str3);
                    sb2.append(str);
                    throw new IllegalArgumentException(sb2.toString());
            }
            hashMap2.put(str3, obj);
        }
        return hashMap2;
    }
}
