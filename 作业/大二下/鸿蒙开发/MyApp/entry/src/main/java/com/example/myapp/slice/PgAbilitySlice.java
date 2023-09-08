package com.example.myapp.slice;

import com.example.myapp.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.Component;

public class PgAbilitySlice extends AbilitySlice {
    Button mButton;
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_pg);
        mButton=(Button) findComponentById(ResourceTable.Id_btn);
        mButton.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
//                在同一个PageAbility实现不同AbilitySlice的跳转
                    present(new Pg1AbilitySlice(),new Intent());
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
