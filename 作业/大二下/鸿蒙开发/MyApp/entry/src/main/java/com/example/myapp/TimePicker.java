package com.example.myapp;

import com.example.myapp.slice.TimePickerSlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class TimePicker extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(TimePickerSlice.class.getName());
    }
}
