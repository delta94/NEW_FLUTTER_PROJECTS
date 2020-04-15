package com.facebook.react.views.text;

import java.text.BreakIterator;

/* renamed from: com.facebook.react.views.text.C */
public enum C1808C {
    NONE,
    UPPERCASE,
    LOWERCASE,
    CAPITALIZE,
    UNSET;

    /* renamed from: a */
    private static String m6908a(String str) {
        BreakIterator wordInstance = BreakIterator.getWordInstance();
        wordInstance.setText(str);
        StringBuilder sb = new StringBuilder(str.length());
        int first = wordInstance.first();
        while (true) {
            int i = first;
            first = wordInstance.next();
            if (first == -1) {
                return sb.toString();
            }
            String substring = str.substring(i, first);
            if (Character.isLetterOrDigit(substring.charAt(0))) {
                sb.append(Character.toUpperCase(substring.charAt(0)));
                substring = substring.substring(1).toLowerCase();
            }
            sb.append(substring);
        }
    }

    /* renamed from: a */
    public static String m6909a(String str, C1808C c) {
        if (str == null) {
            return null;
        }
        int i = C1807B.f5350a[c.ordinal()];
        if (i == 1) {
            str = str.toUpperCase();
        } else if (i == 2) {
            str = str.toLowerCase();
        } else if (i == 3) {
            str = m6908a(str);
        }
        return str;
    }
}
