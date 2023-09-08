package com.example.myapp;

import com.example.myapp.slice.TextTruncationSlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class TextTruncationAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(TextTruncationSlice.class.getName());
    }
}
