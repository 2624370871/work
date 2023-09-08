package com.example.myapp.slice;

import com.example.myapp.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.components.Text;
import ohos.agp.components.TextField;
import ohos.agp.components.element.ShapeElement;

public class TextFiledSlice extends AbilitySlice {
    TextField mTextField1,mTextField2;
    Button mButton;
    Text mText1,mText2;
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_layout_textfiled);
        mTextField1=(TextField)findComponentById(ResourceTable.Id_tf1);
        mTextField2=(TextField)findComponentById(ResourceTable.Id_tf2);
        mButton=(Button) findComponentById(ResourceTable.Id_btn);
        mText1=(Text)findComponentById(ResourceTable.Id_text1);
        mText2=(Text)findComponentById(ResourceTable.Id_text2);
        mButton.setClickedListener(new Component.ClickedListener() {
//            功能,输入账号和密码进行错误提示
            @Override
            public void onClick(Component component) {
                 String username=mTextField1.getText().toString();
               String userpwd=mTextField2.getText().toString();
//                显示mText组件
                mText1.setVisibility(Component.VISIBLE);
                mText2.setVisibility(Component.VISIBLE);
//                动态设置背景样式
                ShapeElement shapeElement=new ShapeElement(TextFiledSlice.this,ResourceTable.Graphic_color_red_textfield);
//                将背景样式作为属性值进行设置
                mText1.setBackground(shapeElement);
                mText2.setBackground(shapeElement);
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
