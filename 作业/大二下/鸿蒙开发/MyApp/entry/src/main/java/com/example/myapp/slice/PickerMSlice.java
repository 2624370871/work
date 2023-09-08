package com.example.myapp.slice;

import com.example.myapp.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Picker;

public class PickerMSlice extends AbilitySlice {
//    省级信息
    String[] pros=new String[]{"湖北省","湖南省","山东省","山西省"};
    String[][] citys=new String[][]{{"武汉市","十堰市","恩施市"},{"长沙市","岳阳市","株洲市","衡阳市"},
            {"济南市","菏泽市","青岛市"},{"太原市","大同市","长治市","阳泉市"}};
    Picker mPicker1,mPicker2;
//    标记第一个picker的选中项下标
    int index=0;
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_layout_pickerm);
        mPicker1=(Picker) findComponentById(ResourceTable.Id_picker1);
        mPicker2=(Picker) findComponentById(ResourceTable.Id_picker2);
//        设置整个数据源的索引值
        mPicker1.setMinValue(0);
        mPicker1.setMaxValue(pros.length-1);
//设置数据第一项为默认选中项
        mPicker1.setValue(0);
//将我们定义的数据源设置到picker
        mPicker1.setFormatter(new Picker.Formatter() {
            @Override
            public String format(int i) {
                return pros[i];
            }
        });
//        设置事件
        mPicker1.setValueChangedListener(new Picker.ValueChangedListener() {
            @Override
            public void onValueChanged(Picker picker, int i, int i1) {
//                i1:当前选中项的下标索引
                index=i1;
//                基于第一个picker选中项的改变去更改第二个picker对应的数据
                updatePicker2();
            }
        });
//            默认给第一个picker选中的第一项取匹配第二个picker的数据
//        设置第二个picker：基于第一个picker的选中下标索引来确定
        updatePicker2();
    }

    private void updatePicker2(){
        mPicker2.setMinValue(0);
        mPicker2.setMaxValue(citys[index].length-1);
        mPicker2.setValue(0);
        mPicker2.setFormatter(new Picker.Formatter() {
            @Override
            public String format(int i) {
//                二维数组的取法：先通过index(0)取里面的子项(第一项)，再通过i(0,1,2)取子项的数据
                return citys[index][i];
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
