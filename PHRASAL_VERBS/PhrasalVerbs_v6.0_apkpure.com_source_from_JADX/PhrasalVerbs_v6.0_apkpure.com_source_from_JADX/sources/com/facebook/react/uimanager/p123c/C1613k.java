package com.facebook.react.uimanager.p123c;

/* renamed from: com.facebook.react.uimanager.c.k */
enum C1613k {
    CREATE,
    UPDATE,
    DELETE;

    /* renamed from: a */
    public static String m6367a(C1613k kVar) {
        int i = C1612j.f4861a[kVar.ordinal()];
        if (i == 1) {
            return "create";
        }
        if (i == 2) {
            return "update";
        }
        if (i == 3) {
            return "delete";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported LayoutAnimationType: ");
        sb.append(kVar);
        throw new IllegalArgumentException(sb.toString());
    }
}
