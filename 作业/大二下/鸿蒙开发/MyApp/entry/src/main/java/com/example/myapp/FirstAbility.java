package com.example.myapp;

import com.example.myapp.slice.FirstAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;
//这是起点pageAbility(空窗口对象，加载子界面，本身没有功能实现)
public class FirstAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(FirstAbilitySlice.class.getName());
    }
}
