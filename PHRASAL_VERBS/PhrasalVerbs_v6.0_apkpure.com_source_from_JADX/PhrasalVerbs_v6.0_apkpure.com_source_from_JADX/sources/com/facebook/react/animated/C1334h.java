package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.h */
class C1334h extends C1330d {

    /* renamed from: e */
    private long f4323e;

    /* renamed from: f */
    private double[] f4324f;

    /* renamed from: g */
    private double f4325g;

    /* renamed from: h */
    private double f4326h;

    /* renamed from: i */
    private int f4327i;

    /* renamed from: j */
    private int f4328j;

    C1334h(ReadableMap readableMap) {
        mo4834a(readableMap);
    }

    /* renamed from: a */
    public void mo4833a(long j) {
        double d;
        if (this.f4323e < 0) {
            this.f4323e = j;
            if (this.f4328j == 1) {
                this.f4326h = this.f4306b.f4296e;
            }
        }
        double d2 = (double) ((j - this.f4323e) / 1000000);
        Double.isNaN(d2);
        int round = (int) Math.round(d2 / 16.666666666666668d);
        if (round < 0) {
            throw new IllegalStateException("Calculated frame index should never be lower than 0");
        } else if (!this.f4305a) {
            double[] dArr = this.f4324f;
            if (round >= dArr.length - 1) {
                d = this.f4325g;
                int i = this.f4327i;
                if (i == -1 || this.f4328j < i) {
                    this.f4323e = -1;
                    this.f4328j++;
                } else {
                    this.f4305a = true;
                }
            } else {
                double d3 = this.f4326h;
                d = d3 + (dArr[round] * (this.f4325g - d3));
            }
            this.f4306b.f4296e = d;
        }
    }

    /* renamed from: a */
    public void mo4834a(ReadableMap readableMap) {
        ReadableArray array = readableMap.getArray("frames");
        int size = array.size();
        double[] dArr = this.f4324f;
        if (dArr == null || dArr.length != size) {
            this.f4324f = new double[size];
        }
        boolean z = false;
        for (int i = 0; i < size; i++) {
            this.f4324f[i] = array.getDouble(i);
        }
        String str = "toValue";
        this.f4325g = readableMap.hasKey(str) ? readableMap.getDouble(str) : 0.0d;
        String str2 = "iterations";
        this.f4327i = readableMap.hasKey(str2) ? readableMap.getInt(str2) : 1;
        this.f4328j = 1;
        if (this.f4327i == 0) {
            z = true;
        }
        this.f4305a = z;
        this.f4323e = -1;
    }
}
