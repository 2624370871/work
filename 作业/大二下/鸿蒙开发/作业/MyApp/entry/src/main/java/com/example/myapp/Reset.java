package com.example.myapp;

import com.example.myapp.slice.ResetSlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class Reset extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(ResetSlice.class.getName());
    }
}
