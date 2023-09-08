package com.example.myapp;

import com.example.myapp.slice.ScanSlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class Scan extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(ScanSlice.class.getName());
    }
}
