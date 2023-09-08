package com.example.myapp;

import com.example.myapp.slice.ImageSlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class Image extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(ImageSlice.class.getName());
    }
}
