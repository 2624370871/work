package com.example.myapp.slice;

import com.example.myapp.Order;
import com.example.myapp.ResourceTable;
import com.example.myapp.Scan;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.ability.OnClickListener;
import ohos.aafwk.content.Intent;
import ohos.aafwk.content.Operation;
import ohos.agp.components.*;
import ohos.agp.window.dialog.ToastDialog;

public class HomeSlice extends AbilitySlice{
    TabList mTabList;
    Button scan,order;
    Text user;
    TabList.Tab tab1,tab2;
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_home);
        mTabList=(TabList) findComponentById(ResourceTable.Id_tabList);
        scan = (Button) findComponentById(ResourceTable.Id_scan);
        order = (Button) findComponentById(ResourceTable.Id_order);
        user=(Text)findComponentById(ResourceTable.Id_user);
        String users = intent.getStringParam("user");
        user.setText(users);
        tab1=initTab("首页");
        tab2=initTab("我的");
//将三个tab添加到TabList
        mTabList.addTab(tab1);
        mTabList.addTab(tab2);
        mTabList.setFixedMode(true);
        //默认第一个被选中
        mTabList.getTabAt(0).select();
        mTabList.addTabSelectedListener(new TabList.TabSelectedListener() {
            //            切换tab时触发
            @Override
            public void onSelected(TabList.Tab tab) {
                if(tab.getText().equals("首页")){
                    new ToastDialog(getContext())
                            .setText("首页")
                            .show();
                }else if (tab.getText().equals("我的")){
                    new ToastDialog(getContext())
                            .setText("我的")
                            .show();
                }
            }
            //            原本选中的tab变为未选择tab时触发
            @Override
            public void onUnselected(TabList.Tab tab) {

            }
            //连续点击选中的tab
            @Override
            public void onReselected(TabList.Tab tab) {

            }
        });
        scan.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                Intent intent=new Intent();
                Operation operation =new Intent.OperationBuilder()
                        .withDeviceId("")
                        .withBundleName(getBundleName())
                        .withAction("")
                        .withAbilityName(Scan.class.getName())
                        .build();
                intent.setOperation(operation);
                startAbility(intent);
            }
        });
        order.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                Intent intent=new Intent();
                Operation operation =new Intent.OperationBuilder()
                        .withDeviceId("")
                        .withBundleName(getBundleName())
                        .withAction("")
                        .withAbilityName(Order.class.getName())
                        .build();
                intent.setOperation(operation);
                startAbility(intent);
            }
        });
}
    //    给tablist添加子tab
    private TabList.Tab initTab(String msg){
        TabList.Tab tab=mTabList.new Tab(this);
        tab.setText(msg);
        return tab;
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
