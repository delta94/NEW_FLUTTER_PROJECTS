package com.facebook.react.views.text;

import com.facebook.react.uimanager.C1570F;
import com.facebook.react.uimanager.p121a.C1595a;

/* renamed from: com.facebook.react.views.text.l */
public class C1824l extends C1570F {

    /* renamed from: v */
    private String f5410v = null;

    /* renamed from: N */
    public String mo6042N() {
        return this.f5410v;
    }

    /* renamed from: j */
    public boolean mo5596j() {
        return true;
    }

    @C1595a(name = "text")
    public void setText(String str) {
        this.f5410v = str;
        mo5622K();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo5606t());
        sb.append(" [text: ");
        sb.append(this.f5410v);
        sb.append("]");
        return sb.toString();
    }
}
