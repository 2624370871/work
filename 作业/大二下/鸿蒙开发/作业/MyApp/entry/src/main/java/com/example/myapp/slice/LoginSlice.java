package com.example.myapp.slice;

import com.example.myapp.*;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.aafwk.content.Operation;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.components.Text;
import ohos.agp.components.TextField;
import ohos.agp.components.element.ShapeElement;
import ohos.agp.window.dialog.ToastDialog;

import java.util.Objects;

public class LoginSlice extends AbilitySlice {
    Button login,register,reset;
    TextField phone,pwd;
    Text user;
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_login);
        login=(Button) findComponentById(ResourceTable.Id_login);
        register=(Button) findComponentById(ResourceTable.Id_register);
        reset=(Button) findComponentById(ResourceTable.Id_reset);
        phone=(TextField)findComponentById(ResourceTable.Id_phone);
        pwd=(TextField)findComponentById(ResourceTable.Id_pwd);
        user=(Text)findComponentById(ResourceTable.Id_user);
//        登录
        login.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                if(phone.getText().length()==0||pwd.getText().length()==0){
                    new ToastDialog(getContext())
                            .setText("请输入账号或密码！")
                            .show();
                    ShapeElement shapeElement=new ShapeElement(LoginSlice.this,ResourceTable.Graphic_background_error);
//                将背景样式作为属性值进行设置
                    phone.setBackground(shapeElement);
                    pwd.setBackground(shapeElement);
                }else{
                    new ToastDialog(getContext())
                            .setText("登录成功！")
                            .show();
//                    进入首页
                    Intent intent=new Intent();
                    Operation operation =new Intent.OperationBuilder()
                            .withDeviceId("")
                            .withBundleName(getBundleName())
                            .withAction("")
                            .withAbilityName(Home.class.getName())
                            .build();
                    //                    设置我的页面的用户名
                    String user=phone.getText();
                    intent.setParam("user",user);
                    intent.setOperation(operation);
                    startAbility(intent);
                    //这是销毁当前的slice
                    terminate();
//然后销毁当前的Ability
                    terminateAbility();
                }
            }
        });

//        忘记密码
        reset.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                Intent intent1=new Intent();
                Operation operation =new Intent.OperationBuilder()
                        .withDeviceId("")
                        .withBundleName(getBundleName())
                        .withAction("")
                        .withAbilityName(Reset.class.getName())
                        .build();
                intent1.setOperation(operation);
                startAbility(intent1);
            }
        });
//        注册
        register.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                Intent intent1=new Intent();
                Operation operation =new Intent.OperationBuilder()
                        .withDeviceId("")
                        .withBundleName(getBundleName())
                        .withAction("")
                        .withAbilityName(Register.class.getName())
                        .build();
                intent1.setOperation(operation);
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
