package com.facebook.react.modules.network;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import p032c.p033a.p038c.p043e.C0727a;

/* renamed from: com.facebook.react.modules.network.x */
public class C1532x {

    /* renamed from: a */
    private final CharsetDecoder f4675a;

    /* renamed from: b */
    private byte[] f4676b = null;

    public C1532x(Charset charset) {
        this.f4675a = charset.newDecoder();
    }

    /* renamed from: a */
    public String mo5472a(byte[] bArr, int i) {
        byte[] bArr2 = this.f4676b;
        if (bArr2 != null) {
            byte[] bArr3 = new byte[(bArr2.length + i)];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            System.arraycopy(bArr, 0, bArr3, this.f4676b.length, i);
            i += this.f4676b.length;
            bArr = bArr3;
        }
        boolean z = true;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i);
        CharBuffer charBuffer = null;
        boolean z2 = false;
        int i2 = 0;
        while (!z2 && i2 < 4) {
            try {
                charBuffer = this.f4675a.decode(wrap);
                z2 = true;
            } catch (CharacterCodingException unused) {
                i2++;
                wrap = ByteBuffer.wrap(bArr, 0, i - i2);
            }
        }
        if (!z2 || i2 <= 0) {
            z = false;
        }
        if (z) {
            this.f4676b = new byte[i2];
            System.arraycopy(bArr, i - i2, this.f4676b, 0, i2);
        } else {
            this.f4676b = null;
        }
        if (z2) {
            return new String(charBuffer.array(), 0, charBuffer.length());
        }
        C0727a.m3284d("ReactNative", "failed to decode string from byte array");
        return "";
    }
}
