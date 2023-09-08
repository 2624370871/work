package com.example.myapp;

import com.example.myapp.slice.BPgAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class BPgAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(BPgAbilitySlice.class.getName());
    }
}
