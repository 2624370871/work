package com.example.myapp.slice;

import com.example.myapp.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Text;
import ohos.agp.window.dialog.ToastDialog;

public class MySlice extends AbilitySlice {
    Text User;
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_my);
        User=(Text) findComponentById(ResourceTable.Id_user);
        String user = intent.getStringParam("user");
        new ToastDialog(getContext())
                .setText(user)
                .show();
        User.setText(user);
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
