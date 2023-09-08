package com.example.myapp.slice;

import com.example.myapp.ResourceTable;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Text;

public class Pg1AbilitySlice extends PgAbilitySlice{
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_pg1);

    }
}
