package com.example.myapp;

import com.example.myapp.slice.RadioButtonSlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class RadioButton extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(RadioButtonSlice.class.getName());
    }
}
