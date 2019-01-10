package com.example.android.movies.view;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;
import com.example.android.movies.R;

public class SettingsFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.settings_preferences);

    }
}
