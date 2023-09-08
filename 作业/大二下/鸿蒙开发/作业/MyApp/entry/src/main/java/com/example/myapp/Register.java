package com.example.myapp;

import com.example.myapp.slice.RegisterSlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class Register extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(RegisterSlice.class.getName());
    }
}
