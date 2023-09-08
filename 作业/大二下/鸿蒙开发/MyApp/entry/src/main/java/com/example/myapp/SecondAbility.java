package com.example.myapp;

import com.example.myapp.slice.OneAbilitySlice;
import com.example.myapp.slice.SecondAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;
//这是终点pageAbility(空窗口对象)
//可以对当前的pageAbility设置多个子页面
//在配置页面中进行注册
//在代码进行注册
public class SecondAbility extends Ability {
//    与配置文件中action里面的值对应
    public static String ACTION_ONE="ACTION_ONE";
    public static String ACTION_TWO="ACTION_TWO";
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
//        加载默认子界面(当跳转的withAction为空字符时)
        super.setMainRoute(SecondAbilitySlice.class.getName());
//    将子页面注册到secondAbility
//        参数:参数1-->在配置文件中注册的标记
//        参数2:-->标记对应的子界面
        addActionRoute(ACTION_ONE, OneAbilitySlice.class.getName());
        addActionRoute(ACTION_TWO, OneAbilitySlice.class.getName());
    }
}
