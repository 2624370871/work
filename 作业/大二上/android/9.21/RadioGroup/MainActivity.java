package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RadioGroup sex=(RadioGroup) findViewById(R.id.radioGroup);
        sex.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton r=(RadioButton)findViewById(checkedId);
                Log.i("单选按钮","选择为"+r.getText());
            }
        });
        Button button=(Button)findViewById(R.id.Button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i=0;i<sex.getChildCount();i++){
                    RadioButton r=(RadioButton)sex.getChildAt(i);
                    if(r.isChecked()){
                        Log.i("单选按钮","成绩"+r.getText());
                        break;
                    }
                }
            }
        });
    }
}
