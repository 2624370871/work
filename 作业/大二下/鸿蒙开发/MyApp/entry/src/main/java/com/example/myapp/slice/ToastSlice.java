package com.example.myapp.slice;

import com.example.myapp.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.utils.Color;
import ohos.agp.utils.LayoutAlignment;
import ohos.agp.window.dialog.PopupDialog;
import ohos.agp.window.dialog.ToastDialog;

public class ToastSlice extends AbilitySlice {
    Button mButton,mButton1;
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_toast);
        mButton=(Button) findComponentById(ResourceTable.Id_btn);
        mButton1=(Button)findComponentById(ResourceTable.Id_btn1);
        mButton.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                new ToastDialog(getContext()).setText("恭喜,登陆成功！")
                        .setAlignment(LayoutAlignment.TOP)
                        .show();
            }
        });
        mButton1.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                PopupDialog popupDialog =new PopupDialog(getContext(),component,420,180);
//                设置popupDialog的内容
                popupDialog.setText("this is PopupDilog");
//                设置对齐方式
                popupDialog.setMode(LayoutAlignment.TOP|LayoutAlignment.LEFT);
//                设置箭头显示
                popupDialog.setHasArrow(true);
//                设置箭头的大小和偏移量
                popupDialog.setArrowSize(100,75);
                popupDialog.setArrowOffset(100);
                popupDialog.setBackColor(new Color(0xffbeedc7));
                popupDialog.show();
            }
        });
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
