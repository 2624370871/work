package com.example.myapp;

import com.example.myapp.slice.pickerSlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class picker extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(pickerSlice.class.getName());
    }
}
