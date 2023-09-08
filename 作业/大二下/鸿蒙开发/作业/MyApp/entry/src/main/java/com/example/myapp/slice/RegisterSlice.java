package com.example.myapp.slice;

import com.example.myapp.Login;
import com.example.myapp.Register;
import com.example.myapp.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.aafwk.content.Operation;
import ohos.agp.components.Button;
import ohos.agp.components.Component;

public class RegisterSlice extends AbilitySlice {
    Button rlogin;
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_register);
        rlogin=(Button) findComponentById(ResourceTable.Id_rlogin);
        rlogin.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                Intent intent1=new Intent();
                Operation operation =new Intent.OperationBuilder()
                        .withDeviceId("")
                        .withBundleName(getBundleName())
                        .withAction("")
                        .withAbilityName(LoginSlice.class.getName())
                        .build();
                intent1.setOperation(operation);
                startAbility(intent1);
                //这是销毁当前的slice
                terminate();
//然后销毁当前的Ability
                terminateAbility();
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
