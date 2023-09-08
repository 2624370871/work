package com.example.myapp;

import com.example.myapp.slice.DatePickerSlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class DatePicker extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(DatePickerSlice.class.getName());
    }
}
