package com.example.myapp.slice;

import com.example.myapp.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.window.dialog.ToastDialog;

public class LoginAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_layout_login);
        //1. 找到组件
        Button button = (Button) findComponentById(ResourceTable.Id_button);
        //2. 绑定单击事件
// 为按钮设置点击事件回调
        button.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                // 此处添加点击按钮后的事件处理逻辑
                new ToastDialog(getContext())
                        .setText("This is a ToastDialog")
                        .show();
            }
        });
    }

}
