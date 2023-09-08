package com.example.myapp.slice;

import com.example.myapp.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Picker;
import ohos.agp.window.dialog.ToastDialog;

public class pickerSlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_layout_picker);
        Picker picker=(Picker) findComponentById(ResourceTable.Id_picker);
        picker.setMinValue(0);
        picker.setMaxValue(6);

//第一种设置picker列表的数据
//        i:列表子数据的下标索引
        picker.setFormatter(i -> {
            String value;
            switch (i){
                case 0:
                    value="Mon";
                    break;
                case 1:
                    value="Tue";
                    break;
                case 2:
                    value="Wed";
                    break;
                case 3:
                    value="Thu";
                    break;
                case 4:
                    value="Fri";
                    break;
                case 5:
                    value="Sat";
                    break;
                case 6:
                    value="Sun";
                    break;
                default:
                    value=""+i;
            }
            return value;
        });

        picker.setValueChangedListener((picker1, oldVal, newVal) ->{
//            oldVal:滚动前的数据子项的下标索引
//            newVal：滚动后的数据子项的下标索引
            new ToastDialog(pickerSlice.this).setText("滚动前的数据:"+oldVal+"\n"+"滚动后的数据:"+newVal).show();
        });
//        picker.setDisplayedData(new String[]{"1","2","3","5","6","7"});
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
