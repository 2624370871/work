package com.example.myapp.slice;

import com.example.myapp.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.DatePicker;
import ohos.agp.components.Text;

public class DatePickerSlice extends AbilitySlice {
    DatePicker mDatePicker;
    Text mText;
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_datepicker);

//        获取datepicker实例
        mDatePicker=(DatePicker) findComponentById(ResourceTable.Id_datepicker);
        int year=mDatePicker.getYear();
        int month=mDatePicker.getMonth();
        int day=mDatePicker.getDayOfMonth();

        mText=(Text)  findComponentById(ResourceTable.Id_text);
        mDatePicker.updateDate(year,month,day);
        mDatePicker.setValueChangedListener(new DatePicker.ValueChangedListener() {
            @Override
            public void onValueChanged(DatePicker datePicker, int i, int i1, int i2) {
                mText.setText(i+"年"+i1+"月"+i2+"日");
//                mText.setText(String.format("%2d%2d%4d",i,i1,i2));
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
