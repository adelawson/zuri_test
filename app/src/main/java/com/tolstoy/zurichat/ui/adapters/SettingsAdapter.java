package com.tolstoy.zurichat.ui.adapters;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.tolstoy.zurichat.R;
import com.tolstoy.zurichat.ui.activities.ChatPreference;

public class SettingsAdapter extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_settings);

        if (findViewById(R.id.frame) != null) {
            if (savedInstanceState != null) {
                return;
            }
            getFragmentManager().beginTransaction().add(R.id.frame, new ChatPreference()).commit();
        }

    }
}
