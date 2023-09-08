package com.example.myapp.slice;

import com.example.myapp.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Text;
import ohos.agp.components.TimePicker;

public class TimePickerSlice extends AbilitySlice {
    TimePicker mTimePicker;
    Text mText;
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_timepicker);
        mTimePicker=(TimePicker) findComponentById(ResourceTable.Id_timepicker);
        mText=(Text)findComponentById(ResourceTable.Id_text);
        int hour=mTimePicker.getHour();
        int minute=mTimePicker.getMinute();
        int second=mTimePicker.getSecond();
        mTimePicker.setTimeChangedListener(new TimePicker.TimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int i, int i1, int i2) {
                mText.setText(i+":"+i1+":"+i2);
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
