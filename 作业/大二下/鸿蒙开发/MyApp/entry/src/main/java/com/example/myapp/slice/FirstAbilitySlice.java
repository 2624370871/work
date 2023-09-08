package com.example.myapp.slice;

import com.example.myapp.ResourceTable;
import com.example.myapp.SecondAbility;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.aafwk.content.Operation;
import ohos.agp.components.Button;
import ohos.agp.components.Component;

//这是子界面AbilitySilce，在里面实现功能和逻辑
public class FirstAbilitySlice extends AbilitySlice {
    Button mButton,mButton1,mButton2;
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_first);
        mButton=(Button)findComponentById(ResourceTable.Id_btn);
        mButton1=(Button)findComponentById(ResourceTable.Id_btn1);
        mButton2=(Button)findComponentById(ResourceTable.Id_btn2);
mButton.setClickedListener(new Component.ClickedListener() {
    @Override
    public void onClick(Component component) {
        //                实现从起点页面跳转到终点页面
        Intent intent1=new Intent();
//                withDeviceId:设置当前设备的ID，默认传空字符(手机)
//                withBundleName:获取当前文件所在的包名
//                withAction:设置要跳转窗口的子界面,默认传入空字符对应setMainRoute所加载的AbilitySLice子界面
//                withAbilityName:设置跳转的结束页(目标页)
//                build:构建完整的operation对象
        Operation operation =new Intent.OperationBuilder()
                .withDeviceId("")
                .withBundleName(getBundleName())
                .withAction("")
                .withAbilityName(SecondAbility.class.getName())
                .build();
        intent1.setOperation(operation);
//                启动跳转
        startAbility(intent1);
    }
});

        mButton1.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                //                实现从起点页面跳转到终点页面
                Intent intent1=new Intent();
//                withDeviceId:设置当前设备的ID，默认传空字符(手机)
//                withBundleName:获取当前文件所在的包名
//                withAction:设置要跳转窗口的子界面,默认传入空字符对应setMainRoute所加载的AbilitySLice子界面
//                withAbilityName:设置跳转的结束页(目标页)
//                build:构建完整的operation对象
                Operation operation =new Intent.OperationBuilder()
                        .withDeviceId("")
                        .withBundleName(getBundleName())
                        .withAction("ACTION_ONE")
                        .withAbilityName(SecondAbility.class.getName())
                        .build();
                intent1.setOperation(operation);
//                启动跳转
                startAbility(intent1);
            }
        });

        mButton2.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                //                实现从起点页面跳转到终点页面
                Intent intent1=new Intent();
//                withDeviceId:设置当前设备的ID，默认传空字符(手机)
//                withBundleName:获取当前文件所在的包名
//                withAction:设置要跳转窗口的子界面,默认传入空字符对应setMainRoute所加载的AbilitySLice子界面
//                withAbilityName:设置跳转的结束页(目标页)
//                build:构建完整的operation对象
                Operation operation =new Intent.OperationBuilder()
                        .withDeviceId("")
                        .withBundleName(getBundleName())
                        .withAction("ACTION_TWO")
                        .withAbilityName(SecondAbility.class.getName())
                        .build();
                intent1.setOperation(operation);
//                启动跳转
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
