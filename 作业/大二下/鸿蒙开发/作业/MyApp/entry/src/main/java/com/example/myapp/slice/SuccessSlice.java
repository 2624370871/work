package com.example.myapp.slice;

import com.example.myapp.Home;
import com.example.myapp.Order;
import com.example.myapp.ResourceTable;
import com.example.myapp.Success;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.aafwk.content.Operation;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.components.Text;
import ohos.multimodalinput.event.KeyEvent;

public class SuccessSlice extends AbilitySlice {
    Button confirm;
    Text i,count,allprice;
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_success);
        confirm=(Button)findComponentById(ResourceTable.Id_confirm);
        i=(Text) findComponentById(ResourceTable.Id_i);
        count=(Text) findComponentById(ResourceTable.Id_count);
        allprice=(Text)findComponentById(ResourceTable.Id_allprice);
        confirm.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                Intent intent1=new Intent();
                Operation operation =new Intent.OperationBuilder()
                        .withDeviceId("")
                        .withBundleName(getBundleName())
                        .withAction("")
                        .withAbilityName(Home.class.getName())
                        .build();
                intent1.setOperation(operation);
                startAbility(intent1);
                i.setText("");
                count.setText("");
                allprice.setText("");
                terminate();
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
