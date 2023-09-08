package com.example.myapp;

import com.example.myapp.slice.Pg2AbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class Pg2Ability extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(Pg2AbilitySlice.class.getName());
    }
}
