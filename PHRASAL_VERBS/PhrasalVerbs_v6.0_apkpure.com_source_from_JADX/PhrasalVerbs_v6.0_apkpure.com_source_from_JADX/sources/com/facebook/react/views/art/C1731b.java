package com.facebook.react.views.art;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.p121a.C1595a;
import p032c.p033a.p038c.p043e.C0727a;

/* renamed from: com.facebook.react.views.art.b */
public class C1731b extends C1736g {

    /* renamed from: A */
    protected Path f5115A;

    /* renamed from: B */
    private float[] f5116B;

    /* renamed from: C */
    private float[] f5117C;

    /* renamed from: D */
    private float[] f5118D;

    /* renamed from: E */
    private float f5119E = 1.0f;

    /* renamed from: F */
    private int f5120F = 1;

    /* renamed from: G */
    private int f5121G = 1;

    /* renamed from: a */
    private float m6677a(float f, float f2) {
        float f3 = f % f2;
        return f3 < 0.0f ? f3 + f2 : f3;
    }

    /* renamed from: a */
    private Path m6678a(float[] fArr) {
        int i;
        int i2;
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        int i3 = 0;
        while (i3 < fArr.length) {
            int i4 = i3 + 1;
            int i5 = (int) fArr[i3];
            if (i5 != 0) {
                boolean z = true;
                if (i5 == 1) {
                    path.close();
                    i3 = i4;
                } else if (i5 != 2) {
                    if (i5 == 3) {
                        int i6 = i4 + 1;
                        float f = fArr[i4];
                        float f2 = this.f5130z;
                        int i7 = i6 + 1;
                        float f3 = fArr[i6] * f2;
                        int i8 = i7 + 1;
                        int i9 = i8 + 1;
                        float f4 = fArr[i8] * f2;
                        int i10 = i9 + 1;
                        i2 = i10 + 1;
                        path.cubicTo(f * f2, f3, fArr[i7] * f2, f4, fArr[i9] * f2, fArr[i10] * f2);
                    } else if (i5 == 4) {
                        int i11 = i4 + 1;
                        float f5 = fArr[i4];
                        float f6 = this.f5130z;
                        float f7 = f5 * f6;
                        int i12 = i11 + 1;
                        float f8 = fArr[i11] * f6;
                        int i13 = i12 + 1;
                        float f9 = fArr[i12] * f6;
                        int i14 = i13 + 1;
                        float degrees = (float) Math.toDegrees((double) fArr[i13]);
                        int i15 = i14 + 1;
                        float degrees2 = (float) Math.toDegrees((double) fArr[i14]);
                        i2 = i15 + 1;
                        if (fArr[i15] == 1.0f) {
                            z = false;
                        }
                        float f10 = degrees2 - degrees;
                        if (Math.abs(f10) >= 360.0f) {
                            path.addCircle(f7, f8, f9, z ? Direction.CCW : Direction.CW);
                        } else {
                            float a = m6677a(f10, 360.0f);
                            if (z && a < 360.0f) {
                                a = (360.0f - a) * -1.0f;
                            }
                            path.arcTo(new RectF(f7 - f9, f8 - f9, f7 + f9, f8 + f9), degrees, a);
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unrecognized drawing instruction ");
                        sb.append(i5);
                        throw new JSApplicationIllegalArgumentException(sb.toString());
                    }
                    i3 = i2;
                } else {
                    int i16 = i4 + 1;
                    float f11 = fArr[i4];
                    float f12 = this.f5130z;
                    i = i16 + 1;
                    path.lineTo(f11 * f12, fArr[i16] * f12);
                }
            } else {
                int i17 = i4 + 1;
                float f13 = fArr[i4];
                float f14 = this.f5130z;
                i = i17 + 1;
                path.moveTo(f13 * f14, fArr[i17] * f14);
            }
            i3 = i;
        }
        return path;
    }

    /* renamed from: a */
    public void mo6023a(Canvas canvas, Paint paint, float f) {
        float f2 = f * this.f5128x;
        if (f2 > 0.01f) {
            mo6044b(canvas);
            if (this.f5115A != null) {
                if (mo6025a(paint, f2)) {
                    canvas.drawPath(this.f5115A, paint);
                }
                if (mo6026b(paint, f2)) {
                    canvas.drawPath(this.f5115A, paint);
                }
                mo6043a(canvas);
            } else {
                throw new JSApplicationIllegalArgumentException("Shapes should have a valid path (d) prop");
            }
        }
        mo5577b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo6025a(Paint paint, float f) {
        boolean z;
        float[] fArr;
        int[] iArr;
        Paint paint2 = paint;
        float[] fArr2 = this.f5117C;
        int i = 0;
        if (fArr2 == null || fArr2.length <= 0) {
            return false;
        }
        paint.reset();
        paint2.setFlags(1);
        paint2.setStyle(Style.FILL);
        float[] fArr3 = this.f5117C;
        int i2 = (int) fArr3[0];
        if (i2 != 0) {
            String str = "ReactNative";
            if (i2 != 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("ART: Color type ");
                sb.append(i2);
                sb.append(" not supported!");
                C0727a.m3284d(str, sb.toString());
            } else {
                int i3 = 5;
                if (fArr3.length < 5) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("[ARTShapeShadowNode setupFillPaint] expects 5 elements, received ");
                    sb2.append(this.f5117C.length);
                    C0727a.m3284d(str, sb2.toString());
                    return false;
                }
                float f2 = fArr3[1];
                float f3 = this.f5130z;
                float f4 = f2 * f3;
                float f5 = fArr3[2] * f3;
                float f6 = fArr3[3] * f3;
                float f7 = fArr3[4] * f3;
                int length = (fArr3.length - 5) / 5;
                if (length > 0) {
                    int[] iArr2 = new int[length];
                    float[] fArr4 = new float[length];
                    while (i < length) {
                        float[] fArr5 = this.f5117C;
                        fArr4[i] = fArr5[(length * 4) + i3 + i];
                        int i4 = (i * 4) + i3;
                        iArr2[i] = Color.argb((int) (fArr5[i4 + 3] * 255.0f), (int) (fArr5[i4 + 0] * 255.0f), (int) (fArr5[i4 + 1] * 255.0f), (int) (fArr5[i4 + 2] * 255.0f));
                        i++;
                        i3 = 5;
                    }
                    iArr = iArr2;
                    fArr = fArr4;
                } else {
                    iArr = null;
                    fArr = null;
                }
                LinearGradient linearGradient = new LinearGradient(f4, f5, f6, f7, iArr, fArr, TileMode.CLAMP);
                paint2.setShader(linearGradient);
            }
            z = true;
        } else {
            int i5 = (int) (fArr3.length > 4 ? fArr3[4] * f * 255.0f : f * 255.0f);
            float[] fArr6 = this.f5117C;
            z = true;
            paint2.setARGB(i5, (int) (fArr6[1] * 255.0f), (int) (fArr6[2] * 255.0f), (int) (fArr6[3] * 255.0f));
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo6026b(Paint paint, float f) {
        Cap cap;
        Join join;
        if (this.f5119E != 0.0f) {
            float[] fArr = this.f5116B;
            if (!(fArr == null || fArr.length == 0)) {
                paint.reset();
                paint.setFlags(1);
                paint.setStyle(Style.STROKE);
                int i = this.f5120F;
                String str = " unrecognized";
                if (i == 0) {
                    cap = Cap.BUTT;
                } else if (i == 1) {
                    cap = Cap.ROUND;
                } else if (i == 2) {
                    cap = Cap.SQUARE;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("strokeCap ");
                    sb.append(this.f5120F);
                    sb.append(str);
                    throw new JSApplicationIllegalArgumentException(sb.toString());
                }
                paint.setStrokeCap(cap);
                int i2 = this.f5121G;
                if (i2 == 0) {
                    join = Join.MITER;
                } else if (i2 == 1) {
                    join = Join.ROUND;
                } else if (i2 == 2) {
                    join = Join.BEVEL;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("strokeJoin ");
                    sb2.append(this.f5121G);
                    sb2.append(str);
                    throw new JSApplicationIllegalArgumentException(sb2.toString());
                }
                paint.setStrokeJoin(join);
                paint.setStrokeWidth(this.f5119E * this.f5130z);
                float[] fArr2 = this.f5116B;
                int i3 = (int) (fArr2.length > 3 ? fArr2[3] * f * 255.0f : f * 255.0f);
                float[] fArr3 = this.f5116B;
                paint.setARGB(i3, (int) (fArr3[0] * 255.0f), (int) (fArr3[1] * 255.0f), (int) (fArr3[2] * 255.0f));
                float[] fArr4 = this.f5118D;
                if (fArr4 != null && fArr4.length > 0) {
                    paint.setPathEffect(new DashPathEffect(fArr4, 0.0f));
                }
                return true;
            }
        }
        return false;
    }

    @C1595a(name = "fill")
    public void setFill(ReadableArray readableArray) {
        this.f5117C = C1737h.m6695a(readableArray);
        mo5622K();
    }

    @C1595a(name = "d")
    public void setShapePath(ReadableArray readableArray) {
        this.f5115A = m6678a(C1737h.m6695a(readableArray));
        mo5622K();
    }

    @C1595a(name = "stroke")
    public void setStroke(ReadableArray readableArray) {
        this.f5116B = C1737h.m6695a(readableArray);
        mo5622K();
    }

    @C1595a(defaultInt = 1, name = "strokeCap")
    public void setStrokeCap(int i) {
        this.f5120F = i;
        mo5622K();
    }

    @C1595a(name = "strokeDash")
    public void setStrokeDash(ReadableArray readableArray) {
        this.f5118D = C1737h.m6695a(readableArray);
        mo5622K();
    }

    @C1595a(defaultInt = 1, name = "strokeJoin")
    public void setStrokeJoin(int i) {
        this.f5121G = i;
        mo5622K();
    }

    @C1595a(defaultFloat = 1.0f, name = "strokeWidth")
    public void setStrokeWidth(float f) {
        this.f5119E = f;
        mo5622K();
    }
}
