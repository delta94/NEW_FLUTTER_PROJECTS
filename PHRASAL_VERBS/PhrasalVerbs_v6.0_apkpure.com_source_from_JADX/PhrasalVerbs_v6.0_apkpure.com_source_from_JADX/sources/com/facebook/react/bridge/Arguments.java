package com.facebook.react.bridge;

import android.os.Bundle;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Arguments {

    /* renamed from: com.facebook.react.bridge.Arguments$2 */
    static /* synthetic */ class C13542 {
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
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.Arguments.C13542.<clinit>():void");
        }
    }

    private static void addEntry(WritableNativeMap writableNativeMap, String str, Object obj) {
        Object makeNativeObject = makeNativeObject(obj);
        if (makeNativeObject == null) {
            writableNativeMap.putNull(str);
        } else if (makeNativeObject instanceof Boolean) {
            writableNativeMap.putBoolean(str, ((Boolean) makeNativeObject).booleanValue());
        } else if (makeNativeObject instanceof Integer) {
            writableNativeMap.putInt(str, ((Integer) makeNativeObject).intValue());
        } else if (makeNativeObject instanceof Number) {
            writableNativeMap.putDouble(str, ((Number) makeNativeObject).doubleValue());
        } else if (makeNativeObject instanceof String) {
            writableNativeMap.putString(str, (String) makeNativeObject);
        } else if (makeNativeObject instanceof WritableNativeArray) {
            writableNativeMap.putArray(str, (WritableNativeArray) makeNativeObject);
        } else if (makeNativeObject instanceof WritableNativeMap) {
            writableNativeMap.putMap(str, (WritableNativeMap) makeNativeObject);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not convert ");
            sb.append(makeNativeObject.getClass());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static WritableArray createArray() {
        return new WritableNativeArray();
    }

    public static WritableMap createMap() {
        return new WritableNativeMap();
    }

    public static WritableArray fromArray(Object obj) {
        WritableArray createArray = createArray();
        int i = 0;
        if (obj instanceof String[]) {
            String[] strArr = (String[]) obj;
            int length = strArr.length;
            while (i < length) {
                createArray.pushString(strArr[i]);
                i++;
            }
        } else if (obj instanceof Bundle[]) {
            Bundle[] bundleArr = (Bundle[]) obj;
            int length2 = bundleArr.length;
            while (i < length2) {
                createArray.pushMap(fromBundle(bundleArr[i]));
                i++;
            }
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length;
            while (i < length3) {
                createArray.pushInt(iArr[i]);
                i++;
            }
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length4 = fArr.length;
            while (i < length4) {
                createArray.pushDouble((double) fArr[i]);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length5 = dArr.length;
            while (i < length5) {
                createArray.pushDouble(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length6 = zArr.length;
            while (i < length6) {
                createArray.pushBoolean(zArr[i]);
                i++;
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown array type ");
            sb.append(obj.getClass());
            throw new IllegalArgumentException(sb.toString());
        }
        return createArray;
    }

    public static WritableMap fromBundle(Bundle bundle) {
        WritableArray fromList;
        WritableMap createMap = createMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj == null) {
                createMap.putNull(str);
            } else {
                if (obj.getClass().isArray()) {
                    fromList = fromArray(obj);
                } else if (obj instanceof String) {
                    createMap.putString(str, (String) obj);
                } else if (obj instanceof Number) {
                    if (obj instanceof Integer) {
                        createMap.putInt(str, ((Integer) obj).intValue());
                    } else {
                        createMap.putDouble(str, ((Number) obj).doubleValue());
                    }
                } else if (obj instanceof Boolean) {
                    createMap.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Bundle) {
                    createMap.putMap(str, fromBundle((Bundle) obj));
                } else if (obj instanceof List) {
                    fromList = fromList((List) obj);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Could not convert ");
                    sb.append(obj.getClass());
                    throw new IllegalArgumentException(sb.toString());
                }
                createMap.putArray(str, fromList);
            }
        }
        return createMap;
    }

    public static WritableNativeArray fromJavaArgs(Object[] objArr) {
        double doubleValue;
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (Boolean bool : objArr) {
            if (bool == null) {
                writableNativeArray.pushNull();
            } else {
                Class<WritableNativeArray> cls = bool.getClass();
                if (cls == Boolean.class) {
                    writableNativeArray.pushBoolean(bool.booleanValue());
                } else {
                    if (cls == Integer.class) {
                        doubleValue = ((Integer) bool).doubleValue();
                    } else if (cls == Double.class) {
                        doubleValue = ((Double) bool).doubleValue();
                    } else if (cls == Float.class) {
                        doubleValue = ((Float) bool).doubleValue();
                    } else if (cls == String.class) {
                        writableNativeArray.pushString(bool.toString());
                    } else if (cls == WritableNativeMap.class) {
                        writableNativeArray.pushMap((WritableNativeMap) bool);
                    } else if (cls == WritableNativeArray.class) {
                        writableNativeArray.pushArray((WritableNativeArray) bool);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Cannot convert argument of type ");
                        sb.append(cls);
                        throw new RuntimeException(sb.toString());
                    }
                    writableNativeArray.pushDouble(doubleValue);
                }
            }
        }
        return writableNativeArray;
    }

    public static WritableArray fromList(List list) {
        WritableArray fromList;
        WritableArray createArray = createArray();
        for (Object next : list) {
            if (next == null) {
                createArray.pushNull();
            } else {
                if (next.getClass().isArray()) {
                    fromList = fromArray(next);
                } else if (next instanceof Bundle) {
                    createArray.pushMap(fromBundle((Bundle) next));
                } else if (next instanceof List) {
                    fromList = fromList((List) next);
                } else if (next instanceof String) {
                    createArray.pushString((String) next);
                } else if (next instanceof Integer) {
                    createArray.pushInt(((Integer) next).intValue());
                } else if (next instanceof Number) {
                    createArray.pushDouble(((Number) next).doubleValue());
                } else if (next instanceof Boolean) {
                    createArray.pushBoolean(((Boolean) next).booleanValue());
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown value type ");
                    sb.append(next.getClass());
                    throw new IllegalArgumentException(sb.toString());
                }
                createArray.pushArray(fromList);
            }
        }
        return createArray;
    }

    public static <T> WritableNativeArray makeNativeArray(final Object obj) {
        return obj == null ? new WritableNativeArray() : makeNativeArray((List) new AbstractList() {
            public Object get(int i) {
                return Array.get(obj, i);
            }

            public int size() {
                return Array.getLength(obj);
            }
        });
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.Object>, for r3v0, types: [java.util.List, java.util.List<java.lang.Object>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facebook.react.bridge.WritableNativeArray makeNativeArray(java.util.List<java.lang.Object> r3) {
        /*
            com.facebook.react.bridge.WritableNativeArray r0 = new com.facebook.react.bridge.WritableNativeArray
            r0.<init>()
            if (r3 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.util.Iterator r3 = r3.iterator()
        L_0x000c:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0083
            java.lang.Object r1 = r3.next()
            java.lang.Object r1 = makeNativeObject(r1)
            if (r1 != 0) goto L_0x0020
            r0.pushNull()
            goto L_0x000c
        L_0x0020:
            boolean r2 = r1 instanceof java.lang.Boolean
            if (r2 == 0) goto L_0x002e
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.pushBoolean(r1)
            goto L_0x000c
        L_0x002e:
            boolean r2 = r1 instanceof java.lang.Integer
            if (r2 == 0) goto L_0x003c
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.pushInt(r1)
            goto L_0x000c
        L_0x003c:
            boolean r2 = r1 instanceof java.lang.Double
            if (r2 == 0) goto L_0x004a
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            r0.pushDouble(r1)
            goto L_0x000c
        L_0x004a:
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L_0x0054
            java.lang.String r1 = (java.lang.String) r1
            r0.pushString(r1)
            goto L_0x000c
        L_0x0054:
            boolean r2 = r1 instanceof com.facebook.react.bridge.WritableNativeArray
            if (r2 == 0) goto L_0x005e
            com.facebook.react.bridge.WritableNativeArray r1 = (com.facebook.react.bridge.WritableNativeArray) r1
            r0.pushArray(r1)
            goto L_0x000c
        L_0x005e:
            boolean r2 = r1 instanceof com.facebook.react.bridge.WritableNativeMap
            if (r2 == 0) goto L_0x0068
            com.facebook.react.bridge.WritableNativeMap r1 = (com.facebook.react.bridge.WritableNativeMap) r1
            r0.pushMap(r1)
            goto L_0x000c
        L_0x0068:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Could not convert "
            r0.append(r2)
            java.lang.Class r1 = r1.getClass()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L_0x0083:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.Arguments.makeNativeArray(java.util.List):com.facebook.react.bridge.WritableNativeArray");
    }

    public static WritableNativeMap makeNativeMap(Bundle bundle) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (bundle == null) {
            return writableNativeMap;
        }
        for (String str : bundle.keySet()) {
            addEntry(writableNativeMap, str, bundle.get(str));
        }
        return writableNativeMap;
    }

    public static WritableNativeMap makeNativeMap(Map<String, Object> map) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (map == null) {
            return writableNativeMap;
        }
        for (Entry entry : map.entrySet()) {
            addEntry(writableNativeMap, (String) entry.getKey(), entry.getValue());
        }
        return writableNativeMap;
    }

    private static Object makeNativeObject(Object obj) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Float) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short)) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (obj.getClass().isArray()) {
            return makeNativeArray(obj);
        }
        if (obj instanceof List) {
            return makeNativeArray((List) obj);
        }
        if (obj instanceof Map) {
            return makeNativeMap((Map) obj);
        }
        if (obj instanceof Bundle) {
            obj = makeNativeMap((Bundle) obj);
        }
        return obj;
    }

    public static Bundle toBundle(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        Bundle bundle = new Bundle();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (C13542.$SwitchMap$com$facebook$react$bridge$ReadableType[readableMap.getType(nextKey).ordinal()]) {
                case 1:
                    bundle.putString(nextKey, null);
                    break;
                case 2:
                    bundle.putBoolean(nextKey, readableMap.getBoolean(nextKey));
                    break;
                case 3:
                    bundle.putDouble(nextKey, readableMap.getDouble(nextKey));
                    break;
                case 4:
                    bundle.putString(nextKey, readableMap.getString(nextKey));
                    break;
                case 5:
                    bundle.putBundle(nextKey, toBundle(readableMap.getMap(nextKey)));
                    break;
                case 6:
                    bundle.putSerializable(nextKey, toList(readableMap.getArray(nextKey)));
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Could not convert object with key: ");
                    sb.append(nextKey);
                    sb.append(".");
                    throw new IllegalArgumentException(sb.toString());
            }
        }
        return bundle;
    }

    public static ArrayList toList(ReadableArray readableArray) {
        Object obj;
        if (readableArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            switch (C13542.$SwitchMap$com$facebook$react$bridge$ReadableType[readableArray.getType(i).ordinal()]) {
                case 1:
                    arrayList.add(null);
                    continue;
                case 2:
                    obj = Boolean.valueOf(readableArray.getBoolean(i));
                    break;
                case 3:
                    double d = readableArray.getDouble(i);
                    if (d != Math.rint(d)) {
                        obj = Double.valueOf(d);
                        break;
                    } else {
                        obj = Integer.valueOf((int) d);
                        break;
                    }
                case 4:
                    obj = readableArray.getString(i);
                    break;
                case 5:
                    obj = toBundle(readableArray.getMap(i));
                    break;
                case 6:
                    obj = toList(readableArray.getArray(i));
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object in array.");
            }
            arrayList.add(obj);
        }
        return arrayList;
    }
}
