package com.example.myapp;

import com.example.myapp.slice.PickerMSlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class PickerM extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(PickerMSlice.class.getName());
    }
}
