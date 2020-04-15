package com.facebook.react.uimanager;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.view.View;
import java.util.Locale;
import p000a.p005b.p009c.p018g.C0134d;
import p000a.p005b.p009c.p018g.C0156v;
import p000a.p005b.p009c.p018g.p019a.C0123a;
import p000a.p005b.p009c.p018g.p019a.C0123a.C0125b;
import p032c.p033a.p098m.C1226m;
import p032c.p033a.p098m.C1227n;

/* renamed from: com.facebook.react.uimanager.c */
public class C1601c {

    /* renamed from: com.facebook.react.uimanager.c$a */
    public enum C1602a {
        NONE,
        BUTTON,
        LINK,
        SEARCH,
        IMAGE,
        IMAGEBUTTON,
        KEYBOARDKEY,
        TEXT,
        ADJUSTABLE,
        SUMMARY,
        HEADER;

        /* renamed from: a */
        public static C1602a m6346a(String str) {
            C1602a[] values;
            for (C1602a aVar : values()) {
                if (aVar.name().equalsIgnoreCase(str)) {
                    return aVar;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid accessibility role value: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: a */
        public static String m6347a(C1602a aVar) {
            String str = "android.widget.ImageView";
            String str2 = "android.widget.ViewGroup";
            switch (C1598b.f4818a[aVar.ordinal()]) {
                case 1:
                    return null;
                case 2:
                    return "android.widget.Button";
                case 3:
                    return str2;
                case 4:
                    return "android.widget.EditText";
                case 5:
                case 6:
                    return str;
                case 7:
                    return "android.inputmethodservice.Keyboard$Key";
                case 8:
                    return str2;
                case 9:
                    return "android.widget.SeekBar";
                case 10:
                case 11:
                    return str2;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid accessibility role value: ");
                    sb.append(aVar);
                    throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public static void m6344a(C0123a aVar, C1602a aVar2, Context context) {
        if (aVar2 == null) {
            aVar2 = C1602a.NONE;
        }
        aVar.mo423a((CharSequence) C1602a.m6347a(aVar2));
        if (Locale.getDefault().getLanguage().equals(new Locale("en").getLanguage())) {
            if (aVar2.equals(C1602a.LINK)) {
                aVar.mo439d((CharSequence) context.getString(C1227n.link_description));
                String str = "";
                if (aVar.mo432c() != null) {
                    SpannableString spannableString = new SpannableString(aVar.mo432c());
                    spannableString.setSpan(new URLSpan(str), 0, spannableString.length(), 0);
                    aVar.mo430b((CharSequence) spannableString);
                }
                if (aVar.mo441e() != null) {
                    SpannableString spannableString2 = new SpannableString(aVar.mo441e());
                    spannableString2.setSpan(new URLSpan(str), 0, spannableString2.length(), 0);
                    aVar.mo442e((CharSequence) spannableString2);
                }
            }
            if (aVar2.equals(C1602a.SEARCH)) {
                aVar.mo439d((CharSequence) context.getString(C1227n.search_description));
            }
            if (aVar2.equals(C1602a.IMAGE)) {
                aVar.mo439d((CharSequence) context.getString(C1227n.image_description));
            }
            if (aVar2.equals(C1602a.IMAGEBUTTON)) {
                aVar.mo439d((CharSequence) context.getString(C1227n.image_button_description));
            }
            if (aVar2.equals(C1602a.ADJUSTABLE)) {
                aVar.mo439d((CharSequence) context.getString(C1227n.adjustable_description));
            }
            if (aVar2.equals(C1602a.HEADER)) {
                aVar.mo439d((CharSequence) context.getString(C1227n.header_description));
                aVar.mo424a((Object) C0125b.m450a(0, 1, 0, 1, true));
            }
        }
        if (aVar2.equals(C1602a.IMAGEBUTTON)) {
            aVar.mo431b(true);
        }
    }

    /* renamed from: a */
    public static void m6345a(View view) {
        String str = (String) view.getTag(C1226m.accessibility_hint);
        C1602a aVar = (C1602a) view.getTag(C1226m.accessibility_role);
        if (C0156v.m573n(view)) {
            return;
        }
        if (str != null || aVar != null) {
            C0156v.m543a(view, (C0134d) new C1594a(str, aVar, view));
        }
    }
}
