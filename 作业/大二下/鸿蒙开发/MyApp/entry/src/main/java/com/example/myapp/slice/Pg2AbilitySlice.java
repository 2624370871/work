package com.example.myapp.slice;

import com.example.myapp.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.components.TextField;

public class Pg2AbilitySlice extends AbilitySlice {
    TextField mTextField1,mTextField2,mTextField3;
Button mButton;
@Override
    protected void onStart(Intent intent){
    super.onStart(intent);
    super.setUIContent(ResourceTable.Layout_ability_pg2);
    mTextField1=(TextField) findComponentById(ResourceTable.Id_tf1);
    mTextField2=(TextField) findComponentById(ResourceTable.Id_tf2);
    mTextField3=(TextField) findComponentById(ResourceTable.Id_tf3);
    mButton=(Button) findComponentById(ResourceTable.Id_btn);
    mButton.setClickedListener(new Component.ClickedListener() {
        @Override
        public void onClick(Component component) {
            String s1=mTextField1.getText().toString();
            String s2=mTextField2.getText().toString();
            String s=s1+"+"+s2+"=?";

            Intent intent1=new Intent();
//            携带参数
            intent1.setParam("s",s);
//            requestCode:请求码
            presentForResult(new Pg3AbilitySlice(),intent1,1);
        }
    });
}
//回调方法，用于接受AbilitySlice的参数回传
//    一旦在AbilitySlice中调用了setResult，则会立即调用当前页面
    @Override
    protected void onResult(int requestCode, Intent resultIntent) {
        super.onResult(requestCode, resultIntent);
//        resultIntent:等同于回传界面的intent1
        String result=resultIntent.getStringParam("result");
        mTextField3.setText(result);
    }
}
