package com.example.myapp;

import com.example.myapp.slice.MainAbilitySlice;
import com.example.myapp.slice.TextAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class TextAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(TextAbilitySlice.class.getName());
    }
}
