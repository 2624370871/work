package com.example.myapp;

import com.example.myapp.slice.ToastSlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class Toast extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(ToastSlice.class.getName());
    }
}
