package com.example.myapp;

import com.example.myapp.slice.PgAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class PgAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(PgAbilitySlice.class.getName());
    }
}
