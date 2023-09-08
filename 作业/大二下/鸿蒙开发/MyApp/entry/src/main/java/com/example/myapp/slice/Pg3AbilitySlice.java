package com.example.myapp.slice;

import com.example.myapp.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.components.Text;
import ohos.agp.components.TextField;

public class Pg3AbilitySlice extends AbilitySlice {
    TextField mTextField;
    Text mText;
    Button mButton;
    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_pg3);
        mText=(Text) findComponentById(ResourceTable.Id_text);
        if(null!=intent){
            String s=intent.getStringParam("s");
//            显示上一个AbilitySlice传递过来的数据
            mText.setText(s);
        }
        mTextField=(TextField) findComponentById(ResourceTable.Id_tf1);
        mButton=(Button)findComponentById(ResourceTable.Id_btn);
        mButton.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
//                回传，不是跳转
//                回传数据
                Intent intent1=new Intent();
                String result=mTextField.getText().toString();
                        intent1.setParam("result",result);
                setResult(intent1);
//                销毁当前界面
                terminate();
            }
        });
    }
}