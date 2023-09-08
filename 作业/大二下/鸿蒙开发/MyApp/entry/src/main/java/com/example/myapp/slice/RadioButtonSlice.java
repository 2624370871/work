package com.example.myapp.slice;

import com.example.myapp.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.RadioButton;
import ohos.agp.components.RadioContainer;
import ohos.agp.components.Text;

public class RadioButtonSlice extends AbilitySlice {
    RadioContainer mRadioContainer;
    Text mText;
    RadioButton mRadioButton1;
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_radio_button);
        mRadioContainer=(RadioContainer) findComponentById(ResourceTable.Id_rc);
        mText=(Text) findComponentById(ResourceTable.Id_text);
        mRadioButton1=(RadioButton)findComponentById(ResourceTable.Id_rb1);
        mRadioContainer.setMarkChangedListener(new RadioContainer.CheckedStateChangedListener() {
            @Override
            public void onCheckedChanged(RadioContainer radioContainer, int i) {
                if(i==0){
                    mText.setText("恭喜你，选择答案正确！正确答案是："+mRadioButton1.getText().toString());
                }else {
                    mText.setText("很遗憾！答案选择错误！!");
                }
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
