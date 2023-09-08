package com.example.myapp;

import com.example.myapp.slice.TextFiledSlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class TextFiled extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(TextFiledSlice.class.getName());
    }
}
