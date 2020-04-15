package com.facebook.react.devsupport;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import p032c.p033a.p098m.C1227n;
import p032c.p033a.p098m.C1229p;

public class DevSettingsActivity extends PreferenceActivity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(getApplication().getResources().getString(C1227n.catalyst_settings_title));
        addPreferencesFromResource(C1229p.rn_dev_preferences);
    }
}
