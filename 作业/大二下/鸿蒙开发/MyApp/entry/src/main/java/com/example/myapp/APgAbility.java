package com.example.myapp;

import com.example.myapp.slice.APgAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class APgAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(APgAbilitySlice.class.getName());
    }
}
