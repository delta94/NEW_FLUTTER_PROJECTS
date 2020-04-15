package android.support.p029v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Icon;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* renamed from: android.support.v4.graphics.drawable.IconCompat */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: a */
    static final Mode f920a = Mode.SRC_IN;

    /* renamed from: b */
    public int f921b;

    /* renamed from: c */
    Object f922c;

    /* renamed from: d */
    public byte[] f923d;

    /* renamed from: e */
    public Parcelable f924e;

    /* renamed from: f */
    public int f925f;

    /* renamed from: g */
    public int f926g;

    /* renamed from: h */
    public ColorStateList f927h = null;

    /* renamed from: i */
    Mode f928i = f920a;

    /* renamed from: j */
    public String f929j;

    /* renamed from: a */
    private static int m1327a(Icon icon) {
        String str = "Unable to get icon resource";
        String str2 = "IconCompat";
        if (VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e(str2, str, e);
            return 0;
        } catch (InvocationTargetException e2) {
            Log.e(str2, str, e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e(str2, str, e3);
            return 0;
        }
    }

    /* renamed from: a */
    private static String m1328a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN" : "BITMAP_MASKABLE" : "URI" : "DATA" : "RESOURCE" : "BITMAP";
    }

    /* renamed from: b */
    private static String m1329b(Icon icon) {
        String str = "Unable to get icon package";
        String str2 = "IconCompat";
        if (VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e(str2, str, e);
            return null;
        } catch (InvocationTargetException e2) {
            Log.e(str2, str, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e(str2, str, e3);
            return null;
        }
    }

    /* renamed from: a */
    public int mo1265a() {
        if (this.f921b == -1 && VERSION.SDK_INT >= 23) {
            return m1327a((Icon) this.f922c);
        }
        if (this.f921b == 2) {
            return this.f925f;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("called getResId() on ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public void mo1266a(boolean z) {
        byte[] byteArray;
        String str;
        this.f929j = this.f928i.name();
        int i = this.f921b;
        if (i != -1) {
            if (i != 1) {
                String str2 = "UTF-16";
                if (i == 2) {
                    str = (String) this.f922c;
                } else if (i == 3) {
                    byteArray = (byte[]) this.f922c;
                    this.f923d = byteArray;
                    return;
                } else if (i == 4) {
                    str = this.f922c.toString();
                } else if (i != 5) {
                    return;
                }
                byteArray = str.getBytes(Charset.forName(str2));
                this.f923d = byteArray;
                return;
            }
            if (z) {
                Bitmap bitmap = (Bitmap) this.f922c;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(CompressFormat.PNG, 90, byteArrayOutputStream);
                byteArray = byteArrayOutputStream.toByteArray();
                this.f923d = byteArray;
                return;
            }
        } else if (z) {
            throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
        }
        this.f924e = (Parcelable) this.f922c;
    }

    /* renamed from: b */
    public String mo1267b() {
        if (this.f921b == -1 && VERSION.SDK_INT >= 23) {
            return m1329b((Icon) this.f922c);
        }
        if (this.f921b == 2) {
            return ((String) this.f922c).split(":", -1)[0];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("called getResPackage() on ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: c */
    public void mo1268c() {
        Object obj;
        this.f928i = Mode.valueOf(this.f929j);
        int i = this.f921b;
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        obj = this.f923d;
                    } else if (i != 4) {
                        if (i != 5) {
                            return;
                        }
                    }
                }
                obj = new String(this.f923d, Charset.forName("UTF-16"));
            }
            obj = this.f924e;
            if (obj == null) {
                byte[] bArr = this.f923d;
                this.f922c = bArr;
                this.f921b = 3;
                this.f925f = 0;
                this.f926g = bArr.length;
                return;
            }
        } else {
            obj = this.f924e;
            if (obj == null) {
                throw new IllegalArgumentException("Invalid icon");
            }
        }
        this.f922c = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r1 != 5) goto L_0x0097;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r4 = this;
            int r0 = r4.f921b
            r1 = -1
            if (r0 != r1) goto L_0x000c
            java.lang.Object r0 = r4.f922c
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x000c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r4.f921b
            java.lang.String r1 = m1328a(r1)
            r0.append(r1)
            int r1 = r4.f921b
            r2 = 1
            if (r1 == r2) goto L_0x0077
            r3 = 2
            if (r1 == r3) goto L_0x004f
            r2 = 3
            if (r1 == r2) goto L_0x0039
            r2 = 4
            if (r1 == r2) goto L_0x002e
            r2 = 5
            if (r1 == r2) goto L_0x0077
            goto L_0x0097
        L_0x002e:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r4.f922c
            r0.append(r1)
            goto L_0x0097
        L_0x0039:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r4.f925f
            r0.append(r1)
            int r1 = r4.f926g
            if (r1 == 0) goto L_0x0097
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r4.f926g
            goto L_0x0094
        L_0x004f:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r4.mo1267b()
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            int r3 = r4.mo1265a()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto L_0x0097
        L_0x0077:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r4.f922c
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r4.f922c
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
        L_0x0094:
            r0.append(r1)
        L_0x0097:
            android.content.res.ColorStateList r1 = r4.f927h
            if (r1 == 0) goto L_0x00a5
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r4.f927h
            r0.append(r1)
        L_0x00a5:
            android.graphics.PorterDuff$Mode r1 = r4.f928i
            android.graphics.PorterDuff$Mode r2 = f920a
            if (r1 == r2) goto L_0x00b5
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r4.f928i
            r0.append(r1)
        L_0x00b5:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v4.graphics.drawable.IconCompat.toString():java.lang.String");
    }
}
