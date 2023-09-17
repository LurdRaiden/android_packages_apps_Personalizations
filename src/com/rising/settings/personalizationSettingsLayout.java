/*
 * Copyright (C) 2022 Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

 package com.rising.settings;

 import android.os.Bundle;
 import android.content.Context;
 import com.android.settings.R;
 import android.view.View;
 import com.android.settings.SettingsPreferenceFragment;
 import com.android.internal.logging.nano.MetricsProto;
 import com.google.android.material.appbar.CollapsingToolbarLayout;

 public class personalizationSettingsLayout extends SettingsPreferenceFragment {
 
    protected CollapsingToolbarLayout mCollapsingToolbarLayout;

     @Override
     public void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         hideToolbar();
         addPreferencesFromResource(R.xml.rising_dashboard);
     }
 
     public void onResume() {
        super.onResume();
        hideToolbar();
    }

     @Override
     public int getMetricsCategory() {
         return MetricsProto.MetricsEvent.CUSTOM_SETTINGS;
     }

    private void hideToolbar() {
        if (mCollapsingToolbarLayout == null) {
            mCollapsingToolbarLayout = getActivity().findViewById(R.id.collapsing_toolbar);
        }
        if (mCollapsingToolbarLayout != null) {
            mCollapsingToolbarLayout.setVisibility(View.GONE);
        }
    }
 } 
