package com.example.myapp.slice;

import com.example.myapp.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.TabList;
import ohos.agp.components.Text;

public class TabListSlice extends AbilitySlice {
    TabList mTabList;
    Text mText;
    TabList.Tab tab1,tab2,tab3;
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_tablist);
        mTabList=(TabList) findComponentById(ResourceTable.Id_tabList);
        mText=(Text)findComponentById(ResourceTable.Id_text);
//tab:动态创建并添加到TabList的过程
        tab1=initTab("A");
        tab2=initTab("B");
        tab3=initTab("C");
//将三个tab添加到TabList
        mTabList.addTab(tab1);
        mTabList.addTab(tab2);
        mTabList.addTab(tab3);
        mTabList.setFixedMode(true);

        mTabList.getTabAt(0).select();
        mText.setText("select is "+tab1.getText());
        mTabList.addTabSelectedListener(new TabList.TabSelectedListener() {
//            切换tab时触发
            @Override
            public void onSelected(TabList.Tab tab) {
                mText.setText("select is "+tab.getText());
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
