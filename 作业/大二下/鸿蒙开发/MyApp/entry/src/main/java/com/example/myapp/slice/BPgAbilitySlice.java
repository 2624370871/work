package com.example.myapp.slice;

import com.example.myapp.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.components.Text;
import ohos.agp.components.TextField;

public class BPgAbilitySlice extends AbilitySlice {
    TextField mTextField;
    Text mText;
    Button mButton;
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_bpg);
        String s=intent.getStringParam("s");

        mText=(Text) findComponentById(ResourceTable.Id_text);
        mTextField=(TextField) findComponentById(ResourceTable.Id_tf1);
        mButton=(Button)findComponentById(ResourceTable.Id_btn);
        mButton.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                Intent intent1=new Intent();
                String result=mTextField.getText().toString();
                intent1.setParam("result",result);
//将输入的结果返回
//                一旦调用该方法，则会调用AbilitySlice里面重写的onAbilityResult
//                setResult：由pageAbility提供
                getAbility().setResult(2001,intent1);
                terminate();

            }
        });
        mText.setText(s);
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
