package com.example.myapp.slice;

import com.example.myapp.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;

public class TwoAbilitySlice extends AbilitySlice {
@Override
    protected void onStart(Intent intent){
    super.onStart(intent);
    super.setUIContent(ResourceTable.Layout_ability_two);
}
}
