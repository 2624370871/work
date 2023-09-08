package com.example.myapp.slice;

import com.example.myapp.Order;
import com.example.myapp.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.aafwk.content.Operation;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.components.Image;
import ohos.agp.window.dialog.ToastDialog;

public class foodInfoSlice extends AbilitySlice {
    Image back;
    Button add;
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_food_info);
        back=(Image) findComponentById(ResourceTable.Id_back);
        add=(Button)findComponentById(ResourceTable.Id_add);
        back.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                Intent intent1=new Intent();
                Operation operation =new Intent.OperationBuilder()
                        .withDeviceId("")
                        .withBundleName(getBundleName())
                        .withAction("")
                        .withAbilityName(OrderSlice.class.getName())
                        .build();
                intent1.setOperation(operation);
                startAbility(intent1);
                terminate();
                terminateAbility();
            }
        });
        add.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                Intent intent1=new Intent();
                Operation operation =new Intent.OperationBuilder()
                        .withDeviceId("")
                        .withBundleName(getBundleName())
                        .withAction("")
                        .withAbilityName(OrderSlice.class.getName())
                        .build();
                intent1.setOperation(operation);
                startAbility(intent1);
                terminate();
                terminateAbility();
                new ToastDialog(getContext())
                        .setText("添加成功！")
                        .show();
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
