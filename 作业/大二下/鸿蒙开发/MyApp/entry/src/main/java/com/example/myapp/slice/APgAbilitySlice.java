package com.example.myapp.slice;

import com.example.myapp.BPgAbility;
import com.example.myapp.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.aafwk.content.Operation;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.components.TextField;

public class APgAbilitySlice extends AbilitySlice {
    TextField mTextField1,mTextField2,mTextField3;
    Button mButton1;
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_apg);
        mTextField1=(TextField) findComponentById(ResourceTable.Id_tf1);
        mTextField2=(TextField) findComponentById(ResourceTable.Id_tf2);
        mTextField3=(TextField) findComponentById(ResourceTable.Id_tf3);
        mButton1=(Button) findComponentById(ResourceTable.Id_btn);
        mButton1.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                Intent intent1=new Intent();
                Operation operation=new Intent.OperationBuilder()
                        .withDeviceId("")
                        .withBundleName(getBundleName())
                        .withAction("")
                        .withAbilityName(BPgAbility.class.getName())
                        .build();
                intent1.setOperation(operation);
                String s1=mTextField1.getText().toString();
                String s2=mTextField2.getText().toString();
                String s=s1+"+"+s2+"=?";
                intent1.setParam("s",s);
                startAbilityForResult(intent1,1001);
            }
        });
    }

    @Override
    protected void onAbilityResult(int requestCode, int resultCode, Intent resultData) {
        super.onAbilityResult(requestCode, resultCode, resultData);
        String s=resultData.getStringParam("result");
        mTextField3.setText(s);
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
