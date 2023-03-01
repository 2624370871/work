package com.example.myapp;

import android.os.Bundle;
import android.content.Intent;
import android.app.Activity;
public class NewActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        Intent intent=new Intent(this,btnActivity.class);
        startActivity(intent);
    }
}
