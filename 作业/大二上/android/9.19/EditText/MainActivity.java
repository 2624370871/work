package com.example.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

//    @Override
//////    protected void onCreate(Bundle savedInstanceState) {
//////        super.onCreate(savedInstanceState);
//////        setContentView(R.layout.activity_table);
//////       setContentView(R.layout.activity_linear);
//////        setContentView(R.layout.activity_table);
//////        setContentView(R.layout.activity_grid);
////    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText nicknameET=(EditText)findViewById(R.id.nickname);
                String nickname=nicknameET.getText().toString();
                EditText phonenumberET=(EditText)findViewById(R.id.phonenumer);
                String phonenumber=phonenumberET.getText().toString();
                EditText emailaddressET=(EditText)findViewById(R.id.emailaddress);
                String emailaddress=emailaddressET.getText().toString();
                Log.i("EditText组件实例","昵称:"+nickname);
                Log.i("EditText组件实例","手机号:"+phonenumber);
                Log.i("EditText组件实例","邮箱:"+emailaddress);
            }
        });
    }

}
