package com.example.myapp.slice;

import com.example.myapp.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.DirectionalLayout;
import ohos.agp.components.Image;

public class ImageSlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        //        常规加载当前子界面的方式(xml)
//        super.setColorMode(ResourceTable.Layout_ability_image);
        //        通过java代码动态创建布局及布局对于的子组件
//        指向了当前类对象
        DirectionalLayout directionalLayout = new DirectionalLayout(getContext());
        Image image = new Image(getContext());
//        动态设置Image组件的图片资源
        image.setPixelMap(ResourceTable.Media_x);
        directionalLayout.addComponent(image);
        super.setUIContent(directionalLayout);
    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}
