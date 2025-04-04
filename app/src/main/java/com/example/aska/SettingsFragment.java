package com.example.aska;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;

public class SettingsFragment extends Fragment {

    public SettingsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_settings, container, false);

        @SuppressLint("UseSwitchCompatOrMaterialCode") Switch switchDarkMode = view.findViewById(R.id.switch_dark_mode);


        switchDarkMode.setOnCheckedChangeListener((buttonView, isChecked) -> {

        });

        return view;
    }
}
