package com.facebook.jni;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import p032c.p033a.p096l.p097a.C1137a;

@C1137a
public class MapIteratorHelper {
    @C1137a
    private final Iterator<Entry> mIterator;
    @C1137a
    private Object mKey;
    @C1137a
    private Object mValue;

    @C1137a
    public MapIteratorHelper(Map map) {
        this.mIterator = map.entrySet().iterator();
    }

    /* access modifiers changed from: 0000 */
    @C1137a
    public boolean hasNext() {
        if (this.mIterator.hasNext()) {
            Entry entry = (Entry) this.mIterator.next();
            this.mKey = entry.getKey();
            this.mValue = entry.getValue();
            return true;
        }
        this.mKey = null;
        this.mValue = null;
        return false;
    }
}
