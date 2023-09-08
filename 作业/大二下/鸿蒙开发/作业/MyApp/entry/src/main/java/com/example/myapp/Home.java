package com.example.myapp;

import com.example.myapp.slice.HomeSlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class Home extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(HomeSlice.class.getName());
    }
}
