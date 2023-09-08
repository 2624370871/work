package com.example.myapp.slice;

import com.example.myapp.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.components.Text;
import ohos.agp.window.dialog.ToastDialog;

public class ScenarioexampleSlice extends AbilitySlice implements Component.ClickedListener{
    Text mText;
    Button mButton1,mButton2,mButton3,mButton4,mButton5,
            mButton6,mButton7,mButton8,mButton9,mButton10,
            mButton11,mButton12,mButton13,mButton14;
    String s="";
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_layout_button_scenarioexample);
        mText=(Text) findComponentById(ResourceTable.Id_text);
        mButton1=(Button) findComponentById(ResourceTable.Id_btn1);
        mButton2=(Button) findComponentById(ResourceTable.Id_btn2);
        mButton3=(Button) findComponentById(ResourceTable.Id_btn3);
        mButton4=(Button) findComponentById(ResourceTable.Id_btn4);
        mButton5=(Button) findComponentById(ResourceTable.Id_btn5);
        mButton6=(Button) findComponentById(ResourceTable.Id_btn6);
        mButton7=(Button) findComponentById(ResourceTable.Id_btn7);
        mButton8=(Button) findComponentById(ResourceTable.Id_btn8);
        mButton9=(Button) findComponentById(ResourceTable.Id_btn9);
        mButton10=(Button) findComponentById(ResourceTable.Id_btn10);
        mButton11=(Button) findComponentById(ResourceTable.Id_btn11);
        mButton12=(Button) findComponentById(ResourceTable.Id_btn12);
        mButton13=(Button) findComponentById(ResourceTable.Id_btn13);
        mButton14=(Button) findComponentById(ResourceTable.Id_btn14);

//        点击事件的第一种实现方式
        //mButton1.setClickedListener(new Component.ClickedListener() {
//    @Override
//    public void onClick(Component component) {
//
//    }
//});

//        this:指向当前调用他的类对象
        mButton1.setClickedListener(this);
        mButton2.setClickedListener(this);
        mButton3.setClickedListener(this);
        mButton4.setClickedListener(this);
        mButton5.setClickedListener(this);
        mButton6.setClickedListener(this);
        mButton7.setClickedListener(this);
        mButton8.setClickedListener(this);
        mButton9.setClickedListener(this);
        mButton10.setClickedListener(this);
        mButton11.setClickedListener(this);
        mButton12.setClickedListener(this);
        mButton13.setClickedListener(this);
        mButton14.setClickedListener(this);



    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }

    @Override
    public void onClick(Component component) {
//        判断当前触发的点击按钮式哪一个，component指向的就是当前的点击按钮对象
        switch (component.getId()){
            case ResourceTable.Id_btn1:
                s+=mButton1.getText();
                mText.setText(s);
                break;
            case ResourceTable.Id_btn2:
                s+=mButton2.getText();
                mText.setText(s);
                break;
            case ResourceTable.Id_btn3:
                s+=mButton3.getText();
                mText.setText(s);
                break;
            case ResourceTable.Id_btn4:
                s+=mButton4.getText();
                mText.setText(s);
                break;
            case ResourceTable.Id_btn5:
                s+=mButton5.getText();
                mText.setText(s);
                break;
            case ResourceTable.Id_btn6:
                s+=mButton6.getText();
                mText.setText(s);
                break;
            case ResourceTable.Id_btn7:
                s+=mButton7.getText();
                mText.setText(s);
                break;
            case ResourceTable.Id_btn8:
                s+=mButton8.getText();
                mText.setText(s);
                break;
            case ResourceTable.Id_btn9:
                s+=mButton9.getText();
                mText.setText(s);
                break;
            case ResourceTable.Id_btn10:
                s+=mButton10.getText();
                mText.setText(s);
                break;
            case ResourceTable.Id_btn11:
                s+=mButton11.getText();
                mText.setText(s);
                break;
            case ResourceTable.Id_btn12:
                s+=mButton12.getText();
                mText.setText(s);
                break;
            case ResourceTable.Id_btn13:
               new ToastDialog(ScenarioexampleSlice.this).setText(mText.getText()).show();
                break;
            case ResourceTable.Id_btn14:
                mText.getText();
                mText.setText("");
                break;
        }
    }
}
