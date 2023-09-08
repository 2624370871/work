package com.example.myapp;

import com.example.myapp.slice.MySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class My extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(MySlice.class.getName());
    }
}
