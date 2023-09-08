package com.example.myapp.slice;

import com.example.myapp.CheckBox;
import com.example.myapp.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.AbsButton;
import ohos.agp.components.Checkbox;
import ohos.agp.components.Text;

import java.util.HashSet;
import java.util.Set;

public class CheckBoxSlice extends AbilitySlice {
    Text mText;
Checkbox mCheckBox1,mCheckBox2,mCheckBox3,mCheckBox4;
Set<String>set=new HashSet<>();
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_check_box);
        mCheckBox1=(Checkbox) findComponentById(ResourceTable.Id_cb1);
        mCheckBox2=(Checkbox) findComponentById(ResourceTable.Id_cb2);
        mCheckBox3=(Checkbox) findComponentById(ResourceTable.Id_cb3);
        mCheckBox4=(Checkbox) findComponentById(ResourceTable.Id_cb4);
        mText=(Text) findComponentById(ResourceTable.Id_text);
        mCheckBox1.setCheckedStateChangedListener(new AbsButton.CheckedStateChangedListener() {
            @Override
            public void onCheckedChanged(AbsButton absButton, boolean b) {
                if(b){
                    set.add("A");
                }else{
                    set.remove("A");
                }
                mText.setText((set.toString()));
            }
        });
        mCheckBox2.setCheckedStateChangedListener(new AbsButton.CheckedStateChangedListener() {
            @Override
            public void onCheckedChanged(AbsButton absButton, boolean b) {
                if(b){
                    set.add("B");
                }else{
                    set.remove("B");
                }
                mText.setText((set.toString()));
            }
        });
        mCheckBox3.setCheckedStateChangedListener(new AbsButton.CheckedStateChangedListener() {
            @Override
            public void onCheckedChanged(AbsButton absButton, boolean b) {
                if(b){
                    set.add("C");
                }else{
                    set.remove("C");
                }
                mText.setText((set.toString()));
            }
        });

        mCheckBox4.setCheckedStateChangedListener(new AbsButton.CheckedStateChangedListener() {
            @Override
            public void onCheckedChanged(AbsButton absButton, boolean b) {
                if(b){
                    set.add("D");
                }else{
                    set.remove("D");
                }
                mText.setText((set.toString()));
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
