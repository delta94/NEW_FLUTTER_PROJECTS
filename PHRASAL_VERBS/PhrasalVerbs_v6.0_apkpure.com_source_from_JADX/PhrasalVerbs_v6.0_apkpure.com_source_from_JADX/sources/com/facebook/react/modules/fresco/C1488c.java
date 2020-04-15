package com.facebook.react.modules.fresco;

import android.util.Pair;
import com.facebook.systrace.C1937a;
import com.facebook.systrace.C1937a.C1938a;
import java.util.HashMap;
import java.util.Map;
import p032c.p033a.p074i.p087k.C0992a;
import p032c.p033a.p074i.p091o.C1114c;

/* renamed from: com.facebook.react.modules.fresco.c */
public class C1488c extends C0992a {

    /* renamed from: a */
    int f4592a = 0;

    /* renamed from: b */
    Map<String, Pair<Integer, String>> f4593b = new HashMap();

    /* renamed from: c */
    Map<String, Pair<Integer, String>> f4594c = new HashMap();

    /* renamed from: a */
    public void mo3591a(C1114c cVar, Object obj, String str, boolean z) {
        if (C1937a.m7347b(0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("FRESCO_REQUEST_");
            sb.append(cVar.mo4372o().toString().replace(':', '_'));
            Pair create = Pair.create(Integer.valueOf(this.f4592a), sb.toString());
            C1937a.m7340a(0, (String) create.second, this.f4592a);
            this.f4594c.put(str, create);
            this.f4592a++;
        }
    }

    /* renamed from: a */
    public void mo3592a(C1114c cVar, String str, Throwable th, boolean z) {
        if (C1937a.m7347b(0) && this.f4594c.containsKey(str)) {
            Pair pair = (Pair) this.f4594c.get(str);
            C1937a.m7348c(0, (String) pair.second, ((Integer) pair.first).intValue());
            this.f4594c.remove(str);
        }
    }

    /* renamed from: a */
    public void mo3593a(C1114c cVar, String str, boolean z) {
        if (C1937a.m7347b(0) && this.f4594c.containsKey(str)) {
            Pair pair = (Pair) this.f4594c.get(str);
            C1937a.m7348c(0, (String) pair.second, ((Integer) pair.first).intValue());
            this.f4594c.remove(str);
        }
    }

    /* renamed from: a */
    public void mo4232a(String str, String str2) {
        if (C1937a.m7347b(0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("FRESCO_PRODUCER_");
            sb.append(str2.replace(':', '_'));
            Pair create = Pair.create(Integer.valueOf(this.f4592a), sb.toString());
            C1937a.m7340a(0, (String) create.second, this.f4592a);
            this.f4593b.put(str, create);
            this.f4592a++;
        }
    }

    /* renamed from: a */
    public void mo4233a(String str, String str2, String str3) {
        if (C1937a.m7347b(0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("FRESCO_PRODUCER_EVENT_");
            sb.append(str.replace(':', '_'));
            String str4 = "_";
            sb.append(str4);
            sb.append(str2.replace(':', '_'));
            sb.append(str4);
            sb.append(str3.replace(':', '_'));
            C1937a.m7342a(0, sb.toString(), C1938a.THREAD);
        }
    }

    /* renamed from: a */
    public void mo4234a(String str, String str2, Throwable th, Map<String, String> map) {
        if (C1937a.m7347b(0) && this.f4593b.containsKey(str)) {
            Pair pair = (Pair) this.f4593b.get(str);
            C1937a.m7348c(0, (String) pair.second, ((Integer) pair.first).intValue());
            this.f4593b.remove(str);
        }
    }

    /* renamed from: a */
    public void mo4235a(String str, String str2, Map<String, String> map) {
        if (C1937a.m7347b(0) && this.f4593b.containsKey(str)) {
            Pair pair = (Pair) this.f4593b.get(str);
            C1937a.m7348c(0, (String) pair.second, ((Integer) pair.first).intValue());
            this.f4593b.remove(str);
        }
    }

    /* renamed from: a */
    public boolean mo4236a(String str) {
        return false;
    }

    /* renamed from: b */
    public void mo3594b(String str) {
        if (C1937a.m7347b(0) && this.f4594c.containsKey(str)) {
            Pair pair = (Pair) this.f4594c.get(str);
            C1937a.m7348c(0, (String) pair.second, ((Integer) pair.first).intValue());
            this.f4594c.remove(str);
        }
    }

    /* renamed from: b */
    public void mo4237b(String str, String str2, Map<String, String> map) {
        if (C1937a.m7347b(0) && this.f4593b.containsKey(str)) {
            Pair pair = (Pair) this.f4593b.get(str);
            C1937a.m7348c(0, (String) pair.second, ((Integer) pair.first).intValue());
            this.f4593b.remove(str);
        }
    }
}
