package com.example.myapp.slice;

import com.example.myapp.ResourceTable;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.Text;

public class TextAbilitySlice extends AbilitySlice {
    Text mText;
    public void onStart(Intent intent){
        super.onStart(intent);
        super.setUIContent(com.example.myapp.ResourceTable.Layout_layout_text_setauto);

        mText=(Text)findComponentById(ResourceTable.Id_text);
        mText.setAutoFontSizeRule(30,100,1);
        mText.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                mText.setText(mText.getText()+"T");
            }
        });
    }
}
