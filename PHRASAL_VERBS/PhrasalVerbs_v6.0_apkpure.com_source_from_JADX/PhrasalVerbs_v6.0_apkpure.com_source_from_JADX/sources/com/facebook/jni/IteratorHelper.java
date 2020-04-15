package com.facebook.jni;

import java.util.Iterator;
import p032c.p033a.p096l.p097a.C1137a;

@C1137a
public class IteratorHelper {

    /* renamed from: a */
    private final Iterator f4221a;
    @C1137a
    private Object mElement;

    @C1137a
    public IteratorHelper(Iterable iterable) {
        this.f4221a = iterable.iterator();
    }

    @C1137a
    public IteratorHelper(Iterator it) {
        this.f4221a = it;
    }

    /* access modifiers changed from: 0000 */
    @C1137a
    public boolean hasNext() {
        if (this.f4221a.hasNext()) {
            this.mElement = this.f4221a.next();
            return true;
        }
        this.mElement = null;
        return false;
    }
}
