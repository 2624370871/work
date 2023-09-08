package com.example.myapp.slice;

import com.example.myapp.Order;
import com.example.myapp.ResourceTable;
import com.example.myapp.Success;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.aafwk.content.Operation;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.components.Image;
import ohos.agp.components.Text;
import ohos.agp.window.dialog.ToastDialog;

public class PaySlice extends AbilitySlice {
   Text i,count,allprice;
    Button success,go;
    Image back;
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_pay);
        i=(Text) findComponentById(ResourceTable.Id_i);
        count=(Text) findComponentById(ResourceTable.Id_count);
        allprice=(Text)findComponentById(ResourceTable.Id_allprice);
        success=(Button)findComponentById(ResourceTable.Id_success);
        go=(Button)findComponentById(ResourceTable.Id_go);
        back=(Image) findComponentById(ResourceTable.Id_back);
       String is = intent.getStringParam("i");
        String pric = intent.getStringParam("pric");
       i.setText(is);
       count.setText(pric);
       allprice.setText(pric);
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
       success.setClickedListener(new Component.ClickedListener() {
           @Override
           public void onClick(Component component) {
               Intent intent1=new Intent();
               Operation operation =new Intent.OperationBuilder()
                       .withDeviceId("")
                       .withBundleName(getBundleName())
                       .withAction("")
                       .withAbilityName(Success.class.getName())
                       .build();
               intent1.setOperation(operation);
               startAbility(intent1);
               terminate();
               terminateAbility();
           }
       });
        go.setClickedListener(new Component.ClickedListener() {
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
