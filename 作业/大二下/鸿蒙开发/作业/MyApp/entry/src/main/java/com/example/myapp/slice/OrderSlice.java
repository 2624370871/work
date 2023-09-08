package com.example.myapp.slice;

import com.example.myapp.Pay;
import com.example.myapp.ResourceTable;
import com.example.myapp.foodInfo;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.aafwk.content.Operation;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.components.Image;
import ohos.agp.components.Text;

public class OrderSlice extends AbilitySlice {
    Text food1,price,phg;
    Image back,add;
    Button pay;
    private static int i = 0;
    private static int count = 15;
    private String pric,is;
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_order);
        back=(Image) findComponentById(ResourceTable.Id_back);
        food1=(Text) findComponentById(ResourceTable.Id_food1);
        phg=(Text)findComponentById(ResourceTable.Id_phg);
        add=(Image)findComponentById(ResourceTable.Id_add);
        price=(Text)findComponentById(ResourceTable.Id_price);
        pay=(Button)findComponentById(ResourceTable.Id_pay);
        back.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                Intent intent1=new Intent();
                Operation operation =new Intent.OperationBuilder()
                        .withDeviceId("")
                        .withBundleName(getBundleName())
                        .withAction("")
                        .withAbilityName(HomeSlice.class.getName())
                        .build();
                intent1.setOperation(operation);
                startAbility(intent1);
                terminate();
                terminateAbility();
            }
        });
        food1.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                Intent intent1=new Intent();
                Operation operation =new Intent.OperationBuilder()
                        .withDeviceId("")
                        .withBundleName(getBundleName())
                        .withAction("")
                        .withAbilityName(foodInfo.class.getName())
                        .build();
                intent1.setOperation(operation);
                startAbility(intent1);
            }
        });
        add.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                pric = Integer.toString(count);
                price.setText(pric+".0");
                count=count+15;
                ++i;
                is=String.valueOf(i);
            }
        });
        pay.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                Intent intent1=new Intent();
                Operation operation =new Intent.OperationBuilder()
                        .withDeviceId("")
                        .withBundleName(getBundleName())
                        .withAction("")
                        .withAbilityName(Pay.class.getName())
                        .build();
                intent1.setOperation(operation);
                intent1.setParam("i",is);
                intent1.setParam("pric",pric);
                startAbility(intent1);
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
