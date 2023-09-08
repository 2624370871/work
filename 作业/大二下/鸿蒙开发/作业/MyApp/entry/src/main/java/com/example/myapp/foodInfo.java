package com.example.myapp;

import com.example.myapp.slice.foodInfoSlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class foodInfo extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(foodInfoSlice.class.getName());
    }
}
