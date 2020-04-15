package com.facebook.react.views.slider;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.C1635c;

/* renamed from: com.facebook.react.views.slider.c */
class C1796c implements OnSeekBarChangeListener {
    C1796c() {
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        ((UIManagerModule) ((ReactContext) seekBar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().mo5886a((C1635c) new C1795b(seekBar.getId(), ((C1794a) seekBar).mo6311a(i), z));
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        ((UIManagerModule) ((ReactContext) seekBar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().mo5886a((C1635c) new C1797d(seekBar.getId(), ((C1794a) seekBar).mo6311a(seekBar.getProgress())));
    }
}
