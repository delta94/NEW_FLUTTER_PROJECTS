package com.facebook.react.bridge;

import android.support.p029v4.util.Pools$SimplePool;

public class DynamicFromArray implements Dynamic {
    private static final Pools$SimplePool<DynamicFromArray> sPool = new Pools$SimplePool<>(10);
    private ReadableArray mArray;
    private int mIndex = -1;

    private DynamicFromArray() {
    }

    public static DynamicFromArray create(ReadableArray readableArray, int i) {
        DynamicFromArray dynamicFromArray = (DynamicFromArray) sPool.mo1311a();
        if (dynamicFromArray == null) {
            dynamicFromArray = new DynamicFromArray();
        }
        dynamicFromArray.mArray = readableArray;
        dynamicFromArray.mIndex = i;
        return dynamicFromArray;
    }

    public ReadableArray asArray() {
        ReadableArray readableArray = this.mArray;
        if (readableArray != null) {
            return readableArray.getArray(this.mIndex);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public boolean asBoolean() {
        ReadableArray readableArray = this.mArray;
        if (readableArray != null) {
            return readableArray.getBoolean(this.mIndex);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public double asDouble() {
        ReadableArray readableArray = this.mArray;
        if (readableArray != null) {
            return readableArray.getDouble(this.mIndex);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public int asInt() {
        ReadableArray readableArray = this.mArray;
        if (readableArray != null) {
            return readableArray.getInt(this.mIndex);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public ReadableMap asMap() {
        ReadableArray readableArray = this.mArray;
        if (readableArray != null) {
            return readableArray.getMap(this.mIndex);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public String asString() {
        ReadableArray readableArray = this.mArray;
        if (readableArray != null) {
            return readableArray.getString(this.mIndex);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public ReadableType getType() {
        ReadableArray readableArray = this.mArray;
        if (readableArray != null) {
            return readableArray.getType(this.mIndex);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public boolean isNull() {
        ReadableArray readableArray = this.mArray;
        if (readableArray != null) {
            return readableArray.isNull(this.mIndex);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public void recycle() {
        this.mArray = null;
        this.mIndex = -1;
        sPool.mo1312a(this);
    }
}
