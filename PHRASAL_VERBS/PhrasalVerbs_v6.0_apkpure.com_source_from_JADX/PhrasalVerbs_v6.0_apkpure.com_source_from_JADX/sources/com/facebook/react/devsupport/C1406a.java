package com.facebook.react.devsupport;

import android.content.Context;
import com.facebook.react.devsupport.p118a.C1407a;
import com.facebook.react.devsupport.p118a.C1408b;
import java.util.Map;

/* renamed from: com.facebook.react.devsupport.a */
public class C1406a {
    /* renamed from: a */
    public static C1408b m5758a(Context context, C1413e eVar, String str, boolean z, C1414f fVar, C1407a aVar, int i, Map<String, Object> map) {
        if (!z) {
            return new C1410b();
        }
        try {
            StringBuilder sb = new StringBuilder("com.facebook.react.devsupport");
            sb.append(".");
            sb.append("DevSupportManagerImpl");
            return (C1408b) Class.forName(sb.toString()).getConstructor(new Class[]{Context.class, C1413e.class, String.class, Boolean.TYPE, C1414f.class, C1407a.class, Integer.TYPE, Map.class}).newInstance(new Object[]{context, eVar, str, Boolean.valueOf(true), fVar, aVar, Integer.valueOf(i), map});
        } catch (Exception e) {
            throw new RuntimeException("Requested enabled DevSupportManager, but DevSupportManagerImpl class was not found or could not be created", e);
        }
    }
}
