package com.facebook.react.views.picker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C1578N;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.C1635c;
import com.facebook.react.uimanager.events.C1638f;
import com.facebook.react.uimanager.p121a.C1595a;
import com.facebook.react.views.picker.C1773c.C1774a;
import com.facebook.react.views.picker.p126a.C1771a;
import p032c.p033a.p094k.p095a.C1136a;

public abstract class ReactPickerManager extends SimpleViewManager<C1773c> {

    /* renamed from: com.facebook.react.views.picker.ReactPickerManager$a */
    private static class C1768a implements C1774a {

        /* renamed from: a */
        private final C1773c f5208a;

        /* renamed from: b */
        private final C1638f f5209b;

        public C1768a(C1773c cVar, C1638f fVar) {
            this.f5208a = cVar;
            this.f5209b = fVar;
        }

        /* renamed from: a */
        public void mo6148a(int i) {
            this.f5209b.mo5886a((C1635c) new C1771a(this.f5208a.getId(), i));
        }
    }

    /* renamed from: com.facebook.react.views.picker.ReactPickerManager$b */
    private static class C1769b extends ArrayAdapter<ReadableMap> {

        /* renamed from: a */
        private final LayoutInflater f5210a;

        /* renamed from: b */
        private Integer f5211b;

        public C1769b(Context context, ReadableMap[] readableMapArr) {
            super(context, 0, readableMapArr);
            Object systemService = context.getSystemService("layout_inflater");
            C1136a.m5053a(systemService);
            this.f5210a = (LayoutInflater) systemService;
        }

        /* renamed from: a */
        private View m6785a(int i, View view, ViewGroup viewGroup, boolean z) {
            int i2;
            ReadableMap readableMap = (ReadableMap) getItem(i);
            if (view == null) {
                view = this.f5210a.inflate(z ? 17367049 : 17367048, viewGroup, false);
            }
            TextView textView = (TextView) view;
            textView.setText(readableMap.getString("label"));
            if (!z) {
                Integer num = this.f5211b;
                if (num != null) {
                    i2 = num.intValue();
                    textView.setTextColor(i2);
                    return view;
                }
            }
            String str = "color";
            if (readableMap.hasKey(str) && !readableMap.isNull(str)) {
                i2 = readableMap.getInt(str);
                textView.setTextColor(i2);
            }
            return view;
        }

        /* renamed from: a */
        public void mo6149a(Integer num) {
            this.f5211b = num;
            notifyDataSetChanged();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            return m6785a(i, view, viewGroup, true);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return m6785a(i, view, viewGroup, false);
        }
    }

    /* access modifiers changed from: protected */
    public void addEventEmitters(C1578N n, C1773c cVar) {
        cVar.setOnSelectListener(new C1768a(cVar, ((UIManagerModule) n.getNativeModule(UIManagerModule.class)).getEventDispatcher()));
    }

    /* access modifiers changed from: protected */
    public void onAfterUpdateTransaction(C1773c cVar) {
        super.onAfterUpdateTransaction(cVar);
        cVar.mo6155a();
    }

    @C1595a(customType = "Color", name = "color")
    public void setColor(C1773c cVar, Integer num) {
        cVar.setPrimaryColor(num);
        C1769b bVar = (C1769b) cVar.getAdapter();
        if (bVar != null) {
            bVar.mo6149a(num);
        }
    }

    @C1595a(defaultBoolean = true, name = "enabled")
    public void setEnabled(C1773c cVar, boolean z) {
        cVar.setEnabled(z);
    }

    @C1595a(name = "items")
    public void setItems(C1773c cVar, ReadableArray readableArray) {
        C1769b bVar;
        if (readableArray != null) {
            ReadableMap[] readableMapArr = new ReadableMap[readableArray.size()];
            for (int i = 0; i < readableArray.size(); i++) {
                readableMapArr[i] = readableArray.getMap(i);
            }
            bVar = new C1769b(cVar.getContext(), readableMapArr);
            bVar.mo6149a(cVar.getPrimaryColor());
        } else {
            bVar = null;
        }
        cVar.setAdapter((SpinnerAdapter) bVar);
    }

    @C1595a(name = "prompt")
    public void setPrompt(C1773c cVar, String str) {
        cVar.setPrompt(str);
    }

    @C1595a(name = "selected")
    public void setSelected(C1773c cVar, int i) {
        cVar.setStagedSelection(i);
    }
}
